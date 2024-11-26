package com.subha.esdfinalproj.mapper;

import com.subha.esdfinalproj.dto.StudentRequest;
import com.subha.esdfinalproj.dto.StudentResponse;
import com.subha.esdfinalproj.entity.Student;
import org.springframework.stereotype.Service;

@Service
public class StudentMapper {
    public Student toStudent(StudentRequest request) {
        return Student.builder()
                .firstName(request.firstName())
                .lastName(request.lastName())
                .email(request.email())
                .domain(request.domain())
                .credits(request.credits())
                .cgpa(request.cgpa())
                .gradYear(request.gradYear())
                .organization(request.organization())
                .specialisation(request.specialisation())
                .rollno(request.rollno())
                .placement(request.placement())
                .photoPath(request.photo_path())
                .build();
    }

    public StudentResponse toStudentResponse(Student student) {
        return new StudentResponse(student.getFirstName(), student.getLastName(), student.getEmail(), student.getDomain(), student.getGradYear(), student.getOrganization(), student.getSpecialisation());
    }
}
