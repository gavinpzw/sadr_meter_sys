package com.sadr.controller.intercepter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.sadr.domain.Users;

public class LoginInterceptor implements HandlerInterceptor {
	private static final String[] URLS = {
			"/user/login.action","/user/getCompany.action","/user/checkUser.action","/user/register.action",""
	};

	@Override
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
	
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {
		
	}

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object arg2) throws Exception {
		StringBuffer requesturl = request.getRequestURL();
		System.out.println(requesturl);
		for(String url : URLS) {
			if(requesturl.lastIndexOf(url) > 0) {
				return true;
			}
		}
		
		Subject subject = SecurityUtils.getSubject();
		Users user = (Users)subject.getPrincipal();
		if(user != null){
			return true;
		}
		
		String path = request.getContextPath();
		
		// 20180627 去除url中的项目名称“/web02”
		/*if(path != null && path.indexOf("web02") == -1) {
			path += "/web02";
		}*/
		response.sendRedirect(path + "/login/index.action");
		return false;
	}

}
