package com.lifescribe.api.resources.v1;

import com.lifescribe.data.dao.UserDao;

import javax.ws.rs.*;

@Path("v1/user")
public class UserResource {

    private final UserDao userDao;

    public UserResource(UserDao userDao) {
        this.userDao = userDao;
    }

    @GET
    @Path("total")
    public String getTotalUsers() {
        return String.format("There are %d users", userDao.numOfUsers());
    }

    @POST
    @Path("add")
    public int[] addUser(@QueryParam("firstName") String firstName,
                         @QueryParam("lastName") String lastName,
                         @QueryParam("email") String email) {
        return userDao.insert(firstName, lastName, email);
    }
}
