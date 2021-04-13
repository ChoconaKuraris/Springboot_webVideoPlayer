package com.eow.education.mapper;


import com.eow.education.entity.Student;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentMapper {
    Student selStudent(int id);
}
