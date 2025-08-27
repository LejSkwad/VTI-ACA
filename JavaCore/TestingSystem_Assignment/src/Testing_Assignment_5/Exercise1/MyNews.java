package Testing_Assignment_5.Exercise1;

import java.util.Scanner;

public class MyNews {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Insert news: 1");
        System.out.println("View list news: 2");
        System.out.println("Average rate: 3");
        System.out.println("Exit: 4");
        int choice = input.nextInt();
        News news = new News();
        int[] rates = new int[3];
        switch(choice) {
            case 1: System.out.println("Enter title: ");
                    String title = input.nextLine();
                    System.out.println("Enter publishDate: ");
                    String publishDate = input.nextLine();
                    System.out.println("Enter author: ");
                    String author = input.nextLine();
                    System.out.println("Enter content: ");
                    String content = input.nextLine();
                    System.out.println("Enter rates: ");
                    for(int i = 0; i < rates.length; i++) {
                        rates[i] = input.nextInt();
                    }
                    break;

            case 2: news.Display();
                    break;
            case 3: news.Calculate(rates);
                    break;
            case 4: System.exit(0);
            default: break;
        }
    }
}
