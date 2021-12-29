package com.lti.gladiator.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.lti.gladiator.bean.Admin;
import com.lti.gladiator.service.AdminService;

@Controller
public class AdminLoginController {

	@Resource
	private AdminService service;

	private Admin admin = new Admin();

	@RequestMapping(value = "/admin_login.htm")
	public String getLoginPage(HttpServletResponse response) {
		HttpServletResponse httpResponse = (HttpServletResponse) response;
		httpResponse.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); // HTTP 1.1.
		httpResponse.setHeader("Pragma", "no-cache"); // HTTP 1.0.
		httpResponse.setDateHeader("Expires", 0); // Proxies.
		return "admin_login";
	}

	@RequestMapping(value = "/admin.htm")
	public String getViewPage() {
		return "admin_login_success";
	}

	@RequestMapping(value = "/adminLogin.htm", method = RequestMethod.POST)
	public ModelAndView aloginProcess(ModelMap model, HttpSession session, HttpServletResponse response,
			@RequestParam("email") String email, @RequestParam("password") String password) {

		HttpServletResponse httpResponse = (HttpServletResponse) response;
		httpResponse.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); // HTTP 1.1.
		httpResponse.setHeader("Pragma", "no-cache"); // HTTP 1.0.
		httpResponse.setDateHeader("Expires", 0); // Proxies.

		admin.setAdm_email(email);
		admin.setAdm_password(password);
		System.out.println("controller");

		ModelAndView modelAndView = new ModelAndView();

		if (service.validateAdmin(admin) == true) {
			System.out.println("controller admin");
			session.setAttribute("admin", "Admin");
			modelAndView.setViewName("admin_login_success");
			return modelAndView;
		} else {
			modelAndView.setViewName("admin_login");
			String invalidAdminLoginCredentials = "Invalid Credentials!";
			modelAndView.addObject("invalidAdminLoginCredentials", invalidAdminLoginCredentials);
			return modelAndView;
		}
	}
}
