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

import com.tomitribe.tribestream.governance.api.ApplicationLimit;
import com.tomitribe.tribestream.governance.api.GovernanceUnit;
import com.tomitribe.tribestream.governance.api.Rate;
import com.tomitribe.tribestream.governance.api.UserLimit;
import com.tomitribe.wadlx.api.ApiVersion;
import com.tomitribe.wadlx.api.Category;
import com.tomitribe.wadlx.api.Description;
import com.tomitribe.wadlx.api.See;
import com.tomitribe.wadlx.api.SeeAlso;
import com.tomitribe.wadlx.api.Tag;
import com.twitter.dev.api.UsersType;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

@Path("/friendships")
public class FriendshipsResource {

    @GET
    @Produces("application/json")
    @Path("/incoming")
    @Category({"friendships"})
    @ApiVersion({"1.1"})
    @Tag({"follower management"})
    @See(href="endpoint/Twitter/GET/friendships/outgoing", value = "GET friendships/outgoing")
    @UserLimit(rate = @Rate(window = 15, unit = GovernanceUnit.MINUTES, limit = 15))
    @Description("Returns a collection of numeric IDs for every user who has a pending request to follow the authenticating user.")
    public Response getIncoming(@Description("Causes the list of connections to be broken into pages of no more than 5000 IDs at a time. The number of IDs returned is not guaranteed to be 5000 as suspended users are filtered out after connections are queried. If no cursor is provided, a value of <tt>-1</tt> will be assumed, which is the first \"page.\"<br /><br /> The response from the API will include a <tt>previous_cursor</tt> and <tt>next_cursor</tt> to allow paging back and forth. See <a href=\"https://dev.twitter.com/docs/misc/cursoring\">Using cursors to navigate collections</a> for more information.")
                                @QueryParam("cursor") final String cursor, @Description("Many programming environments will not consume our Tweet ids due to their size. Provide this option to have ids returned as strings instead. More about <a href=\"https://dev.twitter.com/docs/twitter-ids-json-and-snowflake\">Twitter IDs, JSON and Snowflake</a>.")
                                @QueryParam("stringify_ids") final Boolean stringify_ids) {
        //TODO: implement
        return null;
    }

    @GET
    @Produces("application/json")
    @Path("/lookup")
    @Category({"friendships"})
    @ApiVersion({"1.1"})
    @Tag({"Bulk Operations", "finding users", "follower management"})
    @See(href="endpoint/Twitter/GET/users/lookup", value = "GET users/lookup")
    @UserLimit(rate = @Rate(window = 15, unit = GovernanceUnit.MINUTES, limit = 15))
    @Description("Returns the relationships of the authenticating user to the comma-separated list of up to 100 screen_names or user_ids provided. Values for connections can be: following, following_requested, followed_by, none, blocking.")
    public Response getLookup(@Description("A comma separated list of screen names, up to 100 are allowed in a single request.")
                              @QueryParam("screen_name") final String screen_name, @Description("A comma separated list of user IDs, up to 100 are allowed in a single request.")
                              @QueryParam("user_id") final String user_id) {
        //TODO: implement
        return null;
    }

    @GET
    @Produces("application/json")
    @Path("/no_retweets/ids")
    @Category({"friendships"})
    @ApiVersion({"1.1"})
    @Tag({"Retweets"})
    @SeeAlso({@See(href="endpoint/Twitter/POST/friendships/update", value = "POST friendships/update"), @See(href="endpoint/Twitter/GET/friendships/lookup", value = "GET friendships/lookup"), @See(href="endpoint/Twitter/GET/user", value = "GET user")})
    @UserLimit(rate = @Rate(window = 15, unit = GovernanceUnit.MINUTES, limit = 15))
    @Description("Returns a collection of user_ids that the currently authenticated user does not want to receive retweets from. Use POST friendships/update to set the &quot;no retweets&quot; status for a given user account on behalf of the current user.")
    public UsersType getNo_retweetsids(@Description("Many programming environments will not consume our ids due to their size. Provide this option to have ids returned as strings instead. Read more about <a href=\"https://dev.twitter.com/docs/twitter-ids-json-and-snowflake\">Twitter IDs, JSON and Snowflake</a>. This parameter is especially important to use in Javascript environments.")
                                       @QueryParam("stringify_ids") final Boolean stringify_ids) {
        //TODO: implement
        return null;
    }

    @GET
    @Produces("application/json")
    @Path("/outgoing")
    @Category({"friendships"})
    @ApiVersion({"1.1"})
    @Tag({"follower management"})
    @See(href="endpoint/Twitter/GET/friendships/incoming", value = "GET friendships/incoming")
    @UserLimit(rate = @Rate(window = 15, unit = GovernanceUnit.MINUTES, limit = 15))
    @Description("Returns a collection of numeric IDs for every protected user for whom the authenticating user has a pending follow request.")
    public Response getOutgoing(@Description("Causes the list of connections to be broken into pages of no more than 5000 IDs at a time. The number of IDs returned is not guaranteed to be 5000 as suspended users are filtered out after connections are queried. If no cursor is provided, a value of <tt>-1</tt> will be assumed, which is the first \"page.\"<br /><br /> The response from the API will include a <tt>previous_cursor</tt> and <tt>next_cursor</tt> to allow paging back and forth. See <a href=\"https://dev.twitter.com/docs/misc/cursoring\">Using cursors to navigate collections</a> for more information.")
                                @QueryParam("cursor") final String cursor, @Description("Many programming environments will not consume our Tweet ids due to their size. Provide this option to have ids returned as strings instead. More about <a href=\"https://dev.twitter.com/docs/twitter-ids-json-and-snowflake\">Twitter IDs, JSON and Snowflake</a>.")
                                @QueryParam("stringify_ids") final Boolean stringify_ids) {
        //TODO: implement
        return null;
    }

    @GET
    @Produces("application/json")
    @Path("/show")
    @Category({"friendships"})
    @ApiVersion({"1.1"})
    @Tag({"follower management"})
    @See(href="endpoint/Twitter/GET/friendships/lookup", value = "GET friendships/lookup")
    @ApplicationLimit(rate = @Rate(window = 15, unit = GovernanceUnit.MINUTES, limit = 15))
    @UserLimit(rate = @Rate(window = 15, unit = GovernanceUnit.MINUTES, limit = 180))
    @Description("Returns detailed information about the relationship between two arbitrary users.")
    public Response getShow(@Description("The user_id of the subject user.")
                            @QueryParam("source_id") final Integer source_id, @Description("The screen_name of the subject user.")
                            @QueryParam("source_screen_name") final String source_screen_name, @Description("The user_id of the target user.")
                            @QueryParam("target_id") final Integer target_id, @Description("The screen_name of the target user.")
                            @QueryParam("target_screen_name") final String target_screen_name) {
        //TODO: implement
        return null;
    }

    @POST
    @Produces("application/json")
    @Path("/create")
    @Category({"friendships"})
    @ApiVersion({"1.1"})
    @Tag({"follower management", "following"})
    @Description("Allows the authenticating users to follow the user specified in the ID parameter. Returns the befriended user in the requested format when successful. Returns a string describing the failure condition when unsuccessful.")
    public UsersType postCreate(@Description("The screen name of the user for whom to befriend. ")
                                @QueryParam("screen_name") final String screen_name, @Description("The ID of the user for whom to befriend. ")
                                @QueryParam("user_id") final Integer user_id, @Description("Enable notifications for the target user.")
                                @QueryParam("follow") final Boolean follow) {
        //TODO: implement
        return null;
    }

    @POST
    @Produces("application/json")
    @Path("/destroy")
    @Category({"friendships"})
    @ApiVersion({"1.1"})
    @Tag({"follower management", "unfollowing"})
    @SeeAlso({@See(href="endpoint/Twitter/POST/friendships/create", value = "POST friendships/create"), @See(href="endpoint/Twitter/GET/friendships/lookup", value = "GET friendships/lookup")})
    @Description("Allows the authenticating user to unfollow the user specified in the ID parameter. Returns the unfollowed user in the requested format when successful. Returns a string describing the failure condition when unsuccessful. Actions taken in this method are asynchronous and changes will be eventually consistent.")
    public UsersType postDestroy(@Description("The screen name of the user for whom to unfollow. ")
                                 @QueryParam("screen_name") final String screen_name, @Description("The ID of the user for whom to unfollow. ")
                                 @QueryParam("user_id") final Integer user_id) {
        //TODO: implement
        return null;
    }

    @POST
    @Produces("application/json")
    @Path("/update")
    @Category({"friendships"})
    @ApiVersion({"1.1"})
    @Tag({"notifications"})
    @Description("Allows one to enable or disable retweets and device notifications from the specified user.")
    public Response postUpdate(@Description("The screen name of the user for whom to befriend. ")
                               @QueryParam("screen_name") final String screen_name, @Description("The ID of the user for whom to befriend. ")
                               @QueryParam("user_id") final Integer user_id, @Description("Enable/disable device notifications from the target user.")
                               @QueryParam("device") final String device, @Description("Enable/disable retweets from the target user.")
                               @QueryParam("retweets") final String retweets) {
        //TODO: implement
        return null;
    }

}
