

# Webhook

Base structure of the notification that the merchant will receive, this notification will handle different types of events for its processing. The content of the message will be in string format so that it can be interpreted according to the type of event received by the merchant from Zenkipay.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**eventType** | **String** | Set of events that the merchant can receive.  Possible values: * order.pay    - Event notification when an order has been successfully paid by the buyer. |  |
|**flatData** | **String** | Event data.  Possible values: * The Order object is to be received when the order.pay event is notified. |  |



