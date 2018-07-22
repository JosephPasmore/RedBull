package com.lit.dao;

import com.lit.entity.Picture;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.*;

public class RetrievePicturesPreparedStatement {

    public static List<Picture> selectRecordsFromTable(int reviewId) throws Exception {

        Connection dbConnection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        List<Picture> pictures = new ArrayList();
        String selectSQL = "SELECT * FROM picture where reviewId = ?";

        try
        {
            dbConnection = getDBConnection();
            preparedStatement = dbConnection.prepareStatement(selectSQL);
            preparedStatement.setInt(1, reviewId);
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next())
            {

                Picture picture = new Picture.PictureBuilder()
                        .pictureId(resultSet.getInt("pictureId"))
                        .commentId(resultSet.getInt("commentId"))
                        .description(resultSet.getString("description"))
                        .reviewId(resultSet.getInt("reviewId"))
                        .url(resultSet.getString("url"))
                        .userId(resultSet.getInt("userId"))
                        .build();

                pictures.add(picture);
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

        return pictures;
    }

    private static Connection getDBConnection() throws Exception
    {

        Connection dbConnection = null;
        Class.forName("com.mysql.jdbc.Driver").newInstance();

        dbConnection = DriverManager.getConnection("jdbc:mysql://Josephs-MacBook-Air.local/napCore?serverTimezone=UTC&"
                + "user=stephen&password=password");
        return dbConnection;
    }
}