package com.joelGefen;

import java.util.Scanner;

public class Student {

    private String firstName;
    private String lastName;
    private int gradeYear;
    private String courses;
    private static int courseCost = 600;
    private int tuitionFee;
    private String studentID;
    private static int id = 1000;

    public Student() {

        //prompt user to provide first name, last name and grade year
        System.out.print("enter student first name:");
        Scanner scanner = new Scanner(System.in);
        this.firstName = scanner.nextLine();

        System.out.print("enter student last name:");
        this.lastName = scanner.nextLine();

        System.out.print("enter student grade year (1-3):");
        this.gradeYear = scanner.nextInt();
        scanner.nextLine();

        setStudentID();
        System.out.println(details());

    }


        public void enroll(){
        boolean quit = false;
        while (!quit){
            System.out.println("choose course to enrol:\n 1 maths\n 2 english\n 3 science\n 4 quit");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 1:
                    courses += " maths";
                    tuitionFee += courseCost;
                    break;
                case 2:
                    courses += " english";
                    tuitionFee += courseCost;
                    break;
                case 3:
                    courses += " science";
                    tuitionFee += courseCost;
                    break;
                case 4:
                    quit = true;
                    break;
            }
        }

        System.out.println("courses selected: " + courses +
                "\ntuition fee: " + tuitionFee);


    }

    //unique student ID, 5-digits starting with grade year + ID
    private void setStudentID(){

        id++;
        this.studentID = gradeYear + "" + id;

    }

    //pay tuition
    public void payTuition(){

        System.out.print("how much are you paying £:");
        Scanner scanner = new Scanner(System.in);
        int amount = scanner.nextInt();
        tuitionFee = tuitionFee - amount;
        System.out.println("your new Balance: " + viewBalance());



    }

    //view balance
    public int viewBalance(){
        return tuitionFee;
    }

    //view all the student's details
    public String details(){

        return firstName + " " + lastName + " " + studentID + " " + tuitionFee;
    }
}
