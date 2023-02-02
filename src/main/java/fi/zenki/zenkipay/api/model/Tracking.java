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
import fi.zenki.zenkipay.api.model.TrackingExternalCourier;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Tracking
 */
@JsonPropertyOrder({
  Tracking.JSON_PROPERTY_ZENKI_TRACKING_ID,
  Tracking.JSON_PROPERTY_COURIER_TYPE,
  Tracking.JSON_PROPERTY_TRACKING_ID,
  Tracking.JSON_PROPERTY_COURIER_NAME,
  Tracking.JSON_PROPERTY_EXTERNAL_COURIER
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-02T17:36:38.616098402Z[Etc/UTC]")
public class Tracking {
  public static final String JSON_PROPERTY_ZENKI_TRACKING_ID = "zenkiTrackingId";
  private String zenkiTrackingId;

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
  private JsonNullable<String> trackingId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_COURIER_NAME = "courierName";
  private JsonNullable<String> courierName = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_EXTERNAL_COURIER = "externalCourier";
  private TrackingExternalCourier externalCourier;

  public Tracking() { 
  }

  public Tracking zenkiTrackingId(String zenkiTrackingId) {
    this.zenkiTrackingId = zenkiTrackingId;
    return this;
  }

   /**
   * Unique tracking identifier generated by Zenkipay.
   * @return zenkiTrackingId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "d65a558951d3", required = true, value = "Unique tracking identifier generated by Zenkipay.")
  @JsonProperty(JSON_PROPERTY_ZENKI_TRACKING_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getZenkiTrackingId() {
    return zenkiTrackingId;
  }


  @JsonProperty(JSON_PROPERTY_ZENKI_TRACKING_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setZenkiTrackingId(String zenkiTrackingId) {
    this.zenkiTrackingId = zenkiTrackingId;
  }


  public Tracking courierType(CourierTypeEnum courierType) {
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


  public Tracking trackingId(String trackingId) {
    this.trackingId = JsonNullable.<String>of(trackingId);
    return this;
  }

   /**
   * Unique tracking identifier generated by a courier.
   * @return trackingId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "d65a558951d3", value = "Unique tracking identifier generated by a courier.")
  @JsonIgnore

  public String getTrackingId() {
        return trackingId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TRACKING_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getTrackingId_JsonNullable() {
    return trackingId;
  }
  
  @JsonProperty(JSON_PROPERTY_TRACKING_ID)
  public void setTrackingId_JsonNullable(JsonNullable<String> trackingId) {
    this.trackingId = trackingId;
  }

  public void setTrackingId(String trackingId) {
    this.trackingId = JsonNullable.<String>of(trackingId);
  }


  public Tracking courierName(String courierName) {
    this.courierName = JsonNullable.<String>of(courierName);
    return this;
  }

   /**
   * Internal courier name of the merchant used to deliver the service or product.
   * @return courierName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Internal messaging - Brothers Shoe Store", value = "Internal courier name of the merchant used to deliver the service or product.")
  @JsonIgnore

  public String getCourierName() {
        return courierName.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_COURIER_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getCourierName_JsonNullable() {
    return courierName;
  }
  
  @JsonProperty(JSON_PROPERTY_COURIER_NAME)
  public void setCourierName_JsonNullable(JsonNullable<String> courierName) {
    this.courierName = courierName;
  }

  public void setCourierName(String courierName) {
    this.courierName = JsonNullable.<String>of(courierName);
  }


  public Tracking externalCourier(TrackingExternalCourier externalCourier) {
    this.externalCourier = externalCourier;
    return this;
  }

   /**
   * Get externalCourier
   * @return externalCourier
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_EXTERNAL_COURIER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TrackingExternalCourier getExternalCourier() {
    return externalCourier;
  }


  @JsonProperty(JSON_PROPERTY_EXTERNAL_COURIER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExternalCourier(TrackingExternalCourier externalCourier) {
    this.externalCourier = externalCourier;
  }


  /**
   * Return true if this Tracking object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Tracking tracking = (Tracking) o;
    return Objects.equals(this.zenkiTrackingId, tracking.zenkiTrackingId) &&
        Objects.equals(this.courierType, tracking.courierType) &&
        equalsNullable(this.trackingId, tracking.trackingId) &&
        equalsNullable(this.courierName, tracking.courierName) &&
        Objects.equals(this.externalCourier, tracking.externalCourier);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(zenkiTrackingId, courierType, hashCodeNullable(trackingId), hashCodeNullable(courierName), externalCourier);
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
    sb.append("class Tracking {\n");
    sb.append("    zenkiTrackingId: ").append(toIndentedString(zenkiTrackingId)).append("\n");
    sb.append("    courierType: ").append(toIndentedString(courierType)).append("\n");
    sb.append("    trackingId: ").append(toIndentedString(trackingId)).append("\n");
    sb.append("    courierName: ").append(toIndentedString(courierName)).append("\n");
    sb.append("    externalCourier: ").append(toIndentedString(externalCourier)).append("\n");
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

