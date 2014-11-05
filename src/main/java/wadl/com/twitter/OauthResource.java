/**
 * Created by Tomitribe CXF WadlToJava code generator
**/
package com.twitter;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;
import com.tomitribe.tribestream.governance.api.ApplicationLimit;
import com.tomitribe.tribestream.governance.api.GovernanceUnit;
import com.tomitribe.tribestream.governance.api.UserLimit;
import com.tomitribe.wadlx.api.ApiVersion;
import com.tomitribe.wadlx.api.Description;
import com.tomitribe.wadlx.api.See;
import com.tomitribe.wadlx.api.SeeAlso;
import com.tomitribe.wadlx.api.Tag;

@Path("/oauth")
public class OauthResource {

    @GET
    @Path("/authenticate")
    @ApiVersion({"1","1.1"})
    @SeeAlso({@See(href = "/docs/auth/oauth", value="OAuth"),@See(href = "/docs/auth", value="Authentication &amp;amp; Authorization"),@See(href = "/docs/api/1/get/oauth/authorize", value="GET oauth/authorize"),@See(href = "/docs/application-permission-model", value="The Application Permission Model"),@See(href = "/docs/api/1/post/oauth/request_token", value="POST oauth/request_token")})
    @Description("Allows a Consumer application to use an OAuth request_token to request user authorization. This method is a replacement of Section 6.2 of the OAuth 1.0 authentication flow for applications using the callback authentication flow.")
    public void getAuthenticate(@Description("Forces the user to enter their credentials to ensure the correct users account is authorized.")
     @QueryParam("force_login") final Boolean force_login, @Description("Prefills the username input box of the OAuth login screen with the given value.")
     @QueryParam("screen_name") final String screen_name) {
        //TODO: implement
    }

    @GET
    @Path("/authorize")
    @ApiVersion({"1","1.1"})
    @SeeAlso({@See(href = "/docs/api/1/post/oauth/request_token", value="POST oauth/request_token"),@See(href = "/docs/api/1/post/oauth/access_token", value="POST oauth/access_token"),@See(href = "/docs/api/1/get/oauth/authenticate", value="GET oauth/authenticate"),@See(href = "/docs/auth", value="Authentication &amp;amp; Authorization"),@See(href = "/docs/auth/authorizing-request", value="Authorizing a request")})
    @Description("Allows a Consumer application to use an OAuth Request Token to request user authorization. This method fulfills Section 6.2 of the OAuth 1.0 authentication flow. Desktop applications must use this method (and cannot use GET oauth/authenticate). Please use HTTPS for this method, and all other OAuth token negotiation steps.")
    public void getAuthorize(@Description("Forces the user to enter their credentials to ensure the correct users account is authorized.")
     @QueryParam("force_login") final String force_login, @Description("Prefills the username input box of the OAuth login screen with the given value.")
     @QueryParam("screen_name") final String screen_name) {
        //TODO: implement
    }

    @POST
    @Path("/access_token")
    @ApiVersion({"1","1.1"})
    @Tag({"OAuth"})
    @SeeAlso({@See(href = "/docs/auth", value="Authentication &amp;amp; Authorization"),@See(href = "/docs/api/1/post/oauth/request_token", value="POST oauth/request_token"),@See(href = "/docs/api/1/get/oauth/authorize", value="GET oauth/authorize"),@See(href = "/docs/oauth/xauth", value="xAuth"),@See(href = "/docs/api/1/get/oauth/authenticate", value="GET oauth/authenticate"),@See(href = "/docs/security/best-practices", value="Security Best Practices"),@See(href = "/docs/auth/obtaining-access-tokens", value="Obtaining access tokens")})
    @Description("Allows a Consumer application to exchange the OAuth Request Token for an OAuth Access Token. This method fulfills Section 6.3 of the OAuth 1.0 authentication flow. The OAuth access token may also be used for xAuth operations. Please use HTTPS for this method, and all other OAuth token negotiation steps.")
    public void postAccess_token(@Description("The password of the user for which to obtain a token for. &lt;strong&gt;Required when using xAuth&lt;/strong&gt;")
     @QueryParam("x_auth_password") final String x_auth_password, @Description("The username of the user to obtain a token for. &lt;strong&gt;Required when using xAuth&lt;/strong&gt;")
     @QueryParam("x_auth_username") final String x_auth_username, @Description("Set this value to &lt;tt&gt;client_auth&lt;/tt&gt;, without the quotes. &lt;strong&gt;Required when using xAuth&lt;/strong&gt;")
     @QueryParam("x_auth_mode") final String x_auth_mode, @Description("If using the OAuth web-flow, set this parameter to the value of the ")
     @QueryParam("oauth_verifier") final String oauth_verifier) {
        //TODO: implement
    }

    @POST
    @Path("/request_token")
    @ApiVersion({"1","1.1"})
    @Tag({"OAuth"})
    @SeeAlso({@See(href = "/docs/api/1/post/oauth/access_token", value="POST oauth/access_token"),@See(href = "/docs/api/1/get/oauth/authorize", value="GET oauth/authorize"),@See(href = "/docs/api/1/get/oauth/authenticate", value="GET oauth/authenticate"),@See(href = "/docs/auth/oauth", value="OAuth"),@See(href = "/docs/security/best-practices", value="Security Best Practices"),@See(href = "/docs/auth", value="Authentication &amp;amp; Authorization")})
    @Description("Allows a Consumer application to obtain an OAuth Request Token to request user authorization. This method fulfills Section 6.1 of the OAuth 1.0 authentication flow. It is strongly recommended you use HTTPS for all OAuth authorization steps. Usage Note: Only ASCII values are accepted for the oauth_nonce")
    public void postRequest_token(@Description("For OAuth 1.0a compliance this parameter is &lt;strong&gt;required&lt;/strong&gt;. The value you specify here will be used as the URL a user is redirected to should they approve your application&apos;s access to their account. Set this to &lt;tt&gt;oob&lt;/tt&gt; for out-of-band pin mode. This is also how you specify custom callbacks for use in desktop/mobile applications. ")
     @PathParam("oauth_callback") final String oauth_callback, @Description("Overrides the access level an application requests to a users account. Supported values are ")
     @QueryParam("x_auth_access_type") final String x_auth_access_type) {
        //TODO: implement
    }

}