
# AccountTransactionsGETResponseData

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accountId** | **String** | A unique and immutable identifier used to identify the account resource. This identifier has no meaning to the account owner. | 
**transactionId** | **String** | Unique identifier for the transaction within an servicing institution. This identifier is both unique and immutable. |  [optional]
**transactionReference** | **String** | Unique reference for the transaction. This reference is optionally populated, and may as an example be the FPID in the Faster Payments context. |  [optional]
**amount** | [**AccountTransactionsGETResponseAmount**](AccountTransactionsGETResponseAmount.md) |  |  [optional]
**creditDebitIndicator** | [**CreditDebitIndicatorEnum**](#CreditDebitIndicatorEnum) | Indicates whether the transaction is a credit or a debit entry. | 
**status** | [**StatusEnum**](#StatusEnum) | Status of a transaction entry on the books of the account servicer. | 
**bookingDateTime** | [**DateTime**](DateTime.md) | Date and time when a transaction entry is posted to an account on the account servicer&#39;s books. Usage: Booking date is the expected booking date, unless the status is booked, in which case it is the actual booking date. | 
**valueDateTime** | [**DateTime**](DateTime.md) | Date and time at which assets become available to the account owner in case of a credit entry, or cease to be available to the account owner in case of a debit entry.  Usage: If entry status is pending and value date is present, then the value date refers to an expected/requested value date. For entries subject to availability/float and for which availability information is provided, the value date must not be used. In this case the availability component identifies the  number of availability days. |  [optional]
**transactionInformation** | **String** | Further details of the transaction. This is the transaction narrative, which is unstructured text. |  [optional]
**addressLine** | **String** | Information that locates and identifies a specific address, as defined by postal services, that is presented in free format text. |  [optional]
**bankTransactionCode** | [**AccountTransactionsGETResponseBankTransactionCode**](AccountTransactionsGETResponseBankTransactionCode.md) |  |  [optional]
**proprietaryBankTransactionCode** | [**AccountTransactionsGETResponseProprietaryBankTransactionCode**](AccountTransactionsGETResponseProprietaryBankTransactionCode.md) |  |  [optional]
**balance** | [**AccountTransactionsGETResponseBalance**](AccountTransactionsGETResponseBalance.md) |  |  [optional]
**merchantDetails** | [**AccountTransactionsGETResponseMerchantDetails**](AccountTransactionsGETResponseMerchantDetails.md) |  |  [optional]


<a name="CreditDebitIndicatorEnum"></a>
## Enum: CreditDebitIndicatorEnum
Name | Value
---- | -----
CREDIT | &quot;Credit&quot;
DEBIT | &quot;Debit&quot;


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
BOOKED | &quot;Booked&quot;
PENDING | &quot;Pending&quot;



