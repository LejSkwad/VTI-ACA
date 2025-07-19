import Lession2.*;
import entity.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {

        Department[] departments = new Department[2];
        departments[0] = new Department(1,"IT");
        departments[1] = new Department(2,"Sale");

        Position[] positions = new Position[2];
        positions[0] = new Position(1, "Dev");
        positions[1] = new Position(2, "BA");

        Account[] accounts = new Account[3];
        accounts[0] = new Account(1, "a1@gmail.com", "user1", "Nguyễn Văn A", departments[0], positions[0], LocalDate.now());
        accounts[1] = new Account(2, "a2@gmail.com", "user2", "Trần Thị B", departments[0], positions[1], LocalDate.now());
        accounts[2] = new Account(3, "a3@gmail.com", "user3", "Lê Văn C", departments[1], positions[1], LocalDate.now());

        Group g1 = new Group(1, "Java Fresher", null, LocalDate.now());
        Group g2 = new Group(2, "C# Fresher", null, LocalDate.now());
        Group g3 = new Group(3, "Python Master", null, LocalDate.now());
        Group g4 = new Group(4, "UI/UX", null, LocalDate.now());

        GroupAccount[] groupAccounts = new GroupAccount[]{
                new GroupAccount(g1, accounts[1], LocalDate.now()),
                new GroupAccount(g2, accounts[1], LocalDate.now()),
                new GroupAccount(g3, accounts[2], LocalDate.now()),
                new GroupAccount(g4, accounts[0], LocalDate.now())
        };
        CategoryQuestion[] categoryQuestions = new CategoryQuestion[]{
                new CategoryQuestion(1,"Java"),
                new CategoryQuestion(2,"SQL"),
                new CategoryQuestion(3,"Python")
        };

        Exam[] exams = new Exam[]{
                new Exam(1, "JV01", "Đề kiểm tra Java cơ bản", categoryQuestions[0], 60, accounts[0], LocalDateTime.of(2025, 7, 19, 10, 0, 0)),
                new Exam(2, "SQL01", "Đề kiểm tra SQL nâng cao", categoryQuestions[1], 90, accounts[1], LocalDateTime.of(2025, 7, 20, 14, 15, 0)),
                new Exam(3, "PY01", "Đề Python OOP", categoryQuestions[2], 45, accounts[2], LocalDateTime.of(2025, 7, 21, 16, 45, 0)),
                new Exam(4, "JV02", "Java Collections Test", categoryQuestions[0], 75, accounts[2], LocalDateTime.of(2025, 7, 22, 9, 0, 0))
        };

        //Exercise1.question16(accounts, departments);

        //Exercise2.question6(accounts);

        //Exercise3.question3(exams);

        //Exercise4.question4();

        Exercise5.question1();
    }
}