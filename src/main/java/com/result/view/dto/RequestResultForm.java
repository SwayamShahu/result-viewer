package com.result.view.dto;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class RequestResultForm {

    private String rollNumber;

    private LocalDate dob;

}