package com.demo.spring.beans;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TestStudent {
	
	@Id
	@Column(name = "id")
	private Integer studId;
	private String name;
	private double percentage;
	
	protected TestStudent() {
		super();
	}
	
	public TestStudent(Integer id, String name, double percentage) {
		super();
		this.studId = id;
		this.name = name;
		this.percentage = percentage;
	}

	public Integer getId() {
		return studId;
	}

	public void setId(Integer id) {
		this.studId = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

	@Override
	public String toString() {
		return "TestStudent [id=" + studId + ", name=" + name + ", percentage=" + percentage + "]";
	}
	
}
