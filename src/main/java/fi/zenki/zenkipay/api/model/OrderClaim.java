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
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Claim process detail, when a payment is made and Zenkipay cannot identify it and associate it with the payment order.
 */
@ApiModel(description = "Claim process detail, when a payment is made and Zenkipay cannot identify it and associate it with the payment order.")
@JsonPropertyOrder({
  OrderClaim.JSON_PROPERTY_REASON,
  OrderClaim.JSON_PROPERTY_STATUS,
  OrderClaim.JSON_PROPERTY_CREATED_AT
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-31T20:18:42.139375889Z[Etc/UTC]")
public class OrderClaim {
  public static final String JSON_PROPERTY_REASON = "reason";
  private JsonNullable<String> reason = JsonNullable.<String>undefined();

  /**
   * Claim current status.      Possible values: * OPEN     - The claim process has started. * REFUND   - The claim process has been closed and a partial or full refund of the full amount of the order has been made. * RESOLVED - The claim process has been closed without making any reimbursement movement to the buyer, only the payment transaction is associated with the indicated order. * REJECTED - When the claim does not apply, because it tries to associate a payment that does not match the transaction data.
   */
  public enum StatusEnum {
    OPEN("OPEN"),
    
    REFUND("REFUND"),
    
    RESOLVED("RESOLVED"),
    
    REJECTED("REJECTED");

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

  public OrderClaim() { 
  }

  public OrderClaim reason(String reason) {
    this.reason = JsonNullable.<String>of(reason);
    return this;
  }

   /**
   * Reason for filing the claim.
   * @return reason
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Out of inventory.", value = "Reason for filing the claim.")
  @JsonIgnore

  public String getReason() {
        return reason.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_REASON)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getReason_JsonNullable() {
    return reason;
  }
  
  @JsonProperty(JSON_PROPERTY_REASON)
  public void setReason_JsonNullable(JsonNullable<String> reason) {
    this.reason = reason;
  }

  public void setReason(String reason) {
    this.reason = JsonNullable.<String>of(reason);
  }


  public OrderClaim status(StatusEnum status) {
    this.status = status;
    return this;
  }

   /**
   * Claim current status.      Possible values: * OPEN     - The claim process has started. * REFUND   - The claim process has been closed and a partial or full refund of the full amount of the order has been made. * RESOLVED - The claim process has been closed without making any reimbursement movement to the buyer, only the payment transaction is associated with the indicated order. * REJECTED - When the claim does not apply, because it tries to associate a payment that does not match the transaction data.
   * @return status
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "OPEN", required = true, value = "Claim current status.      Possible values: * OPEN     - The claim process has started. * REFUND   - The claim process has been closed and a partial or full refund of the full amount of the order has been made. * RESOLVED - The claim process has been closed without making any reimbursement movement to the buyer, only the payment transaction is associated with the indicated order. * REJECTED - When the claim does not apply, because it tries to associate a payment that does not match the transaction data.")
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


  public OrderClaim createdAt(Long createdAt) {
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Date and time the clearing started, in milliseconds and UTC format.      The Unix epoch (or Unix time or POSIX time or Unix timestamp) is the number of seconds elapsed since January 1, 1970 (midnight UTC/GMT), not counting leap seconds (in ISO 8601: 1970-01-01T00: 00:00Z)
   * minimum: 0
   * @return createdAt
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1667353629", required = true, value = "Date and time the clearing started, in milliseconds and UTC format.      The Unix epoch (or Unix time or POSIX time or Unix timestamp) is the number of seconds elapsed since January 1, 1970 (midnight UTC/GMT), not counting leap seconds (in ISO 8601: 1970-01-01T00: 00:00Z)")
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


  /**
   * Return true if this Order_claim object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderClaim orderClaim = (OrderClaim) o;
    return equalsNullable(this.reason, orderClaim.reason) &&
        Objects.equals(this.status, orderClaim.status) &&
        Objects.equals(this.createdAt, orderClaim.createdAt);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(hashCodeNullable(reason), status, createdAt);
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
    sb.append("class OrderClaim {\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
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

