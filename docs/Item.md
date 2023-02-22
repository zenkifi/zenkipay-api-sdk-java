

# Item

Information about a product or service.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**externalId** | **String** | Unique identifier of the product or service assigned by the merchant. |  [optional] |
|**quantity** | **Long** | Total number of products or services of the order of the same type. |  |
|**unitPrice** | **Double** | Unit price of the product or service. |  |
|**name** | **String** | Short name of the product or service. |  |
|**description** | **String** | Description of the product or service. |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | Indicates the model for the product delivery or service delivery.  Possible values: * WITH_CARRIER    - If a courier is going to be used for the shipment and delivery of the product or service. * WITHOUT_CARRIER - If a courier is not going to be used for the shipment and delivery of the product or service. |  [optional] |
|**thumbnailUrl** | **String** | Product image URL (thumbnail). |  [optional] |
|**metadata** | **Map&lt;String, String&gt;** | Complementary information of the product or service that is required to be reported or kept in the Zenkipay system. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| WITH_CARRIER | &quot;WITH_CARRIER&quot; |
| WITHOUT_CARRIER | &quot;WITHOUT_CARRIER&quot; |



