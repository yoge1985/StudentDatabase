package com.joelGefen;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //prompt user to enter number of new students enrolling
        System.out.print("enter number of new students:");
        Scanner scanner = new Scanner(System.in);
        int numOfStudents = scanner.nextInt();
        scanner.nextLine();
        Student[] students = new Student[numOfStudents];

        for (int i = 0; i < students.length; i++){
            students[i] = new Student();
            students[i].enroll();
            students[i].payTuition();

        }
        System.out.println("==================================");

        for (int i = 0; i < students.length; i++){
            System.out.println(students[i].details());
        }



    }
}
