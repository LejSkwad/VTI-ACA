package backend.Repository;

import entity.Manager;
import entity.Role;
import utils.JDBCutils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ManagerRepository implements IManagerRepository {
    private final JDBCutils db = new JDBCutils();

    @Override
    public List<Manager> findAll() {
        String sql = "SELECT id, fullname, email, password, exp_in_year, project_id FROM User WHERE UPPER(role) = 'MANAGER'";
        List<Manager> list = new ArrayList<>();
        try {
            Connection cn = db.getConnection();
            try (PreparedStatement ps = cn.prepareStatement(sql);
                 ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    list.add(mapRow(rs));
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException("findAll Managers failed", e);
        }
        return list;
    }

    private Manager mapRow(ResultSet rs) throws SQLException {
        int id = rs.getInt("id");
        String fullName = rs.getString("fullname");
        String email = rs.getString("email");
        String password = rs.getString("password");
        Role role = Role.valueOf("MANAGER");
        String experience = rs.getString("exp_in_year");
        int projectId = rs.getObject("project_id") == null ? null : rs.getInt("project_id");
        return new Manager(id, fullName, email, password,role ,experience, projectId);
    }

    @Override
    public boolean login(String email, String password) {
        String sql = "SELECT 1 FROM User WHERE UPPER(role) = 'MANAGER' AND email = ? AND password = ?";
        try {
            Connection cn = db.getConnection();
            try (PreparedStatement ps = cn.prepareStatement(sql)) {
                ps.setString(1, email);
                ps.setString(2, password);
                try (ResultSet rs = ps.executeQuery()) {
                    return rs.next();
                }
            }
        } catch (SQLException e) {
            throw new RuntimeException("Login manager failed", e);
        }
    }
}
