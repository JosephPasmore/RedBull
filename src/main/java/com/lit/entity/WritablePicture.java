package com.lit.entity;

public class Picture {
    // All are set to final to make Picture Immutable
    private final int pictureId;
    private final int reviewId;
    private final int userId;
    private final String commentId;
    private final String url;
    private final String description;

    // Constructor is private, so that only static
    // PictureBuilder can initiate the Picture class instance
    private Picture(Picture.PictureBuilder builder) {
        this.pictureId = builder.pictureId;
        this.reviewId = builder.reviewId;
        this.userId = builder.userId;
        this.commentId = builder.commentId;
        this.url = builder.url;
        this.description = builder.description;
    }

    // getters
    public int getPictureId() {
        return pictureId;
    }

    public int getReviewId() {
        return reviewId;
    }

    public int getUserId() {
        return userId;
    }

    public String getCommentId() {
        return commentId;
    }

    public String getUrl() {
        return url;
    }

    public String getDescription() {
        return description;
    }


    public static class PictureBuilder
    {
        private int pictureId;
        private int reviewId;
        private int userId;
        private String commentId;
        private String url;
        private String description;

        // Multiple Constructors for each member variable
        public Picture.PictureBuilder pictureId(int pictureId)
        {
            this.pictureId = pictureId;
            return this;
        }

        public Picture.PictureBuilder reviewId(int reviewId)
        {
            this.reviewId = reviewId;
            return this;
        }

        public Picture.PictureBuilder userId(int userId)
        {
            this.userId = userId;
            return this;
        }

        public Picture.PictureBuilder commentId(String commentId)
        {
            this.commentId = commentId;
            return this;
        }

        public Picture.PictureBuilder url(String url)
        {
            this.url = url;
            return this;
        }

        public Picture.PictureBuilder description(String description)
        {
            this.description = description;
            return this;
        }

    }
}