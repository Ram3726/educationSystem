package com.exam.educationSystem.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter


public class Student {

    private String studName;
    private String studRollNo;
    private String studEmail;
    private String studPhoneNo;
    private String studLocation;
    private float studScore;
    private long studPinCode;
    private Date studDob;


}
