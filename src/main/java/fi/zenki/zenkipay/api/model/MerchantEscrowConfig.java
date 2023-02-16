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
 * Summary of the amount paid in crypto currency by the buyer.
 */
@ApiModel(description = "Summary of the amount paid in crypto currency by the buyer.")
@JsonPropertyOrder({
  MerchantEscrowConfig.JSON_PROPERTY_ORDER_TYPE,
  MerchantEscrowConfig.JSON_PROPERTY_SHOPPER_NOTIFICATION,
  MerchantEscrowConfig.JSON_PROPERTY_TIME_WAIT_TO_APPROVAL
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-16T14:33:03.876626539Z[Etc/UTC]")
public class MerchantEscrowConfig {
  /**
   * Indicates the model for the product delivery or service delivery.  Possible values: * WITH_CARRIER    - If a courier is going to be used for the shipment and delivery of the product or service. * WITHOUT_CARRIER - If a courier is not going to be used for the shipment and delivery of the product or service. * MIXED           - If a courier is going to be used to send part of the products or services and another part is delivered without using a courier.
   */
  public enum OrderTypeEnum {
    WITH_CARRIER("WITH_CARRIER"),
    
    WITHOUT_CARRIER("WITHOUT_CARRIER"),
    
    MIXED("MIXED");

    private String value;

    OrderTypeEnum(String value) {
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
    public static OrderTypeEnum fromValue(String value) {
      for (OrderTypeEnum b : OrderTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_ORDER_TYPE = "orderType";
  private OrderTypeEnum orderType;

  public static final String JSON_PROPERTY_SHOPPER_NOTIFICATION = "shopperNotification";
  private Long shopperNotification;

  public static final String JSON_PROPERTY_TIME_WAIT_TO_APPROVAL = "timeWaitToApproval";
  private Long timeWaitToApproval;

  public MerchantEscrowConfig() { 
  }

  public MerchantEscrowConfig orderType(OrderTypeEnum orderType) {
    this.orderType = orderType;
    return this;
  }

   /**
   * Indicates the model for the product delivery or service delivery.  Possible values: * WITH_CARRIER    - If a courier is going to be used for the shipment and delivery of the product or service. * WITHOUT_CARRIER - If a courier is not going to be used for the shipment and delivery of the product or service. * MIXED           - If a courier is going to be used to send part of the products or services and another part is delivered without using a courier.
   * @return orderType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "MIXED", value = "Indicates the model for the product delivery or service delivery.  Possible values: * WITH_CARRIER    - If a courier is going to be used for the shipment and delivery of the product or service. * WITHOUT_CARRIER - If a courier is not going to be used for the shipment and delivery of the product or service. * MIXED           - If a courier is going to be used to send part of the products or services and another part is delivered without using a courier.")
  @JsonProperty(JSON_PROPERTY_ORDER_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OrderTypeEnum getOrderType() {
    return orderType;
  }


  @JsonProperty(JSON_PROPERTY_ORDER_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setOrderType(OrderTypeEnum orderType) {
    this.orderType = orderType;
  }


  public MerchantEscrowConfig shopperNotification(Long shopperNotification) {
    this.shopperNotification = shopperNotification;
    return this;
  }

   /**
   * Number of hours to wait for the merchant to notify Zenki that they have delivered the services to the shopper. Time is expressed in hours.
   * minimum: 0
   * @return shopperNotification
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "6", value = "Number of hours to wait for the merchant to notify Zenki that they have delivered the services to the shopper. Time is expressed in hours.")
  @JsonProperty(JSON_PROPERTY_SHOPPER_NOTIFICATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getShopperNotification() {
    return shopperNotification;
  }


  @JsonProperty(JSON_PROPERTY_SHOPPER_NOTIFICATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setShopperNotification(Long shopperNotification) {
    this.shopperNotification = shopperNotification;
  }


  public MerchantEscrowConfig timeWaitToApproval(Long timeWaitToApproval) {
    this.timeWaitToApproval = timeWaitToApproval;
    return this;
  }

   /**
   * Number of hours that Zenki will wait for confirmation from the buyer before approving the payment and releasing the funds to the merchant. Time is expressed in hours.
   * minimum: 0
   * @return timeWaitToApproval
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "24", value = "Number of hours that Zenki will wait for confirmation from the buyer before approving the payment and releasing the funds to the merchant. Time is expressed in hours.")
  @JsonProperty(JSON_PROPERTY_TIME_WAIT_TO_APPROVAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Long getTimeWaitToApproval() {
    return timeWaitToApproval;
  }


  @JsonProperty(JSON_PROPERTY_TIME_WAIT_TO_APPROVAL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTimeWaitToApproval(Long timeWaitToApproval) {
    this.timeWaitToApproval = timeWaitToApproval;
  }


  /**
   * Return true if this Merchant_escrowConfig object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MerchantEscrowConfig merchantEscrowConfig = (MerchantEscrowConfig) o;
    return Objects.equals(this.orderType, merchantEscrowConfig.orderType) &&
        Objects.equals(this.shopperNotification, merchantEscrowConfig.shopperNotification) &&
        Objects.equals(this.timeWaitToApproval, merchantEscrowConfig.timeWaitToApproval);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderType, shopperNotification, timeWaitToApproval);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MerchantEscrowConfig {\n");
    sb.append("    orderType: ").append(toIndentedString(orderType)).append("\n");
    sb.append("    shopperNotification: ").append(toIndentedString(shopperNotification)).append("\n");
    sb.append("    timeWaitToApproval: ").append(toIndentedString(timeWaitToApproval)).append("\n");
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

