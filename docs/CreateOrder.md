

# CreateOrder

Object used with the information required to create an order.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**version** | **String** | Data model version, its current value should be v1.0.0. |  |
|**orderId** | **String** | Unique order identifier generated by the merchant. In order to have correct traceability and adequate conversion metrics, it is required to send the OrderId field or the CardId Field. |  [optional] |
|**cartId** | **String** | Unique identifier of the shopping cart that allows identifying the purchase of one or more products or services. In order to have correct traceability and adequate conversion metrics, it is required to send the OrderId field or the CardId Field. |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | Indicates the model for the product delivery or service delivery.  Possible values: * WITH_CARRIER    - If a courier is going to be used for the shipment and delivery of the product or service. * WITHOUT_CARRIER - If a courier is not going to be used for the shipment and delivery of the product or service. * MIXED           - If a courier is going to be used to send part of the products or services and another part is delivered without using a courier. |  |
|**countryCodeIso2** | **String** | Unique country identifier, the definition of the ISO_3166-1 standard is used with 2 characters, see:https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2 or https://www.iso.org/iso-3166-country-codes.html |  |
|**shopper** | [**Shopper**](Shopper.md) |  |  [optional] |
|**breakdown** | [**Breakdown**](Breakdown.md) |  |  |
|**items** | [**List&lt;Item&gt;**](Item.md) | Set of products or services considered within the shopping cart. |  |
|**metadata** | **Map&lt;String, String&gt;** | Complementary information of the order that the merchant requires to send and inform Zenkipay. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| WITH_CARRIER | &quot;WITH_CARRIER&quot; |
| WITHOUT_CARRIER | &quot;WITHOUT_CARRIER&quot; |
| MIXED | &quot;MIXED&quot; |



