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
import com.twitter.dev.api.TweetsType;
import com.twitter.dev.api.UsersType;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

@Path("/lists")
public class ListsResource {

    @GET
    @Produces("application/json")
    @Path("/list")
    @Category({"lists"})
    @ApiVersion({"1.1"})
    @ApplicationLimit(rate = @Rate(window = 15, unit = GovernanceUnit.MINUTES, limit = 15))
    @UserLimit(rate = @Rate(window = 15, unit = GovernanceUnit.MINUTES, limit = 15))
    @Description("Returns all lists the authenticating or specified user subscribes to, including their own. The user is specified using the user_id or screen_name parameters. If no user is given, the authenticating user is used. This method used to be GET lists in version 1.0 of the API and has been renamed for consistency with other call.")
    public Response getList(@Description("The ID of the user for whom to return results for. Helpful for disambiguating when a valid user ID is also a valid screen name.")
                            @QueryParam("user_id") final Integer user_id, @Description("The screen name of the user for whom to return results for. Helpful for disambiguating when a valid screen name is also a user ID.")
                            @QueryParam("screen_name") final String screen_name, @Description("Set this to <tt>true</tt> if you would like owned lists to be returned first. See description above for information on how this parameter works.")
                            @QueryParam("reverse") final Boolean reverse) {
        //TODO: implement
        return null;
    }

    @GET
    @Produces("application/json")
    @Path("/members")
    @Category({"lists"})
    @ApiVersion({"1.1"})
    @Tag({"List Members", "list management"})
    @See(href="endpoint/twitter/GET/lists/members/show", value = "GET lists/members/show")
    @Description("Returns the members of the specified list. Private list members will only be shown if the authenticated user owns the specified list.")
    public UsersType getMembers(@Description("The numerical <tt>id</tt> of the list.")
                                @PathParam("list_id") final String list_id, @Description("You can identify a list by its slug instead of its numerical id. If you decide to do so, note that you'll also have to specify the list owner using the <tt>owner_id</tt> or <tt>owner_screen_name</tt> parameters.")
                                @PathParam("slug") final String slug, @Description("The screen name of the user who owns the list being requested by a <tt>slug</tt>.")
                                @QueryParam("owner_screen_name") final String owner_screen_name, @Description("The user ID of the user who owns the list being requested by a <tt>slug</tt>.")
                                @QueryParam("owner_id") final String owner_id,
                                @Description("Causes the collection of list members to be broken into \"pages\" of somewhat consistent size. If no cursor is provided, a value of <tt>-1</tt> will be assumed, which is the first \"page.\"<br /><br /> The response from the API will include a <tt>previous_cursor</tt> and <tt>next_cursor</tt> to allow paging back and forth. See <a href=\"https://dev.twitter.com/docs/misc/cursoring\">Using cursors to navigate collections</a> for more information.")
                                @QueryParam("cursor") final String cursor, @Description("The <tt>entities</tt> node will be disincluded when set to <tt>false</tt>.")
                                @QueryParam("include_entities") final Boolean include_entities, @Description("When set to either <tt>true</tt>, <tt>t</tt> or <tt>1</tt> statuses will not be included in the returned user objects.")
                                @QueryParam("skip_status") final String skip_status) {
        //TODO: implement
        return null;
    }

    @GET
    @Produces("application/json")
    @Path("/members/show")
    @Category({"lists"})
    @ApiVersion({"1.1"})
    @ApplicationLimit(rate = @Rate(window = 15, unit = GovernanceUnit.MINUTES, limit = 15))
    @UserLimit(rate = @Rate(window = 15, unit = GovernanceUnit.MINUTES, limit = 15))
    @Description("Check if the specified user is a member of the specified list.")
    public UsersType getMembersshow(@Description("The numerical <tt>id</tt> of the list.")
                                    @PathParam("list_id") final String list_id, @Description("You can identify a list by its slug instead of its numerical id. If you decide to do so, note that you'll also have to specify the list owner using the <tt>owner_id</tt> or <tt>owner_screen_name</tt> parameters.")
                                    @PathParam("slug") final String slug, @Description("The ID of the user for whom to return results for. Helpful for disambiguating when a valid user ID is also a valid screen name.")
                                    @PathParam("user_id") final String user_id, @Description("The screen name of the user for whom to return results for. Helpful for disambiguating when a valid screen name is also a user ID.")
                                    @PathParam("screen_name") final String screen_name,
                                    @Description("The screen name of the user who owns the list being requested by a <tt>slug</tt>.")
                                    @QueryParam("owner_screen_name") final String owner_screen_name, @Description("The user ID of the user who owns the list being requested by a <tt>slug</tt>.")
                                    @QueryParam("owner_id") final String owner_id, @Description("When set to either <tt>true</tt>, <tt>t</tt> or <tt>1</tt>, each tweet will include a node called \"entities\". This node offers a variety of metadata about the tweet in a discreet structure, including: user_mentions, urls, and hashtags. While entities are opt-in on timelines at present, they will be made a default component of output in the future. See <strong><u><a href=\"/pages/tweet_entities\">Tweet Entities</a></u></strong> for more details.")
                                    @QueryParam("include_entities") final String include_entities, @Description("When set to either <tt>true</tt>, <tt>t</tt> or <tt>1</tt> statuses will not be included in the returned user objects.")
                                    @QueryParam("skip_status") final String skip_status) {
        //TODO: implement
        return null;
    }

    @POST
    @Produces("application/json")
    @Path("/members/create")
    @Category({"lists"})
    @ApiVersion({"1.1"})

    @Description("Add a member to a list. The authenticated user must own the list to be able to add members to it. Note that lists can&#039;t have more than 500 members.")
    public UsersType postMemberscreate(@Description("The numerical <tt>id</tt> of the list.")
                                       @PathParam("list_id") final String list_id, @Description("You can identify a list by its slug instead of its numerical id. If you decide to do so, note that you'll also have to specify the list owner using the <tt>owner_id</tt> or <tt>owner_screen_name</tt> parameters.")
                                       @PathParam("slug") final String slug, @Description("The ID of the user for whom to return results for. Helpful for disambiguating when a valid user ID is also a valid screen name.")
                                       @PathParam("user_id") final String user_id, @Description("The screen name of the user for whom to return results for. Helpful for disambiguating when a valid screen name is also a user ID.")
                                       @PathParam("screen_name") final String screen_name,
                                       @Description("The screen name of the user who owns the list being requested by a <tt>slug</tt>.")
                                       @QueryParam("owner_screen_name") final String owner_screen_name, @Description("The user ID of the user who owns the list being requested by a <tt>slug</tt>.")
                                       @QueryParam("owner_id") final String owner_id) {
        //TODO: implement
        return null;
    }

    @POST
    @Produces("application/json")
    @Path("/members/create_all")
    @Category({"lists"})
    @ApiVersion({"1.1"})
    @Description("Adds multiple members to a list, by specifying a comma-separated list of member ids or screen names. The authenticated user must own the list to be able to add members to it. Note that lists can&#039;t have more than 5,000 members, and you are limited to adding up to 100 members to a list at a time with this method.")
    public UsersType postMemberscreate_all(@Description("The numerical <tt>id</tt> of the list.")
                                           @PathParam("list_id") final String list_id, @Description("You can identify a list by its slug instead of its numerical id. If you decide to do so, note that you'll also have to specify the list owner using the <tt>owner_id</tt> or <tt>owner_screen_name</tt> parameters.")
                                           @PathParam("slug") final String slug, @Description("A comma separated list of user IDs, up to 100 are allowed in a single request.")
                                           @QueryParam("user_id") final String user_id, @Description("A comma separated list of screen names, up to 100 are allowed in a single request.")
                                           @QueryParam("screen_name") final String screen_name,
                                           @Description("The screen name of the user who owns the list being requested by a <tt>slug</tt>.")
                                           @QueryParam("owner_screen_name") final String owner_screen_name, @Description("The user ID of the user who owns the list being requested by a <tt>slug</tt>.")
                                           @QueryParam("owner_id") final String owner_id) {
        //TODO: implement
        return null;
    }

    @POST
    @Produces("application/json")
    @Path("/members/destroy")
    @Category({"lists"})
    @ApiVersion({"1.1"})
    @Description("Removes the specified member from the list. The authenticated user must be the list&#039;s owner to remove members from the list.")
    public Response postMembersdestroy(@Description("The numerical <tt>id</tt> of the list.")
                                       @QueryParam("list_id") final String list_id, @Description("You can identify a list by its slug instead of its numerical id. If you decide to do so, note that you'll also have to specify the list owner using the <tt>owner_id</tt> or <tt>owner_screen_name</tt> parameters.")
                                       @QueryParam("slug") final String slug, @Description("The ID of the user to remove from the list. Helpful for disambiguating when a valid user ID is also a valid screen name.")
                                       @QueryParam("user_id") final String user_id, @Description("The screen name of the user for whom to remove from the list. Helpful for disambiguating when a valid screen name is also a user ID.")
                                       @QueryParam("screen_name") final String screen_name,
                                       @Description("The screen name of the user who owns the list being requested by a <tt>slug</tt>.")
                                       @QueryParam("owner_screen_name") final String owner_screen_name, @Description("The user ID of the user who owns the list being requested by a <tt>slug</tt>.")
                                       @QueryParam("owner_id") final String owner_id) {
        //TODO: implement
        return null;
    }

    @POST
    @Produces("application/json")
    @Path("/members/destroy_all")
    @Category({"lists"})
    @ApiVersion({"1.1"})
    @Tag({"List Members", "list management"})
    @Description("Removes multiple members from a list, by specifying a comma-separated list of member ids or screen names. The authenticated user must own the list to be able to remove members from it. Note that lists can&#039;t have more than 500 members, and you are limited to removing up to 100 members to a list at a time with this method.")
    public Response postMembersdestroy_all(@Description("The numerical <tt>id</tt> of the list.")
                                           @PathParam("list_id") final String list_id, @Description("You can identify a list by its slug instead of its numerical id. If you decide to do so, note that you'll also have to specify the list owner using the <tt>owner_id</tt> or <tt>owner_screen_name</tt> parameters.")
                                           @PathParam("slug") final String slug, @Description("A comma separated list of user IDs, up to 100 are allowed in a single request.")
                                           @QueryParam("user_id") final String user_id, @Description("A comma separated list of screen names, up to 100 are allowed in a single request.")
                                           @QueryParam("screen_name") final String screen_name,
                                           @Description("The screen name of the user who owns the list being requested by a <tt>slug</tt>.")
                                           @QueryParam("owner_screen_name") final String owner_screen_name, @Description("The user ID of the user who owns the list being requested by a <tt>slug</tt>.")
                                           @QueryParam("owner_id") final String owner_id) {
        //TODO: implement
        return null;
    }

    @GET
    @Produces("application/json")
    @Path("/memberships")
    @Category({"lists"})
    @ApiVersion({"1.1"})
    @SeeAlso({@See(href="endpoint/twitter/GET/lists/statuses", value = "GET lists/statuses"), @See(href="endpoint/twitter/GET/lists/list", value = "GET lists/list"), @See(href="endpoint/twitter/GET/lists/memberships", value = "GET lists/memberships"), @See(href="endpoint/twitter/GET/lists/ownerships", value = "GET lists/ownerships"), @See(href="endpoint/twitter/GET/lists/subscriptions", value = "GET lists/subscriptions")})
    @ApplicationLimit(rate = @Rate(window = 15, unit = GovernanceUnit.MINUTES, limit = 15))
    @UserLimit(rate = @Rate(window = 15, unit = GovernanceUnit.MINUTES, limit = 15))
    @Description("Returns the lists the specified user has been added to. If user_id or screen_name are not provided the memberships for the authenticating user are returned.")
    public Response getMemberships(@Description("The ID of the user for whom to return results for. Helpful for disambiguating when a valid user ID is also a valid screen name.")
                                   @QueryParam("user_id") final String user_id, @Description("The screen name of the user for whom to return results for. Helpful for disambiguating when a valid screen name is also a user ID.")
                                   @QueryParam("screen_name") final String screen_name, @Description("Breaks the results into pages. Provide a value of <tt>-1</tt> to begin paging. Provide values as returned in the response body's <tt>next_cursor</tt> and <tt>previous_cursor</tt> attributes to page back and forth in the list. It is recommended to always use cursors when the method supports them. See <a href=\"https://dev.twitter.com/docs/misc/cursoring\">Using cursors to navigate collections</a> for more information.")
                                   @QueryParam("cursor") final String cursor, @Description("When set to <tt>true</tt>, <tt>t</tt> or <tt>1</tt>, will return just lists the authenticating user owns, and the user represented by <tt>user_id</tt> or <tt>screen_name</tt> is a member of.")
                                   @QueryParam("filter_to_owned_lists") final String filter_to_owned_lists) {
        //TODO: implement
        return null;
    }

    @GET
    @Produces("application/json")
    @Path("/ownerships")
    @Category({"lists"})
    @ApiVersion({"1.1"})
    @Tag({"finding lists", "list management"})
    @SeeAlso({@See(href="endpoint/twitter/GET/lists/memberships", value = "GET lists/memberships"), @See(href="endpoint/twitter/GET/lists/list", value = "GET lists/list"), @See(href="endpoint/twitter/GET/lists/subscriptions", value = "GET lists/subscriptions"), @See(href="endpoint/twitter/GET/lists/statuses", value = "GET lists/statuses")})
    @ApplicationLimit(rate = @Rate(window = 15, unit = GovernanceUnit.MINUTES, limit = 15))
    @UserLimit(rate = @Rate(window = 15, unit = GovernanceUnit.MINUTES, limit = 15))
    @Description("Returns the lists owned by the specified Twitter user. Private lists will only be shown if the authenticated user is also the owner of the lists.")
    public Response getOwnerships(@Description("The ID of the user for whom to return results for.")
                                  @QueryParam("user_id") final String user_id, @Description("The screen name of the user for whom to return results for.")
                                  @QueryParam("screen_name") final String screen_name, @Description("The amount of results to return per page. Defaults to 20. No more than 1000 results will ever be returned in a single page.")
                                  @QueryParam("count") final Integer count, @Description("Breaks the results into pages. Provide a value of <tt>-1</tt> to begin paging. Provide values as returned in the response body's <tt>next_cursor</tt> and <tt>previous_cursor</tt> attributes to page back and forth in the list. It is recommended to always use cursors when the method supports them. See <a href=\"https://dev.twitter.com/docs/misc/cursoring\">Using cursors to navigate collections</a> for more information.")
                                  @QueryParam("cursor") final String cursor) {
        //TODO: implement
        return null;
    }

    @GET
    @Produces("application/json")
    @Path("/show")
    @Category({"lists"})
    @ApiVersion({"1.1"})
    @ApplicationLimit(rate = @Rate(window = 15, unit = GovernanceUnit.MINUTES, limit = 15))
    @UserLimit(rate = @Rate(window = 15, unit = GovernanceUnit.MINUTES, limit = 15))
    @Description("Returns the specified list. Private lists will only be shown if the authenticated user owns the specified list.")
    public Response getShow(@Description("The numerical <tt>id</tt> of the list.")
                            @PathParam("list_id") final String list_id, @Description("You can identify a list by its slug instead of its numerical id. If you decide to do so, note that you'll also have to specify the list owner using the <tt>owner_id</tt> or <tt>owner_screen_name</tt> parameters.")
                            @PathParam("slug") final String slug, @Description("The screen name of the user who owns the list being requested by a <tt>slug</tt>.")
                            @QueryParam("owner_screen_name") final String owner_screen_name, @Description("The user ID of the user who owns the list being requested by a <tt>slug</tt>.")
                            @QueryParam("owner_id") final String owner_id) {
        //TODO: implement
        return null;
    }

    @GET
    @Produces("application/json")
    @Path("/statuses")
    @Category({"lists"})
    @ApiVersion({"1.1"})
    @SeeAlso({@See(href="endpoint/twitter/GET/lists/list", value = "GET lists/list"), @See(href="endpoint/twitter/GET/statuses/home_timeline", value = "GET statuses/home_timeline"), @See(href="endpoint/twitter/GET/lists/subscriptions", value = "GET lists/subscriptions"), @See(href="endpoint/twitter/GET/lists/memberships", value = "GET lists/memberships"), @See(href="endpoint/twitter/GET/lists/ownerships", value = "GET lists/ownerships"), })
    @ApplicationLimit(rate = @Rate(window = 15, unit = GovernanceUnit.MINUTES, limit = 180))
    @UserLimit(rate = @Rate(window = 15, unit = GovernanceUnit.MINUTES, limit = 180))
    @Description("Returns a timeline of tweets authored by members of the specified list. Retweets are included by default. Use the include_rts=false parameter to omit retweets. Embedded Timelines is a great way to embed list timelines on your website.")
    public TweetsType getStatuses(@Description("The numerical <tt>id</tt> of the list.")
                                  @PathParam("list_id") final String list_id, @Description("You can identify a list by its slug instead of its numerical id. If you decide to do so, note that you'll also have to specify the list owner using the <tt>owner_id</tt> or <tt>owner_screen_name</tt> parameters.")
                                  @PathParam("slug") final String slug, @Description("The screen name of the user who owns the list being requested by a <tt>slug</tt>.")
                                  @QueryParam("owner_screen_name") final String owner_screen_name, @Description("The user ID of the user who owns the list being requested by a <tt>slug</tt>.")
                                  @QueryParam("owner_id") final String owner_id,
                                  @Description("Returns results with an ID greater than (that is, more recent than) the specified ID. There are limits to the number of Tweets which can be accessed through the API. If the limit of Tweets has occured since the since_id, the since_id will be forced to the oldest ID available.")
                                  @QueryParam("since_id") final String since_id, @Description("Returns results with an ID less than (that is, older than) or equal to the specified ID.")
                                  @QueryParam("max_id") final String max_id, @Description("Specifies the number of results to retrieve per \"page.\"")
                                  @QueryParam("count") final Integer count, @Description("Entities are ON by default in API 1.1, each tweet includes a node called \"entities\". This node offers a variety of metadata about the tweet in a discreet structure, including: user_mentions, urls, and hashtags. You can omit entities from the result by using <tt>include_entities=false</tt>")
                                  @QueryParam("include_entities") final String include_entities,
                                  @Description("When set to either <tt>true</tt>, <tt>t</tt> or <tt>1</tt>, the list timeline will contain native retweets (if they exist) in addition to the standard stream of tweets. The output format of retweeted tweets is identical to the representation you see in home_timeline.")
                                  @QueryParam("include_rts") final String include_rts) {
        //TODO: implement
        return null;
    }

    @GET
    @Produces("application/json")
    @Path("/subscribers")
    @Category({"lists"})
    @ApiVersion({"1.1"})
    @Description("Returns the subscribers of the specified list. Private list subscribers will only be shown if the authenticated user owns the specified list.")
    public UsersType getSubscribers(@Description("The numerical <tt>id</tt> of the list.")
                                    @PathParam("list_id") final String list_id, @Description("You can identify a list by its slug instead of its numerical id. If you decide to do so, note that you'll also have to specify the list owner using the <tt>owner_id</tt> or <tt>owner_screen_name</tt> parameters.")
                                    @PathParam("slug") final String slug, @Description("The screen name of the user who owns the list being requested by a <tt>slug</tt>.")
                                    @QueryParam("owner_screen_name") final String owner_screen_name, @Description("The user ID of the user who owns the list being requested by a <tt>slug</tt>.")
                                    @QueryParam("owner_id") final String owner_id,
                                    @Description("Breaks the results into pages. A single page contains 20 lists. Provide a value of <tt>-1</tt> to begin paging. Provide values as returned in the response body's <tt>next_cursor</tt> and <tt>previous_cursor</tt> attributes to page back and forth in the list.")
                                    @QueryParam("cursor") final String cursor, @Description("When set to either <tt>true</tt>, <tt>t</tt> or <tt>1</tt>, each tweet will include a node called \"entities\". This node offers a variety of metadata about the tweet in a discreet structure, including: user_mentions, urls, and hashtags. While entities are opt-in on timelines at present, they will be made a default component of output in the future. See <strong><u><a href=\"/pages/tweet_entities\">Tweet Entities</a></u></strong> for more details.")
                                    @QueryParam("include_entities") final String include_entities, @Description("When set to either <tt>true</tt>, <tt>t</tt> or <tt>1</tt> statuses will not be included in the returned user objects.")
                                    @QueryParam("skip_status") final String skip_status) {
        //TODO: implement
        return null;
    }

    @GET
    @Produces("application/json")
    @Path("/subscribers/show")
    @Category({"lists"})
    @ApiVersion({"1.1"})
    @ApplicationLimit(rate = @Rate(window = 15, unit = GovernanceUnit.MINUTES, limit = 15))
    @UserLimit(rate = @Rate(window = 15, unit = GovernanceUnit.MINUTES, limit = 15))
    @Description("Check if the specified user is a subscriber of the specified list. Returns the user if they are subscriber.")
    public UsersType getSubscribersshow(@Description("The screen name of the user who owns the list being requested by a <tt>slug</tt>.")
                                        @QueryParam("owner_screen_name") final String owner_screen_name, @Description("The user ID of the user who owns the list being requested by a <tt>slug</tt>.")
                                        @QueryParam("owner_id") final String owner_id, @Description("The numerical <tt>id</tt> of the list.")
                                        @PathParam("list_id") final String list_id, @Description("You can identify a list by its slug instead of its numerical id. If you decide to do so, note that you'll also have to specify the list owner using the <tt>owner_id</tt> or <tt>owner_screen_name</tt> parameters.")
                                        @PathParam("slug") final String slug,
                                        @Description("The ID of the user for whom to return results for. Helpful for disambiguating when a valid user ID is also a valid screen name.")
                                        @PathParam("user_id") final String user_id, @Description("The screen name of the user for whom to return results for. Helpful for disambiguating when a valid screen name is also a user ID.")
                                        @PathParam("screen_name") final String screen_name, @Description("When set to either <tt>true</tt>, <tt>t</tt> or <tt>1</tt>, each tweet will include a node called \"entities\". This node offers a variety of metadata about the tweet in a discreet structure, including: user_mentions, urls, and hashtags. While entities are opt-in on timelines at present, they will be made a default component of output in the future. See <strong><u><a href=\"/pages/tweet_entities\">Tweet Entities</a></u></strong> for more details.")
                                        @QueryParam("include_entities") final String include_entities, @Description("When set to either <tt>true</tt>, <tt>t</tt> or <tt>1</tt> statuses will not be included in the returned user objects.")
                                        @QueryParam("skip_status") final String skip_status) {
        //TODO: implement
        return null;
    }

    @POST
    @Produces("application/json")
    @Path("/subscribers/create")
    @Category({"lists"})
    @ApiVersion({"1.1"})

    @Description("Subscribes the authenticated user to the specified list.")
    public UsersType postSubscriberscreate(@Description("The screen name of the user who owns the list being requested by a <tt>slug</tt>.")
                                           @QueryParam("owner_screen_name") final String owner_screen_name, @Description("The user ID of the user who owns the list being requested by a <tt>slug</tt>.")
                                           @QueryParam("owner_id") final String owner_id, @Description("The numerical <tt>id</tt> of the list.")
                                           @PathParam("list_id") final String list_id, @Description("You can identify a list by its slug instead of its numerical id. If you decide to do so, note that you'll also have to specify the list owner using the <tt>owner_id</tt> or <tt>owner_screen_name</tt> parameters.")
                                           @PathParam("slug") final String slug) {
        //TODO: implement
        return null;
    }

    @POST
    @Produces("application/json")
    @Path("/subscribers/destroy")
    @Category({"lists"})
    @ApiVersion({"1.1"})

    @Description("Unsubscribes the authenticated user from the specified list.")
    public Response postSubscribersdestroy(@Description("The numerical <tt>id</tt> of the list.")
                                           @PathParam("list_id") final String list_id, @Description("You can identify a list by its slug instead of its numerical id. If you decide to do so, note that you'll also have to specify the list owner using the <tt>owner_id</tt> or <tt>owner_screen_name</tt> parameters.")
                                           @PathParam("slug") final String slug, @Description("The screen name of the user who owns the list being requested by a <tt>slug</tt>.")
                                           @QueryParam("owner_screen_name") final String owner_screen_name, @Description("The user ID of the user who owns the list being requested by a <tt>slug</tt>.")
                                           @QueryParam("owner_id") final String owner_id) {
        //TODO: implement
        return null;
    }

    @GET
    @Produces("application/json")
    @Path("/subscriptions")
    @Category({"lists"})
    @ApiVersion({"1.1"})
    @Tag({"Lists"})
    @SeeAlso({@See(href="endpoint/twitter/GET/lists/memberships", value = "GET lists/memberships"), @See(href="endpoint/twitter/GET/lists/list", value = "GET lists/list"), @See(href="endpoint/twitter/GET/lists/ownerships", value = "GET lists/ownerships"), @See(href="endpoint/twitter/GET/lists/statuses", value = "GET lists/statuses")})
    @ApplicationLimit(rate = @Rate(window = 15, unit = GovernanceUnit.MINUTES, limit = 15))
    @UserLimit(rate = @Rate(window = 15, unit = GovernanceUnit.MINUTES, limit = 15))
    @Description("Obtain a collection of the lists the specified user is subscribed to, 20 lists per page by default. Does not include the user&#039;s own lists.")
    public Response getSubscriptions(@Description("The ID of the user for whom to return results for. Helpful for disambiguating when a valid user ID is also a valid screen name.")
                                     @QueryParam("user_id") final String user_id, @Description("The screen name of the user for whom to return results for. Helpful for disambiguating when a valid screen name is also a user ID.")
                                     @QueryParam("screen_name") final String screen_name, @Description("The amount of results to return per page. Defaults to 20. No more than 1000 results will ever be returned in a single page.")
                                     @QueryParam("count") final Integer count, @Description("Breaks the results into pages. Provide a value of <tt>-1</tt> to begin paging. Provide values as returned in the response body's <tt>next_cursor</tt> and <tt>previous_cursor</tt> attributes to page back and forth in the list. It is recommended to always use cursors when the method supports them. See <a href=\"https://dev.twitter.com/docs/misc/cursoring\">Using cursors to navigate collections</a> for more information.")
                                     @QueryParam("cursor") final String cursor) {
        //TODO: implement
        return null;
    }

    @POST
    @Produces("application/json")
    @Path("/create")
    @Category({"lists"})
    @ApiVersion({"1.1"})

    @Description("Creates a new list for the authenticated user. Note that you can&#039;t create more than 20 lists per account.")
    public Response postCreate(@Description("The name for the list.")
                               @PathParam("name") final String name, @Description("Whether your list is public or private. Values can be <tt>public</tt> or <tt>private</tt>. If no mode is specified the list will be public.")
                               @QueryParam("mode") final String mode, @Description("The description to give the list.")
                               @QueryParam("description") final String description) {
        //TODO: implement
        return null;
    }

    @POST
    @Produces("application/json")
    @Path("/destroy")
    @Category({"lists"})
    @ApiVersion({"1.1"})

    @Description("Deletes the specified list. The authenticated user must own the list to be able to destroy it.")
    public Response postDestroy(@Description("The screen name of the user who owns the list being requested by a <tt>slug</tt>.")
                                @QueryParam("owner_screen_name") final String owner_screen_name, @Description("The user ID of the user who owns the list being requested by a <tt>slug</tt>.")
                                @QueryParam("owner_id") final String owner_id, @Description("The numerical <tt>id</tt> of the list.")
                                @PathParam("list_id") final String list_id, @Description("You can identify a list by its slug instead of its numerical id. If you decide to do so, note that you'll also have to specify the list owner using the <tt>owner_id</tt> or <tt>owner_screen_name</tt> parameters.")
                                @PathParam("slug") final String slug) {
        //TODO: implement
        return null;
    }

    @POST
    @Produces("application/json")
    @Path("/update")
    @Category({"lists"})
    @ApiVersion({"1.1"})

    @Description("Updates the specified list. The authenticated user must own the list to be able to update it.")
    public Response postUpdate(@Description("The numerical <tt>id</tt> of the list.")
                               @PathParam("list_id") final String list_id, @Description("You can identify a list by its slug instead of its numerical id. If you decide to do so, note that you'll also have to specify the list owner using the <tt>owner_id</tt> or <tt>owner_screen_name</tt> parameters.")
                               @PathParam("slug") final String slug, @Description("The name for the list.")
                               @QueryParam("name") final String name, @Description("Whether your list is public or private. Values can be <tt>public</tt> or <tt>private</tt>. If no mode is specified the list will be public.")
                               @QueryParam("mode") final String mode,
                               @Description("The description to give the list.")
                               @QueryParam("description") final String description, @Description("The screen name of the user who owns the list being requested by a <tt>slug</tt>.")
                               @QueryParam("owner_screen_name") final String owner_screen_name, @Description("The user ID of the user who owns the list being requested by a <tt>slug</tt>.")
                               @QueryParam("owner_id") final String owner_id) {
        //TODO: implement
        return null;
    }

}
