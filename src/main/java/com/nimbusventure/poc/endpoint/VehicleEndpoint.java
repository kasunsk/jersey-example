package com.nimbusventure.poc.endpoint;

import com.nimbusventure.poc.dto.Vehicle;
import com.nimbusventure.poc.service.VehicleService;
import com.nimbusventure.poc.service.VehicleServiceImpl;

import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;
import java.net.URI;
import java.util.List;

/**
 * Created by kasun on 8/30/17.
 */

@Path("/vehicles")
@Consumes(MediaType.TEXT_PLAIN)
@Produces(MediaType.TEXT_PLAIN)
public class VehicleEndpoint {

    @Context private UriInfo uriInfo;

    private VehicleService vehicleService = new VehicleServiceImpl();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response squareRoot(){

        List<Vehicle> vehicles = vehicleService.retrieveAll();
        return Response.status(Response.Status.OK).entity(vehicles).build();
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response findById(@PathParam("id") String id) {

        Vehicle vehicle = vehicleService.findVehicle(id);
        return Response.status(Response.Status.OK).entity(vehicle).build();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response save(Vehicle vehicle) {

        vehicleService.addVehicle(vehicle);
        return Response.status(Response.Status.OK).build();
    }


}
