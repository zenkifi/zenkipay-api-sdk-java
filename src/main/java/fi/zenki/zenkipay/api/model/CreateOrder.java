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
import fi.zenki.zenkipay.api.model.Breakdown;
import fi.zenki.zenkipay.api.model.Item;
import fi.zenki.zenkipay.api.model.Shopper;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * Object used with the information required to create an order.
 */
@JsonPropertyOrder({
  CreateOrder.JSON_PROPERTY_VERSION,
  CreateOrder.JSON_PROPERTY_ORDER_ID,
  CreateOrder.JSON_PROPERTY_CART_ID,
  CreateOrder.JSON_PROPERTY_TYPE,
  CreateOrder.JSON_PROPERTY_COUNTRY_CODE_ISO2,
  CreateOrder.JSON_PROPERTY_SHOPPER,
  CreateOrder.JSON_PROPERTY_BREAKDOWN,
  CreateOrder.JSON_PROPERTY_ITEMS,
  CreateOrder.JSON_PROPERTY_METADATA
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-23T23:32:36.925241933Z[Etc/UTC]")
public class CreateOrder {
  public static final String JSON_PROPERTY_VERSION = "version";
  private String version;

  public static final String JSON_PROPERTY_ORDER_ID = "orderId";
  private JsonNullable<String> orderId = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_CART_ID = "cartId";
  private JsonNullable<String> cartId = JsonNullable.<String>undefined();

  /**
   * Indicates the model for the product delivery or service delivery.  Possible values: * WITH_CARRIER    - If a courier is going to be used for the shipment and delivery of the product or service. * WITHOUT_CARRIER - If a courier is not going to be used for the shipment and delivery of the product or service. * MIXED           - If a courier is going to be used to send part of the products or services and another part is delivered without using a courier.
   */
  public enum TypeEnum {
    WITH_CARRIER("WITH_CARRIER"),
    
    WITHOUT_CARRIER("WITHOUT_CARRIER"),
    
    MIXED("MIXED");

    private String value;

    TypeEnum(String value) {
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
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_TYPE = "type";
  private TypeEnum type;

  public static final String JSON_PROPERTY_COUNTRY_CODE_ISO2 = "countryCodeIso2";
  private String countryCodeIso2;

  public static final String JSON_PROPERTY_SHOPPER = "shopper";
  private JsonNullable<Shopper> shopper = JsonNullable.<Shopper>undefined();

  public static final String JSON_PROPERTY_BREAKDOWN = "breakdown";
  private Breakdown breakdown;

  public static final String JSON_PROPERTY_ITEMS = "items";
  private List<Item> items = new ArrayList<>();

  public static final String JSON_PROPERTY_METADATA = "metadata";
  private JsonNullable<Map<String, String>> metadata = JsonNullable.<Map<String, String>>undefined();

  public CreateOrder() {
  }

  public CreateOrder version(String version) {
    
    this.version = version;
    return this;
  }

   /**
   * Data model version, its current value should be v1.0.0.
   * @return version
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getVersion() {
    return version;
  }


  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setVersion(String version) {
    this.version = version;
  }


  public CreateOrder orderId(String orderId) {
    this.orderId = JsonNullable.<String>of(orderId);
    
    return this;
  }

   /**
   * Unique order identifier generated by the merchant. In order to have correct traceability and adequate conversion metrics, it is required to send the OrderId field or the CardId Field.
   * @return orderId
  **/
  @javax.annotation.Nullable
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


  public CreateOrder cartId(String cartId) {
    this.cartId = JsonNullable.<String>of(cartId);
    
    return this;
  }

   /**
   * Unique identifier of the shopping cart that allows identifying the purchase of one or more products or services. In order to have correct traceability and adequate conversion metrics, it is required to send the OrderId field or the CardId Field.
   * @return cartId
  **/
  @javax.annotation.Nullable
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


  public CreateOrder type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * Indicates the model for the product delivery or service delivery.  Possible values: * WITH_CARRIER    - If a courier is going to be used for the shipment and delivery of the product or service. * WITHOUT_CARRIER - If a courier is not going to be used for the shipment and delivery of the product or service. * MIXED           - If a courier is going to be used to send part of the products or services and another part is delivered without using a courier.
   * @return type
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public TypeEnum getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setType(TypeEnum type) {
    this.type = type;
  }


  public CreateOrder countryCodeIso2(String countryCodeIso2) {
    
    this.countryCodeIso2 = countryCodeIso2;
    return this;
  }

   /**
   * Unique country identifier, the definition of the ISO_3166-1 standard is used with 2 characters, see:https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2 or https://www.iso.org/iso-3166-country-codes.html
   * @return countryCodeIso2
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_COUNTRY_CODE_ISO2)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCountryCodeIso2() {
    return countryCodeIso2;
  }


  @JsonProperty(JSON_PROPERTY_COUNTRY_CODE_ISO2)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCountryCodeIso2(String countryCodeIso2) {
    this.countryCodeIso2 = countryCodeIso2;
  }


  public CreateOrder shopper(Shopper shopper) {
    this.shopper = JsonNullable.<Shopper>of(shopper);
    
    return this;
  }

   /**
   * Get shopper
   * @return shopper
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public Shopper getShopper() {
        return shopper.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SHOPPER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Shopper> getShopper_JsonNullable() {
    return shopper;
  }
  
  @JsonProperty(JSON_PROPERTY_SHOPPER)
  public void setShopper_JsonNullable(JsonNullable<Shopper> shopper) {
    this.shopper = shopper;
  }

  public void setShopper(Shopper shopper) {
    this.shopper = JsonNullable.<Shopper>of(shopper);
  }


  public CreateOrder breakdown(Breakdown breakdown) {
    
    this.breakdown = breakdown;
    return this;
  }

   /**
   * Get breakdown
   * @return breakdown
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_BREAKDOWN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Breakdown getBreakdown() {
    return breakdown;
  }


  @JsonProperty(JSON_PROPERTY_BREAKDOWN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBreakdown(Breakdown breakdown) {
    this.breakdown = breakdown;
  }


  public CreateOrder items(List<Item> items) {
    
    this.items = items;
    return this;
  }

  public CreateOrder addItemsItem(Item itemsItem) {
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Set of products or services considered within the shopping cart.
   * @return items
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ITEMS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<Item> getItems() {
    return items;
  }


  @JsonProperty(JSON_PROPERTY_ITEMS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setItems(List<Item> items) {
    this.items = items;
  }


  public CreateOrder metadata(Map<String, String> metadata) {
    this.metadata = JsonNullable.<Map<String, String>>of(metadata);
    
    return this;
  }

  public CreateOrder putMetadataItem(String key, String metadataItem) {
    if (this.metadata == null || !this.metadata.isPresent()) {
      this.metadata = JsonNullable.<Map<String, String>>of(null);
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


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateOrder createOrder = (CreateOrder) o;
    return Objects.equals(this.version, createOrder.version) &&
        equalsNullable(this.orderId, createOrder.orderId) &&
        equalsNullable(this.cartId, createOrder.cartId) &&
        Objects.equals(this.type, createOrder.type) &&
        Objects.equals(this.countryCodeIso2, createOrder.countryCodeIso2) &&
        equalsNullable(this.shopper, createOrder.shopper) &&
        Objects.equals(this.breakdown, createOrder.breakdown) &&
        Objects.equals(this.items, createOrder.items) &&
        equalsNullable(this.metadata, createOrder.metadata);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(version, hashCodeNullable(orderId), hashCodeNullable(cartId), type, countryCodeIso2, hashCodeNullable(shopper), breakdown, items, hashCodeNullable(metadata));
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
    sb.append("class CreateOrder {\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    cartId: ").append(toIndentedString(cartId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    countryCodeIso2: ").append(toIndentedString(countryCodeIso2)).append("\n");
    sb.append("    shopper: ").append(toIndentedString(shopper)).append("\n");
    sb.append("    breakdown: ").append(toIndentedString(breakdown)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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

    // add `version` to the URL query string
    if (getVersion() != null) {
      try {
        joiner.add(String.format("%sversion%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getVersion()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `orderId` to the URL query string
    if (getOrderId() != null) {
      try {
        joiner.add(String.format("%sorderId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getOrderId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `cartId` to the URL query string
    if (getCartId() != null) {
      try {
        joiner.add(String.format("%scartId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCartId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `type` to the URL query string
    if (getType() != null) {
      try {
        joiner.add(String.format("%stype%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getType()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `countryCodeIso2` to the URL query string
    if (getCountryCodeIso2() != null) {
      try {
        joiner.add(String.format("%scountryCodeIso2%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCountryCodeIso2()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `shopper` to the URL query string
    if (getShopper() != null) {
      joiner.add(getShopper().toUrlQueryString(prefix + "shopper" + suffix));
    }

    // add `breakdown` to the URL query string
    if (getBreakdown() != null) {
      joiner.add(getBreakdown().toUrlQueryString(prefix + "breakdown" + suffix));
    }

    // add `items` to the URL query string
    if (getItems() != null) {
      for (int i = 0; i < getItems().size(); i++) {
        if (getItems().get(i) != null) {
          joiner.add(getItems().get(i).toUrlQueryString(String.format("%sitems%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `metadata` to the URL query string
    if (getMetadata() != null) {
      for (String _key : getMetadata().keySet()) {
        try {
          joiner.add(String.format("%smetadata%s%s=%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, _key, containerSuffix),
              getMetadata().get(_key), URLEncoder.encode(String.valueOf(getMetadata().get(_key)), "UTF-8").replaceAll("\\+", "%20")));
        } catch (UnsupportedEncodingException e) {
          // Should never happen, UTF-8 is always supported
          throw new RuntimeException(e);
        }
      }
    }

    return joiner.toString();
  }

}

