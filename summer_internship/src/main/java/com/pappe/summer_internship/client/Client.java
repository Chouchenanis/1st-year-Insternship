package com.pappe.summer_internship.client;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;

@Entity
@Table(name = "Client")
public class Client {

    @Id
    @GeneratedValue
    private Integer id;

    @NotBlank(message = "First name is required")
    @Size(max = 100)
    private String firstname;

    @NotBlank(message = "Last name is required")
    @Size(max = 100)
    private String lastname;

    @NotBlank(message = "The birth date is required")
    @NotNull
    private String birthDate;

    @Email(message = "Email should be valid")
    private String email;

    private String civilState;

    @NotBlank(message = "The cin is required")
    private String cin;

    @NotBlank(message = "The phone number is required")
    private String phone;

    private String gender ;

    private LocalDate creationDate;

    private LocalDate updateDate;


    public Client(Integer id, String firstname, String lastname, String birthDate, String email, String civilState, String cin, String phone, String gender,LocalDate creationDate, LocalDate updateDate) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthDate = birthDate;
        this.email = email;
        this.civilState = civilState;
        this.cin = cin;
        this.phone = phone;
        this.gender = gender;
        this.creationDate = creationDate;;
        this.updateDate = updateDate;
    }

    public Client() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String date) {
        this.birthDate = date;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCivilState() {
        return civilState;
    }

    public void setCivilState(String civilState) {
        this.civilState = civilState;
    }

    public String getCin() {
        return cin;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }

    public LocalDate getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(LocalDate updateDate) {
        this.updateDate = updateDate;
    }
}
