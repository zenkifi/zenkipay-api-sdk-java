/*
 * Zenkipay API
 * Definition of technical specification of the product; Zenkipay is a gateway cryptocurrency payment system that allows merchant's to receive payments on their e-commerce portals. Unlike other platforms, Zenkipay ensures customer satisfaction through its payment process. guarantee deposit (delivered product and expected quality) to settle payment to the merchant, thus avoiding the loss of client assets due to online scams.
 *
 * The version of the OpenAPI document: 1.0.1
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
 * AddTracking
 */
@JsonPropertyOrder({
  AddTracking.JSON_PROPERTY_COURIER_TYPE,
  AddTracking.JSON_PROPERTY_TRACKING_ID,
  AddTracking.JSON_PROPERTY_COURIER_NAME
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-01T00:17:55.088021122Z[Etc/UTC]")
public class AddTracking {
  /**
   * Courier type used to deliver the product or service.  Possible values: * EXTERNAL - In case of using an existing courier company, it must be indicated that the shipment will be external and the trackingId field must be informed. * INTERNAL - In case of using the merchant&#39;s own infrastructure to make the shipment, it must be indicated that the shipment will be internal and the courierName field must be informed.
   */
  public enum CourierTypeEnum {
    EXTERNAL("EXTERNAL"),
    
    INTERNAL("INTERNAL");

    private String value;

    CourierTypeEnum(String value) {
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
    public static CourierTypeEnum fromValue(String value) {
      for (CourierTypeEnum b : CourierTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_COURIER_TYPE = "courierType";
  private CourierTypeEnum courierType;

  public static final String JSON_PROPERTY_TRACKING_ID = "trackingId";
  private String trackingId;

  public static final String JSON_PROPERTY_COURIER_NAME = "courierName";
  private String courierName;

  public AddTracking() { 
  }

  public AddTracking courierType(CourierTypeEnum courierType) {
    this.courierType = courierType;
    return this;
  }

   /**
   * Courier type used to deliver the product or service.  Possible values: * EXTERNAL - In case of using an existing courier company, it must be indicated that the shipment will be external and the trackingId field must be informed. * INTERNAL - In case of using the merchant&#39;s own infrastructure to make the shipment, it must be indicated that the shipment will be internal and the courierName field must be informed.
   * @return courierType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "EXTERNAL", required = true, value = "Courier type used to deliver the product or service.  Possible values: * EXTERNAL - In case of using an existing courier company, it must be indicated that the shipment will be external and the trackingId field must be informed. * INTERNAL - In case of using the merchant's own infrastructure to make the shipment, it must be indicated that the shipment will be internal and the courierName field must be informed.")
  @JsonProperty(JSON_PROPERTY_COURIER_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public CourierTypeEnum getCourierType() {
    return courierType;
  }


  @JsonProperty(JSON_PROPERTY_COURIER_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCourierType(CourierTypeEnum courierType) {
    this.courierType = courierType;
  }


  public AddTracking trackingId(String trackingId) {
    this.trackingId = trackingId;
    return this;
  }

   /**
   * Unique tracking identifier generated by a courier.
   * @return trackingId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "d65a558951d3", value = "Unique tracking identifier generated by a courier.")
  @JsonProperty(JSON_PROPERTY_TRACKING_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getTrackingId() {
    return trackingId;
  }


  @JsonProperty(JSON_PROPERTY_TRACKING_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTrackingId(String trackingId) {
    this.trackingId = trackingId;
  }


  public AddTracking courierName(String courierName) {
    this.courierName = courierName;
    return this;
  }

   /**
   * Internal courier name of the business used to deliver the service or product.
   * @return courierName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Internal messaging - Brothers Shoe Store", value = "Internal courier name of the business used to deliver the service or product.")
  @JsonProperty(JSON_PROPERTY_COURIER_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCourierName() {
    return courierName;
  }


  @JsonProperty(JSON_PROPERTY_COURIER_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCourierName(String courierName) {
    this.courierName = courierName;
  }


  /**
   * Return true if this AddTracking object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddTracking addTracking = (AddTracking) o;
    return Objects.equals(this.courierType, addTracking.courierType) &&
        Objects.equals(this.trackingId, addTracking.trackingId) &&
        Objects.equals(this.courierName, addTracking.courierName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(courierType, trackingId, courierName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddTracking {\n");
    sb.append("    courierType: ").append(toIndentedString(courierType)).append("\n");
    sb.append("    trackingId: ").append(toIndentedString(trackingId)).append("\n");
    sb.append("    courierName: ").append(toIndentedString(courierName)).append("\n");
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

