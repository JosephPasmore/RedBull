package com.lit.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import com.lit.service.RetrieveService;

@Path("/retrieve/service")
public class Retrieve {

	@GET
	@Path("/naps")
	@Produces(MediaType.APPLICATION_JSON)
	public Response retrieveNaps() {

        RetrieveService service = new RetrieveService();
        try {
            return Response.status(200).entity(service.getReviews()).build();
        } catch (Exception e) {
            return Response.status(400).entity(e.getMessage()).build();
        }
    }

    @GET
    @Path("/locations")
    @Produces(MediaType.APPLICATION_JSON)
    public Response retrieveLocations() {

        RetrieveService service = new RetrieveService();
        try {
            return Response.status(200).entity(service.getLocations()).build();
        } catch (Exception e) {
            return Response.status(400).entity(e.getMessage()).build();
        }
    }
}