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
 * TrackingEventsInner
 */
@JsonPropertyOrder({
  TrackingEventsInner.JSON_PROPERTY_STATUS,
  TrackingEventsInner.JSON_PROPERTY_LOCATION,
  TrackingEventsInner.JSON_PROPERTY_DESCRIPTION,
  TrackingEventsInner.JSON_PROPERTY_CREATED_AT
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-31T22:56:57.338324531Z[Etc/UTC]")
public class TrackingEventsInner {
  /**
   * Delivery process states.  Possible values: * TRANSIT              - In delivery process. * DELIVERY             - The product or service has been delivered. * AVAILABLE_FOR_PICKUP - The product or service is ready for the buyer to pick it up at the store. * CANCELED             - The shipment has been cancelled. * FAILED               - There was a problem trying to deliver the product or service.
   */
  public enum StatusEnum {
    TRANSIT("TRANSIT"),
    
    DELIVERY("DELIVERY"),
    
    AVAILABLE_FOR_PICKUP("AVAILABLE_FOR_PICKUP"),
    
    CANCELED("CANCELED"),
    
    FAILED("FAILED");

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

  public static final String JSON_PROPERTY_LOCATION = "location";
  private String location;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private String description;

  public static final String JSON_PROPERTY_CREATED_AT = "createdAt";
  private Long createdAt;

  public TrackingEventsInner() { 
  }

  public TrackingEventsInner status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Delivery process states.  Possible values: * TRANSIT              - In delivery process. * DELIVERY             - The product or service has been delivered. * AVAILABLE_FOR_PICKUP - The product or service is ready for the buyer to pick it up at the store. * CANCELED             - The shipment has been cancelled. * FAILED               - There was a problem trying to deliver the product or service.
   * @return status
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "FAILED", required = true, value = "Delivery process states.  Possible values: * TRANSIT              - In delivery process. * DELIVERY             - The product or service has been delivered. * AVAILABLE_FOR_PICKUP - The product or service is ready for the buyer to pick it up at the store. * CANCELED             - The shipment has been cancelled. * FAILED               - There was a problem trying to deliver the product or service.")
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


  public TrackingEventsInner location(String location) {
    this.location = location;
    return this;
  }

   /**
   * Place where the event is triggered and the packet is located.
   * @return location
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Sopitas street, no 304, San Jeronimo neighborhood", required = true, value = "Place where the event is triggered and the packet is located.")
  @JsonProperty(JSON_PROPERTY_LOCATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getLocation() {
    return location;
  }


  @JsonProperty(JSON_PROPERTY_LOCATION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setLocation(String location) {
    this.location = location;
  }


  public TrackingEventsInner description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Detail of the error for which the shipment could not be completed or if the product or service was delivered correctly, indicate who received it.
   * @return description
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Invalid address.", required = true, value = "Detail of the error for which the shipment could not be completed or if the product or service was delivered correctly, indicate who received it.")
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getDescription() {
    return description;
  }


  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDescription(String description) {
    this.description = description;
  }


  public TrackingEventsInner createdAt(Long createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Date and time the trace event was logged, in milliseconds and UTC format.  The Unix epoch (or Unix time or POSIX time or Unix timestamp) is the number of seconds elapsed since January 1, 1970 (midnight UTC/GMT), not counting leap seconds (in ISO 8601: 1970-01-01T00: 00:00Z)
   * minimum: 0
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1667353629", value = "Date and time the trace event was logged, in milliseconds and UTC format.  The Unix epoch (or Unix time or POSIX time or Unix timestamp) is the number of seconds elapsed since January 1, 1970 (midnight UTC/GMT), not counting leap seconds (in ISO 8601: 1970-01-01T00: 00:00Z)")
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getCreatedAt() {
    return createdAt;
  }


  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreatedAt(Long createdAt) {
    this.createdAt = createdAt;
  }


  /**
   * Return true if this TrackingEvents_inner object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrackingEventsInner trackingEventsInner = (TrackingEventsInner) o;
    return Objects.equals(this.status, trackingEventsInner.status) &&
        Objects.equals(this.location, trackingEventsInner.location) &&
        Objects.equals(this.description, trackingEventsInner.description) &&
        Objects.equals(this.createdAt, trackingEventsInner.createdAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, location, description, createdAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TrackingEventsInner {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
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

