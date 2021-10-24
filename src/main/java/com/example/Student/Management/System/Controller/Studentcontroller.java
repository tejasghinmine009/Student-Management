package com.example.Student.Management.System.Controller;

import com.example.Student.Management.System.Entity.Student;
import com.example.Student.Management.System.Service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class Studentcontroller {

    private StudentService studentService;

    public Studentcontroller(StudentService studentService) {
        this.studentService = studentService;
    }

    //handler method to handle list students and return mode and view
    @GetMapping("/students")
    public String listStudents(Model model){
        model.addAttribute("students",studentService.getAllStudents());
        return "students";
    }

    @GetMapping("/students/new")
    public String createStudentForm(Model model){

        //create student object to hold student from data
        Student student = new Student();
        model.addAttribute("student",student);
        return "create_student";
    }

    @PostMapping("/students")
    public String savestudent(@ModelAttribute("student") Student student){
        studentService.saveStudent(student);
        return "redirect:/students";
    }

    @GetMapping("/students/edit/{id}")
    public String editStudentForm(@PathVariable Long id,Model model){
        model.addAttribute("student",studentService.getStudentByID(id));
        return "edit_student";
    }

    @PostMapping("/students/{id}")
    public String updateStudent(@PathVariable Long id,@ModelAttribute("student") Student student,Model model){
        //get student form database  by id
        Student existingstudent =studentService.getStudentByID(id);
        existingstudent.setId(id);
        existingstudent.setFirstName(student.getFirstName());
        existingstudent.setLastName(student.getLastName());
        existingstudent.setEmail(student.getEmail());

        //save the updated student
        studentService.updateStudent(existingstudent);
        return "redirect:/students";
    }

    //handler method to delete students request
    @GetMapping("/students/{id}")
    public String deleteStudent(@PathVariable Long id){
        studentService.deleteStudentByid(id);
        return "redirect:/students";
    }

}
