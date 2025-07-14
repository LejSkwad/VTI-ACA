CREATE DATABASE Testing_System_Assignment_1;
USE Testing_System_Assignment_1;

CREATE TABLE Department (
	DepartmentID int auto_increment primary key,
    DepartmentName varchar(255)
    );

CREATE TABLE Position (
	PositionID int auto_increment primary key,
    PositionName varchar(255)
    );
    
CREATE TABLE Account (
	AccountID int auto_increment primary key,
	Email varchar(255),
    FullName varchar(255),
    Username varchar(255),
    DepartmentID int,
    PositionID int,
    CreateDate date,
    Foreign key (DepartmentID) References Department (DepartmentID),
    foreign key (PositionID) References Position (PositionID)
    );

CREATE TABLE `Group` ( 
	GroupID int auto_increment primary key,
    GroupName varchar(255),
    CreatorID int,
	CreateDate date,
    Foreign key (CreatorID) references Account (AccountID)
    );

CREATE TABLE GroupAccount (
	GroupID int,
    AccountID int,
    JoinDate date,
    Foreign key (GroupID) references `Group` (GroupID),
    foreign key (AccountID) references Account (AccountID)
    );
    
CREATE TABLE TypeQuestion (
	TypeID int auto_increment primary key, 
    TypeName varchar(255)
    );

CREATE TABLE CategoryQuestion (
	CategoryID int auto_increment primary key,
    CategoryName varchar(255)
    );
   
CREATE TABLE Question (
	QuestionID int auto_increment primary key,
	Content varchar(255),
    CategoryID int,
    TypeID int,
    CreatorID int,
    CreateDate date,
    foreign key (CategoryID) references	CategoryQuestion (CategoryID),
    foreign key (TypeID) references TypeQuestion (TypeID),
    Foreign key (CreatorID) references Account (AccountID)
    );
    
CREATE TABLE Answer (
	AnswerID int auto_increment primary key,
    Content varchar(255),
    QuestionID int,
    isCorrect tinyint(1),
    foreign key (QuestionID) references Question (QuestionID)
    );
    
CREATE TABLE Exam (
	ExamID int auto_increment primary key,
    Code int,
    Title varchar(255),
    CategoryID int,
    Duration int,
    CreatorID int,
    CreateDate date,
    foreign key (CategoryID) references CategoryQuestion (CategoryID),
    foreign key (CreatorID) references Account (AccountID)
    );

CREATE TABLE ExamQuestion (
	ExamID int,
    QuestionID int,
    Foreign key (ExamID) references Exam(ExamID),
    Foreign key (QuestionID) references Question(QuestionID)
    );