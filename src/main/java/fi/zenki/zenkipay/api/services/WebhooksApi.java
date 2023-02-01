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

import fi.zenki.zenkipay.api.model.Webhook;

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
public class WebhooksApi {
  private final HttpClient memberVarHttpClient;
  private final ObjectMapper memberVarObjectMapper;
  private final String memberVarBaseUri;
  private final Consumer<HttpRequest.Builder> memberVarInterceptor;
  private final Duration memberVarReadTimeout;
  private final Consumer<HttpResponse<InputStream>> memberVarResponseInterceptor;
  private final Consumer<HttpResponse<String>> memberVarAsyncResponseInterceptor;

  public WebhooksApi() {
    this(new ApiClient());
  }

  public WebhooksApi(ApiClient apiClient) {
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
   * Event notifications for merchant
   * Service that allows different events to be sent to the merchant.
   * @param svixId Unique message identifier for the webhook message. This identifier is unique across all messages, but will be the same when the same webhook is forwarded (for example, due to a previous error). (required)
   * @param svixTimestamp Date and time when the webhook is sent to the merchant, in milliseconds and UTC format.  The Unix epoch (or Unix time or POSIX time or Unix timestamp) is the number of seconds elapsed since January 1, 1970 (midnight UTC/GMT), not counting leap seconds (in ISO 8601: 1970-01-01T00: 00:00Z) (required)
   * @param svixSignature Base64 encoded signature (delimited by spaces) on the sent content, the signature is generated from the following structure: signed_content &#x3D; \&quot;${svix_id}.${svix_timestamp}.${body}\&quot;. (required)
   * @param contentType Content Type accepted. (required)
   * @param webhook A JSON structure will be sent that will have the information about the event to notify the merchant. (optional)
   * @throws ApiException if fails to make API call
   * For more details on the services, consult the documentation Zenkipay official.
NOTE: You must change the entire URL displayed at the top of the service to the final URL where you will receive the webhooks that Zenkipay sends you.
   * @see <a href="https://developer.zenki.fi/">Event notifications for merchant Documentation</a>
   */
  public void sendEvent(String svixId, String svixTimestamp, String svixSignature, String contentType, Webhook webhook) throws ApiException {
    sendEventWithHttpInfo(svixId, svixTimestamp, svixSignature, contentType, webhook);
  }

  /**
   * Event notifications for merchant
   * Service that allows different events to be sent to the merchant.
   * @param svixId Unique message identifier for the webhook message. This identifier is unique across all messages, but will be the same when the same webhook is forwarded (for example, due to a previous error). (required)
   * @param svixTimestamp Date and time when the webhook is sent to the merchant, in milliseconds and UTC format.  The Unix epoch (or Unix time or POSIX time or Unix timestamp) is the number of seconds elapsed since January 1, 1970 (midnight UTC/GMT), not counting leap seconds (in ISO 8601: 1970-01-01T00: 00:00Z) (required)
   * @param svixSignature Base64 encoded signature (delimited by spaces) on the sent content, the signature is generated from the following structure: signed_content &#x3D; \&quot;${svix_id}.${svix_timestamp}.${body}\&quot;. (required)
   * @param contentType Content Type accepted. (required)
   * @param webhook A JSON structure will be sent that will have the information about the event to notify the merchant. (optional)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   * For more details on the services, consult the documentation Zenkipay official.
NOTE: You must change the entire URL displayed at the top of the service to the final URL where you will receive the webhooks that Zenkipay sends you.
   * @see <a href="https://developer.zenki.fi/">Event notifications for merchant Documentation</a>
   */
  public ApiResponse<Void> sendEventWithHttpInfo(String svixId, String svixTimestamp, String svixSignature, String contentType, Webhook webhook) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = sendEventRequestBuilder(svixId, svixTimestamp, svixSignature, contentType, webhook);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("sendEvent", localVarResponse);
        }
        return new ApiResponse<Void>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          
          null
        );
      } finally {
        // Drain the InputStream
        while (localVarResponse.body().read() != -1) {
            // Ignore
        }
        localVarResponse.body().close();
      }
    } catch (IOException e) {
      throw new ApiException(e);
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }

  private HttpRequest.Builder sendEventRequestBuilder(String svixId, String svixTimestamp, String svixSignature, String contentType, Webhook webhook) throws ApiException {
    // verify the required parameter 'svixId' is set
    if (svixId == null) {
      throw new ApiException(400, "Missing the required parameter 'svixId' when calling sendEvent");
    }
    // verify the required parameter 'svixTimestamp' is set
    if (svixTimestamp == null) {
      throw new ApiException(400, "Missing the required parameter 'svixTimestamp' when calling sendEvent");
    }
    // verify the required parameter 'svixSignature' is set
    if (svixSignature == null) {
      throw new ApiException(400, "Missing the required parameter 'svixSignature' when calling sendEvent");
    }
    // verify the required parameter 'contentType' is set
    if (contentType == null) {
      throw new ApiException(400, "Missing the required parameter 'contentType' when calling sendEvent");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/URL_MERCHANT";

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    if (svixId != null) {
      localVarRequestBuilder.header("Svix-Id", svixId.toString());
    }
    if (svixTimestamp != null) {
      localVarRequestBuilder.header("Svix-Timestamp", svixTimestamp.toString());
    }
    if (svixSignature != null) {
      localVarRequestBuilder.header("Svix-Signature", svixSignature.toString());
    }
    if (contentType != null) {
      localVarRequestBuilder.header("Content-Type", contentType.toString());
    }
    localVarRequestBuilder.header("Content-Type", "application/json");
    localVarRequestBuilder.header("Accept", "application/json");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(webhook);
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
