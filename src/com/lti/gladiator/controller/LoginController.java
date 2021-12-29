package com.lti.gladiator.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.lti.gladiator.bean.Login;
import com.lti.gladiator.bean.Registration;
import com.lti.gladiator.exception.RegistrationException;
import com.lti.gladiator.service.RegistrationService;

@Controller
public class LoginController {

	@Resource
	private RegistrationService service;

	private Login login = new Login();

	@RequestMapping("/login.htm")
	public String getRegisterPage(HttpServletResponse response) {
		HttpServletResponse httpResponse = (HttpServletResponse) response;
		httpResponse.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); // HTTP 1.1.
		httpResponse.setHeader("Pragma", "no-cache"); // HTTP 1.0.
		httpResponse.setDateHeader("Expires", 0); // Proxies.
		return "login";
	}

	@RequestMapping(value = "/loginProcess.htm", method = RequestMethod.POST)
	public ModelAndView loginProcess(ModelMap model, HttpServletRequest request, HttpServletResponse response,
			HttpSession session, @RequestParam("email") String email, @RequestParam("password") String password) 
	{

		login.setEmail(email);
		login.setPassword(password);
		ModelAndView modelAndView = new ModelAndView();

		if (service.validateUser(login) == true) {
			Registration reg = null;
			String username = "";
			int reg_id = 1;
			try {

				reg = service.findUserByEmail(email);
				username = reg.getReg_name();
				reg_id = reg.getReg_id();
			} catch (RegistrationException e) {
				e.printStackTrace();
			}
			session = request.getSession();
			session.setAttribute("user", username);
			session.setAttribute("reg_id", reg_id);
			modelAndView.setViewName("user_login_success");
			return modelAndView;
		} else {
			modelAndView.setViewName("login");
			String invalidLoginCredentials = "Invalid Credentials!";
			modelAndView.addObject("invalidLoginCredentials", invalidLoginCredentials);
			return modelAndView;
		}
	}

}
