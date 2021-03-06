
# Data1

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accountRequestId** | **String** | Unique identification as assigned to identify the account request resource. | 
**status** | [**StatusEnum**](#StatusEnum) | Specifies the status of the account request resource. |  [optional]
**creationDateTime** | [**DateTime**](DateTime.md) | Date and time at which the resource was created. | 
**permissions** | [**List&lt;PermissionsEnum&gt;**](#List&lt;PermissionsEnum&gt;) | Specifies the Open Banking account request types. This is a list of the data clusters being consented by the PSU, and requested for authorisation with the ASPSP. | 
**expirationDateTime** | [**DateTime**](DateTime.md) | Specified date and time the permissions will expire. If this is not populated, the permissions will be open ended. |  [optional]
**transactionFromDateTime** | [**DateTime**](DateTime.md) | Specified start date and time for the transaction query period. If this is not populated, the start date will be open ended, and data will be returned from the earliest available transaction. |  [optional]
**transactionToDateTime** | [**DateTime**](DateTime.md) | Specified end date and time for the transaction query period. If this is not populated, the end date will be open ended, and data will be returned to the latest available transaction. |  [optional]


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
AUTHORISED | &quot;Authorised&quot;
AWAITINGAUTHORISATION | &quot;AwaitingAuthorisation&quot;
REJECTED | &quot;Rejected&quot;
REVOKED | &quot;Revoked&quot;


<a name="List<PermissionsEnum>"></a>
## Enum: List&lt;PermissionsEnum&gt;
Name | Value
---- | -----
READACCOUNTSBASIC | &quot;ReadAccountsBasic&quot;
READACCOUNTSDETAIL | &quot;ReadAccountsDetail&quot;
READBALANCES | &quot;ReadBalances&quot;
READBENEFICIARIESBASIC | &quot;ReadBeneficiariesBasic&quot;
READBENEFICIARIESDETAIL | &quot;ReadBeneficiariesDetail&quot;
READDIRECTDEBITS | &quot;ReadDirectDebits&quot;
READPRODUCTS | &quot;ReadProducts&quot;
READSTANDINGORDERSBASIC | &quot;ReadStandingOrdersBasic&quot;
READSTANDINGORDERSDETAIL | &quot;ReadStandingOrdersDetail&quot;
READTRANSACTIONSBASIC | &quot;ReadTransactionsBasic&quot;
READTRANSACTIONSCREDITS | &quot;ReadTransactionsCredits&quot;
READTRANSACTIONSDEBITS | &quot;ReadTransactionsDebits&quot;
READTRANSACTIONSDETAIL | &quot;ReadTransactionsDetail&quot;



