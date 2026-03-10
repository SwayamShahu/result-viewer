package com.result.view.service.impl;

import com.result.view.dto.MarksForm;
import com.result.view.dto.StudentForm;
import com.result.view.model.Mark;
import com.result.view.model.Student;
import com.result.view.repository.StudentRepository;
import com.result.view.service.StudentService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public Student saveStudent(StudentForm form) {

        Student student = Student.builder()
                .name(form.getName())
                .rollNumber(form.getRollNumber())
                .email(form.getEmail())
                .address(form.getAddress())
                .schoolName(form.getSchoolName())
                .profilePhoto(form.getProfilePhoto())
                .dob(form.getDob())
                .standard(form.getStandard())
                .fatherName(form.getFatherName())
                .gender(form.getGender())
                .password(form.getPassword())
                .build();

        List<Mark> markList = new ArrayList<>();

        if (form.getMarks() != null) {

            for (MarksForm m : form.getMarks()) {

                Mark mark = new Mark();

                mark.setSubjectName(m.getSubjectName());
                mark.setMarks(m.getMarks());
                mark.setMaxMarks(m.getMaxMarks());
                mark.setGrade(m.getGrade());
                mark.setFeedback(m.getFeedback());

                // set relationship
                mark.setStudent(student);

                markList.add(mark);
            }
        }

        student.setMarks(markList);

        return studentRepository.save(student);
    }
}