package com.lit.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.lit.Track;

@Path("/service")
public class ConfessNap {

    @POST
    @Path("/confessNap")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response confessNap(Track track) {

        String result = "Track saved : " + track;
        return Response.status(201).entity(result).build();

    }

}