package com.employee;
//import com.letter.*;
public class Employee implements EmployeeI{

    public String empName;
    public int empId;
    String letter;

    public Employee(String name, int id){
        empName = name;
        empId = id;
    }
    public void displayDetails(){
        System.out.println();
        System.out.println("employee name: "+empName);
        System.out.println("employee id: "+empId);
    }

    public void writeLetter(String letter){
        this.letter = letter;
    }

    public String getLetter(){
        return  letter;
    }
}
