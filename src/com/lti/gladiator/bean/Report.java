package com.lti.gladiator.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@NamedQueries({ @NamedQuery(name = "allInfo", query = "from Report") })
@Entity
@Table(name = "REPORT")

public class Report {

	private int report_id, score, count_correct_ans, level_type, count_wrong_ans;
	private String exam_name, reg_name;

//	Default Constructor
	public Report() {
		super();
	}

//	Parameterized Constructor
	public Report(int report_id, String reg_name, int score, int count_correct_ans, int count_wrong_ans, int level_type,
			String exam_name) {
		super();
		this.report_id = report_id;
		this.reg_name = reg_name;
		this.score = score;
		this.count_correct_ans = count_correct_ans;
		this.count_wrong_ans = count_wrong_ans;
		this.level_type = level_type;
		this.exam_name = exam_name;
	}

//	Getters and Setters
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ID")
	@SequenceGenerator(name = "ID", sequenceName = "REPORT_ID_SEQ", allocationSize = 1)
	@Column(name = "REPORT_ID")
	public int getReport_id() {
		return report_id;
	}

	public void setReport_id(int report_id) {
		this.report_id = report_id;
	}

	@Column(name = "REG_NAME")
	public String getReg_name() {
		return reg_name;
	}

	public void setReg_name(String reg_name) {
		this.reg_name = reg_name;
	}

	@Column(name = "EXAM_NAME")
	public String getExam_name() {
		return exam_name;
	}

	public void setExam_name(String exam_name) {
		this.exam_name = exam_name;
	}

	@Column(name = "SCORE")
	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Column(name = "COUNT_CORRECT_ANS")
	public int getCount_correct_ans() {
		return count_correct_ans;
	}

	public void setCount_correct_ans(int count_correct_ans) {
		this.count_correct_ans = count_correct_ans;
	}

	@Column(name = "COUNT_WRONG_ANS")
	public int getCount_wrong_ans() {
		return count_wrong_ans;
	}

	public void setCount_wrong_ans(int count_wrong_ans) {
		this.count_wrong_ans = count_wrong_ans;
	}

	@Column(name = "LEVEL_TYPE")
	public int getLevel_type() {
		return level_type;
	}

	public void setLevel_type(int level_type) {
		this.level_type = level_type;
	}

}
