package com.json;

import java.util.Date;



import com.alibaba.fastjson.annotation.JSONField;

public class Person {
	@JSONField(name = "AGE",serialize=false)
	private int age;
	@JSONField(name = "FULL NAME")
	private String fullName;
	@JSONField(name = "DATE OF BIRTH",format = "dd/MM/yyyy")
	private Date dateOfBirthData;
	
	public Person(int age, String fullName, Date date) {
		super();
		this.age = age;
		this.fullName = fullName;
		this.dateOfBirthData =  date;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public Date getDateOfBirthData() {
		return dateOfBirthData;
	}

	public void setDateOfBirthData(Date dateOfBirthData) {
		this.dateOfBirthData = dateOfBirthData;
	}
	
}
