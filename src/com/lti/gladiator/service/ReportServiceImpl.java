package com.lti.gladiator.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.lti.gladiator.bean.Report;
import com.lti.gladiator.dao.ExamDao;
import com.lti.gladiator.dao.ReportDao;
import com.lti.gladiator.exception.ReportException;


@Service("reportService")
//@Scope("singleton")
@Transactional(propagation=Propagation.REQUIRED)
public class ReportServiceImpl implements ReportService,ReportDao {
	
	@Autowired
	private ReportDao dao;
	
	@Override
	public List<Report> findAll() throws ReportException{
		return dao.findAll();
	}
	
	@Override
	public List<Report> findUserReport(String reg_name) throws ReportException {
		return dao.findUserReport(reg_name);
	}
	
	@Override
	public Report insertNewReport(Report report) throws ReportException{
		return dao.insertNewReport(report);
	}
	
	@Override
	public boolean checkAns(String ans, int i,String exam_name, int level){
		return dao.checkAns(ans, i,exam_name,level);
	}
}
