package com.jeelis.psd2hub.server.api;

import com.jeelis.psd2hub.server.api.*;
import com.jeelis.psd2hub.server.model.*;


import com.jeelis.psd2hub.server.model.PaymentSubmissionPOSTRequest;
import com.jeelis.psd2hub.server.model.PaymentSubmitPOST201Response;

import java.util.List;
import com.jeelis.psd2hub.server.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2017-08-30T01:37:21.257+02:00")
public abstract class PaymentSubmissionsApiService {
      public abstract Response createPaymentSubmission(String xIdempotencyKey,String xFapiFinancialId,String authorization,String xJwsSignature,PaymentSubmissionPOSTRequest body,String xFapiCustomerLastLoggedTime,String xFapiCustomerIpAddress,String xFapiInteractionId,SecurityContext securityContext)
      throws NotFoundException;
      public abstract Response getPaymentSubmission(String paymentSubmissionId,String xFapiFinancialId,String authorization,String xFapiCustomerLastLoggedTime,String xFapiCustomerIpAddress,String xFapiInteractionId,SecurityContext securityContext)
      throws NotFoundException;
}
