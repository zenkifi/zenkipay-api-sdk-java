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
import fi.zenki.zenkipay.api.model.Breakdown;
import fi.zenki.zenkipay.api.model.Item;
import fi.zenki.zenkipay.api.model.OrderClaim;
import fi.zenki.zenkipay.api.model.OrderDispute;
import fi.zenki.zenkipay.api.model.OrderLinks;
import fi.zenki.zenkipay.api.model.OrderPaymentInfo;
import fi.zenki.zenkipay.api.model.OrderSettlementInfo;
import fi.zenki.zenkipay.api.model.Shopper;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Object that represents the detailed information of an order.
 */
@ApiModel(description = "Object that represents the detailed information of an order.")
@JsonPropertyOrder({
  Order.JSON_PROPERTY_VERSION,
  Order.JSON_PROPERTY_ZENKI_ORDER_ID,
  Order.JSON_PROPERTY_ORDER_ID,
  Order.JSON_PROPERTY_CART_ID,
  Order.JSON_PROPERTY_TYPE,
  Order.JSON_PROPERTY_COUNTRY_CODE_ISO2,
  Order.JSON_PROPERTY_STATUS,
  Order.JSON_PROPERTY_CREATED_AT,
  Order.JSON_PROPERTY_SHOPPER,
  Order.JSON_PROPERTY_BREAKDOWN,
  Order.JSON_PROPERTY_PAYMENT_INFO,
  Order.JSON_PROPERTY_SETTLEMENT_INFO,
  Order.JSON_PROPERTY_ITEMS,
  Order.JSON_PROPERTY_METADATA,
  Order.JSON_PROPERTY_DISPUTE,
  Order.JSON_PROPERTY_CLAIM,
  Order.JSON_PROPERTY_LINKS,
  Order.JSON_PROPERTY_PAYMENT_SIGNATURE
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-01T00:07:27.732301412Z[Etc/UTC]")
public class Order {
  public static final String JSON_PROPERTY_VERSION = "version";
  private String version;

  public static final String JSON_PROPERTY_ZENKI_ORDER_ID = "zenkiOrderId";
  private String zenkiOrderId;

  public static final String JSON_PROPERTY_ORDER_ID = "orderId";
  private String orderId;

  public static final String JSON_PROPERTY_CART_ID = "cartId";
  private String cartId;

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

  /**
   * Order Status  Possible values: * PENDING                   - Waiting for the buyer to pay the payment order. * READY4PAY                 - The buyer has been shown the modal and the order is ready for the buyer to pay for the order with his wallet. * AWAITING_PAYMENT          - A first confirmation has been received by the blockchain network, it is waiting to have the required confirmations. * AWAITING_DELIVERY         - The payment for the product or service has already been made and the delivery of the product or service is in process. * DELIVERED_SERVICE         - The service has already been delivered. * AWAITING_SHIPMENT         - The guide for the products has already been uploaded and the shipment is in process. * SHIPPED                   - The product or service has been shipped. * SHIPMENT_ERROR            - There was a problem in the shipping process. * AWAITING_SHOPPER_APPROVAL - Waiting for approval from the buyer to confirm that they have received the product or service. * DISPUTED                  - The buyer has started a dispute process with the merchant. * PENDING_SHOPPER_RETURN    - The merchant is waiting for the buyer to return the product, as a result of the dispute. * REFUNDED                  - The product or service has been refunded to the buyer. * COMPLETED                 - The buyer confirms the receipt of the product or service satisfactorily and the exchange of the value of the sale to stable currency has been made only if applicable. * SETTLED                   - The merchant transaction has been settled.
   */
  public enum StatusEnum {
    PENDING("PENDING"),
    
    READY4PAY("READY4PAY"),
    
    AWAITING_PAYMENT("AWAITING_PAYMENT"),
    
    AWAITING_DELIVERY("AWAITING_DELIVERY"),
    
    DELIVERED_SERVICE("DELIVERED_SERVICE"),
    
    AWAITING_SHIPMENT("AWAITING_SHIPMENT"),
    
    SHIPPED("SHIPPED"),
    
    SHIPMENT_ERROR("SHIPMENT_ERROR"),
    
    AWAITING_SHOPPER_APPROVAL("AWAITING_SHOPPER_APPROVAL"),
    
    DISPUTED("DISPUTED"),
    
    PENDING_SHOPPER_RETURN("PENDING_SHOPPER_RETURN"),
    
    REFUNDED("REFUNDED"),
    
    COMPLETED("COMPLETED"),
    
    SETTLED("SETTLED");

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

  public static final String JSON_PROPERTY_SHOPPER = "shopper";
  private JsonNullable<Shopper> shopper = JsonNullable.<Shopper>undefined();

  public static final String JSON_PROPERTY_BREAKDOWN = "breakdown";
  private Breakdown breakdown;

  public static final String JSON_PROPERTY_PAYMENT_INFO = "paymentInfo";
  private JsonNullable<OrderPaymentInfo> paymentInfo = JsonNullable.<OrderPaymentInfo>undefined();

  public static final String JSON_PROPERTY_SETTLEMENT_INFO = "settlementInfo";
  private JsonNullable<OrderSettlementInfo> settlementInfo = JsonNullable.<OrderSettlementInfo>undefined();

  public static final String JSON_PROPERTY_ITEMS = "items";
  private List<Item> items = new ArrayList<>();

  public static final String JSON_PROPERTY_METADATA = "metadata";
  private JsonNullable<Map<String, String>> metadata = JsonNullable.<Map<String, String>>undefined();

  public static final String JSON_PROPERTY_DISPUTE = "dispute";
  private OrderDispute dispute;

  public static final String JSON_PROPERTY_CLAIM = "claim";
  private OrderClaim claim;

  public static final String JSON_PROPERTY_LINKS = "_links";
  private JsonNullable<OrderLinks> links = JsonNullable.<OrderLinks>undefined();

  public static final String JSON_PROPERTY_PAYMENT_SIGNATURE = "paymentSignature";
  private String paymentSignature;

  public Order() { 
  }

  public Order version(String version) {
    this.version = version;
    return this;
  }

   /**
   * Data model version, its current value should be v1.0.0.
   * @return version
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "v1.0.0", required = true, value = "Data model version, its current value should be v1.0.0.")
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


  public Order zenkiOrderId(String zenkiOrderId) {
    this.zenkiOrderId = zenkiOrderId;
    return this;
  }

   /**
   * Unique order identifier generated by Zenkipay.
   * @return zenkiOrderId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "f325da2b8e3f476caa07e039406e72f0", required = true, value = "Unique order identifier generated by Zenkipay.")
  @JsonProperty(JSON_PROPERTY_ZENKI_ORDER_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getZenkiOrderId() {
    return zenkiOrderId;
  }


  @JsonProperty(JSON_PROPERTY_ZENKI_ORDER_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setZenkiOrderId(String zenkiOrderId) {
    this.zenkiOrderId = zenkiOrderId;
  }


  public Order orderId(String orderId) {
    this.orderId = orderId;
    return this;
  }

   /**
   * Unique order identifier generated by the merchant.
   * @return orderId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "f3359498592b", value = "Unique order identifier generated by the merchant.")
  @JsonProperty(JSON_PROPERTY_ORDER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getOrderId() {
    return orderId;
  }


  @JsonProperty(JSON_PROPERTY_ORDER_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }


  public Order cartId(String cartId) {
    this.cartId = cartId;
    return this;
  }

   /**
   * Unique identifier of the shopping cart that allows identifying the purchase of one or more products or services.
   * @return cartId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "96a17044f0e3", value = "Unique identifier of the shopping cart that allows identifying the purchase of one or more products or services.")
  @JsonProperty(JSON_PROPERTY_CART_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCartId() {
    return cartId;
  }


  @JsonProperty(JSON_PROPERTY_CART_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCartId(String cartId) {
    this.cartId = cartId;
  }


  public Order type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Indicates the model for the product delivery or service delivery.  Possible values: * WITH_CARRIER    - If a courier is going to be used for the shipment and delivery of the product or service. * WITHOUT_CARRIER - If a courier is not going to be used for the shipment and delivery of the product or service. * MIXED           - If a courier is going to be used to send part of the products or services and another part is delivered without using a courier.
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "MIXED", required = true, value = "Indicates the model for the product delivery or service delivery.  Possible values: * WITH_CARRIER    - If a courier is going to be used for the shipment and delivery of the product or service. * WITHOUT_CARRIER - If a courier is not going to be used for the shipment and delivery of the product or service. * MIXED           - If a courier is going to be used to send part of the products or services and another part is delivered without using a courier.")
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


  public Order countryCodeIso2(String countryCodeIso2) {
    this.countryCodeIso2 = countryCodeIso2;
    return this;
  }

   /**
   * Unique identifier of the country, the definition of the ISO_3166-1 standard is used with 2 characters, see: https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2 or https://www.iso.org/iso-3166-country-codes.html
   * @return countryCodeIso2
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "MX", required = true, value = "Unique identifier of the country, the definition of the ISO_3166-1 standard is used with 2 characters, see: https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2 or https://www.iso.org/iso-3166-country-codes.html")
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


  public Order status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Order Status  Possible values: * PENDING                   - Waiting for the buyer to pay the payment order. * READY4PAY                 - The buyer has been shown the modal and the order is ready for the buyer to pay for the order with his wallet. * AWAITING_PAYMENT          - A first confirmation has been received by the blockchain network, it is waiting to have the required confirmations. * AWAITING_DELIVERY         - The payment for the product or service has already been made and the delivery of the product or service is in process. * DELIVERED_SERVICE         - The service has already been delivered. * AWAITING_SHIPMENT         - The guide for the products has already been uploaded and the shipment is in process. * SHIPPED                   - The product or service has been shipped. * SHIPMENT_ERROR            - There was a problem in the shipping process. * AWAITING_SHOPPER_APPROVAL - Waiting for approval from the buyer to confirm that they have received the product or service. * DISPUTED                  - The buyer has started a dispute process with the merchant. * PENDING_SHOPPER_RETURN    - The merchant is waiting for the buyer to return the product, as a result of the dispute. * REFUNDED                  - The product or service has been refunded to the buyer. * COMPLETED                 - The buyer confirms the receipt of the product or service satisfactorily and the exchange of the value of the sale to stable currency has been made only if applicable. * SETTLED                   - The merchant transaction has been settled.
   * @return status
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "PENDING", required = true, value = "Order Status  Possible values: * PENDING                   - Waiting for the buyer to pay the payment order. * READY4PAY                 - The buyer has been shown the modal and the order is ready for the buyer to pay for the order with his wallet. * AWAITING_PAYMENT          - A first confirmation has been received by the blockchain network, it is waiting to have the required confirmations. * AWAITING_DELIVERY         - The payment for the product or service has already been made and the delivery of the product or service is in process. * DELIVERED_SERVICE         - The service has already been delivered. * AWAITING_SHIPMENT         - The guide for the products has already been uploaded and the shipment is in process. * SHIPPED                   - The product or service has been shipped. * SHIPMENT_ERROR            - There was a problem in the shipping process. * AWAITING_SHOPPER_APPROVAL - Waiting for approval from the buyer to confirm that they have received the product or service. * DISPUTED                  - The buyer has started a dispute process with the merchant. * PENDING_SHOPPER_RETURN    - The merchant is waiting for the buyer to return the product, as a result of the dispute. * REFUNDED                  - The product or service has been refunded to the buyer. * COMPLETED                 - The buyer confirms the receipt of the product or service satisfactorily and the exchange of the value of the sale to stable currency has been made only if applicable. * SETTLED                   - The merchant transaction has been settled.")
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


  public Order createdAt(Long createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Date and time when Zenkipay received the request to create the order, in milliseconds and UTC format.  The Unix epoch (or Unix time or POSIX time or Unix timestamp) is the number of seconds elapsed since January 1, 1970 (midnight UTC/GMT), not counting leap seconds (in ISO 8601: 1970-01-01T00: 00:00Z)
   * minimum: 0
   * @return createdAt
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1667353629", required = true, value = "Date and time when Zenkipay received the request to create the order, in milliseconds and UTC format.  The Unix epoch (or Unix time or POSIX time or Unix timestamp) is the number of seconds elapsed since January 1, 1970 (midnight UTC/GMT), not counting leap seconds (in ISO 8601: 1970-01-01T00: 00:00Z)")
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


  public Order shopper(Shopper shopper) {
    this.shopper = JsonNullable.<Shopper>of(shopper);
    return this;
  }

   /**
   * Get shopper
   * @return shopper
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
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


  public Order breakdown(Breakdown breakdown) {
    this.breakdown = breakdown;
    return this;
  }

   /**
   * Get breakdown
   * @return breakdown
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
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


  public Order paymentInfo(OrderPaymentInfo paymentInfo) {
    this.paymentInfo = JsonNullable.<OrderPaymentInfo>of(paymentInfo);
    return this;
  }

   /**
   * Get paymentInfo
   * @return paymentInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public OrderPaymentInfo getPaymentInfo() {
        return paymentInfo.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_PAYMENT_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<OrderPaymentInfo> getPaymentInfo_JsonNullable() {
    return paymentInfo;
  }
  
  @JsonProperty(JSON_PROPERTY_PAYMENT_INFO)
  public void setPaymentInfo_JsonNullable(JsonNullable<OrderPaymentInfo> paymentInfo) {
    this.paymentInfo = paymentInfo;
  }

  public void setPaymentInfo(OrderPaymentInfo paymentInfo) {
    this.paymentInfo = JsonNullable.<OrderPaymentInfo>of(paymentInfo);
  }


  public Order settlementInfo(OrderSettlementInfo settlementInfo) {
    this.settlementInfo = JsonNullable.<OrderSettlementInfo>of(settlementInfo);
    return this;
  }

   /**
   * Get settlementInfo
   * @return settlementInfo
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public OrderSettlementInfo getSettlementInfo() {
        return settlementInfo.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_SETTLEMENT_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<OrderSettlementInfo> getSettlementInfo_JsonNullable() {
    return settlementInfo;
  }
  
  @JsonProperty(JSON_PROPERTY_SETTLEMENT_INFO)
  public void setSettlementInfo_JsonNullable(JsonNullable<OrderSettlementInfo> settlementInfo) {
    this.settlementInfo = settlementInfo;
  }

  public void setSettlementInfo(OrderSettlementInfo settlementInfo) {
    this.settlementInfo = JsonNullable.<OrderSettlementInfo>of(settlementInfo);
  }


  public Order items(List<Item> items) {
    this.items = items;
    return this;
  }

  public Order addItemsItem(Item itemsItem) {
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Set of products or services considered within the shopping cart.
   * @return items
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Set of products or services considered within the shopping cart.")
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


  public Order metadata(Map<String, String> metadata) {
    this.metadata = JsonNullable.<Map<String, String>>of(metadata);
    return this;
  }

  public Order putMetadataItem(String key, String metadataItem) {
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
   * Complementary order information that the merchant requires to send and inform Zenkipay.
   * @return metadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\"trackingId\":\"5514a95b0882\"}", value = "Complementary order information that the merchant requires to send and inform Zenkipay.")
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


  public Order dispute(OrderDispute dispute) {
    this.dispute = dispute;
    return this;
  }

   /**
   * Get dispute
   * @return dispute
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_DISPUTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OrderDispute getDispute() {
    return dispute;
  }


  @JsonProperty(JSON_PROPERTY_DISPUTE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setDispute(OrderDispute dispute) {
    this.dispute = dispute;
  }


  public Order claim(OrderClaim claim) {
    this.claim = claim;
    return this;
  }

   /**
   * Get claim
   * @return claim
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_CLAIM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OrderClaim getClaim() {
    return claim;
  }


  @JsonProperty(JSON_PROPERTY_CLAIM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setClaim(OrderClaim claim) {
    this.claim = claim;
  }


  public Order links(OrderLinks links) {
    this.links = JsonNullable.<OrderLinks>of(links);
    return this;
  }

   /**
   * Get links
   * @return links
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonIgnore

  public OrderLinks getLinks() {
        return links.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<OrderLinks> getLinks_JsonNullable() {
    return links;
  }
  
  @JsonProperty(JSON_PROPERTY_LINKS)
  public void setLinks_JsonNullable(JsonNullable<OrderLinks> links) {
    this.links = links;
  }

  public void setLinks(OrderLinks links) {
    this.links = JsonNullable.<OrderLinks>of(links);
  }


  public Order paymentSignature(String paymentSignature) {
    this.paymentSignature = paymentSignature;
    return this;
  }

   /**
   * Signature of the payment order information to display the modal.
   * @return paymentSignature
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "PsFEJpunOmvPmOiRyfyBWnrKpsZ4FNSSTp1s6rCIvV6YIe+tJC7RxwgXgaVVMJHikyMjJXuZIiIB0lSs0nPe0ln50hDAk+IFz6j06wEbj7rzG4ZLQMOYaHFnNLjO/KQlxm6IUhhkZ5LtbaKChOw7+VOTM0fJBlvtWlVxl0TYS3qc2JOvY2f5/3892hKus+Qj3sSX56Y6xaHv0hHvV7MZlP9Mnvlg/AYlh03MukpvhRiIPfdOQeknWYwNuU6OZjNeO782bEbi7c8wKB3m3Ckjh+WkJ+l2nJyU6tHFBg3Lyg28xy6wWf+UfoyHBx2kHTVzrP5i0ybQPNEl0Gb95ORTb61UoZCnXDrVD4SRxHFd//V0qN1eT233hgof65eAAHu0k+t0OVJWuVrfk2olHlFBDo1DTyhiwAmX74o57a+8YxdrmMbxRmuVTb8iXrtcihxcsLINC1FhT3QfQdXDhpS+WYILcgpQ0SRFHKCAHP6HjFG6T2hO4NnG6rNut6DsjWCIZI8MJdZSMYDQ+n7wJ63jzKGc1NW83U5cUWtZhhBwUo221U9/3XXMBb3bnY8Ej5gHreRodXCyOowjutP+XICwevvuJa4BAEYJ6DJmqxWBL1pBcNKoLTtGqYzXJg1HFZ2qPzdR9jZSsk15q+Wg/BlRXaeIe0WA495w1FwPS+SRjU0=", value = "Signature of the payment order information to display the modal.")
  @JsonProperty(JSON_PROPERTY_PAYMENT_SIGNATURE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPaymentSignature() {
    return paymentSignature;
  }


  @JsonProperty(JSON_PROPERTY_PAYMENT_SIGNATURE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPaymentSignature(String paymentSignature) {
    this.paymentSignature = paymentSignature;
  }


  /**
   * Return true if this Order object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Order order = (Order) o;
    return Objects.equals(this.version, order.version) &&
        Objects.equals(this.zenkiOrderId, order.zenkiOrderId) &&
        Objects.equals(this.orderId, order.orderId) &&
        Objects.equals(this.cartId, order.cartId) &&
        Objects.equals(this.type, order.type) &&
        Objects.equals(this.countryCodeIso2, order.countryCodeIso2) &&
        Objects.equals(this.status, order.status) &&
        Objects.equals(this.createdAt, order.createdAt) &&
        equalsNullable(this.shopper, order.shopper) &&
        Objects.equals(this.breakdown, order.breakdown) &&
        equalsNullable(this.paymentInfo, order.paymentInfo) &&
        equalsNullable(this.settlementInfo, order.settlementInfo) &&
        Objects.equals(this.items, order.items) &&
        equalsNullable(this.metadata, order.metadata) &&
        Objects.equals(this.dispute, order.dispute) &&
        Objects.equals(this.claim, order.claim) &&
        equalsNullable(this.links, order.links) &&
        Objects.equals(this.paymentSignature, order.paymentSignature);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(version, zenkiOrderId, orderId, cartId, type, countryCodeIso2, status, createdAt, hashCodeNullable(shopper), breakdown, hashCodeNullable(paymentInfo), hashCodeNullable(settlementInfo), items, hashCodeNullable(metadata), dispute, claim, hashCodeNullable(links), paymentSignature);
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
    sb.append("class Order {\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    zenkiOrderId: ").append(toIndentedString(zenkiOrderId)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    cartId: ").append(toIndentedString(cartId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    countryCodeIso2: ").append(toIndentedString(countryCodeIso2)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    shopper: ").append(toIndentedString(shopper)).append("\n");
    sb.append("    breakdown: ").append(toIndentedString(breakdown)).append("\n");
    sb.append("    paymentInfo: ").append(toIndentedString(paymentInfo)).append("\n");
    sb.append("    settlementInfo: ").append(toIndentedString(settlementInfo)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    dispute: ").append(toIndentedString(dispute)).append("\n");
    sb.append("    claim: ").append(toIndentedString(claim)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    paymentSignature: ").append(toIndentedString(paymentSignature)).append("\n");
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

