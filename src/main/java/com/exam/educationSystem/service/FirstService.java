package com.exam.educationSystem.service;

import com.exam.educationSystem.entity.StudentTable;
import com.exam.educationSystem.model.Student;
import com.exam.educationSystem.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FirstService {
    @Autowired
    StudentRepository studentRepository;

    public String saveData(Student student) {
        StudentTable studentTable = new StudentTable();
        studentTable.setStudName(student.getStudName());

        //RollNumber  Validation
        if(validateRollNo(student.getStudRollNo())){//if true
            studentTable.setStudRollNo(student.getStudRollNo());
        }else{//if false
            return "Student roll Number is not proper, Please recheck!!";

        }


        try {
            studentRepository.save(studentTable);
        }catch (Exception e) {
            System.err.println("Error details " + e.getMessage());

        }
        return "successful";
        }

        private boolean validateRollNo(String rollNo){

        if(rollNo!=null && rollNo.length()==10
                && rollNo.startsWith("STD")
                && ("ED").equals(rollNo.substring(rollNo.length()-2))){//
            return true;
        }

        return false;
        }


}

//Date'12/12/2022' Date format

//1. Student Roll number should be of 10 character and starts with 'STD' and last 2 character
// should be 'ED'. If in case given condition failed then should show
// error message to postman console as 'Student roll Number is not proper, Please recheck!!';