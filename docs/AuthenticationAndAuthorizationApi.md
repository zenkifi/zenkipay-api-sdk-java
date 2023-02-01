# AuthenticationAndAuthorizationApi

All URIs are relative to *https://api.zenki.fi*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createToken**](AuthenticationAndAuthorizationApi.md#createToken) | **POST** /v1/oauth/tokens | Create an authentication token in Zenki |
| [**createTokenWithHttpInfo**](AuthenticationAndAuthorizationApi.md#createTokenWithHttpInfo) | **POST** /v1/oauth/tokens | Create an authentication token in Zenki |



## createToken

> TokenOAuth2 createToken(contentType, accept, requestTokenOAuth2)

Create an authentication token in Zenki

This request must be sent each time it is required to generate a token to consume Zenki services.

### Example

```java
// Import classes:
import fi.zenki.zenkipay.api.ApiClient;
import fi.zenki.zenkipay.api.ApiException;
import fi.zenki.zenkipay.api.Configuration;
import fi.zenki.zenkipay.api.models.*;
import fi.zenki.zenkipay.api.services.AuthenticationAndAuthorizationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.zenki.fi");

        AuthenticationAndAuthorizationApi apiInstance = new AuthenticationAndAuthorizationApi(defaultClient);
        String contentType = "application/json"; // String | Tipo de contenido aceptado.
        String accept = "application/json"; // String | Formatos aceptados.
        RequestTokenOAuth2 requestTokenOAuth2 = new RequestTokenOAuth2(); // RequestTokenOAuth2 | Parameters for OAuth 2 token creation.
        try {
            TokenOAuth2 result = apiInstance.createToken(contentType, accept, requestTokenOAuth2);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AuthenticationAndAuthorizationApi#createToken");
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
| **contentType** | **String**| Tipo de contenido aceptado. | |
| **accept** | **String**| Formatos aceptados. | |
| **requestTokenOAuth2** | [**RequestTokenOAuth2**](RequestTokenOAuth2.md)| Parameters for OAuth 2 token creation. | [optional] |

### Return type

[**TokenOAuth2**](TokenOAuth2.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Token created successfully. |  -  |
| **400** | Token creation failed, please review the details and try again. |  -  |
| **500** | Unexpected error creating auth token, contact Zenki support team at support@zenki.fi |  -  |

## createTokenWithHttpInfo

> ApiResponse<TokenOAuth2> createToken createTokenWithHttpInfo(contentType, accept, requestTokenOAuth2)

Create an authentication token in Zenki

This request must be sent each time it is required to generate a token to consume Zenki services.

### Example

```java
// Import classes:
import fi.zenki.zenkipay.api.ApiClient;
import fi.zenki.zenkipay.api.ApiException;
import fi.zenki.zenkipay.api.ApiResponse;
import fi.zenki.zenkipay.api.Configuration;
import fi.zenki.zenkipay.api.models.*;
import fi.zenki.zenkipay.api.services.AuthenticationAndAuthorizationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.zenki.fi");

        AuthenticationAndAuthorizationApi apiInstance = new AuthenticationAndAuthorizationApi(defaultClient);
        String contentType = "application/json"; // String | Tipo de contenido aceptado.
        String accept = "application/json"; // String | Formatos aceptados.
        RequestTokenOAuth2 requestTokenOAuth2 = new RequestTokenOAuth2(); // RequestTokenOAuth2 | Parameters for OAuth 2 token creation.
        try {
            ApiResponse<TokenOAuth2> response = apiInstance.createTokenWithHttpInfo(contentType, accept, requestTokenOAuth2);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling AuthenticationAndAuthorizationApi#createToken");
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
| **contentType** | **String**| Tipo de contenido aceptado. | |
| **accept** | **String**| Formatos aceptados. | |
| **requestTokenOAuth2** | [**RequestTokenOAuth2**](RequestTokenOAuth2.md)| Parameters for OAuth 2 token creation. | [optional] |

### Return type

ApiResponse<[**TokenOAuth2**](TokenOAuth2.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Token created successfully. |  -  |
| **400** | Token creation failed, please review the details and try again. |  -  |
| **500** | Unexpected error creating auth token, contact Zenki support team at support@zenki.fi |  -  |

