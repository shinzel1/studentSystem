package com.sac.studentsystem.controller;

import com.sac.studentsystem.model.Student;
import com.sac.studentsystem.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/student")
@CrossOrigin
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping(value = "/add")
    public String add(@RequestBody Student student) {
        studentService.saveStudent(student);
        return "new Student is added";
    }

    @GetMapping(value = "/getAll")
    public List<Student> getAllStudents() {
        return studentService.getAllStudent();
    }

    @DeleteMapping(value = "/delete/{id}")
    public String deleteStudent(@PathVariable Integer id) {
        Student student = studentService.getStudent(id);
        if(student !=null) {
            studentService.deleteStudent(student);
            return "student Deleted with Id " + id;
        }else {
            return "student with Id " + id + " not Found";

        }
    }

}
