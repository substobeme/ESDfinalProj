
INSERT INTO departments (id, capacity, name)
VALUES
    (1, 50, 'HR'),
    (2, 30, 'Outreach'),
    (3, 40, 'SDE'),
    (4, 20, 'Finance');


INSERT INTO domains (id, batch, capacity, program, qualification)
VALUES
    (1, '2024', 20, 'MTech', 'CSE'),
    (2, '2024', 15, 'iMTech', 'CSE'),
    (3, '2024', 10, 'MTech', 'ECE');


INSERT INTO specialisation (id, code, credits_required, description, name, year)
VALUES
    (1, 'AIM', 16, 'Specialization dealing with machine learning topics like Computer Vision,NLP,etc', 'Machine Learning', '2024'),
    (2, 'DS', 20, 'Specialization dealing with Data Science and Analysis', 'Data Science', '2024'),
    (3, 'CSE1', 12, 'Specialization dealing with Software Development Courses', 'Software Development Engineering', '2024');



INSERT INTO organisation (id, address, name)
VALUES
    (1, 'Bangalore, India', 'CMC'),
    (2, 'Bangalore, India', 'Microsoft'),
    (3, 'Hyderabad, India', 'Amazon');


INSERT INTO placement (id, description, intake, min_grade, profile, organisation)
VALUES
    (1, 'ML Engineer', 10, 8.0, 'Engineer', 'CMC'),
    (2, 'Data Analyst', 5, 7.5, 'Analyst', 'Microsoft'),
    (3, 'Software Development', 8, 8.5, 'SDE', 'Amazon');


INSERT INTO students (id, cgpa, total_credits, email, first_name, graduation_year, last_name, organisation, photo_path, roll_number, domain_id, placement_id, specialisation_id)
VALUES
    (1, 3.2, 22, 'subha.iiitb.ac.in', 'Subha', 2024, 'Chakraborty', 'Google', '/images/subha.jpg', 'MT2024156', 1, 1, 1),
    (2, 4, 20, 'akash.iiitb.ac.in', 'Akash', 2024, 'Chaudhari', 'Microsoft', '/images/akash.jpg', 'MT2024002', 1, 2, 2),
    (3, 3.2, 18, 'priya.iiitb.ac.in', 'Priya', 2024, 'Sharma', 'Amazon', '/images/priya.jpg', 'IM2024003', 2, 3, 3),
    (4, 3, 16, 'jigyashu.iiitb.ac.in', 'Jigyashu', 2024, 'Das', NULL, '/images/jigyashu.jpg', 'MT2024004', 3, NULL, NULL),
    (5, 2.9, 16, 'abhay.iiitb.ac.in', 'Abhay', 2024, 'Kundu', NULL, '/images/abhay.jpg', 'IMT2024005', 3, NULL, NULL);


INSERT INTO alumni (id, contact, email, student_id)
VALUES
    (1, 8583994211, 'subha.iiitb.ac.in', 1),
    (2, 9876543211, 'akash.iiitb.ac.in', 2),
    (3, 9876543212, 'priya.iiitb.ac.in', 3);


INSERT INTO alumni_organisation (id, join_date, leave_date, position, alumni_id, organisation)
VALUES
    (1, '2024-09-15', NULL, 'SDE', 1, 'CMC'),
    (2, '2024-08-20', NULL, 'Analyst', 2, 'Microsoft'),
    (3, '2024-09-01', NULL, 'Engineer', 3, 'Amazon');


INSERT INTO placement_filter (id, domain, placement_id, specialisation)
VALUES
    (1, 1, 1, 1),
    (2, 1, 2, 2),
    (3, 2, 3, 3);


INSERT INTO placement_student (id, about, acceptance, comments, cv_application, date, placement_id, student_id)
VALUES
    (1, 'Good fit for SDE role', 'Accepted', 'Enthusiastic', '/cv/subha.pdf', '2024-01-10', 1, 1),
    (2, 'Strong analytical skills', 'Accepted', 'Experienced', '/cv/akash.pdf', '2024-01-15', 2, 2),
    (3, 'Great ML knowledge', 'Accepted', 'Proficient', '/cv/priya.pdf', '2024-01-20', 3, 3);


-- Inserting more departments
INSERT INTO departments (id, capacity, name)
VALUES
    (5, 35, 'Marketing'),
    (6, 45, 'Sales'),
    (7, 50, 'R&D');


INSERT INTO domains (id, batch, capacity, program, qualification)
VALUES
    (4, '2024', 25, 'MTech', 'IT'),
    (5, '2024', 30, 'iMTech', 'IT'),
    (6, '2024', 20, 'MTech', 'ME');

-- Inserting more specialisations
INSERT INTO specialisation (id, code, credits_required, description, name, year)
VALUES
    (4, 'AI', 18, 'Specialization in Artificial Intelligence and Deep Learning', 'Artificial Intelligence', '2024'),
    (5, 'CS', 14, 'Specialization in Core Computer Science Topics', 'Computer Science', '2024'),
    (6, 'ECE2', 16, 'Specialization in Embedded Systems and VLSI', 'Embedded Systems', '2024');


INSERT INTO organisation (id, address, name)
VALUES
    (4, 'Pune, India', 'Tata Consultancy Services'),
    (5, 'Chennai, India', 'Infosys'),
    (6, 'Mumbai, India', 'Wipro');


INSERT INTO placement (id, description, intake, min_grade, profile, organisation)
VALUES
    (4, 'Software Developer', 12, 8.0, 'Engineer', 'Tata Consultancy Services'),
    (5, 'Business Analyst', 8, 7.5, 'Analyst', 'Infosys'),
    (6, 'Data Scientist', 6, 8.5, 'Scientist', 'Wipro');


INSERT INTO students (id, cgpa, total_credits, email, first_name, graduation_year, last_name, organisation, photo_path, roll_number, domain_id, placement_id, specialisation_id)
VALUES
    (6, 3.6, 24, 'nisha.iiitb.ac.in', 'Nisha', 2024, 'Patel', 'Google', '/images/nisha.jpg', 'MT2024160', 4, 4, 4),
    (7, 3.8, 22, 'vishal.iiitb.ac.in', 'Vishal', 2024, 'Singh', 'Microsoft', '/images/vishal.jpg', 'MT2024161', 5, 5, 5),
    (8, 3.5, 18, 'rahul.iiitb.ac.in', 'Rahul', 2024, 'Verma', 'Amazon', '/images/rahul.jpg', 'IM2024162', 6, 6, 6);


INSERT INTO alumni (id, contact, email, student_id)
VALUES
    (4, 9123456789, 'nisha.iiitb.ac.in', 6),
    (5, 9123456790, 'vishal.iiitb.ac.in', 7),
    (6, 9123456791, 'rahul.iiitb.ac.in', 8);

-- Inserting more alumni organisation data
INSERT INTO alumni_organisation (id, join_date, leave_date, position, alumni_id, organisation)
VALUES
    (4, '2024-10-10', NULL, 'SDE', 4, 'Tata Consultancy Services'),
    (5, '2024-10-12', NULL, 'Business Analyst', 5, 'Infosys'),
    (6, '2024-10-15', NULL, 'Data Scientist', 6, 'Wipro');

INSERT INTO placement_filter (id, domain, placement_id, specialisation)
VALUES
    (4, 4, 4, 4),
    (5, 5, 5, 5),
    (6, 6, 6, 6);

INSERT INTO placement_student (id, about, acceptance, comments, cv_application, date, placement_id, student_id)
VALUES
    (4, 'Strong leadership and technical skills', 'Accepted', 'Great team player', '/cv/nisha.pdf', '2024-02-10', 4, 6),
    (5, 'Strong analytical skills with data-driven approach', 'Accepted', 'Experienced in analytics', '/cv/vishal.pdf', '2024-02-15', 5, 7),
    (6, 'Deep expertise in Data Science algorithms', 'Accepted', 'Proven track record in ML', '/cv/rahul.pdf', '2024-02-20', 6, 8);


UPDATE students
SET specialisation_id = 4
WHERE id = 5;


UPDATE students
SET specialisation_id = 3
WHERE id = 4;

UPDATE students
SET organisation = 'Microsoft'
WHERE id = 3;

UPDATE alumni_organisation
SET organisation = 'Microsoft'
WHERE alumni_id = 3;