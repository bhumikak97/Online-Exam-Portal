package com.lti.gladiator.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.lti.gladiator.bean.Exam;
import com.lti.gladiator.exception.ExamException;

@Repository

public class ExamDaoImpl implements ExamDao {

	@PersistenceContext
	EntityManager em;

	Exam e = new Exam();

	//to display List of exams
	@Override
	public List<Exam> findAll() throws ExamException {
		Query qry = em.createNamedQuery("allExam");
		return qry.getResultList();
	}

	//Insert new exam
	@Override
	public int insertNewExam(Exam exam) throws ExamException {
		Query query = em.createQuery("select MAX(exam_id) from Exam");
		Integer id = (Integer) query.getSingleResult();
		if (id == null) {
			id = 1;
		} else {
			id += 1;
		}
		exam.setExam_id(id);
		em.persist(exam);
		return exam.getExam_id();
	}

	//Delete exam
	@Override
	public void deleteExamById(int exam_id) throws ExamException {
		Exam exam = em.find(Exam.class, exam_id);
		if (exam != null) {
			em.remove(exam);
		}
	}

}
