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

@Path("/favorites")
public class FavoritesResource {

    @GET
    @Produces("application/json")
    @Path("/list")
    @Category({"favorites"})
    @ApiVersion({"1.1"})
    @Tag({"Favorites"})
    @SeeAlso({@See(href = "/docs/working-with-timelines", value="Working with Timelines"),@See(href = "/docs/api/1.1/post/favorites/create", value="POST favorites/create"),@See(href = "/docs/api/1.1/post/favorites/destroy", value="POST favorites/destroy")})
    @ApplicationLimit(rate = @Rate(window = 15, unit = GovernanceUnit.MINUTES, limit = 15))@UserLimit(rate = @Rate(window = 15, unit = GovernanceUnit.MINUTES, limit = 15))@Description("Returns the 20 most recent Tweets favorited by the authenticating or specified user.")
    public TweetsType getList(@Description("The ID of the user for whom to return results for. ")
     @QueryParam("user_id") final Integer user_id, @Description("The screen name of the user for whom to return results for.")
     @QueryParam("screen_name") final String screen_name, @Description("Specifies the number of records to retrieve. Must be less than or equal to 200. Defaults to 20.")
     @QueryParam("count") final Integer count, @Description("Returns results with an ID greater than (that is, more recent than) the specified ID. There are limits to the number of Tweets which can be accessed through the API. If the limit of Tweets has occured since the since_id, the since_id will be forced to the oldest ID available.")
     @QueryParam("since_id") final Integer since_id, 
                @Description("Returns results with an ID less than (that is, older than) or equal to the specified ID.")
     @QueryParam("max_id") final Integer max_id, @Description("The &lt;tt&gt;entities&lt;/tt&gt; node will be omitted when set to &lt;tt&gt;false&lt;/tt&gt;.")
     @QueryParam("include_entities") final Boolean include_entities) {
        //TODO: implement
        return null;
    }

    @POST
    @Produces("application/json")
    @Path("/create")
    @Category({"statuses"})
    @ApiVersion({"1.1"})
    @SeeAlso({@See(href = "/docs/api/1.1/post/favorites/destroy", value="POST favorites/destroy"),@See(href = "/docs/api/1.1/get/favorites/list", value="GET favorites/list")})
    @Description("Favorites the status specified in the ID parameter as the authenticating user. Returns the favorite status when successful. This process invoked by this method is asynchronous. The immediately returned status may not indicate the resultant favorited status of the tweet.")
    public TweetsType postCreate(@Description("The numerical ID of the desired status.")
     @PathParam("id") final int id, @Description("The &lt;tt&gt;entities&lt;/tt&gt; node will be omitted when set to &lt;tt&gt;false&lt;/tt&gt;.")
     @QueryParam("include_entities") final Boolean include_entities) {
        //TODO: implement
        return null;
    }

    @POST
    @Produces("application/json")
    @Path("/destroy")
    @Category({"statuses"})
    @ApiVersion({"1.1"})
    @SeeAlso({@See(href = "/docs/api/1.1/get/favorites/list", value="GET favorites/list"),@See(href = "/docs/api/1.1/post/favorites/create", value="POST favorites/create")})
    @Description("Un-favorites the status specified in the ID parameter as the authenticating user. Returns the un-favorited status in the requested format when successful. This process invoked by this method is asynchronous. The immediately returned status may not indicate the resultant favorited status of the tweet.")
    public TweetsType postDestroy(@Description("The numerical ID of the desired status.")
     @PathParam("id") final int id, @Description("The &lt;tt&gt;entities&lt;/tt&gt; node will be omitted when set to &lt;tt&gt;false&lt;/tt&gt;.")
     @QueryParam("include_entities") final Boolean include_entities) {
        //TODO: implement
        return null;
    }

}