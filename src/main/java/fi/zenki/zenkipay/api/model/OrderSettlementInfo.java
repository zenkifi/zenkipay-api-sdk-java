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
import fi.zenki.zenkipay.api.model.OrderSettlementInfoCryptoSettlement;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * Order information for settlement to merchant
 */
@JsonPropertyOrder({
  OrderSettlementInfo.JSON_PROPERTY_CRYPTO_SETTLEMENT
})
@JsonTypeName("Order_settlementInfo")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-23T15:55:44.125730643Z[Etc/UTC]")
public class OrderSettlementInfo {
  public static final String JSON_PROPERTY_CRYPTO_SETTLEMENT = "cryptoSettlement";
  private OrderSettlementInfoCryptoSettlement cryptoSettlement;

  public OrderSettlementInfo() {
  }

  public OrderSettlementInfo cryptoSettlement(OrderSettlementInfoCryptoSettlement cryptoSettlement) {
    
    this.cryptoSettlement = cryptoSettlement;
    return this;
  }

   /**
   * Get cryptoSettlement
   * @return cryptoSettlement
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CRYPTO_SETTLEMENT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public OrderSettlementInfoCryptoSettlement getCryptoSettlement() {
    return cryptoSettlement;
  }


  @JsonProperty(JSON_PROPERTY_CRYPTO_SETTLEMENT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCryptoSettlement(OrderSettlementInfoCryptoSettlement cryptoSettlement) {
    this.cryptoSettlement = cryptoSettlement;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderSettlementInfo orderSettlementInfo = (OrderSettlementInfo) o;
    return Objects.equals(this.cryptoSettlement, orderSettlementInfo.cryptoSettlement);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cryptoSettlement);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderSettlementInfo {\n");
    sb.append("    cryptoSettlement: ").append(toIndentedString(cryptoSettlement)).append("\n");
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

    // add `cryptoSettlement` to the URL query string
    if (getCryptoSettlement() != null) {
      joiner.add(getCryptoSettlement().toUrlQueryString(prefix + "cryptoSettlement" + suffix));
    }

    return joiner.toString();
  }

}

