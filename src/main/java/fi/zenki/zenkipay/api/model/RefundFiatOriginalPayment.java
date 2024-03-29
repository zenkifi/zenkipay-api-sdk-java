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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * Original payment detail made by the buyer.
 */
@JsonPropertyOrder({
  RefundFiatOriginalPayment.JSON_PROPERTY_AMOUNT,
  RefundFiatOriginalPayment.JSON_PROPERTY_CURRENCY_CODE_ISO3
})
@JsonTypeName("Refund_fiatOriginalPayment")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-23T23:44:48.398245079Z[Etc/UTC]")
public class RefundFiatOriginalPayment {
  public static final String JSON_PROPERTY_AMOUNT = "amount";
  private Double amount;

  public static final String JSON_PROPERTY_CURRENCY_CODE_ISO3 = "currencyCodeIso3";
  private String currencyCodeIso3;

  public RefundFiatOriginalPayment() {
  }

  public RefundFiatOriginalPayment amount(Double amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * Refund amount, partial or total.
   * minimum: 0
   * @return amount
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Double getAmount() {
    return amount;
  }


  @JsonProperty(JSON_PROPERTY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAmount(Double amount) {
    this.amount = amount;
  }


  public RefundFiatOriginalPayment currencyCodeIso3(String currencyCodeIso3) {
    
    this.currencyCodeIso3 = currencyCodeIso3;
    return this;
  }

   /**
   * Unique identifier of the country currency, the definition of the ISO 4217 standard is used with 3 characters, see: https://es.wikipedia.org/wiki/ISO_4217 or https://www.iso.org/iso-4217-currency-codes.html
   * @return currencyCodeIso3
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CURRENCY_CODE_ISO3)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCurrencyCodeIso3() {
    return currencyCodeIso3;
  }


  @JsonProperty(JSON_PROPERTY_CURRENCY_CODE_ISO3)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCurrencyCodeIso3(String currencyCodeIso3) {
    this.currencyCodeIso3 = currencyCodeIso3;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RefundFiatOriginalPayment refundFiatOriginalPayment = (RefundFiatOriginalPayment) o;
    return Objects.equals(this.amount, refundFiatOriginalPayment.amount) &&
        Objects.equals(this.currencyCodeIso3, refundFiatOriginalPayment.currencyCodeIso3);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, currencyCodeIso3);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RefundFiatOriginalPayment {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    currencyCodeIso3: ").append(toIndentedString(currencyCodeIso3)).append("\n");
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

    // add `amount` to the URL query string
    if (getAmount() != null) {
      try {
        joiner.add(String.format("%samount%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAmount()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `currencyCodeIso3` to the URL query string
    if (getCurrencyCodeIso3() != null) {
      try {
        joiner.add(String.format("%scurrencyCodeIso3%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCurrencyCodeIso3()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

