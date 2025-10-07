package org.example.Controller;

import org.example.Entity.Position;
import org.example.Repository.PositionRepository;
import org.example.Repository.PositionRepositoryImp;

import java.util.Scanner;

public class CreatePositionController {
    public static void main(String[] args) {
        PositionRepository positionRepository = new PositionRepositoryImp();

        Scanner scanner = new Scanner(System.in);

        Position position = new Position();
        System.out.print("Enter Position Name: ");
        position.setPositionName(scanner.nextLine());
        System.out.print("Enter Salary: ");
        position.setSalary(scanner.nextDouble());
        positionRepository.save(position);
    }
}
