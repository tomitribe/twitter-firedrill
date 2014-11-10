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
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

@Path("/friends")
public class FriendsResource {

    @GET
    @Produces("application/json")
    @Path("/ids")
    @Category({"friends"})
    @ApiVersion({"1.1"})
    @Tag({"Bulk Operations", "finding users"})
    @SeeAlso({@See(href="/staging/apirest/endpoint/twitter/GET/followers/ids", value = "GET followers/ids"), @See(href="/staging/apirest/endpoint/twitter/GET/followers/list", value = "GET followers/list"), @See(href="/staging/apirest/endpoint/twitter/GET/friends/list", value = "GET friends/list")})
    @ApplicationLimit(rate = @Rate(window = 15, unit = GovernanceUnit.MINUTES, limit = 15))
    @UserLimit(rate = @Rate(window = 15, unit = GovernanceUnit.MINUTES, limit = 15))
    @Description("Returns a cursored collection of user IDs for every user the specified user is following (otherwise known as their &quot;friends&quot;).")
    public UsersType getIds(@Description("The ID of the user for whom to return results for.")
                            @QueryParam("user_id") final Integer user_id, @Description("The screen name of the user for whom to return results for.")
                            @QueryParam("screen_name") final String screen_name, @Description("Causes the list of connections to be broken into pages of no more than 5000 IDs at a time. The number of IDs returned is not guaranteed to be 5000 as suspended users are filtered out after connections are queried. If no cursor is provided, a value of <tt>-1</tt> will be assumed, which is the first \"page.\"<br /><br /> The response from the API will include a <tt>previous_cursor</tt> and <tt>next_cursor</tt> to allow paging back and forth. See <a href=\"https://dev.twitter.com/docs/misc/cursoring\">Using cursors to navigate collections</a> for more information.")
                            @QueryParam("cursor") final String cursor, @Description("Many programming environments will not consume our Tweet ids due to their size. Provide this option to have ids returned as strings instead. More about <a href=\"https://dev.twitter.com/docs/twitter-ids-json-and-snowflake\">Twitter IDs, JSON and Snowflake</a>.")
                            @QueryParam("stringify_ids") final Boolean stringify_ids,
                            @Description("Specifies the number of IDs attempt retrieval of, up to a maximum of 5,000 per distinct request. The value of <tt>count</tt> is best thought of as a limit to the number of results to return. When using the count parameter with this method, it is wise to use a consistent count value across all requests to the same user's collection. Usage of this parameter is encouraged in environments where all 5,000 IDs constitutes too large of a response.")
                            @QueryParam("count") final Integer count) {
        //TODO: implement
        return null;
    }

    @GET
    @Produces("application/json")
    @Path("/list")
    @Category({"friends"})
    @ApiVersion({"1.1"})
    @Tag({"Bulk Operations", "finding users"})
    @SeeAlso({@See(href="/staging/apirest/endpoint/twitter/GET/friends/ids", value = "GET friends/ids"), @See(href="/staging/apirest/endpoint/twitter/GET/followers/ids", value = "GET followers/ids")})
    @ApplicationLimit(rate = @Rate(window = 15, unit = GovernanceUnit.MINUTES, limit = 30))
    @UserLimit(rate = @Rate(window = 15, unit = GovernanceUnit.MINUTES, limit = 15))
    @Description("Returns a cursored collection of user objects for every user the specified user is following (otherwise known as their &quot;friends&quot;).")
    public UsersType getList(@Description("The ID of the user for whom to return results for.")
                             @QueryParam("user_id") final Integer user_id, @Description("The screen name of the user for whom to return results for.")
                             @QueryParam("screen_name") final String screen_name, @Description("Causes the results to be broken into pages. If no cursor is provided, a value of <tt>-1</tt> will be assumed, which is the first \"page.\"<br /><br /> The response from the API will include a <tt>previous_cursor</tt> and <tt>next_cursor</tt> to allow paging back and forth. See <a href=\"https://dev.twitter.com/docs/misc/cursoring\">Using cursors to navigate collections</a> for more information.")
                             @QueryParam("cursor") final String cursor, @Description("The number of users to return per page, up to a maximum of 200. Defaults to 20.")
                             @QueryParam("count") final Integer count,
                             @Description("When set to either <tt>true</tt>, <tt>t</tt> or <tt>1</tt> statuses will not be included in the returned user objects.")
                             @QueryParam("skip_status") final Boolean skip_status, @Description("The user object <tt>entities</tt> node will be disincluded when set to <tt>false</tt>.")
                             @QueryParam("include_user_entities") final Boolean include_user_entities) {
        //TODO: implement
        return null;
    }

}
