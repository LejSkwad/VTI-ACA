package Testing_Assignment_2;

import entity.Exam;

import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Exercise3 {
    public static void question1(Exam[] exams){
        Exam exam = exams[0];
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(exam.getExamID());
        System.out.println(exam.getCode());
        System.out.println(exam.getTitle());
        System.out.println(exam.getCategory());
        System.out.println(exam.getDuration());
        System.out.println(exam.getCreator());
        System.out.println(exam.getCreateDate().format(dtf));
    }

    public static void question2(Exam[] exams){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Exam ID: ");
        int examID = scanner.nextInt();
        boolean found = false;
        for(Exam exam : exams){
            if(examID == exam.getExamID()){
                System.out.println(exam.getCreateDate().format(dtf));
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println("Khong tim thay Exam");
        }
    }

    public static void question3(Exam[] exams) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Exam ID: ");
        int examID = scanner.nextInt();
        boolean found = false;
        for (Exam exam : exams) {
            if (examID == exam.getExamID()) {
                System.out.println(exam.getCreateDate().format(dtf));
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Khong tim thay Exam");
        }
    }

    public static void question4(Exam[] exams) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/yyyy");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Exam ID: ");
        int examID = scanner.nextInt();
        boolean found = false;
        for (Exam exam : exams) {
            if (examID == exam.getExamID()) {
                System.out.println(exam.getCreateDate().format(dtf));
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Khong tim thay Exam");
        }
    }

    public static void question5(Exam[] exams) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM-dd");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Exam ID: ");
        int examID = scanner.nextInt();
        boolean found = false;
        for (Exam exam : exams) {
            if (examID == exam.getExamID()) {
                System.out.println(exam.getCreateDate().format(dtf));
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Khong tim thay Exam");
        }
    }
}
