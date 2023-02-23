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
import fi.zenki.zenkipay.api.model.CryptoPayment;
import fi.zenki.zenkipay.api.model.OrderPaymentInfoCryptoLove;
import fi.zenki.zenkipay.api.model.OrderPaymentInfoExchangeRate;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * Payment information
 */
@JsonPropertyOrder({
  OrderPaymentInfo.JSON_PROPERTY_EXCHANGE_RATE,
  OrderPaymentInfo.JSON_PROPERTY_CRYPTO_LOVE,
  OrderPaymentInfo.JSON_PROPERTY_CRYPTO_PAYMENT
})
@JsonTypeName("Order_paymentInfo")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-23T23:19:43.293151248Z[Etc/UTC]")
public class OrderPaymentInfo {
  public static final String JSON_PROPERTY_EXCHANGE_RATE = "exchangeRate";
  private OrderPaymentInfoExchangeRate exchangeRate;

  public static final String JSON_PROPERTY_CRYPTO_LOVE = "cryptoLove";
  private OrderPaymentInfoCryptoLove cryptoLove;

  public static final String JSON_PROPERTY_CRYPTO_PAYMENT = "cryptoPayment";
  private CryptoPayment cryptoPayment;

  public OrderPaymentInfo() {
  }

  public OrderPaymentInfo exchangeRate(OrderPaymentInfoExchangeRate exchangeRate) {
    
    this.exchangeRate = exchangeRate;
    return this;
  }

   /**
   * Get exchangeRate
   * @return exchangeRate
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_EXCHANGE_RATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public OrderPaymentInfoExchangeRate getExchangeRate() {
    return exchangeRate;
  }


  @JsonProperty(JSON_PROPERTY_EXCHANGE_RATE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setExchangeRate(OrderPaymentInfoExchangeRate exchangeRate) {
    this.exchangeRate = exchangeRate;
  }


  public OrderPaymentInfo cryptoLove(OrderPaymentInfoCryptoLove cryptoLove) {
    
    this.cryptoLove = cryptoLove;
    return this;
  }

   /**
   * Get cryptoLove
   * @return cryptoLove
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CRYPTO_LOVE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public OrderPaymentInfoCryptoLove getCryptoLove() {
    return cryptoLove;
  }


  @JsonProperty(JSON_PROPERTY_CRYPTO_LOVE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCryptoLove(OrderPaymentInfoCryptoLove cryptoLove) {
    this.cryptoLove = cryptoLove;
  }


  public OrderPaymentInfo cryptoPayment(CryptoPayment cryptoPayment) {
    
    this.cryptoPayment = cryptoPayment;
    return this;
  }

   /**
   * Get cryptoPayment
   * @return cryptoPayment
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CRYPTO_PAYMENT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public CryptoPayment getCryptoPayment() {
    return cryptoPayment;
  }


  @JsonProperty(JSON_PROPERTY_CRYPTO_PAYMENT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCryptoPayment(CryptoPayment cryptoPayment) {
    this.cryptoPayment = cryptoPayment;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderPaymentInfo orderPaymentInfo = (OrderPaymentInfo) o;
    return Objects.equals(this.exchangeRate, orderPaymentInfo.exchangeRate) &&
        Objects.equals(this.cryptoLove, orderPaymentInfo.cryptoLove) &&
        Objects.equals(this.cryptoPayment, orderPaymentInfo.cryptoPayment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exchangeRate, cryptoLove, cryptoPayment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderPaymentInfo {\n");
    sb.append("    exchangeRate: ").append(toIndentedString(exchangeRate)).append("\n");
    sb.append("    cryptoLove: ").append(toIndentedString(cryptoLove)).append("\n");
    sb.append("    cryptoPayment: ").append(toIndentedString(cryptoPayment)).append("\n");
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

    // add `exchangeRate` to the URL query string
    if (getExchangeRate() != null) {
      joiner.add(getExchangeRate().toUrlQueryString(prefix + "exchangeRate" + suffix));
    }

    // add `cryptoLove` to the URL query string
    if (getCryptoLove() != null) {
      joiner.add(getCryptoLove().toUrlQueryString(prefix + "cryptoLove" + suffix));
    }

    // add `cryptoPayment` to the URL query string
    if (getCryptoPayment() != null) {
      joiner.add(getCryptoPayment().toUrlQueryString(prefix + "cryptoPayment" + suffix));
    }

    return joiner.toString();
  }

}

