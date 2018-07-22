package com.lit.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.lit.dao.AddReview;
import com.lit.entity.WritableReview;

@Path("/service")
public class AddNapReview {

    @POST
    @Path("/addNapReview")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response addNapReview(WritableReview review) {
        int rows = 0;
        try {
            rows = AddReview.executeAddReview(review);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Response.status(201).entity(rows).build();
    }
}
