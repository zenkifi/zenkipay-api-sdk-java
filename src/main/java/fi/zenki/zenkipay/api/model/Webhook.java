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
 * Base structure of the notification that the merchant will receive, this notification will handle different types of events for its processing. The content of the message will be in string format so that it can be interpreted according to the type of event received by the merchant from Zenkipay.
 */
@ApiModel(description = "Base structure of the notification that the merchant will receive, this notification will handle different types of events for its processing. The content of the message will be in string format so that it can be interpreted according to the type of event received by the merchant from Zenkipay.")
@JsonPropertyOrder({
  Webhook.JSON_PROPERTY_EVENT_TYPE,
  Webhook.JSON_PROPERTY_FLAT_DATA
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-02T18:07:26.611352599Z[Etc/UTC]")
public class Webhook {
  public static final String JSON_PROPERTY_EVENT_TYPE = "eventType";
  private String eventType;

  public static final String JSON_PROPERTY_FLAT_DATA = "flatData";
  private String flatData;

  public Webhook() { 
  }

  public Webhook eventType(String eventType) {
    this.eventType = eventType;
    return this;
  }

   /**
   * Set of events that the merchant can receive.  Possible values: * order.pay    - Event notification when an order has been successfully paid by the buyer.
   * @return eventType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "order.pay", required = true, value = "Set of events that the merchant can receive.  Possible values: * order.pay    - Event notification when an order has been successfully paid by the buyer.")
  @JsonProperty(JSON_PROPERTY_EVENT_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getEventType() {
    return eventType;
  }


  @JsonProperty(JSON_PROPERTY_EVENT_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEventType(String eventType) {
    this.eventType = eventType;
  }


  public Webhook flatData(String flatData) {
    this.flatData = flatData;
    return this;
  }

   /**
   * Event data.  Possible values: * The Order object is to be received when the order.pay event is notified.
   * @return flatData
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "{\"version\":\"v1.1.0\",\"zenkiOrderId\":\"f325da2b8e3f476caa07e039406e72f0\",\"orderId\":\"f3359498592b\",\"cartId\":\"96a17044f0e3\",\"type\":\"MIXED\",\"countryCodeIso2\":\"MX\",\"status\":\"PENDING\",\"createdAt\":1667353629,\"shopper\":{\"id\":\"f3359498592b\",\"name\":\"Juanito\",\"phone\":\"442536789\",\"email\":\"juanito@gmail.com\"},\"breakdown\":{\"currencyCodeIso3\":\"USD\",\"totalItemsAmount\":200,\"shipmentAmount\":50,\"subtotalAmount\":250,\"taxesAmount\":10,\"localTaxesAmount\":1.6,\"importCosts\":0,\"discountAmount\":0,\"additionalCharges\":{\"donation\":1.1234},\"grandTotalAmount\":262.7234},\"paymentInfo\":{\"exchangeRate\":{\"from\":\"MXN\",\"to\":\"USD\",\"value\":20,\"amount\":50,\"timestamp\":1667353629},\"cryptoLove\":{\"discountPercentage\":1,\"discountAmount\":0.5,\"finalAmount\":49.5,\"currency\":\"USD\"},\"cryptoPayment\":{\"amount\":\"0.038282960887513325\",\"currency\":\"ETH\",\"blockchain\":\"BSC\",\"transactionHash\":\"0xee8a3a5eb2a972785b7a56320682bbb843c29409c60dec2d25dbd3eaff91cf26\",\"networkScanUrl\":\"https://etherscan.io/tx/0x3e86fd3c50dbf8e050124e28f33392ce4f4278a925d7c472b3e7ab12af0da115\"}},\"settlementInfo\":{\"cryptoSettlement\":{\"finalAmount\":\"49.4\",\"currency\":\"USDC\"}},\"items\":[{\"externalId\":\"e40dbc7450f6\",\"quantity\":2,\"price\":10.33,\"name\":\"Libreta\",\"description\":\"Libretaderayas\",\"type\":\"WITH_CARRIER\",\"thumbnailUrl\":\"https://cdn.tshirts.boutique/wp-content/uploads/2022/07/12213723/12100-105.jpg\",\"metadata\":{\"size\":\"L\",\"color\":\"red\"}}],\"metadata\":{\"trackingId\":\"5514a95b0882\"},\"dispute\":{\"status\":\"OPEN\",\"createdAt\":1667353629,\"resolutionRequestType\":\"REQUEST_CONCILIATED\",\"resolutionRequestAt\":1667353629},\"claim\":{\"reason\":\"Seacaboelinventario\",\"status\":\"OPEN\",\"createdAt\":1667353629},\"_links\":{\"refund\":{\"href\":\"https://api.zenki.fi/v1/pay/orders/f325da2b8e3f476caa07e039406e72f0/refunds/e40dbc7450f6\"}}}", required = true, value = "Event data.  Possible values: * The Order object is to be received when the order.pay event is notified.")
  @JsonProperty(JSON_PROPERTY_FLAT_DATA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getFlatData() {
    return flatData;
  }


  @JsonProperty(JSON_PROPERTY_FLAT_DATA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFlatData(String flatData) {
    this.flatData = flatData;
  }


  /**
   * Return true if this Webhook object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Webhook webhook = (Webhook) o;
    return Objects.equals(this.eventType, webhook.eventType) &&
        Objects.equals(this.flatData, webhook.flatData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventType, flatData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Webhook {\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    flatData: ").append(toIndentedString(flatData)).append("\n");
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

