package com.example.Student.Management.System;

import com.example.Student.Management.System.Entity.Student;
import com.example.Student.Management.System.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception {
//		Student s1 =new Student("Tejas","Ghinmine","tejasghinmie@gmail.com");
//		studentRepository.save(s1);
//
//		Student s2 =new Student("Raju","Ghinmine","rghinmie@gmail.com");
//		studentRepository.save(s2);
//
//		Student s3 =new Student("Bharati","Ghinmine","bghinmie@gmail.com");
//		studentRepository.save(s3);
	}
}
