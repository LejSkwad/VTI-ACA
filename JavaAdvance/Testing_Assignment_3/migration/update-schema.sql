CREATE TABLE Account
(
    AccountID    INT AUTO_INCREMENT NOT NULL,
    Email        VARCHAR(255) NOT NULL,
    Username     VARCHAR(255) NOT NULL,
    FirstName    VARCHAR(255) NOT NULL,
    LastName     VARCHAR(255) NOT NULL,
    DepartmentID BIGINT       NOT NULL,
    CONSTRAINT pk_account PRIMARY KEY (AccountID)
);

CREATE TABLE Address
(
    AddressID   INT AUTO_INCREMENT NOT NULL,
    AddressName VARCHAR(255) NOT NULL,
    CONSTRAINT pk_address PRIMARY KEY (AddressID)
);

CREATE TABLE Answer
(
    Answers    INT AUTO_INCREMENT NOT NULL,
    Content    VARCHAR(255) NOT NULL,
    QuestionID INT          NOT NULL,
    isCorrect  BIT(1) NULL,
    CONSTRAINT pk_answer PRIMARY KEY (Answers)
);

CREATE TABLE CategoryQuestion
(
    CategoryID   INT AUTO_INCREMENT NOT NULL,
    CategoryName VARCHAR(255) NULL,
    CONSTRAINT pk_categoryquestion PRIMARY KEY (CategoryID)
);

CREATE TABLE Department
(
    DepartmentID   BIGINT AUTO_INCREMENT NOT NULL,
    DepartmentName VARCHAR(255) NOT NULL,
    CONSTRAINT pk_department PRIMARY KEY (DepartmentID)
);

CREATE TABLE DetailDepartment
(
    DepartmentID   INT NOT NULL,
    EmulationPoint INT NULL,
    AddressID      INT NULL,
    CONSTRAINT pk_detaildepartment PRIMARY KEY (DepartmentID)
);

CREATE TABLE Employee
(
    AccountID           INT NOT NULL,
    WorkingNumberOfYear INT NOT NULL,
    CONSTRAINT pk_employee PRIMARY KEY (AccountID)
);

CREATE TABLE Exam
(
    ExamID     INT AUTO_INCREMENT NOT NULL,
    code       VARCHAR(255) NULL,
    Title      VARCHAR(255) NULL,
    CategoryID INT      NOT NULL,
    Duration   INT      NOT NULL    DEFAULT 45,
    CreatorID  INT      NOT NULL,
    CreateDate datetime NOT NULL,
    CONSTRAINT pk_exam PRIMARY KEY (ExamID)
);

CREATE TABLE ExamQuestion
(
    ExamID     INT NOT NULL,
    QuestionID INT NOT NULL,
    CONSTRAINT pk_examquestion PRIMARY KEY (ExamID, QuestionID)
);

CREATE TABLE `Group`
(
    GroupID    INT AUTO_INCREMENT NOT NULL,
    GroupName  VARCHAR(255) NOT NULL,
    CreatorID  INT          NOT NULL,
    CreateDate datetime NULL,
    CONSTRAINT pk_group PRIMARY KEY (GroupID)
);

CREATE TABLE Manager
(
    AccountID           INT NOT NULL,
    WorkingNumberOfYear INT NOT NULL,
    CONSTRAINT pk_manager PRIMARY KEY (AccountID)
);

CREATE TABLE Question
(
    QuestionID INT AUTO_INCREMENT NOT NULL,
    Content    VARCHAR(255) NOT NULL,
    CategoryID INT          NOT NULL,
    TypeID     INT          NOT NULL,
    CreatorID  INT          NOT NULL,
    CreateDate datetime NULL,
    CONSTRAINT pk_question PRIMARY KEY (QuestionID)
);

CREATE TABLE TypeQuestion
(
    TypeID   INT AUTO_INCREMENT NOT NULL,
    TypeName VARCHAR(255) NOT NULL,
    CONSTRAINT pk_typequestion PRIMARY KEY (TypeID)
);

ALTER TABLE Account
    ADD CONSTRAINT uc_account_email UNIQUE (Email);

ALTER TABLE Account
    ADD CONSTRAINT uc_account_username UNIQUE (Username);

ALTER TABLE `Group`
    ADD CONSTRAINT uc_group_groupname UNIQUE (GroupName);

ALTER TABLE TypeQuestion
    ADD CONSTRAINT uc_typequestion_typename UNIQUE (TypeName);

ALTER TABLE Account
    ADD CONSTRAINT FK_ACCOUNT_ON_DEPARTMENTID FOREIGN KEY (DepartmentID) REFERENCES Department (DepartmentID);

ALTER TABLE Answer
    ADD CONSTRAINT FK_ANSWER_ON_QUESTIONID FOREIGN KEY (QuestionID) REFERENCES Question (QuestionID);

ALTER TABLE DetailDepartment
    ADD CONSTRAINT FK_DETAILDEPARTMENT_ON_ADDRESSID FOREIGN KEY (AddressID) REFERENCES Address (AddressID);

ALTER TABLE DetailDepartment
    ADD CONSTRAINT FK_DETAILDEPARTMENT_ON_DEPARTMENTID FOREIGN KEY (DepartmentID) REFERENCES Department (DepartmentID);

ALTER TABLE Employee
    ADD CONSTRAINT FK_EMPLOYEE_ON_ACCOUNTID FOREIGN KEY (AccountID) REFERENCES Account (AccountID);

ALTER TABLE ExamQuestion
    ADD CONSTRAINT FK_EXAMQUESTION_ON_EXAMID FOREIGN KEY (ExamID) REFERENCES Exam (ExamID);

ALTER TABLE ExamQuestion
    ADD CONSTRAINT FK_EXAMQUESTION_ON_QUESTIONID FOREIGN KEY (QuestionID) REFERENCES Question (QuestionID);

ALTER TABLE Exam
    ADD CONSTRAINT FK_EXAM_ON_CATEGORYID FOREIGN KEY (CategoryID) REFERENCES CategoryQuestion (CategoryID);

ALTER TABLE Exam
    ADD CONSTRAINT FK_EXAM_ON_CREATORID FOREIGN KEY (CreatorID) REFERENCES Account (AccountID);

ALTER TABLE `Group`
    ADD CONSTRAINT FK_GROUP_ON_CREATORID FOREIGN KEY (CreatorID) REFERENCES Account (AccountID);

ALTER TABLE Manager
    ADD CONSTRAINT FK_MANAGER_ON_ACCOUNTID FOREIGN KEY (AccountID) REFERENCES Account (AccountID);

ALTER TABLE Question
    ADD CONSTRAINT FK_QUESTION_ON_CATEGORYID FOREIGN KEY (CategoryID) REFERENCES CategoryQuestion (CategoryID);

ALTER TABLE Question
    ADD CONSTRAINT FK_QUESTION_ON_CREATORID FOREIGN KEY (CreatorID) REFERENCES Account (AccountID);

ALTER TABLE Question
    ADD CONSTRAINT FK_QUESTION_ON_TYPEID FOREIGN KEY (TypeID) REFERENCES TypeQuestion (TypeID);