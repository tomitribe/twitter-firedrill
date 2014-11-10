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

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

@Path("/geo")
public class GeoResource {

    @GET
    @Produces("application/json")
    @Path("/id/{place_id}")
    @Category({"geo"})
    @ApiVersion({"1.1"})
    @SeeAlso({@See(href="post/geo/place", value = "POST geo/place"), @See(href="get/geo/similar_places", value = "GET geo/similar_places"), @See(href = "/docs/finding-tweets-about-places", value = "Finding Tweets about Places"), @See(href = "/docs/about-geo-place-attributes", value = "About Geo Place Attributes")})
    @UserLimit(rate = @Rate(window = 15, unit = GovernanceUnit.MINUTES, limit = 15))
    @Description("Returns all the information about a known place.")
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
    @SeeAlso({@See(href="get/geo/id/%3Aplace_id", value = "GET geo/id/:place_id"), @See(href="get/geo/search", value = "GET geo/search"), @See(href="get/geo/similar_places", value = "GET geo/similar_places"), @See(href = "/docs/finding-tweets-about-places", value = "Finding Tweets about Places"), @See(href = "/docs/about-geo-place-attributes", value = "About Geo Place Attributes")})
    @UserLimit(rate = @Rate(window = 15, unit = GovernanceUnit.MINUTES, limit = 15))
    @Description("Given a latitude and a longitude, searches for up to 20 places that can be used as a place_id when updating a status. This request is an informative call and will deliver generalized results about geography.")
    public PlacesType getReverse_geocode(@Description("The latitude to search around. This parameter will be ignored unless it is inside the range -90.0 to +90.0 (North is positive) inclusive. It will also be ignored if there isn't a corresponding <tt>long</tt> parameter.")
                                         @PathParam("lat") final String lat, @Description("The longitude to search around. The valid ranges for longitude is -180.0 to +180.0 (East is positive) inclusive. This parameter will be ignored if outside that range, if it is not a number, if <tt>geo_enabled</tt> is disabled, or if there not a corresponding <tt>lat</tt> parameter.")
                                         @PathParam("long") final String long_arg, @Description("A hint on the \"region\" in which to search. If a number, then this is a radius in meters, but it can also take a string that is suffixed with ft to specify feet. If this is not passed in, then it is assumed to be <tt>0m</tt>. If coming from a device, in practice, this value is whatever accuracy the device has measuring its location (whether it be coming from a GPS, WiFi triangulation, etc.).")
                                         @QueryParam("accuracy") final String accuracy, @Description("This is the minimal granularity of place types to return and must be one of: <tt>poi</tt>, <tt>neighborhood</tt>, <tt>city</tt>, <tt>admin</tt> or <tt>country</tt>. If no granularity is provided for the request <tt>neighborhood</tt> is assumed.<br /> Setting this to <tt>city</tt>, for example, will find places which have a type of <tt>city</tt>, <tt>admin</tt> or <tt>country</tt>.")
                                         @QueryParam("granularity") final String granularity,
                                         @Description("A hint as to the number of results to return. This does not guarantee that the number of results returned will equal max_results, but instead informs how many \"nearby\" results to return. Ideally, only pass in the number of places you intend to display to the user here.")
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
    @SeeAlso({@See(href="get/geo/id/%3Aplace_id", value = "GET geo/id/:place_id"), @See(href="get/geo/reverse_geocode", value = "GET geo/reverse_geocode"), @See(href = "/docs/finding-tweets-about-places", value = "Finding Tweets about Places"), @See(href = "/docs/about-geo-place-attributes", value = "About Geo Place Attributes")})
    @UserLimit(rate = @Rate(window = 15, unit = GovernanceUnit.MINUTES, limit = 15))
    @Description("Search for places that can be attached to a statuses/update. Given a latitude and a longitude pair, an IP address, or a name, this request will return a list of all the valid places that can be used as the place_id when updating a status.")
    public PlacesType getSearch(@Description("The latitude to search around. This parameter will be ignored unless it is inside the range -90.0 to +90.0 (North is positive) inclusive. It will also be ignored if there isn't a corresponding <tt>long</tt> parameter.")
                                @QueryParam("lat") final String lat, @Description("The longitude to search around. The valid ranges for longitude is -180.0 to +180.0 (East is positive) inclusive. This parameter will be ignored if outside that range, if it is not a number, if <tt>geo_enabled</tt> is disabled, or if there not a corresponding <tt>lat</tt> parameter.")
                                @QueryParam("long") final String long_arg, @Description("Free-form text to match against while executing a geo-based query, best suited for finding nearby locations by name. Remember to URL encode the query.")
                                @QueryParam("query") final String query, @Description("An IP address. Used when attempting to fix geolocation based off of the user's IP address.")
                                @QueryParam("ip") final String ip,
                                @Description("This is the minimal granularity of place types to return and must be one of: <tt>poi</tt>, <tt>neighborhood</tt>, <tt>city</tt>, <tt>admin</tt> or <tt>country</tt>. If no granularity is provided for the request <tt>neighborhood</tt> is assumed.<br /> Setting this to <tt>city</tt>, for example, will find places which have a type of <tt>city</tt>, <tt>admin</tt> or <tt>country</tt>.")
                                @QueryParam("granularity") final String granularity, @Description("A hint on the \"region\" in which to search. If a number, then this is a radius in meters, but it can also take a string that is suffixed with ft to specify feet. If this is not passed in, then it is assumed to be <tt>0m</tt>. If coming from a device, in practice, this value is whatever accuracy the device has measuring its location (whether it be coming from a GPS, WiFi triangulation, etc.).")
                                @QueryParam("accuracy") final String accuracy, @Description("A hint as to the number of results to return. This does not guarantee that the number of results returned will equal max_results, but instead informs how many \"nearby\" results to return. Ideally, only pass in the number of places you intend to display to the user here.")
                                @QueryParam("max_results") final Integer max_results, @Description("This is the <tt>place_id</tt> which you would like to restrict the search results to. Setting this value means only places within the given <tt>place_id</tt> will be found.<br /><br /> Specify a place_id. For example, to scope all results to places within \"San Francisco, CA USA\", you would specify a <tt>place_id</tt> of \"5a110d312052166f\"")
                                @QueryParam("contained_within") final String contained_within,
                                @Description("This parameter searches for places which have this given street address. There are other well-known, and application specific attributes available. Custom attributes are also permitted. Learn more about <a href=\"https://dev.twitter.com/docs/about-geo-place-attributes\">Place Attributes</a>.")
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
    @SeeAlso({@See(href = "/docs/finding-tweets-about-places", value = "Finding Tweets about Places"), @See(href="get/geo/id/%3Aplace_id", value = "GET geo/id/:place_id"), @See(href="get/geo/search", value = "GET geo/search"), @See(href="post/geo/place", value = "POST geo/place"), @See(href = "/docs/about-geo-place-attributes", value = "About Geo Place Attributes")})
    @UserLimit(rate = @Rate(window = 15, unit = GovernanceUnit.MINUTES, limit = 15))
    @Description("Locates places near the given coordinates which are similar in name.")
    public PlacesType getSimilar_places(@Description("The latitude to search around. This parameter will be ignored unless it is inside the range -90.0 to +90.0 (North is positive) inclusive. It will also be ignored if there isn't a corresponding <tt>long</tt> parameter.")
                                        @PathParam("lat") final String lat, @Description("The longitude to search around. The valid ranges for longitude is -180.0 to +180.0 (East is positive) inclusive. This parameter will be ignored if outside that range, if it is not a number, if <tt>geo_enabled</tt> is disabled, or if there not a corresponding <tt>lat</tt> parameter.")
                                        @PathParam("long") final String long_arg, @Description("The name a place is known as.")
                                        @PathParam("name") final String name, @Description("This is the <tt>place_id</tt> which you would like to restrict the search results to. Setting this value means only places within the given <tt>place_id</tt> will be found.<br /><br /> Specify a place_id. For example, to scope all results to places within \"San Francisco, CA USA\", you would specify a <tt>place_id</tt> of \"5a110d312052166f\"")
                                        @QueryParam("contained_within") final String contained_within,
                                        @Description("This parameter searches for places which have this given street address. There are other well-known, and application specific attributes available. Custom attributes are also permitted. Learn more about <a href=\"https://dev.twitter.com/docs/about-geo-place-attributes\">Place Attributes</a>.")
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
    @SeeAlso({@See(href="get/geo/similar_places", value = "GET geo/similar_places"), @See(href="get/geo/search", value = "GET geo/search"), @See(href = "/docs/finding-tweets-about-places", value = "Finding Tweets about Places"), @See(href = "/docs/about-geo-place-attributes", value = "About Geo Place Attributes")})
    @Description("As of December 2nd, 2013, this endpoint is deprecated and retired and no longer functions. Place creation was used infrequently by third party applications and is generally no longer supported on Twitter. Requests will return with status 410 (Gone) with error code 251.")
    public PlacesType postPlace(@Description("The name a place is known as.")
                                @PathParam("name") final String name, @Description("The <tt>place_id</tt> within which the new place can be found. Try and be as close as possible with the containing place. For example, for a room in a building, set the <tt>contained_within</tt> as the building <tt>place_id</tt>.")
                                @PathParam("contained_within") final String contained_within, @Description("The token found in the response from geo/similar_places.")
                                @PathParam("token") final String token, @Description("The latitude the place is located at. This parameter will be ignored unless it is inside the range -90.0 to +90.0 (North is positive) inclusive. It will also be ignored if there isn't a corresponding <tt>long</tt> parameter.")
                                @PathParam("lat") final String lat,
                                @Description("The longitude the place is located at. The valid ranges for longitude is -180.0 to +180.0 (East is positive) inclusive. This parameter will be ignored if outside that range, if it is not a number, if <tt>geo_enabled</tt> is disabled, or if there not a corresponding <tt>lat</tt> parameter.")
                                @PathParam("long") final String long_arg, @Description("This parameter searches for places which have this given street address. There are other well-known, and application specific attributes available. Custom attributes are also permitted. Learn more <a href=\"https://dev.twitter.com/docs/about-geo-place-attributes\">About Geo Place Attributes</a>.")
                                @QueryParam("attribute:street_address") final String attribute_street_address, @Description("If supplied, the response will use the JSONP format with a callback of the given name.")
                                @QueryParam("callback") final String callback) {
        //TODO: implement
        return null;
    }

}