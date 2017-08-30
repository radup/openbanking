
# Product

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accountId** | **String** | A unique and immutable identifier used to identify the account resource. This identifier has no meaning to the account owner. | 
**productIdentifier** | **String** | Identifier within the parent organisation for the product. Must be unique in the organisation. | 
**productType** | [**ProductTypeEnum**](#ProductTypeEnum) | Descriptive code for the product category. | 
**productName** | **String** | The name of the product used for marketing purposes from a customer perspective. I.e. what the customer would recognise. |  [optional]
**secondaryProductIdentifier** | **String** | Identifier within the parent organisation for the product. Must be unique in the organisation. |  [optional]


<a name="ProductTypeEnum"></a>
## Enum: ProductTypeEnum
Name | Value
---- | -----
BCA | &quot;BCA&quot;
PCA | &quot;PCA&quot;



