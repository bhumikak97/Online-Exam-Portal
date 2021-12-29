package com.lti.gladiator.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.lti.gladiator.bean.Exam;
import com.lti.gladiator.bean.ExamDetails;
import com.lti.gladiator.bean.Report;
import com.lti.gladiator.exception.ExamDetailsException;
import com.lti.gladiator.exception.ExamException;
import com.lti.gladiator.service.ExamDetailsService;

@Controller
public class ExamDetailsController {

	@Resource
	private ExamDetailsService service;

	@RequestMapping("/test.htm")
	public ModelAndView findFirstExamDetails(HttpServletResponse response, HttpSession session,
			@RequestParam("level") int level) {
		List<ExamDetails> quesList = null;
		ModelAndView mAndV = null;
		try {
			mAndV = new ModelAndView();
			String exam_name = (String) session.getAttribute("testName");
			int testLevel = level;
			quesList = service.findAllExamDetails(testLevel, exam_name);
			mAndV.setViewName("test");
			mAndV.addObject("list", quesList);
			session.setAttribute("quesList", quesList);
			testLevel += 1;
			session.setAttribute("testLevel", testLevel);

			// Pass-on this data to JSP
			HttpServletResponse httpResponse = (HttpServletResponse) response;
			httpResponse.setHeader("Cache-Control", "no-Cache, no-Store, must-revalidate");
			httpResponse.setHeader("Pragma", "no-Cache");
			httpResponse.setDateHeader("Expires", 0);

		} catch (ExamDetailsException e) {
			e.printStackTrace();
		}
		return mAndV;
	}

	@RequestMapping("/nextTest.htm")
	public ModelAndView findNextExamDetails(HttpSession session) {
		List<ExamDetails> quesList = null;
		ModelAndView mAndV = null;
		try {
			mAndV = new ModelAndView();
			String exam_name = (String) session.getAttribute("testName");
			int testLevel = (Integer) session.getAttribute("testLevel");
			quesList = service.findAllExamDetails(testLevel, exam_name);
			testLevel += 1;
			session.setAttribute("testLevel", testLevel);

			// Pass-on this data to JSP
			if (testLevel < 5) {
				mAndV.setViewName("test");
				mAndV.addObject("list", quesList);
				session.setAttribute("quesList", quesList);
			} else {
				mAndV.setViewName("user_login_success");
			}

		} catch (ExamDetailsException e) {
			e.printStackTrace();
		}
		return mAndV;
	}
}
