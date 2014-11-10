package com.twitter;

import com.tomitribe.wadlx.api.See;
import com.tomitribe.wadlx.api.SeeAlso;

import javax.ws.rs.ApplicationPath;

@ApplicationPath("api")
@SeeAlso({
        @See(title = "Uploading Media", iref = "uploading-media.html"),
        @See(title = "Uploading Media: Multiple Photos", iref = "uploading-media-multiple-photo.html"),
        @See(title = "The Search API", iref = "search-api.html")
})
public class TwitterApplication extends ApplicationResource {
    // leave empty and let TomEE scan for @Path resources
}
