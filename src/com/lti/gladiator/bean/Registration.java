package com.lti.gladiator.bean;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


//@NamedQueries({
//	@NamedQuery(name="allReg", query="from REGISTRATION")
//})
@Entity
@Table(name="REGISTRATION")
public class Registration {

	
	private int reg_id;
	private String reg_name,email_id,password,confirm_password,mob_no,city,state,qualification,year_of_completion;
	private Date dob;
	public Registration() {
		super();
	}
	public Registration(int reg_id, String reg_name, String email_id, String password, String confirm_password,
			String mob_no, String city, String state, String qualification, String year_of_completion, Date dob) {
		super();
		this.reg_id = reg_id;
		this.reg_name = reg_name;
		this.email_id = email_id;
		this.password = password;
		this.confirm_password = confirm_password;
		this.mob_no = mob_no;
		this.city = city;
		this.state = state;
		this.qualification = qualification;
		this.year_of_completion = year_of_completion;
		this.dob = dob;
	}
	
//	Getters and Setter
	@Column(name="REG_ID")
	public int getReg_id() {
		return reg_id;
	}
	public void setReg_id(int reg_id) {
		this.reg_id = reg_id;
	}
	
	@Column(name="REG_NAME")
	public String getReg_name() {
		return reg_name;
	}
	public void setReg_name(String reg_name) {
		this.reg_name = reg_name;
	}
	
	@Id
	@Column(name="EMAIL_ID")
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
	
	@Column(name="PASSWORD")
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Column(name="CONFIRM_PASSWORD")
	public String getConfirm_password() {
		return confirm_password;
	}
	public void setConfirm_password(String confirm_password) {
		this.confirm_password = confirm_password;
	}
	
	@Column(name="MOB_NO")
	public String getMob_no() {
		return mob_no;
	}
	public void setMob_no(String mob_no) {
		this.mob_no = mob_no;
	}
	
	@Column(name="CITY")
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	@Column(name="STATE")
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	@Column(name="QUALIFICATION")
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	
	@Column(name="YEAR_OF_COMPLETION")
	public String getYear_of_completion() {
		return year_of_completion;
	}
	public void setYear_of_completion(String year_of_completion) {
		this.year_of_completion = year_of_completion;
	}
	
	@Temporal(TemporalType.DATE)
	@Column(name="DOB")
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	
	
}
