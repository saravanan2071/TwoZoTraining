package com.office;
import com.letter.*;
import com.student.Student;
public class Manager extends Thread{
	// object type of student class for the manager identify the student
	public Student s;
	
	//manager class constructor
	public Manager(Student s) {
		this.s= s;
	}
	
	private final String managerName = "smith";
	
	// method for review the letter recived from the Student
	public void reviewLetter(String content) {
		// create the object for set about the status of the letter
		Letter letterStatus = new Letter(content);
		
		
			if(content.equalsIgnoreCase("Sick Leave")) {
				letterStatus.setStatus("Approved");
				System.out.println("Letter is Approved by " + managerName);
			}
			else if(content.equalsIgnoreCase("Need Time for fees Payment")) {
				letterStatus.setStatus("Approved");
				System.out.println("Letter is Approved by " + managerName);
			}
			else if(content.equalsIgnoreCase("on Duty")) {
				letterStatus.setStatus("Approved");
				System.out.println("Letter is Approved by " + managerName);
			}
			else{
				letterStatus.setStatus("Rejected");
				System.out.println("Letter is Rejected by " + managerName);
			}
	}
 }