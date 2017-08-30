# DefaultApi

All URIs are relative to *https://localhost/open-banking*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createAccountRequest**](DefaultApi.md#createAccountRequest) | **POST** /account-requests | Create an account request
[**deleteAccountRequest**](DefaultApi.md#deleteAccountRequest) | **DELETE** /account-requests/{AccountRequestId} | Delete an account request
[**getAccount**](DefaultApi.md#getAccount) | **GET** /accounts/{AccountId} | Get Account
[**getAccountBalances**](DefaultApi.md#getAccountBalances) | **GET** /accounts/{AccountId}/balances | Get Account Balances
[**getAccountBeneficiaries**](DefaultApi.md#getAccountBeneficiaries) | **GET** /accounts/{AccountId}/beneficiaries | Get Account Beneficiaries
[**getAccountDirectDebits**](DefaultApi.md#getAccountDirectDebits) | **GET** /accounts/{AccountId}/direct-debits | Get Account Direct Debits
[**getAccountProduct**](DefaultApi.md#getAccountProduct) | **GET** /accounts/{AccountId}/product | Get Account Product
[**getAccountRequest**](DefaultApi.md#getAccountRequest) | **GET** /account-requests/{AccountRequestId} | Get an account request
[**getAccountStandingOrders**](DefaultApi.md#getAccountStandingOrders) | **GET** /accounts/{AccountId}/standing-orders | Get Account Standing Orders
[**getAccountTransactions**](DefaultApi.md#getAccountTransactions) | **GET** /accounts/{AccountId}/transactions | Get Account Transactions
[**getAccounts**](DefaultApi.md#getAccounts) | **GET** /accounts | Get Accounts
[**getBalances**](DefaultApi.md#getBalances) | **GET** /balances | Get Balances
[**getBeneficiaries**](DefaultApi.md#getBeneficiaries) | **GET** /beneficiaries | Get Beneficiaries
[**getDirectDebits**](DefaultApi.md#getDirectDebits) | **GET** /direct-debits | Get Direct Debits
[**getProducts**](DefaultApi.md#getProducts) | **GET** /products | Get Products
[**getStandingOrders**](DefaultApi.md#getStandingOrders) | **GET** /standing-orders | Get Standing Orders
[**getTransactions**](DefaultApi.md#getTransactions) | **GET** /transactions | Get Transactions


<a name="createAccountRequest"></a>
# **createAccountRequest**
> AccountRequestPOSTResponse createAccountRequest(body, xFapiFinancialId, authorization, xJwsSignature, xFapiCustomerLastLoggedTime, xFapiCustomerIpAddress, xFapiInteractionId)

Create an account request

Create an account request

### Example
```java
// Import classes:
//import com.jeelis.psd2hub.client.ApiClient;
//import com.jeelis.psd2hub.client.ApiException;
//import com.jeelis.psd2hub.client.Configuration;
//import com.jeelis.psd2hub.client.auth.*;
//import com.jeelis.psd2hub.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: TPPOAuth2Security
OAuth TPPOAuth2Security = (OAuth) defaultClient.getAuthentication("TPPOAuth2Security");
TPPOAuth2Security.setAccessToken("YOUR ACCESS TOKEN");

DefaultApi apiInstance = new DefaultApi();
AccountRequestPOSTRequest body = new AccountRequestPOSTRequest(); // AccountRequestPOSTRequest | Create an Account Request
String xFapiFinancialId = "xFapiFinancialId_example"; // String | The unique id of the ASPSP to which the request is issued. The unique id will be issued by OB.
String authorization = "authorization_example"; // String | An Authorisation Token as per https://tools.ietf.org/html/rfc6750
String xJwsSignature = "xJwsSignature_example"; // String | Header containig a detached JWS signature of the body of the payload.
String xFapiCustomerLastLoggedTime = "xFapiCustomerLastLoggedTime_example"; // String | The time when the PSU last logged in with the TPP.
String xFapiCustomerIpAddress = "xFapiCustomerIpAddress_example"; // String | The PSU's IP address if the PSU is currently logged in with the TPP.
String xFapiInteractionId = "xFapiInteractionId_example"; // String | An RFC4122 UID used as a correlation id.
try {
    AccountRequestPOSTResponse result = apiInstance.createAccountRequest(body, xFapiFinancialId, authorization, xJwsSignature, xFapiCustomerLastLoggedTime, xFapiCustomerIpAddress, xFapiInteractionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#createAccountRequest");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**AccountRequestPOSTRequest**](AccountRequestPOSTRequest.md)| Create an Account Request |
 **xFapiFinancialId** | **String**| The unique id of the ASPSP to which the request is issued. The unique id will be issued by OB. |
 **authorization** | **String**| An Authorisation Token as per https://tools.ietf.org/html/rfc6750 |
 **xJwsSignature** | **String**| Header containig a detached JWS signature of the body of the payload. |
 **xFapiCustomerLastLoggedTime** | **String**| The time when the PSU last logged in with the TPP. | [optional]
 **xFapiCustomerIpAddress** | **String**| The PSU&#39;s IP address if the PSU is currently logged in with the TPP. | [optional]
 **xFapiInteractionId** | **String**| An RFC4122 UID used as a correlation id. | [optional]

### Return type

[**AccountRequestPOSTResponse**](AccountRequestPOSTResponse.md)

### Authorization

[TPPOAuth2Security](../README.md#TPPOAuth2Security)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteAccountRequest"></a>
# **deleteAccountRequest**
> deleteAccountRequest(accountRequestId, authorization, xFapiFinancialId)

Delete an account request

Delete an account request

### Example
```java
// Import classes:
//import com.jeelis.psd2hub.client.ApiClient;
//import com.jeelis.psd2hub.client.ApiException;
//import com.jeelis.psd2hub.client.Configuration;
//import com.jeelis.psd2hub.client.auth.*;
//import com.jeelis.psd2hub.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: TPPOAuth2Security
OAuth TPPOAuth2Security = (OAuth) defaultClient.getAuthentication("TPPOAuth2Security");
TPPOAuth2Security.setAccessToken("YOUR ACCESS TOKEN");

DefaultApi apiInstance = new DefaultApi();
String accountRequestId = "accountRequestId_example"; // String | Unique identification as assigned by the ASPSP to uniquely identify the account request resource.
String authorization = "authorization_example"; // String | An Authorisation Token as per https://tools.ietf.org/html/rfc6750
String xFapiFinancialId = "xFapiFinancialId_example"; // String | The unique id of the ASPSP to which the request is issued. The unique id will be issued by OB.
try {
    apiInstance.deleteAccountRequest(accountRequestId, authorization, xFapiFinancialId);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#deleteAccountRequest");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountRequestId** | **String**| Unique identification as assigned by the ASPSP to uniquely identify the account request resource. |
 **authorization** | **String**| An Authorisation Token as per https://tools.ietf.org/html/rfc6750 |
 **xFapiFinancialId** | **String**| The unique id of the ASPSP to which the request is issued. The unique id will be issued by OB. |

### Return type

null (empty response body)

### Authorization

[TPPOAuth2Security](../README.md#TPPOAuth2Security)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAccount"></a>
# **getAccount**
> AccountGETResponse getAccount(accountId, xFapiFinancialId, authorization, xFapiCustomerLastLoggedTime, xFapiCustomerIpAddress, xFapiInteractionId)

Get Account

Get an account

### Example
```java
// Import classes:
//import com.jeelis.psd2hub.client.ApiClient;
//import com.jeelis.psd2hub.client.ApiException;
//import com.jeelis.psd2hub.client.Configuration;
//import com.jeelis.psd2hub.client.auth.*;
//import com.jeelis.psd2hub.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PSUOAuth2Security
OAuth PSUOAuth2Security = (OAuth) defaultClient.getAuthentication("PSUOAuth2Security");
PSUOAuth2Security.setAccessToken("YOUR ACCESS TOKEN");

DefaultApi apiInstance = new DefaultApi();
String accountId = "accountId_example"; // String | A unique identifier used to identify the account resource.
String xFapiFinancialId = "xFapiFinancialId_example"; // String | The unique id of the ASPSP to which the request is issued. The unique id will be issued by OB.
String authorization = "authorization_example"; // String | An Authorisation Token as per https://tools.ietf.org/html/rfc6750
String xFapiCustomerLastLoggedTime = "xFapiCustomerLastLoggedTime_example"; // String | The time when the PSU last logged in with the TPP.
String xFapiCustomerIpAddress = "xFapiCustomerIpAddress_example"; // String | The PSU's IP address if the PSU is currently logged in with the TPP.
String xFapiInteractionId = "xFapiInteractionId_example"; // String | An RFC4122 UID used as a correlation id.
try {
    AccountGETResponse result = apiInstance.getAccount(accountId, xFapiFinancialId, authorization, xFapiCustomerLastLoggedTime, xFapiCustomerIpAddress, xFapiInteractionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getAccount");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **String**| A unique identifier used to identify the account resource. |
 **xFapiFinancialId** | **String**| The unique id of the ASPSP to which the request is issued. The unique id will be issued by OB. |
 **authorization** | **String**| An Authorisation Token as per https://tools.ietf.org/html/rfc6750 |
 **xFapiCustomerLastLoggedTime** | **String**| The time when the PSU last logged in with the TPP. | [optional]
 **xFapiCustomerIpAddress** | **String**| The PSU&#39;s IP address if the PSU is currently logged in with the TPP. | [optional]
 **xFapiInteractionId** | **String**| An RFC4122 UID used as a correlation id. | [optional]

### Return type

[**AccountGETResponse**](AccountGETResponse.md)

### Authorization

[PSUOAuth2Security](../README.md#PSUOAuth2Security)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAccountBalances"></a>
# **getAccountBalances**
> BalancesGETResponse getAccountBalances(accountId, xFapiFinancialId, authorization, xFapiCustomerLastLoggedTime, xFapiCustomerIpAddress, xFapiInteractionId)

Get Account Balances

Get Balances related to an account

### Example
```java
// Import classes:
//import com.jeelis.psd2hub.client.ApiClient;
//import com.jeelis.psd2hub.client.ApiException;
//import com.jeelis.psd2hub.client.Configuration;
//import com.jeelis.psd2hub.client.auth.*;
//import com.jeelis.psd2hub.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PSUOAuth2Security
OAuth PSUOAuth2Security = (OAuth) defaultClient.getAuthentication("PSUOAuth2Security");
PSUOAuth2Security.setAccessToken("YOUR ACCESS TOKEN");

DefaultApi apiInstance = new DefaultApi();
String accountId = "accountId_example"; // String | A unique identifier used to identify the account resource.
String xFapiFinancialId = "xFapiFinancialId_example"; // String | The unique id of the ASPSP to which the request is issued. The unique id will be issued by OB.
String authorization = "authorization_example"; // String | An Authorisation Token as per https://tools.ietf.org/html/rfc6750
String xFapiCustomerLastLoggedTime = "xFapiCustomerLastLoggedTime_example"; // String | The time when the PSU last logged in with the TPP.
String xFapiCustomerIpAddress = "xFapiCustomerIpAddress_example"; // String | The PSU's IP address if the PSU is currently logged in with the TPP.
String xFapiInteractionId = "xFapiInteractionId_example"; // String | An RFC4122 UID used as a correlation id.
try {
    BalancesGETResponse result = apiInstance.getAccountBalances(accountId, xFapiFinancialId, authorization, xFapiCustomerLastLoggedTime, xFapiCustomerIpAddress, xFapiInteractionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getAccountBalances");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **String**| A unique identifier used to identify the account resource. |
 **xFapiFinancialId** | **String**| The unique id of the ASPSP to which the request is issued. The unique id will be issued by OB. |
 **authorization** | **String**| An Authorisation Token as per https://tools.ietf.org/html/rfc6750 |
 **xFapiCustomerLastLoggedTime** | **String**| The time when the PSU last logged in with the TPP. | [optional]
 **xFapiCustomerIpAddress** | **String**| The PSU&#39;s IP address if the PSU is currently logged in with the TPP. | [optional]
 **xFapiInteractionId** | **String**| An RFC4122 UID used as a correlation id. | [optional]

### Return type

[**BalancesGETResponse**](BalancesGETResponse.md)

### Authorization

[PSUOAuth2Security](../README.md#PSUOAuth2Security)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAccountBeneficiaries"></a>
# **getAccountBeneficiaries**
> BeneficiariesGETResponse getAccountBeneficiaries(accountId, xFapiFinancialId, authorization, xFapiCustomerLastLoggedTime, xFapiCustomerIpAddress, xFapiInteractionId)

Get Account Beneficiaries

Get Beneficiaries related to an account

### Example
```java
// Import classes:
//import com.jeelis.psd2hub.client.ApiClient;
//import com.jeelis.psd2hub.client.ApiException;
//import com.jeelis.psd2hub.client.Configuration;
//import com.jeelis.psd2hub.client.auth.*;
//import com.jeelis.psd2hub.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PSUOAuth2Security
OAuth PSUOAuth2Security = (OAuth) defaultClient.getAuthentication("PSUOAuth2Security");
PSUOAuth2Security.setAccessToken("YOUR ACCESS TOKEN");

DefaultApi apiInstance = new DefaultApi();
String accountId = "accountId_example"; // String | A unique identifier used to identify the account resource.
String xFapiFinancialId = "xFapiFinancialId_example"; // String | The unique id of the ASPSP to which the request is issued. The unique id will be issued by OB.
String authorization = "authorization_example"; // String | An Authorisation Token as per https://tools.ietf.org/html/rfc6750
String xFapiCustomerLastLoggedTime = "xFapiCustomerLastLoggedTime_example"; // String | The time when the PSU last logged in with the TPP.
String xFapiCustomerIpAddress = "xFapiCustomerIpAddress_example"; // String | The PSU's IP address if the PSU is currently logged in with the TPP.
String xFapiInteractionId = "xFapiInteractionId_example"; // String | An RFC4122 UID used as a correlation id.
try {
    BeneficiariesGETResponse result = apiInstance.getAccountBeneficiaries(accountId, xFapiFinancialId, authorization, xFapiCustomerLastLoggedTime, xFapiCustomerIpAddress, xFapiInteractionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getAccountBeneficiaries");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **String**| A unique identifier used to identify the account resource. |
 **xFapiFinancialId** | **String**| The unique id of the ASPSP to which the request is issued. The unique id will be issued by OB. |
 **authorization** | **String**| An Authorisation Token as per https://tools.ietf.org/html/rfc6750 |
 **xFapiCustomerLastLoggedTime** | **String**| The time when the PSU last logged in with the TPP. | [optional]
 **xFapiCustomerIpAddress** | **String**| The PSU&#39;s IP address if the PSU is currently logged in with the TPP. | [optional]
 **xFapiInteractionId** | **String**| An RFC4122 UID used as a correlation id. | [optional]

### Return type

[**BeneficiariesGETResponse**](BeneficiariesGETResponse.md)

### Authorization

[PSUOAuth2Security](../README.md#PSUOAuth2Security)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAccountDirectDebits"></a>
# **getAccountDirectDebits**
> AccountGETResponse1 getAccountDirectDebits(accountId, xFapiFinancialId, authorization, xFapiCustomerLastLoggedTime, xFapiCustomerIpAddress, xFapiInteractionId)

Get Account Direct Debits

Get Direct Debits related to an account

### Example
```java
// Import classes:
//import com.jeelis.psd2hub.client.ApiClient;
//import com.jeelis.psd2hub.client.ApiException;
//import com.jeelis.psd2hub.client.Configuration;
//import com.jeelis.psd2hub.client.auth.*;
//import com.jeelis.psd2hub.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PSUOAuth2Security
OAuth PSUOAuth2Security = (OAuth) defaultClient.getAuthentication("PSUOAuth2Security");
PSUOAuth2Security.setAccessToken("YOUR ACCESS TOKEN");

DefaultApi apiInstance = new DefaultApi();
String accountId = "accountId_example"; // String | A unique identifier used to identify the account resource.
String xFapiFinancialId = "xFapiFinancialId_example"; // String | The unique id of the ASPSP to which the request is issued. The unique id will be issued by OB.
String authorization = "authorization_example"; // String | An Authorisation Token as per https://tools.ietf.org/html/rfc6750
String xFapiCustomerLastLoggedTime = "xFapiCustomerLastLoggedTime_example"; // String | The time when the PSU last logged in with the TPP.
String xFapiCustomerIpAddress = "xFapiCustomerIpAddress_example"; // String | The PSU's IP address if the PSU is currently logged in with the TPP.
String xFapiInteractionId = "xFapiInteractionId_example"; // String | An RFC4122 UID used as a correlation id.
try {
    AccountGETResponse1 result = apiInstance.getAccountDirectDebits(accountId, xFapiFinancialId, authorization, xFapiCustomerLastLoggedTime, xFapiCustomerIpAddress, xFapiInteractionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getAccountDirectDebits");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **String**| A unique identifier used to identify the account resource. |
 **xFapiFinancialId** | **String**| The unique id of the ASPSP to which the request is issued. The unique id will be issued by OB. |
 **authorization** | **String**| An Authorisation Token as per https://tools.ietf.org/html/rfc6750 |
 **xFapiCustomerLastLoggedTime** | **String**| The time when the PSU last logged in with the TPP. | [optional]
 **xFapiCustomerIpAddress** | **String**| The PSU&#39;s IP address if the PSU is currently logged in with the TPP. | [optional]
 **xFapiInteractionId** | **String**| An RFC4122 UID used as a correlation id. | [optional]

### Return type

[**AccountGETResponse1**](AccountGETResponse1.md)

### Authorization

[PSUOAuth2Security](../README.md#PSUOAuth2Security)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAccountProduct"></a>
# **getAccountProduct**
> ProductGETResponse getAccountProduct(accountId, xFapiFinancialId, authorization, xFapiCustomerLastLoggedTime, xFapiCustomerIpAddress, xFapiInteractionId)

Get Account Product

Get Product related to an account

### Example
```java
// Import classes:
//import com.jeelis.psd2hub.client.ApiClient;
//import com.jeelis.psd2hub.client.ApiException;
//import com.jeelis.psd2hub.client.Configuration;
//import com.jeelis.psd2hub.client.auth.*;
//import com.jeelis.psd2hub.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PSUOAuth2Security
OAuth PSUOAuth2Security = (OAuth) defaultClient.getAuthentication("PSUOAuth2Security");
PSUOAuth2Security.setAccessToken("YOUR ACCESS TOKEN");

DefaultApi apiInstance = new DefaultApi();
String accountId = "accountId_example"; // String | A unique identifier used to identify the account resource.
String xFapiFinancialId = "xFapiFinancialId_example"; // String | The unique id of the ASPSP to which the request is issued. The unique id will be issued by OB.
String authorization = "authorization_example"; // String | An Authorisation Token as per https://tools.ietf.org/html/rfc6750
String xFapiCustomerLastLoggedTime = "xFapiCustomerLastLoggedTime_example"; // String | The time when the PSU last logged in with the TPP.
String xFapiCustomerIpAddress = "xFapiCustomerIpAddress_example"; // String | The PSU's IP address if the PSU is currently logged in with the TPP.
String xFapiInteractionId = "xFapiInteractionId_example"; // String | An RFC4122 UID used as a correlation id.
try {
    ProductGETResponse result = apiInstance.getAccountProduct(accountId, xFapiFinancialId, authorization, xFapiCustomerLastLoggedTime, xFapiCustomerIpAddress, xFapiInteractionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getAccountProduct");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **String**| A unique identifier used to identify the account resource. |
 **xFapiFinancialId** | **String**| The unique id of the ASPSP to which the request is issued. The unique id will be issued by OB. |
 **authorization** | **String**| An Authorisation Token as per https://tools.ietf.org/html/rfc6750 |
 **xFapiCustomerLastLoggedTime** | **String**| The time when the PSU last logged in with the TPP. | [optional]
 **xFapiCustomerIpAddress** | **String**| The PSU&#39;s IP address if the PSU is currently logged in with the TPP. | [optional]
 **xFapiInteractionId** | **String**| An RFC4122 UID used as a correlation id. | [optional]

### Return type

[**ProductGETResponse**](ProductGETResponse.md)

### Authorization

[PSUOAuth2Security](../README.md#PSUOAuth2Security)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAccountRequest"></a>
# **getAccountRequest**
> AccountRequestPOSTResponse getAccountRequest(accountRequestId, xFapiFinancialId, authorization, xFapiCustomerLastLoggedTime, xFapiCustomerIpAddress, xFapiInteractionId)

Get an account request

Get an account request

### Example
```java
// Import classes:
//import com.jeelis.psd2hub.client.ApiClient;
//import com.jeelis.psd2hub.client.ApiException;
//import com.jeelis.psd2hub.client.Configuration;
//import com.jeelis.psd2hub.client.auth.*;
//import com.jeelis.psd2hub.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: TPPOAuth2Security
OAuth TPPOAuth2Security = (OAuth) defaultClient.getAuthentication("TPPOAuth2Security");
TPPOAuth2Security.setAccessToken("YOUR ACCESS TOKEN");

DefaultApi apiInstance = new DefaultApi();
String accountRequestId = "accountRequestId_example"; // String | Unique identification as assigned by the ASPSP to uniquely identify the account request resource.
String xFapiFinancialId = "xFapiFinancialId_example"; // String | The unique id of the ASPSP to which the request is issued. The unique id will be issued by OB.
String authorization = "authorization_example"; // String | An Authorisation Token as per https://tools.ietf.org/html/rfc6750
String xFapiCustomerLastLoggedTime = "xFapiCustomerLastLoggedTime_example"; // String | The time when the PSU last logged in with the TPP.
String xFapiCustomerIpAddress = "xFapiCustomerIpAddress_example"; // String | The PSU's IP address if the PSU is currently logged in with the TPP.
String xFapiInteractionId = "xFapiInteractionId_example"; // String | An RFC4122 UID used as a correlation id.
try {
    AccountRequestPOSTResponse result = apiInstance.getAccountRequest(accountRequestId, xFapiFinancialId, authorization, xFapiCustomerLastLoggedTime, xFapiCustomerIpAddress, xFapiInteractionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getAccountRequest");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountRequestId** | **String**| Unique identification as assigned by the ASPSP to uniquely identify the account request resource. |
 **xFapiFinancialId** | **String**| The unique id of the ASPSP to which the request is issued. The unique id will be issued by OB. |
 **authorization** | **String**| An Authorisation Token as per https://tools.ietf.org/html/rfc6750 |
 **xFapiCustomerLastLoggedTime** | **String**| The time when the PSU last logged in with the TPP. | [optional]
 **xFapiCustomerIpAddress** | **String**| The PSU&#39;s IP address if the PSU is currently logged in with the TPP. | [optional]
 **xFapiInteractionId** | **String**| An RFC4122 UID used as a correlation id. | [optional]

### Return type

[**AccountRequestPOSTResponse**](AccountRequestPOSTResponse.md)

### Authorization

[TPPOAuth2Security](../README.md#TPPOAuth2Security)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAccountStandingOrders"></a>
# **getAccountStandingOrders**
> StandingOrdersGETResponse getAccountStandingOrders(accountId, xFapiFinancialId, authorization, xFapiCustomerLastLoggedTime, xFapiCustomerIpAddress, xFapiInteractionId)

Get Account Standing Orders

Get Standing Orders related to an account

### Example
```java
// Import classes:
//import com.jeelis.psd2hub.client.ApiClient;
//import com.jeelis.psd2hub.client.ApiException;
//import com.jeelis.psd2hub.client.Configuration;
//import com.jeelis.psd2hub.client.auth.*;
//import com.jeelis.psd2hub.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PSUOAuth2Security
OAuth PSUOAuth2Security = (OAuth) defaultClient.getAuthentication("PSUOAuth2Security");
PSUOAuth2Security.setAccessToken("YOUR ACCESS TOKEN");

DefaultApi apiInstance = new DefaultApi();
String accountId = "accountId_example"; // String | A unique identifier used to identify the account resource.
String xFapiFinancialId = "xFapiFinancialId_example"; // String | The unique id of the ASPSP to which the request is issued. The unique id will be issued by OB.
String authorization = "authorization_example"; // String | An Authorisation Token as per https://tools.ietf.org/html/rfc6750
String xFapiCustomerLastLoggedTime = "xFapiCustomerLastLoggedTime_example"; // String | The time when the PSU last logged in with the TPP.
String xFapiCustomerIpAddress = "xFapiCustomerIpAddress_example"; // String | The PSU's IP address if the PSU is currently logged in with the TPP.
String xFapiInteractionId = "xFapiInteractionId_example"; // String | An RFC4122 UID used as a correlation id.
try {
    StandingOrdersGETResponse result = apiInstance.getAccountStandingOrders(accountId, xFapiFinancialId, authorization, xFapiCustomerLastLoggedTime, xFapiCustomerIpAddress, xFapiInteractionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getAccountStandingOrders");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **String**| A unique identifier used to identify the account resource. |
 **xFapiFinancialId** | **String**| The unique id of the ASPSP to which the request is issued. The unique id will be issued by OB. |
 **authorization** | **String**| An Authorisation Token as per https://tools.ietf.org/html/rfc6750 |
 **xFapiCustomerLastLoggedTime** | **String**| The time when the PSU last logged in with the TPP. | [optional]
 **xFapiCustomerIpAddress** | **String**| The PSU&#39;s IP address if the PSU is currently logged in with the TPP. | [optional]
 **xFapiInteractionId** | **String**| An RFC4122 UID used as a correlation id. | [optional]

### Return type

[**StandingOrdersGETResponse**](StandingOrdersGETResponse.md)

### Authorization

[PSUOAuth2Security](../README.md#PSUOAuth2Security)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAccountTransactions"></a>
# **getAccountTransactions**
> AccountTransactionsGETResponse getAccountTransactions(accountId, xFapiFinancialId, authorization, fromBookingDateTime, toBookingDateTime, xFapiCustomerLastLoggedTime, xFapiCustomerIpAddress, xFapiInteractionId)

Get Account Transactions

Get transactions related to an account

### Example
```java
// Import classes:
//import com.jeelis.psd2hub.client.ApiClient;
//import com.jeelis.psd2hub.client.ApiException;
//import com.jeelis.psd2hub.client.Configuration;
//import com.jeelis.psd2hub.client.auth.*;
//import com.jeelis.psd2hub.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PSUOAuth2Security
OAuth PSUOAuth2Security = (OAuth) defaultClient.getAuthentication("PSUOAuth2Security");
PSUOAuth2Security.setAccessToken("YOUR ACCESS TOKEN");

DefaultApi apiInstance = new DefaultApi();
String accountId = "accountId_example"; // String | A unique identifier used to identify the account resource.
String xFapiFinancialId = "xFapiFinancialId_example"; // String | The unique id of the ASPSP to which the request is issued. The unique id will be issued by OB.
String authorization = "authorization_example"; // String | An Authorisation Token as per https://tools.ietf.org/html/rfc6750
DateTime fromBookingDateTime = new DateTime(); // DateTime | The UTC ISO 8601 Date Time to filter transactions FROM - NB Time component is optional - set to 00:00:00 for just Date
DateTime toBookingDateTime = new DateTime(); // DateTime | The UTC ISO 8601 Date Time to filter transactions TO - NB Time component is optional - set to 00:00:00 for just Date
String xFapiCustomerLastLoggedTime = "xFapiCustomerLastLoggedTime_example"; // String | The time when the PSU last logged in with the TPP.
String xFapiCustomerIpAddress = "xFapiCustomerIpAddress_example"; // String | The PSU's IP address if the PSU is currently logged in with the TPP.
String xFapiInteractionId = "xFapiInteractionId_example"; // String | An RFC4122 UID used as a correlation id.
try {
    AccountTransactionsGETResponse result = apiInstance.getAccountTransactions(accountId, xFapiFinancialId, authorization, fromBookingDateTime, toBookingDateTime, xFapiCustomerLastLoggedTime, xFapiCustomerIpAddress, xFapiInteractionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getAccountTransactions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **accountId** | **String**| A unique identifier used to identify the account resource. |
 **xFapiFinancialId** | **String**| The unique id of the ASPSP to which the request is issued. The unique id will be issued by OB. |
 **authorization** | **String**| An Authorisation Token as per https://tools.ietf.org/html/rfc6750 |
 **fromBookingDateTime** | **DateTime**| The UTC ISO 8601 Date Time to filter transactions FROM - NB Time component is optional - set to 00:00:00 for just Date | [optional]
 **toBookingDateTime** | **DateTime**| The UTC ISO 8601 Date Time to filter transactions TO - NB Time component is optional - set to 00:00:00 for just Date | [optional]
 **xFapiCustomerLastLoggedTime** | **String**| The time when the PSU last logged in with the TPP. | [optional]
 **xFapiCustomerIpAddress** | **String**| The PSU&#39;s IP address if the PSU is currently logged in with the TPP. | [optional]
 **xFapiInteractionId** | **String**| An RFC4122 UID used as a correlation id. | [optional]

### Return type

[**AccountTransactionsGETResponse**](AccountTransactionsGETResponse.md)

### Authorization

[PSUOAuth2Security](../README.md#PSUOAuth2Security)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAccounts"></a>
# **getAccounts**
> AccountGETResponse getAccounts(xFapiFinancialId, authorization, xFapiCustomerLastLoggedTime, xFapiCustomerIpAddress, xFapiInteractionId)

Get Accounts

Get a list of accounts

### Example
```java
// Import classes:
//import com.jeelis.psd2hub.client.ApiClient;
//import com.jeelis.psd2hub.client.ApiException;
//import com.jeelis.psd2hub.client.Configuration;
//import com.jeelis.psd2hub.client.auth.*;
//import com.jeelis.psd2hub.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PSUOAuth2Security
OAuth PSUOAuth2Security = (OAuth) defaultClient.getAuthentication("PSUOAuth2Security");
PSUOAuth2Security.setAccessToken("YOUR ACCESS TOKEN");

DefaultApi apiInstance = new DefaultApi();
String xFapiFinancialId = "xFapiFinancialId_example"; // String | The unique id of the ASPSP to which the request is issued. The unique id will be issued by OB.
String authorization = "authorization_example"; // String | An Authorisation Token as per https://tools.ietf.org/html/rfc6750
String xFapiCustomerLastLoggedTime = "xFapiCustomerLastLoggedTime_example"; // String | The time when the PSU last logged in with the TPP.
String xFapiCustomerIpAddress = "xFapiCustomerIpAddress_example"; // String | The PSU's IP address if the PSU is currently logged in with the TPP.
String xFapiInteractionId = "xFapiInteractionId_example"; // String | An RFC4122 UID used as a correlation id.
try {
    AccountGETResponse result = apiInstance.getAccounts(xFapiFinancialId, authorization, xFapiCustomerLastLoggedTime, xFapiCustomerIpAddress, xFapiInteractionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getAccounts");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xFapiFinancialId** | **String**| The unique id of the ASPSP to which the request is issued. The unique id will be issued by OB. |
 **authorization** | **String**| An Authorisation Token as per https://tools.ietf.org/html/rfc6750 |
 **xFapiCustomerLastLoggedTime** | **String**| The time when the PSU last logged in with the TPP. | [optional]
 **xFapiCustomerIpAddress** | **String**| The PSU&#39;s IP address if the PSU is currently logged in with the TPP. | [optional]
 **xFapiInteractionId** | **String**| An RFC4122 UID used as a correlation id. | [optional]

### Return type

[**AccountGETResponse**](AccountGETResponse.md)

### Authorization

[PSUOAuth2Security](../README.md#PSUOAuth2Security)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBalances"></a>
# **getBalances**
> BalancesGETResponse getBalances(xFapiFinancialId, authorization, xFapiCustomerLastLoggedTime, xFapiCustomerIpAddress, xFapiInteractionId)

Get Balances

Get Balances

### Example
```java
// Import classes:
//import com.jeelis.psd2hub.client.ApiClient;
//import com.jeelis.psd2hub.client.ApiException;
//import com.jeelis.psd2hub.client.Configuration;
//import com.jeelis.psd2hub.client.auth.*;
//import com.jeelis.psd2hub.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PSUOAuth2Security
OAuth PSUOAuth2Security = (OAuth) defaultClient.getAuthentication("PSUOAuth2Security");
PSUOAuth2Security.setAccessToken("YOUR ACCESS TOKEN");

DefaultApi apiInstance = new DefaultApi();
String xFapiFinancialId = "xFapiFinancialId_example"; // String | The unique id of the ASPSP to which the request is issued. The unique id will be issued by OB.
String authorization = "authorization_example"; // String | An Authorisation Token as per https://tools.ietf.org/html/rfc6750
String xFapiCustomerLastLoggedTime = "xFapiCustomerLastLoggedTime_example"; // String | The time when the PSU last logged in with the TPP.
String xFapiCustomerIpAddress = "xFapiCustomerIpAddress_example"; // String | The PSU's IP address if the PSU is currently logged in with the TPP.
String xFapiInteractionId = "xFapiInteractionId_example"; // String | An RFC4122 UID used as a correlation id.
try {
    BalancesGETResponse result = apiInstance.getBalances(xFapiFinancialId, authorization, xFapiCustomerLastLoggedTime, xFapiCustomerIpAddress, xFapiInteractionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getBalances");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xFapiFinancialId** | **String**| The unique id of the ASPSP to which the request is issued. The unique id will be issued by OB. |
 **authorization** | **String**| An Authorisation Token as per https://tools.ietf.org/html/rfc6750 |
 **xFapiCustomerLastLoggedTime** | **String**| The time when the PSU last logged in with the TPP. | [optional]
 **xFapiCustomerIpAddress** | **String**| The PSU&#39;s IP address if the PSU is currently logged in with the TPP. | [optional]
 **xFapiInteractionId** | **String**| An RFC4122 UID used as a correlation id. | [optional]

### Return type

[**BalancesGETResponse**](BalancesGETResponse.md)

### Authorization

[PSUOAuth2Security](../README.md#PSUOAuth2Security)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBeneficiaries"></a>
# **getBeneficiaries**
> BeneficiariesGETResponse getBeneficiaries(xFapiFinancialId, authorization, xFapiCustomerLastLoggedTime, xFapiCustomerIpAddress, xFapiInteractionId)

Get Beneficiaries

Get Beneficiaries

### Example
```java
// Import classes:
//import com.jeelis.psd2hub.client.ApiClient;
//import com.jeelis.psd2hub.client.ApiException;
//import com.jeelis.psd2hub.client.Configuration;
//import com.jeelis.psd2hub.client.auth.*;
//import com.jeelis.psd2hub.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PSUOAuth2Security
OAuth PSUOAuth2Security = (OAuth) defaultClient.getAuthentication("PSUOAuth2Security");
PSUOAuth2Security.setAccessToken("YOUR ACCESS TOKEN");

DefaultApi apiInstance = new DefaultApi();
String xFapiFinancialId = "xFapiFinancialId_example"; // String | The unique id of the ASPSP to which the request is issued. The unique id will be issued by OB.
String authorization = "authorization_example"; // String | An Authorisation Token as per https://tools.ietf.org/html/rfc6750
String xFapiCustomerLastLoggedTime = "xFapiCustomerLastLoggedTime_example"; // String | The time when the PSU last logged in with the TPP.
String xFapiCustomerIpAddress = "xFapiCustomerIpAddress_example"; // String | The PSU's IP address if the PSU is currently logged in with the TPP.
String xFapiInteractionId = "xFapiInteractionId_example"; // String | An RFC4122 UID used as a correlation id.
try {
    BeneficiariesGETResponse result = apiInstance.getBeneficiaries(xFapiFinancialId, authorization, xFapiCustomerLastLoggedTime, xFapiCustomerIpAddress, xFapiInteractionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getBeneficiaries");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xFapiFinancialId** | **String**| The unique id of the ASPSP to which the request is issued. The unique id will be issued by OB. |
 **authorization** | **String**| An Authorisation Token as per https://tools.ietf.org/html/rfc6750 |
 **xFapiCustomerLastLoggedTime** | **String**| The time when the PSU last logged in with the TPP. | [optional]
 **xFapiCustomerIpAddress** | **String**| The PSU&#39;s IP address if the PSU is currently logged in with the TPP. | [optional]
 **xFapiInteractionId** | **String**| An RFC4122 UID used as a correlation id. | [optional]

### Return type

[**BeneficiariesGETResponse**](BeneficiariesGETResponse.md)

### Authorization

[PSUOAuth2Security](../README.md#PSUOAuth2Security)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDirectDebits"></a>
# **getDirectDebits**
> AccountGETResponse1 getDirectDebits(xFapiFinancialId, authorization, xFapiCustomerLastLoggedTime, xFapiCustomerIpAddress, xFapiInteractionId)

Get Direct Debits

Get Direct Debits

### Example
```java
// Import classes:
//import com.jeelis.psd2hub.client.ApiClient;
//import com.jeelis.psd2hub.client.ApiException;
//import com.jeelis.psd2hub.client.Configuration;
//import com.jeelis.psd2hub.client.auth.*;
//import com.jeelis.psd2hub.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PSUOAuth2Security
OAuth PSUOAuth2Security = (OAuth) defaultClient.getAuthentication("PSUOAuth2Security");
PSUOAuth2Security.setAccessToken("YOUR ACCESS TOKEN");

DefaultApi apiInstance = new DefaultApi();
String xFapiFinancialId = "xFapiFinancialId_example"; // String | The unique id of the ASPSP to which the request is issued. The unique id will be issued by OB.
String authorization = "authorization_example"; // String | An Authorisation Token as per https://tools.ietf.org/html/rfc6750
String xFapiCustomerLastLoggedTime = "xFapiCustomerLastLoggedTime_example"; // String | The time when the PSU last logged in with the TPP.
String xFapiCustomerIpAddress = "xFapiCustomerIpAddress_example"; // String | The PSU's IP address if the PSU is currently logged in with the TPP.
String xFapiInteractionId = "xFapiInteractionId_example"; // String | An RFC4122 UID used as a correlation id.
try {
    AccountGETResponse1 result = apiInstance.getDirectDebits(xFapiFinancialId, authorization, xFapiCustomerLastLoggedTime, xFapiCustomerIpAddress, xFapiInteractionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getDirectDebits");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xFapiFinancialId** | **String**| The unique id of the ASPSP to which the request is issued. The unique id will be issued by OB. |
 **authorization** | **String**| An Authorisation Token as per https://tools.ietf.org/html/rfc6750 |
 **xFapiCustomerLastLoggedTime** | **String**| The time when the PSU last logged in with the TPP. | [optional]
 **xFapiCustomerIpAddress** | **String**| The PSU&#39;s IP address if the PSU is currently logged in with the TPP. | [optional]
 **xFapiInteractionId** | **String**| An RFC4122 UID used as a correlation id. | [optional]

### Return type

[**AccountGETResponse1**](AccountGETResponse1.md)

### Authorization

[PSUOAuth2Security](../README.md#PSUOAuth2Security)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getProducts"></a>
# **getProducts**
> ProductGETResponse getProducts(xFapiFinancialId, authorization, xFapiCustomerLastLoggedTime, xFapiCustomerIpAddress, xFapiInteractionId)

Get Products

Get Products

### Example
```java
// Import classes:
//import com.jeelis.psd2hub.client.ApiClient;
//import com.jeelis.psd2hub.client.ApiException;
//import com.jeelis.psd2hub.client.Configuration;
//import com.jeelis.psd2hub.client.auth.*;
//import com.jeelis.psd2hub.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PSUOAuth2Security
OAuth PSUOAuth2Security = (OAuth) defaultClient.getAuthentication("PSUOAuth2Security");
PSUOAuth2Security.setAccessToken("YOUR ACCESS TOKEN");

DefaultApi apiInstance = new DefaultApi();
String xFapiFinancialId = "xFapiFinancialId_example"; // String | The unique id of the ASPSP to which the request is issued. The unique id will be issued by OB.
String authorization = "authorization_example"; // String | An Authorisation Token as per https://tools.ietf.org/html/rfc6750
String xFapiCustomerLastLoggedTime = "xFapiCustomerLastLoggedTime_example"; // String | The time when the PSU last logged in with the TPP.
String xFapiCustomerIpAddress = "xFapiCustomerIpAddress_example"; // String | The PSU's IP address if the PSU is currently logged in with the TPP.
String xFapiInteractionId = "xFapiInteractionId_example"; // String | An RFC4122 UID used as a correlation id.
try {
    ProductGETResponse result = apiInstance.getProducts(xFapiFinancialId, authorization, xFapiCustomerLastLoggedTime, xFapiCustomerIpAddress, xFapiInteractionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getProducts");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xFapiFinancialId** | **String**| The unique id of the ASPSP to which the request is issued. The unique id will be issued by OB. |
 **authorization** | **String**| An Authorisation Token as per https://tools.ietf.org/html/rfc6750 |
 **xFapiCustomerLastLoggedTime** | **String**| The time when the PSU last logged in with the TPP. | [optional]
 **xFapiCustomerIpAddress** | **String**| The PSU&#39;s IP address if the PSU is currently logged in with the TPP. | [optional]
 **xFapiInteractionId** | **String**| An RFC4122 UID used as a correlation id. | [optional]

### Return type

[**ProductGETResponse**](ProductGETResponse.md)

### Authorization

[PSUOAuth2Security](../README.md#PSUOAuth2Security)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getStandingOrders"></a>
# **getStandingOrders**
> StandingOrdersGETResponse getStandingOrders(xFapiFinancialId, authorization, xFapiCustomerLastLoggedTime, xFapiCustomerIpAddress, xFapiInteractionId)

Get Standing Orders

Get Standing Orders

### Example
```java
// Import classes:
//import com.jeelis.psd2hub.client.ApiClient;
//import com.jeelis.psd2hub.client.ApiException;
//import com.jeelis.psd2hub.client.Configuration;
//import com.jeelis.psd2hub.client.auth.*;
//import com.jeelis.psd2hub.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PSUOAuth2Security
OAuth PSUOAuth2Security = (OAuth) defaultClient.getAuthentication("PSUOAuth2Security");
PSUOAuth2Security.setAccessToken("YOUR ACCESS TOKEN");

DefaultApi apiInstance = new DefaultApi();
String xFapiFinancialId = "xFapiFinancialId_example"; // String | The unique id of the ASPSP to which the request is issued. The unique id will be issued by OB.
String authorization = "authorization_example"; // String | An Authorisation Token as per https://tools.ietf.org/html/rfc6750
String xFapiCustomerLastLoggedTime = "xFapiCustomerLastLoggedTime_example"; // String | The time when the PSU last logged in with the TPP.
String xFapiCustomerIpAddress = "xFapiCustomerIpAddress_example"; // String | The PSU's IP address if the PSU is currently logged in with the TPP.
String xFapiInteractionId = "xFapiInteractionId_example"; // String | An RFC4122 UID used as a correlation id.
try {
    StandingOrdersGETResponse result = apiInstance.getStandingOrders(xFapiFinancialId, authorization, xFapiCustomerLastLoggedTime, xFapiCustomerIpAddress, xFapiInteractionId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getStandingOrders");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xFapiFinancialId** | **String**| The unique id of the ASPSP to which the request is issued. The unique id will be issued by OB. |
 **authorization** | **String**| An Authorisation Token as per https://tools.ietf.org/html/rfc6750 |
 **xFapiCustomerLastLoggedTime** | **String**| The time when the PSU last logged in with the TPP. | [optional]
 **xFapiCustomerIpAddress** | **String**| The PSU&#39;s IP address if the PSU is currently logged in with the TPP. | [optional]
 **xFapiInteractionId** | **String**| An RFC4122 UID used as a correlation id. | [optional]

### Return type

[**StandingOrdersGETResponse**](StandingOrdersGETResponse.md)

### Authorization

[PSUOAuth2Security](../README.md#PSUOAuth2Security)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getTransactions"></a>
# **getTransactions**
> AccountTransactionsGETResponse getTransactions(xFapiFinancialId, authorization, xFapiCustomerLastLoggedTime, xFapiCustomerIpAddress, xFapiInteractionId, fromBookingDateTime, toBookingDateTime)

Get Transactions

Get Transactions

### Example
```java
// Import classes:
//import com.jeelis.psd2hub.client.ApiClient;
//import com.jeelis.psd2hub.client.ApiException;
//import com.jeelis.psd2hub.client.Configuration;
//import com.jeelis.psd2hub.client.auth.*;
//import com.jeelis.psd2hub.client.api.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure OAuth2 access token for authorization: PSUOAuth2Security
OAuth PSUOAuth2Security = (OAuth) defaultClient.getAuthentication("PSUOAuth2Security");
PSUOAuth2Security.setAccessToken("YOUR ACCESS TOKEN");

DefaultApi apiInstance = new DefaultApi();
String xFapiFinancialId = "xFapiFinancialId_example"; // String | The unique id of the ASPSP to which the request is issued. The unique id will be issued by OB.
String authorization = "authorization_example"; // String | An Authorisation Token as per https://tools.ietf.org/html/rfc6750
String xFapiCustomerLastLoggedTime = "xFapiCustomerLastLoggedTime_example"; // String | The time when the PSU last logged in with the TPP.
String xFapiCustomerIpAddress = "xFapiCustomerIpAddress_example"; // String | The PSU's IP address if the PSU is currently logged in with the TPP.
String xFapiInteractionId = "xFapiInteractionId_example"; // String | An RFC4122 UID used as a correlation id.
DateTime fromBookingDateTime = new DateTime(); // DateTime | The UTC ISO 8601 Date Time to filter transactions FROM - NB Time component is optional - set to 00:00:00 for just Date
DateTime toBookingDateTime = new DateTime(); // DateTime | The UTC ISO 8601 Date Time to filter transactions TO - NB Time component is optional - set to 00:00:00 for just Date
try {
    AccountTransactionsGETResponse result = apiInstance.getTransactions(xFapiFinancialId, authorization, xFapiCustomerLastLoggedTime, xFapiCustomerIpAddress, xFapiInteractionId, fromBookingDateTime, toBookingDateTime);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getTransactions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **xFapiFinancialId** | **String**| The unique id of the ASPSP to which the request is issued. The unique id will be issued by OB. |
 **authorization** | **String**| An Authorisation Token as per https://tools.ietf.org/html/rfc6750 |
 **xFapiCustomerLastLoggedTime** | **String**| The time when the PSU last logged in with the TPP. | [optional]
 **xFapiCustomerIpAddress** | **String**| The PSU&#39;s IP address if the PSU is currently logged in with the TPP. | [optional]
 **xFapiInteractionId** | **String**| An RFC4122 UID used as a correlation id. | [optional]
 **fromBookingDateTime** | **DateTime**| The UTC ISO 8601 Date Time to filter transactions FROM - NB Time component is optional - set to 00:00:00 for just Date | [optional]
 **toBookingDateTime** | **DateTime**| The UTC ISO 8601 Date Time to filter transactions TO - NB Time component is optional - set to 00:00:00 for just Date | [optional]

### Return type

[**AccountTransactionsGETResponse**](AccountTransactionsGETResponse.md)

### Authorization

[PSUOAuth2Security](../README.md#PSUOAuth2Security)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

