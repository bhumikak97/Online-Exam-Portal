package com.lti.gladiator.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.lti.gladiator.bean.Login;
import com.lti.gladiator.bean.Registration;
import com.lti.gladiator.exception.RegistrationException;

@Repository
public class RegistrationDaoImpl implements RegistrationDao {

	@PersistenceContext
	EntityManager em;

//	To display all student registrations
	@Override
	public List<Registration> findAllRegistration() throws RegistrationException {
		Query qry = em.createNamedQuery("allReg");
		return qry.getResultList();
	}

//	To find user by email id
	@Override
	public Registration findUserByEmail(String email) throws RegistrationException {
		Query query = em.createQuery("FROM Registration WHERE EMAIL_ID=:e");
		query.setParameter("e", email);
		Registration reg = (Registration) query.getSingleResult();
		return reg;
	}

//	To register new student
	@Override
	public Registration insertNewRegistration(Registration reg) throws RegistrationException {
		em.persist(reg);
		return reg;
	}

//	Validate user login from database
	@Override
	public boolean validateUser(Login login) {
		String email = login.getEmail();
		String pass = login.getPassword();
		Query query = em.createQuery("FROM Registration WHERE EMAIL_ID=:e AND PASSWORD=:p");
		query.setParameter("e", email);
		query.setParameter("p", pass);
		Registration reg = (Registration) query.getSingleResult();
		if (reg != null)
			return true;
		else
			return false;
	}

//	To reset user's password
	@Override
	public void resetPassword(String email, String password) throws RegistrationException {

		Registration qry = em.find(Registration.class, email);
		qry.setPassword(password);
		qry.setConfirm_password(password);
		em.persist(qry);
	}
}
