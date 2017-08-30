package com.jeelis.psd2hub.server.api;

import com.jeelis.psd2hub.server.model.*;
import com.jeelis.psd2hub.server.api.AccountsApiService;
import com.jeelis.psd2hub.server.api.factories.AccountsApiServiceFactory;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

import com.jeelis.psd2hub.server.model.AccountGETResponse;
import com.jeelis.psd2hub.server.model.AccountGETResponse1;
import com.jeelis.psd2hub.server.model.AccountTransactionsGETResponse;
import com.jeelis.psd2hub.server.model.BalancesGETResponse;
import com.jeelis.psd2hub.server.model.BeneficiariesGETResponse;
import java.util.Date;
import com.jeelis.psd2hub.server.model.ProductGETResponse;
import com.jeelis.psd2hub.server.model.StandingOrdersGETResponse;

import java.util.List;
import com.jeelis.psd2hub.server.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;

@Path("/accounts")

@Produces({ "application/json" })
@io.swagger.annotations.Api(description = "the accounts API")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2017-08-30T01:38:28.934+02:00")
public class AccountsApi  {
   private final AccountsApiService delegate = AccountsApiServiceFactory.getAccountsApi();

    @GET
    @Path("/{AccountId}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get Account", notes = "Get an account", response = AccountGETResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "PSUOAuth2Security", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "accounts", description = "Ability to read Accounts information")
        })
    }, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Account resource successfully retrieved", response = AccountGETResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request", response = AccountGETResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized", response = AccountGETResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Forbidden", response = AccountGETResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 429, message = "Too Many Requests", response = AccountGETResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server Error", response = AccountGETResponse.class) })
    public Response getAccount( @PathParam("AccountId") String accountId,@ApiParam(value = "The unique id of the ASPSP to which the request is issued. The unique id will be issued by OB." ,required=true)@HeaderParam("x-fapi-financial-id") String xFapiFinancialId,@ApiParam(value = "An Authorisation Token as per https://tools.ietf.org/html/rfc6750" ,required=true)@HeaderParam("authorization") String authorization,@ApiParam(value = "The time when the PSU last logged in with the TPP." )@HeaderParam("x-fapi-customer-last-logged-time") String xFapiCustomerLastLoggedTime,@ApiParam(value = "The PSU's IP address if the PSU is currently logged in with the TPP." )@HeaderParam("x-fapi-customer-ip-address") String xFapiCustomerIpAddress,@ApiParam(value = "An RFC4122 UID used as a correlation id." )@HeaderParam("x-fapi-interaction-id") String xFapiInteractionId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getAccount(accountId,xFapiFinancialId,authorization,xFapiCustomerLastLoggedTime,xFapiCustomerIpAddress,xFapiInteractionId,securityContext);
    }
    @GET
    @Path("/{AccountId}/balances")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get Account Balances", notes = "Get Balances related to an account", response = BalancesGETResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "PSUOAuth2Security", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "accounts", description = "Ability to read Accounts information")
        })
    }, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Account Beneficiaries successfully retrieved", response = BalancesGETResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request", response = BalancesGETResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized", response = BalancesGETResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Forbidden", response = BalancesGETResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 429, message = "Too Many Requests", response = BalancesGETResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server Error", response = BalancesGETResponse.class) })
    public Response getAccountBalances( @PathParam("AccountId") String accountId,@ApiParam(value = "The unique id of the ASPSP to which the request is issued. The unique id will be issued by OB." ,required=true)@HeaderParam("x-fapi-financial-id") String xFapiFinancialId,@ApiParam(value = "An Authorisation Token as per https://tools.ietf.org/html/rfc6750" ,required=true)@HeaderParam("authorization") String authorization,@ApiParam(value = "The time when the PSU last logged in with the TPP." )@HeaderParam("x-fapi-customer-last-logged-time") String xFapiCustomerLastLoggedTime,@ApiParam(value = "The PSU's IP address if the PSU is currently logged in with the TPP." )@HeaderParam("x-fapi-customer-ip-address") String xFapiCustomerIpAddress,@ApiParam(value = "An RFC4122 UID used as a correlation id." )@HeaderParam("x-fapi-interaction-id") String xFapiInteractionId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getAccountBalances(accountId,xFapiFinancialId,authorization,xFapiCustomerLastLoggedTime,xFapiCustomerIpAddress,xFapiInteractionId,securityContext);
    }
    @GET
    @Path("/{AccountId}/beneficiaries")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get Account Beneficiaries", notes = "Get Beneficiaries related to an account", response = BeneficiariesGETResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "PSUOAuth2Security", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "accounts", description = "Ability to read Accounts information")
        })
    }, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Account Beneficiaries  successfully retrieved", response = BeneficiariesGETResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request", response = BeneficiariesGETResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized", response = BeneficiariesGETResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Forbidden", response = BeneficiariesGETResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 429, message = "Too Many Requests", response = BeneficiariesGETResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server Error", response = BeneficiariesGETResponse.class) })
    public Response getAccountBeneficiaries( @PathParam("AccountId") String accountId,@ApiParam(value = "The unique id of the ASPSP to which the request is issued. The unique id will be issued by OB." ,required=true)@HeaderParam("x-fapi-financial-id") String xFapiFinancialId,@ApiParam(value = "An Authorisation Token as per https://tools.ietf.org/html/rfc6750" ,required=true)@HeaderParam("authorization") String authorization,@ApiParam(value = "The time when the PSU last logged in with the TPP." )@HeaderParam("x-fapi-customer-last-logged-time") String xFapiCustomerLastLoggedTime,@ApiParam(value = "The PSU's IP address if the PSU is currently logged in with the TPP." )@HeaderParam("x-fapi-customer-ip-address") String xFapiCustomerIpAddress,@ApiParam(value = "An RFC4122 UID used as a correlation id." )@HeaderParam("x-fapi-interaction-id") String xFapiInteractionId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getAccountBeneficiaries(accountId,xFapiFinancialId,authorization,xFapiCustomerLastLoggedTime,xFapiCustomerIpAddress,xFapiInteractionId,securityContext);
    }
    @GET
    @Path("/{AccountId}/direct-debits")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get Account Direct Debits", notes = "Get Direct Debits related to an account", response = AccountGETResponse1.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "PSUOAuth2Security", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "accounts", description = "Ability to read Accounts information")
        })
    }, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Account Direct Debits successfully retrieved", response = AccountGETResponse1.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request", response = AccountGETResponse1.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized", response = AccountGETResponse1.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Forbidden", response = AccountGETResponse1.class),
        
        @io.swagger.annotations.ApiResponse(code = 429, message = "Too Many Requests", response = AccountGETResponse1.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server Error", response = AccountGETResponse1.class) })
    public Response getAccountDirectDebits( @PathParam("AccountId") String accountId,@ApiParam(value = "The unique id of the ASPSP to which the request is issued. The unique id will be issued by OB." ,required=true)@HeaderParam("x-fapi-financial-id") String xFapiFinancialId,@ApiParam(value = "An Authorisation Token as per https://tools.ietf.org/html/rfc6750" ,required=true)@HeaderParam("authorization") String authorization,@ApiParam(value = "The time when the PSU last logged in with the TPP." )@HeaderParam("x-fapi-customer-last-logged-time") String xFapiCustomerLastLoggedTime,@ApiParam(value = "The PSU's IP address if the PSU is currently logged in with the TPP." )@HeaderParam("x-fapi-customer-ip-address") String xFapiCustomerIpAddress,@ApiParam(value = "An RFC4122 UID used as a correlation id." )@HeaderParam("x-fapi-interaction-id") String xFapiInteractionId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getAccountDirectDebits(accountId,xFapiFinancialId,authorization,xFapiCustomerLastLoggedTime,xFapiCustomerIpAddress,xFapiInteractionId,securityContext);
    }
    @GET
    @Path("/{AccountId}/product")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get Account Product", notes = "Get Product related to an account", response = ProductGETResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "PSUOAuth2Security", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "accounts", description = "Ability to read Accounts information")
        })
    }, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Account Product successfully retrieved", response = ProductGETResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request", response = ProductGETResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized", response = ProductGETResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Forbidden", response = ProductGETResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 429, message = "Too Many Requests", response = ProductGETResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server Error", response = ProductGETResponse.class) })
    public Response getAccountProduct( @PathParam("AccountId") String accountId,@ApiParam(value = "The unique id of the ASPSP to which the request is issued. The unique id will be issued by OB." ,required=true)@HeaderParam("x-fapi-financial-id") String xFapiFinancialId,@ApiParam(value = "An Authorisation Token as per https://tools.ietf.org/html/rfc6750" ,required=true)@HeaderParam("authorization") String authorization,@ApiParam(value = "The time when the PSU last logged in with the TPP." )@HeaderParam("x-fapi-customer-last-logged-time") String xFapiCustomerLastLoggedTime,@ApiParam(value = "The PSU's IP address if the PSU is currently logged in with the TPP." )@HeaderParam("x-fapi-customer-ip-address") String xFapiCustomerIpAddress,@ApiParam(value = "An RFC4122 UID used as a correlation id." )@HeaderParam("x-fapi-interaction-id") String xFapiInteractionId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getAccountProduct(accountId,xFapiFinancialId,authorization,xFapiCustomerLastLoggedTime,xFapiCustomerIpAddress,xFapiInteractionId,securityContext);
    }
    @GET
    @Path("/{AccountId}/standing-orders")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get Account Standing Orders", notes = "Get Standing Orders related to an account", response = StandingOrdersGETResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "PSUOAuth2Security", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "accounts", description = "Ability to read Accounts information")
        })
    }, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Account Standing Orders successfully retrieved", response = StandingOrdersGETResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request", response = StandingOrdersGETResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized", response = StandingOrdersGETResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Forbidden", response = StandingOrdersGETResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 429, message = "Too Many Requests", response = StandingOrdersGETResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server Error", response = StandingOrdersGETResponse.class) })
    public Response getAccountStandingOrders( @PathParam("AccountId") String accountId,@ApiParam(value = "The unique id of the ASPSP to which the request is issued. The unique id will be issued by OB." ,required=true)@HeaderParam("x-fapi-financial-id") String xFapiFinancialId,@ApiParam(value = "An Authorisation Token as per https://tools.ietf.org/html/rfc6750" ,required=true)@HeaderParam("authorization") String authorization,@ApiParam(value = "The time when the PSU last logged in with the TPP." )@HeaderParam("x-fapi-customer-last-logged-time") String xFapiCustomerLastLoggedTime,@ApiParam(value = "The PSU's IP address if the PSU is currently logged in with the TPP." )@HeaderParam("x-fapi-customer-ip-address") String xFapiCustomerIpAddress,@ApiParam(value = "An RFC4122 UID used as a correlation id." )@HeaderParam("x-fapi-interaction-id") String xFapiInteractionId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getAccountStandingOrders(accountId,xFapiFinancialId,authorization,xFapiCustomerLastLoggedTime,xFapiCustomerIpAddress,xFapiInteractionId,securityContext);
    }
    @GET
    @Path("/{AccountId}/transactions")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get Account Transactions", notes = "Get transactions related to an account", response = AccountTransactionsGETResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "PSUOAuth2Security", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "accounts", description = "Ability to read Accounts information")
        })
    }, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Account Transactions successfully retrieved", response = AccountTransactionsGETResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request", response = AccountTransactionsGETResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized", response = AccountTransactionsGETResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Forbidden", response = AccountTransactionsGETResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 429, message = "Too Many Requests", response = AccountTransactionsGETResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server Error", response = AccountTransactionsGETResponse.class) })
    public Response getAccountTransactions( @PathParam("AccountId") String accountId,@ApiParam(value = "The unique id of the ASPSP to which the request is issued. The unique id will be issued by OB." ,required=true)@HeaderParam("x-fapi-financial-id") String xFapiFinancialId,@ApiParam(value = "An Authorisation Token as per https://tools.ietf.org/html/rfc6750" ,required=true)@HeaderParam("authorization") String authorization,  @QueryParam("fromBookingDateTime") Date fromBookingDateTime,  @QueryParam("toBookingDateTime") Date toBookingDateTime,@ApiParam(value = "The time when the PSU last logged in with the TPP." )@HeaderParam("x-fapi-customer-last-logged-time") String xFapiCustomerLastLoggedTime,@ApiParam(value = "The PSU's IP address if the PSU is currently logged in with the TPP." )@HeaderParam("x-fapi-customer-ip-address") String xFapiCustomerIpAddress,@ApiParam(value = "An RFC4122 UID used as a correlation id." )@HeaderParam("x-fapi-interaction-id") String xFapiInteractionId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getAccountTransactions(accountId,xFapiFinancialId,authorization,fromBookingDateTime,toBookingDateTime,xFapiCustomerLastLoggedTime,xFapiCustomerIpAddress,xFapiInteractionId,securityContext);
    }
    @GET
    
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Get Accounts", notes = "Get a list of accounts", response = AccountGETResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "PSUOAuth2Security", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "accounts", description = "Ability to read Accounts information")
        })
    }, tags={  })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Accounts successfully retrieved", response = AccountGETResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Bad Request", response = AccountGETResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "Unauthorized", response = AccountGETResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Forbidden", response = AccountGETResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 429, message = "Too Many Requests", response = AccountGETResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Internal Server Error", response = AccountGETResponse.class) })
    public Response getAccounts(@ApiParam(value = "The unique id of the ASPSP to which the request is issued. The unique id will be issued by OB." ,required=true)@HeaderParam("x-fapi-financial-id") String xFapiFinancialId,@ApiParam(value = "An Authorisation Token as per https://tools.ietf.org/html/rfc6750" ,required=true)@HeaderParam("authorization") String authorization,@ApiParam(value = "The time when the PSU last logged in with the TPP." )@HeaderParam("x-fapi-customer-last-logged-time") String xFapiCustomerLastLoggedTime,@ApiParam(value = "The PSU's IP address if the PSU is currently logged in with the TPP." )@HeaderParam("x-fapi-customer-ip-address") String xFapiCustomerIpAddress,@ApiParam(value = "An RFC4122 UID used as a correlation id." )@HeaderParam("x-fapi-interaction-id") String xFapiInteractionId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getAccounts(xFapiFinancialId,authorization,xFapiCustomerLastLoggedTime,xFapiCustomerIpAddress,xFapiInteractionId,securityContext);
    }
}
