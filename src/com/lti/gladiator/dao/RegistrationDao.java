package com.lti.gladiator.dao;

import java.util.List;

import com.lti.gladiator.bean.Login;
import com.lti.gladiator.bean.Registration;
import com.lti.gladiator.exception.RegistrationException;

public interface RegistrationDao {

	public List<Registration> findAllRegistration() throws RegistrationException;
	
	public Registration findUserByEmail(String email) throws RegistrationException;
	
	public Registration insertNewRegistration(Registration reg) throws RegistrationException;
	
	public boolean validateUser(Login login);
	
	public void resetPassword(String email,String password) throws RegistrationException;
}
