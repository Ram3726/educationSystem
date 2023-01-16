package com.exam.educationSystem.controller;

import com.exam.educationSystem.model.Student;
import com.exam.educationSystem.service.FirstService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/studentController")

public class StudentController {
    @Autowired
    FirstService firstService;

    @GetMapping("/test")
    public String test(){
        return "test";
    }


    @PostMapping("/save")
    public String save(@RequestBody Student student){
       String returnMsg = this.firstService.saveData(student);

        return returnMsg;
    }



}
