# WebhooksApi

All URIs are relative to *https://api.zenki.fi*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**sendEvent**](WebhooksApi.md#sendEvent) | **POST** /URL_MERCHANT | Event notifications for merchant |



## sendEvent

> sendEvent(svixId, svixTimestamp, svixSignature, contentType, webhook)

Event notifications for merchant

Service that allows different events to be sent to the merchant.

### Example

```java
// Import classes:
import fi.zenki.zenkipay.api.ApiClient;
import fi.zenki.zenkipay.api.ApiException;
import fi.zenki.zenkipay.api.Configuration;
import fi.zenki.zenkipay.api.models.*;
import fi.zenki.zenkipay.api.services.WebhooksApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.zenki.fi");

        WebhooksApi apiInstance = new WebhooksApi(defaultClient);
        String svixId = "msg_2HYAP5mNDMxY0LurmzrPvGYJTdq"; // String | Unique message identifier for the webhook message. This identifier is unique across all messages, but will be the same when the same webhook is forwarded (for example, due to a previous error).
        String svixTimestamp = "1668451615"; // String | Date and time when the webhook is sent to the merchant, in milliseconds and UTC format.  The Unix epoch (or Unix time or POSIX time or Unix timestamp) is the number of seconds elapsed since January 1, 1970 (midnight UTC/GMT), not counting leap seconds (in ISO 8601: 1970-01-01T00: 00:00Z)
        String svixSignature = "v1,HNHAxGk8b5lX2xC1uVUQy6AXgmPKrfNV4I+yENBC4Fk="; // String | Base64 encoded signature (delimited by spaces) on the sent content, the signature is generated from the following structure: signed_content = \"${svix_id}.${svix_timestamp}.${body}\".
        String contentType = "application/json"; // String | Content Type accepted.
        Webhook webhook = new Webhook(); // Webhook | A JSON structure will be sent that will have the information about the event to notify the merchant.
        try {
            apiInstance.sendEvent(svixId, svixTimestamp, svixSignature, contentType, webhook);
        } catch (ApiException e) {
            System.err.println("Exception when calling WebhooksApi#sendEvent");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **svixId** | **String**| Unique message identifier for the webhook message. This identifier is unique across all messages, but will be the same when the same webhook is forwarded (for example, due to a previous error). | |
| **svixTimestamp** | **String**| Date and time when the webhook is sent to the merchant, in milliseconds and UTC format.  The Unix epoch (or Unix time or POSIX time or Unix timestamp) is the number of seconds elapsed since January 1, 1970 (midnight UTC/GMT), not counting leap seconds (in ISO 8601: 1970-01-01T00: 00:00Z) | |
| **svixSignature** | **String**| Base64 encoded signature (delimited by spaces) on the sent content, the signature is generated from the following structure: signed_content &#x3D; \&quot;${svix_id}.${svix_timestamp}.${body}\&quot;. | |
| **contentType** | **String**| Content Type accepted. | |
| **webhook** | [**Webhook**](Webhook.md)| A JSON structure will be sent that will have the information about the event to notify the merchant. | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Event received by the merchant. |  -  |
| **500** | Internal Server Error. |  -  |

