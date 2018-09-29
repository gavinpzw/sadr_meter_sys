package com.sadr.controller;

import java.util.ArrayList;
import java.util.List;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.session.Session;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sadr.domain.Users;
import com.sadr.service.UserService;

@Controller
@RequestMapping("/home")
public class HomeController {
	@Autowired
	private UserService userService;

	/**
	 * 跳转登录界面
	 * @return
	 */
	@RequestMapping(value = "/toLogin",method = RequestMethod.GET)
	private String toLogin(){
		Users users = userService.getUserByAccount("admin");
		System.out.println(users);

		Subject subject = SecurityUtils.getSubject();
		UsernamePasswordToken token = new UsernamePasswordToken("admin", "123456");
		try{
			subject.login(token);
			Session session = subject.getSession();
			System.out.println("sessionId:"+session.getId());
			System.out.println("sessionHost:"+session.getHost());
			System.out.println("sessionTimeout:"+session.getTimeout());
			System.out.println("登录成功");
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("用户名或密码错误！");
		}

		return "user/login";
	}

	/**
	 * 跳转主页
	 * @return
	 */
	@RequestMapping(value = "/index",method = RequestMethod.GET)
	private String index(){
		Users users = userService.getUserByAccount("admin");
		System.out.println(users);
		return "user/login";
	}
}
