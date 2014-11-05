/*
 * Tomitribe Confidential
 *
 * Copyright Tomitribe Corporation. 2014
 *
 * The source code for this program is not published or otherwise divested
 * of its trade secrets, irrespective of what has been deposited with the
 * U.S. Copyright Office.
 */
package com.twitter;

import com.tomitribe.wadlx.api.ApiVersion;
import com.tomitribe.wadlx.api.Description;
import com.tomitribe.wadlx.api.See;
import com.tomitribe.wadlx.api.SeeAlso;
import com.tomitribe.wadlx.api.Tag;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/oauth2")
public class Oauth2Resource {

    @POST
    @Produces("application/json")
    @Path("/invalidate_token")
    @ApiVersion({"1.1"})
    @SeeAlso({@See(href = "/docs/auth/application-only-auth", value = "Application-only authentication"), @See(href = "/docs/api/1.1/post/oauth2/token", value = "POST oauth2/token")})
    @Description("Allows a registered application to revoke an issued OAuth 2 Bearer Token by presenting its client credentials. Once a Bearer Token has been invalidated, new creation attempts will yield a different Bearer Token and usage of the invalidated token will no longer be allowed. As with all API v1.1 methods, HTTPS is always required.")
    public Response postInvalidate_token(@Description("The value of the bearer token to revoke.")
                                         @PathParam("access_token") final String access_token) {
        //TODO: implement
        return null;
    }

    @POST
    @Produces("application/json")
    @Path("/token")
    @ApiVersion({"1.1"})
    @Tag({"OAuth"})
    @SeeAlso({@See(href = "/docs/auth/application-only-auth", value = "Application-only authentication"), @See(href = "/docs/rate-limiting/1.1", value = "REST API Rate Limiting in v1.1"), @See(href = "/docs/api/1.1/post/oauth2/invalidate_token", value = "POST oauth2/invalidate_token")})
    @Description("Allows a registered application to obtain an OAuth 2 Bearer Token, which can be used to make API requests on an application")
    public Response postToken(@Description("Specifies the type of grant being requested by the application. At this time, only ")
                              @PathParam("grant_type") final String grant_type) {
        //TODO: implement
        return null;
    }

}