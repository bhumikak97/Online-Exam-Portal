package com.lti.gladiator.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.lti.gladiator.bean.Report;
import com.lti.gladiator.exception.ReportException;


public interface ReportService {
    
	public List<Report> findAll() throws ReportException;
	
	public List<Report> findUserReport(String reg_name) throws ReportException;
	
	public Report insertNewReport(Report report) throws ReportException;
	
	public boolean checkAns(String ans, int i,String exam_name, int level);

}
