package com.codegym.repository;

import com.codegym.model.User;

import java.sql.SQLException;
import java.util.List;

public interface IUserRepository {
    public void insertUser(User user) throws SQLException;
    public User selectUser(int id) throws SQLException;
    public List<User> selectAllUsers() throws SQLException;
    public boolean deleteUser(int id) throws SQLException;
    public void updateUser(User user) throws SQLException;
}
