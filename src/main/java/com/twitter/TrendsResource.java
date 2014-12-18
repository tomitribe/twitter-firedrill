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

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

@Path("/trends")
public class TrendsResource {

    @GET
    @Produces("application/json")
    @Path("/available")
    @Category({"trends"})
    @ApiVersion({"1.1"})
    @SeeAlso({@See(href="endpoint/twitter/GET/trends/place", value = "GET trends/place"), @See(href="endpoint/twitter/GET/trends/closest", value = "GET trends/closest")})
    @ApplicationLimit(rate = @Rate(window = 15, unit = GovernanceUnit.MINUTES, limit = 15))
    @UserLimit(rate = @Rate(window = 15, unit = GovernanceUnit.MINUTES, limit = 15))
    @Description("Returns the locations that Twitter has trending topic information for. The response is an array of &quot;locations&quot; that encode the location&#039;s WOEID and some other human-readable information such as a canonical name and country the location belongs in. A WOEID is a Yahoo! Where On Earth ID.")
    public Response getAvailable() {
        //TODO: implement
        return null;
    }

    @GET
    @Produces("application/json")
    @Path("/closest")
    @Category({"trends"})
    @ApiVersion({"1.1"})
    @SeeAlso({@See(href="endpoint/twitter/GET/trends/available", value = "GET trends/available"), @See(href="endpoint/twitter/GET/trends/closest", value = "GET trends/closest")})
    @ApplicationLimit(rate = @Rate(window = 15, unit = GovernanceUnit.MINUTES, limit = 15))
    @UserLimit(rate = @Rate(window = 15, unit = GovernanceUnit.MINUTES, limit = 15))
    @Description("Returns the locations that Twitter has trending topic information for, closest to a specified location. The response is an array of &quot;locations&quot; that encode the location&#039;s WOEID and some other human-readable information such as a canonical name and country the location belongs in. A WOEID is a Yahoo! Where On Earth ID.")
    public Response getClosest(@Description("If provided with a <tt>long</tt> parameter the available trend locations will be sorted by distance, nearest to furthest, to the co-ordinate pair. The valid ranges for longitude is -180.0 to +180.0 (West is negative, East is positive) inclusive.")
                               @PathParam("lat") final String lat, @Description("If provided with a <tt>lat</tt> parameter the available trend locations will be sorted by distance, nearest to furthest, to the co-ordinate pair. The valid ranges for longitude is -180.0 to +180.0 (West is negative, East is positive) inclusive.")
                               @PathParam("long") final String long_arg) {
        //TODO: implement
        return null;
    }

    @GET
    @Produces("application/json")
    @Path("/place")
    @Category({"trends"})
    @ApiVersion({"1.1"})
    @SeeAlso({@See(href="endpoint/twitter/GET/trends/available", value = "GET trends/available"), @See(href="endpoint/twitter/GET/trends/closest", value = "GET trends/closest")})
    @ApplicationLimit(rate = @Rate(window = 15, unit = GovernanceUnit.MINUTES, limit = 15))
    @UserLimit(rate = @Rate(window = 15, unit = GovernanceUnit.MINUTES, limit = 15))
    @Description("Returns the top 10 trending topics for a specific WOEID, if trending information is available for it. The response is an array of &quot;trend&quot; objects that encode the name of the trending topic, the query parameter that can be used to search for the topic on Twitter Search, and the Twitter Search URL. This information is cached for 5 minutes.")
    public Response getPlace(@Description("The <a href=\"http://developer.yahoo.com/geo/geoplanet/\" rel=\"external\">Yahoo! Where On Earth ID</a> of the location to return trending information for. Global information is available by using <tt>1</tt> as the <tt>WOEID</tt>.")
                             @PathParam("id") final int id, @Description("Setting this equal to <tt>hashtags</tt> will remove all hashtags from the trends list.")
                             @QueryParam("exclude") final String exclude) {
        //TODO: implement
        return null;
    }

}
