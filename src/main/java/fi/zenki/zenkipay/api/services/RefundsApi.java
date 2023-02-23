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

import com.fasterxml.jackson.core.type.TypeReference;

import fi.zenki.zenkipay.api.ApiException;
import fi.zenki.zenkipay.api.ApiClient;
import fi.zenki.zenkipay.api.Configuration;
import fi.zenki.zenkipay.api.model.*;
import fi.zenki.zenkipay.api.Pair;

import fi.zenki.zenkipay.api.model.ErrorResponse;
import fi.zenki.zenkipay.api.model.Refund;
import fi.zenki.zenkipay.api.model.RequestRefund;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-23T15:51:51.121336960Z[Etc/UTC]")
public class RefundsApi {
  private ApiClient apiClient;

  public RefundsApi() {
    this(Configuration.getDefaultApiClient());
  }

  public RefundsApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
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
    Object localVarPostBody = null;
    
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
    
    // create path and map variables
    String localVarPath = "/v1/pay/orders/{zenkiOrderId}/refunds/{zenkiRefundId}"
      .replaceAll("\\{" + "zenkiOrderId" + "\\}", apiClient.escapeString(zenkiOrderId.toString()))
      .replaceAll("\\{" + "zenkiRefundId" + "\\}", apiClient.escapeString(zenkiRefundId.toString()));

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    if (X_ZENKI_PLUGIN_ID != null)
      localVarHeaderParams.put("X-ZENKI-PLUGIN-ID", apiClient.parameterToString(X_ZENKI_PLUGIN_ID));
if (acceptLanguage != null)
      localVarHeaderParams.put("Accept-Language", apiClient.parameterToString(acceptLanguage));
if (contentType != null)
      localVarHeaderParams.put("Content-Type", apiClient.parameterToString(contentType));
if (accept != null)
      localVarHeaderParams.put("Accept", apiClient.parameterToString(accept));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "JWTAuth" };

    TypeReference<Refund> localVarReturnType = new TypeReference<Refund>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "GET",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarQueryStringJoiner.toString(),
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType
    );
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
    Object localVarPostBody = requestRefund;
    
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
    
    // create path and map variables
    String localVarPath = "/v1/pay/orders/{zenkiOrderId}/refunds"
      .replaceAll("\\{" + "zenkiOrderId" + "\\}", apiClient.escapeString(zenkiOrderId.toString()));

    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();

    if (X_ZENKI_PLUGIN_ID != null)
      localVarHeaderParams.put("X-ZENKI-PLUGIN-ID", apiClient.parameterToString(X_ZENKI_PLUGIN_ID));
if (acceptLanguage != null)
      localVarHeaderParams.put("Accept-Language", apiClient.parameterToString(acceptLanguage));
if (contentType != null)
      localVarHeaderParams.put("Content-Type", apiClient.parameterToString(contentType));
if (accept != null)
      localVarHeaderParams.put("Accept", apiClient.parameterToString(accept));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "JWTAuth" };

    TypeReference<Refund> localVarReturnType = new TypeReference<Refund>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "POST",
        localVarQueryParams,
        localVarCollectionQueryParams,
        localVarQueryStringJoiner.toString(),
        localVarPostBody,
        localVarHeaderParams,
        localVarCookieParams,
        localVarFormParams,
        localVarAccept,
        localVarContentType,
        localVarAuthNames,
        localVarReturnType
    );
  }
}
