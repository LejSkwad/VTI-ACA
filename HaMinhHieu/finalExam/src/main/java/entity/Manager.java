package entity;

public class Manager extends User{
    private String experience;
    private int project_id;

    public Manager(int id, String fullname, String email, String password, Role role, String experience, int project_id) {
        super(id, fullname,email,password,role);
        this.experience = experience;
        this.project_id = project_id;
    }
    public String getExperience() {
        return experience;
    }
    public void setExperience(String experience) {
        this.experience = experience;
    }
    public int getProject_id() {
        return project_id;
    }
    public void setProject_id(int project_id) {
        this.project_id = project_id;
    }
}
