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
import com.tomitribe.wadlx.api.Tag;
import com.twitter.dev.api.TweetsType;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

@Path("/direct_messages")
public class DirectmessagesResource {

    @GET
    @Produces("application/json")
    @Path("/sent")
    @Category({"direct_messages"})
    @ApiVersion({"1.1"})
    @UserLimit(rate = @Rate(window = 15, unit = GovernanceUnit.MINUTES, limit = 15))
    @Description("Returns the 20 most recent direct messages sent by the authenticating user. Includes detailed information about the sender and recipient user. You can request up to 200 direct messages per call, up to a maximum of 800 outgoing DMs. Important: This method requires an access token with RWD (read, write &amp; direct message) permissions.")
    public TweetsType getSent(@Description("Returns results with an ID greater than (that is, more recent than) the specified ID. There are limits to the number of Tweets which can be accessed through the API. If the limit of Tweets has occured since the since_id, the since_id will be forced to the oldest ID available.")
                              @QueryParam("since_id") final Integer since_id, @Description("Returns results with an ID less than (that is, older than) or equal to the specified ID.")
                              @QueryParam("max_id") final Integer max_id, @Description("Specifies the number of records to retrieve. Must be less than or equal to 200.")
                              @QueryParam("count") final Integer count, @Description("Specifies the page of results to retrieve.")
                              @QueryParam("page") final Integer page,
                              @Description("The <tt>entities</tt> node will not be included when set to <tt>false</tt>.")
                              @QueryParam("include_entities") final Boolean include_entities) {
        //TODO: implement
        return null;
    }

    @GET
    @Produces("application/json")
    @Path("/show")
    @Category({"direct_messages"})
    @ApiVersion({"1.1"})
    @Tag({"Direct Messages"})
    @SeeAlso({@See(href = "/docs/api/1.1/get/direct_messages", value = "GET direct_messages"), @See(href = "/docs/api/1.1/get/direct_messages/sent", value = "GET direct_messages/sent")})
    @UserLimit(rate = @Rate(window = 15, unit = GovernanceUnit.MINUTES, limit = 15))
    @Description("Returns a single direct message, specified by an id parameter. Like the /1.1/direct_messages.format request, this method will include the user objects of the sender and recipient. Important: This method requires an access token with RWD (read, write &amp; direct message) permissions. Consult The Application Permission Model for more information.")
    public Response getShow(@Description("The ID of the direct message.")
                            @PathParam("id") final int id) {
        //TODO: implement
        return null;
    }

    @POST
    @Produces("application/json")
    @Path("/destroy")
    @Category({"direct_messages"})
    @ApiVersion({"1.1"})
    @Description("Destroys the direct message specified in the required ID parameter. The authenticating user must be the recipient of the specified direct message. Important: This method requires an access token with RWD (read, write &amp; direct message) permissions. Consult The Application Permission Model for more information.")
    public TweetsType postDestroy(@Description("The ID of the direct message to delete.")
                                  @PathParam("id") final int id, @Description("The <tt>entities</tt> node will not be included when set to <tt>false</tt>.")
                                  @QueryParam("include_entities") final Boolean include_entities) {
        //TODO: implement
        return null;
    }

    @POST
    @Produces("application/json")
    @Path("/new")
    @Category({"direct_messages"})
    @ApiVersion({"1.1"})
    @Description("Sends a new direct message to the specified user from the authenticating user. Requires both the user and text parameters and must be a POST. Returns the sent message in the requested format if successful.")
    public TweetsType postNew(@Description("The ID of the user who should receive the direct message. Helpful for disambiguating when a valid user ID is also a valid screen name.")
                              @QueryParam("user_id") final Integer user_id, @Description("The screen name of the user who should receive the direct message. Helpful for disambiguating when a valid screen name is also a user ID.")
                              @QueryParam("screen_name") final String screen_name, @Description("The text of your direct message. Be sure to URL encode as necessary, and keep the message under 140 characters.")
                              @PathParam("text") final String text) {
        //TODO: implement
        return null;
    }

}