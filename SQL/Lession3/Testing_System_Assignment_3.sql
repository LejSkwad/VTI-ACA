use Testing_System_Assignment_1

-- Exercise 1
-- Question 1
SELECT a.*, d.*
FROM Account a 
JOIN Department d ON a.DepartmentID = d.DepartmentID; 

-- Question 2
SELECT *FROM Account WHERE CreateDate > '2010-12-10';

-- Question 3
SELECT a.*, p.PositionName
FROM Account a
JOIN Position p ON a.PositionID = p.PositionID
WHERE PositionName = 'Developer'

-- Question 4
SELECT d.DepartmentID, d.DepartmentName, COUNT(a.AccountID) AS AccountCount
FROM Department d
JOIN Account a ON d.DepartmentID = a.DepartmentID
GROUP BY d.DepartmentID, d.DepartmentName
HAVING COUNT(a.AccountID) > 3;

SELECT *
FROM Account
WHERE LENGTH(FullName) = (
    SELECT MAX(LENGTH(FullName))
    FROM Account
);

-- Question 5
SELECT q.QuestionID, q.Content, COUNT(eq.ExamID) AS UsageCount
FROM ExamQuestion eq
JOIN Question q ON eq.QuestionID = q.QuestionID
GROUP BY q.QuestionID, q.Content
HAVING COUNT(eq.ExamID) = (
    SELECT MAX(QuestionUsage)
    FROM (
        SELECT COUNT(ExamID) AS QuestionUsage
        FROM ExamQuestion
        GROUP BY QuestionID
    ) AS usage_counts
);

-- Question 6
SELECT cq.CategoryID, cq.CategoryName, COUNT(q.QuestionID) AS TotalQuestion
FROM CategoryQuestion cq
LEFT JOIN Question q ON cq.CategoryID = q.CategoryID
GROUP BY cq.CategoryID, cq.CategoryName;

-- Question 7
SELECT q.QuestionID, q.Content, COUNT(eq.ExamID) AS TotalExam
FROM Question q
LEFT JOIN ExamQuestion eq ON q.QuestionID = eq.QuestionID
GROUP BY q.QuestionID, q.Content;

-- Question 8
SELECT q.QuestionID, q.Content, COUNT(a.AnswerID) AS TotalAnswer
FROM Question q
JOIN Answer a ON q.QuestionID = a.QuestionID
GROUP BY q.QuestionID, q.Content
Having COUNT(a.AnswerID) = (
	SELECT MAX(Total)
    FROM (
		SELECT COUNT(AnswerID) AS Total
        FROM Answer
        GROUP BY QuestionID
        ) AS counts
	);

-- Question 9
SELECT g.GroupID, g.GroupName, count(ga.AccountID) as TotalAccount
FROM `Group` g
LEFT JOIN GroupAccount ga ON g.GroupID = ga.GroupID
GROUP BY g.GroupID, g.GroupName;

-- Quesiton 10
SELECT p.PositionID, p.PositionName, Count(a.AccountID) as TotalEmployee
FROM Position p
JOIN Account a ON p.PositionID = a.PositionID
GROUP BY p.PositionID, p.PositionName
HAVING COUNT(a.AccountID) = (
	SELECT MIN(total)
    FROM (
		SELECT COUNT(AccountID) as total
        FROM Account 
        Group by PositionID
        ) AS counts
	);

-- Question 11
SELECT 
  d.DepartmentID,
  d.DepartmentName,
  COUNT(CASE WHEN p.PositionName = 'Dev' THEN 1 END) AS TotalDev,
  COUNT(CASE WHEN p.PositionName = 'Test' THEN 1 END) AS TotalTest,
  COUNT(CASE WHEN p.PositionName = 'Scrum Master' THEN 1 END) AS TotalScrumMaster,
  COUNT(CASE WHEN p.PositionName = 'PM' THEN 1 END) AS TotalPM
FROM Account a
JOIN Department d ON a.DepartmentID = d.DepartmentID
JOIN Position p ON a.PositionID = p.PositionID
GROUP BY d.DepartmentID, d.DepartmentName;

-- Question 12
SELECT 
  q.QuestionID,
  q.Content,
  q.CreateDate,
  tq.TypeName,
  cq.CategoryName,
  a.FullName,
  ans.AnswerID,
  ans.Content,
  ans.isCorrect
FROM Question q
JOIN TypeQuestion tq ON q.TypeID = tq.TypeID
JOIN CategoryQuestion cq ON q.CategoryID = cq.CategoryID
JOIN Account a ON q.CreatorID = a.AccountID
LEFT JOIN Answer ans ON q.QuestionID = ans.QuestionID;

-- Question 13
SELECT tq.TypeName, COUNT(q.QuestionID) AS TotalQuestions
FROM Question q
JOIN TypeQuestion tq ON q.TypeID = tq.TypeID
GROUP BY tq.TypeName;

-- Question 14
SELECT g.GroupID, g.GroupName, g.CreateDate
FROM `Group` g
LEFT JOIN GroupAccount ga ON g.GroupID = ga.GroupID
WHERE ga.AccountID IS NULL;

-- Question 16
SELECT q.QuestionID, q.Content, q.CreateDate
FROM Question q
LEFT JOIN Answer a ON q.QuestionID = a.QuestionID
WHERE a.AnswerID IS NULL;

-- Question 17
SELECT a.*
FROM Account a
JOIN GroupAccount ga ON a.AccountID = ga.AccountID
WHERE ga.GroupID = 1

UNION

SELECT a.*
FROM Account a
JOIN GroupAccount ga ON a.AccountID = ga.AccountID
WHERE ga.GroupID = 2;

-- Question 18
SELECT g.GroupID, g.GroupName, COUNT(ga.AccountID) AS MemberCount
FROM `Group` g
JOIN GroupAccount ga ON g.GroupID = ga.GroupID
GROUP BY g.GroupID, g.GroupName
HAVING COUNT(ga.AccountID) > 5

UNION

SELECT g.GroupID, g.GroupName, COUNT(ga.AccountID) AS MemberCount
FROM `Group` g
JOIN GroupAccount ga ON g.GroupID = ga.GroupID
GROUP BY g.GroupID, g.GroupName
HAVING COUNT(ga.AccountID) > 7;
