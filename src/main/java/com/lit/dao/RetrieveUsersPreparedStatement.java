package com.lit.dao;

import com.lit.entity.Location;
import com.lit.entity.Review;
import com.lit.entity.User;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.*;

public class RetrieveUsersPreparedStatement {

    private static final String DB_DRIVER = "com.mysql.jdbc.Driver";
    private static final String DB_CONNECTION = "jdbc:mysql://localhost/napCore";
    private static final String DB_USER = "user=root";
    private static final String DB_PASSWORD = "password";

    public static List<User> selectRecordsFromTable() throws Exception {

        Connection dbConnection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        List<User> users = new ArrayList();
        String selectSQL = "SELECT * FROM review, location WHERE review.reviewId = location.reviewId";

        try
        {
            dbConnection = getDBConnection();
            preparedStatement = dbConnection.prepareStatement(selectSQL);
            resultSet = preparedStatement.executeQuery();


            while (resultSet.next())
            {
                User user = new User.UserBuilder()
                        .withUserId(resultSet.getInt("userId"))
                        .withFirstName(resultSet.getString("firstName"))
                        .withLastName(resultSet.getString("lastName"))
                        .withEmail(resultSet.getString("email"))
                        .withPassword(resultSet.getString("password"))
                        .build();
                users.add(user);
            }
        }
        finally
        {
            if (resultSet != null)
            {
                resultSet.close();
            }
            if (preparedStatement != null)
            {
                preparedStatement.close();
            }
            if (dbConnection != null)
            {
                dbConnection.close();
            }
        }

        return users;
    }

    private static Connection getDBConnection() throws Exception
    {

        Connection dbConnection = null;
        Class.forName("com.mysql.jdbc.Driver").newInstance();

        dbConnection = DriverManager.getConnection("jdbc:mysql://localhost/napCore?serverTimezone=UTC&"
                + "user=root&password=password");
        return dbConnection;
    }
}
