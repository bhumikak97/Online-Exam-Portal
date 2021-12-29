package com.lti.gladiator.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.lti.gladiator.bean.Exam;
import com.lti.gladiator.exception.ExamDetailsException;
import com.lti.gladiator.exception.ExamException;
import com.lti.gladiator.service.ExamDetailsService;
import com.lti.gladiator.service.ExamService;

@Controller
public class ExamController {

	@Resource
	private ExamService service;

	@Resource
	private ExamDetailsService ed_service;

	@RequestMapping("/instructions.htm")
	public String getInstructionsPage(HttpSession session, @RequestParam("testName") String testName) {
		session.setAttribute("testName", testName);
		return "instructions";
	}

	@RequestMapping("/insertExamPage.htm")
	public ModelAndView findAll() {
		List<Exam> examList = null;
		ModelAndView mAndV = null;
		try {
			examList = service.findAll();
			mAndV = new ModelAndView();
			// Pass-on this data to JSP
			mAndV.setViewName("view_test_details");
			mAndV.addObject("list", examList);
		} catch (ExamException e) {
			e.printStackTrace();
		}
		return mAndV;
	}

	@RequestMapping("/deleteExam.htm")
	public String deleteExamById(@RequestParam("id") int id)
	{
		System.out.println(id);
		try {
			ed_service.deleteExamDetailsById(id);
			service.deleteExamById(id);
		} catch (ExamDetailsException e) {
			e.printStackTrace();
		} catch (ExamException e) {
			e.printStackTrace();
		}
		return "redirect:/insertExamPage.htm";
	}

	@RequestMapping("/exam.htm")
	public String getExamListPage() {
		return "exam";
	}

}
