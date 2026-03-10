package com.result.view.service;

import com.result.view.dto.StudentForm;
import com.result.view.model.Student;

public interface StudentService {
    Student saveStudent(StudentForm studentForm);
}