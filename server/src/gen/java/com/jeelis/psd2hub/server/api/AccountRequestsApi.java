package com.jeelis.psd2hub.server.api;

import com.jeelis.psd2hub.server.model.*;
import com.jeelis.psd2hub.server.api.AccountRequestsApiService;
import com.jeelis.psd2hub.server.api.factories.AccountRequestsApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import com.jeelis.psd2hub.server.model.AccountRequestPOSTRequest;
import com.jeelis.psd2hub.server.model.AccountRequestPOSTResponse;

import java.util.List;
import com.jeelis.psd2hub.server.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;

@Path("/account-requests")

@Produces({ "application/json" })
@io.swagger.annotations.Api(description = "the account-requests API")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2017-08-30T01:38:28.934+02:00")
public class AccountRequestsApi  {
   private final AccountRequestsApiService delegate = AccountRequestsApiServiceFactory.getAccountRequestsApi();

    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Create an account request", notes = "Create an account request", response = AccountRequestPOSTResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "TPPOAuth2Security", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "tpp_client_credential", description = "TPP Client Credential Scope")
        })
    }, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 201, message = "Account Request resource successfully created", response = AccountRequestPOSTResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request", response = AccountRequestPOSTResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized", response = AccountRequestPOSTResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Forbidden", response = AccountRequestPOSTResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 429, message = "Too Many Requests", response = AccountRequestPOSTResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server Error", response = AccountRequestPOSTResponse.class) })
    public Response createAccountRequest(@ApiParam(value = "Create an Account Request" ,required=true) AccountRequestPOSTRequest body,@ApiParam(value = "The unique id of the ASPSP to which the request is issued. The unique id will be issued by OB." ,required=true)@HeaderParam("x-fapi-financial-id") String xFapiFinancialId,@ApiParam(value = "An Authorisation Token as per https://tools.ietf.org/html/rfc6750" ,required=true)@HeaderParam("authorization") String authorization,@ApiParam(value = "Header containig a detached JWS signature of the body of the payload." ,required=true)@HeaderParam("x-jws-signature") String xJwsSignature,@ApiParam(value = "The time when the PSU last logged in with the TPP." )@HeaderParam("x-fapi-customer-last-logged-time") String xFapiCustomerLastLoggedTime,@ApiParam(value = "The PSU's IP address if the PSU is currently logged in with the TPP." )@HeaderParam("x-fapi-customer-ip-address") String xFapiCustomerIpAddress,@ApiParam(value = "An RFC4122 UID used as a correlation id." )@HeaderParam("x-fapi-interaction-id") String xFapiInteractionId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.createAccountRequest(body,xFapiFinancialId,authorization,xJwsSignature,xFapiCustomerLastLoggedTime,xFapiCustomerIpAddress,xFapiInteractionId,securityContext);
    }
    @DELETE
    @Path("/{AccountRequestId}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Delete an account request", notes = "Delete an account request", response = Void.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "TPPOAuth2Security", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "tpp_client_credential", description = "TPP Client Credential Scope")
        })
    }, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 204, message = "Account Request resource successfully deleted", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Forbidden", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 429, message = "Too Many Requests", response = Void.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server Error", response = Void.class) })
    public Response deleteAccountRequest( @PathParam("AccountRequestId") String accountRequestId,@ApiParam(value = "An Authorisation Token as per https://tools.ietf.org/html/rfc6750" ,required=true)@HeaderParam("authorization") String authorization,@ApiParam(value = "The unique id of the ASPSP to which the request is issued. The unique id will be issued by OB." ,required=true)@HeaderParam("x-fapi-financial-id") String xFapiFinancialId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.deleteAccountRequest(accountRequestId,authorization,xFapiFinancialId,securityContext);
    }
    @GET
    @Path("/{AccountRequestId}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get an account request", notes = "Get an account request", response = AccountRequestPOSTResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "TPPOAuth2Security", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "tpp_client_credential", description = "TPP Client Credential Scope")
        })
    }, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Account Request resource successfully retrieved", response = AccountRequestPOSTResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request", response = AccountRequestPOSTResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized", response = AccountRequestPOSTResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Forbidden", response = AccountRequestPOSTResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 429, message = "Too Many Requests", response = AccountRequestPOSTResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server Error", response = AccountRequestPOSTResponse.class) })
    public Response getAccountRequest( @PathParam("AccountRequestId") String accountRequestId,@ApiParam(value = "The unique id of the ASPSP to which the request is issued. The unique id will be issued by OB." ,required=true)@HeaderParam("x-fapi-financial-id") String xFapiFinancialId,@ApiParam(value = "An Authorisation Token as per https://tools.ietf.org/html/rfc6750" ,required=true)@HeaderParam("authorization") String authorization,@ApiParam(value = "The time when the PSU last logged in with the TPP." )@HeaderParam("x-fapi-customer-last-logged-time") String xFapiCustomerLastLoggedTime,@ApiParam(value = "The PSU's IP address if the PSU is currently logged in with the TPP." )@HeaderParam("x-fapi-customer-ip-address") String xFapiCustomerIpAddress,@ApiParam(value = "An RFC4122 UID used as a correlation id." )@HeaderParam("x-fapi-interaction-id") String xFapiInteractionId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getAccountRequest(accountRequestId,xFapiFinancialId,authorization,xFapiCustomerLastLoggedTime,xFapiCustomerIpAddress,xFapiInteractionId,securityContext);
    }
}
