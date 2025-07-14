CREATE DATABASE Extra_Assignment_1_2;
Use Extra_Assignment_1_2;

CREATE TABLE Trainee (
    TraineeID INT AUTO_INCREMENT PRIMARY KEY,
    Full_Name VARCHAR(100) NOT NULL,
    Birth_Date DATE NOT NULL,
    Gender ENUM('male', 'female', 'unknown') NOT NULL,
    ET_IQ TINYINT UNSIGNED NOT NULL,
    ET_Gmath TINYINT UNSIGNED NOT NULL,
    ET_English TINYINT UNSIGNED NOT NULL,
    Training_Class VARCHAR(20),
    Evaluation_Notes TEXT,
    VTI_Account VARCHAR(50) NOT NULL UNIQUE
	);	

CREATE TABLE Exercise2 (
    ID MEDIUMINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    Name VARCHAR(50),
    Code CHAR(5),
    ModifiedDate TIMESTAMP
	);
    
CREATE TABLE Excercise3 (
    ID MEDIUMINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    Name VARCHAR(50),
    BirthDate DATE,
    Gender TINYINT,
    IsDeletedFlag TINYINT
	);