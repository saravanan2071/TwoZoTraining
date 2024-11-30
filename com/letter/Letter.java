package com.letter;
import java.util.Date;
public class Letter{
	protected final String content;
	private static String status = "Pending";
	private static Date date = new Date();
	
	// Letter class constructor
	public Letter(String content){
		this.content = content;
	}

	//  method for set status by the Manager
	public void setStatus(String status){
		Letter.status = status;
	}

	// method for display the details about the current status of the letter
	public void displayDetails(){
		System.out.println("Letter Details");
		System.out.println("Letter : " + content);
		System.out.println("Status : " + status);
		System.out.println("Date : " + date);
	}
}