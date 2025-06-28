use Testing_System_Assignment_1;

-- Question 1
CREATE VIEW view_sale_account AS
	SELECT a.Username, d.DepartmentName
	FROM Account a 
    JOIN department d ON a.DepartmentID = d.DepartmentID
    WHERE DepartmentName = "Sale";
    
SELECT * FROM view_sale_account;

-- Question 2
CREATE VIEW view_account_mostgroup AS
	SELECT a.*, COUNT(ga.groupID)
    FROM Account a
    JOIN GroupAccount ga ON a.AccountID = ga.AccountID
    GROUP BY a.Username, a.AccountID
    HAVING COUNT(ga.GroupID) = (
		SELECT MAX(TotalGroup)
        FROM (
			SELECT COUNT(GroupID) as TotalGroup
            From GroupAccount
            GROUP BY AccountID
            ) AS counts
		);

SELECT * FROM view_account_mostgroup;

-- Question 3
CREATE VIEW View_Long_Content_Questions AS
	SELECT *
	FROM Question
	WHERE 
		LENGTH(TRIM(Content)) - LENGTH(REPLACE(TRIM(Content), ' ', '')) + 1 > 300;
        
DELETE FROM Question
WHERE 
    LENGTH(TRIM(Content)) - LENGTH(REPLACE(TRIM(Content), ' ', '')) + 1 > 300;
    
-- Question 4
CREATE VIEW view_most_account_department AS
	SELECT d.DepartmentName, d.DepartmentID, COUNT(a.AccountID)
    FROM Department d
    JOIN Account a ON d.DepartmentID = a.DepartmentID
    GROUP BY d.DepartmentName, d.DepartmentID
    HAVING COUNT(a.AccountID) = (
		SELECT MAX(TotalAccount)
        FROM (
			SELECT COUNT(AccountID) AS TotalAccount
            FROM Account
            GROUP BY DepartmentID
            ) as counts
		);
SELECT * FROM view_most_account_department;

-- Question 5
CREATE VIEW question_created_by_nguyen AS
	SELECT q.Content, q.QuestionID, a.Username
    FROM Question q
    JOIN Account a ON q.CreatorID = a.AccountID
    WHERE a.Fullname LIKE 'Nguyen%';

SELECT * FROM question_created_by_nguyen;