package com.lit.entity;

public class WritableReview
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

    public WritableReview() {
    }

    public int getReviewId()
    {
        return reviewId;
    }

    public int getUserId()
    {
        return userId;
    }

    public int getPictureId()
    {
        return pictureId;
    }

    public int getCommentIdId() {
        return commentId;
    }

    public int getLocationId() {
        return locationId;
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
    public void setReviewId(int reviewId) {
        this.reviewId = reviewId;
    }

    public void setPictureId(int pictureId) {
        this.pictureId = pictureId;
    }

    public void setCommentId(int commentId) {
        this.commentId = commentId;
    }

    public void setLocationId(int locationId) {
        this.locationId = locationId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setUploadDateTime(String uploadDateTime) {
        this.uploadDateTime = uploadDateTime;
    }
}