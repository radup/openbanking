package com.jeelis.psd2hub.server.api;

import com.jeelis.psd2hub.server.model.*;
import com.jeelis.psd2hub.server.api.PaymentSubmissionsApiService;
import com.jeelis.psd2hub.server.api.factories.PaymentSubmissionsApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import com.jeelis.psd2hub.server.model.PaymentSubmissionPOSTRequest;
import com.jeelis.psd2hub.server.model.PaymentSubmitPOST201Response;

import java.util.List;
import com.jeelis.psd2hub.server.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;

@Path("/payment-submissions")

@Produces({ "application/json" })
@io.swagger.annotations.Api(description = "the payment-submissions API")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2017-08-30T01:37:21.257+02:00")
public class PaymentSubmissionsApi  {
   private final PaymentSubmissionsApiService delegate = PaymentSubmissionsApiServiceFactory.getPaymentSubmissionsApi();

    @POST
    
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Create a payment submission", notes = "Submit a previously setup payment", response = PaymentSubmitPOST201Response.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "PSUOAuth2Security", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "payment", description = "Generic payment scope")
        })
    }, tags={ "Payments", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 201, message = "Payment submit resource successfully created", response = PaymentSubmitPOST201Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request", response = PaymentSubmitPOST201Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized", response = PaymentSubmitPOST201Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Forbidden", response = PaymentSubmitPOST201Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 429, message = "Too Many Requests", response = PaymentSubmitPOST201Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server Error", response = PaymentSubmitPOST201Response.class) })
    public Response createPaymentSubmission(@ApiParam(value = "Every request will be processed only once per x-idempotency-key.  The Idempotency Key will be valid for 24 hours." ,required=true)@HeaderParam("x-idempotency-key") String xIdempotencyKey,@ApiParam(value = "The unique id of the ASPSP to which the request is issued. The unique id will be issued by OB." ,required=true)@HeaderParam("x-fapi-financial-id") String xFapiFinancialId,@ApiParam(value = "An Authorisation Token as per https://tools.ietf.org/html/rfc6750" ,required=true)@HeaderParam("authorization") String authorization,@ApiParam(value = "Header containing a detached JWS signature of the body of the payload." ,required=true)@HeaderParam("x-jws-signature") String xJwsSignature,@ApiParam(value = "Setup a single immediate payment" ,required=true) PaymentSubmissionPOSTRequest body,@ApiParam(value = "The time when the PSU last logged in with the TPP." )@HeaderParam("x-fapi-customer-last-logged-time") String xFapiCustomerLastLoggedTime,@ApiParam(value = "The PSU's IP address if the PSU is currently logged in with the TPP." )@HeaderParam("x-fapi-customer-ip-address") String xFapiCustomerIpAddress,@ApiParam(value = "An RFC4122 UID used as a correlation id." )@HeaderParam("x-fapi-interaction-id") String xFapiInteractionId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.createPaymentSubmission(xIdempotencyKey,xFapiFinancialId,authorization,xJwsSignature,body,xFapiCustomerLastLoggedTime,xFapiCustomerIpAddress,xFapiInteractionId,securityContext);
    }
    @GET
    @Path("/{PaymentSubmissionId}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get a payment submission", notes = "Get payment submission", response = PaymentSubmitPOST201Response.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "PSUOAuth2Security", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "payment", description = "Generic payment scope")
        }),
        @io.swagger.annotations.Authorization(value = "TPPOAuth2Security", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "tpp_client_credential", description = "TPP Client Credential Scope")
        })
    }, tags={ "Payments", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Payment resource successfully retrieved", response = PaymentSubmitPOST201Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request", response = PaymentSubmitPOST201Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized", response = PaymentSubmitPOST201Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Forbidden", response = PaymentSubmitPOST201Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 429, message = "Too Many Requests", response = PaymentSubmitPOST201Response.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server Error", response = PaymentSubmitPOST201Response.class) })
    public Response getPaymentSubmission( @PathParam("PaymentSubmissionId") String paymentSubmissionId,@ApiParam(value = "The unique id of the ASPSP to which the request is issued. The unique id will be issued by OB." ,required=true)@HeaderParam("x-fapi-financial-id") String xFapiFinancialId,@ApiParam(value = "An Authorisation Token as per https://tools.ietf.org/html/rfc6750" ,required=true)@HeaderParam("authorization") String authorization,@ApiParam(value = "The time when the PSU last logged in with the TPP." )@HeaderParam("x-fapi-customer-last-logged-time") String xFapiCustomerLastLoggedTime,@ApiParam(value = "The PSU's IP address if the PSU is currently logged in with the TPP." )@HeaderParam("x-fapi-customer-ip-address") String xFapiCustomerIpAddress,@ApiParam(value = "An RFC4122 UID used as a correlation id." )@HeaderParam("x-fapi-interaction-id") String xFapiInteractionId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getPaymentSubmission(paymentSubmissionId,xFapiFinancialId,authorization,xFapiCustomerLastLoggedTime,xFapiCustomerIpAddress,xFapiInteractionId,securityContext);
    }
}
