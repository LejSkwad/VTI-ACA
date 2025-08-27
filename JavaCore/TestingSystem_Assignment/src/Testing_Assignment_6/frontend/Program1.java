package Testing_Assignment_6.frontend;

import Testing_Assignment_6.backend.Exercise1.PrimaryStudent;
import Testing_Assignment_6.backend.Exercise1.SecondaryStudent;
import Testing_Assignment_6.backend.Exercise1.Student;

import java.util.ArrayList;
import java.util.List;

public class Program1 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("1", "Nguyễn Văn A"));
        students.add(new Student("2", "Nguyễn Văn B"));
        students.add(new Student("3", "Nguyễn Văn C "));

        Student.setCollege("Đai học bách khoa");

        for(Student s : students){
            s.display();
        }

        Student.setCollege("DH CONG NGHE");

        for(Student s : students) {
            s.display();
        }
        //-------------------------------------------------------------//
        System.out.println("Cac hoc sinh nop 100k");
        Student.setMoneyGroup(Student.getMoneyGroup() + 100000 * students.size());
        System.out.println("hoc sinh 1 rut 50k");
        Student.setMoneyGroup(Student.getMoneyGroup() - 50000);
        System.out.println("hoc sinh 2 rut 20k");
        Student.setMoneyGroup(Student.getMoneyGroup() - 20000);
        System.out.println("hoc sinh 3 rut 150k");
        Student.setMoneyGroup(Student.getMoneyGroup() - 150000);
        System.out.println("ca nhom moi ng dong them 50k");
        Student.setMoneyGroup(Student.getMoneyGroup() + 50000 * students.size());

        //-----------------------------------------------------------//
        System.out.println("So student duoc tao:" + Student.getCount());


        // Tạo 6 Student: 2 Primary, 4 Secondary
        Student s1 = new PrimaryStudent("1", "Nguyễn Văn A");
        Student s2 = new PrimaryStudent("2", "Nguyễn Văn B");

        Student s3 = new SecondaryStudent("3", "Nguyễn Văn C");
        Student s4 = new SecondaryStudent("4", "Nguyễn Văn D");
        Student s5 = new SecondaryStudent("5", "Nguyễn Văn E");
        Student s6 = new SecondaryStudent("6", "Nguyễn Văn F");

        System.out.println("Tổng số Student: " + Student.getCount());
        System.out.println("Số PrimaryStudent: " + PrimaryStudent.getCount());
        System.out.println("Số SecondaryStudent: " + SecondaryStudent.getCount());
    }
}
