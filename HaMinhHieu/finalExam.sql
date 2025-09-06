Create database finalExam;
use finalExam;

create table User(
	id int primary key auto_increment,
    fullname varchar(50),
    email varchar(50),
    password varchar(20),
    exp_in_year int,
    pro_skill varchar(50),
    project_id int,
    role varchar(50)
    );

INSERT INTO User (fullname, email, password, exp_in_year, pro_skill, project_id, role)
VALUES 
('Nguyen Van A', 'a.manager@company.com', '123456', 10, NULL, 101, 'MANAGER'),
('Tran Thi B', 'b.manager@company.com', '123456', 5, NULL, 102, 'MANAGER');

INSERT INTO User (fullname, email, password, exp_in_year, pro_skill, project_id, role)
VALUES 
('Le Van C', 'c.employee@company.com', '123456', NULL, 'Java', 101, 'EMPLOYEE'),
('Pham Thi D', 'd.employee@company.com', '123456', NULL, 'SQL', 101, 'EMPLOYEE'),
('Hoang Van E', 'e.employee@company.com', '123456', NULL, 'Test', 102, 'EMPLOYEE'),
('Nguyen Thi F', 'f.employee@company.com', '123456', NULL, 'DevOps', 102, 'EMPLOYEE');