
# Balance

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accountId** | **String** | A unique and immutable identifier used to identify the account resource. This identifier has no meaning to the account owner. | 
**amount** | [**BalancesGETResponseAmount**](BalancesGETResponseAmount.md) |  |  [optional]
**creditDebitIndicator** | [**CreditDebitIndicatorEnum**](#CreditDebitIndicatorEnum) | Indicates whether the balance is a credit or a debit balance. Usage: A zero balance is considered to be a credit balance. | 
**type** | [**TypeEnum**](#TypeEnum) | Balance type, in a coded form. | 
**dateTime** | [**DateTime**](DateTime.md) | Indicates the date (and time) of the balance. | 
**creditLine** | [**BalancesGETResponseCreditLine**](BalancesGETResponseCreditLine.md) |  |  [optional]


<a name="CreditDebitIndicatorEnum"></a>
## Enum: CreditDebitIndicatorEnum
Name | Value
---- | -----
CREDIT | &quot;Credit&quot;
DEBIT | &quot;Debit&quot;


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
CLOSINGAVAILABLE | &quot;ClosingAvailable&quot;
CLOSINGBOOKED | &quot;ClosingBooked&quot;
EXPECTED | &quot;Expected&quot;
FORWARDAVAILABLE | &quot;ForwardAvailable&quot;
INFORMATION | &quot;Information&quot;
INTERIMAVAILABLE | &quot;InterimAvailable&quot;
INTERIMBOOKED | &quot;InterimBooked&quot;
OPENINGAVAILABLE | &quot;OpeningAvailable&quot;
OPENINGBOOKED | &quot;OpeningBooked&quot;
PREVIOUSLYCLOSEDBOOKED | &quot;PreviouslyClosedBooked&quot;



