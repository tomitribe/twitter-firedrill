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

import com.tomitribe.wadlx.api.ApiVersion;
import com.tomitribe.wadlx.api.Description;
import com.tomitribe.wadlx.api.See;
import com.tomitribe.wadlx.api.SeeAlso;
import com.tomitribe.wadlx.api.Tag;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;

@Path("/oauth")
public class OauthResource {

    @GET
    @Path("/authenticate")
    @ApiVersion({"1", "1.1"})
    @Description("Allows a Consumer application to use an OAuth request_token to request user authorization. This method is a replacement of Section 6.2 of the OAuth 1.0 authentication flow for applications using the callback authentication flow.")
    public void getAuthenticate(@Description("Forces the user to enter their credentials to ensure the correct users account is authorized.")
                                @QueryParam("force_login") final Boolean force_login, @Description("Prefills the username input box of the OAuth login screen with the given value.")
                                @QueryParam("screen_name") final String screen_name) {
        //TODO: implement
    }

    @GET
    @Path("/authorize")
    @ApiVersion({"1", "1.1"})
    @Description("Allows a Consumer application to use an OAuth Request Token to request user authorization. This method fulfills Section 6.2 of the OAuth 1.0 authentication flow. Desktop applications must use this method (and cannot use GET oauth/authenticate). Please use HTTPS for this method, and all other OAuth token negotiation steps.")
    public void getAuthorize(@Description("Forces the user to enter their credentials to ensure the correct users account is authorized.")
                             @QueryParam("force_login") final String force_login, @Description("Prefills the username input box of the OAuth login screen with the given value.")
                             @QueryParam("screen_name") final String screen_name) {
        //TODO: implement
    }

    @POST
    @Path("/access_token")
    @ApiVersion({"1", "1.1"})
    @Tag({"OAuth"})
    @Description("Allows a Consumer application to exchange the OAuth Request Token for an OAuth Access Token. This method fulfills Section 6.3 of the OAuth 1.0 authentication flow. The OAuth access token may also be used for xAuth operations. Please use HTTPS for this method, and all other OAuth token negotiation steps.")
    public void postAccess_token(@Description("The password of the user for which to obtain a token for. <strong>Required when using xAuth</strong>")
                                 @QueryParam("x_auth_password") final String x_auth_password, @Description("The username of the user to obtain a token for. <strong>Required when using xAuth</strong>")
                                 @QueryParam("x_auth_username") final String x_auth_username, @Description("Set this value to <tt>client_auth</tt>, without the quotes. <strong>Required when using xAuth</strong>")
                                 @QueryParam("x_auth_mode") final String x_auth_mode, @Description("If using the OAuth web-flow, set this parameter to the value of the <tt>oauth_verifier</tt> returned in the callback URL. If you are using out-of-band OAuth, set this value to the pin-code. When using xAuth, this value should not be included.")
                                 @QueryParam("oauth_verifier") final String oauth_verifier) {
        //TODO: implement
    }

    @POST
    @Path("/request_token")
    @ApiVersion({"1", "1.1"})
    @Tag({"OAuth"})
    @Description("Allows a Consumer application to obtain an OAuth Request Token to request user authorization. This method fulfills Section 6.1 of the OAuth 1.0 authentication flow. It is strongly recommended you use HTTPS for all OAuth authorization steps. Usage Note: Only ASCII values are accepted for the oauth_nonce")
    public void postRequest_token(@Description("For OAuth 1.0a compliance this parameter is <strong>required</strong>. The value you specify here will be used as the URL a user is redirected to should they approve your application's access to their account. Set this to <tt>oob</tt> for out-of-band pin mode. This is also how you specify custom callbacks for use in desktop/mobile applications. ")
                                  @PathParam("oauth_callback") final String oauth_callback, @Description("Overrides the access level an application requests to a users account. Supported values are <tt>read</tt> or <tt>write</tt>. This parameter is intended to allow a developer to register a read/write application but also request read only access when appropriate.")
                                  @QueryParam("x_auth_access_type") final String x_auth_access_type) {
        //TODO: implement
    }

}
