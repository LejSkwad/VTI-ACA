package Testing_Assignment_3;

import Entity.Department;
import Entity.Position;


public class Exercise5 {
    public static void question1(Department[] departments){
        System.out.println(departments[0].toString());
    }

    public static void question2(Position[] positions){
        System.out.println(positions[0].toString());
    }

    public static void question3(Department[] departments){
        System.out.println(Integer.toHexString(System.identityHashCode(departments[0])));
    }

    public static void question4(Department[] departments){
        if(departments[0].getDepartmentName().equals("Phong A")){
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }

    public static void question5(Department[] departments){
        if(departments[0].getDepartmentName().equals(departments[1].getDepartmentName())){
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
