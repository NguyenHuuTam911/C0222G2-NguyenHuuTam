package com.codegym.repository;

import com.codegym.model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserRepositoryImpl implements IUserRepository {
    private BaseRepository baseRepository = new BaseRepository();
    static List<User> userList = new ArrayList<>();
    private static final String INSERT_USERS_SQL = "insert into users(name,email,country) values(?,?,?);";
    private static final String SELECT_ALL_USERS = "select * from users";
    private static final String SELECT_USER_BY_ID = "select id , name , email , country  from users where id =?";
    private static final String UPDATE_USERS_SQL = "update users set name = ?,email = ?,country = ? where id = ?;";
    private static final String DELETE_USER_SQL = "delete from users where id = ?";
    @Override
    public void insertUser(User user)  {

        Connection connection = baseRepository.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL);
            preparedStatement.setString(1, user.getName());
            preparedStatement.setString(2, user.getEmail());
            preparedStatement.setString(3, user.getCountry());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public User selectUser(int id) throws SQLException {
        User user = null;
        Connection connection = new BaseRepository().getConnection();
        try (PreparedStatement preparedStatement = connection.prepareStatement(SELECT_USER_BY_ID)) {
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                String name = resultSet.getString("name");
                String email = resultSet.getString("email");
                String country = resultSet.getString("country");
                user = new User(id, name, email, country);
            }
        }
        return user;

    }

    @Override
    public List<User> selectAllUsers() throws SQLException {
        List<User> users = new ArrayList<>();
        Connection connection = new BaseRepository().getConnection();
        try (PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_USERS)) {
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String email = resultSet.getString("email");
                String country = resultSet.getString("country");
                users.add(new User(id, name, email, country));
            }

        }
        return users;
    }

    @Override
    public boolean deleteUser(int id) throws SQLException {
      boolean rowDeleted;
      try(Connection connection = new BaseRepository().getConnection();
      PreparedStatement preparedStatement = connection.prepareStatement(DELETE_USER_SQL)){
          preparedStatement.setInt(1,id);
          rowDeleted = preparedStatement.executeUpdate()>0;
      }
      return rowDeleted;
    }

    @Override
    public void updateUser(User user) throws SQLException {

        try (Connection connection = new BaseRepository().getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_USERS_SQL)) {
            preparedStatement.setString(1,user.getName());
            preparedStatement.setString(2,user.getEmail());
            preparedStatement.setString(3,user.getCountry());
            preparedStatement.setInt(4,user.getId());
            preparedStatement.executeUpdate();

        }
    }
}
