package com.lti.gladiator.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.lti.gladiator.bean.Exam;
import com.lti.gladiator.dao.ExamDao;
import com.lti.gladiator.exception.ExamException;


@Service("examServices")
//@Scope("singleton")
@Transactional(propagation=Propagation.REQUIRED)
public class ExamServiceImpl implements ExamService,ExamDao {

	@Autowired
	private ExamDao dao;
	
	@Override
	public List<Exam> findAll() throws ExamException {
		return dao.findAll();
	}
	
	public int insertNewExam(Exam exam) throws ExamException{
		return dao.insertNewExam(exam);
	}
	
	public void deleteExamById(int exam_id) throws ExamException{
		dao.deleteExamById(exam_id);
	}
	

//	public int insertNewExamByName(String exam_name) throws ExamException{
//		return dao.insertNewExamByName(exam_name);
//	}


}
