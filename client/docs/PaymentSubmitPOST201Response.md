
# PaymentSubmitPOST201Response

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**paymentSubmissionId** | **String** | OB: Unique identification as assigned by the ASPSP to uniquely identify the payment submission resource. | 
**paymentId** | **String** | OB: Unique identification as assigned by the ASPSP to uniquely identify the payment setup resource. | 
**status** | [**StatusEnum**](#StatusEnum) | Specifies the status of the payment submission resource. |  [optional]
**creationDateTime** | [**DateTime**](DateTime.md) | Date and time at which the resource was created. | 
**links** | [**PaymentSetupPOSTResponseLinks**](PaymentSetupPOSTResponseLinks.md) |  |  [optional]
**meta** | [**PaymentSetupPOSTResponseMeta**](PaymentSetupPOSTResponseMeta.md) |  |  [optional]


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
ACCEPTEDSETTLEMENTCOMPLETED | &quot;AcceptedSettlementCompleted&quot;
ACCEPTEDSETTLEMENTINPROCESS | &quot;AcceptedSettlementInProcess&quot;
PENDING | &quot;Pending&quot;
REJECTED | &quot;Rejected&quot;



