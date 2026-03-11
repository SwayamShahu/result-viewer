package com.result.view.controller;

import com.result.view.dto.RequestResultForm;
import com.result.view.model.Mark;
import com.result.view.model.Student;
import com.result.view.repository.MarkRepository;
import com.result.view.repository.StudentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
public class PageController {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private MarkRepository markRepository;

    // Home Page
    @GetMapping("/")
    public String index() {
        return "index";
    }

    // Show Result Form
    @GetMapping("/view-result")
    public String viewResultPage(Model model) {

        model.addAttribute("requestResultForm", new RequestResultForm());

        return "viewResultForm";
    }

    // Process Result Request
    @PostMapping("/view-result")
    public String viewResult(
            @ModelAttribute RequestResultForm requestResultForm,
            Model model) {

        Optional<Student> studentOptional =
                studentRepository.findByRollNumberAndDob(
                        requestResultForm.getRollNumber(),
                        requestResultForm.getDob()
                );

        // If Student Not Found
        if (studentOptional.isEmpty()) {

            model.addAttribute("error", "Result not found. Please check Roll Number and DOB.");
            model.addAttribute("requestResultForm", new RequestResultForm());

            return "viewResultForm";
        }

        Student student = studentOptional.get();

        // Fetch Marks
        List<Mark> marks = markRepository.findByStudent(student);

        // Send data to Thymeleaf
        model.addAttribute("student", student);
        model.addAttribute("marks", marks);

        return "resultPage";
    }

    // Help Page
    @GetMapping("/help")
    public String help() {
        return "help";
    }
}