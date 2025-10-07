package org.example.Controller;

import org.example.Entity.Answer;
import org.example.Entity.Question;
import org.example.Repository.AnswerRepositoryImp;
import org.example.Repository.QuestionRepositoryImp;
import org.example.Service.AnswerService;
import org.example.Service.QuestionService;

import java.util.Scanner;

public class CreateQuestionAnswerController {
    public static void main(String[] args){
        QuestionRepositoryImp questionRepositoryImp = new QuestionRepositoryImp();
        AnswerRepositoryImp answerRepositoryImp = new AnswerRepositoryImp();
        QuestionService questionService = new QuestionService(questionRepositoryImp);
        AnswerService answerService = new AnswerService(answerRepositoryImp);

        Scanner scanner = new Scanner(System.in);
        Question question = new Question();
        System.out.println("Question content");
        question.setContent(scanner.nextLine());
        questionService.create(question);

        System.out.println("Number of answers");
        int numberOfAnswers = Integer.parseInt(scanner.nextLine());
        for(int i = 0; i < numberOfAnswers; i++){
            Answer answer = new Answer();
            System.out.println("Enter Answer Content "+(i+1)+":");
            answer.setContent(scanner.nextLine());
            System.out.println("is Correct "+(i+1)+":");
            answer.setCorrect(scanner.nextBoolean());
            scanner.nextLine();
            answer.setQuestion(question);
            answerService.create(answer);
        }

    }

}
