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
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

@Path("/account")
public class AccountResource {

    @GET
    @Produces("application/json")
    @Path("/settings")
    @Category({"account"})
    @ApiVersion({"1.1"})
    @See(href = "/docs/api/1.1/get/account/settings", value = "GET account/settings")
    @ApplicationLimit()
    @UserLimit(rate = @Rate(window = 15, unit = GovernanceUnit.MINUTES, limit = 15))
    @Description("Returns settings (including current trend, geo and sleep time information) for the authenticating user.")
    public Response getSettings() {
        //TODO: implement
        return null;
    }

    @POST
    @Produces("application/json")
    @Path("/settings")
    @Category({"account"})
    @ApiVersion({"1.1"})
    @See(href = "/docs/api/1.1/get/account/settings", value = "GET account/settings")
    @ApplicationLimit()
    @UserLimit(rate = @Rate(window = 15, unit = GovernanceUnit.MINUTES, limit = 15))
    @Description("Returns settings (including current trend, geo and sleep time information) for the authenticating user.")
    public Response postSettings(@Description("The Yahoo! Where On Earth ID to use as the user&apos;s default trend location. Global information is available by using 1 as the WOEID. The woeid must be one of the locations returned by ")
                                 @QueryParam("trend_location_woeid") final Integer trend_location_woeid, @Description("When set to &lt;tt&gt;true&lt;/tt&gt;, &lt;tt&gt;t&lt;/tt&gt; or &lt;tt&gt;1&lt;/tt&gt;, will enable sleep time for the user. Sleep time is the time when push or SMS notifications should not be sent to the user.")
                                 @QueryParam("sleep_time_enabled") final Boolean sleep_time_enabled, @Description("The hour that sleep time should begin if it is enabled. The value for this parameter should be provided in ")
                                 @QueryParam("start_sleep_time") final Integer start_sleep_time, @Description("The hour that sleep time should end if it is enabled. The value for this parameter should be provided in ")
                                 @QueryParam("end_sleep_time") final Integer end_sleep_time,
                                 @Description("The timezone dates and times should be displayed in for the user. The timezone must be one of the ")
                                 @QueryParam("time_zone") final String time_zone, @Description("The language which Twitter should render in for this user. The language must be specified by the appropriate two letter ISO 639-1 representation. Currently supported languages are provided by ")
                                 @QueryParam("lang") final String lang) {
        //TODO: implement
        return null;
    }

    @GET
    @Produces("application/json")
    @Path("/verify_credentials")
    @Category({"account"})
    @ApiVersion({"1.1"})
    @See(href = "/docs/api/1.1/get/account/settings", value = "GET account/settings")
    @ApplicationLimit()
    @UserLimit(rate = @Rate(window = 15, unit = GovernanceUnit.MINUTES, limit = 15))
    @Description("Returns an HTTP 200 OK response code and a representation of the requesting user if authentication was successful; returns a 401 status code and an error message if not. Use this method to test if supplied user credentials are valid.")
    public UsersType getVerify_credentials(@Description("The &lt;tt&gt;entities&lt;/tt&gt; node will not be included when set to &lt;tt&gt;false&lt;/tt&gt;.")
                                           @QueryParam("include_entities") final Boolean include_entities, @Description("When set to either &lt;tt&gt;true&lt;/tt&gt;, &lt;tt&gt;t&lt;/tt&gt; or &lt;tt&gt;1&lt;/tt&gt; statuses will not be included in the returned user objects.")
                                           @QueryParam("skip_status") final Boolean skip_status) {
        //TODO: implement
        return null;
    }

    @POST
    @Produces("application/json")
    @Path("/remove_profile_banner")
    @ApiVersion({"1.1"})
    @SeeAlso({@See(href = "/docs/user-profile-images-and-banners", value = "User Profile Images and Banners"), @See(href = "/docs/api/1.1/post/account/update_profile_banner", value = "POST account/update_profile_banner"), @See(href = "/docs/api/1.1/get/users/profile_banner", value = "GET users/profile_banner")})
    @Description("Removes the uploaded profile banner for the authenticating user. Returns HTTP 200 upon success.")
    public Response postRemove_profile_banner() {
        //TODO: implement
        return null;
    }

    @POST
    @Produces("application/json")
    @Path("/update_delivery_device")
    @Category({"account"})
    @ApiVersion({"1.1"})
    @Description("Sets which device Twitter delivers updates to for the authenticating user. Sending none as the device parameter will disable SMS updates.")
    public Response postUpdate_delivery_device(@Description("Must be one of: &lt;tt&gt;sms&lt;/tt&gt;, &lt;tt&gt;none&lt;/tt&gt;.")
                                               @PathParam("device") final String device, @Description("When set to either &lt;tt&gt;true&lt;/tt&gt;, &lt;tt&gt;t&lt;/tt&gt; or &lt;tt&gt;1&lt;/tt&gt;, each tweet will include a node called &quot;entities,&quot;. This node offers a variety of metadata about the tweet in a discreet structure, including: user_mentions, urls, and hashtags. While entities are opt-in on timelines at present, they will be made a default component of output in the future. See &lt;strong&gt;&lt;u&gt;&lt;a href=&quot;/pages/tweet_entities&quot;&gt;Tweet Entities&lt;/a&gt;&lt;/u&gt;&lt;/strong&gt; for more detail on entities.")
                                               @QueryParam("include_entities") final Boolean include_entities) {
        //TODO: implement
        return null;
    }

    @POST
    @Produces("application/json")
    @Path("/update_profile")
    @Category({"account"})
    @ApiVersion({"1.1"})
    @Description("Sets values that users are able to set under the &amp;quot;Account&amp;quot; tab of their settings page. Only the parameters specified will be updated.")
    public Response postUpdate_profile(@Description("Full name associated with the profile. Maximum of 20 characters.")
                                       @QueryParam("name") final String name, @Description("URL associated with the profile. Will be prepended with &quot;http://&quot; if not present. Maximum of 100 characters.")
                                       @QueryParam("url") final String url, @Description("The city or country describing where the user of the account is located. The contents are not normalized or geocoded in any way. Maximum of 30 characters.")
                                       @QueryParam("location") final String location, @Description("A description of the user owning the account. Maximum of 160 characters.")
                                       @QueryParam("description") final String description,
                                       @Description("The &lt;tt&gt;entities&lt;/tt&gt; node will not be included when set to &lt;tt&gt;false&lt;/tt&gt;.")
                                       @QueryParam("include_entities") final Boolean include_entities, @Description("When set to either &lt;tt&gt;true&lt;/tt&gt;, &lt;tt&gt;t&lt;/tt&gt; or &lt;tt&gt;1&lt;/tt&gt; statuses will not be included in the returned user objects.")
                                       @QueryParam("skip_status") final String skip_status) {
        //TODO: implement
        return null;
    }

    @POST
    @Produces("application/json")
    @Path("/update_profile_background_image")
    @Category({"account"})
    @ApiVersion({"1.1"})
    @Description("Updates the authenticating user&amp;#039;s profile background image. This method can also be used to enable or disable the profile background image. Although each parameter is marked as optional, at least one of image, tile or use must be provided when making this request.")
    public Response postUpdate_profile_background_image(@Description("The background image for the profile, base64-encoded. Must be a valid GIF, JPG, or PNG image of less than 800 kilobytes in size. Images with width larger than 2048 pixels will be forcibly scaled down. The image must be provided as raw multipart data, not a URL.")
                                                        @QueryParam("image") final String image, @Description("Whether or not to tile the background image. If set to &lt;tt&gt;true&lt;/tt&gt;, &lt;tt&gt;t&lt;/tt&gt; or &lt;tt&gt;1&lt;/tt&gt; the background image will be displayed tiled. The image will not be tiled otherwise.")
                                                        @QueryParam("tile") final String tile, @Description("The &lt;tt&gt;entities&lt;/tt&gt; node will not be included when set to &lt;tt&gt;false&lt;/tt&gt;.")
                                                        @QueryParam("include_entities") final Boolean include_entities, @Description("When set to either &lt;tt&gt;true&lt;/tt&gt;, &lt;tt&gt;t&lt;/tt&gt; or &lt;tt&gt;1&lt;/tt&gt; statuses will not be included in the returned user objects.")
                                                        @QueryParam("skip_status") final String skip_status,
                                                        @Description("Determines whether to display the profile background image or not. When set to ")
                                                        @QueryParam("use") final String use) {
        //TODO: implement
        return null;
    }

    @POST
    @Produces("application/json")
    @Path("/update_profile_banner")
    @ApiVersion({"1.1"})
    @Tag({"profile banner", "profiles"})
    @SeeAlso({@See(href = "/docs/api/1.1/post/account/remove_profile_banner", value = "POST account/remove_profile_banner"), @See(href = "/docs/api/1.1/post/account/update_profile_background_image", value = "POST account/update_profile_background_image"), @See(href = "/docs/user-profile-images-and-banners", value = "User Profile Images and Banners")})
    @Description("Uploads a profile banner on behalf of the authenticating user. For best results, upload an")
    public Response postUpdate_profile_banner(@Description("The Base64-encoded or raw image data being uploaded as the user&apos;s new profile banner.")
                                              @PathParam("banner") final String banner, @Description("The width of the preferred section of the image being uploaded in pixels. Use with ")
                                              @QueryParam("width") final String width, @Description("The height of the preferred section of the image being uploaded in pixels. Use with ")
                                              @QueryParam("height") final String height, @Description("The number of pixels by which to offset the uploaded image from the left. Use with ")
                                              @QueryParam("offset_left") final String offset_left,
                                              @Description("The number of pixels by which to offset the uploaded image from the top. Use with ")
                                              @QueryParam("offset_top") final String offset_top) {
        //TODO: implement
        return null;
    }

    @POST
    @Produces("application/json")
    @Path("/update_profile_colors")
    @Category({"account"})
    @ApiVersion({"1.1"})
    @Description("Sets one or more hex values that control the color scheme of the authenticating user")
    public Response postUpdate_profile_colors(@Description("Profile background color.")
                                              @QueryParam("profile_background_color") final String profile_background_color, @Description("Profile link color.")
                                              @QueryParam("profile_link_color") final String profile_link_color, @Description("Profile sidebar&apos;s border color.")
                                              @QueryParam("profile_sidebar_border_color") final String profile_sidebar_border_color, @Description("Profile sidebar&apos;s background color.")
                                              @QueryParam("profile_sidebar_fill_color") final String profile_sidebar_fill_color,
                                              @Description("Profile text color.")
                                              @QueryParam("profile_text_color") final Integer profile_text_color, @Description("The &lt;tt&gt;entities&lt;/tt&gt; node will not be included when set to &lt;tt&gt;false&lt;/tt&gt;.")
                                              @QueryParam("include_entities") final Boolean include_entities, @Description("When set to either &lt;tt&gt;true&lt;/tt&gt;, &lt;tt&gt;t&lt;/tt&gt; or &lt;tt&gt;1&lt;/tt&gt; statuses will not be included in the returned user objects.")
                                              @QueryParam("skip_status") final String skip_status) {
        //TODO: implement
        return null;
    }

    @POST
    @Produces("application/json")
    @Path("/update_profile_image")
    @Category({"account"})
    @ApiVersion({"1.1"})
    @SeeAlso({@See(href = "/docs/user-profile-images-and-banners", value = "User Profile Images and Banners"), @See(href = "/docs/api/1.1/get/users/lookup", value = "GET users/lookup")})
    @Description("Updates the authenticating user&amp;#039;s profile image. Note that this method expects raw multipart data, not a URL to an image. This method asynchronously processes the uploaded file before updating the user&amp;#039;s profile image URL.")
    public Response postUpdate_profile_image(@Description("The avatar image for the profile, base64-encoded. Must be a valid GIF, JPG, or PNG image of less than 700 k")
                                             @PathParam("image") final String image, @Description("The &lt;tt&gt;entities&lt;/tt&gt; node will not be included when set to &lt;tt&gt;false&lt;/tt&gt;.")
                                             @QueryParam("include_entities") final Boolean include_entities, @Description("When set to either &lt;tt&gt;true&lt;/tt&gt;, &lt;tt&gt;t&lt;/tt&gt; or &lt;tt&gt;1&lt;/tt&gt; statuses will not be included in the returned user objects.")
                                             @QueryParam("skip_status") final String skip_status) {
        //TODO: implement
        return null;
    }

}