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
 * AuthenticationErrorResponse
 */
@JsonPropertyOrder({
  AuthenticationErrorResponse.JSON_PROPERTY_ERROR,
  AuthenticationErrorResponse.JSON_PROPERTY_ERROR_DESCRIPTION
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-31T22:56:57.338324531Z[Etc/UTC]")
public class AuthenticationErrorResponse {
  public static final String JSON_PROPERTY_ERROR = "error";
  private String error;

  public static final String JSON_PROPERTY_ERROR_DESCRIPTION = "errorDescription";
  private String errorDescription;

  public AuthenticationErrorResponse() { 
  }

  public AuthenticationErrorResponse error(String error) {
    this.error = error;
    return this;
  }

   /**
   * Error occurred name.
   * @return error
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "unauthorized_client", required = true, value = "Error occurred name.")
  @JsonProperty(JSON_PROPERTY_ERROR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getError() {
    return error;
  }


  @JsonProperty(JSON_PROPERTY_ERROR)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setError(String error) {
    this.error = error;
  }


  public AuthenticationErrorResponse errorDescription(String errorDescription) {
    this.errorDescription = errorDescription;
    return this;
  }

   /**
   * Description of the error occurred.
   * @return errorDescription
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Invalid identity", required = true, value = "Description of the error occurred.")
  @JsonProperty(JSON_PROPERTY_ERROR_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getErrorDescription() {
    return errorDescription;
  }


  @JsonProperty(JSON_PROPERTY_ERROR_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setErrorDescription(String errorDescription) {
    this.errorDescription = errorDescription;
  }


  /**
   * Return true if this AuthenticationErrorResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthenticationErrorResponse authenticationErrorResponse = (AuthenticationErrorResponse) o;
    return Objects.equals(this.error, authenticationErrorResponse.error) &&
        Objects.equals(this.errorDescription, authenticationErrorResponse.errorDescription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(error, errorDescription);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthenticationErrorResponse {\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    errorDescription: ").append(toIndentedString(errorDescription)).append("\n");
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

