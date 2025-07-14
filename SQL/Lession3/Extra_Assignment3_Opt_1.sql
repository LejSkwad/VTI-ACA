use extra_assignment_1_2;

-- Question 1
INSERT INTO Trainee (Full_Name, Birth_Date, Gender, ET_IQ, ET_Gmath, ET_English, Training_Class, Evaluation_Notes, VTI_Account) VALUES
('Nguyen Van A', '2000-01-15', 'male', 15, 14, 16, 'Class01', 'Good at math', 'nguyenvana@vti.com'),
('Tran Thi B', '1999-03-10', 'female', 18, 17, 19, 'Class01', 'Excellent in all tests', 'tranthib@vti.com'),
('Le Van C', '2001-07-25', 'male', 12, 13, 11, 'Class02', 'Needs improvement in English', 'levanc@vti.com'),
('Pham Thi D', '2002-05-05', 'female', 16, 14, 15, 'Class03', 'Active and focused', 'phamthid@vti.com'),
('Hoang Van E', '1998-12-20', 'male', 10, 10, 10, 'Class02', 'Average performance', 'hoangvane@vti.com'),
('Do Thi F', '2000-09-17', 'female', 19, 18, 20, 'Class01', 'Top performer', 'dothif@vti.com'),
('Bui Van G', '2001-11-30', 'male', 14, 15, 13, 'Class03', 'Good progress', 'buivang@vti.com'),
('Vo Thi H', '1999-02-28', 'female', 13, 14, 15, 'Class02', 'Consistent improvement', 'vothih@vti.com'),
('Nguyen Thi Hong Anh', '1997-06-06', 'female', 17, 16, 18, 'Class01', 'Very hard-working', 'nguyenthihonganh@vti.com'),
('Truong Quang Duy Khai', '1998-04-01', 'male', 20, 19, 19, 'Class04', 'Excellent logic skills', 'truongqdkhai@vti.com');

-- Question 3
SELECT * FROM Trainee
WHERE 
    LENGTH(Full_Name) = (
        SELECT MAX(LENGTH(Full_Name)) FROM Trainee
    );

-- Question 4
SELECT *
FROM Trainee
WHERE 
    (ET_IQ + ET_Gmath) >= 20
    AND ET_IQ >= 8
    AND ET_Gmath >= 8
    AND ET_English >= 18;
    
-- Question 5
DELETE FROM Trainee WHERE TraineeID = 3;

-- Question 6
UPDATE Trainee
SET Training_Class = '2'
WHERE TraineeID = 5;