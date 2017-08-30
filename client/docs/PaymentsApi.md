# PaymentsApi

All URIs are relative to *https://localhost/open-banking*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createPaymentSubmission**](PaymentsApi.md#createPaymentSubmission) | **POST** /payment-submissions | Create a payment submission
[**createSingleImmediatePayment**](PaymentsApi.md#createSingleImmediatePayment) | **POST** /payments | Create a single immediate payment
[**getPaymentSubmission**](PaymentsApi.md#getPaymentSubmission) | **GET** /payment-submissions/{PaymentSubmissionId} | Get a payment submission
[**getSingleImmediatePayment**](PaymentsApi.md#getSingleImmediatePayment) | **GET** /payments/{PaymentId} | Get a single immediate payment


<a name="createPaymentSubmission"></a>
# **createPaymentSubmission**
> PaymentSubmitPOST201Response createPaymentSubmission(xIdempotencyKey, xFapiFinancialId, authorization, xJwsSignature, body, xFapiCustomerLastLoggedTime, xFapiCustomerIpAddress, xFapiInteractionId)

Create a payment submission

Submit a previously setup payment

### Example
```java
// Import classes:
//import com.jeelis.psd2hub.client.ApiClient;
//import com.jeelis.psd2hub.client.ApiException;
//import com.jeelis.psd2hub.client.Configuration;
//import com.jeelis.psd2hub.client.auth.*;
//import com.jeelis.psd2hub.client.api.PaymentsApi;

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
String xFapiCustomerLastLoggedTime = "xFapiCustomerLastLoggedTime_example"; // String | The time when the PSU last logged in with the TPP.
String xFapiCustomerIpAddress = "xFapiCustomerIpAddress_example"; // String | The PSU's IP address if the PSU is currently logged in with the TPP.
String xFapiInteractionId = "xFapiInteractionId_example"; // String | An RFC4122 UID used as a correlation id.
try {
    PaymentSubmitPOST201Response result = apiInstance.createPaymentSubmission(xIdempotencyKey, xFapiFinancialId, authorization, xJwsSignature, body, xFapiCustomerLastLoggedTime, xFapiCustomerIpAddress, xFapiInteractionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentsApi#createPaymentSubmission");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xIdempotencyKey** | **String**| Every request will be processed only once per x-idempotency-key.  The Idempotency Key will be valid for 24 hours. |
 **xFapiFinancialId** | **String**| The unique id of the ASPSP to which the request is issued. The unique id will be issued by OB. |
 **authorization** | **String**| An Authorisation Token as per https://tools.ietf.org/html/rfc6750 |
 **xJwsSignature** | **String**| Header containing a detached JWS signature of the body of the payload. |
 **body** | [**PaymentSubmissionPOSTRequest**](PaymentSubmissionPOSTRequest.md)| Setup a single immediate payment |
 **xFapiCustomerLastLoggedTime** | **String**| The time when the PSU last logged in with the TPP. | [optional]
 **xFapiCustomerIpAddress** | **String**| The PSU&#39;s IP address if the PSU is currently logged in with the TPP. | [optional]
 **xFapiInteractionId** | **String**| An RFC4122 UID used as a correlation id. | [optional]

### Return type

[**PaymentSubmitPOST201Response**](PaymentSubmitPOST201Response.md)

### Authorization

[PSUOAuth2Security](../README.md#PSUOAuth2Security)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="createSingleImmediatePayment"></a>
# **createSingleImmediatePayment**
> PaymentSetupPOSTResponse createSingleImmediatePayment(xIdempotencyKey, xFapiFinancialId, authorization, xJwsSignature, body, xFapiCustomerLastLoggedTime, xFapiCustomerIpAddress, xFapiInteractionId)

Create a single immediate payment

Create a single immediate payment

### Example
```java
// Import classes:
//import com.jeelis.psd2hub.client.ApiClient;
//import com.jeelis.psd2hub.client.ApiException;
//import com.jeelis.psd2hub.client.Configuration;
//import com.jeelis.psd2hub.client.auth.*;
//import com.jeelis.psd2hub.client.api.PaymentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: TPPOAuth2Security
OAuth TPPOAuth2Security = (OAuth) defaultClient.getAuthentication("TPPOAuth2Security");
TPPOAuth2Security.setAccessToken("YOUR ACCESS TOKEN");

PaymentsApi apiInstance = new PaymentsApi();
String xIdempotencyKey = "xIdempotencyKey_example"; // String | Every request will be processed only once per x-idempotency-key.  The Idempotency Key will be valid for 24 hours.
String xFapiFinancialId = "xFapiFinancialId_example"; // String | The unique id of the ASPSP to which the request is issued. The unique id will be issued by OB.
String authorization = "authorization_example"; // String | An Authorisation Token as per https://tools.ietf.org/html/rfc6750
String xJwsSignature = "xJwsSignature_example"; // String | Header containing a detached JWS signature of the body of the payload.
PaymentSetupPOSTRequest body = new PaymentSetupPOSTRequest(); // PaymentSetupPOSTRequest | Setup a single immediate payment
String xFapiCustomerLastLoggedTime = "xFapiCustomerLastLoggedTime_example"; // String | The time when the PSU last logged in with the TPP.
String xFapiCustomerIpAddress = "xFapiCustomerIpAddress_example"; // String | The PSU's IP address if the PSU is currently logged in with the TPP.
String xFapiInteractionId = "xFapiInteractionId_example"; // String | An RFC4122 UID used as a correlation id.
try {
    PaymentSetupPOSTResponse result = apiInstance.createSingleImmediatePayment(xIdempotencyKey, xFapiFinancialId, authorization, xJwsSignature, body, xFapiCustomerLastLoggedTime, xFapiCustomerIpAddress, xFapiInteractionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentsApi#createSingleImmediatePayment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xIdempotencyKey** | **String**| Every request will be processed only once per x-idempotency-key.  The Idempotency Key will be valid for 24 hours. |
 **xFapiFinancialId** | **String**| The unique id of the ASPSP to which the request is issued. The unique id will be issued by OB. |
 **authorization** | **String**| An Authorisation Token as per https://tools.ietf.org/html/rfc6750 |
 **xJwsSignature** | **String**| Header containing a detached JWS signature of the body of the payload. |
 **body** | [**PaymentSetupPOSTRequest**](PaymentSetupPOSTRequest.md)| Setup a single immediate payment |
 **xFapiCustomerLastLoggedTime** | **String**| The time when the PSU last logged in with the TPP. | [optional]
 **xFapiCustomerIpAddress** | **String**| The PSU&#39;s IP address if the PSU is currently logged in with the TPP. | [optional]
 **xFapiInteractionId** | **String**| An RFC4122 UID used as a correlation id. | [optional]

### Return type

[**PaymentSetupPOSTResponse**](PaymentSetupPOSTResponse.md)

### Authorization

[TPPOAuth2Security](../README.md#TPPOAuth2Security)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPaymentSubmission"></a>
# **getPaymentSubmission**
> PaymentSubmitPOST201Response getPaymentSubmission(paymentSubmissionId, xFapiFinancialId, authorization, xFapiCustomerLastLoggedTime, xFapiCustomerIpAddress, xFapiInteractionId)

Get a payment submission

Get payment submission

### Example
```java
// Import classes:
//import com.jeelis.psd2hub.client.ApiClient;
//import com.jeelis.psd2hub.client.ApiException;
//import com.jeelis.psd2hub.client.Configuration;
//import com.jeelis.psd2hub.client.auth.*;
//import com.jeelis.psd2hub.client.api.PaymentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PSUOAuth2Security
OAuth PSUOAuth2Security = (OAuth) defaultClient.getAuthentication("PSUOAuth2Security");
PSUOAuth2Security.setAccessToken("YOUR ACCESS TOKEN");

// Configure OAuth2 access token for authorization: TPPOAuth2Security
OAuth TPPOAuth2Security = (OAuth) defaultClient.getAuthentication("TPPOAuth2Security");
TPPOAuth2Security.setAccessToken("YOUR ACCESS TOKEN");

PaymentsApi apiInstance = new PaymentsApi();
String paymentSubmissionId = "paymentSubmissionId_example"; // String | Unique identification as assigned by the ASPSP to uniquely identify the payment submission resource.
String xFapiFinancialId = "xFapiFinancialId_example"; // String | The unique id of the ASPSP to which the request is issued. The unique id will be issued by OB.
String authorization = "authorization_example"; // String | An Authorisation Token as per https://tools.ietf.org/html/rfc6750
String xFapiCustomerLastLoggedTime = "xFapiCustomerLastLoggedTime_example"; // String | The time when the PSU last logged in with the TPP.
String xFapiCustomerIpAddress = "xFapiCustomerIpAddress_example"; // String | The PSU's IP address if the PSU is currently logged in with the TPP.
String xFapiInteractionId = "xFapiInteractionId_example"; // String | An RFC4122 UID used as a correlation id.
try {
    PaymentSubmitPOST201Response result = apiInstance.getPaymentSubmission(paymentSubmissionId, xFapiFinancialId, authorization, xFapiCustomerLastLoggedTime, xFapiCustomerIpAddress, xFapiInteractionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentsApi#getPaymentSubmission");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **paymentSubmissionId** | **String**| Unique identification as assigned by the ASPSP to uniquely identify the payment submission resource. |
 **xFapiFinancialId** | **String**| The unique id of the ASPSP to which the request is issued. The unique id will be issued by OB. |
 **authorization** | **String**| An Authorisation Token as per https://tools.ietf.org/html/rfc6750 |
 **xFapiCustomerLastLoggedTime** | **String**| The time when the PSU last logged in with the TPP. | [optional]
 **xFapiCustomerIpAddress** | **String**| The PSU&#39;s IP address if the PSU is currently logged in with the TPP. | [optional]
 **xFapiInteractionId** | **String**| An RFC4122 UID used as a correlation id. | [optional]

### Return type

[**PaymentSubmitPOST201Response**](PaymentSubmitPOST201Response.md)

### Authorization

[PSUOAuth2Security](../README.md#PSUOAuth2Security), [TPPOAuth2Security](../README.md#TPPOAuth2Security)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getSingleImmediatePayment"></a>
# **getSingleImmediatePayment**
> PaymentSetupPOSTResponse getSingleImmediatePayment(paymentId, xFapiFinancialId, authorization, xFapiCustomerLastLoggedTime, xFapiCustomerIpAddress, xFapiInteractionId)

Get a single immediate payment

Get a single immediate payment

### Example
```java
// Import classes:
//import com.jeelis.psd2hub.client.ApiClient;
//import com.jeelis.psd2hub.client.ApiException;
//import com.jeelis.psd2hub.client.Configuration;
//import com.jeelis.psd2hub.client.auth.*;
//import com.jeelis.psd2hub.client.api.PaymentsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PSUOAuth2Security
OAuth PSUOAuth2Security = (OAuth) defaultClient.getAuthentication("PSUOAuth2Security");
PSUOAuth2Security.setAccessToken("YOUR ACCESS TOKEN");

// Configure OAuth2 access token for authorization: TPPOAuth2Security
OAuth TPPOAuth2Security = (OAuth) defaultClient.getAuthentication("TPPOAuth2Security");
TPPOAuth2Security.setAccessToken("YOUR ACCESS TOKEN");

PaymentsApi apiInstance = new PaymentsApi();
String paymentId = "paymentId_example"; // String | Unique identification as assigned by the ASPSP to uniquely identify the payment setup resource.
String xFapiFinancialId = "xFapiFinancialId_example"; // String | The unique id of the ASPSP to which the request is issued. The unique id will be issued by OB.
String authorization = "authorization_example"; // String | An Authorisation Token as per https://tools.ietf.org/html/rfc6750
String xFapiCustomerLastLoggedTime = "xFapiCustomerLastLoggedTime_example"; // String | The time when the PSU last logged in with the TPP.
String xFapiCustomerIpAddress = "xFapiCustomerIpAddress_example"; // String | The PSU's IP address if the PSU is currently logged in with the TPP.
String xFapiInteractionId = "xFapiInteractionId_example"; // String | An RFC4122 UID used as a correlation id.
try {
    PaymentSetupPOSTResponse result = apiInstance.getSingleImmediatePayment(paymentId, xFapiFinancialId, authorization, xFapiCustomerLastLoggedTime, xFapiCustomerIpAddress, xFapiInteractionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PaymentsApi#getSingleImmediatePayment");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **paymentId** | **String**| Unique identification as assigned by the ASPSP to uniquely identify the payment setup resource. |
 **xFapiFinancialId** | **String**| The unique id of the ASPSP to which the request is issued. The unique id will be issued by OB. |
 **authorization** | **String**| An Authorisation Token as per https://tools.ietf.org/html/rfc6750 |
 **xFapiCustomerLastLoggedTime** | **String**| The time when the PSU last logged in with the TPP. | [optional]
 **xFapiCustomerIpAddress** | **String**| The PSU&#39;s IP address if the PSU is currently logged in with the TPP. | [optional]
 **xFapiInteractionId** | **String**| An RFC4122 UID used as a correlation id. | [optional]

### Return type

[**PaymentSetupPOSTResponse**](PaymentSetupPOSTResponse.md)

### Authorization

[PSUOAuth2Security](../README.md#PSUOAuth2Security), [TPPOAuth2Security](../README.md#TPPOAuth2Security)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

