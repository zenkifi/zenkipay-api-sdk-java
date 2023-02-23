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
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * RequestTokenOAuth2
 */
@JsonPropertyOrder({
  RequestTokenOAuth2.JSON_PROPERTY_CLIENT_ID,
  RequestTokenOAuth2.JSON_PROPERTY_CLIENT_SECRET,
  RequestTokenOAuth2.JSON_PROPERTY_GRANT_TYPE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-23T23:11:11.907534644Z[Etc/UTC]")
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

  /**
   * Convert the instance into URL query string.
   *
   * @return URL query string
   */
  public String toUrlQueryString() {
    return toUrlQueryString(null);
  }

  /**
   * Convert the instance into URL query string.
   *
   * @param prefix prefix of the query string
   * @return URL query string
   */
  public String toUrlQueryString(String prefix) {
    String suffix = "";
    String containerSuffix = "";
    String containerPrefix = "";
    if (prefix == null) {
      // style=form, explode=true, e.g. /pet?name=cat&type=manx
      prefix = "";
    } else {
      // deepObject style e.g. /pet?id[name]=cat&id[type]=manx
      prefix = prefix + "[";
      suffix = "]";
      containerSuffix = "]";
      containerPrefix = "[";
    }

    StringJoiner joiner = new StringJoiner("&");

    // add `clientId` to the URL query string
    if (getClientId() != null) {
      try {
        joiner.add(String.format("%sclientId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getClientId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `clientSecret` to the URL query string
    if (getClientSecret() != null) {
      try {
        joiner.add(String.format("%sclientSecret%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getClientSecret()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `grantType` to the URL query string
    if (getGrantType() != null) {
      try {
        joiner.add(String.format("%sgrantType%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getGrantType()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

