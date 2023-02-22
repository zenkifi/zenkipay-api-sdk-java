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
import fi.zenki.zenkipay.api.model.CryptoPayment;
import fi.zenki.zenkipay.api.model.RefundFiatOriginalPayment;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Registered refund detail.
 */
@ApiModel(description = "Registered refund detail.")
@JsonPropertyOrder({
  Refund.JSON_PROPERTY_ZENKI_REFUND_ID,
  Refund.JSON_PROPERTY_REASON,
  Refund.JSON_PROPERTY_FIAT_ORIGINAL_PAYMENT,
  Refund.JSON_PROPERTY_CRYPTO_PAYMENT,
  Refund.JSON_PROPERTY_STATUS,
  Refund.JSON_PROPERTY_PLACED_AT
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-22T18:12:34.769213250Z[Etc/UTC]")
public class Refund {
  public static final String JSON_PROPERTY_ZENKI_REFUND_ID = "zenkiRefundId";
  private String zenkiRefundId;

  public static final String JSON_PROPERTY_REASON = "reason";
  private String reason;

  public static final String JSON_PROPERTY_FIAT_ORIGINAL_PAYMENT = "fiatOriginalPayment";
  private RefundFiatOriginalPayment fiatOriginalPayment;

  public static final String JSON_PROPERTY_CRYPTO_PAYMENT = "cryptoPayment";
  private CryptoPayment cryptoPayment;

  /**
   * Estado del reembolso  Posibles valroes: * PENDING         - Waiting for the refund to be applied. * AWAITING_REFUND - A first confirmation has been received by the blockchain network, it is waiting to have the required confirmations. * REFUNDED        - The product or service has been refunded to the buyer. * FAILED          - A problem has arisen when making the refund.
   */
  public enum StatusEnum {
    PENDING("PENDING"),
    
    AWAITING_REFUND("AWAITING_REFUND"),
    
    REFUNDED("REFUNDED"),
    
    FAILED("FAILED");

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

  public static final String JSON_PROPERTY_PLACED_AT = "placedAt";
  private Long placedAt;

  public Refund() { 
  }

  public Refund zenkiRefundId(String zenkiRefundId) {
    this.zenkiRefundId = zenkiRefundId;
    return this;
  }

   /**
   * Unique identifier of the refund generated by Zenkipay.
   * @return zenkiRefundId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "e40dbc7450f6", required = true, value = "Unique identifier of the refund generated by Zenkipay.")
  @JsonProperty(JSON_PROPERTY_ZENKI_REFUND_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getZenkiRefundId() {
    return zenkiRefundId;
  }


  @JsonProperty(JSON_PROPERTY_ZENKI_REFUND_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setZenkiRefundId(String zenkiRefundId) {
    this.zenkiRefundId = zenkiRefundId;
  }


  public Refund reason(String reason) {
    this.reason = reason;
    return this;
  }

   /**
   * Reason or reason for the refund.
   * @return reason
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "I no longer had it in inventory.", required = true, value = "Reason or reason for the refund.")
  @JsonProperty(JSON_PROPERTY_REASON)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getReason() {
    return reason;
  }


  @JsonProperty(JSON_PROPERTY_REASON)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setReason(String reason) {
    this.reason = reason;
  }


  public Refund fiatOriginalPayment(RefundFiatOriginalPayment fiatOriginalPayment) {
    this.fiatOriginalPayment = fiatOriginalPayment;
    return this;
  }

   /**
   * Get fiatOriginalPayment
   * @return fiatOriginalPayment
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_FIAT_ORIGINAL_PAYMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public RefundFiatOriginalPayment getFiatOriginalPayment() {
    return fiatOriginalPayment;
  }


  @JsonProperty(JSON_PROPERTY_FIAT_ORIGINAL_PAYMENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setFiatOriginalPayment(RefundFiatOriginalPayment fiatOriginalPayment) {
    this.fiatOriginalPayment = fiatOriginalPayment;
  }


  public Refund cryptoPayment(CryptoPayment cryptoPayment) {
    this.cryptoPayment = cryptoPayment;
    return this;
  }

   /**
   * Get cryptoPayment
   * @return cryptoPayment
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")
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


  public Refund status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Estado del reembolso  Posibles valroes: * PENDING         - Waiting for the refund to be applied. * AWAITING_REFUND - A first confirmation has been received by the blockchain network, it is waiting to have the required confirmations. * REFUNDED        - The product or service has been refunded to the buyer. * FAILED          - A problem has arisen when making the refund.
   * @return status
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "PENDING", required = true, value = "Estado del reembolso  Posibles valroes: * PENDING         - Waiting for the refund to be applied. * AWAITING_REFUND - A first confirmation has been received by the blockchain network, it is waiting to have the required confirmations. * REFUNDED        - The product or service has been refunded to the buyer. * FAILED          - A problem has arisen when making the refund.")
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


  public Refund placedAt(Long placedAt) {
    this.placedAt = placedAt;
    return this;
  }

   /**
   * Date and time when the merchant sent the refund to Zenkipay, in milliseconds and UTC format.        The Unix epoch (or Unix time or POSIX time or Unix timestamp) is the number of seconds elapsed since January 1, 1970 (midnight UTC/GMT), not counting leap seconds (in ISO 8601: 1970-01-01T00: 00:00Z)
   * minimum: 0
   * @return placedAt
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1667353629", required = true, value = "Date and time when the merchant sent the refund to Zenkipay, in milliseconds and UTC format.        The Unix epoch (or Unix time or POSIX time or Unix timestamp) is the number of seconds elapsed since January 1, 1970 (midnight UTC/GMT), not counting leap seconds (in ISO 8601: 1970-01-01T00: 00:00Z)")
  @JsonProperty(JSON_PROPERTY_PLACED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Long getPlacedAt() {
    return placedAt;
  }


  @JsonProperty(JSON_PROPERTY_PLACED_AT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPlacedAt(Long placedAt) {
    this.placedAt = placedAt;
  }


  /**
   * Return true if this Refund object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Refund refund = (Refund) o;
    return Objects.equals(this.zenkiRefundId, refund.zenkiRefundId) &&
        Objects.equals(this.reason, refund.reason) &&
        Objects.equals(this.fiatOriginalPayment, refund.fiatOriginalPayment) &&
        Objects.equals(this.cryptoPayment, refund.cryptoPayment) &&
        Objects.equals(this.status, refund.status) &&
        Objects.equals(this.placedAt, refund.placedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(zenkiRefundId, reason, fiatOriginalPayment, cryptoPayment, status, placedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Refund {\n");
    sb.append("    zenkiRefundId: ").append(toIndentedString(zenkiRefundId)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    fiatOriginalPayment: ").append(toIndentedString(fiatOriginalPayment)).append("\n");
    sb.append("    cryptoPayment: ").append(toIndentedString(cryptoPayment)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    placedAt: ").append(toIndentedString(placedAt)).append("\n");
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

