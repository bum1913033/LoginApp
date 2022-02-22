package org.personal.loginapp.dao.impl;

import org.personal.loginapp.connectionfactory.ConnectionFactory;
import org.personal.loginapp.dao.LoginDao;
import org.personal.loginapp.model.Login;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDaoImpl implements LoginDao {
    private static Connection connection;

    private static PreparedStatement preparedStatement;

    private static ResultSet resultSet;

    public Login validate(Login login){
        final String QUERY = "SELECT * FROM user WHERE userName = ? AND password=?";
        try{
            connection = ConnectionFactory.getConnection();
            preparedStatement=connection.prepareStatement(QUERY);
            preparedStatement.setString(1, login.getUserName());
            preparedStatement.setString(2, login.getPassword());
            resultSet = preparedStatement.executeQuery();

            Login user = new Login();
            while(resultSet.next()){
                user.setFirstName(resultSet.getString("firstName"));
                user.setLastName(resultSet.getString("lastName"));
                return user;
            }

        }catch(SQLException | ClassNotFoundException ex){
            ex.printStackTrace();
        }
        return null;
    }
}
