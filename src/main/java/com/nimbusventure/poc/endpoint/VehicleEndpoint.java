package com.nimbusventure.poc.endpoint;

import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 * Created by kasun on 8/30/17.
 */

@Path("vehicle")
public class VehicleEndpoint {

    @GET
    @Path("squareRoot")
    @Produces(MediaType.APPLICATION_JSON)
    public Result squareRoot(@QueryParam("input") double input){
        Result result = new Result("Square Root");
        result.setInput(input);
        result.setOutput(Math.sqrt(result.getInput()));
        return result;
    }


}
