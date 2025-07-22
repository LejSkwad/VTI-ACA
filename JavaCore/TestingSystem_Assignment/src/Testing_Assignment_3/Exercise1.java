package Testing_Assignment_3;

import java.util.Random;
import java.util.Scanner;

public class Exercise1 {
    public static void question1(){
        double acc1_salary = 5240.5;
        double acc2_salary = 10970.055;

        int rounded_acc1_salary = (int) acc1_salary;
        int rounded_acc2_salary = (int) acc2_salary;

        System.out.println("Luong da lam tron " + rounded_acc1_salary);
        System.out.println("Luong da lam tron " + rounded_acc2_salary);
    }

    public static String question2(){
        Random rand = new Random();
        int i = rand.nextInt(100000);
        String fiveDigit = String.format("%05d", i);
        System.out.println("So co 5 chu so " + fiveDigit);
        return fiveDigit;
    }

    public static void question3(){
        String number = question2();
        String last_two = number.substring(number.length()-2);
        System.out.println("hai so cuoi: " + last_two);
    }

    public static void question4(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao 2 so nguyen");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        double c = (double) a / b;
        System.out.println(c);
    }
}
