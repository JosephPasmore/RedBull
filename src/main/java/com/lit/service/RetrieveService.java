package com.lit.service;

import com.lit.dao.RetrieveLocationsPreparedStatement;
import com.lit.dao.RetrieveNapsPreparedStatement;
import com.lit.dao.RetrievePicturesPreparedStatement;
import com.lit.entity.Location;
import com.lit.entity.Review;
import com.lit.entity.Picture;
import com.lit.dao.RetrieveUsersPreparedStatement;
import com.lit.entity.User;
import java.util.*;

public class RetrieveService {

    public RetrieveService()
    {

    }

    public List<Review> getReviews() throws Exception
    {
        List<Review> reviews = RetrieveNapsPreparedStatement.selectRecordsFromTable();

        List<Review> populatedReviews = new ArrayList<>();

        for(Review review : reviews)
        {
            List<Picture> pictures = RetrievePicturesPreparedStatement
                    .selectRecordsFromTable(review.getReviewId());

            Review newReview = new Review.ReviewBuilder()
                    .copyFrom(review)
                    .withPictures(pictures)
                    .build();

            populatedReviews.add(newReview);
        }

        return populatedReviews;
    }

    public List<Location> getLocations() throws Exception
    {
        return RetrieveLocationsPreparedStatement.selectRecordsFromTable();
    }

    public List<User> getUser() throws Exception
    {
        return RetrieveUsersPreparedStatement.selectRecordsFromTable();
    }
}


