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
import java.util.HashMap;
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
 * Information about a product or service.
 */
@JsonPropertyOrder({
  Item.JSON_PROPERTY_EXTERNAL_ID,
  Item.JSON_PROPERTY_QUANTITY,
  Item.JSON_PROPERTY_UNIT_PRICE,
  Item.JSON_PROPERTY_NAME,
  Item.JSON_PROPERTY_DESCRIPTION,
  Item.JSON_PROPERTY_TYPE,
  Item.JSON_PROPERTY_THUMBNAIL_URL,
  Item.JSON_PROPERTY_METADATA
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-23T15:55:44.125730643Z[Etc/UTC]")
public class Item {
  public static final String JSON_PROPERTY_EXTERNAL_ID = "externalId";
  private String externalId;

  public static final String JSON_PROPERTY_QUANTITY = "quantity";
  private Long quantity;

  public static final String JSON_PROPERTY_UNIT_PRICE = "unitPrice";
  private Double unitPrice;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_DESCRIPTION = "description";
  private JsonNullable<String> description = JsonNullable.<String>undefined();

  /**
   * Indicates the model for the product delivery or service delivery.  Possible values: * WITH_CARRIER    - If a courier is going to be used for the shipment and delivery of the product or service. * WITHOUT_CARRIER - If a courier is not going to be used for the shipment and delivery of the product or service.
   */
  public enum TypeEnum {
    WITH_CARRIER("WITH_CARRIER"),
    
    WITHOUT_CARRIER("WITHOUT_CARRIER");

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

  public static final String JSON_PROPERTY_THUMBNAIL_URL = "thumbnailUrl";
  private JsonNullable<String> thumbnailUrl = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_METADATA = "metadata";
  private JsonNullable<Map<String, String>> metadata = JsonNullable.<Map<String, String>>undefined();

  public Item() {
  }

  public Item externalId(String externalId) {
    
    this.externalId = externalId;
    return this;
  }

   /**
   * Unique identifier of the product or service assigned by the merchant.
   * @return externalId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_EXTERNAL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getExternalId() {
    return externalId;
  }


  @JsonProperty(JSON_PROPERTY_EXTERNAL_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExternalId(String externalId) {
    this.externalId = externalId;
  }


  public Item quantity(Long quantity) {
    
    this.quantity = quantity;
    return this;
  }

   /**
   * Total number of products or services of the order of the same type.
   * minimum: 0
   * @return quantity
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_QUANTITY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getQuantity() {
    return quantity;
  }


  @JsonProperty(JSON_PROPERTY_QUANTITY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setQuantity(Long quantity) {
    this.quantity = quantity;
  }


  public Item unitPrice(Double unitPrice) {
    
    this.unitPrice = unitPrice;
    return this;
  }

   /**
   * Unit price of the product or service.
   * minimum: 0
   * @return unitPrice
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_UNIT_PRICE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Double getUnitPrice() {
    return unitPrice;
  }


  @JsonProperty(JSON_PROPERTY_UNIT_PRICE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUnitPrice(Double unitPrice) {
    this.unitPrice = unitPrice;
  }


  public Item name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Short name of the product or service.
   * @return name
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setName(String name) {
    this.name = name;
  }


  public Item description(String description) {
    this.description = JsonNullable.<String>of(description);
    
    return this;
  }

   /**
   * Description of the product or service.
   * @return description
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getDescription() {
        return description.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getDescription_JsonNullable() {
    return description;
  }
  
  @JsonProperty(JSON_PROPERTY_DESCRIPTION)
  public void setDescription_JsonNullable(JsonNullable<String> description) {
    this.description = description;
  }

  public void setDescription(String description) {
    this.description = JsonNullable.<String>of(description);
  }


  public Item type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * Indicates the model for the product delivery or service delivery.  Possible values: * WITH_CARRIER    - If a courier is going to be used for the shipment and delivery of the product or service. * WITHOUT_CARRIER - If a courier is not going to be used for the shipment and delivery of the product or service.
   * @return type
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TypeEnum getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(TypeEnum type) {
    this.type = type;
  }


  public Item thumbnailUrl(String thumbnailUrl) {
    this.thumbnailUrl = JsonNullable.<String>of(thumbnailUrl);
    
    return this;
  }

   /**
   * Product image URL (thumbnail).
   * @return thumbnailUrl
  **/
  @javax.annotation.Nullable
  @JsonIgnore

  public String getThumbnailUrl() {
        return thumbnailUrl.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_THUMBNAIL_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getThumbnailUrl_JsonNullable() {
    return thumbnailUrl;
  }
  
  @JsonProperty(JSON_PROPERTY_THUMBNAIL_URL)
  public void setThumbnailUrl_JsonNullable(JsonNullable<String> thumbnailUrl) {
    this.thumbnailUrl = thumbnailUrl;
  }

  public void setThumbnailUrl(String thumbnailUrl) {
    this.thumbnailUrl = JsonNullable.<String>of(thumbnailUrl);
  }


  public Item metadata(Map<String, String> metadata) {
    this.metadata = JsonNullable.<Map<String, String>>of(metadata);
    
    return this;
  }

  public Item putMetadataItem(String key, String metadataItem) {
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
   * Complementary information of the product or service that is required to be reported or kept in the Zenkipay system.
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
    Item item = (Item) o;
    return Objects.equals(this.externalId, item.externalId) &&
        Objects.equals(this.quantity, item.quantity) &&
        Objects.equals(this.unitPrice, item.unitPrice) &&
        Objects.equals(this.name, item.name) &&
        equalsNullable(this.description, item.description) &&
        Objects.equals(this.type, item.type) &&
        equalsNullable(this.thumbnailUrl, item.thumbnailUrl) &&
        equalsNullable(this.metadata, item.metadata);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(externalId, quantity, unitPrice, name, hashCodeNullable(description), type, hashCodeNullable(thumbnailUrl), hashCodeNullable(metadata));
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
    sb.append("class Item {\n");
    sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    unitPrice: ").append(toIndentedString(unitPrice)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    thumbnailUrl: ").append(toIndentedString(thumbnailUrl)).append("\n");
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

    // add `externalId` to the URL query string
    if (getExternalId() != null) {
      try {
        joiner.add(String.format("%sexternalId%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getExternalId()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `quantity` to the URL query string
    if (getQuantity() != null) {
      try {
        joiner.add(String.format("%squantity%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getQuantity()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `unitPrice` to the URL query string
    if (getUnitPrice() != null) {
      try {
        joiner.add(String.format("%sunitPrice%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getUnitPrice()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `name` to the URL query string
    if (getName() != null) {
      try {
        joiner.add(String.format("%sname%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getName()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `description` to the URL query string
    if (getDescription() != null) {
      try {
        joiner.add(String.format("%sdescription%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getDescription()), "UTF-8").replaceAll("\\+", "%20")));
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

    // add `thumbnailUrl` to the URL query string
    if (getThumbnailUrl() != null) {
      try {
        joiner.add(String.format("%sthumbnailUrl%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getThumbnailUrl()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
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

