
# BalancesGETResponseCreditLine

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**included** | **Boolean** | Indicates whether or not the credit line is included in the balance of the account. Usage: If not present, credit line is not included in the balance amount of the account. | 
**amount** | [**BalancesGETResponseCreditLineAmount**](BalancesGETResponseCreditLineAmount.md) |  |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | Limit type, in a coded form. |  [optional]


<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
PRE_AGREED | &quot;Pre-Agreed&quot;
EMERGENCY | &quot;Emergency&quot;
TEMPORARY | &quot;Temporary&quot;



