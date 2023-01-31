/*
 * Zenkipay API
 * Definition of technical specification of the product; Zenkipay is a gateway cryptocurrency payment system that allows merchant's to receive payments on their e-commerce portals. Unlike other platforms, Zenkipay ensures customer satisfaction through its payment process. guarantee deposit (delivered product and expected quality) to settle payment to the merchant, thus avoiding the loss of client assets due to online scams.
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: support@zenki.fi
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package fi.zenki.zenkipay.api.services;

import fi.zenki.zenkipay.api.ApiClient;
import fi.zenki.zenkipay.api.ApiException;
import fi.zenki.zenkipay.api.ApiResponse;
import fi.zenki.zenkipay.api.Pair;

import fi.zenki.zenkipay.api.model.CreateOrder;
import fi.zenki.zenkipay.api.model.ErrorResponse;
import fi.zenki.zenkipay.api.model.Order;
import fi.zenki.zenkipay.api.model.UpdateOrder;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

import java.util.ArrayList;
import java.util.StringJoiner;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-31T20:01:36.761525480Z[Etc/UTC]")
public class OrdersApi {
  private final HttpClient memberVarHttpClient;
  private final ObjectMapper memberVarObjectMapper;
  private final String memberVarBaseUri;
  private final Consumer<HttpRequest.Builder> memberVarInterceptor;
  private final Duration memberVarReadTimeout;
  private final Consumer<HttpResponse<InputStream>> memberVarResponseInterceptor;
  private final Consumer<HttpResponse<String>> memberVarAsyncResponseInterceptor;

  public OrdersApi() {
    this(new ApiClient());
  }

  public OrdersApi(ApiClient apiClient) {
    memberVarHttpClient = apiClient.getHttpClient();
    memberVarObjectMapper = apiClient.getObjectMapper();
    memberVarBaseUri = apiClient.getBaseUri();
    memberVarInterceptor = apiClient.getRequestInterceptor();
    memberVarReadTimeout = apiClient.getReadTimeout();
    memberVarResponseInterceptor = apiClient.getResponseInterceptor();
    memberVarAsyncResponseInterceptor = apiClient.getAsyncResponseInterceptor();
  }

  protected ApiException getApiException(String operationId, HttpResponse<InputStream> response) throws IOException {
    String body = response.body() == null ? null : new String(response.body().readAllBytes());
    String message = formatExceptionMessage(operationId, response.statusCode(), body);
    return new ApiException(response.statusCode(), message, response.headers(), body);
  }

  private String formatExceptionMessage(String operationId, int statusCode, String body) {
    if (body == null || body.isEmpty()) {
      body = "[no body]";
    }
    return operationId + " call failed with: " + statusCode + " - " + body;
  }

  /**
   * Payment order registration
   * Service that allows registering a payment order and associating it with a merchant.
   * @param contentType Content type accepted. (required)
   * @param accept Accepted formats. (required)
   * @param X_ZENKI_PLUGIN_ID Unique customer identifier used to establish connection with Zenkipay services. (optional)
   * @param acceptLanguage Indicates the language type code for which the content of the services response is returned according to the language reported.  The definition of the ISO_639 standard is used. See: https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes or https://www.iso.org/iso-639-language-codes.html (optional)
   * @param createOrder A JSON structure will be sent that will have the required information to create an order. (optional)
   * @return Order
   * @throws ApiException if fails to make API call
   * For more details on the services, consult the documentation Zenkipay official.
   * @see <a href="https://developer.zenki.fi/">Payment order registration Documentation</a>
   */
  public Order createOrder(String contentType, String accept, String X_ZENKI_PLUGIN_ID, String acceptLanguage, CreateOrder createOrder) throws ApiException {
    ApiResponse<Order> localVarResponse = createOrderWithHttpInfo(contentType, accept, X_ZENKI_PLUGIN_ID, acceptLanguage, createOrder);
    return localVarResponse.getData();
  }

  /**
   * Payment order registration
   * Service that allows registering a payment order and associating it with a merchant.
   * @param contentType Content type accepted. (required)
   * @param accept Accepted formats. (required)
   * @param X_ZENKI_PLUGIN_ID Unique customer identifier used to establish connection with Zenkipay services. (optional)
   * @param acceptLanguage Indicates the language type code for which the content of the services response is returned according to the language reported.  The definition of the ISO_639 standard is used. See: https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes or https://www.iso.org/iso-639-language-codes.html (optional)
   * @param createOrder A JSON structure will be sent that will have the required information to create an order. (optional)
   * @return ApiResponse&lt;Order&gt;
   * @throws ApiException if fails to make API call
   * For more details on the services, consult the documentation Zenkipay official.
   * @see <a href="https://developer.zenki.fi/">Payment order registration Documentation</a>
   */
  public ApiResponse<Order> createOrderWithHttpInfo(String contentType, String accept, String X_ZENKI_PLUGIN_ID, String acceptLanguage, CreateOrder createOrder) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = createOrderRequestBuilder(contentType, accept, X_ZENKI_PLUGIN_ID, acceptLanguage, createOrder);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("createOrder", localVarResponse);
        }
        return new ApiResponse<Order>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<Order>() {}) // closes the InputStream
          
        );
      } finally {
      }
    } catch (IOException e) {
      throw new ApiException(e);
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }

  private HttpRequest.Builder createOrderRequestBuilder(String contentType, String accept, String X_ZENKI_PLUGIN_ID, String acceptLanguage, CreateOrder createOrder) throws ApiException {
    // verify the required parameter 'contentType' is set
    if (contentType == null) {
      throw new ApiException(400, "Missing the required parameter 'contentType' when calling createOrder");
    }
    // verify the required parameter 'accept' is set
    if (accept == null) {
      throw new ApiException(400, "Missing the required parameter 'accept' when calling createOrder");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/v1/pay/orders";

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    if (X_ZENKI_PLUGIN_ID != null) {
      localVarRequestBuilder.header("X-ZENKI-PLUGIN-ID", X_ZENKI_PLUGIN_ID.toString());
    }
    if (acceptLanguage != null) {
      localVarRequestBuilder.header("Accept-Language", acceptLanguage.toString());
    }
    if (contentType != null) {
      localVarRequestBuilder.header("Content-Type", contentType.toString());
    }
    if (accept != null) {
      localVarRequestBuilder.header("Accept", accept.toString());
    }
    localVarRequestBuilder.header("Content-Type", "application/json");
    localVarRequestBuilder.header("Accept", "application/hal+json, application/json");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(createOrder);
      localVarRequestBuilder.method("POST", HttpRequest.BodyPublishers.ofByteArray(localVarPostBody));
    } catch (IOException e) {
      throw new ApiException(e);
    }
    if (memberVarReadTimeout != null) {
      localVarRequestBuilder.timeout(memberVarReadTimeout);
    }
    if (memberVarInterceptor != null) {
      memberVarInterceptor.accept(localVarRequestBuilder);
    }
    return localVarRequestBuilder;
  }
  /**
   * Order information
   * Order information is obtained based on the Zenkipay order id.
   * @param zenkiOrderId Unique order identifier generated by Zenkipay. (required)
   * @param contentType Content type accepted. (required)
   * @param accept Accepted formats. (required)
   * @param X_ZENKI_PLUGIN_ID Unique customer identifier used to establish connection with Zenkipay services. (optional)
   * @param acceptLanguage Indicates the language type code for which the content of the services response is returned according to the language reported.  The definition of the ISO_639 standard is used. See: https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes or https://www.iso.org/iso-639-language-codes.html (optional)
   * @return Order
   * @throws ApiException if fails to make API call
   * For more details on the services, consult the documentation Zenkipay official.
   * @see <a href="https://developer.zenki.fi/">Order information Documentation</a>
   */
  public Order getOrder(String zenkiOrderId, String contentType, String accept, String X_ZENKI_PLUGIN_ID, String acceptLanguage) throws ApiException {
    ApiResponse<Order> localVarResponse = getOrderWithHttpInfo(zenkiOrderId, contentType, accept, X_ZENKI_PLUGIN_ID, acceptLanguage);
    return localVarResponse.getData();
  }

  /**
   * Order information
   * Order information is obtained based on the Zenkipay order id.
   * @param zenkiOrderId Unique order identifier generated by Zenkipay. (required)
   * @param contentType Content type accepted. (required)
   * @param accept Accepted formats. (required)
   * @param X_ZENKI_PLUGIN_ID Unique customer identifier used to establish connection with Zenkipay services. (optional)
   * @param acceptLanguage Indicates the language type code for which the content of the services response is returned according to the language reported.  The definition of the ISO_639 standard is used. See: https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes or https://www.iso.org/iso-639-language-codes.html (optional)
   * @return ApiResponse&lt;Order&gt;
   * @throws ApiException if fails to make API call
   * For more details on the services, consult the documentation Zenkipay official.
   * @see <a href="https://developer.zenki.fi/">Order information Documentation</a>
   */
  public ApiResponse<Order> getOrderWithHttpInfo(String zenkiOrderId, String contentType, String accept, String X_ZENKI_PLUGIN_ID, String acceptLanguage) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = getOrderRequestBuilder(zenkiOrderId, contentType, accept, X_ZENKI_PLUGIN_ID, acceptLanguage);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("getOrder", localVarResponse);
        }
        return new ApiResponse<Order>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<Order>() {}) // closes the InputStream
          
        );
      } finally {
      }
    } catch (IOException e) {
      throw new ApiException(e);
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }

  private HttpRequest.Builder getOrderRequestBuilder(String zenkiOrderId, String contentType, String accept, String X_ZENKI_PLUGIN_ID, String acceptLanguage) throws ApiException {
    // verify the required parameter 'zenkiOrderId' is set
    if (zenkiOrderId == null) {
      throw new ApiException(400, "Missing the required parameter 'zenkiOrderId' when calling getOrder");
    }
    // verify the required parameter 'contentType' is set
    if (contentType == null) {
      throw new ApiException(400, "Missing the required parameter 'contentType' when calling getOrder");
    }
    // verify the required parameter 'accept' is set
    if (accept == null) {
      throw new ApiException(400, "Missing the required parameter 'accept' when calling getOrder");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/v1/pay/orders/{zenkiOrderId}"
        .replace("{zenkiOrderId}", ApiClient.urlEncode(zenkiOrderId.toString()));

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    if (X_ZENKI_PLUGIN_ID != null) {
      localVarRequestBuilder.header("X-ZENKI-PLUGIN-ID", X_ZENKI_PLUGIN_ID.toString());
    }
    if (acceptLanguage != null) {
      localVarRequestBuilder.header("Accept-Language", acceptLanguage.toString());
    }
    if (contentType != null) {
      localVarRequestBuilder.header("Content-Type", contentType.toString());
    }
    if (accept != null) {
      localVarRequestBuilder.header("Accept", accept.toString());
    }
    localVarRequestBuilder.header("Accept", "application/hal+json, application/json");

    localVarRequestBuilder.method("GET", HttpRequest.BodyPublishers.noBody());
    if (memberVarReadTimeout != null) {
      localVarRequestBuilder.timeout(memberVarReadTimeout);
    }
    if (memberVarInterceptor != null) {
      memberVarInterceptor.accept(localVarRequestBuilder);
    }
    return localVarRequestBuilder;
  }
  /**
   * Order update for payment
   * Service that allows updating a payment order.
   * @param zenkiOrderId Unique order identifier generated by Zenkipay. (required)
   * @param contentType Content type accepted. (required)
   * @param accept Accepted formats. (required)
   * @param X_ZENKI_PLUGIN_ID Unique customer identifier used to establish connection with Zenkipay services. (optional)
   * @param acceptLanguage Indicates the language type code for which the content of the services response is returned according to the language reported.  The definition of the ISO_639 standard is used. See: https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes or https://www.iso.org/iso-639-language-codes.html (optional)
   * @param updateOrder A JSON structure will be sent that will have the required information to update an order. (optional)
   * @return Order
   * @throws ApiException if fails to make API call
   * For more details on the services, consult the documentation Zenkipay official.
   * @see <a href="https://developer.zenki.fi/">Order update for payment Documentation</a>
   */
  public Order updateOrder(String zenkiOrderId, String contentType, String accept, String X_ZENKI_PLUGIN_ID, String acceptLanguage, UpdateOrder updateOrder) throws ApiException {
    ApiResponse<Order> localVarResponse = updateOrderWithHttpInfo(zenkiOrderId, contentType, accept, X_ZENKI_PLUGIN_ID, acceptLanguage, updateOrder);
    return localVarResponse.getData();
  }

  /**
   * Order update for payment
   * Service that allows updating a payment order.
   * @param zenkiOrderId Unique order identifier generated by Zenkipay. (required)
   * @param contentType Content type accepted. (required)
   * @param accept Accepted formats. (required)
   * @param X_ZENKI_PLUGIN_ID Unique customer identifier used to establish connection with Zenkipay services. (optional)
   * @param acceptLanguage Indicates the language type code for which the content of the services response is returned according to the language reported.  The definition of the ISO_639 standard is used. See: https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes or https://www.iso.org/iso-639-language-codes.html (optional)
   * @param updateOrder A JSON structure will be sent that will have the required information to update an order. (optional)
   * @return ApiResponse&lt;Order&gt;
   * @throws ApiException if fails to make API call
   * For more details on the services, consult the documentation Zenkipay official.
   * @see <a href="https://developer.zenki.fi/">Order update for payment Documentation</a>
   */
  public ApiResponse<Order> updateOrderWithHttpInfo(String zenkiOrderId, String contentType, String accept, String X_ZENKI_PLUGIN_ID, String acceptLanguage, UpdateOrder updateOrder) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = updateOrderRequestBuilder(zenkiOrderId, contentType, accept, X_ZENKI_PLUGIN_ID, acceptLanguage, updateOrder);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("updateOrder", localVarResponse);
        }
        return new ApiResponse<Order>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<Order>() {}) // closes the InputStream
          
        );
      } finally {
      }
    } catch (IOException e) {
      throw new ApiException(e);
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }

  private HttpRequest.Builder updateOrderRequestBuilder(String zenkiOrderId, String contentType, String accept, String X_ZENKI_PLUGIN_ID, String acceptLanguage, UpdateOrder updateOrder) throws ApiException {
    // verify the required parameter 'zenkiOrderId' is set
    if (zenkiOrderId == null) {
      throw new ApiException(400, "Missing the required parameter 'zenkiOrderId' when calling updateOrder");
    }
    // verify the required parameter 'contentType' is set
    if (contentType == null) {
      throw new ApiException(400, "Missing the required parameter 'contentType' when calling updateOrder");
    }
    // verify the required parameter 'accept' is set
    if (accept == null) {
      throw new ApiException(400, "Missing the required parameter 'accept' when calling updateOrder");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/v1/pay/orders/{zenkiOrderId}"
        .replace("{zenkiOrderId}", ApiClient.urlEncode(zenkiOrderId.toString()));

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    if (X_ZENKI_PLUGIN_ID != null) {
      localVarRequestBuilder.header("X-ZENKI-PLUGIN-ID", X_ZENKI_PLUGIN_ID.toString());
    }
    if (acceptLanguage != null) {
      localVarRequestBuilder.header("Accept-Language", acceptLanguage.toString());
    }
    if (contentType != null) {
      localVarRequestBuilder.header("Content-Type", contentType.toString());
    }
    if (accept != null) {
      localVarRequestBuilder.header("Accept", accept.toString());
    }
    localVarRequestBuilder.header("Content-Type", "application/json");
    localVarRequestBuilder.header("Accept", "application/hal+json, application/json");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(updateOrder);
      localVarRequestBuilder.method("PATCH", HttpRequest.BodyPublishers.ofByteArray(localVarPostBody));
    } catch (IOException e) {
      throw new ApiException(e);
    }
    if (memberVarReadTimeout != null) {
      localVarRequestBuilder.timeout(memberVarReadTimeout);
    }
    if (memberVarInterceptor != null) {
      memberVarInterceptor.accept(localVarRequestBuilder);
    }
    return localVarRequestBuilder;
  }
}
