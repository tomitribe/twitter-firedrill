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
import com.twitter.dev.api.UsersType;

@Path("/statuses")
public class StatusesResource {

    @GET
    @Produces("application/json")
    @Path("/firehose")
    @ApiVersion({"1.1"})
    @SeeAlso({@See(href = "/docs/streaming-apis/streams/public", value="Public streams"),@See(href = "/docs/api/streaming", value="The Streaming APIs")})
    @Description("This endpoint requires special permission to access. Returns all public statuses. Few applications require this level of access. Creative use of a combination of other resources and various access levels can satisfy nearly every application use case.")
    public TweetsType getFirehose(@Description("The number of messages to backfill. See &lt;a href=&quot;https://dev.twitter.com/docs/streaming-apis/parameters#count&quot;&gt;the count parameter documentation&lt;/a&gt; for more information.")
     @QueryParam("count") final Integer count, @Description("Specifies whether messages should be length-delimited. See &lt;a href=&quot;https://dev.twitter.com/docs/streaming-apis/parameters#delimited&quot;&gt;the delimited parameter documentation&lt;/a&gt; for more information.")
     @QueryParam("delimited") final String delimited, @Description("Specifies whether stall warnings should be delivered. See &lt;a href=&quot;https://dev.twitter.com/docs/streaming-apis/parameters#stall_warnings&quot;&gt;the stall_warnings parameter documentation&lt;/a&gt; for more information.")
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
    @See(href = "/docs/api/1.1/get/statuses/user_timeline", value="GET statuses/user_timeline")
    @ApplicationLimit()@UserLimit(rate = @Rate(window = 15, unit = GovernanceUnit.MINUTES, limit = 15))@Description("Returns a collection of the most recent Tweets and retweets posted by the authenticating user and the users they follow. The home timeline is central to how most users interact with the Twitter service.")
    public TweetsType getHome_timeline(@Description("Specifies the number of records to retrieve. Must be less than or equal to 200. Defaults to 20.")
     @QueryParam("count") final Integer count, @Description("Returns results with an ID greater than (that is, more recent than) the specified ID. There are limits to the number of Tweets which can be access")
     @QueryParam("since_id") final Integer since_id, @Description("Returns results with an ID less than (that is, older than) or equal to the specified ID.")
     @QueryParam("max_id") final Integer max_id, @Description("When set to either &lt;tt&gt;true&lt;/tt&gt;, &lt;tt&gt;t&lt;/tt&gt; or &lt;tt&gt;1&lt;/tt&gt;, each tweet returned in a timeline will include a user object including only the status authors numerical ID. Omit this parameter to receive the complete user object.")
     @QueryParam("trim_user") final Boolean trim_user, 
                @Description("This parameter will prevent replies from appearing in the returned timeline. Using ")
     @QueryParam("exclude_replies") final Boolean exclude_replies, @Description("This parameter enhances the contributors element of the status response to include the screen_name of the contributor. By default only the user_id of the contributor is included.")
     @QueryParam("contributor_details") final Boolean contributor_details, @Description("The &lt;tt&gt;entities&lt;/tt&gt; node will be disincluded when set to &lt;tt&gt;false&lt;/tt&gt;.")
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
    @SeeAlso({@See(href = "/docs/api/1.1/get/statuses/home_timeline", value="GET statuses/home_timeline"),@See(href = "/docs/api/1.1/get/statuses/user_timeline", value="GET statuses/user_timeline")})
    @ApplicationLimit()@UserLimit(rate = @Rate(window = 15, unit = GovernanceUnit.MINUTES, limit = 15))@Description("Returns the 20 most recent mentions (tweets containing a users&amp;#039;s @screen_name) for the authenticating user. The timeline returned is the equivalent of the one seen when you view your mentions on twitter.com. This method can only return up to 800 tweets. See Working with Timelines for instructions on traversing timelines.")
    public TweetsType getMentions_timeline(@Description("Specifies the number of tweets to try and retrieve, up to a maximum of 200. The value of ")
     @QueryParam("count") final Integer count, @Description("Returns results with an ID greater than (that is, more recent than) the specified ID. There are limits to the number of Tweets which can be accessed through the API. If the limit of Tweets has occured since the since_id, the since_id will be forced to the oldest ID available.")
     @QueryParam("since_id") final Integer since_id, @Description("Returns results with an ID less than (that is, older than) or equal to the specif")
     @QueryParam("max_id") final Integer max_id, @Description("When set to either &lt;tt&gt;true&lt;/tt&gt;, &lt;tt&gt;t&lt;/tt&gt; or &lt;tt&gt;1&lt;/tt&gt;, each tweet returned in a timeline will include a user object including only the status authors numerical ID. Omit this parameter to receive the complete user object.")
     @QueryParam("trim_user") final Boolean trim_user, 
                @Description("This parameter enhances the contributors element of the status response to include the screen_name of the contributor. By default only the user_id of the contributor is included.")
     @QueryParam("contributor_details") final Boolean contributor_details, @Description("The &lt;tt&gt;entities&lt;/tt&gt; node will be disincluded when set to &lt;tt&gt;false&lt;/tt&gt;.")
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
    @See(href = "/docs/embedded-tweets", value="Embedded Tweets")
    @ApplicationLimit(rate = @Rate(window = 15, unit = GovernanceUnit.MINUTES, limit = 180))@UserLimit(rate = @Rate(window = 15, unit = GovernanceUnit.MINUTES, limit = 180))@Description("Returns information allowing the creation of an embedded representation of a Tweet on third party sites. See the oEmbed specification for information about the response format.")
    public TweetsType getOembed(@Description("The Tweet/status ID to return embed code for.")
     @PathParam("id") final String id, @Description("The URL of the Tweet/status to be embedded.")
     @PathParam("url") final String url, @Description("The maximum width in pixels that the embed should be rendered at. This value is constrained to be between ")
     @QueryParam("maxwidth") final Integer maxwidth, @Description("Specifies whether the embedded Tweet should automatically expand images which were uploaded via ")
     @QueryParam("hide_media") final Boolean hide_media, 
                @Description("Specifies whether the embedded Tweet should automatically show the original message in the case that the embedded Tweet is a reply. When set to either ")
     @QueryParam("hide_thread") final Boolean hide_thread, @Description("Specifies whether the embedded Tweet HTML should include a &amp;lt;script&amp;gt; element pointing to &lt;tt&gt;widgets.js&lt;/tt&gt;. In cases where a page already includes &lt;tt&gt;widgets.js&lt;/tt&gt;, setting this value to true will prevent a redundant script element from being included. When set to either &lt;tt&gt;true&lt;/tt&gt;, &lt;tt&gt;t&lt;/tt&gt; or &lt;tt&gt;1&lt;/tt&gt; the &amp;lt;script&amp;gt; element will not be included in the embed HTML, meaning that pages must include a reference to &lt;tt&gt;widgets.js&lt;/tt&gt; manually. Defaults to false.")
     @QueryParam("omit_script") final Boolean omit_script, @Description("Specifies whether the embedded Tweet should be left aligned, right aligned, or centered in the page. Valid values are ")
     @QueryParam("align") final String align, @Description("A value for the TWT &lt;tt&gt;related&lt;/tt&gt; parameter, as described in &lt;a href=&quot;https://dev.twitter.com/docs/intents&quot;&gt;Web Intents&lt;/a&gt;. This value will be forwarded to all Web Intents calls.")
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
    @See(href = "/docs/api/1.1/get/statuses/retweets/%3Aid", value="GET statuses/retweets/:id")
    @ApplicationLimit(rate = @Rate(window = 15, unit = GovernanceUnit.MINUTES, limit = 60))@UserLimit(rate = @Rate(window = 15, unit = GovernanceUnit.MINUTES, limit = 15))@Description("Returns a collection of up to 100 user IDs belonging to users who have retweeted the tweet specified by the id parameter. This method offers similar data to GET statuses/retweets/:id and replaces API v1")
    public UsersType getRetweetersids(@Description("The numerical ID of the desired status.")
     @PathParam("id") final String id, @Description("Causes the list of IDs to be broken into pages of no more than 100 IDs at a time. The number of IDs returned is not guaranteed to be 100 as suspended users are filtered out after connections are queried. If no cursor is provided, a value of ")
     @QueryParam("cursor") final String cursor, @Description("Many programming environments will not consume our ids due to their size. Provide this option to have ids returned as strings instead. Read more about ")
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
    @ApplicationLimit(rate = @Rate(window = 15, unit = GovernanceUnit.MINUTES, limit = 60))@UserLimit(rate = @Rate(window = 15, unit = GovernanceUnit.MINUTES, limit = 15))@Description("Returns a collection of the 100 most recent retweets of the tweet specified by the id parameter.")
    public TweetsType getRetweetsid(@Description("The numerical ID of the desired status.")
     @PathParam("id") final int id, @Description("Specifies the number of records to retrieve. Must be less than or equal to 100.")
     @QueryParam("count") final Integer count, @Description("When set to either &lt;tt&gt;true&lt;/tt&gt;, &lt;tt&gt;t&lt;/tt&gt; or &lt;tt&gt;1&lt;/tt&gt;, each tweet returned in a timeline will include a user object including only the status authors numerical ID. Omit this parameter to receive the complete user object.")
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
    @SeeAlso({@See(href = "/docs/api/1.1/get/statuses/mentions_timeline", value="GET statuses/mentions_timeline"),@See(href = "/docs/api/1.1/get/statuses/user_timeline", value="GET statuses/user_timeline"),@See(href = "/docs/working-with-timelines", value="Working with Timelines")})
    @ApplicationLimit()@UserLimit(rate = @Rate(window = 15, unit = GovernanceUnit.MINUTES, limit = 15))@Description("Returns the most recent tweets authored by the authenticating user that have been retweeted by others. This timeline is a subset of the user")
    public TweetsType getRetweets_of_me(@Description("Specifies the number of records to retrieve. Must be less than or equal to 100. If omitted, 20 will be assumed.")
     @QueryParam("count") final Integer count, @Description("Returns results with an ID greater than (that is, more recent than) the specified ID. There are limits to the number of Tweets which can be accessed through the API. If the limit of Tweets has occured since the since_id, the since_id will be forced to the oldest ID available.")
     @QueryParam("since_id") final Integer since_id, @Description("Returns results with an ID less than (that is, older than) or equal to the specified ID.")
     @QueryParam("max_id") final Integer max_id, @Description("When set to either &lt;tt&gt;true&lt;/tt&gt;, &lt;tt&gt;t&lt;/tt&gt; or &lt;tt&gt;1&lt;/tt&gt;, each tweet returned in a timeline will include a user object including only the status authors numerical ID. Omit this parameter to receive the complete user object.")
     @QueryParam("trim_user") final Boolean trim_user, 
                @Description("The tweet &lt;tt&gt;entities&lt;/tt&gt; node will be disincluded when set to &lt;tt&gt;false&lt;/tt&gt;.")
     @QueryParam("include_entities") final Boolean include_entities, @Description("The user &lt;tt&gt;entities&lt;/tt&gt; node will be disincluded when set to &lt;tt&gt;false&lt;/tt&gt;.")
     @QueryParam("include_user_entities") final Boolean include_user_entities) {
        //TODO: implement
        return null;
    }

    @GET
    @Produces("application/json")
    @Path("/sample")
    @ApiVersion({"1.1"})
    @SeeAlso({@See(href = "/docs/streaming-apis/streams/public", value="Public streams"),@See(href = "/docs/api/streaming", value="The Streaming APIs")})
    @Description("Returns a small random sample of all public statuses. The Tweets returned by the default access level are the same, so if two different clients connect to this endpoint, they will see the same Tweets.")
    public TweetsType getSample(@Description("Specifies whether messages should be length-delimited. See &lt;a href=&quot;https://dev.twitter.com/docs/streaming-apis/parameters#delimited&quot;&gt;the delimited parameter documentation&lt;/a&gt; for more information.")
     @QueryParam("delimited") final String delimited, @Description("Specifies whether stall warnings should be delivered. See &lt;a href=&quot;https://dev.twitter.com/docs/streaming-apis/parameters#stall_warnings&quot;&gt;the stall_warnings parameter documentation&lt;/a&gt; for more information.")
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
    @ApplicationLimit(rate = @Rate(window = 15, unit = GovernanceUnit.MINUTES, limit = 180))@UserLimit(rate = @Rate(window = 15, unit = GovernanceUnit.MINUTES, limit = 180))@Description("Returns a single Tweet, specified by the id parameter. The Tweet")
    public TweetsType getShowid(@Description("The numerical ID of the desired Tweet.")
     @PathParam("id") final int id, @Description("When set to either &lt;tt&gt;true&lt;/tt&gt;, &lt;tt&gt;t&lt;/tt&gt; or &lt;tt&gt;1&lt;/tt&gt;, each tweet returned in a timeline will include a user object including only the status authors numerical ID. Omit this parameter to receive the complete user object.")
     @QueryParam("trim_user") final Boolean trim_user, @Description("When set to either &lt;tt&gt;true&lt;/tt&gt;, &lt;tt&gt;t&lt;/tt&gt; or &lt;tt&gt;1&lt;/tt&gt;, any Tweets returned that have been retweeted by the authenticating user will include an additional &lt;tt&gt;current_user_retweet&lt;/tt&gt; node, containing the ID of the source status for the retweet.")
     @QueryParam("include_my_retweet") final Boolean include_my_retweet, @Description("The &lt;tt&gt;entities&lt;/tt&gt; node will be disincluded when set to &lt;tt&gt;false&lt;/tt&gt;.")
     @QueryParam("include_entities") final Boolean include_entities) {
        //TODO: implement
        return null;
    }

    @GET
    @Produces("application/json")
    @Path("/user_timeline")
    @Category({"statuses"})
    @ApiVersion({"1.1"})
    @SeeAlso({@See(href = "/docs/api/1.1/get/statuses/home_timeline", value="GET statuses/home_timeline"),@See(href = "/docs/api/1.1/get/lists/statuses", value="GET lists/statuses"),@See(href = "/docs/working-with-timelines", value="Working with Timelines"),@See(href = "/docs/embedded-timelines", value="Embedded Timelines"),@See(href = "/docs/embedded-tweets", value="Embedded Tweets")})
    @ApplicationLimit(rate = @Rate(window = 15, unit = GovernanceUnit.MINUTES, limit = 300))@UserLimit(rate = @Rate(window = 15, unit = GovernanceUnit.MINUTES, limit = 180))@Description("Returns a collection of the most recent Tweets posted by the user indicated by the screen_name or user_id parameters.")
    public TweetsType getUser_timeline(@Description("The ID of the user for whom to return results for.")
     @QueryParam("user_id") final Integer user_id, @Description("The screen name of the user for whom to return results for.")
     @QueryParam("screen_name") final String screen_name, @Description("Returns results with an ID greater than (that is, more recent than) the specified ID. There are limits to the number of Tweets which can be accessed through the API. If the limit of Tweets has occured since the since_id, the since_id will be forced to the oldest ID available.")
     @QueryParam("since_id") final Integer since_id, @Description("Specifies the number of tweets to try and retrieve, up to a maximum of 200 per distinct request. The value of ")
     @QueryParam("count") final Integer count, 
                @Description("Returns results with an ID less than (that is, older than) or equal to the specified ID.")
     @QueryParam("max_id") final Integer max_id, @Description("When set to either &lt;tt&gt;true&lt;/tt&gt;, &lt;tt&gt;t&lt;/tt&gt; or &lt;tt&gt;1&lt;/tt&gt;, each tweet returned in a timeline will include a user object including only the status authors numerical ID. Omit this parameter to receive the complete user object.")
     @QueryParam("trim_user") final Boolean trim_user, @Description("This parameter will prevent replies from appearing in the returned timeline. Using ")
     @QueryParam("exclude_replies") final Boolean exclude_replies, @Description("This parameter enhances the contributors element of the status response to include the screen_name of the contributor. By default only the user_id of the contributor is included.")
     @QueryParam("contributor_details") final Boolean contributor_details, 
                @Description("When set to &lt;tt&gt;false&lt;/tt&gt;, the timeline will strip any native retweets (though they will still count toward both the maximal length of the timeline and the slice selected by the count parameter). Note: If you&apos;re using the trim_user parameter in conjunction with include_rts, the retweets will still contain a full user object.")
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
     @PathParam("id") final int id, @Description("When set to either &lt;tt&gt;true&lt;/tt&gt;, &lt;tt&gt;t&lt;/tt&gt; or &lt;tt&gt;1&lt;/tt&gt;, each tweet returned in a timeline will include a user object including only the status authors numerical ID. Omit this parameter to receive the complete user object.")
     @QueryParam("trim_user") final Boolean trim_user) {
        //TODO: implement
        return null;
    }

    @POST
    @Produces("application/json")
    @Path("/filter")
    @ApiVersion({"1.1"})
    @SeeAlso({@See(href = "/docs/streaming-apis/streams/public", value="Public streams"),@See(href = "/docs/api/streaming", value="The Streaming APIs")})
    @Description("Returns public statuses that match one or more filter predicates. Multiple parameters may be specified which allows most clients to use a single connection to the Streaming API. Both GET and POST requests are supported, but GET requests with too many parameters may cause the request to be rejected for excessive URL length.")
    public TweetsType postFilter(@Description("A comma separated list of user IDs, indicating the users to return statuses for in the stream. See ")
     @QueryParam("follow") final String follow, @Description("Keywords to track. Phrases of keywords are specified by a comma-separated list. See ")
     @QueryParam("track") final String track, @Description("Specifies a set of bounding boxes to track. See &lt;a href=&quot;https://dev.twitter.com/docs/streaming-apis/parameters#locations&quot;&gt;the locations parameter documentation&lt;/a&gt; for more information.")
     @QueryParam("locations") final String locations, @Description("Specifies whether messages should be length-delimited. See &lt;a href=&quot;https://dev.twitter.com/docs/streaming-apis/parameters#delimited&quot;&gt;the delimited parameter documentation&lt;/a&gt; for more information.")
     @QueryParam("delimited") final String delimited, 
                @Description("Specifies whether stall warnings should be delivered. See &lt;a href=&quot;https://dev.twitter.com/docs/streaming-apis/parameters#stall_warnings&quot;&gt;the stall_warnings parameter documentation&lt;/a&gt; for more information.")
     @QueryParam("stall_warnings") final String stall_warnings) {
        //TODO: implement
        return null;
    }

    @POST
    @Produces("application/json")
    @Path("/retweet/{id}")
    @Category({"statuses"})
    @ApiVersion({"1.1"})
    @Tag({"Retweets","Sharing"})
    @Description("Retweets a tweet. Returns the original tweet with retweet details embedded.")
    public TweetsType postRetweetid(@Description("The numerical ID of the desired status.")
     @PathParam("id") final int id, @Description("When set to either &lt;tt&gt;true&lt;/tt&gt;, &lt;tt&gt;t&lt;/tt&gt; or &lt;tt&gt;1&lt;/tt&gt;, each tweet returned in a timeline will include a user object including only the status authors numerical ID. Omit this parameter to receive the complete user object.")
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
    @Description("Updates the authenticating user&amp;#039;s current status, also known as tweeting. To upload an image to accompany the tweet, use POST statuses/update_with_media. For each update attempt, the update text is compared with the authenticating user&amp;#039;s recent tweets. Any attempt that would result in duplication will be blocked, resulting in a 403 error.")
    public TweetsType postUpdate(@Description("The text of your status update, typically up to 140 characters. URL encode as necessary. ")
     @PathParam("status") final String status, @Description("The ID of an existing status that the update is in reply to.")
     @QueryParam("in_reply_to_status_id") final String in_reply_to_status_id, @Description("The latitude of the location this tweet refers to. This parameter will be ignored unless it is inside the range -90.0 to +90.0 (North is positive) inclusive. It will also be ignored if there isn&apos;t a corresponding ")
     @QueryParam("lat") final String lat, @Description("The longitude of the location this tweet refers to. The valid ranges for longitude is -180.0 to +180.0 (East is positive) inclusive. This parameter will be ignored if outside that range, if it is not a number, if ")
     @QueryParam("long") final String long_arg, 
                @Description("A place in the world. These IDs can be retrieved from &lt;a href=&quot;https://dev.twitter.com/docs/api/1/get/geo/reverse_geocode&quot;&gt;GET geo/reverse_geocode&lt;/a&gt;.")
     @QueryParam("place_id") final String place_id, @Description("Whether or not to put a pin on the exact coordinates a tweet has been sent from.")
     @QueryParam("display_coordinates") final Boolean display_coordinates, @Description("When set to either &lt;tt&gt;true&lt;/tt&gt;, &lt;tt&gt;t&lt;/tt&gt; or &lt;tt&gt;1&lt;/tt&gt;, each tweet returned in a timeline will include a user object including only the status authors numerical ID. Omit this parameter to receive the complete user object.")
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
    @SeeAlso({@See(href = "/docs/uploading-media", value="Uploading Media"),@See(href = "/docs/api/1.1/post/statuses/update", value="POST statuses/update")})
    @Description("Updates the authenticating user&amp;#039;s current status and attaches media for upload. In other words, it creates a Tweet with a picture attached. Unlike POST statuses/update, this method expects raw multipart data. Your POST request&amp;#039;s Content-Type should be set to multipart/form-data with the media[] parameter .")
    public TweetsType postUpdate_with_media(@Description("The text of your status update. URL encode as necessary. &lt;a href=&quot;https://dev.twitter.com/docs/tco-link-wrapper/faq&quot;&gt;t.co link wrapping&lt;/a&gt; may affect character counts if the post contains URLs. You must additionally account for the &lt;tt&gt;characters_reserved_per_media&lt;/tt&gt; per uploaded media, additionally accounting for space characters in between finalized URLs.")
     @PathParam("status") final String status, @Description("Up to &lt;tt&gt;max_media_per_upload&lt;/tt&gt; files may be specified in the request, each named &lt;tt&gt;media[]&lt;/tt&gt;. Supported image formats are PNG, JPG and GIF. Animated GIFs are not supported. This data must be either the raw image bytes or encoded as base64.")
     @PathParam("media[]") final String media[], @Description("Set to &lt;tt&gt;true&lt;/tt&gt; for content which may not be suitable for every audience.")
     @QueryParam("possibly_sensitive") final String possibly_sensitive, @Description("The ID of an existing status that the update is in reply to.")
     @QueryParam("in_reply_to_status_id") final String in_reply_to_status_id, 
                @Description("The latitude of the location this tweet refers to. This parameter will be ignored unless it is inside the range -90.0 to +90.0 (North is positive) inclusive. It will also be ignored if there isn&apos;t a corresponding ")
     @QueryParam("lat") final String lat, @Description("The longitude of the location this tweet refers to. The valid ranges for longitude is -180.0 to +180.0 (East is positive) inclusive. This parameter will be ignored if outside that range, not a number, ")
     @QueryParam("long") final String long_arg, @Description("A place in the world identified by a Twitter place ID. Place IDs can be retrieved from geo/reverse_geocode.")
     @QueryParam("place_id") final String place_id, @Description("Whether or not to put a pin on the exact coordinates a tweet has been sent from.")
     @QueryParam("display_coordinates") final Boolean display_coordinates) {
        //TODO: implement
        return null;
    }

}