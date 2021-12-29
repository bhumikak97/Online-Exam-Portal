package com.lti.gladiator.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import org.springframework.stereotype.Repository;
import com.lti.gladiator.bean.Report;
import com.lti.gladiator.exception.ReportException;

@Repository
public class ReportDaoImpl implements ReportDao {

	@PersistenceContext
	EntityManager em; 

//	To display all reports to admin
	@Override
	public List<Report> findAll() throws ReportException {
		Query qry = em.createNamedQuery("allInfo");
		return qry.getResultList();
	}

//	To display user report after test
	@Override
	public List<Report> findUserReport(String reg_name) throws ReportException {
		Query query = em.createQuery("FROM Report WHERE REG_NAME=:r");
		query.setParameter("r", reg_name);
		List<Report> var = query.getResultList();
		for (Report report : var) {
			System.out.println(report);
		}
		return var;
	}

//	To store user's report in database
	@Override
	public Report insertNewReport(Report report) throws ReportException {
		em.persist(report);
		return report;
	}

	@Override
	public boolean checkAns(String ans, int i, String exam_name, int level) {
		System.out.println(ans + " " + i);
		Query query = em.createQuery("FROM ExamDetails WHERE CORRECT_ANS=:e AND LEVEL_TYPE=:l AND EXAM_NAME=:en AND Q_ID=:p ");
		query.setParameter("e", ans);
		query.setParameter("p", i);
		query.setParameter("en", exam_name);
		query.setParameter("l", level);
		try {
			query.getSingleResult();
			return true;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return false;
	}

}
