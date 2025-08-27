package Testing_Assignment_6.backend.Exercise1;

public class Student {
    private String id;
    private String name;
    private static String college;
    private static int moneyGroup = 0;
    private static int count = 0;

    public Student(String id, String name) {
        if(count >= 7){
            throw new RuntimeException("Da den gioi han nhap Studen");
        }
        this.id = id;
        this.name = name;
        count++;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCollege() {
        return college;
    }
    public static void setCollege(String college) {
        Student.college = college;
    }
    public static int getMoneyGroup() {
        return moneyGroup;
    }
    public static void setMoneyGroup(int moneyGroup) {
        Student.moneyGroup = moneyGroup;
    }
    public static int getCount() {
        return count;
    }

    public void display(){
        System.out.println("Student ID: " + id);
        System.out.println("Student Name: " + name);
        System.out.println("Student College: " + college);
    }
}
