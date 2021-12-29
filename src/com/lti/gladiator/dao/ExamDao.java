package com.lti.gladiator.dao;

import java.util.List;

import com.lti.gladiator.bean.Exam;
import com.lti.gladiator.exception.ExamException;

public interface ExamDao {
	
	public List<Exam> findAll() throws ExamException;
	
	public int insertNewExam(Exam exam) throws ExamException;
	
	public void deleteExamById(int exam_id) throws ExamException;

}
