/**
 * Created by Tomitribe CXF WadlToJava code generator
**/
package com.twitter;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
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

@Path("/blocks")
public class BlocksResource {

    @GET
    @Produces("application/json")
    @Path("/ids")
    @Category({"blocks"})
    @ApiVersion({"1.1"})
    @See(href = "/docs/api/1.1/get/blocks/list", value="GET blocks/list")
    @ApplicationLimit()@UserLimit(rate = @Rate(window = 15, unit = GovernanceUnit.MINUTES, limit = 15))@Description("Returns an array of numeric user ids the authenticating user is blocking. Important On October 15, 2012 this method will become cursored by default, altering the default response format. See Using cursors to navigate collections for more details on how cursoring works.")
    public Response getIds(@Description("Many programming environments will not consume our ids due to their size. Provide this option to have ids returned as strings instead. Read more about ")
     @QueryParam("stringify_ids") final Boolean stringify_ids, @Description("Causes the list of IDs to be broken into pages of no more than 5000 IDs at a time. The number of IDs returned is not guaranteed to be 5000 as suspended users are filtered out after connections are queried. If no cursor is provided, a value of ")
     @QueryParam("cursor") final String cursor) {
        //TODO: implement
        return null;
    }

    @GET
    @Produces("application/json")
    @Path("/list")
    @Category({"blocks"})
    @ApiVersion({"1.1"})
    @SeeAlso({@See(href = "/docs/api/1.1/get/blocks/ids", value="GET blocks/ids"),@See(href = "/docs/misc/cursoring", value="Using cursors to navigate collections")})
    @ApplicationLimit()@UserLimit(rate = @Rate(window = 15, unit = GovernanceUnit.MINUTES, limit = 15))@Description("Returns a collection of user objects that the authenticating user is blocking. Important On October 15, 2012 this method will become cursored by default, altering the default response format. See Using cursors to navigate collections for more details on how cursoring works.")
    public Response getList(@Description("The &lt;tt&gt;entities&lt;/tt&gt; node will not be included when set to &lt;tt&gt;false&lt;/tt&gt;.")
     @QueryParam("include_entities") final Boolean include_entities, @Description("When set to either &lt;tt&gt;true&lt;/tt&gt;, &lt;tt&gt;t&lt;/tt&gt; or &lt;tt&gt;1&lt;/tt&gt; statuses will not be included in the returned user objects.")
     @QueryParam("skip_status") final String skip_status, @Description("Causes the list of blocked users to be broken into pages of no more than 5000 IDs at a time. The number of IDs returned is not guaranteed to be 5000 as suspended users are filtered out after connections are queried. If no cursor is provided, a value of ")
     @QueryParam("cursor") final String cursor) {
        //TODO: implement
        return null;
    }

    @POST
    @Produces("application/json")
    @Path("/create")
    @Category({"blocks"})
    @ApiVersion({"1.1"})
    @Description("Blocks the specified user from following the authenticating user. In addition the blocked user will not show in the authenticating users mentions or timeline (unless retweeted by another user). If a follow or friend relationship exists it is destroyed.")
    public Response postCreate(@Description("The screen name of the potentially blocked user. Helpful for disambiguating when a valid screen name is also a user ID.")
     @QueryParam("screen_name") final String screen_name, @Description("The ID of the potentially blocked user. Helpful for disambiguating when a valid user ID is also a valid screen name.")
     @QueryParam("user_id") final Integer user_id, @Description("The &lt;tt&gt;entities&lt;/tt&gt; node will not be included when set to &lt;tt&gt;false&lt;/tt&gt;.")
     @QueryParam("include_entities") final Boolean include_entities, @Description("When set to either &lt;tt&gt;true&lt;/tt&gt;, &lt;tt&gt;t&lt;/tt&gt; or &lt;tt&gt;1&lt;/tt&gt; statuses will not be included in the returned user objects.")
     @QueryParam("skip_status") final String skip_status) {
        //TODO: implement
        return null;
    }

    @POST
    @Produces("application/json")
    @Path("/destroy")
    @Category({"blocks"})
    @ApiVersion({"1.1"})
    @Description("Un-blocks the user specified in the ID parameter for the authenticating user. Returns the un-blocked user in the requested format when successful. If relationships existed before the block was instated, they will not be restored.")
    public Response postDestroy(@Description("The screen name of the potentially blocked user. Helpful for disambiguating when a valid screen name is also a user ID.")
     @QueryParam("screen_name") final String screen_name, @Description("The ID of the potentially blocked user. Helpful for disambiguating when a valid user ID is also a valid screen name.")
     @QueryParam("user_id") final Integer user_id, @Description("The &lt;tt&gt;entities&lt;/tt&gt; node will not be included when set to &lt;tt&gt;false&lt;/tt&gt;.")
     @QueryParam("include_entities") final Boolean include_entities, @Description("When set to either &lt;tt&gt;true&lt;/tt&gt;, &lt;tt&gt;t&lt;/tt&gt; or &lt;tt&gt;1&lt;/tt&gt; statuses will not be included in the returned user objects.")
     @QueryParam("skip_status") final String skip_status) {
        //TODO: implement
        return null;
    }

}