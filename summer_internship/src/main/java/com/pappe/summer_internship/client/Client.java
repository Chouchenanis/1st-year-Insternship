package com.pappe.summer_internship.client;

import java.time.LocalDate;

public class Client {


    private String firstname;

    private String lastname;

    private LocalDate date;

    private String email;

    private int age;

    public Client(String firstname, String lastname, LocalDate date, String email, int age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.date = date;
        this.email = email;
        this.age = age;
    }

    public Client() {}

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
