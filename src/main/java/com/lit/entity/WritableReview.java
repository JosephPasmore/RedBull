public class WritableReview {

    // All are set to final to make writableReview Immutable
    private final int reviewId;
    private final int pictureId;
    private final int commentId;
    private final int locationId;
    private final int userId;
    private final int rating;
    private final String availability;
    private final String description;
    private final String uploadDateTime;

    // Constructor is private, so that only static
    // writableReviewBuilder can initiate the writableReview class instance
    private WritableReview(WritableReviewBuilder builder) {
        this.reviewId = builder.getReviewId();
        this.pictureId = builder.getPictureId();
        this.commentId = builder.getCommentId();
        this.locationId = builder.getLocationId();
        this.userId = builder.getUserId();
        this.rating = builder.getRating();
        this.availability = builder.getAvailability();
        this.description = builder.getDescription();
        this.uploadDateTime = builder.uploadDateTime();
    }

    // getters
    public int getReviewId() {
        return reviewId;
    }

    public int getPictureId() {
        return pictureId;
    }

    public int getCommentIdId() {
        return commentId;
    }

    public int getLocationId() {
        return locationId;
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

    public static class WritableReviewBuilder() {

        // Multiple Constructors for each member variable
        public ReviewBuilder withReviewId ( int reviewId){
            this.reviewId = reviewId;
            return this;
        }

        public ReviewBuilder withPictureId ( int pictureId){
            this.pictureId = pictureId;
            return this;
        }

        public ReviewBuilder withCommentId ( int commentId){
            this.commentId = commentId;
            return this;
        }

        public ReviewBuilder withLocationId ( int locationId){
            this.locationId = locationId;
            return this;
        }

        public ReviewBuilder withUserId ( int userId){
            this.userId = userId;
            return this;
        }

        public ReviewBuilder withRating ( int rating){
            this.rating = rating;
            return this;
        }

        public ReviewBuilder withAvailability (String availability){
            this.availability = availability;
            return this;
        }

        public ReviewBuilder withDescription (String description){
            this.description = description;
            return this;
        }

        public ReviewBuilder withUploadDateTime (String uploadDateTime){
            this.uploadDateTime = uploadDateTime;
            return this;
        }

        // The only method to initiate Review class
        public WritableReview build () {
            return new WritableReview(this);
        }
    }
}
