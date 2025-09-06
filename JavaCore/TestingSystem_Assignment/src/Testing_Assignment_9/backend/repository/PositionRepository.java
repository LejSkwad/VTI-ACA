package Testing_Assignment_9.backend.repository;

import Testing_Assignment_9.backend.UTILS.SQLUtils;
import Testing_Assignment_9.entity.Position;

import java.sql.*;

import java.util.ArrayList;
import java.util.List;

public class PositionRepository implements IPositionRepository {
    private SQLUtils sqlUtils;
    public PositionRepository() {
        sqlUtils = new SQLUtils();
    }

    @Override
    public List<Position> findAll() {
        List<Position> list;
        try {
            Connection cn = sqlUtils.getConnection();

            String sql = "SELECT PositionID, PositionName FROM Position";
            list = new ArrayList<>();

            PreparedStatement ps = cn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Position position = new Position();
                position.setPositionID(rs.getInt("PositionID"));
                position.setPositionName(rs.getString("PositionName"));
                list.add(position);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return list;
    }
}
