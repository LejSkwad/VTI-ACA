package Lession2;

import entity.Account;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Exercise2 {
    public void question1(){
        int i = 5;
        System.out.println(i);
    }

    public void question2(){
        int number = 100000000;
        System.out.printf("%,d\n", number);
    }

    public void question3(){
        double number = 5.567098;
        System.out.printf("%.4f\n", number);
    }
    public void question4(){
        String name;
        Scanner input = new Scanner(System.in);
        name = input.nextLine();
        System.out.printf("Tên tôi là \"%s\" và tôi đang độc thân\n", name);
    }

    public void question5(){
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter now_format = DateTimeFormatter.ofPattern("dd/MM/yyyy HH'h':mm'p':ss's'");
        String formattedTime = now.format(now_format);
        System.out.printf("%,d\n", formattedTime);
    }

    public void question6(Account[] accounts){
        // In tiêu đề bảng
        System.out.printf("%-5s | %-20s | %-10s | %-20s | %-10s | %-12s | %-12s\n",
                "ID", "Email", "Username", "Full Name", "Dept", "Position", "Create Date");
        System.out.println("------------------------------------------------------------------------------------------");

        // In thông tin account
        for (Account acc : accounts) {
            System.out.printf("%-5d | %-20s | %-10s | %-20s | %-10s | %-12s | %-12s\n",
                    acc.getAccountID(),
                    acc.getEmail(),
                    acc.getUsername(),
                    acc.getFullName(),
                    acc.getDepartment().getDepartmentName(),
                    acc.getPosition().getPositionName(),
                    acc.getCreateDate().toString());
        }
    }
}
