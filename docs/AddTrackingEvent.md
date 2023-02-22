

# AddTrackingEvent


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**status** | [**StatusEnum**](#StatusEnum) | Delivery process states.  Possible values: * TRANSIT              - In delivery process. * DELIVERY             - The product or service has been delivered. * AVAILABLE_FOR_PICKUP - The product or service is ready for the buyer to pick it up at the store. * CANCELED             - The shipment has been cancelled. * FAILED               - There was a problem trying to deliver the product or service. |  |
|**location** | **String** | Place where the event is triggered and the packet is located. |  |
|**description** | **String** | Detail of the error for which the shipment could not be completed or if the product or service was delivered correctly, indicate who received it. |  |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| TRANSIT | &quot;TRANSIT&quot; |
| DELIVERY | &quot;DELIVERY&quot; |
| AVAILABLE_FOR_PICKUP | &quot;AVAILABLE_FOR_PICKUP&quot; |
| CANCELED | &quot;CANCELED&quot; |
| FAILED | &quot;FAILED&quot; |



