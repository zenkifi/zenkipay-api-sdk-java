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
import fi.zenki.zenkipay.api.model.Order;

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

@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-02T17:57:08.967812480Z[Etc/UTC]")
public class EscrowApi {
  private final HttpClient memberVarHttpClient;
  private final ObjectMapper memberVarObjectMapper;
  private final String memberVarBaseUri;
  private final Consumer<HttpRequest.Builder> memberVarInterceptor;
  private final Duration memberVarReadTimeout;
  private final Consumer<HttpResponse<InputStream>> memberVarResponseInterceptor;
  private final Consumer<HttpResponse<String>> memberVarAsyncResponseInterceptor;

  public EscrowApi() {
    this(new ApiClient());
  }

  public EscrowApi(ApiClient apiClient) {
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
   * Escrow update
   * Service in charge of updating the escrow for orders without tracking.
   * @param zenkiOrderId Unique order identifier generated by Zenkipay. (required)
   * @param contentType Content type accepted. (required)
   * @param accept Accepted formats. (required)
   * @param X_ZENKI_PLUGIN_ID Unique customer identifier used to establish connection with Zenkipay services. (optional)
   * @param acceptLanguage Indicates the language type code for which the content of the services response is returned according to the language reported.  The definition of the ISO_639 standard is used. See: https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes or https://www.iso.org/iso-639-language-codes.html (optional)
   * @return Order
   * @throws ApiException if fails to make API call
   * For more details on the services, consult the documentation Zenkipay official.
   * @see <a href="https://developer.zenki.fi/">Escrow update Documentation</a>
   */
  public Order updateEscrow(String zenkiOrderId, String contentType, String accept, String X_ZENKI_PLUGIN_ID, String acceptLanguage) throws ApiException {
    ApiResponse<Order> localVarResponse = updateEscrowWithHttpInfo(zenkiOrderId, contentType, accept, X_ZENKI_PLUGIN_ID, acceptLanguage);
    return localVarResponse.getData();
  }

  /**
   * Escrow update
   * Service in charge of updating the escrow for orders without tracking.
   * @param zenkiOrderId Unique order identifier generated by Zenkipay. (required)
   * @param contentType Content type accepted. (required)
   * @param accept Accepted formats. (required)
   * @param X_ZENKI_PLUGIN_ID Unique customer identifier used to establish connection with Zenkipay services. (optional)
   * @param acceptLanguage Indicates the language type code for which the content of the services response is returned according to the language reported.  The definition of the ISO_639 standard is used. See: https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes or https://www.iso.org/iso-639-language-codes.html (optional)
   * @return ApiResponse&lt;Order&gt;
   * @throws ApiException if fails to make API call
   * For more details on the services, consult the documentation Zenkipay official.
   * @see <a href="https://developer.zenki.fi/">Escrow update Documentation</a>
   */
  public ApiResponse<Order> updateEscrowWithHttpInfo(String zenkiOrderId, String contentType, String accept, String X_ZENKI_PLUGIN_ID, String acceptLanguage) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = updateEscrowRequestBuilder(zenkiOrderId, contentType, accept, X_ZENKI_PLUGIN_ID, acceptLanguage);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("updateEscrow", localVarResponse);
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

  private HttpRequest.Builder updateEscrowRequestBuilder(String zenkiOrderId, String contentType, String accept, String X_ZENKI_PLUGIN_ID, String acceptLanguage) throws ApiException {
    // verify the required parameter 'zenkiOrderId' is set
    if (zenkiOrderId == null) {
      throw new ApiException(400, "Missing the required parameter 'zenkiOrderId' when calling updateEscrow");
    }
    // verify the required parameter 'contentType' is set
    if (contentType == null) {
      throw new ApiException(400, "Missing the required parameter 'contentType' when calling updateEscrow");
    }
    // verify the required parameter 'accept' is set
    if (accept == null) {
      throw new ApiException(400, "Missing the required parameter 'accept' when calling updateEscrow");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/v1/pay/escrow/{zenkiOrderId}/fulfillments"
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

    localVarRequestBuilder.method("PATCH", HttpRequest.BodyPublishers.noBody());
    if (memberVarReadTimeout != null) {
      localVarRequestBuilder.timeout(memberVarReadTimeout);
    }
    if (memberVarInterceptor != null) {
      memberVarInterceptor.accept(localVarRequestBuilder);
    }
    return localVarRequestBuilder;
  }
}
