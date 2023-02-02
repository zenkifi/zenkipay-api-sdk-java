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
import fi.zenki.zenkipay.api.model.UpdateOrderShopper;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.HashMap;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Object used with the information required to update an order.
 */
@ApiModel(description = "Object used with the information required to update an order.")
@JsonPropertyOrder({
  UpdateOrder.JSON_PROPERTY_ORDER_ID,
  UpdateOrder.JSON_PROPERTY_CART_ID,
  UpdateOrder.JSON_PROPERTY_SHOPPER,
  UpdateOrder.JSON_PROPERTY_METADATA
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-02T17:57:08.967812480Z[Etc/UTC]")
public class UpdateOrder {
  public static final String JSON_PROPERTY_ORDER_ID = "orderId";
  private JsonNullable<String> orderId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CART_ID = "cartId";
  private JsonNullable<String> cartId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_SHOPPER = "shopper";
  private JsonNullable<UpdateOrderShopper> shopper = JsonNullable.<UpdateOrderShopper>undefined();

  public static final String JSON_PROPERTY_METADATA = "metadata";
  private JsonNullable<Map<String, String>> metadata = JsonNullable.<Map<String, String>>undefined();

  public UpdateOrder() { 
  }

  public UpdateOrder orderId(String orderId) {
    this.orderId = JsonNullable.<String>of(orderId);
    return this;
  }

   /**
   * Unique order identifier generated by the merchant.
   * @return orderId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "f3359498592b", value = "Unique order identifier generated by the merchant.")
  @JsonIgnore

  public String getOrderId() {
        return orderId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ORDER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getOrderId_JsonNullable() {
    return orderId;
  }
  
  @JsonProperty(JSON_PROPERTY_ORDER_ID)
  public void setOrderId_JsonNullable(JsonNullable<String> orderId) {
    this.orderId = orderId;
  }

  public void setOrderId(String orderId) {
    this.orderId = JsonNullable.<String>of(orderId);
  }


  public UpdateOrder cartId(String cartId) {
    this.cartId = JsonNullable.<String>of(cartId);
    return this;
  }

   /**
   * Unique identifier of the shopping cart that allows identifying the purchase of one or more products or services.
   * @return cartId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "96a17044f0e3", value = "Unique identifier of the shopping cart that allows identifying the purchase of one or more products or services.")
  @JsonIgnore

  public String getCartId() {
        return cartId.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_CART_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getCartId_JsonNullable() {
    return cartId;
  }
  
  @JsonProperty(JSON_PROPERTY_CART_ID)
  public void setCartId_JsonNullable(JsonNullable<String> cartId) {
    this.cartId = cartId;
  }

  public void setCartId(String cartId) {
    this.cartId = JsonNullable.<String>of(cartId);
  }


  public UpdateOrder shopper(UpdateOrderShopper shopper) {
    this.shopper = JsonNullable.<UpdateOrderShopper>of(shopper);
    return this;
  }

   /**
   * Get shopper
   * @return shopper
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public UpdateOrderShopper getShopper() {
        return shopper.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SHOPPER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<UpdateOrderShopper> getShopper_JsonNullable() {
    return shopper;
  }
  
  @JsonProperty(JSON_PROPERTY_SHOPPER)
  public void setShopper_JsonNullable(JsonNullable<UpdateOrderShopper> shopper) {
    this.shopper = shopper;
  }

  public void setShopper(UpdateOrderShopper shopper) {
    this.shopper = JsonNullable.<UpdateOrderShopper>of(shopper);
  }


  public UpdateOrder metadata(Map<String, String> metadata) {
    this.metadata = JsonNullable.<Map<String, String>>of(metadata);
    return this;
  }

  public UpdateOrder putMetadataItem(String key, String metadataItem) {
    if (this.metadata == null || !this.metadata.isPresent()) {
      this.metadata = JsonNullable.<Map<String, String>>of(new HashMap<>());
    }
    try {
      this.metadata.get().put(key, metadataItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Complementary information of the order that the merchant requires to send and inform Zenkipay.
   * @return metadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\"trackingId\":\"5514a95b0882\"}", value = "Complementary information of the order that the merchant requires to send and inform Zenkipay.")
  @JsonIgnore

  public Map<String, String> getMetadata() {
        return metadata.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Map<String, String>> getMetadata_JsonNullable() {
    return metadata;
  }
  
  @JsonProperty(JSON_PROPERTY_METADATA)
  public void setMetadata_JsonNullable(JsonNullable<Map<String, String>> metadata) {
    this.metadata = metadata;
  }

  public void setMetadata(Map<String, String> metadata) {
    this.metadata = JsonNullable.<Map<String, String>>of(metadata);
  }


  /**
   * Return true if this UpdateOrder object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateOrder updateOrder = (UpdateOrder) o;
    return equalsNullable(this.orderId, updateOrder.orderId) &&
        equalsNullable(this.cartId, updateOrder.cartId) &&
        equalsNullable(this.shopper, updateOrder.shopper) &&
        equalsNullable(this.metadata, updateOrder.metadata);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(orderId), hashCodeNullable(cartId), hashCodeNullable(shopper), hashCodeNullable(metadata));
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
    sb.append("class UpdateOrder {\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    cartId: ").append(toIndentedString(cartId)).append("\n");
    sb.append("    shopper: ").append(toIndentedString(shopper)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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

