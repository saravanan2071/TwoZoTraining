package com.main;
import java.util.*;
import com.letter.Letter;
import com.office.*;
import com.student.*;

class Main {

    public static String content;
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);

		// user input for student details
        System.out.println("Enter Name: ");
        String name = sc.nextLine();
        System.out.println("Enter Roll No: ");
        String studentId = sc.nextLine();
        System.out.println("Enter Department: ");
        String department = sc.nextLine();

        Student student = new Student(name, studentId, department);
        
		// select what kind of request letter
        System.out.println("Choose the Request Purpose:");
        System.out.println("1. Sick Leave");
        System.out.println("2. Time for Fees Payment");
        System.out.println("3. On Duty");
        System.out.println();
        int choice = sc.nextInt();
		
        switch (choice) {
            case 1:
                content = "Sick Leave";
                break;
            case 2:
                content = "Need Time for fees Payment";
                break;
            case 3:
                content = "on Duty";
                break;
            default:
            	content = "other";
                System.out.println("Invalid request type. Defaulting to 'Other'.");
                break;
        }

        
        // letter Written by student
        student.writeLetter(content);
		System.out.println();
		
		// Manager get the Letter from Student and review it
        Manager m = new Manager(student);
		
        Thread.sleep(2000); // 2 seconds delay for manager Response
        m.reviewLetter(content);
        System.out.println();
		
		// status about the Letter
        Letter requestLetter = new Letter(content);
        requestLetter.displayDetails();
        
        sc.close();
    }
}
