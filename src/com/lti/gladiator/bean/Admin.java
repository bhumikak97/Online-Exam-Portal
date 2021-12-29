package com.lti.gladiator.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ADMIN")
public class Admin {

	private int adm_id;
	private String adm_name,adm_email,adm_password;
	
//	Parameterized Constructor
	public Admin(int adm_id, String adm_name, String adm_email, String adm_password) {
		super();
		this.adm_id = adm_id;
		this.adm_name = adm_name;
		this.adm_email = adm_email;
		this.adm_password = adm_password;
	}
	
//	Default Constructor
	public Admin() {
		super();
	}
	
//	getters and setters
	@Id
	@Column(name="ADM_ID")
	public int getAdm_id() {
		return adm_id;
	}
	public void setAdm_id(int adm_id) {
		this.adm_id = adm_id;
	}
	
	@Column(name="ADM_NAME")
	public String getAdm_name() {
		return adm_name;
	}
	public void setAdm_name(String adm_name) {
		this.adm_name = adm_name;
	}
	
	@Column(name="ADM_EMAIL")
	public String getAdm_email() {
		return adm_email;
	}
	public void setAdm_email(String adm_email) {
		this.adm_email = adm_email;
	}
	
	@Column(name="ADM_PASSWORD")
	public String getAdm_password() {
		return adm_password;
	}
	public void setAdm_password(String adm_password) {
		this.adm_password = adm_password;
	}
	
	
}
