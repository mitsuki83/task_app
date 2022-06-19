package com.example.demo.form;

import javax.validation.constraints.Size;

public class Form {

	@Size(min=1, max=10, message="input 1 to 10")
	private String title;
    private String detail;
	
	public Form() {
		// TODO Auto-generated constructor stub
	}

	public String getTitle() {return title;}

	public void setTitle(String title) {this.title = title;}

    public String getDetail() {return detail;}

	public void setDetail(String detail) {this.detail = detail;}

}
