package com.sadr.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.sadr.domain.Companys;
import com.sadr.domain.CompanysDo;
import com.sadr.domain.MenuDo;
import com.sadr.domain.Users;
import com.sadr.service.CompanyService;
import com.sadr.service.UserService;
import com.sadr.util.Md5Encode;
import com.sadr.util.Message;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;
	@Autowired
	private CompanyService companyService;

	/**
	 * 登录
	 * @return
	 */
	@RequestMapping(value = "/login",method = RequestMethod.POST,produces="application/json;charset=UTF-8")
	public @ResponseBody String login(@RequestBody Users userDo,HttpServletRequest request,HttpServletResponse resp){
		Gson gson = new GsonBuilder().serializeNulls().create();
		String json="";
		Message message = new Message();
		message.setCode(Message.SUCCESS_CODE);
		message.setMessage(Message.FAIL_MESSAGE);
		
		Subject subject = SecurityUtils.getSubject();
		UsernamePasswordToken token = new UsernamePasswordToken(userDo.getAccount(),Md5Encode.md5Encode(userDo.getPassword()));
		
		try {
			subject.login(token);
			
			Users user = (Users)subject.getPrincipal();
			HttpSession session = request.getSession();
			session.setAttribute("username", user.getAccount());
					
			message.setCode(Message.SUCCESS_CODE);
			message.setMessage(Message.SUCCESS_MESSAGE);
			user.setPassword("");
			message.setData(user);
		} catch (AuthenticationException e) {
			System.out.println("账号或密码错误");
		}
		
		json=gson.toJson(message);
		return json;
	}
	
	/**
	 * 获取公司信息
	 * @return
	 */
	@RequestMapping(value = "/getCompany",method = RequestMethod.POST,produces="application/json;charset=UTF-8")
	public @ResponseBody String getCompany(@RequestBody(required = false) CompanysDo companysDo,HttpServletRequest request,HttpServletResponse resp){
		Gson gson = new GsonBuilder().serializeNulls().create();
		String json="";
		Message message = new Message();
		message.setCode(Message.SUCCESS_CODE);
		message.setMessage(Message.FAIL_MESSAGE);
		
		List<Companys> companys = companyService.getCompany();
		
		if(companys != null){
			message.setCode(Message.SUCCESS_CODE);
			message.setMessage(Message.SUCCESS_MESSAGE);
			message.setData(companys);
		}
		
		json=gson.toJson(message);
		return json;
	}
	
	/**
	 * 
	 * @param name
	 * @param request
	 * @param resp
	 * @return
	 */
	@RequestMapping(value = "/checkUser",method = RequestMethod.POST,produces="application/json;charset=UTF-8")
	public @ResponseBody String checkUser(@RequestBody Users usersDo,HttpServletRequest request,HttpServletResponse resp){
		Gson gson = new GsonBuilder().serializeNulls().create();
		String json="";
		Message message = new Message();
		message.setCode(Message.SUCCESS_CODE);
		message.setMessage(Message.FAIL_MESSAGE);
		
		Users user = userService.getUserByAccount(usersDo.getAccount());
		
		if(user == null){
			message.setCode(Message.SUCCESS_CODE);
			message.setMessage(Message.SUCCESS_MESSAGE);
		}
		
		json=gson.toJson(message);
		return json;
	} 
	
	/**
	 * 注册
	 * @return
	 */
	@RequestMapping(value = "/register",method = RequestMethod.POST,produces="application/json;charset=UTF-8")
	public @ResponseBody String register(@RequestBody Users user,HttpServletRequest request,HttpServletResponse resp){
		Gson gson = new GsonBuilder().serializeNulls().create();
		String json="";
		Message message = new Message();
		message.setCode(Message.SUCCESS_CODE);
		message.setMessage(Message.FAIL_MESSAGE);
		
		user.setPassword(Md5Encode.md5Encode(user.getPassword()));
		int i = userService.register(user);
		
		if(i == 1){
			message.setCode(Message.SUCCESS_CODE);
			message.setMessage(Message.SUCCESS_MESSAGE);
		}
		
		json=gson.toJson(message);
		return json;
	}
	
	/**
	 * 登出
	 * @param request
	 * @param resp
	 * @return
	 */
	@RequestMapping(value = "/logout",method = RequestMethod.POST,produces="application/json;charset=UTF-8")
	public @ResponseBody String logout(HttpServletRequest request,HttpServletResponse resp){
		Gson gson = new GsonBuilder().serializeNulls().create();
		String json="";
		Message message = new Message();
		message.setCode(Message.SUCCESS_CODE);
		message.setMessage(Message.SUCCESS_MESSAGE);
		
		Subject subject = SecurityUtils.getSubject();
		subject.logout();
		
		json=gson.toJson(message);
		return json;
	}
	
	/**
	 * 列出所有未审核的用户
	 * @param request
	 * @param resp
	 * @return
	 */
	@RequestMapping(value = "/listreview",method = RequestMethod.POST,produces="application/json;charset=UTF-8")
	public @ResponseBody String listreview(HttpServletRequest request,HttpServletResponse resp,Users users){
		Gson gson = new GsonBuilder().serializeNulls().create();
		String json="";
		Message message = new Message();
		message.setCode(Message.SUCCESS_CODE);
		message.setMessage(Message.FAIL_MESSAGE);
		
		int count = userService.listreviewCount();
		int totalpage = (count + users.getLimit() - 1) / users.getLimit();
		int startpage = (users.getPage() - 1) * users.getLimit();
		users.setStartpage(startpage);
		
		List<Users> user = userService.listreview(users);
		
		if(users != null){
			message.setCode(Message.SUCCESS_CODE);
			message.setMessage(Message.SUCCESS_MESSAGE);
			message.setData(user);
			message.setCount(count);
		}
		
		json=gson.toJson(message);
		return json;
	}
	
	/**
	 * 列出所有已审核的用户
	 * @param request
	 * @param resp
	 * @return
	 */
	@RequestMapping(value = "/listuser",method = RequestMethod.POST,produces="application/json;charset=UTF-8")
	public @ResponseBody String listuser(HttpServletRequest request,HttpServletResponse resp,Users users){
		Gson gson = new GsonBuilder().serializeNulls().create();
		String json="";
		Message message = new Message();
		message.setCode(Message.SUCCESS_CODE);
		message.setMessage(Message.FAIL_MESSAGE);
		
		int count = userService.listuserCount();
		int totalpage = (count + users.getLimit() - 1) / users.getLimit();
		int startpage = (users.getPage() - 1) * users.getLimit();
		users.setStartpage(startpage);
		
		List<Users> user = userService.listuser(users);
		
		if(users != null){
			message.setCode(Message.SUCCESS_CODE);
			message.setMessage(Message.SUCCESS_MESSAGE);
			message.setData(user);
			message.setCount(count);
		}
		
		json=gson.toJson(message);
		return json;
	}
	
	
	/**
	 * 审核用户
	 * @param request
	 * @param resp
	 * @return
	 */
	@RequestMapping(value = "/review",method = RequestMethod.POST,produces="application/json;charset=UTF-8")
	public @ResponseBody String review(@RequestBody Users user,HttpServletRequest request,HttpServletResponse resp){
		Gson gson = new GsonBuilder().serializeNulls().create();
		String json="";
		Message message = new Message();
		message.setCode(Message.SUCCESS_CODE);
		message.setMessage(Message.FAIL_MESSAGE);
		
		user.setEnable(true);
		int i = userService.review(user);
		
		if(i == 1){
			message.setCode(Message.SUCCESS_CODE);
			message.setMessage(Message.SUCCESS_MESSAGE);
		}
		
		json=gson.toJson(message);
		return json;
	}
	
	/**
	 * 修改用户资料（包括密码）
	 * @param request
	 * @param resp
	 * @return
	 */
	@RequestMapping(value = "/edituser",method = RequestMethod.POST,produces="application/json;charset=UTF-8")
	public @ResponseBody String edituser(@RequestBody Users user,HttpServletRequest request,HttpServletResponse resp){
		Gson gson = new GsonBuilder().serializeNulls().create();
		String json="";
		Message message = new Message();
		message.setCode(Message.SUCCESS_CODE);
		message.setMessage(Message.FAIL_MESSAGE);
		
		//密码处理
		if(user.getPassword() != null){
			user.setPassword(Md5Encode.md5Encode(user.getPassword()));
		}
		int i = userService.updateByPrimaryKeySelective(user);
		
		if(i == 1){
			message.setCode(Message.SUCCESS_CODE);
			message.setMessage(Message.SUCCESS_MESSAGE);
		}
		
		json=gson.toJson(message);
		return json;
	}
	
	
	/**
	 * 菜单栏
	 */
	@RequestMapping(value = "/getmenu",method = RequestMethod.GET,produces="application/json;charset=UTF-8")
	public @ResponseBody String getmenu(HttpServletRequest request,HttpServletResponse resp){
		Gson gson = new GsonBuilder().serializeNulls().create();
		String json="";
		Message message = new Message();
		message.setCode(Message.SUCCESS_CODE);
		message.setMessage(Message.FAIL_MESSAGE);

		Subject subject = SecurityUtils.getSubject();
		Users user = (Users)subject.getPrincipal();
		Integer companyId = user.getCompanyId();
		
		List<MenuDo> menus = userService.getmenu(companyId);
		if(menus != null){
			message.setCode(Message.SUCCESS_CODE);
			message.setMessage(Message.SUCCESS_MESSAGE);
			message.setData(menus);
		}

		json=gson.toJson(message);
		json = json.replaceAll("bigName", "name").replaceAll("bigTitle", "title").replaceAll("smallTitle", "title").replaceAll("smallName", "name");
		
		return json;
	}

	
	/**
	 * 搜索未审核的用户
	 * @param request
	 * @param resp
	 * @return
	 */
	@RequestMapping(value = "/searchreview",method = RequestMethod.POST,produces="application/json;charset=UTF-8")
	public @ResponseBody String searchreview(HttpServletRequest request,HttpServletResponse resp,@RequestBody Users users){
		Gson gson = new GsonBuilder().serializeNulls().create();
		String json="";
		Message message = new Message();
		message.setCode(Message.SUCCESS_CODE);
		message.setMessage(Message.FAIL_MESSAGE);
		
		
		Users user = userService.searchreview(users);
		
		if(users != null){
			message.setCode(Message.SUCCESS_CODE);
			message.setMessage(Message.SUCCESS_MESSAGE);
			user.setPassword("");
			message.setData(user);
		}
		
		json=gson.toJson(message);
		return json;
	}
	
	
	/*
	 * 验证旧密码
	 */
	@RequestMapping(value = "/checkPassword",method = RequestMethod.POST,produces="application/json;charset=UTF-8")
	public @ResponseBody String checkPassword(HttpServletRequest request,HttpServletResponse resp,@RequestBody Users users){
		Gson gson = new GsonBuilder().serializeNulls().create();
		String json="";
		Message message = new Message();
		message.setCode(Message.SUCCESS_CODE);
		message.setMessage(Message.FAIL_MESSAGE);
		
		Subject subject = SecurityUtils.getSubject();
		Users user = (Users)subject.getPrincipal();

		Users userVo = userService.getUserByAccount(user.getAccount());
		
		if(userVo != null && userVo.getPassword().equals(Md5Encode.md5Encode(users.getPassword()))){
			message.setCode(Message.SUCCESS_CODE);
			message.setMessage(Message.SUCCESS_MESSAGE);
		}
		
		json=gson.toJson(message);
		return json;
	}
	
}
