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
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/help")
public class HelpResource {

    @GET
    @Produces("application/json")
    @Path("/configuration")
    @Category({"help"})
    @ApiVersion({"1.1"})
    @SeeAlso({@See(href="/apirest/twitter/GET/help/privacy", value = "GET help/privacy"), @See(href="/apirest/twitter/GET/help/languages", value = "GET help/languages"), @See(href="/apirest/twitter/GET/help/tos", value = "GET help/tos")})
    @ApplicationLimit(rate = @Rate(window = 15, unit = GovernanceUnit.MINUTES, limit = 15))
    @UserLimit(rate = @Rate(window = 15, unit = GovernanceUnit.MINUTES, limit = 15))
    @Description("Returns the current configuration used by Twitter including twitter.com slugs which are not usernames, maximum photo resolutions, and t.co URL lengths. It is recommended applications request this endpoint when they are loaded, but no more than once a day.")
    public Response getConfiguration() {
        //TODO: implement
        return null;
    }

    @GET
    @Produces("application/json")
    @Path("/languages")
    @Category({"help"})
    @ApiVersion({"1.1"})
    @SeeAlso({@See(href="/apirest/twitter/GET/help/configuration", value = "GET help/configuration"), @See(href="/apirest/twitter/GET/help/privacy", value = "GET help/privacy"), @See(href="/apirest/twitter/GET/help/tos", value = "GET help/tos")})
    @ApplicationLimit(rate = @Rate(window = 15, unit = GovernanceUnit.MINUTES, limit = 15))
    @UserLimit(rate = @Rate(window = 15, unit = GovernanceUnit.MINUTES, limit = 15))
    @Description("Returns the list of languages supported by Twitter along with their ISO 639-1 code. The ISO 639-1 code is the two letter value to use if you include lang with any of your requests.")
    public Response getLanguages() {
        //TODO: implement
        return null;
    }

    @GET
    @Produces("application/json")
    @Path("/privacy")
    @Category({"help"})
    @ApiVersion({"1.1"})
    @SeeAlso({@See(href="/apirest/twitter/GET/help/configuration", value = "GET help/configuration"), @See(href="/apirest/twitter/GET/help/languages", value = "GET help/languages"), @See(href="/apirest/twitter/GET/help/tos", value = "GET help/tos")})
    @ApplicationLimit(rate = @Rate(window = 15, unit = GovernanceUnit.MINUTES, limit = 15))
    @UserLimit(rate = @Rate(window = 15, unit = GovernanceUnit.MINUTES, limit = 15))
    @Description("Returns Twitter&#039;s Privacy Policy.")
    public Response getPrivacy() {
        //TODO: implement
        return null;
    }

    @GET
    @Produces("application/json")
    @Path("/tos")
    @Category({"help"})
    @ApiVersion({"1.1"})
    @SeeAlso({@See(href="/apirest/twitter/GET/help/configuration", value = "GET help/configuration"), @See(href="/apirest/twitter/GET/help/languages", value = "GET help/languages"), @See(href="/apirest/twitter/GET/help/privacy", value = "GET help/privacy")})
    @ApplicationLimit(rate = @Rate(window = 15, unit = GovernanceUnit.MINUTES, limit = 15))
    @UserLimit(rate = @Rate(window = 15, unit = GovernanceUnit.MINUTES, limit = 15))
    @Description("Returns the Twitter Terms of Service in the requested format. These are not the same as the Developer Rules of the Road.")
    public Response getTos() {
        //TODO: implement
        return null;
    }

}
