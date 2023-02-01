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


package fi.zenki.zenkipay.api.model;

import java.util.Objects;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * RequestTokenOAuth2
 */
@JsonPropertyOrder({
  RequestTokenOAuth2.JSON_PROPERTY_CLIENT_ID,
  RequestTokenOAuth2.JSON_PROPERTY_CLIENT_SECRET,
  RequestTokenOAuth2.JSON_PROPERTY_GRANT_TYPE
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-01T00:46:11.523986338Z[Etc/UTC]")
public class RequestTokenOAuth2 {
  public static final String JSON_PROPERTY_CLIENT_ID = "clientId";
  private String clientId;

  public static final String JSON_PROPERTY_CLIENT_SECRET = "clientSecret";
  private String clientSecret;

  public static final String JSON_PROPERTY_GRANT_TYPE = "grantType";
  private String grantType;

  public RequestTokenOAuth2() { 
  }

  public RequestTokenOAuth2 clientId(String clientId) {
    this.clientId = clientId;
    return this;
  }

   /**
   * Client ID Key must be obtained from the Zenkipay portal in the security section.
   * @return clientId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "4188918f7da1547d13e3", required = true, value = "Client ID Key must be obtained from the Zenkipay portal in the security section.")
  @JsonProperty(JSON_PROPERTY_CLIENT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getClientId() {
    return clientId;
  }


  @JsonProperty(JSON_PROPERTY_CLIENT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setClientId(String clientId) {
    this.clientId = clientId;
  }


  public RequestTokenOAuth2 clientSecret(String clientSecret) {
    this.clientSecret = clientSecret;
    return this;
  }

   /**
   * Client Secret Key in Zenkipay must be obtained from the Zenkipay portal in the security section.
   * @return clientSecret
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "4ed3872fccacc77ce842", required = true, value = "Client Secret Key in Zenkipay must be obtained from the Zenkipay portal in the security section.")
  @JsonProperty(JSON_PROPERTY_CLIENT_SECRET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getClientSecret() {
    return clientSecret;
  }


  @JsonProperty(JSON_PROPERTY_CLIENT_SECRET)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setClientSecret(String clientSecret) {
    this.clientSecret = clientSecret;
  }


  public RequestTokenOAuth2 grantType(String grantType) {
    this.grantType = grantType;
    return this;
  }

   /**
   * Permission type, for all operations carried out in the Zenkipay API from the merchant&#39;s server, it is required to send the value &#39;client_credentials&#39; as grant type.
   * @return grantType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "client_credentials", required = true, value = "Permission type, for all operations carried out in the Zenkipay API from the merchant's server, it is required to send the value 'client_credentials' as grant type.")
  @JsonProperty(JSON_PROPERTY_GRANT_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getGrantType() {
    return grantType;
  }


  @JsonProperty(JSON_PROPERTY_GRANT_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setGrantType(String grantType) {
    this.grantType = grantType;
  }


  /**
   * Return true if this RequestTokenOAuth2 object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestTokenOAuth2 requestTokenOAuth2 = (RequestTokenOAuth2) o;
    return Objects.equals(this.clientId, requestTokenOAuth2.clientId) &&
        Objects.equals(this.clientSecret, requestTokenOAuth2.clientSecret) &&
        Objects.equals(this.grantType, requestTokenOAuth2.grantType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientId, clientSecret, grantType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestTokenOAuth2 {\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    clientSecret: ").append(toIndentedString(clientSecret)).append("\n");
    sb.append("    grantType: ").append(toIndentedString(grantType)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

