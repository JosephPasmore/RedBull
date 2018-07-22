package com.lit.entity;

public class Location {

    private final int locationId;
    private final int reviewId;
    private final int userId;
    private final String streetAddressLine1;
    private final String streetAddressLine2;
    private final String streetAddressLine3;
    private final String streetAddressLine4;
    private final String city;
    private final String county;
    private final String state;
    private final String country;
    private final String postalCode;
    private final String latitudeCoordinates;
    private final String longitudeCoordinates;

    // Constructor is private, so that only static
    // LocationBuilder can initiate the writableReview class instance
    private Location(Location.LocationBuilder builder) {
        this.locationId = builder.locationId;
        this.reviewId = builder.reviewId;
        this.userId = builder.userId;
        this.streetAddressLine1 = builder.streetAddressLine1;
        this.streetAddressLine2 = builder.streetAddressLine2;
        this.streetAddressLine3 = builder.streetAddressLine3;
        this.streetAddressLine4 = builder.streetAddressLine4;
        this.city = builder.city;
        this.county = builder.county;
        this.state = builder.state;
        this.country = builder.country;
        this.postalCode = builder.postalCode;
        this.latitudeCoordinates = builder.latitudeCoordinates;
        this.longitudeCoordinates = builder.longitudeCoordinates;
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

    public String getPostalCode() {
        return postalCode;
    }

    public String getLatitudeCoordinates() {
        return latitudeCoordinates;
    }

    public String getLongitudeCoordinates() {
        return longitudeCoordinates;
    }

    public static class LocationBuilder
    {
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
        private String postalCode;
        private String latitudeCoordinates;
        private String longitudeCoordinates;

        // Multiple Constructors for each member variable
        public LocationBuilder withLocationId(int locationId)
        {
            this.locationId = locationId;
            return this;
        }

        public LocationBuilder withReviewId(int reviewId)
        {
            this.reviewId = reviewId;
            return this;
        }

        public LocationBuilder withUserId(int userId)
        {
            this.userId = userId;
            return this;
        }

        public LocationBuilder withStreetAddressLine1(String streetLineAddress1)
        {
            this.streetAddressLine1 = streetLineAddress1;
            return this;
        }

        public LocationBuilder withStreetAddressLine2(String streetLineAddress2)
        {
            this.streetAddressLine2 = streetLineAddress2;
            return this;
        }

        public LocationBuilder withStreetAddressLine3(String streetLineAddress3)
        {
            this.streetAddressLine3 = streetLineAddress3;
            return this;
        }

        public LocationBuilder withStreetAddressLine4(String streetLineAddress4)
        {
            this.streetAddressLine4 = streetLineAddress4;
            return this;
        }

        public LocationBuilder withCity(String city)
        {
            this.city = city;
            return this;
        }

        public LocationBuilder withCounty(String county)
        {
            this.county = county;
            return this;
        }

        public LocationBuilder withState(String state)
        {
            this.state = state;
            return this;
        }

        public LocationBuilder withCountry(String country)
        {
            this.country = country;
            return this;
        }

        public LocationBuilder withPostalCode(String postalCode)
        {
            this.postalCode = postalCode;
            return this;
        }

        public LocationBuilder withLatitudeCoordinates(String latitudeCoordinates)
        {
            this.latitudeCoordinates = latitudeCoordinates;
            return this;
        }

        public LocationBuilder withLongitudeCoordinates(String longitudeCoordinates)
        {
            this.longitudeCoordinates = longitudeCoordinates;
            return this;
        }

        // The only method to initiate Review class
        public Location build(){
            return new Location(this);
        }
    }
}