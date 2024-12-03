package com.main;

import com.employee.*;
import com.letter.*;
import com.office.*;

class Main {

        public static void main(String[] args){
            Employee emp = new Employee("saravanan", 4401);
            emp.writeLetter("SickLeave");

            Letter letter = new Letter(emp);
            letter.displayDetails();

            Manager mgr = new Manager(emp, letter);
            mgr.reviewLetter();
            
            System.out.println();
            letter.displayDetails();
        }
    }