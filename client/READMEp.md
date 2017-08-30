# swagger-java-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>io.swagger</groupId>
    <artifactId>swagger-java-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-java-client:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/swagger-java-client-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import com.jeelis.psd2hub.client.*;
import com.jeelis.psd2hub.client.auth.*;
import com.jeelis.psd2hub.client.model.*;
import com.jeelis.psd2hub.client.api.PaymentsApi;

import java.io.File;
import java.util.*;

public class PaymentsApiExample {

    public static void main(String[] args) {
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
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://localhost/open-banking*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*PaymentsApi* | [**createPaymentSubmission**](docs/PaymentsApi.md#createPaymentSubmission) | **POST** /payment-submissions | Create a payment submission
*PaymentsApi* | [**createSingleImmediatePayment**](docs/PaymentsApi.md#createSingleImmediatePayment) | **POST** /payments | Create a single immediate payment
*PaymentsApi* | [**getPaymentSubmission**](docs/PaymentsApi.md#getPaymentSubmission) | **GET** /payment-submissions/{PaymentSubmissionId} | Get a payment submission
*PaymentsApi* | [**getSingleImmediatePayment**](docs/PaymentsApi.md#getSingleImmediatePayment) | **GET** /payments/{PaymentId} | Get a single immediate payment


## Documentation for Models

 - [CreditorAccount](docs/CreditorAccount.md)
 - [CreditorAgent](docs/CreditorAgent.md)
 - [DebtorAccount](docs/DebtorAccount.md)
 - [DebtorAgent](docs/DebtorAgent.md)
 - [PaymentSetup](docs/PaymentSetup.md)
 - [PaymentSetupInitiation](docs/PaymentSetupInitiation.md)
 - [PaymentSetupInitiationInstructedAmount](docs/PaymentSetupInitiationInstructedAmount.md)
 - [PaymentSetupPOSTRequest](docs/PaymentSetupPOSTRequest.md)
 - [PaymentSetupPOSTResponse](docs/PaymentSetupPOSTResponse.md)
 - [PaymentSetupPOSTResponseLinks](docs/PaymentSetupPOSTResponseLinks.md)
 - [PaymentSetupPOSTResponseMeta](docs/PaymentSetupPOSTResponseMeta.md)
 - [PaymentSetupResponse](docs/PaymentSetupResponse.md)
 - [PaymentSetupResponseInitiation](docs/PaymentSetupResponseInitiation.md)
 - [PaymentSubmission](docs/PaymentSubmission.md)
 - [PaymentSubmissionPOSTRequest](docs/PaymentSubmissionPOSTRequest.md)
 - [PaymentSubmitPOST201Response](docs/PaymentSubmitPOST201Response.md)
 - [RemittanceInformation](docs/RemittanceInformation.md)
 - [Risk](docs/Risk.md)
 - [Risk1](docs/Risk1.md)
 - [RiskDeliveryAddress](docs/RiskDeliveryAddress.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### PSUOAuth2Security

- **Type**: OAuth
- **Flow**: accessCode
- **Authorization URL**: /authorization
- **Scopes**: 
  - payment: Generic payment scope

### TPPOAuth2Security

- **Type**: OAuth
- **Flow**: application
- **Authorization URL**: 
- **Scopes**: 
  - tpp_client_credential: TPP Client Credential Scope


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

craig.greenhouse@openbanking.org.uk

