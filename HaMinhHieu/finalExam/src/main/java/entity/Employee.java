package entity;

public class Employee extends User{
    private Proskill pro_skill;
    private int project_id;

    public Employee(int id,String fullname,String email,String password,Role role,Proskill pros_kill, int project_id) {
        super(id,fullname,email,password,role);
        this.pro_skill = pro_skill;
        this.project_id = project_id;
    }
    public Proskill getProskill() {
        return pro_skill;
    }
    public void setProskill(Proskill proskill) {
        this.pro_skill = proskill;
    }
    public int getProject_id() {
        return project_id;
    }
    public void setProject_id(int project_id) {
        this.project_id = project_id;
    }
}
