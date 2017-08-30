package com.jeelis.psd2hub.server.api;

import com.jeelis.psd2hub.server.api.*;
import com.jeelis.psd2hub.server.model.*;


import com.jeelis.psd2hub.server.model.PaymentSetupPOSTRequest;
import com.jeelis.psd2hub.server.model.PaymentSetupPOSTResponse;

import java.util.List;
import com.jeelis.psd2hub.server.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2017-08-30T01:37:21.257+02:00")
public abstract class PaymentsApiService {
      public abstract Response createSingleImmediatePayment(String xIdempotencyKey,String xFapiFinancialId,String authorization,String xJwsSignature,PaymentSetupPOSTRequest body,String xFapiCustomerLastLoggedTime,String xFapiCustomerIpAddress,String xFapiInteractionId,SecurityContext securityContext)
      throws NotFoundException;
      public abstract Response getSingleImmediatePayment(String paymentId,String xFapiFinancialId,String authorization,String xFapiCustomerLastLoggedTime,String xFapiCustomerIpAddress,String xFapiInteractionId,SecurityContext securityContext)
      throws NotFoundException;
}
