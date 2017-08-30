
# DirectDebit

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accountId** | **String** | A unique and immutable identifier used to identify the account resource. This identifier has no meaning to the account owner. | 
**directDebitId** | **String** | A unique and immutable identifier used to identify the direct debit resource. This identifier has no meaning to the account owner. |  [optional]
**mandateIdentification** | **String** | Direct Debit reference. For AUDDIS service users provide Core Reference. For non AUDDIS service users provide Core reference if possible or last used reference. | 
**directDebitStatusCode** | [**DirectDebitStatusCodeEnum**](#DirectDebitStatusCodeEnum) | Specifies the status of the direct debit in code form. |  [optional]
**name** | **String** | Name of Service User | 
**previousPaymentDateTime** | [**DateTime**](DateTime.md) | Date of most recent direct debit collection. |  [optional]
**previousPaymentAmount** | [**AccountGETResponse1PreviousPaymentAmount**](AccountGETResponse1PreviousPaymentAmount.md) |  |  [optional]


<a name="DirectDebitStatusCodeEnum"></a>
## Enum: DirectDebitStatusCodeEnum
Name | Value
---- | -----
ACTIVE | &quot;Active&quot;
INACTIVE | &quot;Inactive&quot;



