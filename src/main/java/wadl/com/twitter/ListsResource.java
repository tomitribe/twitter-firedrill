/**
 * Created by Tomitribe CXF WadlToJava code generator
**/
package com.twitter;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;
import com.tomitribe.tribestream.governance.api.ApplicationLimit;
import com.tomitribe.tribestream.governance.api.Concurrent;
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

@Path("/lists")
public class ListsResource {

    @GET
    @Produces("application/json")
    @Path("/list")
    @Category({"lists"})
    @ApiVersion({"1.1"})
    @SeeAlso({@See(href = "/docs/api/get-userlistsmemberships", value="GET :user/lists/memberships"),@See(href = "/docs/api/get-userlistssubscriptions", value="GET :user/lists/subscriptions")})
    @ApplicationLimit(rate = @Rate(window = 15, unit = GovernanceUnit.MINUTES, limit = 15))@UserLimit(rate = @Rate(window = 15, unit = GovernanceUnit.MINUTES, limit = 15))@Description("Returns all lists the authenticating or specified user subscribes to, including their own. The user is specified using the user_id or screen_name parameters. If no user is given, the authenticating user is used. This method used to be GET lists in version 1.0 of the API and has been renamed for consistency with other call.")
    public Response getList(@Description("The ID of the user for whom to return results for. Helpful for disambiguating when a valid user ID is also a valid screen name.")
     @QueryParam("user_id") final Integer user_id, @Description("The screen name of the user for whom to return results for. Helpful for disambiguating when a valid screen name is also a user ID.")
     @QueryParam("screen_name") final String screen_name, @Description("Set this to &lt;tt&gt;true&lt;/tt&gt; if you would like owned lists to be returned first. See description above for information on how this parameter works.")
     @QueryParam("reverse") final Boolean reverse) {
        //TODO: implement
        return null;
    }

    @GET
    @Produces("application/json")
    @Path("/members")
    @Category({"lists"})
    @ApiVersion({"1.1"})
    @Tag({"List Members","list management"})
    @See(href = "/docs/api/1.1/get/lists/members/show", value="GET lists/members/show")
    @Description("Returns the members of the specified list. Private list members will only be shown if the authenticated user owns the specified list.")
    public UsersType getMembers(@Description("The numerical &lt;tt&gt;id&lt;/tt&gt; of the list.")
     @PathParam("list_id") final String list_id, @Description("You can identify a list by its slug instead of its numerical id. If you decide to do so, note that you&apos;ll also have to specify the list owner using the &lt;tt&gt;owner_id&lt;/tt&gt; or &lt;tt&gt;owner_screen_name&lt;/tt&gt; parameters.")
     @PathParam("slug") final String slug, @Description("The screen name of the user who owns the list being requested by a ")
     @QueryParam("owner_screen_name") final String owner_screen_name, @Description("The user ID of the user who owns the list being requested by a &lt;tt&gt;slug&lt;/tt&gt;.")
     @QueryParam("owner_id") final String owner_id, 
                @Description("Causes the collection of list members to be broken into &quot;pages&quot; of somewhat consistent size. If no cursor is provided, a value of ")
     @QueryParam("cursor") final String cursor, @Description("The &lt;tt&gt;entities&lt;/tt&gt; node will be disincluded when set to &lt;tt&gt;false&lt;/tt&gt;.")
     @QueryParam("include_entities") final Boolean include_entities, @Description("When set to either &lt;tt&gt;true&lt;/tt&gt;, &lt;tt&gt;t&lt;/tt&gt; or &lt;tt&gt;1&lt;/tt&gt; statuses will not be included in the returned user objects.")
     @QueryParam("skip_status") final String skip_status) {
        //TODO: implement
        return null;
    }

    @GET
    @Produces("application/json")
    @Path("/members/show")
    @Category({"lists"})
    @ApiVersion({"1.1"})
    @SeeAlso({@See(href = "/docs/api/1/get/lists/subscribers", value="GET lists/subscribers"),@See(href = "/docs/api/1/get/lists/subscribers/show", value="GET lists/subscribers/show")})
    @ApplicationLimit(rate = @Rate(window = 15, unit = GovernanceUnit.MINUTES, limit = 15))@UserLimit(rate = @Rate(window = 15, unit = GovernanceUnit.MINUTES, limit = 15))@Description("Check if the specified user is a member of the specified list.")
    public UsersType getMembersshow(@Description("The numerical &lt;tt&gt;id&lt;/tt&gt; of the list.")
     @PathParam("list_id") final String list_id, @Description("You can identify a list by its slug instead of its numerical id. If you decide to do so, note that you&apos;ll also have to specify the list owner using the ")
     @PathParam("slug") final String slug, @Description("The ID of the user for whom to return results for. Helpful for disambiguating when a valid user ID is also a valid screen name.")
     @PathParam("user_id") final String user_id, @Description("The screen name of the user for whom to return results for. Helpful for disambiguating when a valid screen name is also a user ID.")
     @PathParam("screen_name") final String screen_name, 
                @Description("The screen name of the user who owns the list being requested by a ")
     @QueryParam("owner_screen_name") final String owner_screen_name, @Description("The user ID of the user who owns the list being requested by a &lt;tt&gt;slug&lt;/tt&gt;.")
     @QueryParam("owner_id") final String owner_id, @Description("When set to either &lt;tt&gt;true&lt;/tt&gt;, &lt;tt&gt;t&lt;/tt&gt; or &lt;tt&gt;1&lt;/tt&gt;, each tweet will include a node called &quot;entities&quot;. This node offers a variety of metadata about the tweet in a discreet structure, including: user_mentions, urls, and hashtags. While entities are opt-in on timelines at present, they will be made a default component of output in the future. See &lt;strong&gt;&lt;u&gt;&lt;a href=&quot;/pages/tweet_entities&quot;&gt;Tweet Entities&lt;/a&gt;&lt;/u&gt;&lt;/strong&gt; for more details.")
     @QueryParam("include_entities") final String include_entities, @Description("When set to either &lt;tt&gt;true&lt;/tt&gt;, &lt;tt&gt;t&lt;/tt&gt; or &lt;tt&gt;1&lt;/tt&gt; statuses will not be included in the returned user objects.")
     @QueryParam("skip_status") final String skip_status) {
        //TODO: implement
        return null;
    }

    @POST
    @Produces("application/json")
    @Path("/members/create")
    @Category({"lists"})
    @ApiVersion({"1.1"})
    @See(href = "/docs/api/1/post/lists/members/create_all", value="POST lists/members/create_all")
    @Description("Add a member to a list. The authenticated user must own the list to be able to add members to it. Note that lists can")
    public UsersType postMemberscreate(@Description("The numerical &lt;tt&gt;id&lt;/tt&gt; of the list.")
     @PathParam("list_id") final String list_id, @Description("You can identify a list by its slug instead of its numerical id. If you decide to do so, note that you&apos;ll also have to specify the list owner using the ")
     @PathParam("slug") final String slug, @Description("The ID of the user for whom to return results for. Helpful for disambiguating when a valid user ID is also a valid screen name.")
     @PathParam("user_id") final String user_id, @Description("The screen name of the user for whom to return results for. Helpful for disambiguating when a valid screen name is also a user ID.")
     @PathParam("screen_name") final String screen_name, 
                @Description("The screen name of the user who owns the list being requested by a ")
     @QueryParam("owner_screen_name") final String owner_screen_name, @Description("The user ID of the user who owns the list being requested by a &lt;tt&gt;slug&lt;/tt&gt;.")
     @QueryParam("owner_id") final String owner_id) {
        //TODO: implement
        return null;
    }

    @POST
    @Produces("application/json")
    @Path("/members/create_all")
    @Category({"lists"})
    @ApiVersion({"1.1"})
    @SeeAlso({@See(href = "/docs/api/1/post/lists/members/destroy", value="POST lists/members/destroy"),@See(href = "/docs/api/1/get/lists/memberships", value="GET lists/memberships"),@See(href = "/docs/api/1/post/lists/members/destroy_all", value="POST lists/members/destroy_all")})
    @Description("Adds multiple members to a list, by specifying a comma-separated list of member ids or screen names. The authenticated user must own the list to be able to add members to it. Note that lists can&amp;#039;t have more than 5,000 members, and you are limited to adding up to 100 members to a list at a time with this method.")
    public UsersType postMemberscreate_all(@Description("The numerical &lt;tt&gt;id&lt;/tt&gt; of the list.")
     @PathParam("list_id") final String list_id, @Description("You can identify a list by its slug instead of its numerical id. If you decide to do so, note that you&apos;ll also have to specify the list owner using the ")
     @PathParam("slug") final String slug, @Description("A comma separated list of user IDs, up to 100 are allowed in a single request.")
     @QueryParam("user_id") final String user_id, @Description("A comma separated list of screen names, up to 100 are allowed in a single request.")
     @QueryParam("screen_name") final String screen_name, 
                @Description("The screen name of the user who owns the list being requested by a ")
     @QueryParam("owner_screen_name") final String owner_screen_name, @Description("The user ID of the user who owns the list being requested by a &lt;tt&gt;slug&lt;/tt&gt;.")
     @QueryParam("owner_id") final String owner_id) {
        //TODO: implement
        return null;
    }

    @POST
    @Produces("application/json")
    @Path("/members/destroy")
    @Category({"lists"})
    @ApiVersion({"1.1"})
    @Description("Removes the specified member from the list. The authenticated user must be the list")
    public Response postMembersdestroy(@Description("The numerical &lt;tt&gt;id&lt;/tt&gt; of the list.")
     @QueryParam("list_id") final String list_id, @Description("You can identify a list by its slug instead of its numerical id. If you decide to do so, note that you&apos;ll also have to specify the list owner using the ")
     @QueryParam("slug") final String slug, @Description("The ID of the user to remove from the list. Helpful for disambiguating when a valid user ID is also a valid screen name.")
     @QueryParam("user_id") final String user_id, @Description("The screen name of the user for whom to remove from the list. Helpful for disambiguating when a valid screen name is also a user ID.")
     @QueryParam("screen_name") final String screen_name, 
                @Description("The screen name of the user who owns the list being requested by a ")
     @QueryParam("owner_screen_name") final String owner_screen_name, @Description("The user ID of the user who owns the list being requested by a &lt;tt&gt;slug&lt;/tt&gt;.")
     @QueryParam("owner_id") final String owner_id) {
        //TODO: implement
        return null;
    }

    @POST
    @Produces("application/json")
    @Path("/members/destroy_all")
    @Category({"lists"})
    @ApiVersion({"1.1"})
    @Tag({"List Members","list management"})
    @SeeAlso({@See(href = "/docs/api/1/post/lists/members/create_all", value="POST lists/members/create_all"),@See(href = "/docs/api/1/post/lists/members/destroy", value="POST lists/members/destroy")})
    @Description("Removes multiple members from a list, by specifying a comma-separated list of member ids or screen names. The authenticated user must own the list to be able to remove members from it. Note that lists can")
    public Response postMembersdestroy_all(@Description("The numerical &lt;tt&gt;id&lt;/tt&gt; of the list.")
     @PathParam("list_id") final String list_id, @Description("You can identify a list by its slug instead of its numerical id. If you decide to do so, note that you&apos;ll also have to specify the list owner using the ")
     @PathParam("slug") final String slug, @Description("A comma separated list of user IDs, up to 100 are allowed in a single request.")
     @QueryParam("user_id") final String user_id, @Description("A comma separated list of screen names, up to 100 are allowed in a single request.")
     @QueryParam("screen_name") final String screen_name, 
                @Description("The screen name of the user who owns the list being requested by a ")
     @QueryParam("owner_screen_name") final String owner_screen_name, @Description("The user ID of the user who owns the list being requested by a &lt;tt&gt;slug&lt;/tt&gt;.")
     @QueryParam("owner_id") final String owner_id) {
        //TODO: implement
        return null;
    }

    @GET
    @Produces("application/json")
    @Path("/memberships")
    @Category({"lists"})
    @ApiVersion({"1.1"})
    @SeeAlso({@See(href = "/docs/api/1.1/get/lists/statuses", value="GET lists/statuses"),@See(href = "/docs/api/1.1/get/lists/list", value="GET lists/list"),@See(href = "/docs/api/1.1/get/lists/memberships", value="GET lists/memberships"),@See(href = "/docs/api/1.1/get/lists/ownerships", value="GET lists/ownerships"),@See(href = "/docs/api/1.1/get/lists/subscriptions", value="GET lists/subscriptions")})
    @ApplicationLimit(rate = @Rate(window = 15, unit = GovernanceUnit.MINUTES, limit = 15))@UserLimit(rate = @Rate(window = 15, unit = GovernanceUnit.MINUTES, limit = 15))@Description("Returns the lists the specified user has been added to. If user_id or screen_name are not provided the memberships for the authenticating user are returned.")
    public Response getMemberships(@Description("The ID of the user for whom to return results for. Helpful for disambiguating when a valid user ID is also a valid screen name.")
     @QueryParam("user_id") final String user_id, @Description("The screen name of the user for whom to return results for. Helpful for disambiguating when a valid screen name is also a user ID.")
     @QueryParam("screen_name") final String screen_name, @Description("Breaks the results into pages. Provide a value of &lt;tt&gt;-1&lt;/tt&gt; to begin paging. Provide values as returned in the response body&apos;s &lt;tt&gt;next_cursor&lt;/tt&gt; and &lt;tt&gt;previous_cursor&lt;/tt&gt; attributes to page back and forth in the list. It is recommended to always use cursors when the method supports them. See &lt;a href=&quot;https://dev.twitter.com/docs/misc/cursoring&quot;&gt;Using cursors to navigate collections&lt;/a&gt; for more information.")
     @QueryParam("cursor") final String cursor, @Description("When set to &lt;tt&gt;true&lt;/tt&gt;, &lt;tt&gt;t&lt;/tt&gt; or &lt;tt&gt;1&lt;/tt&gt;, will return just lists the authenticating user owns, and the user represented by &lt;tt&gt;user_id&lt;/tt&gt; or &lt;tt&gt;screen_name&lt;/tt&gt; is a member of.")
     @QueryParam("filter_to_owned_lists") final String filter_to_owned_lists) {
        //TODO: implement
        return null;
    }

    @GET
    @Produces("application/json")
    @Path("/ownerships")
    @Category({"lists"})
    @ApiVersion({"1.1"})
    @Tag({"finding lists","list management"})
    @SeeAlso({@See(href = "/docs/api/1.1/get/lists/memberships", value="GET lists/memberships"),@See(href = "/docs/api/1.1/get/lists/list", value="GET lists/list"),@See(href = "/docs/api/1.1/get/lists/subscriptions", value="GET lists/subscriptions"),@See(href = "/docs/api/1.1/get/lists/statuses", value="GET lists/statuses")})
    @ApplicationLimit(rate = @Rate(window = 15, unit = GovernanceUnit.MINUTES, limit = 15))@UserLimit(rate = @Rate(window = 15, unit = GovernanceUnit.MINUTES, limit = 15))@Description("Returns the lists owned by the specified Twitter user. Private lists will only be shown if the authenticated user is also the owner of the lists.")
    public Response getOwnerships(@Description("The ID of the user for whom to return results for.")
     @QueryParam("user_id") final String user_id, @Description("The screen name of the user for whom to return results for.")
     @QueryParam("screen_name") final String screen_name, @Description("The amount of results to return per page. Defaults to 20. No more than 1000 results will ever be returned in a single page.")
     @QueryParam("count") final Integer count, @Description("Breaks the results into pages. Provide a value of &lt;tt&gt;-1&lt;/tt&gt; to begin paging. Provide values as returned in the response body&apos;s &lt;tt&gt;next_cursor&lt;/tt&gt; and &lt;tt&gt;previous_cursor&lt;/tt&gt; attributes to page back and forth in the list. It is recommended to always use cursors when the method supports them. See &lt;a href=&quot;https://dev.twitter.com/docs/misc/cursoring&quot;&gt;Using cursors to navigate collections&lt;/a&gt; for more information.")
     @QueryParam("cursor") final String cursor) {
        //TODO: implement
        return null;
    }

    @GET
    @Produces("application/json")
    @Path("/show")
    @Category({"lists"})
    @ApiVersion({"1.1"})
    @SeeAlso({@See(href = "/docs/api/1/get/lists/all", value="GET lists/all"),@See(href = "/docs/api/1/get/lists", value="GET lists")})
    @ApplicationLimit(rate = @Rate(window = 15, unit = GovernanceUnit.MINUTES, limit = 15))@UserLimit(rate = @Rate(window = 15, unit = GovernanceUnit.MINUTES, limit = 15))@Description("Returns the specified list. Private lists will only be shown if the authenticated user owns the specified list.")
    public Response getShow(@Description("The numerical &lt;tt&gt;id&lt;/tt&gt; of the list.")
     @PathParam("list_id") final String list_id, @Description("You can identify a list by its slug instead of its numerical id. If you decide to do so, note that you&apos;ll also have to specify the list owner using the ")
     @PathParam("slug") final String slug, @Description("The screen name of the user who owns the list being requested by a ")
     @QueryParam("owner_screen_name") final String owner_screen_name, @Description("The user ID of the user who owns the list being requested by a &lt;tt&gt;slug&lt;/tt&gt;.")
     @QueryParam("owner_id") final String owner_id) {
        //TODO: implement
        return null;
    }

    @GET
    @Produces("application/json")
    @Path("/statuses")
    @Category({"lists"})
    @ApiVersion({"1.1"})
    @SeeAlso({@See(href = "/docs/api/1.1/get/lists/list", value="GET lists/list"),@See(href = "/docs/api/1.1/get/statuses/home_timeline", value="GET statuses/home_timeline"),@See(href = "/docs/api/1.1/get/lists/subscriptions", value="GET lists/subscriptions"),@See(href = "/docs/api/1.1/get/lists/memberships", value="GET lists/memberships"),@See(href = "/docs/api/1.1/get/lists/ownerships", value="GET lists/ownerships"),@See(href = "/docs/working-with-timelines", value="Working with Timelines")})
    @ApplicationLimit(rate = @Rate(window = 15, unit = GovernanceUnit.MINUTES, limit = 180))@UserLimit(rate = @Rate(window = 15, unit = GovernanceUnit.MINUTES, limit = 180))@Description("Returns a timeline of tweets authored by members of the specified list. Retweets are included by default. Use the include_rts=false parameter to omit retweets. Embedded Timelines is a great way to embed list timelines on your website.")
    public TweetsType getStatuses(@Description("The numerical &lt;tt&gt;id&lt;/tt&gt; of the list.")
     @PathParam("list_id") final String list_id, @Description("You can identify a list by its slug instead of its numerical id. If you decide to do so, note that you&apos;ll also have to specify the list owner using the ")
     @PathParam("slug") final String slug, @Description("The screen name of the user who owns the list being requested by a ")
     @QueryParam("owner_screen_name") final String owner_screen_name, @Description("The user ID of the user who owns the list being requested by a &lt;tt&gt;slug&lt;/tt&gt;.")
     @QueryParam("owner_id") final String owner_id, 
                @Description("Returns results with an ID greater than (that is, more recent than) the specified ID. There are limits to the number of Tweets which can be accessed through the API. If the limit of Tweets has occured since the since_id, the since_id will be forced to the oldest ID available.")
     @QueryParam("since_id") final String since_id, @Description("Returns results with an ID less than (that is, older than) or equal to the specified ID.")
     @QueryParam("max_id") final String max_id, @Description("Specifies the number of results to retrieve per &quot;page.&quot;")
     @QueryParam("count") final Integer count, @Description("Entities are ON by default in API 1.1, each tweet includes a node called &quot;entities&quot;. This node offers a variety of metadata about the tweet in a discreet structure, including: use")
     @QueryParam("include_entities") final String include_entities, 
                @Description("When set to either &lt;tt&gt;true&lt;/tt&gt;, &lt;tt&gt;t&lt;/tt&gt; or &lt;tt&gt;1&lt;/tt&gt;, the list timeline will contain native retweets (if they exist) in addition to the standard stream of tweets. The output format of retweeted tweets is identical to the representation you see in home_timeline.")
     @QueryParam("include_rts") final String include_rts) {
        //TODO: implement
        return null;
    }

    @GET
    @Produces("application/json")
    @Path("/subscribers")
    @Category({"lists"})
    @ApiVersion({"1.1"})
    @SeeAlso({@See(href = "/docs/api/1/get/lists/memberships", value="GET lists/memberships"),@See(href = "/docs/api/1/get/lists/statuses", value="GET lists/statuses")})
    @Description("Returns the subscribers of the specified list. Private list subscribers will only be shown if the authenticated user owns the specified list.")
    public UsersType getSubscribers(@Description("The numerical &lt;tt&gt;id&lt;/tt&gt; of the list.")
     @PathParam("list_id") final String list_id, @Description("You can identify a list by its slug instead of its numerical id. If you decide to do so, note that you&apos;ll also have to specify the list owner using the ")
     @PathParam("slug") final String slug, @Description("The screen name of the user who owns the list being requested by a ")
     @QueryParam("owner_screen_name") final String owner_screen_name, @Description("The user ID of the user who owns the list being requested by a &lt;tt&gt;slug&lt;/tt&gt;.")
     @QueryParam("owner_id") final String owner_id, 
                @Description("Breaks the results into pages. A single page contains 20 lists. Provide a value of ")
     @QueryParam("cursor") final String cursor, @Description("When set to either &lt;tt&gt;true&lt;/tt&gt;, &lt;tt&gt;t&lt;/tt&gt; or &lt;tt&gt;1&lt;/tt&gt;, each tweet will include a node called &quot;entities&quot;. This node offers a variety of metadata about the tweet in a discreet structure, including: user_mentions, urls, and hashtags. While entities are opt-in on timelines at present, they will be made a default component of output in the future. See &lt;strong&gt;&lt;u&gt;&lt;a href=&quot;/pages/tweet_entities&quot;&gt;Tweet Entities&lt;/a&gt;&lt;/u&gt;&lt;/strong&gt; for more details.")
     @QueryParam("include_entities") final String include_entities, @Description("When set to either &lt;tt&gt;true&lt;/tt&gt;, &lt;tt&gt;t&lt;/tt&gt; or &lt;tt&gt;1&lt;/tt&gt; statuses will not be included in the returned user objects.")
     @QueryParam("skip_status") final String skip_status) {
        //TODO: implement
        return null;
    }

    @GET
    @Produces("application/json")
    @Path("/subscribers/show")
    @Category({"lists"})
    @ApiVersion({"1.1"})
    @SeeAlso({@See(href = "/docs/api/1/get/lists/subscribers", value="GET lists/subscribers"),@See(href = "/docs/api/1/get/lists/memberships", value="GET lists/memberships")})
    @ApplicationLimit(rate = @Rate(window = 15, unit = GovernanceUnit.MINUTES, limit = 15))@UserLimit(rate = @Rate(window = 15, unit = GovernanceUnit.MINUTES, limit = 15))@Description("Check if the specified user is a subscriber of the specified list. Returns the user if they are subscriber.")
    public UsersType getSubscribersshow(@Description("The screen name of the user who owns the list being requested by a ")
     @QueryParam("owner_screen_name") final String owner_screen_name, @Description("The user ID of the user who owns the list being requested by a &lt;tt&gt;slug&lt;/tt&gt;.")
     @QueryParam("owner_id") final String owner_id, @Description("The numerical &lt;tt&gt;id&lt;/tt&gt; of the list.")
     @PathParam("list_id") final String list_id, @Description("You can identify a list by its slug instead of its numerical id. If you decide to do so, note that you&apos;ll also have to specify the list owner using the ")
     @PathParam("slug") final String slug, 
                @Description("The ID of the user for whom to return results for. Helpful for disambiguating when a valid user ID is also a valid screen name.")
     @PathParam("user_id") final String user_id, @Description("The screen name of the user for whom to return results for. Helpful for disambiguating when a valid screen name is also a user ID.")
     @PathParam("screen_name") final String screen_name, @Description("When set to either &lt;tt&gt;true&lt;/tt&gt;, &lt;tt&gt;t&lt;/tt&gt; or &lt;tt&gt;1&lt;/tt&gt;, each tweet will include a node called &quot;entities&quot;. This node offers a variety of metadata about the tweet in a discreet structure, including: user_mentions, urls, and hashtags. While entities are opt-in on timelines at present, they will be made a default component of output in the future. See &lt;strong&gt;&lt;u&gt;&lt;a href=&quot;/pages/tweet_entities&quot;&gt;Tweet Entities&lt;/a&gt;&lt;/u&gt;&lt;/strong&gt; for more details.")
     @QueryParam("include_entities") final String include_entities, @Description("When set to either &lt;tt&gt;true&lt;/tt&gt;, &lt;tt&gt;t&lt;/tt&gt; or &lt;tt&gt;1&lt;/tt&gt; statuses will not be included in the returned user objects.")
     @QueryParam("skip_status") final String skip_status) {
        //TODO: implement
        return null;
    }

    @POST
    @Produces("application/json")
    @Path("/subscribers/create")
    @Category({"lists"})
    @ApiVersion({"1.1"})
    @See(href = "/docs/api/1/get/lists/subscribers", value="GET lists/subscribers")
    @Description("Subscribes the authenticated user to the specified list.")
    public UsersType postSubscriberscreate(@Description("The screen name of the user who owns the list being requested by a ")
     @QueryParam("owner_screen_name") final String owner_screen_name, @Description("The user ID of the user who owns the list being requested by a &lt;tt&gt;slug&lt;/tt&gt;.")
     @QueryParam("owner_id") final String owner_id, @Description("The numerical &lt;tt&gt;id&lt;/tt&gt; of the list.")
     @PathParam("list_id") final String list_id, @Description("You can identify a list by its slug instead of its numerical id. If you decide to do so, note that you&apos;ll also have to specify the list owner using the ")
     @PathParam("slug") final String slug) {
        //TODO: implement
        return null;
    }

    @POST
    @Produces("application/json")
    @Path("/subscribers/destroy")
    @Category({"lists"})
    @ApiVersion({"1.1"})
    @See(href = "/docs/api/1/post/lists/subscribers/create", value="POST lists/subscribers/create")
    @Description("Unsubscribes the authenticated user from the specified list.")
    public Response postSubscribersdestroy(@Description("The numerical &lt;tt&gt;id&lt;/tt&gt; of the list.")
     @PathParam("list_id") final String list_id, @Description("You can identify a list by its slug instead of its numerical id. If you decide to do so, note that you&apos;ll also have to specify the list owner using the ")
     @PathParam("slug") final String slug, @Description("The screen name of the user who owns the list being requested by a ")
     @QueryParam("owner_screen_name") final String owner_screen_name, @Description("The user ID of the user who owns the list being requested by a &lt;tt&gt;slug&lt;/tt&gt;.")
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
    @SeeAlso({@See(href = "/docs/api/1.1/get/lists/memberships", value="GET lists/memberships"),@See(href = "/docs/api/1.1/get/lists/list", value="GET lists/list"),@See(href = "/docs/api/1.1/get/lists/ownerships", value="GET lists/ownerships"),@See(href = "/docs/api/1.1/get/lists/statuses", value="GET lists/statuses")})
    @ApplicationLimit(rate = @Rate(window = 15, unit = GovernanceUnit.MINUTES, limit = 15))@UserLimit(rate = @Rate(window = 15, unit = GovernanceUnit.MINUTES, limit = 15))@Description("Obtain a collection of the lists the specified user is subscribed to, 20 lists per page by default. Does not include the user")
    public Response getSubscriptions(@Description("The ID of the user for whom to return results for. Helpful for disambiguating when a valid user ID is also a valid screen name.")
     @QueryParam("user_id") final String user_id, @Description("The screen name of the user for whom to return results for. Helpful for disambiguating when a valid screen name is also a user ID.")
     @QueryParam("screen_name") final String screen_name, @Description("The amount of results to return per page. Defaults to 20. No more than 1000 results will ever be returned in a single page.")
     @QueryParam("count") final Integer count, @Description("Breaks the results into pages. Provide a value of &lt;tt&gt;-1&lt;/tt&gt; to begin paging. Provide values as returned in the response body&apos;s &lt;tt&gt;next_cursor&lt;/tt&gt; and &lt;tt&gt;previous_cursor&lt;/tt&gt; attributes to page back and forth in the list. It is recommended to always use cursors when the method supports them. See &lt;a href=&quot;https://dev.twitter.com/docs/misc/cursoring&quot;&gt;Using cursors to navigate collections&lt;/a&gt; for more information.")
     @QueryParam("cursor") final String cursor) {
        //TODO: implement
        return null;
    }

    @POST
    @Produces("application/json")
    @Path("/create")
    @Category({"lists"})
    @ApiVersion({"1.1"})
    @See(href = "/docs/api/1/post/lists/update", value="POST lists/update")
    @Description("Creates a new list for the authenticated user. Note that you can")
    public Response postCreate(@Description("The name for the list.")
     @PathParam("name") final String name, @Description("Whether your list is public or private. Values can be &lt;tt&gt;public&lt;/tt&gt; or &lt;tt&gt;private&lt;/tt&gt;. If no mode is specified the list will be public.")
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
    @See(href = "/docs/api/1/get/lists/all", value="GET lists/all")
    @Description("Deletes the specified list. The authenticated user must own the list to be able to destroy it.")
    public Response postDestroy(@Description("The screen name of the user who owns the list being requested by a ")
     @QueryParam("owner_screen_name") final String owner_screen_name, @Description("The user ID of the user who owns the list being requested by a &lt;tt&gt;slug&lt;/tt&gt;.")
     @QueryParam("owner_id") final String owner_id, @Description("The numerical &lt;tt&gt;id&lt;/tt&gt; of the list.")
     @PathParam("list_id") final String list_id, @Description("You can identify a list by its slug instead of its numerical id. If you decide to do so, note that you&apos;ll also have to specify the list owner using the ")
     @PathParam("slug") final String slug) {
        //TODO: implement
        return null;
    }

    @POST
    @Produces("application/json")
    @Path("/update")
    @Category({"lists"})
    @ApiVersion({"1.1"})
    @See(href = "/docs/api/1/post/lists/destroy", value="POST lists/destroy")
    @Description("Updates the specified list. The authenticated user must own the list to be able to update it.")
    public Response postUpdate(@Description("The numerical &lt;tt&gt;id&lt;/tt&gt; of the list.")
     @PathParam("list_id") final String list_id, @Description("You can identify a list by its slug instead of its numerical id. If you decide to do so, note that you&apos;ll also have to specify the list owner using the ")
     @PathParam("slug") final String slug, @Description("The name for the list.")
     @QueryParam("name") final String name, @Description("Whether your list is public or private. Values can be &lt;tt&gt;public&lt;/tt&gt; or &lt;tt&gt;private&lt;/tt&gt;. If no mode is specified the list will be public.")
     @QueryParam("mode") final String mode, 
                @Description("The description to give the list.")
     @QueryParam("description") final String description, @Description("The screen name of the user who owns the list being requested by a ")
     @QueryParam("owner_screen_name") final String owner_screen_name, @Description("The user ID of the user who owns the list being requested by a &lt;tt&gt;slug&lt;/tt&gt;.")
     @QueryParam("owner_id") final String owner_id) {
        //TODO: implement
        return null;
    }

}