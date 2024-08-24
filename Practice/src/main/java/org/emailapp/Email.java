package org.emailapp;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String email;
    private String department;
    private String password;
    private String altEmail;
    private int mailBoxCapacity = 500;
    private int defaultPasswordLength = 8;

    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = getDepartment();
        System.out.println("Department : " + department);
        this.password = getPassword(defaultPasswordLength);
        System.out.println("Password : " + password);
        this.email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department.toLowerCase() + "." + "aeycompany.com";
        System.out.println("Email : " + email);
    }

    public String getPassword(int length) {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ123456789@#$%";
        char[] password = new char[length];
        for (int i = 0; i < length; i++) {
            int random = (int)(Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(random);
        }
        return new String(password);
    }

    public String getDepartment() {
        System.out.println("Choose the department : /n1. Sales /n2 Engineering /n3. HR");
        Scanner sc = new Scanner(System.in);
        int dept = Integer.parseInt(sc.nextLine());
        switch (dept) {
           case 1: return "Sales";
           case 2: return "Engineering";
           case 3: return "HR";
           default: return "";
        }
    }


    public void setNewPassword(String password) {
        this.password = password;
    }

    public void setAltEmail(String altEmail) {
        this.altEmail = altEmail;
    }

    public void setMailBoxCapacity(int capacity) {
        this.mailBoxCapacity = capacity;
    }

    public String getEmail() {return email;}
    public String getPassword() {return password;}

    public String showInfo(){
        return firstName + " " + lastName + " " + email + " " + mailBoxCapacity;
    }

}
