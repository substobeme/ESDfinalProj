CREATE DATABASE IF NOT EXISTS placementDB;

USE placementDB;

CREATE TABLE alumni (
                id BIGINT NOT NULL,
                contact BIGINT,
                email VARCHAR(255),
                student_id BIGINT,
                PRIMARY KEY (id)
);

CREATE TABLE alumni_organisation (
                id BIGINT NOT NULL,
                join_date DATE,
                leave_date DATE,
                position VARCHAR(255),
                alumni_id BIGINT,
                organisation VARCHAR(255),
                PRIMARY KEY (id)
);

CREATE TABLE departments (
                    id BIGINT NOT NULL,
                    capacity INT,
                    name VARCHAR(255),
                    PRIMARY KEY (id),
                    UNIQUE KEY (name)
);

CREATE TABLE domains (
                    id BIGINT NOT NULL,
                    batch VARCHAR(255),
                    capacity INT,
                    program VARCHAR(255),
                    qualification VARCHAR(255),
                    PRIMARY KEY (id)
);

CREATE TABLE employee (
                    id BIGINT NOT NULL AUTO_INCREMENT,
                    department BIGINT,
                    email VARCHAR(255),
                    first_name VARCHAR(255),
                    last_name VARCHAR(255),
                    password VARCHAR(255),
                    photograph_path VARCHAR(255),
                    title VARCHAR(255),
                    PRIMARY KEY (id)
);

CREATE TABLE organisation (
                    id BIGINT NOT NULL,
                    address VARCHAR(255),
                    name VARCHAR(255),
                    PRIMARY KEY (id),
                    UNIQUE KEY (name)
);

CREATE TABLE placement_filter (
                    id BIGINT NOT NULL,
                    domain BIGINT,
                    placement_id BIGINT,
                    specialisation BIGINT,
                    PRIMARY KEY (id)
);

CREATE TABLE placement (
                  id BIGINT NOT NULL,
                   description VARCHAR(255),
                   intake INT,
                    min_grade DOUBLE,
                    profile VARCHAR(255),
                    organisation VARCHAR(255),
                    PRIMARY KEY (id)
);

CREATE TABLE placement_student (
                        id BIGINT NOT NULL,
                        about VARCHAR(255),
                        acceptance VARCHAR(255),
                        comments VARCHAR(255),
                        cv_application VARCHAR(255),
                        date DATE,
                        placement_id BIGINT,
                        student_id BIGINT,
                        PRIMARY KEY (id)
);

CREATE TABLE specialisation (
                        id BIGINT NOT NULL,
                        code VARCHAR(255),
                        credits_required DOUBLE,
                        description VARCHAR(255),
                        name VARCHAR(255),
                        year VARCHAR(255),
                        PRIMARY KEY (id)
);

CREATE TABLE students (
                          id BIGINT NOT NULL,
                          cgpa INT,
                          total_credits DOUBLE,
                          email VARCHAR(255) NOT NULL,
                          first_name VARCHAR(255),
                          graduation_year INT,
                          last_name VARCHAR(255),
                          organisation VARCHAR(255),
                          photo_path VARCHAR(255),
                          roll_number VARCHAR(255) NOT NULL,
                          domain_id BIGINT,
                          placement_id BIGINT,
                          specialisation_id BIGINT,
                          PRIMARY KEY (id),
                          UNIQUE KEY (email),
                          UNIQUE KEY (roll_number)
);



















