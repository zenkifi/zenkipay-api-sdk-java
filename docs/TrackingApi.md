# TrackingApi

All URIs are relative to *https://api.zenki.fi*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addEventTracking**](TrackingApi.md#addEventTracking) | **PATCH** /v1/pay/orders/{zenkiOrderId}/tracking/{zenkiTrackId} | Shipping Status Update |
| [**registerTrackingOrders**](TrackingApi.md#registerTrackingOrders) | **POST** /v1/pay/orders/{zenkiOrderId}/tracking | Registration number for tracking |



## addEventTracking

> List&lt;TrackingEventsInner&gt; addEventTracking(zenkiOrderId, zenkiTrackId, contentType, accept, X_ZENKI_PLUGIN_ID, acceptLanguage, addTrackingEvent)

Shipping Status Update

Based on the order id and the tracking id the delivery status is updated.

### Example

```java
// Import classes:
import fi.zenki.zenkipay.api.ApiClient;
import fi.zenki.zenkipay.api.ApiException;
import fi.zenki.zenkipay.api.Configuration;
import fi.zenki.zenkipay.api.auth.*;
import fi.zenki.zenkipay.api.models.*;
import fi.zenki.zenkipay.api.services.TrackingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.zenki.fi");
        
        // Configure HTTP bearer authorization: JWTAuth
        HttpBearerAuth JWTAuth = (HttpBearerAuth) defaultClient.getAuthentication("JWTAuth");
        JWTAuth.setBearerToken("BEARER TOKEN");

        TrackingApi apiInstance = new TrackingApi(defaultClient);
        String zenkiOrderId = "zenkiOrderId_example"; // String | Unique order identifier generated by Zenkipay.
        String zenkiTrackId = "zenkiTrackId_example"; // String | Unique tracking identifier generated by Zenkipay.
        String contentType = "application/json"; // String | Content type accepted.
        String accept = "application/json"; // String | Accepted formats.
        String X_ZENKI_PLUGIN_ID = "4188918f7da1547d13e3"; // String | Unique customer identifier used to establish connection with Zenkipay services.
        String acceptLanguage = "en"; // String | Indicates the language type code for which the content of the services response is returned according to the language reported.  The definition of the ISO_639 standard is used. See: https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes or https://www.iso.org/iso-639-language-codes.html
        AddTrackingEvent addTrackingEvent = new AddTrackingEvent(); // AddTrackingEvent | A JSON structure will be sent that will have the required information to update the shipping status.
        try {
            List<TrackingEventsInner> result = apiInstance.addEventTracking(zenkiOrderId, zenkiTrackId, contentType, accept, X_ZENKI_PLUGIN_ID, acceptLanguage, addTrackingEvent);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TrackingApi#addEventTracking");
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
| **zenkiOrderId** | **String**| Unique order identifier generated by Zenkipay. | |
| **zenkiTrackId** | **String**| Unique tracking identifier generated by Zenkipay. | |
| **contentType** | **String**| Content type accepted. | |
| **accept** | **String**| Accepted formats. | |
| **X_ZENKI_PLUGIN_ID** | **String**| Unique customer identifier used to establish connection with Zenkipay services. | [optional] |
| **acceptLanguage** | **String**| Indicates the language type code for which the content of the services response is returned according to the language reported.  The definition of the ISO_639 standard is used. See: https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes or https://www.iso.org/iso-639-language-codes.html | [optional] |
| **addTrackingEvent** | [**AddTrackingEvent**](AddTrackingEvent.md)| A JSON structure will be sent that will have the required information to update the shipping status. | [optional] |

### Return type

[**List&lt;TrackingEventsInner&gt;**](TrackingEventsInner.md)

### Authorization

[JWTAuth](../README.md#JWTAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successful shipping status update. |  -  |
| **400** | Expected trace parameter. |  -  |
| **403** | Access denied. |  -  |
| **404** | Resource not found. |  -  |
| **406** | Headers not accepted. |  -  |
| **428** | Parameter name cannot be found. |  -  |
| **500** | Internal Server Error. |  -  |


## registerTrackingOrders

> Tracking registerTrackingOrders(zenkiOrderId, contentType, accept, X_ZENKI_PLUGIN_ID, acceptLanguage, addTracking)

Registration number for tracking

One or more shipment tracking numbers are recorded for the order number.

### Example

```java
// Import classes:
import fi.zenki.zenkipay.api.ApiClient;
import fi.zenki.zenkipay.api.ApiException;
import fi.zenki.zenkipay.api.Configuration;
import fi.zenki.zenkipay.api.auth.*;
import fi.zenki.zenkipay.api.models.*;
import fi.zenki.zenkipay.api.services.TrackingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.zenki.fi");
        
        // Configure HTTP bearer authorization: JWTAuth
        HttpBearerAuth JWTAuth = (HttpBearerAuth) defaultClient.getAuthentication("JWTAuth");
        JWTAuth.setBearerToken("BEARER TOKEN");

        TrackingApi apiInstance = new TrackingApi(defaultClient);
        String zenkiOrderId = "zenkiOrderId_example"; // String | Unique order identifier generated by Zenkipay.
        String contentType = "application/json"; // String | Content type accepted.
        String accept = "application/json"; // String | Accepted formats.
        String X_ZENKI_PLUGIN_ID = "4188918f7da1547d13e3"; // String | Unique customer identifier used to establish connection with Zenkipay services.
        String acceptLanguage = "en"; // String | Indicates the language type code for which the content of the services response is returned according to the language reported.  The definition of the ISO_639 standard is used. See: https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes or https://www.iso.org/iso-639-language-codes.html
        AddTracking addTracking = new AddTracking(); // AddTracking | The registration of a tracking number associated with a shipment may be requested so that Zenkipay can track the delivery process, as reported by the courier.
        try {
            Tracking result = apiInstance.registerTrackingOrders(zenkiOrderId, contentType, accept, X_ZENKI_PLUGIN_ID, acceptLanguage, addTracking);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TrackingApi#registerTrackingOrders");
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
| **zenkiOrderId** | **String**| Unique order identifier generated by Zenkipay. | |
| **contentType** | **String**| Content type accepted. | |
| **accept** | **String**| Accepted formats. | |
| **X_ZENKI_PLUGIN_ID** | **String**| Unique customer identifier used to establish connection with Zenkipay services. | [optional] |
| **acceptLanguage** | **String**| Indicates the language type code for which the content of the services response is returned according to the language reported.  The definition of the ISO_639 standard is used. See: https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes or https://www.iso.org/iso-639-language-codes.html | [optional] |
| **addTracking** | [**AddTracking**](AddTracking.md)| The registration of a tracking number associated with a shipment may be requested so that Zenkipay can track the delivery process, as reported by the courier. | [optional] |

### Return type

[**Tracking**](Tracking.md)

### Authorization

[JWTAuth](../README.md#JWTAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Recorded tracking. |  -  |
| **400** | Expected trace parameter. |  -  |
| **403** | Access denied. |  -  |
| **404** | Resource not found. |  -  |
| **406** | Headers not accepted. |  -  |
| **428** | Parameter name cannot be found. |  -  |
| **500** | Internal Server Error. |  -  |

