package com.eow.education.service;


import com.eow.education.entity.Student;
import com.eow.education.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    private StudentMapper studentMapper;

    public Student selStudent(int id)
    {
        return studentMapper.selStudent(id);
    }
}
