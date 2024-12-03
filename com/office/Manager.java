package com.office;

import com.employee.EmployeeI;
import com.letter.LetterI;

public class Manager implements ManagerI{

	private final String mgrName = "smith";
	private EmployeeI emp;
	private LetterI le;

	public Manager(EmployeeI emp, LetterI le){
		this.emp = emp;
		this.le = le;
	}
	public void displayDetails(){
		System.out.println();
		System.out.println("Manager Name: "+ mgrName);
	}

	public void reviewLetter(){
		String req = emp.getLetter();
		if (req.equalsIgnoreCase("sickleave")) {
			le.setStatus("Accepted");
		}
	}
 }