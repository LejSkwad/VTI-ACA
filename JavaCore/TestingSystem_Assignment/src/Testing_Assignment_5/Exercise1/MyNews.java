package Testing_Assignment_5.Exercise1;

import java.util.Scanner;

public class MyNews {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Insert news: ");
        System.out.print("View list news: ");
        System.out.print("Average rate: ");
        System.out.print("Exit: ");
        int choice = input.nextInt();
        switch(choice) {
            case 1:News new1 = new News();
            System.out.print("Enter department: ");
            String department = input.next();
        }

    }
}
