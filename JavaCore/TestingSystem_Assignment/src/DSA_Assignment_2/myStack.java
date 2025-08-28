package DSA_Assignment_2;

import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;

public class myStack {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        stack.push("1");
        stack.push("2");
        stack.push("3");
        stack.push("4");

        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        System.out.println("Delete Items");
        System.out.println("Show the number of items");
        System.out.println("Show min and max items");
        System.out.println("Find an item");
        System.out.println("Print all items");
        System.out.println("Exit");

        switch(choice){
            case 1: stack.pop();
            break;
            case 2:System.out.println(stack.size());
            break;
            case 3:System.out.println("min: " + Collections.min(stack));
            System.out.println("max: " + Collections.max(stack));
            break;
            case 4: System.out.println("Nhap phan tu can tim");
            String item_index = sc.nextLine();
            System.out.println("Vi tri phan tu can tim: " + stack.search(item_index));
            break;
            case 5:  System.out.println(stack);
            break;
            case 6: System.exit(0);
            default: break;
        }
    }
}
