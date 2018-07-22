package com.lit.dao;

import com.lit.entity.Location;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.*;

public class RetrieveLocationsPreparedStatement {


    public static List<Location> selectRecordsFromTable() throws Exception {

        Connection dbConnection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        List<Location> locations = new ArrayList();
        String selectSQL = "SELECT * FROM location";

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
                locations.add(location);
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

        return locations;
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
