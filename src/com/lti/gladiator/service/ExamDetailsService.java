package com.lti.gladiator.service;

import java.util.List;

import com.lti.gladiator.bean.ExamDetails;
import com.lti.gladiator.exception.ExamDetailsException;
import com.lti.gladiator.exception.ExamException;

public interface ExamDetailsService {


	public List<ExamDetails> findAllExamDetails(int level,String exam_name) throws ExamDetailsException;
	
	public boolean insertNewExamDetails(ExamDetails ed) throws ExamDetailsException;
		
	public void deleteExamDetailsById(int exam_id) throws ExamDetailsException;
}
