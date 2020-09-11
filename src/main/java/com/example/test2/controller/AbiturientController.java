package com.example.test2.controller;

import com.example.test2.domain.Abiturient;
import com.example.test2.domain.Institute;
import com.example.test2.domain.Student;
import com.example.test2.domain.TypeInstitute;
import com.example.test2.form.InstituteForm;
import com.example.test2.service.AbiturientService;
import com.example.test2.service.InstituteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.Optional;

@Controller
@RequestMapping(value = "/abiturient")
public class AbiturientController {
    @Autowired
    private AbiturientService abiturientService;
    @Autowired
    private InstituteService instituteService;

    @PostMapping   //сохранение абиткриента
    public String saveAbiturient(InstituteForm instituteForm, HttpServletRequest request, Model model) {
        Student student = (Student) request.getSession().getAttribute("student");
        Optional<Institute> instituteById = instituteService.getInstituteById(instituteForm.getInstituteId());
        TypeInstitute typeInstitute = instituteById.get().getTypeInstitute();
        int scoreInstitute = typeInstitute.getMinScore();
        String result = "У вас не хватает балов для этого института";
        if (student.getTotalScore() >= scoreInstitute) {
            abiturientService.save(Abiturient.builder().
                    student(student)
                    .institute(instituteById.get())
                    .profession(instituteForm.getProfession())
                    .build());
            result = "Вы абитуриент";
        }
        model.addAttribute("result", result);
        return "page2";
    }
}
