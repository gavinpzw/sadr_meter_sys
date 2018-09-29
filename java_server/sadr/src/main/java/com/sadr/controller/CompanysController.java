package com.sadr.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.sadr.domain.ElecMeterHub;
import com.sadr.domain.ElecMeterInfo;
import com.sadr.domain.ElecMeters;
import com.sadr.domain.EngineRooms;
import com.sadr.domain.Users;
import com.sadr.service.CompanyService;
import com.sadr.util.Message;

@Controller
@RequestMapping("/company")
public class CompanysController {
	@Autowired
	private CompanyService companyService;

	/**
	 * 根据公司id获取机房信息
	 */
	@RequestMapping(value = "/geter",method = RequestMethod.POST,produces="application/json;charset=UTF-8")
	public @ResponseBody String geter(EngineRooms er,HttpServletRequest request,HttpServletResponse resp){
		Gson gson = new GsonBuilder().serializeNulls().create();
		String json="";
		Message message = new Message();
		message.setCode(Message.SUCCESS_CODE);
		message.setMessage(Message.SUCCESS_MESSAGE);

		Subject subject = SecurityUtils.getSubject();
		Users user = (Users)subject.getPrincipal();
		if(user != null && user.getRole() == 3){
			int companyId = user.getCompanyId();
			er.setCompanyId(companyId);
		}

		int count = companyService.selectByCompanysIdCount(er);
		int totalpage = (count + er.getLimit() - 1) / er.getLimit();
		int startpage = (er.getPage() - 1) * er.getLimit();
		er.setStartpage(startpage);
		
		
		List<EngineRooms> ers = companyService.selectByCompanysId(er);
		if(ers != null){
			message.setCode(Message.SUCCESS_CODE);
			message.setMessage(Message.SUCCESS_MESSAGE);
			message.setCount(count);
			message.setData(ers);
		}

		json=gson.toJson(message);
		return json;
	}

	/**
	 * 根据机房获取电表
	 */
	@RequestMapping(value = "/getMeters",method = RequestMethod.POST,produces="application/json;charset=UTF-8")
	public @ResponseBody String getMeters(EngineRooms er,HttpServletRequest request,HttpServletResponse resp){
		Gson gson = new GsonBuilder().serializeNulls().create();
		String json="";
		Message message = new Message();
		message.setCode(Message.SUCCESS_CODE);
		message.setMessage(Message.SUCCESS_MESSAGE);

		int count = companyService.getMetersCount(er);
		int totalpage = (count + er.getLimit() - 1) / er.getLimit();
		int startpage = (er.getPage() - 1) * er.getLimit();
		er.setStartpage(startpage);
		
		List<ElecMeters> ers = companyService.getMeters(er);
		if(ers != null){
			message.setCode(Message.SUCCESS_CODE);
			message.setMessage(Message.SUCCESS_MESSAGE);
			message.setCount(count);
			message.setData(ers);
		}

		json=gson.toJson(message);
		return json;
	}

	/**
	 * 根据id查询电表
	 */
	@RequestMapping(value = "/searchmeters",method = RequestMethod.POST,produces="application/json;charset=UTF-8")
	public @ResponseBody String searchmeters(@RequestBody ElecMeters meter,HttpServletRequest request,HttpServletResponse resp){
		Gson gson = new GsonBuilder().serializeNulls().create();
		String json="";
		Message message = new Message();
		message.setCode(Message.SUCCESS_CODE);
		message.setMessage(Message.SUCCESS_MESSAGE);

		ElecMeters meters = companyService.searchmeters(meter);
		if(meters != null){
			message.setCode(Message.SUCCESS_CODE);
			message.setMessage(Message.SUCCESS_MESSAGE);
			message.setData(meters);
		}

		json=gson.toJson(message);
		return json;
	}

	/**
	 * 获取电表信息
	 */
	@RequestMapping(value = "/getmetersinfo",method = RequestMethod.POST,produces="application/json;charset=UTF-8")
	public @ResponseBody String getmetersinfo(@RequestBody ElecMeters meter,HttpServletRequest request,HttpServletResponse resp){
		Gson gson = new GsonBuilder().serializeNulls().create();
		String json="";
		Message message = new Message();
		message.setCode(Message.SUCCESS_CODE);
		message.setMessage(Message.SUCCESS_MESSAGE);

		ElecMeterInfo info = companyService.getmetersinfo(meter);
		if(info != null){
			message.setCode(Message.SUCCESS_CODE);
			message.setMessage(Message.SUCCESS_MESSAGE);
			message.setData(info);
		}

		json=gson.toJson(message);
		return json;
	}
	
	/**
	 * 根据id查询机房
	 */
	@RequestMapping(value = "/searcher",method = RequestMethod.POST,produces="application/json;charset=UTF-8")
	public @ResponseBody String searcher(@RequestBody EngineRooms er,HttpServletRequest request,HttpServletResponse resp){
		Gson gson = new GsonBuilder().serializeNulls().create();
		String json="";
		Message message = new Message();
		message.setCode(Message.SUCCESS_CODE);
		message.setMessage(Message.SUCCESS_MESSAGE);

		EngineRooms room = companyService.searchmeters(er);
		if(room != null){
			message.setCode(Message.SUCCESS_CODE);
			message.setMessage(Message.SUCCESS_MESSAGE);
			message.setData(room);
		}

		json=gson.toJson(message);
		return json;
	}
}
