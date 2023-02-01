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

import fi.zenki.zenkipay.api.model.ErrorResponse;
import fi.zenki.zenkipay.api.model.Refund;
import fi.zenki.zenkipay.api.model.RequestRefund;

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

@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-01T01:12:47.231931203Z[Etc/UTC]")
public class RefundsApi {
  private final HttpClient memberVarHttpClient;
  private final ObjectMapper memberVarObjectMapper;
  private final String memberVarBaseUri;
  private final Consumer<HttpRequest.Builder> memberVarInterceptor;
  private final Duration memberVarReadTimeout;
  private final Consumer<HttpResponse<InputStream>> memberVarResponseInterceptor;
  private final Consumer<HttpResponse<String>> memberVarAsyncResponseInterceptor;

  public RefundsApi() {
    this(new ApiClient());
  }

  public RefundsApi(ApiClient apiClient) {
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
   * Request refunds for an order
   * The refund is consulted by the order number.
   * @param zenkiOrderId Unique order identifier generated by Zenkipay. (required)
   * @param zenkiRefundId Unique refund identifier generated by Zenkipay. (required)
   * @param contentType Content type accepted. (required)
   * @param accept Accepted formats. (required)
   * @param X_ZENKI_PLUGIN_ID Unique customer identifier used to establish connection with Zenkipay services. (optional)
   * @param acceptLanguage Indicates the language type code for which the content of the services response is returned according to the language reported.  The definition of the ISO_639 standard is used. See: https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes or https://www.iso.org/iso-639-language-codes.html (optional)
   * @return Refund
   * @throws ApiException if fails to make API call
   * For more details on the services, consult the documentation Zenkipay official.
   * @see <a href="http://developer.zenki.fi/">Request refunds for an order Documentation</a>
   */
  public Refund getRefundOrder(String zenkiOrderId, String zenkiRefundId, String contentType, String accept, String X_ZENKI_PLUGIN_ID, String acceptLanguage) throws ApiException {
    ApiResponse<Refund> localVarResponse = getRefundOrderWithHttpInfo(zenkiOrderId, zenkiRefundId, contentType, accept, X_ZENKI_PLUGIN_ID, acceptLanguage);
    return localVarResponse.getData();
  }

  /**
   * Request refunds for an order
   * The refund is consulted by the order number.
   * @param zenkiOrderId Unique order identifier generated by Zenkipay. (required)
   * @param zenkiRefundId Unique refund identifier generated by Zenkipay. (required)
   * @param contentType Content type accepted. (required)
   * @param accept Accepted formats. (required)
   * @param X_ZENKI_PLUGIN_ID Unique customer identifier used to establish connection with Zenkipay services. (optional)
   * @param acceptLanguage Indicates the language type code for which the content of the services response is returned according to the language reported.  The definition of the ISO_639 standard is used. See: https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes or https://www.iso.org/iso-639-language-codes.html (optional)
   * @return ApiResponse&lt;Refund&gt;
   * @throws ApiException if fails to make API call
   * For more details on the services, consult the documentation Zenkipay official.
   * @see <a href="http://developer.zenki.fi/">Request refunds for an order Documentation</a>
   */
  public ApiResponse<Refund> getRefundOrderWithHttpInfo(String zenkiOrderId, String zenkiRefundId, String contentType, String accept, String X_ZENKI_PLUGIN_ID, String acceptLanguage) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = getRefundOrderRequestBuilder(zenkiOrderId, zenkiRefundId, contentType, accept, X_ZENKI_PLUGIN_ID, acceptLanguage);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("getRefundOrder", localVarResponse);
        }
        return new ApiResponse<Refund>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<Refund>() {}) // closes the InputStream
          
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

  private HttpRequest.Builder getRefundOrderRequestBuilder(String zenkiOrderId, String zenkiRefundId, String contentType, String accept, String X_ZENKI_PLUGIN_ID, String acceptLanguage) throws ApiException {
    // verify the required parameter 'zenkiOrderId' is set
    if (zenkiOrderId == null) {
      throw new ApiException(400, "Missing the required parameter 'zenkiOrderId' when calling getRefundOrder");
    }
    // verify the required parameter 'zenkiRefundId' is set
    if (zenkiRefundId == null) {
      throw new ApiException(400, "Missing the required parameter 'zenkiRefundId' when calling getRefundOrder");
    }
    // verify the required parameter 'contentType' is set
    if (contentType == null) {
      throw new ApiException(400, "Missing the required parameter 'contentType' when calling getRefundOrder");
    }
    // verify the required parameter 'accept' is set
    if (accept == null) {
      throw new ApiException(400, "Missing the required parameter 'accept' when calling getRefundOrder");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/v1/pay/orders/{zenkiOrderId}/refunds/{zenkiRefundId}"
        .replace("{zenkiOrderId}", ApiClient.urlEncode(zenkiOrderId.toString()))
        .replace("{zenkiRefundId}", ApiClient.urlEncode(zenkiRefundId.toString()));

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
    localVarRequestBuilder.header("Accept", "application/json");

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
   * Register of refunds for an order
   * One or more refunds are recorded by the order number.
   * @param zenkiOrderId Unique order identifier generated by Zenkipay. (required)
   * @param contentType Content type accepted. (required)
   * @param accept Accepted formats. (required)
   * @param X_ZENKI_PLUGIN_ID Unique customer identifier used to establish connection with Zenkipay services. (optional)
   * @param acceptLanguage Indicates the language type code for which the content of the services response is returned according to the language reported.  The definition of the ISO_639 standard is used. See: https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes or https://www.iso.org/iso-639-language-codes.html (optional)
   * @param requestRefund A JSON structure will be sent, where one refund can be sent. (optional)
   * @return Refund
   * @throws ApiException if fails to make API call
   * For more details on the services, consult the documentation Zenkipay official.
   * @see <a href="http://developer.zenki.fi/">Register of refunds for an order Documentation</a>
   */
  public Refund registerRefundOrder(String zenkiOrderId, String contentType, String accept, String X_ZENKI_PLUGIN_ID, String acceptLanguage, RequestRefund requestRefund) throws ApiException {
    ApiResponse<Refund> localVarResponse = registerRefundOrderWithHttpInfo(zenkiOrderId, contentType, accept, X_ZENKI_PLUGIN_ID, acceptLanguage, requestRefund);
    return localVarResponse.getData();
  }

  /**
   * Register of refunds for an order
   * One or more refunds are recorded by the order number.
   * @param zenkiOrderId Unique order identifier generated by Zenkipay. (required)
   * @param contentType Content type accepted. (required)
   * @param accept Accepted formats. (required)
   * @param X_ZENKI_PLUGIN_ID Unique customer identifier used to establish connection with Zenkipay services. (optional)
   * @param acceptLanguage Indicates the language type code for which the content of the services response is returned according to the language reported.  The definition of the ISO_639 standard is used. See: https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes or https://www.iso.org/iso-639-language-codes.html (optional)
   * @param requestRefund A JSON structure will be sent, where one refund can be sent. (optional)
   * @return ApiResponse&lt;Refund&gt;
   * @throws ApiException if fails to make API call
   * For more details on the services, consult the documentation Zenkipay official.
   * @see <a href="http://developer.zenki.fi/">Register of refunds for an order Documentation</a>
   */
  public ApiResponse<Refund> registerRefundOrderWithHttpInfo(String zenkiOrderId, String contentType, String accept, String X_ZENKI_PLUGIN_ID, String acceptLanguage, RequestRefund requestRefund) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = registerRefundOrderRequestBuilder(zenkiOrderId, contentType, accept, X_ZENKI_PLUGIN_ID, acceptLanguage, requestRefund);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("registerRefundOrder", localVarResponse);
        }
        return new ApiResponse<Refund>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<Refund>() {}) // closes the InputStream
          
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

  private HttpRequest.Builder registerRefundOrderRequestBuilder(String zenkiOrderId, String contentType, String accept, String X_ZENKI_PLUGIN_ID, String acceptLanguage, RequestRefund requestRefund) throws ApiException {
    // verify the required parameter 'zenkiOrderId' is set
    if (zenkiOrderId == null) {
      throw new ApiException(400, "Missing the required parameter 'zenkiOrderId' when calling registerRefundOrder");
    }
    // verify the required parameter 'contentType' is set
    if (contentType == null) {
      throw new ApiException(400, "Missing the required parameter 'contentType' when calling registerRefundOrder");
    }
    // verify the required parameter 'accept' is set
    if (accept == null) {
      throw new ApiException(400, "Missing the required parameter 'accept' when calling registerRefundOrder");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/v1/pay/orders/{zenkiOrderId}/refunds"
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
    localVarRequestBuilder.header("Accept", "application/json");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(requestRefund);
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
}
