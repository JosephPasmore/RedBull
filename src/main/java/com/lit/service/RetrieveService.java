package com.lit.service;

import com.lit.dao.RetrieveNapsPreparedStatement;
import com.lit.entity.Review;
import java.util.*;

public class RetrieveService {

    public RetrieveService()
    {

    }

    public List<Review> getReviews() throws Exception
    {
        return RetrieveNapsPreparedStatement.selectRecordsFromTable();
    }
}


