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
 * Summary of the discount made to the purchase for the use of crypto love.
 */
@ApiModel(description = "Summary of the discount made to the purchase for the use of crypto love.")
@JsonPropertyOrder({
  OrderPaymentInfoCryptoLove.JSON_PROPERTY_DISCOUNT_PERCENTAGE,
  OrderPaymentInfoCryptoLove.JSON_PROPERTY_DISCOUNT_AMOUNT,
  OrderPaymentInfoCryptoLove.JSON_PROPERTY_FINAL_AMOUNT,
  OrderPaymentInfoCryptoLove.JSON_PROPERTY_CURRENCY
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-31T22:18:32.231258754Z[Etc/UTC]")
public class OrderPaymentInfoCryptoLove {
  public static final String JSON_PROPERTY_DISCOUNT_PERCENTAGE = "discountPercentage";
  private Double discountPercentage;

  public static final String JSON_PROPERTY_DISCOUNT_AMOUNT = "discountAmount";
  private Double discountAmount;

  public static final String JSON_PROPERTY_FINAL_AMOUNT = "finalAmount";
  private Double finalAmount;

  public static final String JSON_PROPERTY_CURRENCY = "currency";
  private String currency;

  public OrderPaymentInfoCryptoLove() { 
  }

  public OrderPaymentInfoCryptoLove discountPercentage(Double discountPercentage) {
    this.discountPercentage = discountPercentage;
    return this;
  }

   /**
   * Discount in percentage granted by the merchant to the buyer in his purchase for activating crypto love.
   * minimum: 0
   * maximum: 100
   * @return discountPercentage
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1", required = true, value = "Discount in percentage granted by the merchant to the buyer in his purchase for activating crypto love.")
  @JsonProperty(JSON_PROPERTY_DISCOUNT_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Double getDiscountPercentage() {
    return discountPercentage;
  }


  @JsonProperty(JSON_PROPERTY_DISCOUNT_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDiscountPercentage(Double discountPercentage) {
    this.discountPercentage = discountPercentage;
  }


  public OrderPaymentInfoCryptoLove discountAmount(Double discountAmount) {
    this.discountAmount = discountAmount;
    return this;
  }

   /**
   * Discount in amount granted by the merchant to the buyer in his purchase for activating crypto love in USD.
   * minimum: 0
   * @return discountAmount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "0.5", required = true, value = "Discount in amount granted by the merchant to the buyer in his purchase for activating crypto love in USD.")
  @JsonProperty(JSON_PROPERTY_DISCOUNT_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Double getDiscountAmount() {
    return discountAmount;
  }


  @JsonProperty(JSON_PROPERTY_DISCOUNT_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setDiscountAmount(Double discountAmount) {
    this.discountAmount = discountAmount;
  }


  public OrderPaymentInfoCryptoLove finalAmount(Double finalAmount) {
    this.finalAmount = finalAmount;
    return this;
  }

   /**
   * Payment amount after discount in USD.
   * minimum: 0
   * @return finalAmount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "49.5", required = true, value = "Payment amount after discount in USD.")
  @JsonProperty(JSON_PROPERTY_FINAL_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Double getFinalAmount() {
    return finalAmount;
  }


  @JsonProperty(JSON_PROPERTY_FINAL_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFinalAmount(Double finalAmount) {
    this.finalAmount = finalAmount;
  }


  public OrderPaymentInfoCryptoLove currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Unique currency code of the country which is used to settle the merchant always in USD, the ISO 4217 standard definition is used with 3 characters, see: https://es.wikipedia.org/wiki/ISO_4217 o https://www.iso.org/iso-4217-currency-codes.html
   * @return currency
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "USD", required = true, value = "Unique currency code of the country which is used to settle the merchant always in USD, the ISO 4217 standard definition is used with 3 characters, see: https://es.wikipedia.org/wiki/ISO_4217 o https://www.iso.org/iso-4217-currency-codes.html")
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
   * Return true if this Order_paymentInfo_cryptoLove object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderPaymentInfoCryptoLove orderPaymentInfoCryptoLove = (OrderPaymentInfoCryptoLove) o;
    return Objects.equals(this.discountPercentage, orderPaymentInfoCryptoLove.discountPercentage) &&
        Objects.equals(this.discountAmount, orderPaymentInfoCryptoLove.discountAmount) &&
        Objects.equals(this.finalAmount, orderPaymentInfoCryptoLove.finalAmount) &&
        Objects.equals(this.currency, orderPaymentInfoCryptoLove.currency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(discountPercentage, discountAmount, finalAmount, currency);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderPaymentInfoCryptoLove {\n");
    sb.append("    discountPercentage: ").append(toIndentedString(discountPercentage)).append("\n");
    sb.append("    discountAmount: ").append(toIndentedString(discountAmount)).append("\n");
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

