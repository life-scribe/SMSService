package com.lifescribe.api;

import com.lifescribe.api.resources.v1.TestResource;
import com.yammer.dropwizard.Service;
import com.yammer.dropwizard.config.Bootstrap;
import com.yammer.dropwizard.config.Environment;

public class SMSService extends Service<SMSConfig> {

    public static void main(String[] args) throws Exception {
        new SMSService().run(args);
    }

    public void initialize(Bootstrap<SMSConfig> bootstrap) {

    }

    public void run(SMSConfig smsConfig, Environment environment) throws Exception {
        environment.addResource(new TestResource());
    }
}
