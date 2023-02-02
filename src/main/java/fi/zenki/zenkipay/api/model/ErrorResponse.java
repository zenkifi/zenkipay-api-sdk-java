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
import fi.zenki.zenkipay.api.model.ErrorResponseValidationErrorsInner;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * ErrorResponse
 */
@JsonPropertyOrder({
  ErrorResponse.JSON_PROPERTY_REQUEST_ID,
  ErrorResponse.JSON_PROPERTY_TITLE,
  ErrorResponse.JSON_PROPERTY_ERROR_CODE,
  ErrorResponse.JSON_PROPERTY_CATEGORY,
  ErrorResponse.JSON_PROPERTY_VALIDATION_ERRORS,
  ErrorResponse.JSON_PROPERTY_HUMAN_MESSAGE,
  ErrorResponse.JSON_PROPERTY_TIMESTAMP
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-02T17:36:38.616098402Z[Etc/UTC]")
public class ErrorResponse {
  public static final String JSON_PROPERTY_REQUEST_ID = "requestId";
  private String requestId;

  public static final String JSON_PROPERTY_TITLE = "title";
  private String title;

  public static final String JSON_PROPERTY_ERROR_CODE = "errorCode";
  private Long errorCode;

  /**
   * Error Category.   Possible values: * FATAL  - Any error that forces the service or application to close to prevent data loss (or further data loss). It is reserved for only the most egregious errors and situations where data corruption or loss is guaranteed to have occurred. * SEVERE - Any error that is fatal for the service, but not for the entire application (The service has stopped responding or an operation cannot be executed). These errors will force the intervention of the user (administrator or direct user). * ERROR  - Any error that is fatal to the operation, but not to the service or application (cannot open a required file, missing data, etc.). These errors will force the intervention of the user (administrator or direct user). * WARN   - Anything that could potentially cause application weirdness, but for which I am self-recovering (Such as switching from a primary to a backup server, retrying an operation, losing secondary data, etc.). * INFO   - Informational messages highlighting the app&#39;s progress and possibly some minor bug that impacts the experience very little.
   */
  public enum CategoryEnum {
    FATAL("FATAL"),
    
    SEVERE("SEVERE"),
    
    ERROR("ERROR"),
    
    WARN("WARN"),
    
    INFO("INFO");

    private String value;

    CategoryEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static CategoryEnum fromValue(String value) {
      for (CategoryEnum b : CategoryEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_CATEGORY = "category";
  private CategoryEnum category;

  public static final String JSON_PROPERTY_VALIDATION_ERRORS = "validationErrors";
  private JsonNullable<List<ErrorResponseValidationErrorsInner>> validationErrors = JsonNullable.<List<ErrorResponseValidationErrorsInner>>undefined();

  public static final String JSON_PROPERTY_HUMAN_MESSAGE = "humanMessage";
  private String humanMessage;

  public static final String JSON_PROPERTY_TIMESTAMP = "timestamp";
  private Long timestamp;

  public ErrorResponse() { 
  }

  public ErrorResponse requestId(String requestId) {
    this.requestId = requestId;
    return this;
  }

   /**
   * Unique identifier of the error generated by Zenkipay for each request sent to the API.
   * @return requestId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "af20360eccddd8d8", required = true, value = "Unique identifier of the error generated by Zenkipay for each request sent to the API.")
  @JsonProperty(JSON_PROPERTY_REQUEST_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getRequestId() {
    return requestId;
  }


  @JsonProperty(JSON_PROPERTY_REQUEST_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }


  public ErrorResponse title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Short description of the error.
   * @return title
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Sorry, but your request cannot be processed, please verify your field data.", required = true, value = "Short description of the error.")
  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getTitle() {
    return title;
  }


  @JsonProperty(JSON_PROPERTY_TITLE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTitle(String title) {
    this.title = title;
  }


  public ErrorResponse errorCode(Long errorCode) {
    this.errorCode = errorCode;
    return this;
  }

   /**
   * Error code that helps to identify the reason for the problem when processing the request. This code will be based on the HTTP codes currently supported by the specification: https://www.rfc-editor.org/rfc/rfc9110#section-15
   * minimum: 0
   * maximum: 999
   * @return errorCode
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "400", required = true, value = "Error code that helps to identify the reason for the problem when processing the request. This code will be based on the HTTP codes currently supported by the specification: https://www.rfc-editor.org/rfc/rfc9110#section-15")
  @JsonProperty(JSON_PROPERTY_ERROR_CODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getErrorCode() {
    return errorCode;
  }


  @JsonProperty(JSON_PROPERTY_ERROR_CODE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setErrorCode(Long errorCode) {
    this.errorCode = errorCode;
  }


  public ErrorResponse category(CategoryEnum category) {
    this.category = category;
    return this;
  }

   /**
   * Error Category.   Possible values: * FATAL  - Any error that forces the service or application to close to prevent data loss (or further data loss). It is reserved for only the most egregious errors and situations where data corruption or loss is guaranteed to have occurred. * SEVERE - Any error that is fatal for the service, but not for the entire application (The service has stopped responding or an operation cannot be executed). These errors will force the intervention of the user (administrator or direct user). * ERROR  - Any error that is fatal to the operation, but not to the service or application (cannot open a required file, missing data, etc.). These errors will force the intervention of the user (administrator or direct user). * WARN   - Anything that could potentially cause application weirdness, but for which I am self-recovering (Such as switching from a primary to a backup server, retrying an operation, losing secondary data, etc.). * INFO   - Informational messages highlighting the app&#39;s progress and possibly some minor bug that impacts the experience very little.
   * @return category
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "WARN", required = true, value = "Error Category.   Possible values: * FATAL  - Any error that forces the service or application to close to prevent data loss (or further data loss). It is reserved for only the most egregious errors and situations where data corruption or loss is guaranteed to have occurred. * SEVERE - Any error that is fatal for the service, but not for the entire application (The service has stopped responding or an operation cannot be executed). These errors will force the intervention of the user (administrator or direct user). * ERROR  - Any error that is fatal to the operation, but not to the service or application (cannot open a required file, missing data, etc.). These errors will force the intervention of the user (administrator or direct user). * WARN   - Anything that could potentially cause application weirdness, but for which I am self-recovering (Such as switching from a primary to a backup server, retrying an operation, losing secondary data, etc.). * INFO   - Informational messages highlighting the app's progress and possibly some minor bug that impacts the experience very little.")
  @JsonProperty(JSON_PROPERTY_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public CategoryEnum getCategory() {
    return category;
  }


  @JsonProperty(JSON_PROPERTY_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCategory(CategoryEnum category) {
    this.category = category;
  }


  public ErrorResponse validationErrors(List<ErrorResponseValidationErrorsInner> validationErrors) {
    this.validationErrors = JsonNullable.<List<ErrorResponseValidationErrorsInner>>of(validationErrors);
    return this;
  }

  public ErrorResponse addValidationErrorsItem(ErrorResponseValidationErrorsInner validationErrorsItem) {
    if (this.validationErrors == null || !this.validationErrors.isPresent()) {
      this.validationErrors = JsonNullable.<List<ErrorResponseValidationErrorsInner>>of(new ArrayList<>());
    }
    try {
      this.validationErrors.get().add(validationErrorsItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Set of validations that did not pass when evaluating the request information.
   * @return validationErrors
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Set of validations that did not pass when evaluating the request information.")
  @JsonIgnore

  public List<ErrorResponseValidationErrorsInner> getValidationErrors() {
        return validationErrors.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_VALIDATION_ERRORS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<List<ErrorResponseValidationErrorsInner>> getValidationErrors_JsonNullable() {
    return validationErrors;
  }
  
  @JsonProperty(JSON_PROPERTY_VALIDATION_ERRORS)
  public void setValidationErrors_JsonNullable(JsonNullable<List<ErrorResponseValidationErrorsInner>> validationErrors) {
    this.validationErrors = validationErrors;
  }

  public void setValidationErrors(List<ErrorResponseValidationErrorsInner> validationErrors) {
    this.validationErrors = JsonNullable.<List<ErrorResponseValidationErrorsInner>>of(validationErrors);
  }


  public ErrorResponse humanMessage(String humanMessage) {
    this.humanMessage = humanMessage;
    return this;
  }

   /**
   * Recommended error message to show buyers, this message is supported for English and Spanish languages.
   * @return humanMessage
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Tracking number is required.", required = true, value = "Recommended error message to show buyers, this message is supported for English and Spanish languages.")
  @JsonProperty(JSON_PROPERTY_HUMAN_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getHumanMessage() {
    return humanMessage;
  }


  @JsonProperty(JSON_PROPERTY_HUMAN_MESSAGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setHumanMessage(String humanMessage) {
    this.humanMessage = humanMessage;
  }


  public ErrorResponse timestamp(Long timestamp) {
    this.timestamp = timestamp;
    return this;
  }

   /**
   * Date and time in milliseconds and UTC format to identify the different requests in time, the different ones that have had errors.  The Unix epoch (or Unix time or POSIX time or Unix timestamp) is the number of seconds elapsed since January 1, 1970 (midnight UTC/GMT), not counting leap seconds (in ISO 8601: 1970-01-01T00: 00:00Z)
   * minimum: 0
   * @return timestamp
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1669137199376", required = true, value = "Date and time in milliseconds and UTC format to identify the different requests in time, the different ones that have had errors.  The Unix epoch (or Unix time or POSIX time or Unix timestamp) is the number of seconds elapsed since January 1, 1970 (midnight UTC/GMT), not counting leap seconds (in ISO 8601: 1970-01-01T00: 00:00Z)")
  @JsonProperty(JSON_PROPERTY_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getTimestamp() {
    return timestamp;
  }


  @JsonProperty(JSON_PROPERTY_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTimestamp(Long timestamp) {
    this.timestamp = timestamp;
  }


  /**
   * Return true if this ErrorResponse object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorResponse errorResponse = (ErrorResponse) o;
    return Objects.equals(this.requestId, errorResponse.requestId) &&
        Objects.equals(this.title, errorResponse.title) &&
        Objects.equals(this.errorCode, errorResponse.errorCode) &&
        Objects.equals(this.category, errorResponse.category) &&
        equalsNullable(this.validationErrors, errorResponse.validationErrors) &&
        Objects.equals(this.humanMessage, errorResponse.humanMessage) &&
        Objects.equals(this.timestamp, errorResponse.timestamp);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestId, title, errorCode, category, hashCodeNullable(validationErrors), humanMessage, timestamp);
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorResponse {\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    validationErrors: ").append(toIndentedString(validationErrors)).append("\n");
    sb.append("    humanMessage: ").append(toIndentedString(humanMessage)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
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

