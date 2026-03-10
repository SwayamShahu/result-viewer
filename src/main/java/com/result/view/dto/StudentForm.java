package com.result.view.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class StudentForm {

    private String id;

    @NotBlank(message = "Name cannot be blank")
    private String name;

    @NotBlank(message = "Roll number cannot be blank")
    private String rollNumber;

    @Email(message = "Invalid Email")
    private String email;

    @NotBlank(message = "Address cannot be blank")
    private String address;

    @NotBlank(message = "School name cannot be blank")
    private String schoolName;

    private String profilePhoto;

    @NotNull(message = "DOB is required")
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate dob;

    @NotBlank(message = "Standard is required")
    private String standard;

    @NotBlank(message = "Father name is required")
    private String fatherName;

    @NotBlank(message = "Gender is required")
    private String gender;

    @NotBlank(message = "Password cannot be blank")
    private String password;

    // FIXED HERE
    private List<MarksForm> marks = new ArrayList<>();
}