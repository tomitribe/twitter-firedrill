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

import com.tomitribe.tribestream.governance.api.GovernanceUnit;
import com.tomitribe.tribestream.governance.api.Rate;
import com.tomitribe.tribestream.governance.api.UserLimit;
import com.tomitribe.wadlx.api.ApiVersion;
import com.tomitribe.wadlx.api.Category;
import com.tomitribe.wadlx.api.Description;
import com.tomitribe.wadlx.api.See;
import com.tomitribe.wadlx.api.SeeAlso;
import org.tomitribe.firedrill.rs.ResponseFunction;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/saved_searches")
public class SavedsearchesResource {

    @Inject
    private ResponseFunction function;

    @GET
    @Produces("application/json")
    @Path("/list")
    @Category({"saved_searches"})
    @ApiVersion({"1.1"})
    @SeeAlso({@See(href = "endpoint/Twitter/GET/saved_searches/show/%3Aid", value = "GET saved_searches/show/:id"), @See(href = "endpoint/Twitter/POST/saved_searches/create", value = "POST saved_searches/create"), @See(href = "endpoint/Twitter/POST/saved_searches/destroy/%3Aid", value = "POST saved_searches/destroy/:id"), @See(href = "endpoint/Twitter/GET/search/tweets", value = "GET search/tweets")})
    @UserLimit(rate = @Rate(window = 15, unit = GovernanceUnit.MINUTES, limit = 15))
    @Description("Returns the authenticated user&#039;s saved search queries.")
    public Response getList() {
        //TODO: implement
        return function.get();
    }

    @GET
    @Produces("application/json")
    @Path("/show/{id}")
    @Category({"saved_searches"})
    @ApiVersion({"1.1"})
    @SeeAlso({@See(href = "endpoint/Twitter/GET/saved_searches/list", value = "GET saved_searches/list"), @See(href = "endpoint/Twitter/POST/saved_searches/destroy/%3Aid", value = "POST saved_searches/destroy/:id"), @See(href = "endpoint/Twitter/POST/saved_searches/create", value = "POST saved_searches/create"), @See(href = "endpoint/Twitter/GET/search/tweets", value = "GET search/tweets")})
    @UserLimit(rate = @Rate(window = 15, unit = GovernanceUnit.MINUTES, limit = 15))
    @Description("Retrieve the information for the saved search represented by the given id. The authenticating user must be the owner of saved search ID being requested.")
    public Response getShowid(@Description("The ID of the saved search.")
                              @PathParam("id") final int id) {
        //TODO: implement
        return function.get();
    }

    @POST
    @Produces("application/json")
    @Path("/create")
    @Category({"saved_searches"})
    @ApiVersion({"1.1"})
    @SeeAlso({@See(href = "endpoint/Twitter/GET/saved_searches/list", value = "GET saved_searches/list"), @See(href = "endpoint/Twitter/GET/saved_searches/show/%3Aid", value = "GET saved_searches/show/:id"), @See(href = "endpoint/Twitter/POST/saved_searches/destroy/%3Aid", value = "POST saved_searches/destroy/:id"), @See(href = "endpoint/Twitter/GET/search/tweets", value = "GET search/tweets")})
    @Description("Create a new saved search for the authenticated user. A user may only have 25 saved searches.")
    public Response postCreate(@Description("The query of the search the user would like to save.")
                               @PathParam("query") final String query) {
        //TODO: implement
        return function.get();
    }

    @POST
    @Produces("application/json")
    @Path("/destroy/{id}")
    @Category({"saved_searches"})
    @ApiVersion({"1.1"})
    @SeeAlso({@See(href = "endpoint/Twitter/GET/saved_searches/list", value = "GET saved_searches/list"), @See(href = "endpoint/Twitter/GET/saved_searches/show/%3Aid", value = "GET saved_searches/show/:id"), @See(href = "endpoint/Twitter/POST/saved_searches/create", value = "POST saved_searches/create")})
    @Description("Destroys a saved search for the authenticating user. The authenticating user must be the owner of saved search id being destroyed.")
    public Response postDestroyid(@Description("The ID of the saved search.")
                                  @PathParam("id") final int id) {
        //TODO: implement
        return function.get();
    }

}
