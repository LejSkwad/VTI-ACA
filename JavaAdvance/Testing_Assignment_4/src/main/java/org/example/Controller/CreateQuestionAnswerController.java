package org.example.Controller;

import org.example.Entity.Answer;
import org.example.Entity.Question;
import org.example.Repository.AnswerRepository;
import org.example.Repository.QuestionRepository;
import org.example.Service.AnswerService;
import org.example.Service.QuestionService;

import java.util.Scanner;

public class CreateQuestionAnswerController {
    public static void main(String[] args){
        QuestionRepository questionRepository = new QuestionRepository();
        AnswerRepository answerRepository = new AnswerRepository();
        QuestionService questionService = new QuestionService(questionRepository);
        AnswerService answerService = new AnswerService(answerRepository);

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
