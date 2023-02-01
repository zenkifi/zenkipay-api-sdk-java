# OrdersApi

All URIs are relative to *https://api.zenki.fi*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createOrder**](OrdersApi.md#createOrder) | **POST** /v1/pay/orders | Payment order registration. |
| [**createOrderWithHttpInfo**](OrdersApi.md#createOrderWithHttpInfo) | **POST** /v1/pay/orders | Payment order registration. |
| [**getOrder**](OrdersApi.md#getOrder) | **GET** /v1/pay/orders/{zenkiOrderId} | Order information. |
| [**getOrderWithHttpInfo**](OrdersApi.md#getOrderWithHttpInfo) | **GET** /v1/pay/orders/{zenkiOrderId} | Order information. |
| [**updateOrder**](OrdersApi.md#updateOrder) | **PATCH** /v1/pay/orders/{zenkiOrderId} | Order update for payment |
| [**updateOrderWithHttpInfo**](OrdersApi.md#updateOrderWithHttpInfo) | **PATCH** /v1/pay/orders/{zenkiOrderId} | Order update for payment |



## createOrder

> Order createOrder(contentType, accept, X_ZENKI_PLUGIN_ID, acceptLanguage, createOrder)

Payment order registration.

Service that allows registering a payment order and associating it with a merchant.

### Example

```java
// Import classes:
import fi.zenki.zenkipay.api.ApiClient;
import fi.zenki.zenkipay.api.ApiException;
import fi.zenki.zenkipay.api.Configuration;
import fi.zenki.zenkipay.api.auth.*;
import fi.zenki.zenkipay.api.models.*;
import fi.zenki.zenkipay.api.services.OrdersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.zenki.fi");
        
        // Configure HTTP bearer authorization: JWTAuth
        HttpBearerAuth JWTAuth = (HttpBearerAuth) defaultClient.getAuthentication("JWTAuth");
        JWTAuth.setBearerToken("BEARER TOKEN");

        OrdersApi apiInstance = new OrdersApi(defaultClient);
        String contentType = "application/json"; // String | Content type accepted.
        String accept = "application/json"; // String | Accepted formats.
        String X_ZENKI_PLUGIN_ID = "4188918f7da1547d13e3"; // String | Unique customer identifier used to establish connection with Zenkipay services.
        String acceptLanguage = "en"; // String | Indicates the language type code for which the content of the services response is returned according to the language reported.  The definition of the ISO_639 standard is used. See: https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes or https://www.iso.org/iso-639-language-codes.html
        CreateOrder createOrder = new CreateOrder(); // CreateOrder | A JSON structure will be sent that will have the required information to create an order.
        try {
            Order result = apiInstance.createOrder(contentType, accept, X_ZENKI_PLUGIN_ID, acceptLanguage, createOrder);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OrdersApi#createOrder");
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
| **contentType** | **String**| Content type accepted. | |
| **accept** | **String**| Accepted formats. | |
| **X_ZENKI_PLUGIN_ID** | **String**| Unique customer identifier used to establish connection with Zenkipay services. | [optional] |
| **acceptLanguage** | **String**| Indicates the language type code for which the content of the services response is returned according to the language reported.  The definition of the ISO_639 standard is used. See: https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes or https://www.iso.org/iso-639-language-codes.html | [optional] |
| **createOrder** | [**CreateOrder**](CreateOrder.md)| A JSON structure will be sent that will have the required information to create an order. | [optional] |

### Return type

[**Order**](Order.md)


### Authorization

[JWTAuth](../README.md#JWTAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/hal+json, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Order created. |  -  |
| **400** | Expected order parameter. |  -  |
| **403** | Access denied. |  -  |
| **404** | Resource not found. |  -  |
| **406** | Headers not accepted. |  -  |
| **428** | Parameter name cannot be found. |  -  |
| **500** | Internal Server Error. |  -  |

## createOrderWithHttpInfo

> ApiResponse<Order> createOrder createOrderWithHttpInfo(contentType, accept, X_ZENKI_PLUGIN_ID, acceptLanguage, createOrder)

Payment order registration.

Service that allows registering a payment order and associating it with a merchant.

### Example

```java
// Import classes:
import fi.zenki.zenkipay.api.ApiClient;
import fi.zenki.zenkipay.api.ApiException;
import fi.zenki.zenkipay.api.ApiResponse;
import fi.zenki.zenkipay.api.Configuration;
import fi.zenki.zenkipay.api.auth.*;
import fi.zenki.zenkipay.api.models.*;
import fi.zenki.zenkipay.api.services.OrdersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.zenki.fi");
        
        // Configure HTTP bearer authorization: JWTAuth
        HttpBearerAuth JWTAuth = (HttpBearerAuth) defaultClient.getAuthentication("JWTAuth");
        JWTAuth.setBearerToken("BEARER TOKEN");

        OrdersApi apiInstance = new OrdersApi(defaultClient);
        String contentType = "application/json"; // String | Content type accepted.
        String accept = "application/json"; // String | Accepted formats.
        String X_ZENKI_PLUGIN_ID = "4188918f7da1547d13e3"; // String | Unique customer identifier used to establish connection with Zenkipay services.
        String acceptLanguage = "en"; // String | Indicates the language type code for which the content of the services response is returned according to the language reported.  The definition of the ISO_639 standard is used. See: https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes or https://www.iso.org/iso-639-language-codes.html
        CreateOrder createOrder = new CreateOrder(); // CreateOrder | A JSON structure will be sent that will have the required information to create an order.
        try {
            ApiResponse<Order> response = apiInstance.createOrderWithHttpInfo(contentType, accept, X_ZENKI_PLUGIN_ID, acceptLanguage, createOrder);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling OrdersApi#createOrder");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **contentType** | **String**| Content type accepted. | |
| **accept** | **String**| Accepted formats. | |
| **X_ZENKI_PLUGIN_ID** | **String**| Unique customer identifier used to establish connection with Zenkipay services. | [optional] |
| **acceptLanguage** | **String**| Indicates the language type code for which the content of the services response is returned according to the language reported.  The definition of the ISO_639 standard is used. See: https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes or https://www.iso.org/iso-639-language-codes.html | [optional] |
| **createOrder** | [**CreateOrder**](CreateOrder.md)| A JSON structure will be sent that will have the required information to create an order. | [optional] |

### Return type

ApiResponse<[**Order**](Order.md)>


### Authorization

[JWTAuth](../README.md#JWTAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/hal+json, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Order created. |  -  |
| **400** | Expected order parameter. |  -  |
| **403** | Access denied. |  -  |
| **404** | Resource not found. |  -  |
| **406** | Headers not accepted. |  -  |
| **428** | Parameter name cannot be found. |  -  |
| **500** | Internal Server Error. |  -  |


## getOrder

> Order getOrder(zenkiOrderId, contentType, accept, X_ZENKI_PLUGIN_ID, acceptLanguage)

Order information.

Order information is obtained based on the Zenkipay order id.

### Example

```java
// Import classes:
import fi.zenki.zenkipay.api.ApiClient;
import fi.zenki.zenkipay.api.ApiException;
import fi.zenki.zenkipay.api.Configuration;
import fi.zenki.zenkipay.api.auth.*;
import fi.zenki.zenkipay.api.models.*;
import fi.zenki.zenkipay.api.services.OrdersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.zenki.fi");
        
        // Configure HTTP bearer authorization: JWTAuth
        HttpBearerAuth JWTAuth = (HttpBearerAuth) defaultClient.getAuthentication("JWTAuth");
        JWTAuth.setBearerToken("BEARER TOKEN");

        OrdersApi apiInstance = new OrdersApi(defaultClient);
        String zenkiOrderId = "zenkiOrderId_example"; // String | Unique order identifier generated by Zenkipay.
        String contentType = "application/json"; // String | Content type accepted.
        String accept = "application/json"; // String | Accepted formats.
        String X_ZENKI_PLUGIN_ID = "4188918f7da1547d13e3"; // String | Unique customer identifier used to establish connection with Zenkipay services.
        String acceptLanguage = "en"; // String | Indicates the language type code for which the content of the services response is returned according to the language reported.  The definition of the ISO_639 standard is used. See: https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes or https://www.iso.org/iso-639-language-codes.html
        try {
            Order result = apiInstance.getOrder(zenkiOrderId, contentType, accept, X_ZENKI_PLUGIN_ID, acceptLanguage);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OrdersApi#getOrder");
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

### Return type

[**Order**](Order.md)


### Authorization

[JWTAuth](../README.md#JWTAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/hal+json, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get order by id. |  -  |
| **400** | Expected order parameter. |  -  |
| **403** | Access denied. |  -  |
| **404** | Resource not found. |  -  |
| **406** | Headers not accepted. |  -  |
| **428** | Parameter name cannot be found. |  -  |
| **500** | Internal Server Error. |  -  |

## getOrderWithHttpInfo

> ApiResponse<Order> getOrder getOrderWithHttpInfo(zenkiOrderId, contentType, accept, X_ZENKI_PLUGIN_ID, acceptLanguage)

Order information.

Order information is obtained based on the Zenkipay order id.

### Example

```java
// Import classes:
import fi.zenki.zenkipay.api.ApiClient;
import fi.zenki.zenkipay.api.ApiException;
import fi.zenki.zenkipay.api.ApiResponse;
import fi.zenki.zenkipay.api.Configuration;
import fi.zenki.zenkipay.api.auth.*;
import fi.zenki.zenkipay.api.models.*;
import fi.zenki.zenkipay.api.services.OrdersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.zenki.fi");
        
        // Configure HTTP bearer authorization: JWTAuth
        HttpBearerAuth JWTAuth = (HttpBearerAuth) defaultClient.getAuthentication("JWTAuth");
        JWTAuth.setBearerToken("BEARER TOKEN");

        OrdersApi apiInstance = new OrdersApi(defaultClient);
        String zenkiOrderId = "zenkiOrderId_example"; // String | Unique order identifier generated by Zenkipay.
        String contentType = "application/json"; // String | Content type accepted.
        String accept = "application/json"; // String | Accepted formats.
        String X_ZENKI_PLUGIN_ID = "4188918f7da1547d13e3"; // String | Unique customer identifier used to establish connection with Zenkipay services.
        String acceptLanguage = "en"; // String | Indicates the language type code for which the content of the services response is returned according to the language reported.  The definition of the ISO_639 standard is used. See: https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes or https://www.iso.org/iso-639-language-codes.html
        try {
            ApiResponse<Order> response = apiInstance.getOrderWithHttpInfo(zenkiOrderId, contentType, accept, X_ZENKI_PLUGIN_ID, acceptLanguage);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling OrdersApi#getOrder");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
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

### Return type

ApiResponse<[**Order**](Order.md)>


### Authorization

[JWTAuth](../README.md#JWTAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/hal+json, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get order by id. |  -  |
| **400** | Expected order parameter. |  -  |
| **403** | Access denied. |  -  |
| **404** | Resource not found. |  -  |
| **406** | Headers not accepted. |  -  |
| **428** | Parameter name cannot be found. |  -  |
| **500** | Internal Server Error. |  -  |


## updateOrder

> Order updateOrder(zenkiOrderId, contentType, accept, X_ZENKI_PLUGIN_ID, acceptLanguage, updateOrder)

Order update for payment

Service that allows updating a payment order.

### Example

```java
// Import classes:
import fi.zenki.zenkipay.api.ApiClient;
import fi.zenki.zenkipay.api.ApiException;
import fi.zenki.zenkipay.api.Configuration;
import fi.zenki.zenkipay.api.auth.*;
import fi.zenki.zenkipay.api.models.*;
import fi.zenki.zenkipay.api.services.OrdersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.zenki.fi");
        
        // Configure HTTP bearer authorization: JWTAuth
        HttpBearerAuth JWTAuth = (HttpBearerAuth) defaultClient.getAuthentication("JWTAuth");
        JWTAuth.setBearerToken("BEARER TOKEN");

        OrdersApi apiInstance = new OrdersApi(defaultClient);
        String zenkiOrderId = "3a89e750101049108eb884e3d2e1d7ba"; // String | Unique order identifier generated by Zenkipay.
        String contentType = "application/json"; // String | Content type accepted.
        String accept = "application/json"; // String | Accepted formats.
        String X_ZENKI_PLUGIN_ID = "4188918f7da1547d13e3"; // String | Unique customer identifier used to establish connection with Zenkipay services.
        String acceptLanguage = "en"; // String | Indicates the language type code for which the content of the services response is returned according to the language reported.  The definition of the ISO_639 standard is used. See: https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes or https://www.iso.org/iso-639-language-codes.html
        UpdateOrder updateOrder = new UpdateOrder(); // UpdateOrder | A JSON structure will be sent that will have the required information to update an order.
        try {
            Order result = apiInstance.updateOrder(zenkiOrderId, contentType, accept, X_ZENKI_PLUGIN_ID, acceptLanguage, updateOrder);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OrdersApi#updateOrder");
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
| **updateOrder** | [**UpdateOrder**](UpdateOrder.md)| A JSON structure will be sent that will have the required information to update an order. | [optional] |

### Return type

[**Order**](Order.md)


### Authorization

[JWTAuth](../README.md#JWTAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/hal+json, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | updated order. |  -  |
| **400** | Expected order parameter. |  -  |
| **403** | Access denied. |  -  |
| **404** | Resource not found. |  -  |
| **406** | Headers not accepted. |  -  |
| **428** | Parameter name cannot be found. |  -  |
| **500** | Internal Server Error. |  -  |

## updateOrderWithHttpInfo

> ApiResponse<Order> updateOrder updateOrderWithHttpInfo(zenkiOrderId, contentType, accept, X_ZENKI_PLUGIN_ID, acceptLanguage, updateOrder)

Order update for payment

Service that allows updating a payment order.

### Example

```java
// Import classes:
import fi.zenki.zenkipay.api.ApiClient;
import fi.zenki.zenkipay.api.ApiException;
import fi.zenki.zenkipay.api.ApiResponse;
import fi.zenki.zenkipay.api.Configuration;
import fi.zenki.zenkipay.api.auth.*;
import fi.zenki.zenkipay.api.models.*;
import fi.zenki.zenkipay.api.services.OrdersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.zenki.fi");
        
        // Configure HTTP bearer authorization: JWTAuth
        HttpBearerAuth JWTAuth = (HttpBearerAuth) defaultClient.getAuthentication("JWTAuth");
        JWTAuth.setBearerToken("BEARER TOKEN");

        OrdersApi apiInstance = new OrdersApi(defaultClient);
        String zenkiOrderId = "3a89e750101049108eb884e3d2e1d7ba"; // String | Unique order identifier generated by Zenkipay.
        String contentType = "application/json"; // String | Content type accepted.
        String accept = "application/json"; // String | Accepted formats.
        String X_ZENKI_PLUGIN_ID = "4188918f7da1547d13e3"; // String | Unique customer identifier used to establish connection with Zenkipay services.
        String acceptLanguage = "en"; // String | Indicates the language type code for which the content of the services response is returned according to the language reported.  The definition of the ISO_639 standard is used. See: https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes or https://www.iso.org/iso-639-language-codes.html
        UpdateOrder updateOrder = new UpdateOrder(); // UpdateOrder | A JSON structure will be sent that will have the required information to update an order.
        try {
            ApiResponse<Order> response = apiInstance.updateOrderWithHttpInfo(zenkiOrderId, contentType, accept, X_ZENKI_PLUGIN_ID, acceptLanguage, updateOrder);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling OrdersApi#updateOrder");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
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
| **updateOrder** | [**UpdateOrder**](UpdateOrder.md)| A JSON structure will be sent that will have the required information to update an order. | [optional] |

### Return type

ApiResponse<[**Order**](Order.md)>


### Authorization

[JWTAuth](../README.md#JWTAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/hal+json, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | updated order. |  -  |
| **400** | Expected order parameter. |  -  |
| **403** | Access denied. |  -  |
| **404** | Resource not found. |  -  |
| **406** | Headers not accepted. |  -  |
| **428** | Parameter name cannot be found. |  -  |
| **500** | Internal Server Error. |  -  |

