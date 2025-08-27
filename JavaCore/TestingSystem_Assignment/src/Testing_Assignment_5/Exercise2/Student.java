package Testing_Assignment_5.Exercise2;

public class Student implements IStudent {
    private String id;
    private String name;
    private int group;

    public Student(String  id, String name, int group) {
        this.id = id;
        this.name = name;
        this.group = group;
    }

    public String getId(){return id;}
    public String getName(){return name;}
    public int getGroup(){return group;}

    public void setId(String id){this.id = id;}
    public void setName(String name){this.name = name;}
    public void setGroup(int group){this.group = group;}

    @Override
    public void diemdanh() {
        System.out.println(name + "diem danh");
    }

    @Override
    public void hocbai() {
        System.out.println(name + "hoc bai");
    }

    @Override
    public void didonvesinh() {
        System.out.println(name + "didonvesinh");
    }
}
