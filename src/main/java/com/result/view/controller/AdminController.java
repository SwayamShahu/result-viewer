package com.result.view.controller;

import com.result.view.dto.StudentForm;
import com.result.view.service.StudentService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/admin")
public class AdminController {

    private final StudentService studentService;

    public AdminController(StudentService studentService) {
        this.studentService = studentService;
    }

    private List<String> getStandardOptions(){
        return List.of(
                "Class 1","Class 2","Class 3","Class 4","Class 5",
                "Class 6","Class 7","Class 8","Class 9","Class 10"
        );
    }

    @GetMapping("/add-result")
    public String addResultForm(Model model) {

        model.addAttribute("studentForm", new StudentForm());
        model.addAttribute("standardOptions", getStandardOptions());

        return "admin/addResultForm";
    }

    @PostMapping("/add-result")
    public String saveResult(
            @Valid @ModelAttribute StudentForm studentForm,
            BindingResult result,
            Model model
    ) {

        if(result.hasErrors()){
            model.addAttribute("standardOptions", getStandardOptions());
            return "admin/addResultForm";
        }

        studentService.saveStudent(studentForm);

        model.addAttribute("successMessage","Student Saved Successfully");
        model.addAttribute("studentForm", new StudentForm());
        model.addAttribute("standardOptions", getStandardOptions());

        return "admin/addResultForm";
    }
}