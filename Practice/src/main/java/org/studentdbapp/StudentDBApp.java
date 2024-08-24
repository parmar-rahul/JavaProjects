package org.studentdbapp;

import java.util.Scanner;

public class StudentDBApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of students: ");
        int n = sc.nextInt();
        Student[] students = new Student[n];
        for (int i = 0; i < n; i++) {
            students[i] = new Student();
        }
        for (int i = 0; i < n; i++) {
            System.out.println(students[i].toString());
        }
    }
}
