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
    @See(href="endpoint/twitter/GET/account/settings", value = "GET account/settings")
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
    @See(href="endpoint/twitter/GET/account/settings", value = "GET account/settings")
    @UserLimit(rate = @Rate(window = 15, unit = GovernanceUnit.MINUTES, limit = 15))
    @Description("Returns settings (including current trend, geo and sleep time information) for the authenticating user.")
    public Response postSettings(@Description("The Yahoo! Where On Earth ID to use as the user's default trend location. Global information is available by using 1 as the WOEID. The woeid must be one of the locations returned by <a href=\"https://dev.twitter.com/docs/api/1/get/trends/available\">GET trends/available</a>.")
                                 @QueryParam("trend_location_woeid") final Integer trend_location_woeid, @Description("When set to <tt>true</tt>, <tt>t</tt> or <tt>1</tt>, will enable sleep time for the user. Sleep time is the time when push or SMS notifications should not be sent to the user.")
                                 @QueryParam("sleep_time_enabled") final Boolean sleep_time_enabled, @Description("The hour that sleep time should begin if it is enabled. The value for this parameter should be provided in <a href=\"http://en.wikipedia.org/wiki/ISO_8601\" target=\"_blank\">ISO8601</a> format (i.e. 00-23). The time is considered to be in the same timezone as the user's <tt>time_zone</tt> setting.")
                                 @QueryParam("start_sleep_time") final Integer start_sleep_time, @Description("The hour that sleep time should end if it is enabled. The value for this parameter should be provided in <a href=\"http://en.wikipedia.org/wiki/ISO_8601\" target=\"_blank\">ISO8601</a> format (i.e. 00-23). The time is considered to be in the same timezone as the user's <tt>time_zone</tt> setting.")
                                 @QueryParam("end_sleep_time") final Integer end_sleep_time,
                                 @Description("The timezone dates and times should be displayed in for the user. The timezone must be one of the <a target=\"_blank\" href=\"http://api.rubyonrails.org/classes/ActiveSupport/TimeZone.html\">Rails TimeZone</a> names.")
                                 @QueryParam("time_zone") final String time_zone, @Description("The language which Twitter should render in for this user. The language must be specified by the appropriate two letter ISO 639-1 representation. Currently supported languages are provided by <a href=\"https://dev.twitter.com/docs/api/1/get/help/languages\">GET help/languages</a>. ")
                                 @QueryParam("lang") final String lang) {
        //TODO: implement
        return null;
    }

    @GET
    @Produces("application/json")
    @Path("/verify_credentials")
    @Category({"account"})
    @ApiVersion({"1.1"})
    @See(href="endpoint/twitter/GET/account/settings", value = "GET account/settings")
    @UserLimit(rate = @Rate(window = 15, unit = GovernanceUnit.MINUTES, limit = 15))
    @Description("Returns an HTTP 200 OK response code and a representation of the requesting user if authentication was successful; returns a 401 status code and an error message if not. Use this method to test if supplied user credentials are valid.")
    public UsersType getVerify_credentials(@Description("The <tt>entities</tt> node will not be included when set to <tt>false</tt>.")
                                           @QueryParam("include_entities") final Boolean include_entities, @Description("When set to either <tt>true</tt>, <tt>t</tt> or <tt>1</tt> statuses will not be included in the returned user objects.")
                                           @QueryParam("skip_status") final Boolean skip_status) {
        //TODO: implement
        return null;
    }

    @POST
    @Produces("application/json")
    @Path("/remove_profile_banner")
    @ApiVersion({"1.1"})
    @SeeAlso({
            @See(href="endpoint/twitter/POST/account/update_profile_banner", value = "POST account/update_profile_banner"),
            @See(href="endpoint/twitter/GET/users/profile_banner", value = "GET users/profile_banner")})
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
    public Response postUpdate_delivery_device(@Description("Must be one of: <tt>sms</tt>, <tt>none</tt>.")
                                               @PathParam("device") final String device, @Description("When set to either <tt>true</tt>, <tt>t</tt> or <tt>1</tt>, each tweet will include a node called \"entities,\". This node offers a variety of metadata about the tweet in a discreet structure, including: user_mentions, urls, and hashtags. While entities are opt-in on timelines at present, they will be made a default component of output in the future. See <strong><u><a href=\"/pages/tweet_entities\">Tweet Entities</a></u></strong> for more detail on entities.")
                                               @QueryParam("include_entities") final Boolean include_entities) {
        //TODO: implement
        return null;
    }

    @POST
    @Produces("application/json")
    @Path("/update_profile")
    @Category({"account"})
    @ApiVersion({"1.1"})
    @Description("Sets values that users are able to set under the &quot;Account&quot; tab of their settings page. Only the parameters specified will be updated.")
    public Response postUpdate_profile(@Description("Full name associated with the profile. Maximum of 20 characters.")
                                       @QueryParam("name") final String name, @Description("URL associated with the profile. Will be prepended with \"http://\" if not present. Maximum of 100 characters.")
                                       @QueryParam("url") final String url, @Description("The city or country describing where the user of the account is located. The contents are not normalized or geocoded in any way. Maximum of 30 characters.")
                                       @QueryParam("location") final String location, @Description("A description of the user owning the account. Maximum of 160 characters.")
                                       @QueryParam("description") final String description,
                                       @Description("The <tt>entities</tt> node will not be included when set to <tt>false</tt>.")
                                       @QueryParam("include_entities") final Boolean include_entities, @Description("When set to either <tt>true</tt>, <tt>t</tt> or <tt>1</tt> statuses will not be included in the returned user objects.")
                                       @QueryParam("skip_status") final String skip_status) {
        //TODO: implement
        return null;
    }

    @POST
    @Produces("application/json")
    @Path("/update_profile_background_image")
    @Category({"account"})
    @ApiVersion({"1.1"})
    @Description("Updates the authenticating user&#039;s profile background image. This method can also be used to enable or disable the profile background image. Although each parameter is marked as optional, at least one of image, tile or use must be provided when making this request.")
    public Response postUpdate_profile_background_image(@Description("The background image for the profile, base64-encoded. Must be a valid GIF, JPG, or PNG image of less than 800 kilobytes in size. Images with width larger than 2048 pixels will be forcibly scaled down. The image must be provided as raw multipart data, not a URL.")
                                                        @QueryParam("image") final String image, @Description("Whether or not to tile the background image. If set to <tt>true</tt>, <tt>t</tt> or <tt>1</tt> the background image will be displayed tiled. The image will not be tiled otherwise.")
                                                        @QueryParam("tile") final String tile, @Description("The <tt>entities</tt> node will not be included when set to <tt>false</tt>.")
                                                        @QueryParam("include_entities") final Boolean include_entities, @Description("When set to either <tt>true</tt>, <tt>t</tt> or <tt>1</tt> statuses will not be included in the returned user objects.")
                                                        @QueryParam("skip_status") final String skip_status,
                                                        @Description("Determines whether to display the profile background image or not. When set to <tt>true</tt>, <tt>t</tt> or <tt>1</tt> the background image will be displayed if an image is being uploaded with the request, or has been uploaded previously. An error will be returned if you try to <tt>use</tt> a background image when one is not being uploaded or does not exist. If this parameter is defined but set to anything other than <tt>true</tt>, <tt>t</tt> or <tt>1</tt>, the background image will stop being used.")
                                                        @QueryParam("use") final String use) {
        //TODO: implement
        return null;
    }

    @POST
    @Produces("application/json")
    @Path("/update_profile_banner")
    @ApiVersion({"1.1"})
    @Tag({"profile banner", "profiles"})
    @SeeAlso({@See(href="endpoint/twitter/POST/account/remove_profile_banner", value = "POST account/remove_profile_banner"),
            @See(href="endpoint/twitter/POST/account/update_profile_background_image", value = "POST account/update_profile_background_image"),
            })
    @Description("Uploads a profile banner on behalf of the authenticating user. For best results, upload an")
    public Response postUpdate_profile_banner(@Description("The Base64-encoded or raw image data being uploaded as the user's new profile banner.")
                                              @PathParam("banner") final String banner, @Description("The width of the preferred section of the image being uploaded in pixels. Use with <tt>height</tt>, <tt>offset_left</tt>, and <tt>offset_top</tt> to select the desired region of the image to use.")
                                              @QueryParam("width") final String width, @Description("The height of the preferred section of the image being uploaded in pixels. Use with <tt>width</tt>, <tt>offset_left</tt>, and <tt>offset_top</tt> to select the desired region of the image to use.")
                                              @QueryParam("height") final String height, @Description("The number of pixels by which to offset the uploaded image from the left. Use with <tt>height</tt>, <tt>width</tt>, and <tt>offset_top</tt> to select the desired region of the image to use.")
                                              @QueryParam("offset_left") final String offset_left,
                                              @Description("The number of pixels by which to offset the uploaded image from the top. Use with <tt>height</tt>, <tt>width</tt>, and <tt>offset_left</tt> to select the desired region of the image to use.")
                                              @QueryParam("offset_top") final String offset_top) {
        //TODO: implement
        return null;
    }

    @POST
    @Produces("application/json")
    @Path("/update_profile_colors")
    @Category({"account"})
    @ApiVersion({"1.1"})
    @Description("Sets one or more hex values that control the color scheme of the authenticating user&#039;s profile page on twitter.com. Each parameter&#039;s value must be a valid hexidecimal value, and may be either three or six characters (ex: #fff or #ffffff).")
    public Response postUpdate_profile_colors(@Description("Profile background color.")
                                              @QueryParam("profile_background_color") final String profile_background_color, @Description("Profile link color.")
                                              @QueryParam("profile_link_color") final String profile_link_color, @Description("Profile sidebar's border color.")
                                              @QueryParam("profile_sidebar_border_color") final String profile_sidebar_border_color, @Description("Profile sidebar's background color.")
                                              @QueryParam("profile_sidebar_fill_color") final String profile_sidebar_fill_color,
                                              @Description("Profile text color.")
                                              @QueryParam("profile_text_color") final Integer profile_text_color, @Description("The <tt>entities</tt> node will not be included when set to <tt>false</tt>.")
                                              @QueryParam("include_entities") final Boolean include_entities, @Description("When set to either <tt>true</tt>, <tt>t</tt> or <tt>1</tt> statuses will not be included in the returned user objects.")
                                              @QueryParam("skip_status") final String skip_status) {
        //TODO: implement
        return null;
    }

    @POST
    @Produces("application/json")
    @Path("/update_profile_image")
    @Category({"account"})
    @ApiVersion({"1.1"})
    @SeeAlso({@See(href="endpoint/twitter/GET/users/lookup", value = "GET users/lookup")})
    @Description("Updates the authenticating user&#039;s profile image. Note that this method expects raw multipart data, not a URL to an image. This method asynchronously processes the uploaded file before updating the user&#039;s profile image URL.")
    public Response postUpdate_profile_image(@Description("The avatar image for the profile, base64-encoded. Must be a valid GIF, JPG, or PNG image of less than 700 kilobytes in size. Images with width larger than 500 pixels will be scaled down. Animated GIFs will be converted to a static GIF of the first frame, removing the animation.")
                                             @PathParam("image") final String image, @Description("The <tt>entities</tt> node will not be included when set to <tt>false</tt>.")
                                             @QueryParam("include_entities") final Boolean include_entities, @Description("When set to either <tt>true</tt>, <tt>t</tt> or <tt>1</tt> statuses will not be included in the returned user objects.")
                                             @QueryParam("skip_status") final String skip_status) {
        //TODO: implement
        return null;
    }

}
