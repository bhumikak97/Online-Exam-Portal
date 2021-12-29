package com.lti.gladiator.bean;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@NamedQueries({
	@NamedQuery(name="allExam", query="from Exam order by exam_id")
})
@Entity
@Table(name="EXAM")
public class Exam {

	private int exam_id;
	private String exam_name,created_by;
	private Date created_on;
	
//	Default Constructor	
	public Exam() {
		super();
	}
//	Parameterized Constructor	
	public Exam(int exam_id, String exam_name, String created_by, Date created_on) {
		super();
		this.exam_id = exam_id;
		this.exam_name = exam_name;
		this.created_by = created_by;
		this.created_on = created_on;
	}
//	Getters and Setter
	@Id
	@Column(name="EXAM_ID")
	public int getExam_id() {
		return exam_id;
	}
	
	public void setExam_id(int exam_id) {
		this.exam_id = exam_id;
	}
	
	@Column(name="EXAM_NAME")
	public String getExam_name() {
		return exam_name;
	}
	public void setExam_name(String exam_name) {
		this.exam_name = exam_name;
	}
	
	@Column(name="CREATED_BY")
	public String getCreated_by() {
		return created_by;
	}
	public void setCreated_by(String created_by) {
		this.created_by = created_by;
	}
	
	@Column(name="CREATED_ON")
	public Date getCreated_on() {
		return created_on;
	}
	public void setCreated_on(Date created_on) {
		this.created_on = created_on;
	}

}
