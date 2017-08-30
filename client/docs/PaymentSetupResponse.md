
# PaymentSetupResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**paymentId** | **String** | OB: Unique identification as assigned by the ASPSP to uniquely identify the payment setup resource. | 
**status** | [**StatusEnum**](#StatusEnum) | Specifies the status of the payment resource. |  [optional]
**creationDateTime** | [**DateTime**](DateTime.md) | Date and time at which the resource was created. | 
**initiation** | [**PaymentSetupResponseInitiation**](PaymentSetupResponseInitiation.md) |  |  [optional]


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
ACCEPTEDCUSTOMERPROFILE | &quot;AcceptedCustomerProfile&quot;
ACCEPTEDTECHNICALVALIDATION | &quot;AcceptedTechnicalValidation&quot;
PENDING | &quot;Pending&quot;
REJECTED | &quot;Rejected&quot;



