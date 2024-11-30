package com.student;
import com.letter.*;
public class Student extends Letter {
	private String name;
	private String studentId;
	private String department;
	
	// Student constructor
	public Student(String name, String studentId, String department){
		super(name);
		this.studentId = studentId;
		this.department = department;
	}
	
	// method for display student details
	@Override
	public void displayDetails(){
		System.out.println("Student Details");
		System.out.println("Name : " + name);
		System.out.println("Roll No : " + studentId);
		System.out.println("Department : " + department);
	}
	
	
	// method for writing a letter
	public void writeLetter(String content){
		Letter l = new Letter(content);
		l.displayDetails();
	}
	
	// method for givve the letter to Manager
	public String getLetter() {
		return content;
	}
}
