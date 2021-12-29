package com.lti.gladiator.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.springframework.stereotype.Repository;
import com.lti.gladiator.bean.Admin;

@Repository
public class AdminDaoImpl implements AdminDao {

	@PersistenceContext
	EntityManager em;

//	validate admin login from database
	@Override
	public boolean validateAdmin(Admin admin) {
		String email = admin.getAdm_email();
		String pass = admin.getAdm_password();
		System.out.println(email + pass);
		System.out.println("dao");
		Query query = em.createQuery("FROM Admin WHERE ADM_EMAIL=:e AND ADM_PASSWORD=:p");
		query.setParameter("e", email);
		query.setParameter("p", pass);
		try {
			Admin a = (Admin) query.getSingleResult();
			System.out.println("validadmin->"+ a);
			return true;
		} catch (Exception e) {
			System.err.println(e);
			return false;
		}
	}

}
