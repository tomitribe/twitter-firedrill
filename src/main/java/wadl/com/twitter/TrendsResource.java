/**
 * Created by Tomitribe CXF WadlToJava code generator
**/
package com.twitter;

import javax.ws.rs.GET;
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

@Path("/trends")
public class TrendsResource {

    @GET
    @Produces("application/json")
    @Path("/available")
    @Category({"trends"})
    @ApiVersion({"1.1"})
    @SeeAlso({@See(href = "/docs/api/1.1/get/trends/place", value="GET trends/place"),@See(href = "/docs/api/1.1/get/trends/closest", value="GET trends/closest")})
    @ApplicationLimit(rate = @Rate(window = 15, unit = GovernanceUnit.MINUTES, limit = 15))@UserLimit(rate = @Rate(window = 15, unit = GovernanceUnit.MINUTES, limit = 15))@Description("Returns the locations that Twitter has trending topic information for. The response is an array of ")
    public Response getAvailable() {
        //TODO: implement
        return null;
    }

    @GET
    @Produces("application/json")
    @Path("/closest")
    @Category({"trends"})
    @ApiVersion({"1.1"})
    @SeeAlso({@See(href = "/docs/api/1.1/get/trends/available", value="GET trends/available"),@See(href = "/docs/api/1.1/get/trends/closest", value="GET trends/closest")})
    @ApplicationLimit(rate = @Rate(window = 15, unit = GovernanceUnit.MINUTES, limit = 15))@UserLimit(rate = @Rate(window = 15, unit = GovernanceUnit.MINUTES, limit = 15))@Description("Returns the locations that Twitter has trending topic information for, closest to a specified location. The response is an array of ")
    public Response getClosest(@Description("If provided with a &lt;tt&gt;long&lt;/tt&gt; parameter the available trend locations will be sorted by distance, nearest to furthest, to the co-ordinate pair. The valid ranges for longitude is -180.0 to +180.0 (West is negative, East is positive) inclusive.")
     @PathParam("lat") final String lat, @Description("If provided with a &lt;tt&gt;lat&lt;/tt&gt; parameter the available trend locations will be sorted by distance, nearest to furthest, to the co-ordinate pair. The valid ranges for longitude is -180.0 to +180.0 (West is negative, East is positive) inclusive.")
     @PathParam("long") final String long_arg) {
        //TODO: implement
        return null;
    }

    @GET
    @Produces("application/json")
    @Path("/place")
    @Category({"trends"})
    @ApiVersion({"1.1"})
    @SeeAlso({@See(href = "/docs/api/1.1/get/trends/available", value="GET trends/available"),@See(href = "/docs/api/1.1/get/trends/closest", value="GET trends/closest")})
    @ApplicationLimit(rate = @Rate(window = 15, unit = GovernanceUnit.MINUTES, limit = 15))@UserLimit(rate = @Rate(window = 15, unit = GovernanceUnit.MINUTES, limit = 15))@Description("Returns the top 10 trending topics for a specific WOEID, if trending information is available for it. The response is an array of ")
    public Response getPlace(@Description("The &lt;a href=&quot;http://developer.yahoo.com/geo/geoplanet/&quot; rel=&quot;external&quot;&gt;Yahoo! Where On Earth ID&lt;/a&gt; of the location to return trending information for. Global information is available by using &lt;tt&gt;1&lt;/tt&gt; as the &lt;tt&gt;WOEID&lt;/tt&gt;.")
     @PathParam("id") final int id, @Description("Setting this equal to &lt;tt&gt;hashtags&lt;/tt&gt; will remove all hashtags from the trends list.")
     @QueryParam("exclude") final String exclude) {
        //TODO: implement
        return null;
    }

}