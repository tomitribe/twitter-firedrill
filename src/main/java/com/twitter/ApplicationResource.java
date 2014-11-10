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
import com.tomitribe.wadlx.api.Tag;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

@Path("/application")
public class ApplicationResource {

    @GET
    @Produces("application/json")
    @Path("/rate_limit_status")
    @Category({"application"})
    @ApiVersion({"1.1"})
    @Tag({"Rate Limits", "rate limiting"})
    @ApplicationLimit(rate = @Rate(window = 15, unit = GovernanceUnit.MINUTES, limit = 180))
    @UserLimit(rate = @Rate(window = 15, unit = GovernanceUnit.MINUTES, limit = 180))
    @Description("Returns the current rate limits for methods belonging to the specified resource families.")
    public Response getRate_limit_status(@Description("A comma-separated list of resource families you want to know the current rate limit disposition for. For best performance, only specify the resource families pertinent to your application.")
                                         @QueryParam("resources") final String resources) {
        //TODO: implement
        return null;
    }

}