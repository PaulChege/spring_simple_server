package com.example.demo.domain;


import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name = "students")
@XmlRootElement(name = "student")
@XmlAccessorType(XmlAccessType.PUBLIC_MEMBER)

public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id ;
    private String firstName;
    private String lastName;
    private String regNumber;


    public Student(String firstName, String lastName, String regNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.regNumber = regNumber;
    }

    public Student() {
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }




    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
