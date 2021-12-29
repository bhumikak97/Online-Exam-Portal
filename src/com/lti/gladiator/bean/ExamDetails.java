package com.lti.gladiator.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@NamedQueries({ @NamedQuery(name = "allExamDetails", query = "from ExamDetails order by q_id") })

@Entity
@Table(name = "EXAM_DETAILS")
public class ExamDetails {

	private int q_id, exam_id, level;
	private String question, opt_1, opt_2, opt_3, opt_4, correct_answer, exam_name;

//	Default Constructor
	public ExamDetails() {
		super();
	}

//	Parameterized Constructor...1
	public ExamDetails(int q_id, int exam_id, String question, String opt_1, String opt_2, String opt_3, String opt_4,
			String correct_answer, int level, String exam_name) {
		super();
		this.q_id = q_id;
		this.exam_id = exam_id;
		this.question = question;
		this.opt_1 = opt_1;
		this.opt_2 = opt_2;
		this.opt_3 = opt_3;
		this.opt_4 = opt_4;
		this.correct_answer = correct_answer;
		this.level = level;
		this.exam_name = exam_name;
	}

//	Getters and Setter
	@Column(name = "EXAM_NAME")
	public String getExam_name() {
		return exam_name;
	}

	public void setExam_name(String exam_name) {
		this.exam_name = exam_name;
	}

	@Id
	@Column(name = "Q_ID")
	public int getQ_id() {
		return q_id;
	}

	public void setQ_id(int q_id) {
		this.q_id = q_id;
	}

	@Column(name = "EXAM_ID")
	public int getExam_id() {
		return exam_id;
	}

	public void setExam_id(int exam_id) {
		this.exam_id = exam_id;
	}

	@Column(name = "QUESTION")
	public String getQuestion() {
		return question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	@Column(name = "OPT1")
	public String getOpt_1() {
		return opt_1;
	}

	public void setOpt_1(String opt_1) {
		this.opt_1 = opt_1;
	}

	@Column(name = "OPT2")
	public String getOpt_2() {
		return opt_2;
	}

	public void setOpt_2(String opt_2) {
		this.opt_2 = opt_2;
	}

	@Column(name = "OPT3")
	public String getOpt_3() {
		return opt_3;
	}

	public void setOpt_3(String opt_3) {
		this.opt_3 = opt_3;
	}

	@Column(name = "OPT4")
	public String getOpt_4() {
		return opt_4;
	}

	public void setOpt_4(String opt_4) {
		this.opt_4 = opt_4;
	}

	@Column(name = "CORRECT_ANS")
	public String getCorrect_answer() {
		return correct_answer;
	}

	public void setCorrect_answer(String correct_answer) {
		this.correct_answer = correct_answer;
	}

	@Column(name = "LEVEL_TYPE")
	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	@Override
	public String toString() {
		return "ExamDetails [q_id=" + q_id + ", exam_id=" + exam_id + ", level=" + level + ", question=" + question
				+ ", opt_1=" + opt_1 + ", opt_2=" + opt_2 + ", opt_3=" + opt_3 + ", opt_4=" + opt_4
				+ ", correct_answer=" + correct_answer + ", exam_name=" + exam_name + "]";
	}

}
