package com.jeelis.psd2hub.server.api;

import com.jeelis.psd2hub.server.model.*;
import com.jeelis.psd2hub.server.api.StandingOrdersApiService;
import com.jeelis.psd2hub.server.api.factories.StandingOrdersApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import com.jeelis.psd2hub.server.model.StandingOrdersGETResponse;

import java.util.List;
import com.jeelis.psd2hub.server.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;

@Path("/standing-orders")

@Produces({ "application/json" })
@io.swagger.annotations.Api(description = "the standing-orders API")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2017-08-30T01:38:28.934+02:00")
public class StandingOrdersApi  {
   private final StandingOrdersApiService delegate = StandingOrdersApiServiceFactory.getStandingOrdersApi();

    @GET
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get Standing Orders", notes = "Get Standing Orders", response = StandingOrdersGETResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "PSUOAuth2Security", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "accounts", description = "Ability to read Accounts information")
        })
    }, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Standing Orders successfully retrieved", response = StandingOrdersGETResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request", response = StandingOrdersGETResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized", response = StandingOrdersGETResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Forbidden", response = StandingOrdersGETResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 429, message = "Too Many Requests", response = StandingOrdersGETResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server Error", response = StandingOrdersGETResponse.class) })
    public Response getStandingOrders(@ApiParam(value = "The unique id of the ASPSP to which the request is issued. The unique id will be issued by OB." ,required=true)@HeaderParam("x-fapi-financial-id") String xFapiFinancialId,@ApiParam(value = "An Authorisation Token as per https://tools.ietf.org/html/rfc6750" ,required=true)@HeaderParam("authorization") String authorization,@ApiParam(value = "The time when the PSU last logged in with the TPP." )@HeaderParam("x-fapi-customer-last-logged-time") String xFapiCustomerLastLoggedTime,@ApiParam(value = "The PSU's IP address if the PSU is currently logged in with the TPP." )@HeaderParam("x-fapi-customer-ip-address") String xFapiCustomerIpAddress,@ApiParam(value = "An RFC4122 UID used as a correlation id." )@HeaderParam("x-fapi-interaction-id") String xFapiInteractionId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getStandingOrders(xFapiFinancialId,authorization,xFapiCustomerLastLoggedTime,xFapiCustomerIpAddress,xFapiInteractionId,securityContext);
    }
}
