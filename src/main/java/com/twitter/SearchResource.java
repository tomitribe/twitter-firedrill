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

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

@Path("/search")
public class SearchResource {

    @GET
    @Produces("application/json")
    @Path("/tweets")
    @Category({"search"})
    @ApiVersion({"1.1"})
    @Tag({"Search", "finding tweets"})
    @SeeAlso({@See(href="get/users/search", value = "GET users/search"), @See(href = "/docs/using-search", value = "Using the Twitter Search API"), @See(href="get/geo/search", value = "GET geo/search"), @See(href = "/docs/finding-tweets-about-places", value = "Finding Tweets about Places")})
    @ApplicationLimit(rate = @Rate(window = 15, unit = GovernanceUnit.MINUTES, limit = 450))
    @UserLimit(rate = @Rate(window = 15, unit = GovernanceUnit.MINUTES, limit = 180))
    @Description("Returns relevant tweets that match a specified query.")
    public TweetsType getTweets(@Description("A UTF-8, URL-encoded search query of 1,000 characters maximum, including operators. Queries may additionally be limited by complexity.")
                                @PathParam("q") final String q, @Description("Returns tweets by users located within a given radius of the given latitude/longitude. The location is preferentially taking from the Geotagging API, but will fall back to their Twitter profile. The parameter value is specified by \"<tt>latitude,longitude,radius</tt>\", where radius units must be specified as either \"<tt>mi</tt>\" (miles) or \"<tt>km</tt>\" (kilometers). Note that you cannot use the near operator via the API to geocode arbitrary locations; however you can use this <tt>geocode</tt> parameter to search near geocodes directly. A maximum of 1,000 distinct \"sub-regions\" will be considered when using the radius modifier.")
                                @QueryParam("geocode") final String geocode, @Description("Restricts tweets to the given language, given by an <a href=\"http://en.wikipedia.org/wiki/List_of_ISO_639-1_codes\">ISO 639-1</a> code. Language detection is best-effort.")
                                @QueryParam("lang") final String lang, @Description("Specify the language of the query you are sending (only <tt>ja</tt> is currently effective). This is intended for language-specific consumers and the default should work in the majority of cases.")
                                @QueryParam("locale") final String locale,
                                @Description("Optional. Specifies what type of search results you would prefer to receive. The current default is \"mixed.\" Valid values include:<br/>&nbsp;&nbsp;* <tt>mixed</tt>: Include both popular and real time results in the response.<br/>&nbsp;&nbsp;* <tt>recent</tt>: return only the most recent results in the response<br/>&nbsp;&nbsp;* <tt>popular</tt>: return only the most popular results in the response.")
                                @QueryParam("result_type") final String result_type, @Description("The number of tweets to return per page, up to a maximum of 100. Defaults to 15. This was formerly the \"rpp\" parameter in the old Search API.")
                                @QueryParam("count") final Integer count, @Description("Returns tweets generated before the given date. Date should be formatted as YYYY-MM-DD. Keep in mind that the search index may not go back as far as the date you specify here.")
                                @QueryParam("until") final String until, @Description("Returns results with an ID greater than (that is, more recent than) the specified ID. There are limits to the number of Tweets which can be accessed through the API. If the limit of Tweets has occured since the since_id, the since_id will be forced to the oldest ID available.")
                                @QueryParam("since_id") final Integer since_id,
                                @Description("Returns results with an ID less than (that is, older than) or equal to the specified ID.")
                                @QueryParam("max_id") final Integer max_id, @Description("The <tt>entities</tt> node will be disincluded when set to <tt>false</tt>.")
                                @QueryParam("include_entities") final Boolean include_entities, @Description("If supplied, the response will use the JSONP format with a callback of the given name. The usefulness of this parameter is somewhat diminished by the requirement of authentication for requests to this endpoint.")
                                @QueryParam("callback") final String callback) {
        //TODO: implement
        return null;
    }

}