package org.emailapp;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class EmailApp {
    public static void main(String[] args) {
        Email email = new Email("Rahul", "Parmar");
        System.out.println(email.showInfo());
    }
}