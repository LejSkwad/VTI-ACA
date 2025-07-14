package Lession2;

import entity.Exam;

import java.time.format.DateTimeFormatter;

public class Exercise2 {
    public void question1(Exam[] exams){
        if (exams.length < 1) {
            System.out.println("Không có exam nào để kiểm tra.");
            return;
        }

        Exam exam = exams[0]; // Exam thứ 1 (chỉ số 0)

        DateTimeFormatter vnFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formattedDate = exam.getCreateDate().format(vnFormat);

        System.out.println("Exam ID: " + exam.getExamID());
        System.out.println("Code: " + exam.getCode());
        System.out.println("Title: " + exam.getTitle());
        System.out.println("Category: " + exam.getCategory().getCategoryName());
        System.out.println("Duration: " + exam.getDuration() + " phút");
        System.out.println("Creator: " + exam.getCreator().getFullName());
        System.out.println("Create Date: " + formattedDate);
    }
}
