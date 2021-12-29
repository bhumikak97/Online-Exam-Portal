package com.lti.gladiator.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.lti.gladiator.bean.Admin;
import com.lti.gladiator.dao.AdminDao;


@Service("adminServices")
//@Scope("singleton")
@Transactional(propagation=Propagation.REQUIRED)
public class AdminServiceImpl implements AdminService,AdminDao{

	@Autowired
	private AdminDao dao;
	
	@Override
	public boolean validateAdmin(Admin admin){
		  return dao.validateAdmin(admin);
	}
}
