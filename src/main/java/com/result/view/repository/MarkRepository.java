package com.result.view.repository;

import com.result.view.model.Mark;
import com.result.view.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MarkRepository extends JpaRepository<Mark, Long> {
    List<Mark> findByStudent(Student student);
}
