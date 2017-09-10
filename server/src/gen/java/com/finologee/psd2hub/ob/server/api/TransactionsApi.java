package com.finologee.psd2hub.ob.server.api;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import java.util.Date;

import java.util.List;

import com.finologee.psd2hub.ob.server.api.NotFoundException;
import com.finologee.psd2hub.ob.server.api.TransactionsApiService;
import com.finologee.psd2hub.ob.server.api.factories.TransactionsApiServiceFactory;
import com.finologee.psd2hub.ob.server.model.*;

import java.io.InputStream;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;

@Path("/transactions")

@Produces({ "application/json" })
@io.swagger.annotations.Api(description = "the transactions API")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2017-08-30T01:38:28.934+02:00")
public class TransactionsApi  {
   private final TransactionsApiService delegate = TransactionsApiServiceFactory.getTransactionsApi();

    @GET
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get Transactions", notes = "Get Transactions", response = AccountTransactionsGETResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "PSUOAuth2Security", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "accounts", description = "Ability to read Accounts information")
        })
    }, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Transactions successfully retrieved", response = AccountTransactionsGETResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request", response = AccountTransactionsGETResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized", response = AccountTransactionsGETResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Forbidden", response = AccountTransactionsGETResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 429, message = "Too Many Requests", response = AccountTransactionsGETResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server Error", response = AccountTransactionsGETResponse.class) })
    public Response getTransactions(@ApiParam(value = "The unique id of the ASPSP to which the request is issued. The unique id will be issued by OB." ,required=true)@HeaderParam("x-fapi-financial-id") String xFapiFinancialId,@ApiParam(value = "An Authorisation Token as per https://tools.ietf.org/html/rfc6750" ,required=true)@HeaderParam("authorization") String authorization,@ApiParam(value = "The time when the PSU last logged in with the TPP." )@HeaderParam("x-fapi-customer-last-logged-time") String xFapiCustomerLastLoggedTime,@ApiParam(value = "The PSU's IP address if the PSU is currently logged in with the TPP." )@HeaderParam("x-fapi-customer-ip-address") String xFapiCustomerIpAddress,@ApiParam(value = "An RFC4122 UID used as a correlation id." )@HeaderParam("x-fapi-interaction-id") String xFapiInteractionId,  @QueryParam("fromBookingDateTime") Date fromBookingDateTime,  @QueryParam("toBookingDateTime") Date toBookingDateTime,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getTransactions(xFapiFinancialId,authorization,xFapiCustomerLastLoggedTime,xFapiCustomerIpAddress,xFapiInteractionId,fromBookingDateTime,toBookingDateTime,securityContext);
    }
}
