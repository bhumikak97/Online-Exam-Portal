package com.lti.gladiator.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.lti.gladiator.bean.Report;
import com.lti.gladiator.exception.ReportException;
import com.lti.gladiator.service.ReportService;

@Controller
public class ReportController {

	@Resource
	private ReportService service;

	@RequestMapping("/testScore.htm")
	public ModelAndView calScore(HttpSession session) {
		ModelAndView mAndv = new ModelAndView();

		mAndv.setViewName("report_card");
		return mAndv;
	}

	@RequestMapping(value = "/testCompleted.htm")
	public ModelAndView getTestCompletedPage(HttpSession session, HttpServletRequest request) {
		Report report = new Report();

		String exam_name = (String) session.getAttribute("testName");
		int testLevel = (Integer) session.getAttribute("testLevel");
		String r_name = (String) session.getAttribute("user");
		testLevel -= 1;
		ModelAndView mAndv = new ModelAndView();
		int count_corr = 0;
		int count_wrong = 0;
		int score = 0;
		String ans[] = new String[10];
		ans[0] = request.getParameter("option1");
		ans[1] = request.getParameter("option2");
		ans[2] = request.getParameter("option3");
		ans[3] = request.getParameter("option4");
		ans[4] = request.getParameter("option5");
		ans[5] = request.getParameter("option6");
		ans[6] = request.getParameter("option7");
		ans[7] = request.getParameter("option8");
		ans[8] = request.getParameter("option9");
		ans[9] = request.getParameter("option10");
		for (int i = 0; i < 10; i++) {
			String answer = ans[i];
			if (service.checkAns(answer, i + 1, exam_name, testLevel)) {
				count_corr++;
			} else {
				count_wrong++;

			}
		}
		score = count_corr * 2;
		String status;
		if (score >= 12) {
			status = "Passed";
		} else {
			status = "Failed";
		}
		session.setAttribute("score", score);
		session.setAttribute("status", status);
		try {
			report.setExam_name(exam_name);
			report.setLevel_type(testLevel);
			report.setCount_correct_ans(count_corr);
			report.setCount_wrong_ans(count_wrong);
			report.setScore(score);
			report.setReg_name(r_name);
			Report insertedReport = service.insertNewReport(report);
		} catch (Exception e) {
			e.printStackTrace();
		}
		mAndv.setViewName("test_completed");
		return mAndv;
	}

	@RequestMapping("/report_card.htm")
	public ModelAndView report(HttpServletRequest request) {
		ModelAndView mAndv = new ModelAndView();
		// Pass-on this data to JSP
		mAndv.setViewName("report_card");
		return mAndv;
	}

	@RequestMapping("/show_stud.htm")
	public ModelAndView getStudentDetailsPage() {
		List<Report> studentList = null;
		ModelAndView mAndV = null;
		try {
			studentList = service.findAll();
			mAndV = new ModelAndView();
			// Pass-on this data to JSP
			mAndV.setViewName("show_stud");
			mAndV.addObject("studentList", studentList);
		} catch (ReportException e) {
			e.printStackTrace();
		}
		return mAndV;
	}

	@RequestMapping("/user_report.htm")
	public ModelAndView getUserReport(HttpSession session) {
		ModelAndView mAndv = null;
		List<Report> userList = null;
		String r_name = (String) session.getAttribute("user");
		System.out.println(r_name);
		try {
			userList = service.findUserReport(r_name);
			for (Report report : userList) {
				System.out.println(userList);
			}
			mAndv = new ModelAndView();
			// Pass-on this data to JSP
			mAndv.setViewName("user_report");
			mAndv.addObject("userList", userList);
		} catch (ReportException e) {
			e.printStackTrace();
		}

		return mAndv;
	}

}
