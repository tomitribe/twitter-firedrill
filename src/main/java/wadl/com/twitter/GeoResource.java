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
import com.twitter.dev.api.PlacesType;

@Path("/geo")
public class GeoResource {

    @GET
    @Produces("application/json")
    @Path("/id/{place_id}")
    @Category({"geo"})
    @ApiVersion({"1.1"})
    @SeeAlso({@See(href = "/docs/api/1.1/post/geo/place", value="POST geo/place"),@See(href = "/docs/api/1.1/get/geo/similar_places", value="GET geo/similar_places"),@See(href = "/docs/finding-tweets-about-places", value="Finding Tweets about Places"),@See(href = "/docs/about-geo-place-attributes", value="About Geo Place Attributes")})
    @ApplicationLimit()@UserLimit(rate = @Rate(window = 15, unit = GovernanceUnit.MINUTES, limit = 15))@Description("Returns all the information about a known place.")
    public PlacesType getIdplace_id(@Description("A place in the world. These IDs can be retrieved from geo/reverse_geocode.")
     @PathParam("place_id") final String place_id) {
        //TODO: implement
        return null;
    }

    @GET
    @Produces("application/json")
    @Path("/reverse_geocode")
    @Category({"geo"})
    @ApiVersion({"1.1"})
    @SeeAlso({@See(href = "/docs/api/1.1/get/geo/id/%3Aplace_id", value="GET geo/id/:place_id"),@See(href = "/docs/api/1.1/get/geo/search", value="GET geo/search"),@See(href = "/docs/api/1.1/get/geo/similar_places", value="GET geo/similar_places"),@See(href = "/docs/finding-tweets-about-places", value="Finding Tweets about Places"),@See(href = "/docs/about-geo-place-attributes", value="About Geo Place Attributes")})
    @ApplicationLimit()@UserLimit(rate = @Rate(window = 15, unit = GovernanceUnit.MINUTES, limit = 15))@Description("Given a latitude and a longitude, searches for up to 20 places that can be used as a place_id when updating a status. This request is an informative call and will deliver generalized results about geography.")
    public PlacesType getReverse_geocode(@Description("The latitude to search around. This parameter will be ignored unless it is inside the range -90.0 to +90.0 (North is positive) inclusive. It will also be ignored if there isn&apos;t a corresponding ")
     @PathParam("lat") final String lat, @Description("The longitude to search around. The valid ranges for longitude is -180.0 to +180.0 (East is positive) inclusive. This parameter will be ignored if outside that range, if it is not a number, if ")
     @PathParam("long") final String long_arg, @Description("A hint on the &quot;region&quot; in which to search. If a number, then this is a radius in meters, but it can also take a string that is suffixed with ft to specify feet. If this is not passed in, then it is assumed to be ")
     @QueryParam("accuracy") final String accuracy, @Description("This is the minimal granularity of place types to return and must be one of: &lt;tt&gt;poi&lt;/tt&gt;, &lt;tt&gt;neighborhood&lt;/tt&gt;, &lt;tt&gt;city&lt;/tt&gt;, &lt;tt&gt;admin&lt;/tt&gt; or &lt;tt&gt;country&lt;/tt&gt;. If no granularity is provided for the request &lt;tt&gt;neighborhood&lt;/tt&gt; is assumed.&lt;br /&gt; Setting this to &lt;tt&gt;city&lt;/tt&gt;, for example, will find places which have a type of &lt;tt&gt;city&lt;/tt&gt;, &lt;tt&gt;admin&lt;/tt&gt; or &lt;tt&gt;country&lt;/tt&gt;.")
     @QueryParam("granularity") final String granularity, 
                @Description("A hint as to the number of results to return. This does not guarantee that the number of results returned will equal max_results, but instead informs how many &quot;nearby&quot; results to return. Ideally, only pass in the number of places you intend to display to the user here.")
     @QueryParam("max_results") final Integer max_results, @Description("If supplied, the response will use the JSONP format with a callback of the given name.")
     @QueryParam("callback") final String callback) {
        //TODO: implement
        return null;
    }

    @GET
    @Produces("application/json")
    @Path("/search")
    @Category({"geo"})
    @ApiVersion({"1.1"})
    @SeeAlso({@See(href = "/docs/api/1.1/get/geo/id/%3Aplace_id", value="GET geo/id/:place_id"),@See(href = "/docs/api/1.1/get/geo/reverse_geocode", value="GET geo/reverse_geocode"),@See(href = "/docs/finding-tweets-about-places", value="Finding Tweets about Places"),@See(href = "/docs/about-geo-place-attributes", value="About Geo Place Attributes")})
    @ApplicationLimit()@UserLimit(rate = @Rate(window = 15, unit = GovernanceUnit.MINUTES, limit = 15))@Description("Search for places that can be attached to a statuses/update. Given a latitude and a longitude pair, an IP address, or a name, this request will return a list of all the valid places that can be used as the place_id when updating a status.")
    public PlacesType getSearch(@Description("The latitude to search around. This parameter will be ignored unless it is inside the range -90.0 to +90.0 (North is positive) inclusive. It will also be ignored if there isn&apos;t a corresponding ")
     @QueryParam("lat") final String lat, @Description("The longitude to search around. The valid ranges for longitude is -180.0 to +180.0 (East is positive) inclusive. This parameter will be ignored if outside that range, if it is not a number, if ")
     @QueryParam("long") final String long_arg, @Description("Free-form text to match against while executing a geo-based query, best suited for finding nearby locations by name. Remember to URL encode the query.")
     @QueryParam("query") final String query, @Description("An IP address. Used when attempting to fix geolocation based off of the user&apos;s IP address.")
     @QueryParam("ip") final String ip, 
                @Description("This is the minimal granularity of place types to return and must be one of: ")
     @QueryParam("granularity") final String granularity, @Description("A hint on the &quot;region&quot; in which to search. If a number, then this is a radius in meters, but it can also take a string that is suffixed with ft to specify feet. If this is not passed in, then it is assumed to be ")
     @QueryParam("accuracy") final String accuracy, @Description("A hint as to the number of results to return. This does not guarantee that the number of results returned will equal max_results, but instead informs how many &quot;nearby&quot; results to return. Ideally, only pass in the number of places you intend to display to the user here.")
     @QueryParam("max_results") final Integer max_results, @Description("This is the &lt;tt&gt;place_id&lt;/tt&gt; which you would like to restrict the search results to. Setting this value means only places within the given &lt;tt&gt;place_id&lt;/tt&gt; will be found.&lt;br /&gt;&lt;br /&gt; Specify a place_id. For example, to scope all results to places within &quot;San Francisco, CA USA&quot;, you would specify a &lt;tt&gt;place_id&lt;/tt&gt; of &quot;5a110d312052166f&quot;")
     @QueryParam("contained_within") final String contained_within, 
                @Description("This parameter searches for places which have this given street address. There are other well-known, and application specific attributes available. Custom attributes are also permitted. Learn more about ")
     @QueryParam("attribute:street_address") final String attribute_street_address, @Description("If supplied, the response will use the JSONP format with a callback of the given name.")
     @QueryParam("callback") final String callback) {
        //TODO: implement
        return null;
    }

    @GET
    @Produces("application/json")
    @Path("/similar_places")
    @Category({"geo"})
    @ApiVersion({"1.1"})
    @Tag({"Places &amp;amp; Geo"})
    @SeeAlso({@See(href = "/docs/finding-tweets-about-places", value="Finding Tweets about Places"),@See(href = "/docs/api/1.1/get/geo/id/%3Aplace_id", value="GET geo/id/:place_id"),@See(href = "/docs/api/1.1/get/geo/search", value="GET geo/search"),@See(href = "/docs/api/1.1/post/geo/place", value="POST geo/place"),@See(href = "/docs/about-geo-place-attributes", value="About Geo Place Attributes")})
    @ApplicationLimit()@UserLimit(rate = @Rate(window = 15, unit = GovernanceUnit.MINUTES, limit = 15))@Description("Locates places near the given coordinates which are similar in name.")
    public PlacesType getSimilar_places(@Description("The latitude to search around. This parameter will be ignored unless it is inside the range -90.0 to +90.0 (North is positive) inclusive. It will also be ignored if there isn&apos;t a corresponding ")
     @PathParam("lat") final String lat, @Description("The longitude to search around. The valid ranges for longitude is -180.0 to +180.0 (East is positive) inclusive. This parameter will be ignored if outside that range, if it is not a number, if ")
     @PathParam("long") final String long_arg, @Description("The name a place is known as.")
     @PathParam("name") final String name, @Description("This is the &lt;tt&gt;place_id&lt;/tt&gt; which you would like to restrict the search results to. Setting this value means only places within the given &lt;tt&gt;place_id&lt;/tt&gt; will be found.&lt;br /&gt;&lt;br /&gt; Specify a place_id. For example, to scope all results to places within &quot;San Francisco, CA USA&quot;, you would specify a &lt;tt&gt;place_id&lt;/tt&gt; of &quot;5a110d312052166f&quot;")
     @QueryParam("contained_within") final String contained_within, 
                @Description("This parameter searches for places which have this given street address. There are other well-known, and application specific attributes available. Custom attributes are also permitted. Learn more about ")
     @QueryParam("attribute:street_address") final String attribute_street_address, @Description("If supplied, the response will use the JSONP format with a callback of the given name.")
     @QueryParam("callback") final String callback) {
        //TODO: implement
        return null;
    }

    @POST
    @Produces("application/json")
    @Path("/place")
    @Category({"geo"})
    @ApiVersion({"1.1"})
    @SeeAlso({@See(href = "/docs/api/1.1/get/geo/similar_places", value="GET geo/similar_places"),@See(href = "/docs/api/1.1/get/geo/search", value="GET geo/search"),@See(href = "/docs/finding-tweets-about-places", value="Finding Tweets about Places"),@See(href = "/docs/about-geo-place-attributes", value="About Geo Place Attributes")})
    @Description("As of December 2nd, 2013, this endpoint is deprecated and retired and no longer functions. Place creation was used infrequently by third party applications and is generally no longer supported on Twitter. Requests will return with status 410 (Gone) with error code 251.")
    public PlacesType postPlace(@Description("The name a place is known as.")
     @PathParam("name") final String name, @Description("The &lt;tt&gt;place_id&lt;/tt&gt; within which the new place can be found. Try and be as close as possible with the containing place. For example, for a room in a building, set the &lt;tt&gt;contained_within&lt;/tt&gt; as the building &lt;tt&gt;place_id&lt;/tt&gt;.")
     @PathParam("contained_within") final String contained_within, @Description("The token found in the response from geo/similar_places.")
     @PathParam("token") final String token, @Description("The latitude the place is located at. This parameter will be ignored unless it is inside the range -90.0 to +90.0 (North is positive) inclusive. It will also be ignored if there isn&apos;t a corresponding ")
     @PathParam("lat") final String lat, 
                @Description("The longitude the place is located at. The valid ranges for longitude is -180")
     @PathParam("long") final String long_arg, @Description("This parameter searches for places which have this given street address. There are other well-known, and application specific attributes available. Custom attributes are also permitted. Learn more ")
     @QueryParam("attribute:street_address") final String attribute_street_address, @Description("If supplied, the response will use the JSONP format with a callback of the given name.")
     @QueryParam("callback") final String callback) {
        //TODO: implement
        return null;
    }

}