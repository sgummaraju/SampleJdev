package com.ecovues;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("ecovues")
public class GenericResource {
    public GenericResource() {
    }
    @Path("/validate")
    @GET
    public String getData() {

       return "Rest service working fine";
    }
}
