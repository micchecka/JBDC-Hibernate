package jm.task.core.jdbc.dao;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.util.Util;


import java.sql.*;
import java.util.ArrayList;
import java.util.List;


//import static jm.task.core.jdbc.util.Util.getConnection;

public class UserDaoJDBCImpl implements UserDao {
    public UserDaoJDBCImpl() {
    }

    private final Util util = new Util();

    public void createUsersTable() {
//        try (Connection connection = util.getConnection();
//             Statement statement = connection.createStatement()) {
//            statement.executeUpdate("CREATE TABLE IF NOT EXISTS users(id BIGINT NOT NULL AUTO_INCREMENT PRIMARY KEY, name VARCHAR(255), lastname VARCHAR(255),age  TINYINT(3))");
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
    }

    public void dropUsersTable() {
//        try (Connection connection = util.getConnection();
//             Statement statement = connection.createStatement()) {
//            statement.executeUpdate("DROP TABLE IF EXISTS users");
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
    }

    public void saveUser(String name, String lastName, byte age) {
//        try (Connection connection = util.getConnection();
//             PreparedStatement ps = connection.prepareStatement("INSERT INTO users(name, lastName, age) VALUES(?, ?, ?)")) {
//            ps.setString(1, name);
//            ps.setString(2, lastName);
//            ps.setByte(3, age);
//            ps.executeUpdate();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
    }

    public void removeUserById(long id) {
//        try (Connection connection = util.getConnection();
//             PreparedStatement ps = connection.prepareStatement("DELETE FROM users WHERE id = ?")) {
//            ps.setLong(1, id);
//            ps.executeUpdate();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
    }

    public List<User> getAllUsers() {
//        List<User> l = new ArrayList<>();
//        try (Connection connection = util.getConnection();
//             Statement statement = connection.createStatement(); ResultSet rs = statement.executeQuery("SELECT * FROM users")) {
//            while (rs.next()) {
//                User user = new User(rs.getString("name"), rs.getString("lastName"), rs.getByte("age"));
//                user.setId(rs.getLong("id"));
//                l.add(user);
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return l;
        return null;
    }

    public void cleanUsersTable() {
//        try (Connection connection = util.getConnection();
//             Statement statement = connection.createStatement()) {
//            statement.executeUpdate("TRUNCATE TABLE users");
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//    }
    }
}
