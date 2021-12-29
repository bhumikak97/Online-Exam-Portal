package com.lti.gladiator.dao;

import java.util.List;
import com.lti.gladiator.bean.Report;
import com.lti.gladiator.exception.ReportException;

public interface ReportDao {

	public List<Report> findAll() throws ReportException;
	
	public List<Report> findUserReport(String reg_name) throws ReportException;
	
	public Report insertNewReport(Report report) throws ReportException;
	
	public boolean checkAns(String ans, int i,String exam_name, int level);
	
}
