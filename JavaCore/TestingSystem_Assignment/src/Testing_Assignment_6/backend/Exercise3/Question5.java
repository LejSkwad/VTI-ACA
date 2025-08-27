package Testing_Assignment_6.backend.Exercise3;

import java.util.Scanner;

public class Question5 {
    public static int inputAge() {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.print("Enter your age: ");
            String age_str = input.nextLine();

            try{
                int age = Integer.parseInt(age_str);
                if(age < 0){
                    System.out.println("Wrong inputing! The age must be greater than zero.");
                }else if(age > 0){
                    return age;
                }
            }catch(NumberFormatException e) {
                System.out.println("wrong inputing! Please input an age as int, input again.");
            }
        }
    }

    public static void main(String[] args) {
        inputAge();
    }
}
