package com.lit.service;

import com.lit.dao.RetrieveLocationsPreparedStatement;
import com.lit.entity.Location;
import java.util.*;

public class RetrieveLocationsService {

    public RetrieveLocationsService()
    {

    }

    public List<Location> getLocations() throws Exception
    {
        return RetrieveLocationsPreparedStatement.selectRecordsFromTable();
    }
}


