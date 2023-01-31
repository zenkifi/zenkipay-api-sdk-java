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
import fi.zenki.zenkipay.api.model.OrderLinksRefund;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * List of resources related to the order. The standards used to operate under the HATEOAS model are: https://stateless.group/hal_specification.html, https://datatracker.ietf.org/doc/html/draft-kelly-json-hal and https://www.rfc-editor.org/rfc/rfc8288  The currently supported resources to return within the _link property are: * refund - Returns the refund URI if it exists for the order.
 */
@ApiModel(description = "List of resources related to the order. The standards used to operate under the HATEOAS model are: https://stateless.group/hal_specification.html, https://datatracker.ietf.org/doc/html/draft-kelly-json-hal and https://www.rfc-editor.org/rfc/rfc8288  The currently supported resources to return within the _link property are: * refund - Returns the refund URI if it exists for the order.")
@JsonPropertyOrder({
  OrderLinks.JSON_PROPERTY_REFUND
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-31T20:39:41.344640444Z[Etc/UTC]")
public class OrderLinks {
  public static final String JSON_PROPERTY_REFUND = "refund";
  private OrderLinksRefund refund;

  public OrderLinks() { 
  }

  public OrderLinks refund(OrderLinksRefund refund) {
    this.refund = refund;
    return this;
  }

   /**
   * Get refund
   * @return refund
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")
  @JsonProperty(JSON_PROPERTY_REFUND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OrderLinksRefund getRefund() {
    return refund;
  }


  @JsonProperty(JSON_PROPERTY_REFUND)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRefund(OrderLinksRefund refund) {
    this.refund = refund;
  }


  /**
   * Return true if this Order__links object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderLinks orderLinks = (OrderLinks) o;
    return Objects.equals(this.refund, orderLinks.refund);
  }

  @Override
  public int hashCode() {
    return Objects.hash(refund);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderLinks {\n");
    sb.append("    refund: ").append(toIndentedString(refund)).append("\n");
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

