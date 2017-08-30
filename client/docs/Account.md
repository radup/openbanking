
# Account

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accountId** | **String** | A unique and immutable identifier used to identify the account resource. This identifier has no meaning to the account owner. | 
**currency** | **String** | Identification of the currency in which the account is held.  Usage: Currency should only be used in case one and the same account number covers several currencies and the initiating party needs to identify which currency needs to be used for settlement on the account. | 
**nickname** | **String** | The nickname of the account, assigned by the account owner in order to provide an additional means of identification of the account. |  [optional]
**account** | [**AccountGETResponseAccount**](AccountGETResponseAccount.md) |  |  [optional]
**servicer** | [**AccountGETResponseServicer**](AccountGETResponseServicer.md) |  |  [optional]



