package org.example.Controller;

import org.example.Repository.QuestionRepository;
import org.example.Service.QuestionService;

public class GetQuestionController {
    public static void main(String[] args){
        QuestionRepository questionRepository = new QuestionRepository();
        QuestionService questionService = new QuestionService(questionRepository);

        System.out.println("Nhung Question co >2 correct answer");
        questionService.getQuestionHaving2Answer();
    }
}
