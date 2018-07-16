package com.lifescribe.api;

import com.lifescribe.api.resources.v1.UserResource;
import com.lifescribe.data.dao.UserDao;
import io.dropwizard.Application;
import io.dropwizard.jdbi.DBIFactory;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import org.skife.jdbi.v2.DBI;

public class SMSService extends Application<SMSConfig> {

    public static void main(String[] args) throws Exception {
        new SMSService().run(args);
    }

    public void initialize(Bootstrap<SMSConfig> bootstrap) {

    }

    public void run(SMSConfig config, Environment env) throws Exception {
        final DBIFactory factory = new DBIFactory();
        final DBI jdbi = factory.build(env, config.getDataSourceFactory(), "mysql");
        final UserDao userDao = jdbi.onDemand(UserDao.class);

        env.jersey().register(new UserResource(userDao));
    }
}
