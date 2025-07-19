package Lession2;

import entity.Account;
import entity.Department;

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

    public static Account question5(){
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
        int department = scanner.nextInt();
        System.out.print("Nhap position: ");
        int position = scanner.nextInt();

        return new Account();
        }
    }
}
