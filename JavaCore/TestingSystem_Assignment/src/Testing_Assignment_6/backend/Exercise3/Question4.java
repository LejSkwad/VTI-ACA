package Testing_Assignment_6.backend.Exercise3;

import Entity.Department;

import java.lang.classfile.ClassFile;

public class Question4 {
    public static void getIndex(int Index) {
        Department[] departments = {
                new Department(1, "Accounting"),
                new Department(2, "Boss of director"),
                new Department(3, "Marketing")
        };

        try{
            System.out.println("Deparment Name: " + departments[Index].getDepartmentName());
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Cannot find department");
        }
    }

    public static void main(String[] args) {
        getIndex(4);
    }
}
