package com.lit.dao;

import com.lit.Review;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class AddReview {
     // JDBC driver name and database URL
     static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
     static final String DB_URL = "jdbc:mysql://Josephs-MacBook-Air.local:3306/";

     // Database credentials
     static final String USER = "root";
     static final String PASS = "1234";

     Review review;

     public AddReview(Review reviewToAdd)
     {
        review = reviewToAdd;
     }

    public int execute()
     {
        Connection conn = null;
        Statement stmt = null;

         try {
             Class.forName("com.mysql.jdbc.Driver");
         } catch (ClassNotFoundException e) {
             e.printStackTrace();
         }
         System.out.print("\nConnecting to database...");
         try {
             conn = DriverManager.getConnection(DB_URL, USER, PASS);
         } catch (SQLException e) {
             e.printStackTrace();
         }
         System.out.println(" SUCCESS!\n");


            try {
                stmt = conn.createStatement();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            String sql = "INSERT INTO review (pictureId, commentId, locationId, rating, availability, description, uploadDateTime)" +
                    "VALUES (?, ?, ?, ?, ?, ?, ?)";
//         pictureId
//         commentId
//         locationId
//         userId
//         rating
//         availability
//         description
//         uploadDateTime

         try {
             PreparedStatement preparedStatement = conn.prepareStatement(sql);
             preparedStatement.setInt(1, review.getPictureId());
             preparedStatement.setInt(2, review.getCommentIdId());
             preparedStatement.setInt(3, review.getLocationId());
             preparedStatement.setInt( 4, review.getRating());
             preparedStatement.setString( 5, review.getAvailability());
             preparedStatement.setString( 6, review.getDescription());
             preparedStatement.setString( 7, review.getUploadDateTime());
             preparedStatement.executeUpdate();
         } catch (SQLException e) {
             e.printStackTrace();
         }

            try {
              return stmt.executeUpdate(sql);
            } catch (SQLException e) {
                e.printStackTrace();
            }
         return -1;
     }
}