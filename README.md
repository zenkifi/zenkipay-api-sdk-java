![example workflow](https://github.com/zenkifi/zenkipay-api-sdk-java/actions/workflows/maven.yml/badge.svg)
# Zenkipay API SDK for JAVA

Zenkipay API

- API version: 1.0.0

- Build date: 2023-02-23T23:28:05.340675397Z[Etc/UTC]

Definition of technical specification of the product; Zenkipay is a gateway
cryptocurrency payment system that allows merchant's to receive payments on their
e-commerce portals. Unlike other platforms,
Zenkipay ensures customer satisfaction through its payment process.
guarantee deposit (delivered product and expected quality) to settle
payment to the merchant, thus avoiding the loss of client assets due to
online scams.

  For more information, please visit [https://www.zenki.fi/](https://www.zenki.fi/)

*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*

## Requirements

Building the API client library requires:

1. Java 1.8+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>fi.zenki.zenkipay</groupId>
  <artifactId>zenkipay-api-client</artifactId>
  <version>1.0.0-SNAPSHOT</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "fi.zenki.zenkipay:zenkipay-api-client:1.0.0-SNAPSHOT"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

- `target/zenkipay-api-client-1.0.0-SNAPSHOT.jar`
- `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import fi.zenki.zenkipay.api.*;
import fi.zenki.zenkipay.api.auth.*;
import fi.zenki.zenkipay.api.model.*;
import fi.zenki.zenkipay.api.services.AuthenticationAndAuthorizationApi;

public class AuthenticationAndAuthorizationApiExample {

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

## Documentation for API Endpoints

All URIs are relative to *https://api.zenki.fi*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AuthenticationAndAuthorizationApi* | [**createToken**](docs/AuthenticationAndAuthorizationApi.md#createToken) | **POST** /v1/oauth/tokens | Create an authentication token in Zenki
*EscrowApi* | [**updateEscrow**](docs/EscrowApi.md#updateEscrow) | **PATCH** /v1/pay/escrow/{zenkiOrderId}/fulfillments | Escrow update
*MerchantsApi* | [**getMerchantInfo**](docs/MerchantsApi.md#getMerchantInfo) | **GET** /v1/pay/me | Merchant information
*OrdersApi* | [**createOrder**](docs/OrdersApi.md#createOrder) | **POST** /v1/pay/orders | Payment order registration
*OrdersApi* | [**getOrder**](docs/OrdersApi.md#getOrder) | **GET** /v1/pay/orders/{zenkiOrderId} | Order information
*OrdersApi* | [**updateOrder**](docs/OrdersApi.md#updateOrder) | **PATCH** /v1/pay/orders/{zenkiOrderId} | Order update for payment
*RefundsApi* | [**getRefundOrder**](docs/RefundsApi.md#getRefundOrder) | **GET** /v1/pay/orders/{zenkiOrderId}/refunds/{zenkiRefundId} | Request refunds for an order
*RefundsApi* | [**registerRefundOrder**](docs/RefundsApi.md#registerRefundOrder) | **POST** /v1/pay/orders/{zenkiOrderId}/refunds | Register of refunds for an order
*TrackingApi* | [**addEventTracking**](docs/TrackingApi.md#addEventTracking) | **PATCH** /v1/pay/orders/{zenkiOrderId}/tracking/{zenkiTrackId} | Shipping Status Update
*TrackingApi* | [**registerTrackingOrders**](docs/TrackingApi.md#registerTrackingOrders) | **POST** /v1/pay/orders/{zenkiOrderId}/tracking | Registration number for tracking
*WebhooksApi* | [**sendEvent**](docs/WebhooksApi.md#sendEvent) | **POST** /URL_MERCHANT | Event notifications for merchant


## Documentation for Models

 - [AddTracking](docs/AddTracking.md)
 - [AddTrackingEvent](docs/AddTrackingEvent.md)
 - [AuthenticationErrorResponse](docs/AuthenticationErrorResponse.md)
 - [Breakdown](docs/Breakdown.md)
 - [CreateOrder](docs/CreateOrder.md)
 - [CryptoPayment](docs/CryptoPayment.md)
 - [ErrorResponse](docs/ErrorResponse.md)
 - [ErrorResponseValidationErrorsInner](docs/ErrorResponseValidationErrorsInner.md)
 - [Item](docs/Item.md)
 - [Merchant](docs/Merchant.md)
 - [MerchantCryptoAssetsInner](docs/MerchantCryptoAssetsInner.md)
 - [MerchantEscrowConfig](docs/MerchantEscrowConfig.md)
 - [MerchantIntegrationConfig](docs/MerchantIntegrationConfig.md)
 - [MerchantIntegrationConfigPluginsInner](docs/MerchantIntegrationConfigPluginsInner.md)
 - [MerchantMerchantInfo](docs/MerchantMerchantInfo.md)
 - [Order](docs/Order.md)
 - [OrderClaim](docs/OrderClaim.md)
 - [OrderDispute](docs/OrderDispute.md)
 - [OrderLinks](docs/OrderLinks.md)
 - [OrderLinksRefund](docs/OrderLinksRefund.md)
 - [OrderPaymentInfo](docs/OrderPaymentInfo.md)
 - [OrderPaymentInfoCryptoLove](docs/OrderPaymentInfoCryptoLove.md)
 - [OrderPaymentInfoExchangeRate](docs/OrderPaymentInfoExchangeRate.md)
 - [OrderSettlementInfo](docs/OrderSettlementInfo.md)
 - [OrderSettlementInfoCryptoSettlement](docs/OrderSettlementInfoCryptoSettlement.md)
 - [Refund](docs/Refund.md)
 - [RefundFiatOriginalPayment](docs/RefundFiatOriginalPayment.md)
 - [RequestRefund](docs/RequestRefund.md)
 - [RequestTokenOAuth2](docs/RequestTokenOAuth2.md)
 - [Shopper](docs/Shopper.md)
 - [TokenOAuth2](docs/TokenOAuth2.md)
 - [Tracking](docs/Tracking.md)
 - [TrackingEventsInner](docs/TrackingEventsInner.md)
 - [TrackingExternalCourier](docs/TrackingExternalCourier.md)
 - [UpdateOrder](docs/UpdateOrder.md)
 - [UpdateOrderShopper](docs/UpdateOrderShopper.md)
 - [Webhook](docs/Webhook.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### JWTAuth


- **Type**: HTTP basic authentication


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

support@zenki.fi

