package com.lti.gladiator.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.lti.gladiator.bean.ExamDetails;
import com.lti.gladiator.dao.ExamDetailsDao;
import com.lti.gladiator.exception.ExamDetailsException;
import com.lti.gladiator.exception.ExamException;


@Service
@Transactional(propagation=Propagation.REQUIRES_NEW)
public class ExamDetailsServiceImpl implements ExamDetailsService {

	@Resource
	private ExamDetailsDao dao;
	
	public List<ExamDetails> findAllExamDetails(int level,String exam_name) throws ExamDetailsException{
		return dao.findAllExamDetails(level,exam_name);
	}
	
	public boolean insertNewExamDetails(ExamDetails ed) throws ExamDetailsException{

			
		return dao.insertNewExamDetails(ed);
	}
	
	
	public void deleteExamDetailsById(int exam_id) throws ExamDetailsException{
		dao.deleteExamDetailsById(exam_id);
	}
	

}
