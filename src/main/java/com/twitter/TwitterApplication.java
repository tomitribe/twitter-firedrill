package com.twitter;

import com.tomitribe.wadlx.api.See;
import com.tomitribe.wadlx.api.SeeAlso;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("api")
public class TwitterApplication extends Application {
    // leave empty and let TomEE scan for @Path resources
}
