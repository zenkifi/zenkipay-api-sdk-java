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

import fi.zenki.zenkipay.api.model.AuthenticationErrorResponse;
import fi.zenki.zenkipay.api.model.RequestTokenOAuth2;
import fi.zenki.zenkipay.api.model.TokenOAuth2;

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
public class AuthenticationAndAuthorizationApi {
  private final HttpClient memberVarHttpClient;
  private final ObjectMapper memberVarObjectMapper;
  private final String memberVarBaseUri;
  private final Consumer<HttpRequest.Builder> memberVarInterceptor;
  private final Duration memberVarReadTimeout;
  private final Consumer<HttpResponse<InputStream>> memberVarResponseInterceptor;
  private final Consumer<HttpResponse<String>> memberVarAsyncResponseInterceptor;

  public AuthenticationAndAuthorizationApi() {
    this(new ApiClient());
  }

  public AuthenticationAndAuthorizationApi(ApiClient apiClient) {
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
   * Create an authentication token in Zenki
   * This request must be sent each time it is required to generate a token to consume Zenki services.
   * @param contentType Tipo de contenido aceptado. (required)
   * @param accept Formatos aceptados. (required)
   * @param requestTokenOAuth2 Parameters for OAuth 2 token creation. (optional)
   * @return TokenOAuth2
   * @throws ApiException if fails to make API call
   * For more details on the services, you can consult the documentation Zenkipay official.
   * @see <a href="https://developer.zenki.fi/">Create an authentication token in Zenki Documentation</a>
   */
  public TokenOAuth2 createToken(String contentType, String accept, RequestTokenOAuth2 requestTokenOAuth2) throws ApiException {
    ApiResponse<TokenOAuth2> localVarResponse = createTokenWithHttpInfo(contentType, accept, requestTokenOAuth2);
    return localVarResponse.getData();
  }

  /**
   * Create an authentication token in Zenki
   * This request must be sent each time it is required to generate a token to consume Zenki services.
   * @param contentType Tipo de contenido aceptado. (required)
   * @param accept Formatos aceptados. (required)
   * @param requestTokenOAuth2 Parameters for OAuth 2 token creation. (optional)
   * @return ApiResponse&lt;TokenOAuth2&gt;
   * @throws ApiException if fails to make API call
   * For more details on the services, you can consult the documentation Zenkipay official.
   * @see <a href="https://developer.zenki.fi/">Create an authentication token in Zenki Documentation</a>
   */
  public ApiResponse<TokenOAuth2> createTokenWithHttpInfo(String contentType, String accept, RequestTokenOAuth2 requestTokenOAuth2) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = createTokenRequestBuilder(contentType, accept, requestTokenOAuth2);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("createToken", localVarResponse);
        }
        return new ApiResponse<TokenOAuth2>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<TokenOAuth2>() {}) // closes the InputStream
          
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

  private HttpRequest.Builder createTokenRequestBuilder(String contentType, String accept, RequestTokenOAuth2 requestTokenOAuth2) throws ApiException {
    // verify the required parameter 'contentType' is set
    if (contentType == null) {
      throw new ApiException(400, "Missing the required parameter 'contentType' when calling createToken");
    }
    // verify the required parameter 'accept' is set
    if (accept == null) {
      throw new ApiException(400, "Missing the required parameter 'accept' when calling createToken");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/v1/oauth/tokens";

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    if (contentType != null) {
      localVarRequestBuilder.header("Content-Type", contentType.toString());
    }
    if (accept != null) {
      localVarRequestBuilder.header("Accept", accept.toString());
    }
    localVarRequestBuilder.header("Content-Type", "application/json");
    localVarRequestBuilder.header("Accept", "application/json");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(requestTokenOAuth2);
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
