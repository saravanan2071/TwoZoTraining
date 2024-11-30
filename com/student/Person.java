package com.student;

public abstract class Person {
	protected final String name;
	
	public Person(String name){
		this.name = name;
	}
	
	public abstract void displayDetails();
}
