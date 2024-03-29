# RefundsApi

All URIs are relative to *https://api.zenki.fi*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getRefundOrder**](RefundsApi.md#getRefundOrder) | **GET** /v1/pay/orders/{zenkiOrderId}/refunds/{zenkiRefundId} | Request refunds for an order |
| [**registerRefundOrder**](RefundsApi.md#registerRefundOrder) | **POST** /v1/pay/orders/{zenkiOrderId}/refunds | Register of refunds for an order |



## getRefundOrder

> Refund getRefundOrder(zenkiOrderId, zenkiRefundId, contentType, accept, X_ZENKI_PLUGIN_ID, acceptLanguage)

Request refunds for an order

The refund is consulted by the order number.

### Example

```java
// Import classes:
import fi.zenki.zenkipay.api.ApiClient;
import fi.zenki.zenkipay.api.ApiException;
import fi.zenki.zenkipay.api.Configuration;
import fi.zenki.zenkipay.api.auth.*;
import fi.zenki.zenkipay.api.models.*;
import fi.zenki.zenkipay.api.services.RefundsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.zenki.fi");
        
        // Configure HTTP bearer authorization: JWTAuth
        HttpBearerAuth JWTAuth = (HttpBearerAuth) defaultClient.getAuthentication("JWTAuth");
        JWTAuth.setBearerToken("BEARER TOKEN");

        RefundsApi apiInstance = new RefundsApi(defaultClient);
        String zenkiOrderId = "zenkiOrderId_example"; // String | Unique order identifier generated by Zenkipay.
        String zenkiRefundId = "zenkiRefundId_example"; // String | Unique refund identifier generated by Zenkipay.
        String contentType = "application/json"; // String | Content type accepted.
        String accept = "application/json"; // String | Accepted formats.
        String X_ZENKI_PLUGIN_ID = "4188918f7da1547d13e3"; // String | Unique customer identifier used to establish connection with Zenkipay services.
        String acceptLanguage = "en"; // String | Indicates the language type code for which the content of the services response is returned according to the language reported.  The definition of the ISO_639 standard is used. See: https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes or https://www.iso.org/iso-639-language-codes.html
        try {
            Refund result = apiInstance.getRefundOrder(zenkiOrderId, zenkiRefundId, contentType, accept, X_ZENKI_PLUGIN_ID, acceptLanguage);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RefundsApi#getRefundOrder");
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
| **zenkiRefundId** | **String**| Unique refund identifier generated by Zenkipay. | |
| **contentType** | **String**| Content type accepted. | |
| **accept** | **String**| Accepted formats. | |
| **X_ZENKI_PLUGIN_ID** | **String**| Unique customer identifier used to establish connection with Zenkipay services. | [optional] |
| **acceptLanguage** | **String**| Indicates the language type code for which the content of the services response is returned according to the language reported.  The definition of the ISO_639 standard is used. See: https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes or https://www.iso.org/iso-639-language-codes.html | [optional] |

### Return type

[**Refund**](Refund.md)

### Authorization

[JWTAuth](../README.md#JWTAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | refund information. |  -  |
| **400** | Expected repayment parameter. |  -  |
| **403** | Access denied. |  -  |
| **404** | Resource not found. |  -  |
| **406** | Headers not accepted. |  -  |
| **428** | Parameter name cannot be found. |  -  |
| **500** | Internal Server Error. |  -  |


## registerRefundOrder

> Refund registerRefundOrder(zenkiOrderId, contentType, accept, X_ZENKI_PLUGIN_ID, acceptLanguage, requestRefund)

Register of refunds for an order

One or more refunds are recorded by the order number.

### Example

```java
// Import classes:
import fi.zenki.zenkipay.api.ApiClient;
import fi.zenki.zenkipay.api.ApiException;
import fi.zenki.zenkipay.api.Configuration;
import fi.zenki.zenkipay.api.auth.*;
import fi.zenki.zenkipay.api.models.*;
import fi.zenki.zenkipay.api.services.RefundsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.zenki.fi");
        
        // Configure HTTP bearer authorization: JWTAuth
        HttpBearerAuth JWTAuth = (HttpBearerAuth) defaultClient.getAuthentication("JWTAuth");
        JWTAuth.setBearerToken("BEARER TOKEN");

        RefundsApi apiInstance = new RefundsApi(defaultClient);
        String zenkiOrderId = "zenkiOrderId_example"; // String | Unique order identifier generated by Zenkipay.
        String contentType = "application/json"; // String | Content type accepted.
        String accept = "application/json"; // String | Accepted formats.
        String X_ZENKI_PLUGIN_ID = "4188918f7da1547d13e3"; // String | Unique customer identifier used to establish connection with Zenkipay services.
        String acceptLanguage = "en"; // String | Indicates the language type code for which the content of the services response is returned according to the language reported.  The definition of the ISO_639 standard is used. See: https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes or https://www.iso.org/iso-639-language-codes.html
        RequestRefund requestRefund = new RequestRefund(); // RequestRefund | A JSON structure will be sent, where one refund can be sent.
        try {
            Refund result = apiInstance.registerRefundOrder(zenkiOrderId, contentType, accept, X_ZENKI_PLUGIN_ID, acceptLanguage, requestRefund);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling RefundsApi#registerRefundOrder");
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
| **requestRefund** | [**RequestRefund**](RequestRefund.md)| A JSON structure will be sent, where one refund can be sent. | [optional] |

### Return type

[**Refund**](Refund.md)

### Authorization

[JWTAuth](../README.md#JWTAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Refund generated. |  -  |
| **400** | Expected repayment parameter. |  -  |
| **403** | Access denied. |  -  |
| **404** | Resource not found. |  -  |
| **406** | Headers not accepted. |  -  |
| **428** | Parameter name cannot be found. |  -  |
| **500** | Internal Server Error. |  -  |

