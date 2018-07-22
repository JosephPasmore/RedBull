package com.lit.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import com.lit.entity.Review;
import com.lit.Track;
import com.lit.service.RetrieveService;
import java.sql.SQLException;
import java.util.List;

@Path("/read")
public class RetrieveNaps {

	@GET
	@Path("/retrieveNaps")
	@Produces(MediaType.APPLICATION_JSON)
	public Response retrieveNaps() {

        RetrieveService service = new RetrieveService();
        try {
            return Response.status(200).entity(service.getReviews()).build();
        } catch (Exception e) {
            return Response.status(400).entity(e.getMessage()).build();
        }
    }
}