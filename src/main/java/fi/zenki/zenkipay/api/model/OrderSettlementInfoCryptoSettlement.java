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
 * The payment detail to be made in cryptocurrency
 */
@ApiModel(description = "The payment detail to be made in cryptocurrency")
@JsonPropertyOrder({
  OrderSettlementInfoCryptoSettlement.JSON_PROPERTY_FINAL_AMOUNT,
  OrderSettlementInfoCryptoSettlement.JSON_PROPERTY_CURRENCY
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-01T01:12:47.231931203Z[Etc/UTC]")
public class OrderSettlementInfoCryptoSettlement {
  public static final String JSON_PROPERTY_FINAL_AMOUNT = "finalAmount";
  private String finalAmount;

  public static final String JSON_PROPERTY_CURRENCY = "currency";
  private String currency;

  public OrderSettlementInfoCryptoSettlement() { 
  }

  public OrderSettlementInfoCryptoSettlement finalAmount(String finalAmount) {
    this.finalAmount = finalAmount;
    return this;
  }

   /**
   * Amount paid in USD.
   * @return finalAmount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "49.4", required = true, value = "Amount paid in USD.")
  @JsonProperty(JSON_PROPERTY_FINAL_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getFinalAmount() {
    return finalAmount;
  }


  @JsonProperty(JSON_PROPERTY_FINAL_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFinalAmount(String finalAmount) {
    this.finalAmount = finalAmount;
  }


  public OrderSettlementInfoCryptoSettlement currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Cryptocurrency code see https://developer.zenki.fi/global-v1/docs/zenkipay-recursos-catalogos-criptomonedas-soportadas.
   * @return currency
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "USDC", required = true, value = "Cryptocurrency code see https://developer.zenki.fi/global-v1/docs/zenkipay-recursos-catalogos-criptomonedas-soportadas.")
  @JsonProperty(JSON_PROPERTY_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCurrency() {
    return currency;
  }


  @JsonProperty(JSON_PROPERTY_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCurrency(String currency) {
    this.currency = currency;
  }


  /**
   * Return true if this Order_settlementInfo_cryptoSettlement object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderSettlementInfoCryptoSettlement orderSettlementInfoCryptoSettlement = (OrderSettlementInfoCryptoSettlement) o;
    return Objects.equals(this.finalAmount, orderSettlementInfoCryptoSettlement.finalAmount) &&
        Objects.equals(this.currency, orderSettlementInfoCryptoSettlement.currency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(finalAmount, currency);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderSettlementInfoCryptoSettlement {\n");
    sb.append("    finalAmount: ").append(toIndentedString(finalAmount)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
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

