# MerchantsApi

All URIs are relative to *https://api.zenki.fi*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getMerchantInfo**](MerchantsApi.md#getMerchantInfo) | **GET** /v1/pay/me | Merchant information |
| [**getMerchantInfoWithHttpInfo**](MerchantsApi.md#getMerchantInfoWithHttpInfo) | **GET** /v1/pay/me | Merchant information |



## getMerchantInfo

> Merchant getMerchantInfo(contentType, accept, X_ZENKI_PLUGIN_ID, acceptLanguage)

Merchant information

The current configuration of the merchnat is obtained.

### Example

```java
// Import classes:
import fi.zenki.zenkipay.api.ApiClient;
import fi.zenki.zenkipay.api.ApiException;
import fi.zenki.zenkipay.api.Configuration;
import fi.zenki.zenkipay.api.auth.*;
import fi.zenki.zenkipay.api.models.*;
import fi.zenki.zenkipay.api.services.MerchantsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.zenki.fi");
        
        // Configure HTTP bearer authorization: JWTAuth
        HttpBearerAuth JWTAuth = (HttpBearerAuth) defaultClient.getAuthentication("JWTAuth");
        JWTAuth.setBearerToken("BEARER TOKEN");

        MerchantsApi apiInstance = new MerchantsApi(defaultClient);
        String contentType = "application/json"; // String | Content type accepted.
        String accept = "application/json"; // String | Accepted formats.
        String X_ZENKI_PLUGIN_ID = "4188918f7da1547d13e3"; // String | Unique customer identifier used to establish connection with Zenkipay services.
        String acceptLanguage = "en"; // String | Indicates the language type code for which the content of the services response is returned according to the language reported.  The definition of the ISO_639 standard is used. See: https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes or https://www.iso.org/iso-639-language-codes.html
        try {
            Merchant result = apiInstance.getMerchantInfo(contentType, accept, X_ZENKI_PLUGIN_ID, acceptLanguage);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MerchantsApi#getMerchantInfo");
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

### Return type

[**Merchant**](Merchant.md)


### Authorization

[JWTAuth](../README.md#JWTAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Obtain merchnat information. |  -  |
| **400** | Parámetro de comercio esperado. |  -  |
| **403** | Access denied. |  -  |
| **404** | Resource not found. |  -  |
| **406** | Headers not accepted. |  -  |
| **428** | Parameter name cannot be found. |  -  |
| **500** | Internal Server Error. |  -  |

## getMerchantInfoWithHttpInfo

> ApiResponse<Merchant> getMerchantInfo getMerchantInfoWithHttpInfo(contentType, accept, X_ZENKI_PLUGIN_ID, acceptLanguage)

Merchant information

The current configuration of the merchnat is obtained.

### Example

```java
// Import classes:
import fi.zenki.zenkipay.api.ApiClient;
import fi.zenki.zenkipay.api.ApiException;
import fi.zenki.zenkipay.api.ApiResponse;
import fi.zenki.zenkipay.api.Configuration;
import fi.zenki.zenkipay.api.auth.*;
import fi.zenki.zenkipay.api.models.*;
import fi.zenki.zenkipay.api.services.MerchantsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.zenki.fi");
        
        // Configure HTTP bearer authorization: JWTAuth
        HttpBearerAuth JWTAuth = (HttpBearerAuth) defaultClient.getAuthentication("JWTAuth");
        JWTAuth.setBearerToken("BEARER TOKEN");

        MerchantsApi apiInstance = new MerchantsApi(defaultClient);
        String contentType = "application/json"; // String | Content type accepted.
        String accept = "application/json"; // String | Accepted formats.
        String X_ZENKI_PLUGIN_ID = "4188918f7da1547d13e3"; // String | Unique customer identifier used to establish connection with Zenkipay services.
        String acceptLanguage = "en"; // String | Indicates the language type code for which the content of the services response is returned according to the language reported.  The definition of the ISO_639 standard is used. See: https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes or https://www.iso.org/iso-639-language-codes.html
        try {
            ApiResponse<Merchant> response = apiInstance.getMerchantInfoWithHttpInfo(contentType, accept, X_ZENKI_PLUGIN_ID, acceptLanguage);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling MerchantsApi#getMerchantInfo");
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

### Return type

ApiResponse<[**Merchant**](Merchant.md)>


### Authorization

[JWTAuth](../README.md#JWTAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Obtain merchnat information. |  -  |
| **400** | Parámetro de comercio esperado. |  -  |
| **403** | Access denied. |  -  |
| **404** | Resource not found. |  -  |
| **406** | Headers not accepted. |  -  |
| **428** | Parameter name cannot be found. |  -  |
| **500** | Internal Server Error. |  -  |

