package com.subha.esdfinalproj.repo;

import com.subha.esdfinalproj.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepo extends JpaRepository<Student, Long> {

    @Query(value = """
            SELECT
                s.first_name,
                s.last_name,
                d.program ,
                sp.code,
                sp.description,
                ao.organisation,
                ao.join_date,
                ao.leave_date,
                ao.position,
                s.graduation_year,
                CASE
                    WHEN EXISTS (SELECT 1 FROM alumni a WHERE a.student_id = s.id) THEN 'Yes'
                    ELSE 'No'
                END AS isAlumni,
                CASE
                    WHEN EXISTS (SELECT 1 FROM placement_student ps WHERE ps.student_id = s.id) THEN 'Placed'
                    ELSE 'Unplaced'
                END AS is_placed
            FROM
                students s
            JOIN
                domains d ON s.domain_id = d.id
            LEFT JOIN
                placement_student ps ON ps.student_id = s.id
            LEFT JOIN
                placement p ON p.id = ps.placement_id
            LEFT JOIN
                alumni a ON a.student_id = s.id
            LEFT JOIN
                alumni_organisation ao ON ao.alumni_id = a.id
            LEFT JOIN
                specialisation sp ON s.specialisation_id = sp.id
            ORDER BY
                s.first_name;
            """, nativeQuery = true)
    public List<Object[]> showAllStudents();
    @Query(value = """
            SELECT
                s.first_name,
                s.last_name,
                d.program ,
                sp.code ,
                sp.description,
                ao.organisation ,
                ao.join_date,
                ao.leave_date,
                ao.position,
                s.graduation_year,
                CASE
                    WHEN EXISTS (SELECT 1 FROM alumni a WHERE a.student_id = s.id) THEN 'Yes'
                    ELSE 'No'
                END AS isAlumni,
                CASE
                    WHEN EXISTS (SELECT 1 FROM placement_student ps WHERE ps.student_id = s.id) THEN 'Placed'
                    ELSE 'Unplaced'
                END AS is_placed
            FROM
                students s
            JOIN
                domains d ON s.domain_id = d.id
            LEFT JOIN
                placement_student ps ON ps.student_id = s.id
            LEFT JOIN
                placement p ON p.id = ps.placement_id
            LEFT JOIN
                alumni a ON a.student_id = s.id
            LEFT JOIN
                alumni_organisation ao ON ao.alumni_id = a.id
            LEFT JOIN
                specialisation sp ON s.specialisation_id = sp.id
            WHERE
                (LOWER(ao.organisation) LIKE CONCAT('%', LOWER(:keyword), '%') OR
                s.graduation_year = CAST(:keyword AS SIGNED) OR
                LOWER(d.program) =  LOWER(:keyword) OR
                LOWER(s.first_name) LIKE CONCAT('%', LOWER(:keyword), '%') OR
                LOWER(s.last_name) LIKE CONCAT('%', LOWER(:keyword), '%') OR
                LOWER(sp.code) LIKE CONCAT('%', LOWER(:keyword), '%')
                    OR
                LOWER(ao.position) LIKE CONCAT('%', LOWER(:keyword), '%'))
            ORDER BY
                s.first_name;
            """, nativeQuery = true)
    public  List<Object[]> showStudentsByKeyword(String keyword);
}
