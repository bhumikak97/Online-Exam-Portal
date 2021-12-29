package com.lti.gladiator.controller;


import javax.annotation.Resource;
import javax.mail.internet.MimeMessage;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.mail.javamail.MimeMessagePreparator;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmailController {

	static String emailToRecipient, emailSubject, emailMessage;
	static final String emailFromRecipient = "aradhana.potteth@gmail.com";

	static ModelAndView modelViewObj;

	@Resource
	private JavaMailSender mailSenderObj;

	@RequestMapping("/forgotPassword.htm")
	public String getForgotPassword() {
		return "emailForm";
	}

	// This Method Is Used To Prepare The Email Message And Send It To The Client
	@RequestMapping(value = "/sendEmail.htm", method = RequestMethod.POST)
	public ModelAndView sendEmailToClient(HttpServletRequest request, HttpSession session ,@RequestParam("mailTo") String mailTo) {

		// Reading Email Form Input Parameters
		emailSubject = "Exam Portal-Password Reset";
		emailMessage = "Click on the link to reset your password: http://192.168.100.122:5080/ONLINE_EXAM/reset_password.htm";
		emailToRecipient = mailTo;
		
		mailSenderObj.send(new MimeMessagePreparator() {
			public void prepare(MimeMessage mimeMessage) throws Exception {
				MimeMessageHelper mimeMsgHelperObj = new MimeMessageHelper(mimeMessage, true, "UTF-8");
				mimeMsgHelperObj.setTo(emailToRecipient);
				mimeMsgHelperObj.setFrom(emailFromRecipient);
				mimeMsgHelperObj.setText(emailMessage);
				mimeMsgHelperObj.setSubject(emailSubject);
			}
		});
		String mailSentMessage = "We have sent the link to reset password to your registered email id";
		modelViewObj = new ModelAndView("login");
		modelViewObj.addObject("mailSentMessage", mailSentMessage);
		return modelViewObj;
	}
}