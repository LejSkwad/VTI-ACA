package Testing_Assignment_2;

import Entity.Account;

public class Exercise6 {
    public static void question1(){
        for(int i = 1; i < 10; i++){
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
    }

    public static void question2(Account[] accounts){
        for(Account acc : accounts){
            System.out.println("ID: " + acc.getAccountID());
            System.out.println("Email: " + acc.getEmail());
            System.out.println("Username: " + acc.getUsername());
            System.out.println("Full Name: " + acc.getFullName());
            System.out.println("Department: " + (acc.getDepartment().getDepartmentName()));
            System.out.println("Position: " + (acc.getPosition().getPositionName()));
            System.out.println("Create Date: " + acc.getCreateDate());

        }
    }

    public static void question3(Account[] accounts){
        for(int i = 1; i < 10; i++){
            System.out.println(i);
        }
    }
}
