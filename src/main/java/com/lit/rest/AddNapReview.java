package com.lit.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.lit.Track;
import com.lit.dao.AddReview;
import com.lit.Review;

@Path("/service")
public class AddNapReview {

    @POST
    @Path("/addNapReview")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response addNapReview(Track track) {
        String result = "Track saved : " + track;
        return Response.status(201).entity(result).build();
    }
}
