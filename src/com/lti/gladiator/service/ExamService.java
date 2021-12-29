package com.lti.gladiator.service;

import java.util.List;

import com.lti.gladiator.bean.Exam;
import com.lti.gladiator.exception.ExamException;


public interface ExamService {
	//public Exam findByExamId(int exam_id) throws ExamException;
	
	public List<Exam> findAll() throws ExamException;
	
	public int insertNewExam(Exam exam) throws ExamException;
	
	public void deleteExamById(int exam_id) throws ExamException;
	


	//public int insertNewExamByName(String exam_name) throws ExamException;
}

