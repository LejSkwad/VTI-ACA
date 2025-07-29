package Testing_Assignment_3;

import java.util.Scanner;

public class Exercise4 {
    public static void question1(){
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        String[] words = str.trim().split("\\s+");
        System.out.println(words.length);
    }

    public static void question2(){
        Scanner input = new Scanner(System.in);
        String str1 = input.nextLine();
        String str2 = input.nextLine();
        String finalstr = str1.concat(str2);
        System.out.println(finalstr);
    }

    public static void question3(){
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        char firstChar = str.charAt(0);
        if(Character.isLowerCase(firstChar)) {
            firstChar = Character.toUpperCase(firstChar);
        }
        String finalstr = firstChar + str.substring(1);
    }

    public static void question4(){
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        for(int j=0;j<str.length();j++){
            char ch = str.charAt(j);
            ch = Character.toUpperCase(ch);
            System.out.println("Ký tự thứ " + (j+1) + " là " + ch);
        }
    }
    public static void question5(){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap vao ho: ");
        String ho = input.nextLine();
        System.out.println("Nhap vao ten: ");
        String ten = input.nextLine();
        System.out.println(ho.concat(" " + ten));
    }

    public static void question6(){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap vao day du ho va ten: ");
        String str = input.nextLine();
        String[] words = str.trim().split("\\s+");
        StringBuilder stringbuilder = new StringBuilder();
        for (int i = 1; i < words.length - 1; i++) {
            stringbuilder.append(words[i]);
            stringbuilder.append(" ");
        }
        System.out.println("Ho: " + words[0]);
        System.out.println("Ten dem: " + stringbuilder);
        System.out.println("Ten rieng: " + words[words.length - 1]);
    }

    public static void question7(){
    }
}
