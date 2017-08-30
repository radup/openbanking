
# AccountTransactionsGETResponseBalance

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**amount** | [**AccountTransactionsGETResponseBalanceAmount**](AccountTransactionsGETResponseBalanceAmount.md) |  |  [optional]
**creditDebitIndicator** | [**CreditDebitIndicatorEnum**](#CreditDebitIndicatorEnum) | Indicates whether the balance is a credit or a debit balance. Usage: A zero balance is considered to be a credit balance. | 
**type** | [**TypeEnum**](#TypeEnum) | Balance type, in a coded form. | 


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



