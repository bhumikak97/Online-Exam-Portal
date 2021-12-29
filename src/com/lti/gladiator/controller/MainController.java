package com.lti.gladiator.controller;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

	@RequestMapping("/index.htm")
	public String getIndexPage() {
		return "index";
	}
	
	@RequestMapping("/about.htm")
	public String getAboutPage() {
		return "about";
	}
	
	@RequestMapping("/reset_password.htm")
	public String getResetPasswordPage() {
		return "reset_password";
	}

	@RequestMapping(value = "/logout.htm")
	public String getLogoutPage(HttpSession session, HttpServletResponse response ) {
		session.invalidate();
		return "logout";
	}

	@RequestMapping("/userHome.htm")
	public String getUserHomePage(HttpServletResponse response) {
		HttpServletResponse httpResponse=(HttpServletResponse)response;
		httpResponse.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); // HTTP 1.1.
		httpResponse.setHeader("Pragma", "no-cache"); // HTTP 1.0.
		httpResponse.setDateHeader("Expires", 0); // Proxies.
		return "user_login_success";
	}
	
	@RequestMapping("/testRedirect.htm")
	public String getNextTestPage(HttpServletResponse response) {
		HttpServletResponse httpResponse=(HttpServletResponse)response;
		httpResponse.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); // HTTP 1.1.
		httpResponse.setHeader("Pragma", "no-cache"); // HTTP 1.0.
		httpResponse.setDateHeader("Expires", 0); // Proxies.
		return "test_completed";
	}


	@RequestMapping("/adminHome.htm")
	public String getAdminHomePage(HttpServletResponse response) {
		HttpServletResponse httpResponse=(HttpServletResponse)response;
		httpResponse.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); // HTTP 1.1.
		httpResponse.setHeader("Pragma", "no-cache"); // HTTP 1.0.
		httpResponse.setDateHeader("Expires", 0); // Proxies.
		return "admin_login_success";
	}
}
