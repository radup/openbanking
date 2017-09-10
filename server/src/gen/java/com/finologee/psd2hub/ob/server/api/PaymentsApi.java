package com.finologee.psd2hub.ob.server.api;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import java.util.List;

import com.finologee.psd2hub.ob.server.api.NotFoundException;
import com.finologee.psd2hub.ob.server.api.PaymentsApiService;
import com.finologee.psd2hub.ob.server.api.factories.PaymentsApiServiceFactory;
import com.finologee.psd2hub.ob.server.model.*;

import java.io.InputStream;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;

@Path("/payments")

@Produces({ "application/json" })
@io.swagger.annotations.Api(description = "the payments API")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2017-08-30T01:37:21.257+02:00")
public class PaymentsApi  {
   private final PaymentsApiService delegate = PaymentsApiServiceFactory.getPaymentsApi();

    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Create a single immediate payment", notes = "Create a single immediate payment", response = PaymentSetupPOSTResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "TPPOAuth2Security", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "tpp_client_credential", description = "TPP Client Credential Scope")
        })
    }, tags={ "Payments", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 201, message = "Payment setup resource successfully created", response = PaymentSetupPOSTResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request", response = PaymentSetupPOSTResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized", response = PaymentSetupPOSTResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Forbidden", response = PaymentSetupPOSTResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 429, message = "Too Many Requests", response = PaymentSetupPOSTResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server Error", response = PaymentSetupPOSTResponse.class) })
    public Response createSingleImmediatePayment(@ApiParam(value = "Every request will be processed only once per x-idempotency-key.  The Idempotency Key will be valid for 24 hours." ,required=true)@HeaderParam("x-idempotency-key") String xIdempotencyKey,@ApiParam(value = "The unique id of the ASPSP to which the request is issued. The unique id will be issued by OB." ,required=true)@HeaderParam("x-fapi-financial-id") String xFapiFinancialId,@ApiParam(value = "An Authorisation Token as per https://tools.ietf.org/html/rfc6750" ,required=true)@HeaderParam("authorization") String authorization,@ApiParam(value = "Header containing a detached JWS signature of the body of the payload." ,required=true)@HeaderParam("x-jws-signature") String xJwsSignature,@ApiParam(value = "Setup a single immediate payment" ,required=true) PaymentSetupPOSTRequest body,@ApiParam(value = "The time when the PSU last logged in with the TPP." )@HeaderParam("x-fapi-customer-last-logged-time") String xFapiCustomerLastLoggedTime,@ApiParam(value = "The PSU's IP address if the PSU is currently logged in with the TPP." )@HeaderParam("x-fapi-customer-ip-address") String xFapiCustomerIpAddress,@ApiParam(value = "An RFC4122 UID used as a correlation id." )@HeaderParam("x-fapi-interaction-id") String xFapiInteractionId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.createSingleImmediatePayment(xIdempotencyKey,xFapiFinancialId,authorization,xJwsSignature,body,xFapiCustomerLastLoggedTime,xFapiCustomerIpAddress,xFapiInteractionId,securityContext);
    }
    @GET
    @Path("/{PaymentId}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get a single immediate payment", notes = "Get a single immediate payment", response = PaymentSetupPOSTResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "PSUOAuth2Security", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "payment", description = "Generic payment scope")
        }),
        @io.swagger.annotations.Authorization(value = "TPPOAuth2Security", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "tpp_client_credential", description = "TPP Client Credential Scope")
        })
    }, tags={ "Payments", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Payment resource successfully retrieved", response = PaymentSetupPOSTResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request", response = PaymentSetupPOSTResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized", response = PaymentSetupPOSTResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Forbidden", response = PaymentSetupPOSTResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 429, message = "Too Many Requests", response = PaymentSetupPOSTResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server Error", response = PaymentSetupPOSTResponse.class) })
    public Response getSingleImmediatePayment( @PathParam("PaymentId") String paymentId,@ApiParam(value = "The unique id of the ASPSP to which the request is issued. The unique id will be issued by OB." ,required=true)@HeaderParam("x-fapi-financial-id") String xFapiFinancialId,@ApiParam(value = "An Authorisation Token as per https://tools.ietf.org/html/rfc6750" ,required=true)@HeaderParam("authorization") String authorization,@ApiParam(value = "The time when the PSU last logged in with the TPP." )@HeaderParam("x-fapi-customer-last-logged-time") String xFapiCustomerLastLoggedTime,@ApiParam(value = "The PSU's IP address if the PSU is currently logged in with the TPP." )@HeaderParam("x-fapi-customer-ip-address") String xFapiCustomerIpAddress,@ApiParam(value = "An RFC4122 UID used as a correlation id." )@HeaderParam("x-fapi-interaction-id") String xFapiInteractionId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getSingleImmediatePayment(paymentId,xFapiFinancialId,authorization,xFapiCustomerLastLoggedTime,xFapiCustomerIpAddress,xFapiInteractionId,securityContext);
    }
}
