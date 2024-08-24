package org.studentdbapp;

import java.util.Scanner;

public class Student {
    private String name;
    private int year;
    private int grade;
    private String[] coursesEnrolled;
    private int balance;
    private String studentId;
    private static int id = 1000;
    private String courses = "";
    private static int courseFee = 600;
    public Student() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter student name: ");
        this.name = sc.nextLine();
        System.out.println("Enter year: ");
        this.year = sc.nextInt();
        System.out.println("Enter grade: \n1 Preschool \n2 Nursery \n3 Primary \n4 Secondary");
        this.grade = sc.nextInt();
        getStudentId();
        System.out.println("Enter the subjects to enroll, Q to quit : ");
        enrollToCourses();
        System.out.println("Enter the tution fee you want to pay : ");
        payTutionFee(sc.nextInt());
    }

    //Generate an ID
    public String getStudentId(){
        id++;
        studentId = this.grade + String.valueOf(id);
        return studentId;
    }

    //Enroll in Courses
    public void enrollToCourses(){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        while(!input.equals("Q")){
            courses += input + " ";
            balance += courseFee;
            System.out.println("Enter the subjects to enroll, Q to quit : ");
            input = sc.nextLine();
        }
    }

    //Pay the tution Fees
    public void payTutionFee(int amount){
        balance-=amount;
    }

    //Show the info
    public String toString(){
        return "Name: " + name + " StudentId: " + studentId +
                " CoursesEnrolled: " + courses + " Balance: " + balance;
    }

}
