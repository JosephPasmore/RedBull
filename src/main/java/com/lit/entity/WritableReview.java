package com.lit.entity;

public class WritableReview
{
    private final int reviewId;
    private final int pictureId;
    private final int commentId;
    private final int locationId;
    private final int userId;
    private final int rating;
    private final String availability;
    private final String description;
    private final String uploadDateTime;

    private WritableReview(WritableReviewBuilder builder)
    {
        this.reviewId = builder.reviewId;
        this.pictureId = builder.pictureId;
        this.commentId = builder.commentId;
        this.locationId = builder.locationId;
        this.userId = builder.userId;
        this.rating = builder.rating;
        this.availability = builder.availability;
        this.description = builder.description;
        this.uploadDateTime = builder.uploadDateTime;
    }

    public int getReviewId()
    {
        return reviewId;
    }

    public int getPictureId()
    {
        return pictureId;
    }

    public int getCommentIdId()
    {
        return commentId;
    }

    public int getLocationId()
    {
        return locationId;
    }

    public int getUserIdId()
    {
        return userId;
    }

    public int getRating()
    {
        return rating;
    }

    public String getAvailability()
    {
        return availability;
    }

    public String getDescription()
    {
        return description;
    }

    public String getUploadDateTime()
    {
        return uploadDateTime;
    }

    public static class WritableReviewBuilder
    {
        private int reviewId;
        private int pictureId;
        private int commentId;
        private int locationId;
        private int userId;
        private int rating;
        private String availability;
        private String description;
        private String uploadDateTime;

        public WritableReviewBuilder()
        {

        }

        // Multiple Constructors for each member variable
        public WritableReviewBuilder withReviewId(int reviewId)
        {
            this.reviewId = reviewId;
            return this;
        }

        public WritableReviewBuilder withPictureId(int pictureId)
        {
            this.pictureId = pictureId;
            return this;
        }

        public WritableReviewBuilder withCommentId(int commentId){
            this.commentId = commentId;
            return this;
        }

        public WritableReviewBuilder withLocationId(int locationId)
        {
            this.locationId = locationId;
            return this;
        }

        public WritableReviewBuilder withUserId(int userId)
        {
            this.userId = userId;
            return this;
        }

        public WritableReviewBuilder withRating(int rating)
        {
            this.rating = rating;
            return this;
        }

        public WritableReviewBuilder withAvailability(String availability)
        {
            this.availability = availability;
            return this;
        }

        public WritableReviewBuilder withDescription(String description)
        {
            this.description = description;
            return this;
        }

        public WritableReviewBuilder withUploadDateTime(String uploadDateTime)
        {
            this.uploadDateTime = uploadDateTime;
            return this;
        }

        // The only method to initiate Review class
        public WritableReview build()
        {
            return new WritableReview(this);
        }
    }
}