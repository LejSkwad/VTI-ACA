import Lession2.Exercise1;
import entity.Account;
import entity.Department;
import entity.GroupAccount;
import entity.Position;
import entity.Group;

import java.time.LocalDate;

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

        Exercise1 ex1 = new Exercise1();
        ex1.question16(accounts, departments);
    }
}