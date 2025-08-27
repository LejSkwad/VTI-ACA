package Testing_Assignment_5.Exercise2;

import java.util.ArrayList;
import java.util.List;

public class MyStudent {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("1", "Nguyễn Văn A", 1));
        students.add(new Student("2", "Nguyễn Văn B", 1));
        students.add(new Student("3", "Nguyễn Văn C", 1));
        students.add(new Student("4", "Nguyễn Văn D", 2));
        students.add(new Student("5", "Nguyễn Văn E", 2));
        students.add(new Student("6", "Nguyễn Văn F", 2));
        students.add(new Student("7", "Nguyễn Văn G", 3));
        students.add(new Student("8", "Nguyễn Văn H", 3));
        students.add(new Student("9", "Nguyễn Văn I", 3));
        students.add(new Student("10", "Nguyễn Văn K", 3));

        for(Student student : students){
            student.diemdanh();
        }

        for(Student student : students){
            if(student.getGroup() == 1){
                student.hocbai();
            }
        }

        for(Student student : students){
            if(student.getGroup() == 2){
                student.didonvesinh();
            }
        }
    }
}
