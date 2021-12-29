package com.lti.gladiator.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.lti.gladiator.bean.Registration;
import com.lti.gladiator.exception.RegistrationException;
import com.lti.gladiator.service.RegistrationService;

@Controller
public class RegistrationController {

	@Resource
	private RegistrationService service;

	@RequestMapping("/register.htm")
	public String getRegisterPage() {
		return "register";
	}

	@RequestMapping(value = "/insertReg.htm", method = RequestMethod.POST)
	public ModelAndView insertNewRegistration(HttpServletRequest request)
	{
		System.out.println("controller");
		String reg_name = request.getParameter("reg_name");
		String email_id = request.getParameter("email_id");
		String password = request.getParameter("password");
		String confirm_password = request.getParameter("confirm_password");
		String mob_number = request.getParameter("mob_no");
		String city = request.getParameter("city");
		String state = request.getParameter("state");
		String qualification = request.getParameter("qualification");
		String year_of_completion = request.getParameter("year_of_completion");
		String dateString = request.getParameter("dob");

		ModelAndView modelAndView = new ModelAndView();
		try {
			Date dateob = new SimpleDateFormat("dd-mm-yyyy").parse(dateString);
			java.sql.Date sqlDate = new java.sql.Date(dateob.getTime());
			Registration newReg = new Registration();
			newReg.setReg_name(reg_name);
			newReg.setEmail_id(email_id);
			newReg.setPassword(password);
			newReg.setConfirm_password(confirm_password);
			newReg.setMob_no(mob_number);
			newReg.setDob(sqlDate);
			newReg.setCity(city);
			newReg.setState(state);
			newReg.setQualification(qualification);
			newReg.setYear_of_completion(year_of_completion);

			Registration insertNewRegistration = service.insertNewRegistration(newReg);
			modelAndView.setViewName("login");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return modelAndView;
	}

	@RequestMapping(value = "/resetPassword.htm", method = RequestMethod.POST)
	public ModelAndView resetNewPassword(HttpServletRequest request)
	{
		ModelAndView modelAndView = new ModelAndView();
		String email_id =request.getParameter("email");
		String password = request.getParameter("password");
		try {
			service.resetPassword(email_id, password);
		} catch (RegistrationException e) {
			e.printStackTrace();
		}
		modelAndView.setViewName("login");
		return modelAndView;
	}

}
