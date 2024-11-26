ALTER TABLE alumni
    ADD CONSTRAINT fk_alumni_student
        FOREIGN KEY (student_id) REFERENCES students (id);

ALTER TABLE alumni_organisation
    ADD CONSTRAINT fk_alumni_organisation_alumni
        FOREIGN KEY (alumni_id) REFERENCES alumni (id);

ALTER TABLE alumni_organisation
    ADD CONSTRAINT fk_alumni_organisation_organisation
        FOREIGN KEY (organisation) REFERENCES organisation (name);


ALTER TABLE placement_filter
    ADD CONSTRAINT fk_placement_filter_placement
        FOREIGN KEY (placement_id) REFERENCES placement (id);

ALTER TABLE placement_filter
    ADD CONSTRAINT fk_placement_filter_specialisation
        FOREIGN KEY (specialisation) REFERENCES specialisation (id);

ALTER TABLE placement
    ADD CONSTRAINT fk_placement_organisation
        FOREIGN KEY (organisation) REFERENCES organisation (name);

ALTER TABLE placement_student
    ADD CONSTRAINT fk_placement_student_placement
        FOREIGN KEY (placement_id) REFERENCES placement (id);

ALTER TABLE placement_student
    ADD CONSTRAINT fk_placement_student_student
        FOREIGN KEY (student_id) REFERENCES students (id);


ALTER TABLE employee
    ADD CONSTRAINT fk_employee_department
        FOREIGN KEY (department) REFERENCES departments (id);

ALTER TABLE students
    ADD CONSTRAINT fk_student_domain
        FOREIGN KEY (domain_id) REFERENCES domains (id);

ALTER TABLE students
    ADD CONSTRAINT fk_student_placement
        FOREIGN KEY (placement_id) REFERENCES placement (id);

ALTER TABLE students
    ADD CONSTRAINT fk_student_specialisation
        FOREIGN KEY (specialisation_id) REFERENCES specialisation (id);
