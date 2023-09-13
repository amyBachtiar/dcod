package com.dcode.controller;

import com.dcode.service.OtolaseJwtService;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

/**
 *
 * @author zavier
 */
@Path("/jwt")
@ApplicationScoped
public class OtolaseJwtSource {
    
    @Inject
    OtolaseJwtService otolaseJwtService;
    
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public Response getJwt(){
        String jwt = otolaseJwtService.generateJwt();
        return Response.ok(jwt).build();
    }
}
