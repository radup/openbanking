package com.jeelis.psd2hub.server.api;

import com.jeelis.psd2hub.server.api.*;
import com.jeelis.psd2hub.server.model.*;


import com.jeelis.psd2hub.server.model.AccountRequestPOSTRequest;
import com.jeelis.psd2hub.server.model.AccountRequestPOSTResponse;

import java.util.List;
import com.jeelis.psd2hub.server.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2017-08-30T01:38:28.934+02:00")
public abstract class AccountRequestsApiService {
      public abstract Response createAccountRequest(AccountRequestPOSTRequest body,String xFapiFinancialId,String authorization,String xJwsSignature,String xFapiCustomerLastLoggedTime,String xFapiCustomerIpAddress,String xFapiInteractionId,SecurityContext securityContext)
      throws NotFoundException;
      public abstract Response deleteAccountRequest(String accountRequestId,String authorization,String xFapiFinancialId,SecurityContext securityContext)
      throws NotFoundException;
      public abstract Response getAccountRequest(String accountRequestId,String xFapiFinancialId,String authorization,String xFapiCustomerLastLoggedTime,String xFapiCustomerIpAddress,String xFapiInteractionId,SecurityContext securityContext)
      throws NotFoundException;
}
