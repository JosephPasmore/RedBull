package com.lit.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import com.lit.service.RetrieveLocationsService;

@Path("/retrieve")
public class RetrieveLocations {

    @GET
    @Path("/retrieveLocations")
    @Produces(MediaType.APPLICATION_JSON)
    public Response retrieveLocations() {

        RetrieveLocationsService service = new RetrieveLocationsService();
        try {
            return Response.status(200).entity(service.getLocations()).build();
        } catch (Exception e) {
            return Response.status(400).entity(e.getMessage()).build();
        }
    }
}
