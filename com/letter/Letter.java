package com.letter;
import java.util.Date;

import com.employee.EmployeeI;
public class Letter implements LetterI{

	private EmployeeI emp;
	private String letter;
	private static String status = "Pending";
	private static Date date = new Date();

	public Letter(EmployeeI emp){
		this.emp = emp;
	}
	
	public void setStatus(String status){
		Letter.status = status;
	}
	
	public void displayDetails(){
		letter = emp.getLetter();
		System.out.println();
		System.out.println("Letter Details");
		System.out.println("---------------");
		System.out.println("Letter : " + letter);
		System.out.println("Status : " + status);
		System.out.println("Date : " + date);
	}
}