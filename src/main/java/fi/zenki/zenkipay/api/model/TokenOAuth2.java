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
 * TokenOAuth2
 */
@JsonPropertyOrder({
  TokenOAuth2.JSON_PROPERTY_ACCESS_TOKEN,
  TokenOAuth2.JSON_PROPERTY_TOKEN_TYPE,
  TokenOAuth2.JSON_PROPERTY_EXPIRES_IN
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-31T20:09:42.478974698Z[Etc/UTC]")
public class TokenOAuth2 {
  public static final String JSON_PROPERTY_ACCESS_TOKEN = "accessToken";
  private String accessToken;

  public static final String JSON_PROPERTY_TOKEN_TYPE = "tokenType";
  private String tokenType;

  public static final String JSON_PROPERTY_EXPIRES_IN = "expiresIn";
  private Integer expiresIn;

  public TokenOAuth2() { 
  }

  public TokenOAuth2 accessToken(String accessToken) {
    this.accessToken = accessToken;
    return this;
  }

   /**
   * The access token that will be required to send in all requests to the Zenki API.
   * @return accessToken
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "eyJhbGciOiJSUzI1NiIsInR5cCIgOiAiSldUIiwia2lkIiA6ICItNUlsX2I0cUktdWFvaEI3d244UHY3WEM2UEktU3BNbmZCRnlJZUx6QTJNIn0.eyJleHAiOjE1OTQyMTY0OTQsImlhdCI6MTU5NDIxNjE5NCwianRpIjoiZjVmNTBjMzEtNWIwNC00OWQ2LTljYmMtM2YwMWU5OTg5ZWQxIiwiaXNzIjoiaHR0cDovL2xvY2FsaG9zdDo4MDgwL2F1dGgvcmVhbG1zL2FwcHNkZXZlbG9wZXJibG9nIiwic3ViIjoiNTlmODFhMzYtYTIyMC00ZmE4LTlhZWEtMzRlN2JhNjY4OTAxIiwidHlwIjoiQmVhcmVyIiwiYXpwIjoicGhvdG8tYXBwLWNsaWVudC1jcmVkZW50aWFscyIsInNlc3Npb25fc3RhdGUiOiI3NTAyY2YzMS1iMjEwLTQ3NTQtYjkxOS0wN2UxZDg0OTNmYTMiLCJhY3IiOiIxIiwic2NvcGUiOiJlbWFpbCIsImNsaWVudElkIjoicGhvdG8tYXBwLWNsaWVudC1jcmVkZW50aWFscyIsImNsaWVudEhvc3QiOiIxMjcuMC4wLjEiLCJjbGllbnRBZGRyZXNzIjoiMTI3LjAuMC4xIn0.fQVsLpQJchcofA18FOSr0gtjeo01s9bMFF1ewsI-trrzzNL28QABmm_rsb4-p0iw5fGG3-bEInFe-Owxm9sZbQ_O7je_BVMDrlJEs-bAY5cLIQWVqy3P5xCsyFt-F6y89LAOCUCGI127W18zoUagLAoi5bGCIgxKled-MYRK8MQ-PcZzYCp5FkPFMv6Wd8I5m6TZJ6xK0eG79LVDPqj-s9YGfjY_n64uiT9VneYHG261SisgZ978ZMF-gkjit9CsSTQEW2cBlyeriy133s0E0ycvybLwnHYsGzRs5k8xhgqa3ZYovtZeK2SWARoNSXWQjUCBcndT9teWcZSgQxPIzw", required = true, value = "The access token that will be required to send in all requests to the Zenki API.")
  @JsonProperty(JSON_PROPERTY_ACCESS_TOKEN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getAccessToken() {
    return accessToken;
  }


  @JsonProperty(JSON_PROPERTY_ACCESS_TOKEN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAccessToken(String accessToken) {
    this.accessToken = accessToken;
  }


  public TokenOAuth2 tokenType(String tokenType) {
    this.tokenType = tokenType;
    return this;
  }

   /**
   * The access token that will be required to send as a header in all requests to the Zenki API.
   * @return tokenType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Bearer", required = true, value = "The access token that will be required to send as a header in all requests to the Zenki API.")
  @JsonProperty(JSON_PROPERTY_TOKEN_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getTokenType() {
    return tokenType;
  }


  @JsonProperty(JSON_PROPERTY_TOKEN_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTokenType(String tokenType) {
    this.tokenType = tokenType;
  }


  public TokenOAuth2 expiresIn(Integer expiresIn) {
    this.expiresIn = expiresIn;
    return this;
  }

   /**
   * Access token expiration time in seconds.
   * @return expiresIn
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1800", required = true, value = "Access token expiration time in seconds.")
  @JsonProperty(JSON_PROPERTY_EXPIRES_IN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Integer getExpiresIn() {
    return expiresIn;
  }


  @JsonProperty(JSON_PROPERTY_EXPIRES_IN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setExpiresIn(Integer expiresIn) {
    this.expiresIn = expiresIn;
  }


  /**
   * Return true if this TokenOAuth2 object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TokenOAuth2 tokenOAuth2 = (TokenOAuth2) o;
    return Objects.equals(this.accessToken, tokenOAuth2.accessToken) &&
        Objects.equals(this.tokenType, tokenOAuth2.tokenType) &&
        Objects.equals(this.expiresIn, tokenOAuth2.expiresIn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessToken, tokenType, expiresIn);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TokenOAuth2 {\n");
    sb.append("    accessToken: ").append(toIndentedString(accessToken)).append("\n");
    sb.append("    tokenType: ").append(toIndentedString(tokenType)).append("\n");
    sb.append("    expiresIn: ").append(toIndentedString(expiresIn)).append("\n");
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

