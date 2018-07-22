package com.lit.dao;

import com.lit.entity.Location;
import com.lit.entity.Picture;
import com.lit.entity.Review;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.*;

public class RetrieveNapsPreparedStatement {

    public static List<Review> selectRecordsFromTable() throws Exception {

        Connection dbConnection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        List<Review> reviews = new ArrayList();
        String selectSQL = "SELECT * FROM review, location WHERE review.reviewId = location.reviewId";

        try
        {
            dbConnection = getDBConnection();
            preparedStatement = dbConnection.prepareStatement(selectSQL);
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next())
            {
                Location location = new Location.LocationBuilder()
                        .withLocationId(resultSet.getInt("locationId"))
                        .withUserId(resultSet.getInt("userId"))
                        .withReviewId(resultSet.getInt("reviewId"))
                        .withStreetAddressLine1(resultSet.getString("streetAddressLine1"))
                        .withStreetAddressLine2(resultSet.getString("streetAddressLine2"))
                        .withStreetAddressLine3(resultSet.getString("streetAddressLine3"))
                        .withStreetAddressLine4(resultSet.getString("streetAddressLine4"))
                        .withCity(resultSet.getString("city"))
                        .withCounty(resultSet.getString("county"))
                        .withState(resultSet.getString("state"))
                        .withCountry(resultSet.getString("country"))
                        .withPostalCode(resultSet.getString("postalCode"))
                        .withLatitudeCoordinates(resultSet.getString("latitudeCoords"))
                        .withLongitudeCoordinates(resultSet.getString("longitudeCoords"))
                        .build();

                Review review = new Review.ReviewBuilder()
                        .withReviewId(resultSet.getInt("reviewId"))
                        .withLocation(location)
                        .withCommentId(resultSet.getInt("commentId"))
                        .withUserId(resultSet.getInt("userId"))
                        .withPictureId(resultSet.getInt("pictureId"))
                        .withAvailability(resultSet.getString("availability"))
                        .withDescription(resultSet.getString("description"))
                        .withRating(resultSet.getInt("rating"))
                        .withUploadDateTime(resultSet.getString("uploadDateTime"))
                        .build();
                reviews.add(review);
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

        return reviews;
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
