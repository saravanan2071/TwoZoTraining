package com.office;

import com.employee.EmployeeI;
import com.letter.LetterI;

public class Manager implements ManagerI{

	private final String mgrName = "smith";
	private EmployeeI emp;
	private LetterI letterI;

	public Manager(EmployeeI emp, LetterI letterI){
		this.emp = emp;
		this.letterI = letterI;
	}
	public void displayDetails(){
		System.out.println();
		System.out.println("Manager Name: "+ mgrName);
	}

	public void reviewLetter(){
		String req = emp.getLetter();
		if (req.equalsIgnoreCase("sickleave")) {
			letterI.setStatus("Accepted");
		}
		else{
			letterI.setStatus("rejected");
		}
	}
 }