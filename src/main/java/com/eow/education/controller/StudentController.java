package com.eow.education.controller;

import com.eow.education.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping("getStudent/{id}")
    public String getStudent(@PathVariable int id)
    {
        return studentService.selStudent(id).toString();
    }
}
