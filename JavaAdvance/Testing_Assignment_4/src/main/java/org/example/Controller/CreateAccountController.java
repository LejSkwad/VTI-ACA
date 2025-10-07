package org.example.Controller;

import org.example.Entity.Account;
import org.example.Repository.AccountRepository;
import org.example.Repository.AccountRepositoryImp;
import org.example.Service.AccountService;

import java.util.Scanner;

public class CreateAccountController {
    public static void main(String[] args){
        AccountRepository accountRepository = new AccountRepositoryImp();
        AccountService accountService = new AccountService(accountRepository);

        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter DepartmentID:");
        String department = scanner.nextLine();
        System.out.println("Enter Position Name:");
        String position = scanner.nextLine();
        System.out.println("Enter Email Address:");
        String email = scanner.nextLine();
        accountService.createAccount(department,position,email);
    }
}
