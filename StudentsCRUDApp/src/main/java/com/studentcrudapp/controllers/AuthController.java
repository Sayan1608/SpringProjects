package com.studentcrudapp.controllers;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AuthController {
	
	@RequestMapping("/login")
	public String showLoginForm() {
		return "view/login-form.jsp";
	}
	
	@RequestMapping(value = "/login_action", method = RequestMethod.POST)
	public void checkCredentials(
			@RequestParam("username") String uName,
			@RequestParam("password") String pwd,
			HttpServletRequest req,
			HttpServletResponse res
			) throws IOException {
		
		if(uName.equals("admin") && pwd.equals("1234")) {
			req.getSession().setAttribute("username", uName);
			res.sendRedirect("dashboard");
		}else {
			res.sendRedirect("login");
		}
		
	}
	
	@RequestMapping("/logout")
	public void signOut(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		
		req.getSession().invalidate();
		resp.sendRedirect("login");
	}
	
}
