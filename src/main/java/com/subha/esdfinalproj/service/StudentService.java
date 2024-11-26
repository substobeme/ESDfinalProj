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
        List<Object[]> objects =  studentRepo.showStudentsByKeyword(keyword);
        if(objects == null)
        {
            throw  new StudentNotFoundException(String.format("Student with keyword %s not found", keyword));
        }
        return objects;
    }
}
