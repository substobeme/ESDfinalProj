package com.subha.esdfinalproj.repo;

import com.subha.esdfinalproj.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepo extends JpaRepository<Student, Long> {

    @Query(value = "select s.first_name,s.last_name,s.email,case when" +
            " exists(select 1 from placement_student p where s.id = p.student_id) then 'Placed' else " +
            "'Unplaced' end as placement_status" + " from students s" ,nativeQuery = true)
    public List<Object[]> showAllStudents();

    @Query(value = "select " +
            "s.first_name ,s.last_name,d.program,p.organisation,ao.organisation,s.graduation_year, " +
            "case " +
            "when exists(select 1 from alumni a where s.id = a.student_id) then 'Yes' " +
            "else 'No' " +
            "end as isAlumni, " +
            "case " +
            "when exists(select 1 from placement_student p where p.student_id = s.id) then 'Placed' " +
            "else 'Unplaced' " +
            "end as is_placed " +
            "from students s join domains d " +
            "on s.domain_id = d.id " +
            "left join placement_student ps " +
            "on ps.sid = s.id " +
            "left join placement p " +
            "on p.id = ps.placement_id " +
            "left join alumni a " +
            "on a.id = s.id " +
            "left join alumni_organisation ao " +
            "on a.id = ao.alumni_id " +
            "where " +
            "(lower(p.org) like concat('%',lower(:keyword),'%')) or " +
            "(lower(ao.organisation) like concat('%',lower(:keyword),'%')) or " +
            "(s.graduation_year = :keyword) or " +
            "(lower(d.program) like concat('%',lower(:keyword),'%')) " +
            "order by s.first_name",nativeQuery = true)
    public List<Object[]> showStudentsByKeyword(String keyword);
}
