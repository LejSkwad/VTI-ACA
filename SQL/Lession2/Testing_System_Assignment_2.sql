use testing_system_assignment_1

-- Excersise 2
-- Question 1
INSERT INTO Department (DepartmentName) VALUES 	
	('Sale'),
	('Marketing'),
	('IT'),
	('Finance'), 
	('HR'),
	('Support'),
	('R&D'),
	('Legal'), 
	('QA'),
	('Operation');
    
INSERT INTO Position (PositionName) VALUES 
	('Dev'),
    ('Test'),
    ('Scrum Master'),
    ('PM'), 
	('BA'),
    ('Designer'),
    ('Supporter'),
    ('QA'), 
	('Intern'),
    ('Leader');
    
INSERT INTO Account (Email, Username, FullName, DepartmentID, PositionID, CreateDate) VALUES
	('Email1@example.com', 'john123', 'John Smith', 1, 1, '2025-06-01'),
	('Email2@example.com', 'jane456', 'Jane Doe', 2, 2, '2025-06-02'),
	('Email3@example.com', 'alex789', 'Alexander Johnson', 3, 3, '2025-06-03'),
	('Email4@example.com', 'maria321', 'Maria Garcia', 4, 4, '2025-06-04'),
	('Email5@example.com', 'lisa654', 'Lisa Chen', 3, 1, '2025-06-05'),
	('Email6@example.com', 'david987', 'David Nguyen', 2, 5, '2025-06-06'),
	('Email7@example.com', 'khanh01', 'Nguyen Thi Khanh', 1, 6, '2025-06-07'),
	('Email8@example.com', 'anh02', 'Tran Anh Khoa', 5, 3, '2025-06-08'),
	('Email9@example.com', 'hoang03', 'Hoang Minh Duc', 3, 2, '2025-06-09'),
	('Email10@example.com', 'thu04', 'Nguyen Thi Thu Ha', 3, 1, '2025-06-10'),
    ('Email11@example.com', 'dao', 'Dao', 3, 1, '2025-06-11');

INSERT INTO `Group` (GroupName, CreatorID, CreateDate) VALUES
	('Group A', 1, '2018-06-01'),
	('Group B', 2, '2025-06-02'),
	('Group C', 3, '2025-06-03'),
	('Group D', 4, '2025-06-04'),
	('Group E', 5, '2025-06-05'),
	('Group F', 6, '2025-06-06'),
	('Group G', 7, '2025-06-07'),
	('Group H', 8, '2025-06-08'),
	('Group I', 9, '2025-06-09'),
	('Group J', 10, '2025-06-10');
    
INSERT INTO GroupAccount (GroupID, AccountID, JoinDate) VALUES
	(1, 1, '2025-06-01'),
	(2, 2, '2025-06-02'),
	(3, 3, '2025-06-03'),
	(4, 4, '2025-06-04'),
	(5, 5, '2025-06-05'),
	(6, 6, '2025-06-06'),
	(7, 7, '2025-06-07'),
	(8, 8, '2025-06-08'),
	(9, 9, '2025-06-09'),
	(10, 10, '2025-06-10');
    
INSERT INTO TypeQuestion (TypeName) VALUES
	('Essay'),
    ('Multiple-Choice'), 
    ('True/False'), 
	('Fill in the blank'),
    ('Matching'), 
	('Ranking'),
    ('Open-ended'),
    ('Diagram'), 
	('Code'),
    ('Short Answer');

INSERT INTO CategoryQuestion (CategoryName) VALUES
	('Java'),
    ('.NET'),
    ('SQL'),
    ('Postman'), 
	('Ruby'),
    ('Python'),
    ('C#'),
    ('HTML'), 
	('CSS'),
    ('JavaScript');

INSERT INTO Question (Content, CategoryID, TypeID, CreatorID, CreateDate) VALUES
	('Câu hỏi số 1', 1, 1, 1, '2025-06-01'),
	('Câu hỏi số 2', 2, 2, 2, '2025-06-02'),
	('Câu hỏi số 3', 3, 3, 3, '2025-06-03'),
	('Câu hỏi số 4', 4, 4, 4, '2025-06-04'),
	('Câu hỏi số 5', 5, 5, 5, '2025-06-05'),
	('Câu hỏi số 6', 6, 6, 6, '2025-06-06'),
	('Câu hỏi số 7', 7, 7, 7, '2025-06-07'),
	('Câu hỏi số 8', 8, 8, 8, '2025-06-08'),
	('Câu hỏi số 9', 9, 9, 9, '2025-06-09'),
	('Câu hỏi số 10', 10, 10, 10, '2025-06-10');

INSERT INTO Answer (Content, QuestionID, isCorrect) VALUES
	('Đáp án 1', 1, 1),
	('Đáp án 2', 2, 0),
	('Đáp án 3', 3, 1),
	('Đáp án 4', 4, 0),
	('Đáp án 5', 5, 1),
	('Đáp án 6', 6, 0),
	('Đáp án 7', 7, 1),
	('Đáp án 8', 8, 0),
	('Đáp án 9', 9, 1),
	('Đáp án 10', 10, 0);

INSERT INTO Exam (Code, Title, CategoryID, Duration, CreatorID, CreateDate) VALUES
	('01', 'Đề thi 1', 1, 60, 1, '2025-06-01'),
	('02', 'Đề thi 2', 2, 60, 2, '2025-06-02'),
	('03', 'Đề thi 3', 3, 60, 3, '2025-06-03'),
	('04', 'Đề thi 4', 4, 60, 4, '2025-06-04'),
	('05', 'Đề thi 5', 5, 60, 5, '2025-06-05'),
	('06', 'Đề thi 6', 6, 60, 6, '2025-06-06'),
	('07', 'Đề thi 7', 7, 60, 7, '2025-06-07'),
	('08', 'Đề thi 8', 8, 60, 8, '2025-06-08'),
	('09', 'Đề thi 9', 9, 60, 9, '2025-06-09'),
	('10', 'Đề thi 10', 10, 80, 10, '2018-06-10');

INSERT INTO ExamQuestion (ExamID, QuestionID) VALUES
	(1, 1),
    (2, 2),
    (3, 3),
    (4, 4),
    (5, 5),
	(6, 6),
    (7, 7),
    (8, 8),
    (9, 9),
    (10, 10);

-- Question 2
SELECT * FROM Department;
-- Question 3
SELECT DepartmentID FROM Department WHERE DepartmentName = 'Sale';
-- Question 4
SELECT * FROM Account ORDER BY LENGTH(FullName) DESC LIMIT 1; 
-- Question 5
SELECT * FROM Account WHERE DepartmentID = 3 ORDER BY LENGTH(FullName) DESC LIMIT 1;
-- Question 6
SELECT GroupName FROM `Group` WHERE CreateDate < '2019-12-20';
-- Question 7
SELECT QuestionID FROM Answer GROUP BY QuestionID HAVING COUNT(*) >= 4;
-- Question 8
SELECT Code FROM Exam WHERE Duration > 60 AND CreateDate < '2019-12-20';
-- Question 9
SELECT * FROM `Group` ORDER BY CreateDate DESC LIMIT 5;
-- Question 10
SELECT COUNT(*) AS TotalEmployees FROM Account WHERE DepartmentID = 2;
-- Question 11
SELECT * FROM Account WHERE FullName LIKE 'D%o';
-- Question 12
DELETE FROM Exam WHERE CreateDate < '2019-12-20';
-- Question 13
DELETE FROM Question WHERE Content LIKE 'câu hỏi%';
-- Question 14
UPDATE Account SET FullName = 'Nguyễn Bá Lộc',
					Email = 'loc.nguyenba@vti.com.vn'
WHERE AccountID = 5;
-- Question 15
UPDATE GroupAccount SET GroupID = 4,
		JoinDate = CURDATE()
WHERE AccountID = 5;


SELECT q.QuestionID, q.Content, 
       a.AnswerID, a.Content, a.isCorrect
FROM Question q
JOIN Answer a ON q.QuestionID = a.QuestionID
WHERE a.isCorrect = 1;

SELECT q.QuestionID, q.Content, COUNT(a.AnswerID) AS AnswerCount 
FROM Question q
JOIN Answer a ON q.QuestionID = a.QuestionID
GROUP BY q.QuestionID, q.Content;