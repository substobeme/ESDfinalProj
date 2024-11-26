INSERT INTO students (student_id, first_name, last_name, email, roll_number, cgpa, graduation_year, total_credits, photograph_path, domain, specialisation_id, placement_id)
VALUES
    (1, 'Subha', 'Chakraborty', 'subha.chakraborty@iiitb.ac.in', '156', 8.5, 2024, 120, '/images/subha.jpg', 1, 102, 201),
    (2, 'Akash', 'Chaudhari', 'akash.chaudhari@iiitb.ac.in', '157', 8.0, 2024, 115, '/images/akash.jpg', 1, 101, 202),
    (3, 'Priya', 'Sharma', 'priya.sharma@iiitb.ac.in', '158', 9.0, 2024, 130, '/images/priya.jpg', 2, 101, NULL);

INSERT INTO alumni (id, sid, email, contact)
VALUES
    (1, 1, 'subha.alumni@iiitb.ac.in', 8583994211),
    (2, 2, 'akash.alumni@iiitb.ac.in', 8765432109);


INSERT INTO alumni_organization (id, organization, alumni_id, position, join_date, leave_date)
VALUES
    (1, 1, 1, 'Software Engineer', '2024-06-01', '2026-06-01'),
    (2, 2, 2, 'Data Analyst', '2024-07-01', '2026-07-01');


INSERT INTO departments (id, name, capacity)
VALUES
    (1, 'CSE', 150),
    (2, 'ECE', 70);

INSERT INTO employee (id, first_name, last_name, title, photograph_path, department, email, password)
VALUES
    (1, 'Ravi', 'Kumar', 'HR Manager', '/images/ravi.jpg', 1, 'ravi.kumar@job.org', 'password123'),
    (2, 'Neha', 'Singh', 'Placement Officer', '/images/neha.jpg', 2, 'neha.singh@job.org', 'password456');


INSERT INTO domains (domain_id, program, batch, capacity, qualification)
VALUES
    (1, 'MTech', '2024', 200, 'Postgraduate'),
    (2, 'IMTech', '2024', 100, 'Postgraduate');


INSERT INTO placement (id, organization, profile, description, intake, minimum_grade)
VALUES
    (201, 1, 'Software Developer', 'Responsible for developing and maintaining software applications', 50, 7.0),
    (202, 2, 'Data Scientist', 'Responsible for analyzing and interpreting complex data to help companies make decisions', 30, 8.0);

INSERT INTO placement_student (id, placement_id, student_id, cv_application, about, acceptance, comments, date)
VALUES
    (1, 201, 1, '/cv/subha.pdf', 'Interested in software development', 'Accepted', 'Looking forward to the opportunity', '2024-05-10'),
    (2, 202, 2, '/cv/akash.pdf', 'Passionate about data science', 'Accepted', 'Excited to join the team', '2024-06-15');

INSERT INTO specialisation (specialisation_id, code, name, description, credits_required, year)
VALUES
    (101, 'CS101', 'Software Engineering', 'Focus on software development', 60, '2024'),
    (102, 'AIM102', 'Data Science', 'Focus on data analysis and machine learning', 60, '2024'),
    (103, 'CSE103', 'Algorithms', 'Focus on programming analysis', 60, '2024');

INSERT INTO organisation (id, name, address)
VALUES
    (1, 'TechCorp', '123 Tech Road, Bangalore'),
    (2, 'DataAnalytics Inc.', '456 Data Lane, Pune');
