package com.lit.dao;

import com.lit.entity.Review;
import com.lit.entity.WritableReview;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class AddReview {

    public static int executeAddReview(WritableReview review) throws Exception {

        Connection dbConnection;
        PreparedStatement preparedStatement;

        String sql = "INSERT INTO review (pictureId, commentId, locationId, rating, availability, description, uploadDateTime)" +
                "VALUES (?, ?, ?, ?, ?, ?, ?)";

        dbConnection = getDBConnection();
        preparedStatement = dbConnection.prepareStatement(sql);
        preparedStatement.setInt(1, review.getPictureId());
        preparedStatement.setInt(2, review.getCommentIdId());
        preparedStatement.setInt(3, review.getLocationId());
        preparedStatement.setInt( 4, review.getRating());
        preparedStatement.setString( 5, review.getAvailability());
        preparedStatement.setString( 6, review.getDescription());
        preparedStatement.setString( 7, review.getUploadDateTime());
        return preparedStatement.executeUpdate();
    }

    private static Connection getDBConnection() throws Exception
    {

        Connection dbConnection = null;
        Class.forName("com.mysql.jdbc.Driver").newInstance();

        dbConnection = DriverManager.getConnection("jdbc:mysql://75.98.125.90/napCore?serverTimezone=UTC&"
                + "user=root&password=password");
        return dbConnection;
    }
}



