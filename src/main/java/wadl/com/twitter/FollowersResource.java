/**
 * Created by Tomitribe CXF WadlToJava code generator
**/
package com.twitter;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
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
import com.twitter.dev.api.UsersType;

@Path("/followers")
public class FollowersResource {

    @GET
    @Produces("application/json")
    @Path("/ids")
    @Category({"followers"})
    @ApiVersion({"1.1"})
    @Tag({"Bulk Operations","finding users"})
    @SeeAlso({@See(href = "/docs/api/1.1/get/friends/ids", value="GET friends/ids"),@See(href = "/docs/api/1.1/get/followers/list", value="GET followers/list"),@See(href = "/docs/api/1.1/get/friends/list", value="GET friends/list"),@See(href = "/docs/misc/cursoring", value="Using cursors to navigate collections")})
    @ApplicationLimit(rate = @Rate(window = 15, unit = GovernanceUnit.MINUTES, limit = 15))@UserLimit(rate = @Rate(window = 15, unit = GovernanceUnit.MINUTES, limit = 15))@Description("Returns a cursored collection of user IDs for every user following the specified user.")
    public UsersType getIds(@Description("The ID of the user for whom to return results for.")
     @QueryParam("user_id") final Integer user_id, @Description("The screen name of the user for whom to return results for.")
     @QueryParam("screen_name") final String screen_name, @Description("Causes the list of connections to be broken into pages of no more than 5000 IDs at a time. The number of IDs returned is not guaranteed to be 5000 as suspended users are filtered out after connections are queried. If no cursor is provided, a value of ")
     @QueryParam("cursor") final String cursor, @Description("Many programming environments will not consume our Tweet ids due to their size. Provide this option to have ids returned as strings instead. More about ")
     @QueryParam("stringify_ids") final Boolean stringify_ids, 
                @Description("Specifies the number of IDs attempt retrieval of, up to a maximum of 5,000 per distinct request. The value of ")
     @QueryParam("count") final Integer count) {
        //TODO: implement
        return null;
    }

    @GET
    @Produces("application/json")
    @Path("/list")
    @Category({"followers"})
    @ApiVersion({"1.1"})
    @Tag({"Bulk Operations","finding users"})
    @SeeAlso({@See(href = "/docs/api/1.1/get/friends/ids", value="GET friends/ids"),@See(href = "/docs/api/1.1/get/followers/ids", value="GET followers/ids"),@See(href = "/docs/api/1.1/get/friends/list", value="GET friends/list")})
    @ApplicationLimit(rate = @Rate(window = 15, unit = GovernanceUnit.MINUTES, limit = 30))@UserLimit(rate = @Rate(window = 15, unit = GovernanceUnit.MINUTES, limit = 15))@Description("Returns a cursored collection of user objects for users following the specified user.")
    public UsersType getList(@Description("The ID of the user for whom to return results for.")
     @QueryParam("user_id") final Integer user_id, @Description("The screen name of the user for whom to return results for.")
     @QueryParam("screen_name") final String screen_name, @Description("Causes the results to be broken into pages. If no cursor is provided, a value of ")
     @QueryParam("cursor") final String cursor, @Description("The number of users to return per page, up to a maximum of 200. Defaults to 20.")
     @QueryParam("count") final Integer count, 
                @Description("When set to either &lt;tt&gt;true&lt;/tt&gt;, &lt;tt&gt;t&lt;/tt&gt; or &lt;tt&gt;1&lt;/tt&gt; statuses will not be included in the returned user objects.")
     @QueryParam("skip_status") final Boolean skip_status, @Description("The user object &lt;tt&gt;entities&lt;/tt&gt; node will be disincluded when set to &lt;tt&gt;false&lt;/tt&gt;.")
     @QueryParam("include_user_entities") final Boolean include_user_entities) {
        //TODO: implement
        return null;
    }

}