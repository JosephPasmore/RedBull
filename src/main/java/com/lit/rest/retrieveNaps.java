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
public class RetrieveNaps {

	@GET
	@Path("/retrieveNaps")
	@Produces(MediaType.APPLICATION_JSON)
	public Track retrieveNaps() {

		Track track = new Track();
		track.setTitle("Enter Sandman");
		track.setSinger("Metallica");

		return track;

	}
	
}