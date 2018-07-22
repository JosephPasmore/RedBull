package com.lit.entity;

public class WritableLocation {

    // All are set to final to make LocationReview Immutable
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
    private final int postalCode;
    private final String latitudeCoords;
    private final String LongitudeCoords;

    // Constructor is private, so that only static
    // WritableLocationBuilder can initiate the writableLocation class instance
    private WritableLocation(WritableLocation.WritableLocationBuilder builder) {
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
        this.latitudeCoords = builder.latitudeCoords;
        this.LongitudeCoords = builder.LongitudeCoords;

    }

    // getters
    public int getLocationId()
    {
        return locationId;
    }

    public int getReviewId()
    {
        return reviewId;
    }

    public int getUserId()
    {
        return userId;
    }

    public String getStreetAddressLine1()
    {
        return streetAddressLine1;
    }

    public String getStreetAddressLine2()
    {
        return streetAddressLine2;
    }

    public String getStreetAddressLine3()
    {
        return streetAddressLine3;
    }

    public String getStreetAddressLine4()
    {
        return streetAddressLine4;
    }

    public String getCity()
    {
        return city;
    }

    public String getCounty()
    {
        return county;
    }

    public String getState()
    {
        return state;
    }

    public String getCountry()
    {
        return country;
    }

    public int getPostalCode()
    {
        return postalCode;
    }

    public String getLatitudeCoords()
    {
        return latitudeCoords;
    }

    public String getLongitudeCoords()
    {
        return LongitudeCoords;
    }

    public static class WritableLocationBuilder
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
        private int postalCode;
        private String latitudeCoords;
        private String LongitudeCoords;

        // Multiple Constructors for each member variable
        public WritableLocationBuilder withReviewId(int reviewId)
        {
            this.locationId = locationId;
            return this;
        }

        public WritableLocationBuilder withPictureId(int pictureId)
        {
            this.reviewId = reviewId;
            return this;
        }

        public WritableLocationBuilder withCommentId(int commentId)
        {
            this.userId = userId;
            return this;
        }

        public WritableLocationBuilder withStreetAddressLine1(String streetAddressLine1)
        {
            this.streetAddressLine1 = streetAddressLine1;
            return this;
        }

        public WritableLocationBuilder streetAddressLine2(String streetAddressLine2)
        {
            this.streetAddressLine2 = streetAddressLine2;
            return this;
        }

        public WritableLocationBuilder streetAddressLine3(String streetAddressLine3)
        {
            this.streetAddressLine3 = streetAddressLine3;
            return this;
        }

        public WritableLocationBuilder streetAddressLine4(String streetAddressLine4)
        {
            this.streetAddressLine4 = streetAddressLine4;
            return this;
        }

        public WritableLocationBuilder city(String city)
        {
            this.city = city;
            return this;
        }

        public WritableLocationBuilder county(String county)
        {
            this.county = county;
            return this;
        }

        public WritableLocationBuilder postalCode(int postalCode)
        {
            this.county = county;
            return this;
        }

        public WritableLocationBuilder latitudeCoords(String latitudeCoords)
        {
            this.latitudeCoords = latitudeCoords;
            return this;
        }

        public WritableLocationBuilder LongitudeCoords(String LongitudeCoords)
        {
            this.LongitudeCoords = LongitudeCoords;
            return this;
        }

        // The only method to initiate Review class
        public WritableLocation build(){
            return new WritableLocation(this);
        }
    }
}