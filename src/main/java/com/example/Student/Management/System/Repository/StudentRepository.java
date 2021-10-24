package com.example.Student.Management.System.Repository;

import com.example.Student.Management.System.Entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long> {

}
