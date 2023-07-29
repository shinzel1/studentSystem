package com.sac.studentsystem.service;

import com.sac.studentsystem.model.Student;
import com.sac.studentsystem.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImp implements StudentService {
    @Autowired
    private StudentRepository studentRepository;
    @Override
    public Student saveStudent(Student student){
        return studentRepository.save(student);
    }

    @Override
    public List<Student> getAllStudent() {
        return studentRepository.findAll();
    }

    @Override
    public void deleteStudent(Student  student) {
        studentRepository.delete(student);
    }
    @Override
    public Student getStudent(Integer id){
        return studentRepository.findById(id).orElse(null);

    }
}
