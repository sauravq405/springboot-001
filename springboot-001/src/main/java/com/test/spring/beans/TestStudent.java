package com.test.spring.beans;

public class TestStudent {
	
	private int id;
	private String name;
	private double percentage;
	
	protected TestStudent() {
		super();
	}
	
	public TestStudent(int id, String name, double percentage) {
		super();
		this.id = id;
		this.name = name;
		this.percentage = percentage;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
		return "TestStudent [id=" + id + ", name=" + name + ", percentage=" + percentage + "]";
	}
	
}
