package org.example.Controller;

import org.example.Repository.QuestionRepositoryImp;
import org.example.Service.QuestionService;

public class GetQuestionController {
    public static void main(String[] args){
        QuestionRepositoryImp questionRepositoryImp = new QuestionRepositoryImp();
        QuestionService questionService = new QuestionService(questionRepositoryImp);

        System.out.println("Nhung Question co >2 correct answer");
        questionService.getQuestionHaving2Answer();
    }
}
