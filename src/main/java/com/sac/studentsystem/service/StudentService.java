package com.sac.studentsystem.service;

import com.sac.studentsystem.model.Student;

import java.util.List;
import java.util.Optional;

public interface StudentService {
    public Student saveStudent(Student student);
    public List<Student> getAllStudent();
    public void deleteStudent(Student student);
    public Student getStudent(Integer id);
}
