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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Summary of the exchange rate used for payment, from local currency to USD
 */
@ApiModel(description = "Summary of the exchange rate used for payment, from local currency to USD")
@JsonPropertyOrder({
  OrderPaymentInfoExchangeRate.JSON_PROPERTY_FROM,
  OrderPaymentInfoExchangeRate.JSON_PROPERTY_TO,
  OrderPaymentInfoExchangeRate.JSON_PROPERTY_VALUE,
  OrderPaymentInfoExchangeRate.JSON_PROPERTY_AMOUNT,
  OrderPaymentInfoExchangeRate.JSON_PROPERTY_TIMESTAMP
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-01T00:26:58.566269780Z[Etc/UTC]")
public class OrderPaymentInfoExchangeRate {
  public static final String JSON_PROPERTY_FROM = "from";
  private String from;

  public static final String JSON_PROPERTY_TO = "to";
  private String to;

  public static final String JSON_PROPERTY_VALUE = "value";
  private Double value;

  public static final String JSON_PROPERTY_AMOUNT = "amount";
  private Double amount;

  public static final String JSON_PROPERTY_TIMESTAMP = "timestamp";
  private Long timestamp;

  public OrderPaymentInfoExchangeRate() { 
  }

  public OrderPaymentInfoExchangeRate from(String from) {
    this.from = from;
    return this;
  }

   /**
   * Unique currency code of the country that is reported in the order, the ISO 4217 standard definition with 3 characters is used, see:https://es.wikipedia.org/wiki/ISO_4217 or https://www.iso.org/iso-4217-currency-codes.html
   * @return from
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "MXN", required = true, value = "Unique currency code of the country that is reported in the order, the ISO 4217 standard definition with 3 characters is used, see:https://es.wikipedia.org/wiki/ISO_4217 or https://www.iso.org/iso-4217-currency-codes.html")
  @JsonProperty(JSON_PROPERTY_FROM)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getFrom() {
    return from;
  }


  @JsonProperty(JSON_PROPERTY_FROM)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setFrom(String from) {
    this.from = from;
  }


  public OrderPaymentInfoExchangeRate to(String to) {
    this.to = to;
    return this;
  }

   /**
   * Unique currency code of the country which is used to settle the merchant always in USD, the ISO 4217 standard definition is used with 3 characters, see: https://es.wikipedia.org/wiki/ISO_4217 or https://www.iso.org/iso-4217-currency-codes.html
   * @return to
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "USD", required = true, value = "Unique currency code of the country which is used to settle the merchant always in USD, the ISO 4217 standard definition is used with 3 characters, see: https://es.wikipedia.org/wiki/ISO_4217 or https://www.iso.org/iso-4217-currency-codes.html")
  @JsonProperty(JSON_PROPERTY_TO)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getTo() {
    return to;
  }


  @JsonProperty(JSON_PROPERTY_TO)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTo(String to) {
    this.to = to;
  }


  public OrderPaymentInfoExchangeRate value(Double value) {
    this.value = value;
    return this;
  }

   /**
   * Value of the exchange rate used to convert between local currency and USD.
   * minimum: 0
   * @return value
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "20.0", required = true, value = "Value of the exchange rate used to convert between local currency and USD.")
  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Double getValue() {
    return value;
  }


  @JsonProperty(JSON_PROPERTY_VALUE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setValue(Double value) {
    this.value = value;
  }


  public OrderPaymentInfoExchangeRate amount(Double amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Amount paid in USD.
   * minimum: 0
   * @return amount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "50.0", value = "Amount paid in USD.")
  @JsonProperty(JSON_PROPERTY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Double getAmount() {
    return amount;
  }


  @JsonProperty(JSON_PROPERTY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAmount(Double amount) {
    this.amount = amount;
  }


  public OrderPaymentInfoExchangeRate timestamp(Long timestamp) {
    this.timestamp = timestamp;
    return this;
  }

   /**
   * Date and time in which the purchase and sale of the cryptocurrency was made, in milliseconds and UTC format.  The Unix epoch (or Unix time or POSIX time or Unix timestamp) is the number of seconds elapsed since January 1, 1970 (midnight UTC/GMT), not counting leap seconds (in ISO 8601: 1970-01-01T00: 00:00Z)
   * minimum: 0
   * @return timestamp
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1667353629", required = true, value = "Date and time in which the purchase and sale of the cryptocurrency was made, in milliseconds and UTC format.  The Unix epoch (or Unix time or POSIX time or Unix timestamp) is the number of seconds elapsed since January 1, 1970 (midnight UTC/GMT), not counting leap seconds (in ISO 8601: 1970-01-01T00: 00:00Z)")
  @JsonProperty(JSON_PROPERTY_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getTimestamp() {
    return timestamp;
  }


  @JsonProperty(JSON_PROPERTY_TIMESTAMP)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTimestamp(Long timestamp) {
    this.timestamp = timestamp;
  }


  /**
   * Return true if this Order_paymentInfo_exchangeRate object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderPaymentInfoExchangeRate orderPaymentInfoExchangeRate = (OrderPaymentInfoExchangeRate) o;
    return Objects.equals(this.from, orderPaymentInfoExchangeRate.from) &&
        Objects.equals(this.to, orderPaymentInfoExchangeRate.to) &&
        Objects.equals(this.value, orderPaymentInfoExchangeRate.value) &&
        Objects.equals(this.amount, orderPaymentInfoExchangeRate.amount) &&
        Objects.equals(this.timestamp, orderPaymentInfoExchangeRate.timestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(from, to, value, amount, timestamp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderPaymentInfoExchangeRate {\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
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

