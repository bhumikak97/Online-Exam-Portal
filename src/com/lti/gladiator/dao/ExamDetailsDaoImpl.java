package com.lti.gladiator.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import com.lti.gladiator.bean.ExamDetails;
import com.lti.gladiator.exception.ExamDetailsException;

@Repository

public class ExamDetailsDaoImpl implements ExamDetailsDao {

	@PersistenceContext
	EntityManager em;

//	To display exam details
	@Override
	public List<ExamDetails> findAllExamDetails(int level, String exam_name) throws ExamDetailsException {
		Query query = em.createQuery("FROM ExamDetails where level=:l AND exam_name=:e order by q_id");
		query.setParameter("e", exam_name);
		query.setParameter("l", level);
		return query.getResultList();
	}

//	To insert new exam
	@Override
	public boolean insertNewExamDetails(ExamDetails ed) throws ExamDetailsException {
		em.persist(ed);
		return true;
	}

//	To delete exam
	@Override
	public boolean deleteExamDetailsById(int exam_id) throws ExamDetailsException {
		Query qry = em.createNativeQuery("delete from EXAM_DETAILS where EXAM_ID=:id");
		qry.setParameter("id", exam_id);
		qry.executeUpdate();
		return true;
	}

}
