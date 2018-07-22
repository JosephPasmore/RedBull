package com.lit.entity;

public class WritableLocation {

    private int locationId;
    private int reviewId;
    private int userId;
    private String streetAddressLine1;
    private String streetAddressLine2;
    private String streetAddressLine3;
    private String streetAddressLine4;
    private String city;
    private String county;
    private String state;
    private String country;
    private int postalCode;
    private String latitudeCoords;
    private String LongitudeCoords;

    public WritableLocation() {
    }

    public int getLocationId() {
        return locationId;
    }

    public int getReviewId() {
        return reviewId;
    }

    public int getUserId() {
        return userId;
    }

    public String getStreetAddressLine1() {
        return streetAddressLine1;
    }

    public String getStreetAddressLine2() {
        return streetAddressLine2;
    }

    public String getStreetAddressLine3() {
        return streetAddressLine3;
    }

    public String getStreetAddressLine4() {
        return streetAddressLine4;
    }

    public String getCity() {
        return city;
    }

    public String getCounty() {
        return county;
    }

    public String getState() {
        return state;
    }

    public String getCountry() {
        return country;
    }

    public int getPostalCode() {
        return postalCode;
    }

    public String getLatitudeCoords() {
        return latitudeCoords;
    }

    public String getLongitudeCoords() {
        return LongitudeCoords;
    }
}
