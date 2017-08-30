
# CreditorAccount

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**schemeName** | [**SchemeNameEnum**](#SchemeNameEnum) | Name of the identification scheme, in a coded form as published in an external list. | 
**identification** | **String** | Identification assigned by an institution to identify an account. This identification is known by the account owner. | 
**name** | **String** | Name of the account, as assigned by the account servicing institution, in agreement with the account owner in order to provide an additional means of identification of the account. Usage: The account name is different from the account owner name. The account name is used in certain user communities to provide a means of identifying the account, in addition to the account owner&#39;s identity and the account number. ASPSPs may carry out name validation for Confirmation of Payee, but it is not mandatory. | 
**secondaryIdentification** | **String** | Identification assigned by an institution to identify an account. This identification is known by the account owner. |  [optional]


<a name="SchemeNameEnum"></a>
## Enum: SchemeNameEnum
Name | Value
---- | -----
BBAN | &quot;BBAN&quot;
IBAN | &quot;IBAN&quot;



