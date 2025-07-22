package Testing_Assignment_2;

import Entity.*;


import java.time.LocalDate;
import java.util.Scanner;

public class Exercise5 {
    public static void question1(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap 3 so nguyen: ");
        int i  = scanner.nextInt();
        int y = scanner.nextInt();
        int j = scanner.nextInt();
    }

    public static void question2(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap 2 so thuc: ");
        float f = scanner.nextFloat();
        float s = scanner.nextFloat();
    }

    public static void question3(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ten: ");
        String name = scanner.nextLine();
    }

    public static void question4(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ngay sinh: ");
        String  birthday = scanner.nextLine();
    }

    public static Account question5(Department[] departments){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap ID: ");
        int id = scanner.nextInt();

        System.out.print("Nhap email: ");
        String email = scanner.nextLine();

        System.out.print("Nhap username: ");
        String username = scanner.nextLine();

        System.out.print("Nhap full name: ");
        String fullName = scanner.nextLine();

        System.out.print("Nhap department: ");
        int department_choice = scanner.nextInt();
        Department department = null;
        for(Department d : departments) {
            if (department_choice == d.getDepartmentID()) {
                department = new Department(department_choice, d.getDepartmentName());
            }
        }

        System.out.print("Nhap position: ");
        System.out.println("1. Dev");
        System.out.println("2. Test");
        System.out.println("3. ScrumMaster");
        System.out.println("4. PM");
        int position_choice = scanner.nextInt();
        Position position = null;
        switch (position_choice) {
            case 1:
                position = new Position(1,"Dev");
                break;
            case 2:
                position = new Position(2, "Test");
                break;
            case 3:
                position = new Position(3, "ScrumMaster");
                break;
            case 4:
                position = new Position(4, "PM");
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ, vui lòng thử lại.");
        }

        LocalDate createDate = LocalDate.now();

        return new Account(id,email,username,fullName,department,position,createDate);
    }

    public static Department question6(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ID department: ");
        int id = scanner.nextInt();

        System.out.print("Nhap Department Name: ");
        String name = scanner.nextLine();

        return new Department(id,name);
    }

    public static void question7(){
        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            System.out.print("Nhap 1 so chan: ");
            number = scanner.nextInt();
        }while(number % 2 != 0 );
    }

    public static void question8(Department[] departments) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Nhap chuc nang ban muon dung:");
            System.out.println("1. tao account");
            System.out.println("2. tao department");
            System.out.print("khac: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    question5(departments);
                    break;
                case 2:
                    question6();
                    break;
                default:
                    System.out.println("Moi ban nhap lai\n");
            }
        }
    }

    public static GroupAccount question9(Account[] accounts, Group[] groups) {
        Scanner scanner = new Scanner(System.in);
        //B1
        System.out.print("Danh sach username: ");
        for(Account a : accounts) {
            System.out.println(a.getUsername());
        }
        //B2
        System.out.print("Nhap ten nguoi dung: ");
        String username = scanner.nextLine();
        Account account = null;
        for(Account a : accounts) {
            if(a.getUsername().equals(username)) {
                account = a;
            }
        }
        //B3
        System.out.print("Danh sach group: ");
        for(Group group : groups) {
            System.out.println(group.getGroupName());
        }
        //B4
        System.out.print("Nhap ten group: ");
        String groupName = scanner.nextLine();
        Group group = null;
        for(Group g : groups) {
            if(g.getGroupName().equals(groupName)) {
                group = g;
            }
        }
        //B5
        LocalDate createDate = LocalDate.now();
        return new GroupAccount(group, account, createDate);
    }

    public static void question10(){

    }
}
