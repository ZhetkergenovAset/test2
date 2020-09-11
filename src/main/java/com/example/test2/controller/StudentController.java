package com.example.test2.controller;

import com.example.test2.domain.Institute;
import com.example.test2.domain.Student;
import com.example.test2.form.InstituteForm;
import com.example.test2.form.StudentForm;
import com.example.test2.service.InstituteService;
import com.example.test2.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


import javax.servlet.http.HttpServletRequest;
import java.util.Optional;

@Controller
public class StudentController {
    @Autowired
    private StudentService studentService;
    @Autowired
    private InstituteService instituteService;

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String methodGet(Model model){
        StudentForm studentForm=new StudentForm();
        model.addAttribute("studentForm",studentForm);
        return "index";
    }

    @RequestMapping(value = {"/student"},method = RequestMethod.GET)
    public String findStudent(StudentForm studentForm, Model model, HttpServletRequest request){
        Optional<Student> student=studentService.getStudentByNameAndLastName(studentForm.getFirstName(),studentForm.getLastName());
        if(student.isEmpty()){
            return "index";
        }
        model.addAttribute("student",student.get());
        request.getSession().setAttribute("student",student.get());
        return "index";
    }

    @RequestMapping(value = {"/page2"},method = RequestMethod.GET)
    public String showPage2(Model model){
        InstituteForm instituteForm=new InstituteForm();
        model.addAttribute("instituteForm",instituteForm);
        model.addAttribute("institutes",instituteService.getAllInstitute());

        return "page2";
    }

}
