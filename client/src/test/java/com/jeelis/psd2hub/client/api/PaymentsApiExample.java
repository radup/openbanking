package com.jeelis.psd2hub.client.api;

import com.jeelis.psd2hub.client.*;
import com.jeelis.psd2hub.client.auth.*;
import com.jeelis.psd2hub.client.model.*;
import com.jeelis.psd2hub.client.api.PaymentsApi;

import java.io.File;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.*;

public class PaymentsApiExample {

    public static void main(String[] args) throws Exception {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure OAuth2 access token for authorization: PSUOAuth2Security
        OAuth PSUOAuth2Security = (OAuth) defaultClient.getAuthentication("PSUOAuth2Security");
        PSUOAuth2Security.setAccessToken("YOUR ACCESS TOKEN");

        PaymentsApi apiInstance = new PaymentsApi();
        String xIdempotencyKey = "xIdempotencyKey_example"; // String | Every request will be processed only once per x-idempotency-key.  The Idempotency Key will be valid for 24 hours.
        String xFapiFinancialId = "xFapiFinancialId_example"; // String | The unique id of the ASPSP to which the request is issued. The unique id will be issued by OB.
        String authorization = "authorization_example"; // String | An Authorisation Token as per https://tools.ietf.org/html/rfc6750
        String xJwsSignature = "xJwsSignature_example"; // String | Header containing a detached JWS signature of the body of the payload.
        PaymentSubmissionPOSTRequest body = new PaymentSubmissionPOSTRequest(); // PaymentSubmissionPOSTRequest | Setup a single immediate payment
        
        PaymentSubmission pymSubmission = new PaymentSubmission();
        pymSubmission.setPaymentId(UUID.randomUUID().toString());
        body.setData(pymSubmission);
        
        String xFapiCustomerLastLoggedTime = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date()); // String | The time when the PSU last logged in with the TPP.
        String xFapiCustomerIpAddress = InetAddress.getLocalHost().getHostAddress(); // String | The PSU's IP address if the PSU is currently logged in with the TPP.
        String xFapiInteractionId = UUID.randomUUID().toString(); // String | An RFC4122 UID used as a correlation id.
        try {
            PaymentSubmitPOST201Response result = apiInstance.createPaymentSubmission(xIdempotencyKey, xFapiFinancialId, authorization, xJwsSignature, body, xFapiCustomerLastLoggedTime, xFapiCustomerIpAddress, xFapiInteractionId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PaymentsApi#createPaymentSubmission");
            e.printStackTrace();
        }
    }
}