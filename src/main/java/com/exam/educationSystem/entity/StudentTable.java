package com.exam.educationSystem.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@Entity

@Table(name = "Student_Information")

public class StudentTable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer sId;

    @Column(name = "stud_Name")
    private String studName;

    @Column(name = "stud_RollNo")
    private String studRollNo;

    @Column(name = "stud_Email")
    private String studEmail;

    @Column(name="studPhoneNo")
    private String studPhoneNo;

    @Column(name = "stud_Location" )
    private String studLocation;

    @Column(name = "studScore")
    private float studScore;

    @Column(name = "stud_PinCode")
    private long studPinCode;

    @Column(name = "stud_Dob")
    private Date studDob;




}

