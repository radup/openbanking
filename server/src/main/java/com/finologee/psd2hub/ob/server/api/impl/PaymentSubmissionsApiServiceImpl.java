package com.finologee.psd2hub.ob.server.api.impl;

import com.finologee.psd2hub.ob.server.api.*;
import com.finologee.psd2hub.ob.server.model.*;

import java.util.List;
import java.util.logging.Logger;
import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2017-08-30T01:37:21.257+02:00")
public class PaymentSubmissionsApiServiceImpl extends PaymentSubmissionsApiService {

	private final static Logger LOGGER = Logger.getLogger(PaymentSubmissionsApiServiceImpl.class.getSimpleName());

	@Override
	public Response createPaymentSubmission(String xIdempotencyKey, String xFapiFinancialId, String authorization,
			String xJwsSignature, PaymentSubmissionPOSTRequest body, String xFapiCustomerLastLoggedTime,
			String xFapiCustomerIpAddress, String xFapiInteractionId, SecurityContext securityContext)
			throws NotFoundException {
		// do some magic!

		LOGGER.info("xFapiCustomerLastLoggedTime=" + xFapiCustomerLastLoggedTime + ", xFapiCustomerIpAddress="
				+ xFapiCustomerIpAddress + ", xFapiInteractionId=" + xFapiInteractionId);

		PaymentSubmission pymSubmission = body.getData();
		
		
		return Response.ok(pymSubmission).build();

		// return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
	}

	@Override
	public Response getPaymentSubmission(String paymentSubmissionId, String xFapiFinancialId, String authorization,
			String xFapiCustomerLastLoggedTime, String xFapiCustomerIpAddress, String xFapiInteractionId,
			SecurityContext securityContext) throws NotFoundException {
		// do some magic!
		return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, "magic!")).build();
	}
}
