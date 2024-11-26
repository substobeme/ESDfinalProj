CREATE DATABASE IF NOT EXISTS placementDB;

USE placementDB;

CREATE TABLE students (
        student_id BIGINT NOT NULL PRIMARY KEY,
        first_name VARCHAR(255),
        last_name VARCHAR(255),
        email VARCHAR(255) UNIQUE NOT NULL,
        roll_number VARCHAR(255) UNIQUE NOT NULL,
        cgpa DOUBLE,
        graduation_year INT,
        total_credits DOUBLE,
        photograph_path VARCHAR(255),
        domain BIGINT,
        specialisation_id BIGINT,
        placement_id BIGINT
);

CREATE TABLE alumni (
        id INT PRIMARY KEY,
        sid INT,
        email VARCHAR(255),
        contact BIGINT
);

CREATE TABLE alumni_organization (
        id INT PRIMARY KEY,
        organization INT,
        alumni_id INT,
        position VARCHAR(255),
        join_date DATE,
        leave_date DATE
);

CREATE TABLE departments (
        id INT PRIMARY KEY,
        name VARCHAR(255) UNIQUE NOT NULL,
        capacity INT NOT NULL
);

CREATE TABLE employee (
        id INT AUTO_INCREMENT PRIMARY KEY,
        first_name VARCHAR(255) NOT NULL,
        last_name VARCHAR(255) NOT NULL,
        title VARCHAR(255),
        photograph_path VARCHAR(255),
        department VARCHAR(255) NOT NULL,
        email VARCHAR(255) NOT NULL,
        password VARCHAR(255) NOT NULL
);


CREATE TABLE placement (
        id INT PRIMARY KEY,
        organization INT NOT NULL,
        profile VARCHAR(255),
        description TEXT,
        intake INT,
        minimum_grade DOUBLE
);


CREATE TABLE placement_filter (
        id BIGINT NOT NULL PRIMARY KEY,
        placement_id BIGINT,
        specialisation BIGINT,
        domain BIGINT
);

CREATE TABLE domains (
        domain_id BIGINT PRIMARY KEY,
        program VARCHAR(255),
        batch VARCHAR(255),
        capacity INT,
        qualification VARCHAR(255)
);

CREATE TABLE placement_student (
        id BIGINT PRIMARY KEY,
        placement_id BIGINT,
        student_id BIGINT,
        cv_application VARCHAR(255),
        about TEXT,
        acceptance VARCHAR(255),
        comments TEXT,
        date DATE
);

CREATE TABLE specialisation (
        specialisation_id BIGINT PRIMARY KEY,
        code VARCHAR(255) UNIQUE NOT NULL,
        name VARCHAR(255),
        description TEXT,
        credits_required DOUBLE,
        year VARCHAR(255)
);

CREATE TABLE organisation (
            id BIGINT PRIMARY KEY,
            name VARCHAR(255),
            address VARCHAR(255)
);


















