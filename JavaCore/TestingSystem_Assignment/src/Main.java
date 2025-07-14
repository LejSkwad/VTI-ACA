import Lession2.Exercise1;
import entity.Account;
import entity.Department;
import entity.Position;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Tạo Department và Position
        Department IT = new Department(1, "IT");
        Position dev = new Position(1, "Dev");

        //
        Account[] accounts = new Account[3];
        accounts[0] = new Account(1, "a1@gmail.com", "user1", "Nguyễn Văn A", IT, dev, LocalDate.now());
        accounts[1] = new Account(2, "a2@gmail.com", "user2", "Trần Thị B", IT, dev, LocalDate.now()); // <-- target
        accounts[2] = new Account(3, "a3@gmail.com", "user3", "Lê Văn C", IT, dev, LocalDate.now());

        Exercise1 ex1 = new Exercise1();
        ex1.question15();
    }
}