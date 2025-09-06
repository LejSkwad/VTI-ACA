package backend.Repository;

import entity.Employee;
import entity.Proskill;
import entity.Role;
import entity.User;
import utils.JDBCutils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository implements IEmployeeRepository {
    private final JDBCutils jdbcutils = new JDBCutils();

    @Override
    public List<Employee> findEmployeeByProjectId(int project_id) {
        String sql = "SELECT id, fullname, password, email,role, pro_skill, project_id FROM User Where project_id = ?";
        List<Employee> list = new ArrayList<>();
        try{
            Connection connection = jdbcutils.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, project_id);
            ResultSet rs = statement.executeQuery();
            while(rs.next()){
                list.add(mapRow(rs));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return list;
    }
    private Employee mapRow(ResultSet rs) throws SQLException {
        int id = rs.getInt("id");
        String fullName = rs.getString("fullname");
        String email = rs.getString("email");
        String password = rs.getString("password");
        Role role = Role.valueOf(rs.getString("role"));
        int project_id = rs.getInt("project_id");
        String proSkillStr = rs.getString("pro_skill");
        Proskill pro_skill = null;
        if (proSkillStr != null && !proSkillStr.isBlank()) {
            try {
                pro_skill = Proskill.valueOf(proSkillStr.trim().toUpperCase());
            } catch (IllegalArgumentException e) {
                // Nếu trong DB có giá trị không hợp lệ thì bỏ qua hoặc log
                pro_skill = null;
            }
        }
        return new Employee(id, fullName,email, password, role , pro_skill,project_id);
    }
}
