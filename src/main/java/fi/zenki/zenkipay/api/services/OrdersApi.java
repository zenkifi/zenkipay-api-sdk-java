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

import fi.zenki.zenkipay.api.model.CreateOrder;
import fi.zenki.zenkipay.api.model.ErrorResponse;
import fi.zenki.zenkipay.api.model.Order;
import fi.zenki.zenkipay.api.model.UpdateOrder;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-23T15:55:44.125730643Z[Etc/UTC]")
public class OrdersApi {
  private ApiClient apiClient;

  public OrdersApi() {
    this(Configuration.getDefaultApiClient());
  }

  public OrdersApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
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
    Object localVarPostBody = createOrder;
    
    // verify the required parameter 'contentType' is set
    if (contentType == null) {
      throw new ApiException(400, "Missing the required parameter 'contentType' when calling createOrder");
    }
    
    // verify the required parameter 'accept' is set
    if (accept == null) {
      throw new ApiException(400, "Missing the required parameter 'accept' when calling createOrder");
    }
    
    // create path and map variables
    String localVarPath = "/v1/pay/orders";

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
      "application/hal+json", "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "JWTAuth" };

    TypeReference<Order> localVarReturnType = new TypeReference<Order>() {};
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
    Object localVarPostBody = null;
    
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
    
    // create path and map variables
    String localVarPath = "/v1/pay/orders/{zenkiOrderId}"
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
      "application/hal+json", "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "JWTAuth" };

    TypeReference<Order> localVarReturnType = new TypeReference<Order>() {};
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
    Object localVarPostBody = updateOrder;
    
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
    
    // create path and map variables
    String localVarPath = "/v1/pay/orders/{zenkiOrderId}"
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
      "application/hal+json", "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] { "JWTAuth" };

    TypeReference<Order> localVarReturnType = new TypeReference<Order>() {};
    return apiClient.invokeAPI(
        localVarPath,
        "PATCH",
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
