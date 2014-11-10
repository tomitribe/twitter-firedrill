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
import com.twitter.dev.api.UsersType;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

@Path("/statuses")
public class StatusesResource {

    @GET
    @Produces("application/json")
    @Path("/firehose")
    @ApiVersion({"1.1"})
    @SeeAlso({@See(href = "/docs/streaming-apis/streams/public", value = "Public streams"), @See(href = "/docs/api/streaming", value = "The Streaming APIs")})
    @Description("This endpoint requires special permission to access. Returns all public statuses. Few applications require this level of access. Creative use of a combination of other resources and various access levels can satisfy nearly every application use case.")
    public TweetsType getFirehose(@Description("The number of messages to backfill. See <a href=\"https://dev.twitter.com/docs/streaming-apis/parameters#count\">the count parameter documentation</a> for more information.")
                                  @QueryParam("count") final Integer count, @Description("Specifies whether messages should be length-delimited. See <a href=\"https://dev.twitter.com/docs/streaming-apis/parameters#delimited\">the delimited parameter documentation</a> for more information.")
                                  @QueryParam("delimited") final String delimited, @Description("Specifies whether stall warnings should be delivered. See <a href=\"https://dev.twitter.com/docs/streaming-apis/parameters#stall_warnings\">the stall_warnings parameter documentation</a> for more information.")
                                  @QueryParam("stall_warnings") final String stall_warnings) {
        //TODO: implement
        return null;
    }

    @GET
    @Produces("application/json")
    @Path("/home_timeline")
    @Category({"statuses"})
    @ApiVersion({"1.1"})
    @Tag({"finding tweets"})
    @See(href="/apirest/twitter/GET/statuses/user_timeline", value = "GET statuses/user_timeline")
    @UserLimit(rate = @Rate(window = 15, unit = GovernanceUnit.MINUTES, limit = 15))
    @Description("Returns a collection of the most recent Tweets and retweets posted by the authenticating user and the users they follow. The home timeline is central to how most users interact with the Twitter service.")
    public TweetsType getHome_timeline(@Description("Specifies the number of records to retrieve. Must be less than or equal to 200. Defaults to 20.")
                                       @QueryParam("count") final Integer count, @Description("Returns results with an ID greater than (that is, more recent than) the specified ID. There are limits to the number of Tweets which can be accessed through the API. If the limit of Tweets has occured since the since_id, the since_id will be forced to the oldest ID available.")
                                       @QueryParam("since_id") final Integer since_id, @Description("Returns results with an ID less than (that is, older than) or equal to the specified ID.")
                                       @QueryParam("max_id") final Integer max_id, @Description("When set to either <tt>true</tt>, <tt>t</tt> or <tt>1</tt>, each tweet returned in a timeline will include a user object including only the status authors numerical ID. Omit this parameter to receive the complete user object.")
                                       @QueryParam("trim_user") final Boolean trim_user,
                                       @Description("This parameter will prevent replies from appearing in the returned timeline. Using <tt>exclude_replies</tt> with the <tt>count</tt> parameter will mean you will receive up-to count tweets &mdash; this is because the <tt>count</tt> parameter retrieves that many tweets before filtering out retweets and replies.")
                                       @QueryParam("exclude_replies") final Boolean exclude_replies, @Description("This parameter enhances the contributors element of the status response to include the screen_name of the contributor. By default only the user_id of the contributor is included.")
                                       @QueryParam("contributor_details") final Boolean contributor_details, @Description("The <tt>entities</tt> node will be disincluded when set to <tt>false</tt>.")
                                       @QueryParam("include_entities") final Boolean include_entities) {
        //TODO: implement
        return null;
    }

    @GET
    @Produces("application/json")
    @Path("/mentions_timeline")
    @Category({"statuses"})
    @ApiVersion({"1.1"})
    @Tag({"Mentions"})
    @SeeAlso({@See(href="/apirest/twitter/GET/statuses/home_timeline", value = "GET statuses/home_timeline"), @See(href="/apirest/twitter/GET/statuses/user_timeline", value = "GET statuses/user_timeline")})
    @UserLimit(rate = @Rate(window = 15, unit = GovernanceUnit.MINUTES, limit = 15))
    @Description("Returns the 20 most recent mentions (tweets containing a users&#039;s @screen_name) for the authenticating user. The timeline returned is the equivalent of the one seen when you view your mentions on twitter.com. This method can only return up to 800 tweets. See Working with Timelines for instructions on traversing timelines.")
    public TweetsType getMentions_timeline(@Description("Specifies the number of tweets to try and retrieve, up to a maximum of 200. The value of <tt>count</tt> is best thought of as a limit to the number of tweets to return because suspended or deleted content is removed after the count has been applied. We include retweets in the count, even if <tt>include_rts</tt> is not supplied. It is recommended you always send <tt>include_rts=1</tt> when using this API method.")
                                           @QueryParam("count") final Integer count, @Description("Returns results with an ID greater than (that is, more recent than) the specified ID. There are limits to the number of Tweets which can be accessed through the API. If the limit of Tweets has occured since the since_id, the since_id will be forced to the oldest ID available.")
                                           @QueryParam("since_id") final Integer since_id, @Description("Returns results with an ID less than (that is, older than) or equal to the specified ID.")
                                           @QueryParam("max_id") final Integer max_id, @Description("When set to either <tt>true</tt>, <tt>t</tt> or <tt>1</tt>, each tweet returned in a timeline will include a user object including only the status authors numerical ID. Omit this parameter to receive the complete user object.")
                                           @QueryParam("trim_user") final Boolean trim_user,
                                           @Description("This parameter enhances the contributors element of the status response to include the screen_name of the contributor. By default only the user_id of the contributor is included.")
                                           @QueryParam("contributor_details") final Boolean contributor_details, @Description("The <tt>entities</tt> node will be disincluded when set to <tt>false</tt>.")
                                           @QueryParam("include_entities") final Boolean include_entities) {
        //TODO: implement
        return null;
    }

    @GET
    @Produces("application/json")
    @Path("/oembed")
    @Category({"statuses"})
    @ApiVersion({"1.1"})
    @Tag({"oEmbed"})
    @See(href = "/docs/embedded-tweets", value = "Embedded Tweets")
    @ApplicationLimit(rate = @Rate(window = 15, unit = GovernanceUnit.MINUTES, limit = 180))
    @UserLimit(rate = @Rate(window = 15, unit = GovernanceUnit.MINUTES, limit = 180))
    @Description("Returns information allowing the creation of an embedded representation of a Tweet on third party sites. See the oEmbed specification for information about the response format.")
    public TweetsType getOembed(@Description("The Tweet/status ID to return embed code for.")
                                @PathParam("id") final String id, @Description("The URL of the Tweet/status to be embedded.")
                                @PathParam("url") final String url, @Description("The maximum width in pixels that the embed should be rendered at. This value is constrained to be between <strong>250</strong> and <strong>550</strong> pixels.")
                                @QueryParam("maxwidth") final Integer maxwidth, @Description("Specifies whether the embedded Tweet should automatically expand images which were uploaded via <a href=\"https://dev.twitter.com/apirest/twitter/POST/statuses/update_with_media\">POST statuses/update_with_media</a>. When set to either <tt>true</tt>, <tt>t</tt> or <tt>1</tt> images will not be expanded. Defaults to false.")
                                @QueryParam("hide_media") final Boolean hide_media,
                                @Description("Specifies whether the embedded Tweet should automatically show the original message in the case that the embedded Tweet is a reply. When set to either <tt>true</tt>, <tt>t</tt> or <tt>1</tt> the original Tweet will not be shown. Defaults to false.")
                                @QueryParam("hide_thread") final Boolean hide_thread, @Description("Specifies whether the embedded Tweet HTML should include a &lt;script&gt; element pointing to <tt>widgets.js</tt>. In cases where a page already includes <tt>widgets.js</tt>, setting this value to true will prevent a redundant script element from being included. When set to either <tt>true</tt>, <tt>t</tt> or <tt>1</tt> the &lt;script&gt; element will not be included in the embed HTML, meaning that pages must include a reference to <tt>widgets.js</tt> manually. Defaults to false.")
                                @QueryParam("omit_script") final Boolean omit_script, @Description("Specifies whether the embedded Tweet should be left aligned, right aligned, or centered in the page. Valid values are <tt>left</tt>, <tt>right</tt>, <tt>center</tt>, and <tt>none</tt>. Defaults to <tt>none</tt>, meaning no alignment styles are specified for the Tweet.")
                                @QueryParam("align") final String align, @Description("A value for the TWT <tt>related</tt> parameter, as described in <a href=\"https://dev.twitter.com/docs/intents\">Web Intents</a>. This value will be forwarded to all Web Intents calls.")
                                @QueryParam("related") final String related,
                                @Description("Language code for the rendered embed. This will affect the text and localization of the rendered HTML.")
                                @QueryParam("lang") final String lang) {
        //TODO: implement
        return null;
    }

    @GET
    @Produces("application/json")
    @Path("/retweeters/ids")
    @Category({"statuses"})
    @ApiVersion({"1.1"})
    @Tag({"Retweets"})
    @See(href="/apirest/twitter/GET/statuses/retweets/%3Aid", value = "GET statuses/retweets/:id")
    @ApplicationLimit(rate = @Rate(window = 15, unit = GovernanceUnit.MINUTES, limit = 60))
    @UserLimit(rate = @Rate(window = 15, unit = GovernanceUnit.MINUTES, limit = 15))
    @Description("Returns a collection of up to 100 user IDs belonging to users who have retweeted the tweet specified by the id parameter. This method offers similar data to GET statuses/retweets/:id and replaces API v1&#039;s GET statuses/:id/retweeted_by/ids method.")
    public UsersType getRetweetersids(@Description("The numerical ID of the desired status.")
                                      @PathParam("id") final String id, @Description("Causes the list of IDs to be broken into pages of no more than 100 IDs at a time. The number of IDs returned is not guaranteed to be 100 as suspended users are filtered out after connections are queried. If no cursor is provided, a value of <tt>-1</tt> will be assumed, which is the first \"page.\"<br /><br /> The response from the API will include a <tt>previous_cursor</tt> and <tt>next_cursor</tt> to allow paging back and forth. See <a href=\"https://dev.twitter.com/docs/misc/cursoring\">Using cursors to navigate collections</a> for more information.<br/><br/>While this method supports the cursor parameter, the entire result set can be returned in a single cursored collection. Using the <tt>count</tt> parameter with this method will not provide segmented cursors for use with this parameter.")
                                      @QueryParam("cursor") final String cursor, @Description("Many programming environments will not consume our ids due to their size. Provide this option to have ids returned as strings instead. Read more about <a href=\"https://dev.twitter.com/docs/twitter-ids-json-and-snowflake\">Twitter IDs, JSON and Snowflake</a>.")
                                      @QueryParam("stringify_ids") final Boolean stringify_ids) {
        //TODO: implement
        return null;
    }

    @GET
    @Produces("application/json")
    @Path("/retweets/{id}")
    @Category({"statuses"})
    @ApiVersion({"1.1"})
    @Tag({"Retweets"})
    @ApplicationLimit(rate = @Rate(window = 15, unit = GovernanceUnit.MINUTES, limit = 60))
    @UserLimit(rate = @Rate(window = 15, unit = GovernanceUnit.MINUTES, limit = 15))
    @Description("Returns a collection of the 100 most recent retweets of the tweet specified by the id parameter.")
    public TweetsType getRetweetsid(@Description("The numerical ID of the desired status.")
                                    @PathParam("id") final int id, @Description("Specifies the number of records to retrieve. Must be less than or equal to 100.")
                                    @QueryParam("count") final Integer count, @Description("When set to either <tt>true</tt>, <tt>t</tt> or <tt>1</tt>, each tweet returned in a timeline will include a user object including only the status authors numerical ID. Omit this parameter to receive the complete user object.")
                                    @QueryParam("trim_user") final Boolean trim_user) {
        //TODO: implement
        return null;
    }

    @GET
    @Produces("application/json")
    @Path("/retweets_of_me")
    @Category({"statuses"})
    @ApiVersion({"1.1"})
    @Tag({"Retweets"})
    @SeeAlso({@See(href="/apirest/twitter/GET/statuses/mentions_timeline", value = "GET statuses/mentions_timeline"), @See(href="/apirest/twitter/GET/statuses/user_timeline", value = "GET statuses/user_timeline"), @See(href = "/docs/working-with-timelines", value = "Working with Timelines")})
    @UserLimit(rate = @Rate(window = 15, unit = GovernanceUnit.MINUTES, limit = 15))
    @Description("Returns the most recent tweets authored by the authenticating user that have been retweeted by others. This timeline is a subset of the user&#039;s GET statuses/user_timeline. See Working with Timelines for instructions on traversing timelines.")
    public TweetsType getRetweets_of_me(@Description("Specifies the number of records to retrieve. Must be less than or equal to 100. If omitted, 20 will be assumed.")
                                        @QueryParam("count") final Integer count, @Description("Returns results with an ID greater than (that is, more recent than) the specified ID. There are limits to the number of Tweets which can be accessed through the API. If the limit of Tweets has occured since the since_id, the since_id will be forced to the oldest ID available.")
                                        @QueryParam("since_id") final Integer since_id, @Description("Returns results with an ID less than (that is, older than) or equal to the specified ID.")
                                        @QueryParam("max_id") final Integer max_id, @Description("When set to either <tt>true</tt>, <tt>t</tt> or <tt>1</tt>, each tweet returned in a timeline will include a user object including only the status authors numerical ID. Omit this parameter to receive the complete user object.")
                                        @QueryParam("trim_user") final Boolean trim_user,
                                        @Description("The tweet <tt>entities</tt> node will be disincluded when set to <tt>false</tt>.")
                                        @QueryParam("include_entities") final Boolean include_entities, @Description("The user <tt>entities</tt> node will be disincluded when set to <tt>false</tt>.")
                                        @QueryParam("include_user_entities") final Boolean include_user_entities) {
        //TODO: implement
        return null;
    }

    @GET
    @Produces("application/json")
    @Path("/sample")
    @ApiVersion({"1.1"})
    @SeeAlso({@See(href = "/docs/streaming-apis/streams/public", value = "Public streams"), @See(href = "/docs/api/streaming", value = "The Streaming APIs")})
    @Description("Returns a small random sample of all public statuses. The Tweets returned by the default access level are the same, so if two different clients connect to this endpoint, they will see the same Tweets.")
    public TweetsType getSample(@Description("Specifies whether messages should be length-delimited. See <a href=\"https://dev.twitter.com/docs/streaming-apis/parameters#delimited\">the delimited parameter documentation</a> for more information.")
                                @QueryParam("delimited") final String delimited, @Description("Specifies whether stall warnings should be delivered. See <a href=\"https://dev.twitter.com/docs/streaming-apis/parameters#stall_warnings\">the stall_warnings parameter documentation</a> for more information.")
                                @QueryParam("stall_warnings") final String stall_warnings) {
        //TODO: implement
        return null;
    }

    @GET
    @Produces("application/json")
    @Path("/show/{id}")
    @Category({"statuses"})
    @ApiVersion({"1.1"})
    @Tag({"finding tweets"})
    @ApplicationLimit(rate = @Rate(window = 15, unit = GovernanceUnit.MINUTES, limit = 180))
    @UserLimit(rate = @Rate(window = 15, unit = GovernanceUnit.MINUTES, limit = 180))
    @Description("Returns a single Tweet, specified by the id parameter. The Tweet&#039;s author will also be embedded within the tweet. See Embeddable Timelines, Embeddable Tweets, and GET statuses/oembed for tools to render Tweets according to Display Requirements.")
    public TweetsType getShowid(@Description("The numerical ID of the desired Tweet.")
                                @PathParam("id") final int id, @Description("When set to either <tt>true</tt>, <tt>t</tt> or <tt>1</tt>, each tweet returned in a timeline will include a user object including only the status authors numerical ID. Omit this parameter to receive the complete user object.")
                                @QueryParam("trim_user") final Boolean trim_user, @Description("When set to either <tt>true</tt>, <tt>t</tt> or <tt>1</tt>, any Tweets returned that have been retweeted by the authenticating user will include an additional <tt>current_user_retweet</tt> node, containing the ID of the source status for the retweet.")
                                @QueryParam("include_my_retweet") final Boolean include_my_retweet, @Description("The <tt>entities</tt> node will be disincluded when set to <tt>false</tt>.")
                                @QueryParam("include_entities") final Boolean include_entities) {
        //TODO: implement
        return null;
    }

    @GET
    @Produces("application/json")
    @Path("/user_timeline")
    @Category({"statuses"})
    @ApiVersion({"1.1"})
    @SeeAlso({@See(href="/apirest/twitter/GET/statuses/home_timeline", value = "GET statuses/home_timeline"), @See(href="/apirest/twitter/GET/lists/statuses", value = "GET lists/statuses"), @See(href = "/docs/working-with-timelines", value = "Working with Timelines"), @See(href = "/docs/embedded-timelines", value = "Embedded Timelines"), @See(href = "/docs/embedded-tweets", value = "Embedded Tweets")})
    @ApplicationLimit(rate = @Rate(window = 15, unit = GovernanceUnit.MINUTES, limit = 300))
    @UserLimit(rate = @Rate(window = 15, unit = GovernanceUnit.MINUTES, limit = 180))
    @Description("Returns a collection of the most recent Tweets posted by the user indicated by the screen_name or user_id parameters.")
    public TweetsType getUser_timeline(@Description("The ID of the user for whom to return results for.")
                                       @QueryParam("user_id") final Integer user_id, @Description("The screen name of the user for whom to return results for.")
                                       @QueryParam("screen_name") final String screen_name, @Description("Returns results with an ID greater than (that is, more recent than) the specified ID. There are limits to the number of Tweets which can be accessed through the API. If the limit of Tweets has occured since the since_id, the since_id will be forced to the oldest ID available.")
                                       @QueryParam("since_id") final Integer since_id, @Description("Specifies the number of tweets to try and retrieve, up to a maximum of 200 per distinct request. The value of <tt>count</tt> is best thought of as a limit to the number of tweets to return because suspended or deleted content is removed after the count has been applied. We include retweets in the count, even if <tt>include_rts</tt> is not supplied. It is recommended you always send <tt>include_rts=1</tt> when using this API method.")
                                       @QueryParam("count") final Integer count,
                                       @Description("Returns results with an ID less than (that is, older than) or equal to the specified ID.")
                                       @QueryParam("max_id") final Integer max_id, @Description("When set to either <tt>true</tt>, <tt>t</tt> or <tt>1</tt>, each tweet returned in a timeline will include a user object including only the status authors numerical ID. Omit this parameter to receive the complete user object.")
                                       @QueryParam("trim_user") final Boolean trim_user, @Description("This parameter will prevent replies from appearing in the returned timeline. Using <tt>exclude_replies</tt> with the <tt>count</tt> parameter will mean you will receive up-to count tweets &mdash; this is because the <tt>count</tt> parameter retrieves that many tweets before filtering out retweets and replies. This parameter is only supported for JSON and XML responses.")
                                       @QueryParam("exclude_replies") final Boolean exclude_replies, @Description("This parameter enhances the contributors element of the status response to include the screen_name of the contributor. By default only the user_id of the contributor is included.")
                                       @QueryParam("contributor_details") final Boolean contributor_details,
                                       @Description("When set to <tt>false</tt>, the timeline will strip any native retweets (though they will still count toward both the maximal length of the timeline and the slice selected by the count parameter). Note: If you're using the trim_user parameter in conjunction with include_rts, the retweets will still contain a full user object.")
                                       @QueryParam("include_rts") final Boolean include_rts) {
        //TODO: implement
        return null;
    }

    @POST
    @Produces("application/json")
    @Path("/destroy/{id}")
    @Category({"statuses"})
    @ApiVersion({"1.1"})
    @Tag({"Tweets"})
    @Description("Destroys the status specified by the required ID parameter. The authenticating user must be the author of the specified status. Returns the destroyed status if successful.")
    public TweetsType postDestroyid(@Description("The numerical ID of the desired status.")
                                    @PathParam("id") final int id, @Description("When set to either <tt>true</tt>, <tt>t</tt> or <tt>1</tt>, each tweet returned in a timeline will include a user object including only the status authors numerical ID. Omit this parameter to receive the complete user object.")
                                    @QueryParam("trim_user") final Boolean trim_user) {
        //TODO: implement
        return null;
    }

    @POST
    @Produces("application/json")
    @Path("/filter")
    @ApiVersion({"1.1"})
    @SeeAlso({@See(href = "/docs/streaming-apis/streams/public", value = "Public streams"), @See(href = "/docs/api/streaming", value = "The Streaming APIs")})
    @Description("Returns public statuses that match one or more filter predicates. Multiple parameters may be specified which allows most clients to use a single connection to the Streaming API. Both GET and POST requests are supported, but GET requests with too many parameters may cause the request to be rejected for excessive URL length.")
    public TweetsType postFilter(@Description("A comma separated list of user IDs, indicating the users to return statuses for in the stream. See <a href=\"https://dev.twitter.com/docs/streaming-apis/parameters#follow\">the follow parameter documentation</a> for more information.")
                                 @QueryParam("follow") final String follow, @Description("Keywords to track. Phrases of keywords are specified by a comma-separated list. See <a href=\"https://dev.twitter.com/docs/streaming-apis/parameters#track\">the track parameter documentation</a> for more information.")
                                 @QueryParam("track") final String track, @Description("Specifies a set of bounding boxes to track. See <a href=\"https://dev.twitter.com/docs/streaming-apis/parameters#locations\">the locations parameter documentation</a> for more information.")
                                 @QueryParam("locations") final String locations, @Description("Specifies whether messages should be length-delimited. See <a href=\"https://dev.twitter.com/docs/streaming-apis/parameters#delimited\">the delimited parameter documentation</a> for more information.")
                                 @QueryParam("delimited") final String delimited,
                                 @Description("Specifies whether stall warnings should be delivered. See <a href=\"https://dev.twitter.com/docs/streaming-apis/parameters#stall_warnings\">the stall_warnings parameter documentation</a> for more information.")
                                 @QueryParam("stall_warnings") final String stall_warnings) {
        //TODO: implement
        return null;
    }

    @POST
    @Produces("application/json")
    @Path("/retweet/{id}")
    @Category({"statuses"})
    @ApiVersion({"1.1"})
    @Tag({"Retweets", "Sharing"})
    @Description("Retweets a tweet. Returns the original tweet with retweet details embedded.")
    public TweetsType postRetweetid(@Description("The numerical ID of the desired status.")
                                    @PathParam("id") final int id, @Description("When set to either <tt>true</tt>, <tt>t</tt> or <tt>1</tt>, each tweet returned in a timeline will include a user object including only the status authors numerical ID. Omit this parameter to receive the complete user object.")
                                    @QueryParam("trim_user") final Boolean trim_user) {
        //TODO: implement
        return null;
    }

    @POST
    @Produces("application/json")
    @Path("/update")
    @Category({"statuses"})
    @ApiVersion({"1.1"})
    @Tag({"tweeting"})
    @Description("Updates the authenticating user&#039;s current status, also known as tweeting. To upload an image to accompany the tweet, use POST statuses/update_with_media. For each update attempt, the update text is compared with the authenticating user&#039;s recent tweets. Any attempt that would result in duplication will be blocked, resulting in a 403 error.")
    public TweetsType postUpdate(@Description("The text of your status update, typically up to 140 characters. URL encode as necessary. <a href=\"https://dev.twitter.com/docs/tco-link-wrapper/faq\">t.co link wrapping</a> may effect character counts.")
                                 @PathParam("status") final String status, @Description("The ID of an existing status that the update is in reply to.")
                                 @QueryParam("in_reply_to_status_id") final String in_reply_to_status_id, @Description("The latitude of the location this tweet refers to. This parameter will be ignored unless it is inside the range -90.0 to +90.0 (North is positive) inclusive. It will also be ignored if there isn't a corresponding <tt>long</tt> parameter.")
                                 @QueryParam("lat") final String lat, @Description("The longitude of the location this tweet refers to. The valid ranges for longitude is -180.0 to +180.0 (East is positive) inclusive. This parameter will be ignored if outside that range, if it is not a number, if <tt>geo_enabled</tt> is disabled, or if there not a corresponding <tt>lat</tt> parameter.")
                                 @QueryParam("long") final String long_arg,
                                 @Description("A place in the world. These IDs can be retrieved from <a href=\"https://dev.twitter.com/docs/api/1/get/geo/reverse_geocode\">GET geo/reverse_geocode</a>.")
                                 @QueryParam("place_id") final String place_id, @Description("Whether or not to put a pin on the exact coordinates a tweet has been sent from.")
                                 @QueryParam("display_coordinates") final Boolean display_coordinates, @Description("When set to either <tt>true</tt>, <tt>t</tt> or <tt>1</tt>, each tweet returned in a timeline will include a user object including only the status authors numerical ID. Omit this parameter to receive the complete user object.")
                                 @QueryParam("trim_user") final Boolean trim_user) {
        //TODO: implement
        return null;
    }

    @POST
    @Produces("application/json")
    @Path("/update_with_media")
    @Category({"statuses"})
    @ApiVersion({"1.1"})
    @Tag({"Uploading"})
    @SeeAlso({@See(href = "/docs/uploading-media", value = "Uploading Media"), @See(href="/apirest/twitter/POST/statuses/update", value = "POST statuses/update")})
    @Description("Updates the authenticating user&#039;s current status and attaches media for upload. In other words, it creates a Tweet with a picture attached. Unlike POST statuses/update, this method expects raw multipart data. Your POST request&#039;s Content-Type should be set to multipart/form-data with the media[] parameter .")
    public TweetsType postUpdate_with_media(@Description("The text of your status update. URL encode as necessary. <a href=\"https://dev.twitter.com/docs/tco-link-wrapper/faq\">t.co link wrapping</a> may affect character counts if the post contains URLs. You must additionally account for the <tt>characters_reserved_per_media</tt> per uploaded media, additionally accounting for space characters in between finalized URLs.")
                                            @PathParam("status") final String status, @Description("Up to <tt>max_media_per_upload</tt> files may be specified in the request, each named <tt>media[]</tt>. Supported image formats are PNG, JPG and GIF. Animated GIFs are not supported. This data must be either the raw image bytes or encoded as base64.")
                                            @PathParam("media[]") final String media[], @Description("Set to <tt>true</tt> for content which may not be suitable for every audience.")
                                            @QueryParam("possibly_sensitive") final String possibly_sensitive, @Description("The ID of an existing status that the update is in reply to.")
                                            @QueryParam("in_reply_to_status_id") final String in_reply_to_status_id,
                                            @Description("The latitude of the location this tweet refers to. This parameter will be ignored unless it is inside the range -90.0 to +90.0 (North is positive) inclusive. It will also be ignored if there isn't a corresponding <tt>long</tt> parameter.")
                                            @QueryParam("lat") final String lat, @Description("The longitude of the location this tweet refers to. The valid ranges for longitude is -180.0 to +180.0 (East is positive) inclusive. This parameter will be ignored if outside that range, not a number, <tt>geo_enabled</tt> is disabled, or if there not a corresponding <tt>lat</tt> parameter.")
                                            @QueryParam("long") final String long_arg, @Description("A place in the world identified by a Twitter place ID. Place IDs can be retrieved from geo/reverse_geocode.")
                                            @QueryParam("place_id") final String place_id, @Description("Whether or not to put a pin on the exact coordinates a tweet has been sent from.")
                                            @QueryParam("display_coordinates") final Boolean display_coordinates) {
        //TODO: implement
        return null;
    }

}
