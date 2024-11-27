package com.subha.esdfinalproj.service;

import com.subha.esdfinalproj.exception.StudentNotFoundException;
import com.subha.esdfinalproj.repo.StudentRepo;
import org.springframework.stereotype.Service;

import java.util.List;

import static java.lang.String.format;

@Service
public class StudentService {
    private final StudentRepo studentRepo;

    public StudentService(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
    }

    public List<Object[]> showAllStudents() {
        return studentRepo.showAllStudents();
    }

    public List<Object[]> showStudentsByKeyword(String keyword) {
        if (keyword == null || keyword.trim().isEmpty()) {
            throw new IllegalArgumentException("Keyword cannot be null or empty");
        }

        List<Object[]> results = studentRepo.showStudentsByKeyword(keyword);

        if (results == null || results.isEmpty()) {
            throw new StudentNotFoundException(
                    String.format("No students found for keyword: %s", keyword)
            );
        }

        return results;
    }
}
