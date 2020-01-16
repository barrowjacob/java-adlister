package com.codeup.adlister.dao;

import com.codeup.adlister.models.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class MySQLUsersDao implements Users{
            Connection connection = null;

    public MySQLUsersDao(Config config) {
        try {
            DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            connection = DriverManager.getConnection(
                    config.getUrl(),
                    config.getUser(),
                    config.getPassword()
            );
        } catch (SQLException e) {
            throw new RuntimeException("Error connecting to the database!", e);
        }
    }

    @Override
    public User findByUsername(String username) {
        User result;
        try {
            String findQuery = "SELECT * FROM users WHERE username LIKE ?";
            PreparedStatement stmt = connection.prepareStatement(findQuery);
            stmt.setString(1, username);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                result = new User(rs.getLong("id"), rs.getString("username"), rs.getString("email"), rs.getString("password"));
                return result;
            } else {
                return null;
            }
        } catch (SQLException e) {
            throw new RuntimeException("Error retrieving all users.", e);
        }
    }

    @Override
    public Long insert(User user) {
        try {
            PreparedStatement stmt = connection.prepareStatement(createInsertQuery(user), Statement.RETURN_GENERATED_KEYS);
            stmt.executeUpdate();
            ResultSet rs = stmt.getGeneratedKeys();
            rs.next();
            return rs.getLong(1);
        } catch (SQLException e) {
            throw new RuntimeException("Error creating a new ad.", e);
        }
    }



    private String createInsertQuery(User user) {
        return "INSERT INTO users(username, email, password) VALUES "
                + "('" + user.getUsername() + "', "
                + "'" + user.getEmail() +"', "
                + "'" + user.getPassword() + "')";
    }

    public List<User> all() throws SQLException {
        String allQuery = "SELECT * FROM users";
        PreparedStatement stmt = connection.prepareStatement(allQuery);
        ResultSet rs = stmt.executeQuery();
        rs.next();
        return createUsersFromResults(rs);
    }



    public List<User> createUsersFromResults(ResultSet rs) throws SQLException {
        List<User> allUsers = new ArrayList<>();
        while (rs.next()) {
            allUsers.add(extractUser(rs));
        }
        return allUsers;
    }
    private User extractUser(ResultSet rs) throws SQLException{
        return new User(
                rs.getLong("id"),
                rs.getString("username"),
                rs.getString("email"),
                rs.getString("password")
        );
    }

    public static void main(String[] args) throws SQLException {
        User nanDrew = new User("nandrew","yesmail","123");
        DaoFactory.getUsersDao().insert(nanDrew);

        DaoFactory.getUsersDao().findByUsername("pandas");
    }

}
