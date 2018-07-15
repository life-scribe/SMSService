package com.lifescribe.api.resources.v1;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("v1/test")
public class TestResource {

    @GET
    public String test() {
        return "LifeScribe SMS service test";
    }
}
