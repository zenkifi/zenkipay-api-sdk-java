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
 * Process of a dispute detail.
 */
@ApiModel(description = "Process of a dispute detail.")
@JsonPropertyOrder({
  OrderDispute.JSON_PROPERTY_STATUS,
  OrderDispute.JSON_PROPERTY_CREATED_AT,
  OrderDispute.JSON_PROPERTY_RESOLUTION_REQUEST_TYPE,
  OrderDispute.JSON_PROPERTY_RESOLUTION_REQUEST_AT
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-22T15:46:01.941734871Z[Etc/UTC]")
public class OrderDispute {
  /**
   * Dispute current status.  Possible values: * OPEN     - The dispute process has started. * REFUND   - The dispute process has been closed and a partial or full refund of the full amount of the order has been made. * RESOLVED - The dispute process has been closed without making any refund movement to the buyer.
   */
  public enum StatusEnum {
    OPEN("OPEN"),
    
    REFUND("REFUND"),
    
    RESOLVED("RESOLVED");

    private String value;

    StatusEnum(String value) {
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
    public static StatusEnum fromValue(String value) {
      for (StatusEnum b : StatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_STATUS = "status";
  private StatusEnum status;

  public static final String JSON_PROPERTY_CREATED_AT = "createdAt";
  private Long createdAt;

  /**
   * Support type requested from Zenki staff.  Possible values: * REQUEST_REFUND      - Request for support from Zenki staff to make a refund. * REQUEST_CONCILIATED - Request to Zenki staff to reconcile dispute between buyer and merchant.
   */
  public enum ResolutionRequestTypeEnum {
    REFUND("REQUEST_REFUND"),
    
    CONCILIATED("REQUEST_CONCILIATED");

    private String value;

    ResolutionRequestTypeEnum(String value) {
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
    public static ResolutionRequestTypeEnum fromValue(String value) {
      for (ResolutionRequestTypeEnum b : ResolutionRequestTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_RESOLUTION_REQUEST_TYPE = "resolutionRequestType";
  private ResolutionRequestTypeEnum resolutionRequestType;

  public static final String JSON_PROPERTY_RESOLUTION_REQUEST_AT = "resolutionRequestAt";
  private Long resolutionRequestAt;

  public OrderDispute() { 
  }

  public OrderDispute status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Dispute current status.  Possible values: * OPEN     - The dispute process has started. * REFUND   - The dispute process has been closed and a partial or full refund of the full amount of the order has been made. * RESOLVED - The dispute process has been closed without making any refund movement to the buyer.
   * @return status
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "OPEN", required = true, value = "Dispute current status.  Possible values: * OPEN     - The dispute process has started. * REFUND   - The dispute process has been closed and a partial or full refund of the full amount of the order has been made. * RESOLVED - The dispute process has been closed without making any refund movement to the buyer.")
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public StatusEnum getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setStatus(StatusEnum status) {
    this.status = status;
  }


  public OrderDispute createdAt(Long createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Date and time the dispute started, in milliseconds and UTC format.      The Unix epoch (or Unix time or POSIX time or Unix timestamp) is the number of seconds elapsed since January 1, 1970 (midnight UTC/GMT), not counting leap seconds (in ISO 8601: 1970-01-01T00: 00:00Z)
   * minimum: 0
   * @return createdAt
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1667353629", required = true, value = "Date and time the dispute started, in milliseconds and UTC format.      The Unix epoch (or Unix time or POSIX time or Unix timestamp) is the number of seconds elapsed since January 1, 1970 (midnight UTC/GMT), not counting leap seconds (in ISO 8601: 1970-01-01T00: 00:00Z)")
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getCreatedAt() {
    return createdAt;
  }


  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCreatedAt(Long createdAt) {
    this.createdAt = createdAt;
  }


  public OrderDispute resolutionRequestType(ResolutionRequestTypeEnum resolutionRequestType) {
    this.resolutionRequestType = resolutionRequestType;
    return this;
  }

   /**
   * Support type requested from Zenki staff.  Possible values: * REQUEST_REFUND      - Request for support from Zenki staff to make a refund. * REQUEST_CONCILIATED - Request to Zenki staff to reconcile dispute between buyer and merchant.
   * @return resolutionRequestType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "REQUEST_CONCILIATED", value = "Support type requested from Zenki staff.  Possible values: * REQUEST_REFUND      - Request for support from Zenki staff to make a refund. * REQUEST_CONCILIATED - Request to Zenki staff to reconcile dispute between buyer and merchant.")
  @JsonProperty(JSON_PROPERTY_RESOLUTION_REQUEST_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public ResolutionRequestTypeEnum getResolutionRequestType() {
    return resolutionRequestType;
  }


  @JsonProperty(JSON_PROPERTY_RESOLUTION_REQUEST_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResolutionRequestType(ResolutionRequestTypeEnum resolutionRequestType) {
    this.resolutionRequestType = resolutionRequestType;
  }


  public OrderDispute resolutionRequestAt(Long resolutionRequestAt) {
    this.resolutionRequestAt = resolutionRequestAt;
    return this;
  }

   /**
   * Date and time in which the dispute was finalized and a final resolution of the process was given to the buyer, in milliseconds and UTC format.      The Unix epoch (or Unix time or POSIX time or Unix timestamp) is the number of seconds elapsed since January 1, 1970 (midnight UTC/GMT), not counting leap seconds (in ISO 8601: 1970-01-01T00: 00:00Z)
   * minimum: 0
   * @return resolutionRequestAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1667353629", value = "Date and time in which the dispute was finalized and a final resolution of the process was given to the buyer, in milliseconds and UTC format.      The Unix epoch (or Unix time or POSIX time or Unix timestamp) is the number of seconds elapsed since January 1, 1970 (midnight UTC/GMT), not counting leap seconds (in ISO 8601: 1970-01-01T00: 00:00Z)")
  @JsonProperty(JSON_PROPERTY_RESOLUTION_REQUEST_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getResolutionRequestAt() {
    return resolutionRequestAt;
  }


  @JsonProperty(JSON_PROPERTY_RESOLUTION_REQUEST_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setResolutionRequestAt(Long resolutionRequestAt) {
    this.resolutionRequestAt = resolutionRequestAt;
  }


  /**
   * Return true if this Order_dispute object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderDispute orderDispute = (OrderDispute) o;
    return Objects.equals(this.status, orderDispute.status) &&
        Objects.equals(this.createdAt, orderDispute.createdAt) &&
        Objects.equals(this.resolutionRequestType, orderDispute.resolutionRequestType) &&
        Objects.equals(this.resolutionRequestAt, orderDispute.resolutionRequestAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, createdAt, resolutionRequestType, resolutionRequestAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderDispute {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    resolutionRequestType: ").append(toIndentedString(resolutionRequestType)).append("\n");
    sb.append("    resolutionRequestAt: ").append(toIndentedString(resolutionRequestAt)).append("\n");
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

