
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
    (1, 'AIM501', 16, 'Image Processing and Computer Vision Course', 'Computer Vision', '2024'),
    (2, 'AIM502', 20, 'Advanced Machine Learning Techniques Course', 'Machine Learning', '2024'),
    (3, 'CSE321', 12, 'Site Reliability Engineering Course', 'SRE', '2024');



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
    (1, 3.2, 22, 'subha.iiitb.ac.in', 'Subha', 2022, 'Chakraborty', 'Google', '/images/subha.jpg', 'MT2024156', 1, 1, 1),
    (2, 4, 20, 'akash.iiitb.ac.in', 'Akash', 2022, 'Chaudhari', 'Microsoft', '/images/akash.jpg', 'MT2024002', 1, 2, 2),
    (3, 3.2, 18, 'priya.iiitb.ac.in', 'Priya', 2022, 'Sharma', 'Amazon', '/images/priya.jpg', 'IM2024003', 2, 3, 3),
    (4, 3, 16, 'jigyashu.iiitb.ac.in', 'Jigyashu', 2022, 'Das', NULL, '/images/jigyashu.jpg', 'MT2024004', 3, NULL, NULL);


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
    (1, 'Good fit for SDE role', 'Accepted', 'Enthusiastic', '/cv/subha.pdf', '2023-01-10', 1, 1),
    (2, 'Strong analytical skills', 'Accepted', 'Experienced', '/cv/akash.pdf', '2023-01-15', 2, 2),
    (3, 'Great ML knowledge', 'Accepted', 'Proficient', '/cv/priya.pdf', '2023-01-20', 3, 3);
