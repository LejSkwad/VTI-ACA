package Testing_Assignment_3;

import Entity.Account;

import java.time.LocalDate;

public class Exercise2 {
    public static void question() {
        Account[] accounts = new Account[5];
        for (int i = 0; i < accounts.length; i++) {
            String name = "name" + i;
            String username = "username" + i;
            String fullname = "fullname" + i;
            LocalDate dob = LocalDate.now();

            accounts[i] = new Account(i+1,name,username,fullname,null,null,dob);
        }
    }
}
