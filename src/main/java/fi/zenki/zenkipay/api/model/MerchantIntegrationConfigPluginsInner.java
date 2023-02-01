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
 * Configuration of an active plugin.
 */
@ApiModel(description = "Configuration of an active plugin.")
@JsonPropertyOrder({
  MerchantIntegrationConfigPluginsInner.JSON_PROPERTY_NAME,
  MerchantIntegrationConfigPluginsInner.JSON_PROPERTY_CLIENT_ID
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-01T00:51:20.972501716Z[Etc/UTC]")
public class MerchantIntegrationConfigPluginsInner {
  /**
   * Active plugin name.  Posibles valores: * SCRIPT      - Integration through Zenkipay API. * WOOCOMMERCE - Integration through the WooCommerce plugin. * BIGCOMMERCE - Integration through the BigCommerce plugin. * MAGENTO     - Integration through the Magento plugin. * ECWID       - Integration through the ECWID plugin. * SHOPIFY     - Integration through the Shopify plugin. * VTEX        - Integration through the VTEX plugin. * ANGULAR     - Integration through the Angular Front-End library. * REACT       - Integration through the React Front-End library. * VUEJS       - Integration through the VUE JS Front-End library. * PRESTASHOP  - Integration through the Prestashop plugin.
   */
  public enum NameEnum {
    SCRIPT("SCRIPT"),
    
    WOOCOMMERCE("WOOCOMMERCE"),
    
    BIGCOMMERCE("BIGCOMMERCE"),
    
    MAGENTO("MAGENTO"),
    
    ECWID("ECWID"),
    
    SHOPIFY("SHOPIFY"),
    
    VTEX("VTEX"),
    
    ANGULAR("ANGULAR"),
    
    REACT("REACT"),
    
    VUEJS("VUEJS"),
    
    PRESTASHOP("PRESTASHOP");

    private String value;

    NameEnum(String value) {
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
    public static NameEnum fromValue(String value) {
      for (NameEnum b : NameEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_NAME = "name";
  private NameEnum name;

  public static final String JSON_PROPERTY_CLIENT_ID = "clientId";
  private String clientId;

  public MerchantIntegrationConfigPluginsInner() { 
  }

  public MerchantIntegrationConfigPluginsInner name(NameEnum name) {
    this.name = name;
    return this;
  }

   /**
   * Active plugin name.  Posibles valores: * SCRIPT      - Integration through Zenkipay API. * WOOCOMMERCE - Integration through the WooCommerce plugin. * BIGCOMMERCE - Integration through the BigCommerce plugin. * MAGENTO     - Integration through the Magento plugin. * ECWID       - Integration through the ECWID plugin. * SHOPIFY     - Integration through the Shopify plugin. * VTEX        - Integration through the VTEX plugin. * ANGULAR     - Integration through the Angular Front-End library. * REACT       - Integration through the React Front-End library. * VUEJS       - Integration through the VUE JS Front-End library. * PRESTASHOP  - Integration through the Prestashop plugin.
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "SCRIPT", required = true, value = "Active plugin name.  Posibles valores: * SCRIPT      - Integration through Zenkipay API. * WOOCOMMERCE - Integration through the WooCommerce plugin. * BIGCOMMERCE - Integration through the BigCommerce plugin. * MAGENTO     - Integration through the Magento plugin. * ECWID       - Integration through the ECWID plugin. * SHOPIFY     - Integration through the Shopify plugin. * VTEX        - Integration through the VTEX plugin. * ANGULAR     - Integration through the Angular Front-End library. * REACT       - Integration through the React Front-End library. * VUEJS       - Integration through the VUE JS Front-End library. * PRESTASHOP  - Integration through the Prestashop plugin.")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public NameEnum getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setName(NameEnum name) {
    this.name = name;
  }


  public MerchantIntegrationConfigPluginsInner clientId(String clientId) {
    this.clientId = clientId;
    return this;
  }

   /**
   * Active plugin key.
   * @return clientId
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "b6026f861fd41a94c3389d54293de9d04bde6f7c", required = true, value = "Active plugin key.")
  @JsonProperty(JSON_PROPERTY_CLIENT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getClientId() {
    return clientId;
  }


  @JsonProperty(JSON_PROPERTY_CLIENT_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setClientId(String clientId) {
    this.clientId = clientId;
  }


  /**
   * Return true if this Merchant_integrationConfig_plugins_inner object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MerchantIntegrationConfigPluginsInner merchantIntegrationConfigPluginsInner = (MerchantIntegrationConfigPluginsInner) o;
    return Objects.equals(this.name, merchantIntegrationConfigPluginsInner.name) &&
        Objects.equals(this.clientId, merchantIntegrationConfigPluginsInner.clientId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, clientId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MerchantIntegrationConfigPluginsInner {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
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

