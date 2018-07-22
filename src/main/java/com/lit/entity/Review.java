package com.lit.entity;

import java.util.*;

public class Review
{
    private final int reviewId;
    private final List<Picture> pictures;
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
        this.pictures = builder.pictures;
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

    public List<Picture> getPictures()
    {
        return pictures;
    }

    public int getCommentIdId() {
        return commentId;
    }

    public Location getLocation() {
        return location;
    }

    public int getUserId() {
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

    public int getPictureId() {
        return pictureId;
    }

    public int getCommentId() {
        return commentId;
    }

    public static class ReviewBuilder
    {
        private int reviewId;
        private List<Picture> pictures;
        private int pictureId;
        private int commentId;
        private Location location;
        private int userId;
        private int rating;
        private String availability;
        private String description;
        private String uploadDateTime;

        public ReviewBuilder copyFrom(Review review)
        {
            this.reviewId = review.reviewId;
            this.pictures = review.pictures;
            this.pictureId = review.pictureId;
            this.commentId = review.commentId;
            this.location = review.location;
            this.userId = review.userId;
            this.rating = review.rating;
            this.availability = review.availability;
            this.description = review.description;
            this.uploadDateTime = review.uploadDateTime;

            return this;
        }

        public ReviewBuilder withReviewId(int reviewId){
            this.reviewId = reviewId;
            return this;
        }

        public ReviewBuilder withPictures(List<Picture> pictures){
            this.pictures = pictures;
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
