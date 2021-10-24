package com.example.Student.Management.System.Service.impl;

import com.example.Student.Management.System.Entity.Student;
import com.example.Student.Management.System.Repository.StudentRepository;
import com.example.Student.Management.System.Service.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentServiceIMPL implements StudentService {

    private StudentRepository studentRepository;

    public StudentServiceIMPL(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student getStudentByID(Long id) {
        return studentRepository.findById(id).get();
    }

    @Override
    public Student updateStudent(Student student) {
        return studentRepository.save(student);

    }

    @Override
    public void deleteStudentByid(Long id) {
        studentRepository.deleteById(id);
    }
}
