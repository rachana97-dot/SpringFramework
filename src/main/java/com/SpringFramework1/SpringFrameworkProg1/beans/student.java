package com.SpringFramework1.SpringFrameworkProg1.beans;

public class student {
	private int id;
	private String name;
	private int rollno;
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
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	
	public void display() {
		System.out.println("ID = "+ id);
		System.out.println("Name = "+ name);
		System.out.println("RollNo  = "+ rollno);

	}

}
