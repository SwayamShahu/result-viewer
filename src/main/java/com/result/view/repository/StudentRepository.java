package com.result.view.repository;

import com.result.view.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.Optional;

public interface StudentRepository extends JpaRepository<Student, String> {
    Optional<Student> findByName(String name);
    Optional<Student> findByEmail(String email);
    Optional<Student> findByNameAndPassword(String name, String password);

    Optional<Student> findByRollNumber(String rollNumber);
    Optional<Student> findByRollNumberAndPassword(String rollNumber, String password);
    Optional<Student> findByRollNumberAndDob(String rollNumber, LocalDate dob);

}
