package com.example.Student.Management.System.Service;

import com.example.Student.Management.System.Entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();

    Student saveStudent(Student student);

    Student getStudentByID(Long id);

    Student updateStudent(Student student);

    void deleteStudentByid(Long id);
}
