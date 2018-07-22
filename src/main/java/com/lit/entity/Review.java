package com.lit.entity;

public class Review
{
    private final int reviewId;
    private final int pictureId;
    private final int commentId;
    private final Location location;
    private final int userId;
    private final int rating;
    private final String availability;
    private final String description;
    private final String uploadDateTime;

    private Review(ReviewBuilder builder)
    {
        this.reviewId = builder.reviewId;
        this.pictureId = builder.pictureId;
        this.commentId = builder.commentId;
        this.location = builder.location;
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

    public int getCommentIdId() {
        return commentId;
    }

    public Location getLocation() {
        return location;
    }

    public int getUserIdId() {
        return userId;
    }

    public int getRating() {
        return rating;
    }

    public String getAvailability() {
        return availability;
    }

    public String getDescription() {
        return description;
    }

    public String getUploadDateTime() {
        return uploadDateTime;
    }

    public static class ReviewBuilder
    {
        private int reviewId;
        private int pictureId;
        private int commentId;
        private Location location;
        private int userId;
        private int rating;
        private String availability;
        private String description;
        private String uploadDateTime;

        public ReviewBuilder withReviewId(int reviewId){
            this.reviewId = reviewId;
            return this;
        }

        public ReviewBuilder withPictureId(int pictureId){
            this.pictureId = pictureId;
            return this;
        }

        public ReviewBuilder withCommentId(int commentId){
            this.commentId = commentId;
            return this;
        }

        public ReviewBuilder withLocation(Location location){
            this.location = location;
            return this;
        }

        public ReviewBuilder withUserId(int userId){
            this.userId = userId;
            return this;
        }

        public ReviewBuilder withRating(int rating){
            this.rating = rating;
            return this;
        }

        public ReviewBuilder withAvailability(String availability){
            this.availability = availability;
            return this;
        }

        public ReviewBuilder withDescription(String description){
            this.description = description;
            return this;
        }

        public ReviewBuilder withUploadDateTime(String uploadDateTime){
            this.uploadDateTime = uploadDateTime;
            return this;
        }

        public Review build () {
            return new Review(this);
        }
    }
}

