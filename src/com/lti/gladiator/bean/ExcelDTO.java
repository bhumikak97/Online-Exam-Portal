package com.lti.gladiator.bean;

import org.springframework.web.multipart.MultipartFile;

public class ExcelDTO {

	private MultipartFile file;

//		Parameterized Constructor
	public ExcelDTO(MultipartFile file) {
		super();
		this.file = file;
	}

//		Default Constructor
	public ExcelDTO() {
		super();
	}
//	Getters and Setter
	public MultipartFile getFile() {
		return file;
	}

	public void setFile(MultipartFile file) {
		this.file = file;
	}

}
