
ALTER TABLE alumni_organization
    ADD CONSTRAINT fk_alumni_organization_organization
        FOREIGN KEY (organization) REFERENCES organisation(id);

ALTER TABLE alumni_organization
    ADD CONSTRAINT fk_alumni_organization_alumni_id
        FOREIGN KEY (alumni_id) REFERENCES alumni(id);


ALTER TABLE alumni
    ADD CONSTRAINT fk_alumni_sid
        FOREIGN KEY (sid) REFERENCES students(student_id);


ALTER TABLE employee
    ADD CONSTRAINT fk_employee_department
        FOREIGN KEY (department) REFERENCES departments(id);


ALTER TABLE placement_student
    ADD CONSTRAINT fk_placement_student_placement_id
        FOREIGN KEY (placement_id) REFERENCES placement(id);

ALTER TABLE placement_student
    ADD CONSTRAINT fk_placement_student_student_id
        FOREIGN KEY (student_id) REFERENCES students(student_id);


ALTER TABLE placement_filter
    ADD CONSTRAINT fk_placement_filter_placement_id
        FOREIGN KEY (placement_id) REFERENCES placement(id);

ALTER TABLE placement_filter
    ADD CONSTRAINT fk_placement_filter_domain
        FOREIGN KEY (domain) REFERENCES domains(domain_id);


ALTER TABLE students
    ADD CONSTRAINT fk_students_domain
        FOREIGN KEY (domain) REFERENCES domains(domain_id);

ALTER TABLE students
    ADD CONSTRAINT fk_students_placement_id
        FOREIGN KEY (placement_id) REFERENCES placement(id);

ALTER TABLE students
    ADD CONSTRAINT fk_students_specialisation_id
        FOREIGN KEY (specialisation_id) REFERENCES specialisation(specialisation_id);
