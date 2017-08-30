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
import com.jeelis.psd2hub.client.api.DefaultApi;

import java.io.File;
import java.util.*;

public class DefaultApiExample {

    public static void main(String[] args) {
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
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://localhost/open-banking*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DefaultApi* | [**createAccountRequest**](docs/DefaultApi.md#createAccountRequest) | **POST** /account-requests | Create an account request
*DefaultApi* | [**deleteAccountRequest**](docs/DefaultApi.md#deleteAccountRequest) | **DELETE** /account-requests/{AccountRequestId} | Delete an account request
*DefaultApi* | [**getAccount**](docs/DefaultApi.md#getAccount) | **GET** /accounts/{AccountId} | Get Account
*DefaultApi* | [**getAccountBalances**](docs/DefaultApi.md#getAccountBalances) | **GET** /accounts/{AccountId}/balances | Get Account Balances
*DefaultApi* | [**getAccountBeneficiaries**](docs/DefaultApi.md#getAccountBeneficiaries) | **GET** /accounts/{AccountId}/beneficiaries | Get Account Beneficiaries
*DefaultApi* | [**getAccountDirectDebits**](docs/DefaultApi.md#getAccountDirectDebits) | **GET** /accounts/{AccountId}/direct-debits | Get Account Direct Debits
*DefaultApi* | [**getAccountProduct**](docs/DefaultApi.md#getAccountProduct) | **GET** /accounts/{AccountId}/product | Get Account Product
*DefaultApi* | [**getAccountRequest**](docs/DefaultApi.md#getAccountRequest) | **GET** /account-requests/{AccountRequestId} | Get an account request
*DefaultApi* | [**getAccountStandingOrders**](docs/DefaultApi.md#getAccountStandingOrders) | **GET** /accounts/{AccountId}/standing-orders | Get Account Standing Orders
*DefaultApi* | [**getAccountTransactions**](docs/DefaultApi.md#getAccountTransactions) | **GET** /accounts/{AccountId}/transactions | Get Account Transactions
*DefaultApi* | [**getAccounts**](docs/DefaultApi.md#getAccounts) | **GET** /accounts | Get Accounts
*DefaultApi* | [**getBalances**](docs/DefaultApi.md#getBalances) | **GET** /balances | Get Balances
*DefaultApi* | [**getBeneficiaries**](docs/DefaultApi.md#getBeneficiaries) | **GET** /beneficiaries | Get Beneficiaries
*DefaultApi* | [**getDirectDebits**](docs/DefaultApi.md#getDirectDebits) | **GET** /direct-debits | Get Direct Debits
*DefaultApi* | [**getProducts**](docs/DefaultApi.md#getProducts) | **GET** /products | Get Products
*DefaultApi* | [**getStandingOrders**](docs/DefaultApi.md#getStandingOrders) | **GET** /standing-orders | Get Standing Orders
*DefaultApi* | [**getTransactions**](docs/DefaultApi.md#getTransactions) | **GET** /transactions | Get Transactions


## Documentation for Models

 - [Account](docs/Account.md)
 - [AccountGETResponse](docs/AccountGETResponse.md)
 - [AccountGETResponse1](docs/AccountGETResponse1.md)
 - [AccountGETResponse1PreviousPaymentAmount](docs/AccountGETResponse1PreviousPaymentAmount.md)
 - [AccountGETResponseAccount](docs/AccountGETResponseAccount.md)
 - [AccountGETResponseServicer](docs/AccountGETResponseServicer.md)
 - [AccountRequestPOSTRequest](docs/AccountRequestPOSTRequest.md)
 - [AccountRequestPOSTResponse](docs/AccountRequestPOSTResponse.md)
 - [AccountTransactionsGETResponse](docs/AccountTransactionsGETResponse.md)
 - [AccountTransactionsGETResponseAmount](docs/AccountTransactionsGETResponseAmount.md)
 - [AccountTransactionsGETResponseBalance](docs/AccountTransactionsGETResponseBalance.md)
 - [AccountTransactionsGETResponseBalanceAmount](docs/AccountTransactionsGETResponseBalanceAmount.md)
 - [AccountTransactionsGETResponseBankTransactionCode](docs/AccountTransactionsGETResponseBankTransactionCode.md)
 - [AccountTransactionsGETResponseData](docs/AccountTransactionsGETResponseData.md)
 - [AccountTransactionsGETResponseMerchantDetails](docs/AccountTransactionsGETResponseMerchantDetails.md)
 - [AccountTransactionsGETResponseProprietaryBankTransactionCode](docs/AccountTransactionsGETResponseProprietaryBankTransactionCode.md)
 - [Balance](docs/Balance.md)
 - [BalancesGETResponse](docs/BalancesGETResponse.md)
 - [BalancesGETResponseAmount](docs/BalancesGETResponseAmount.md)
 - [BalancesGETResponseCreditLine](docs/BalancesGETResponseCreditLine.md)
 - [BalancesGETResponseCreditLineAmount](docs/BalancesGETResponseCreditLineAmount.md)
 - [BeneficiariesGETResponse](docs/BeneficiariesGETResponse.md)
 - [BeneficiariesGETResponseCreditorAccount](docs/BeneficiariesGETResponseCreditorAccount.md)
 - [BeneficiariesGETResponseServicer](docs/BeneficiariesGETResponseServicer.md)
 - [Beneficiary](docs/Beneficiary.md)
 - [Data](docs/Data.md)
 - [Data1](docs/Data1.md)
 - [DirectDebit](docs/DirectDebit.md)
 - [Links](docs/Links.md)
 - [MetaData](docs/MetaData.md)
 - [Product](docs/Product.md)
 - [ProductGETResponse](docs/ProductGETResponse.md)
 - [StandingOrder](docs/StandingOrder.md)
 - [StandingOrdersGETResponse](docs/StandingOrdersGETResponse.md)
 - [StandingOrdersGETResponseFinalPaymentAmount](docs/StandingOrdersGETResponseFinalPaymentAmount.md)
 - [StandingOrdersGETResponseFirstPaymentAmount](docs/StandingOrdersGETResponseFirstPaymentAmount.md)
 - [StandingOrdersGETResponseNextPaymentAmount](docs/StandingOrdersGETResponseNextPaymentAmount.md)
 - [StandingOrdersGETResponseServicer](docs/StandingOrdersGETResponseServicer.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### PSUOAuth2Security

- **Type**: OAuth
- **Flow**: accessCode
- **Authorization URL**: /authorization
- **Scopes**: 
  - accounts: Ability to read Accounts information

### TPPOAuth2Security

- **Type**: OAuth
- **Flow**: application
- **Authorization URL**: 
- **Scopes**: 
  - tpp_client_credential: TPP Client Credential Scope


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

Craig.Greenhouse@openbanking.org.uk

