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
import fi.zenki.zenkipay.api.model.MerchantIntegrationConfigPluginsInner;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * Merchant integrations settings.
 */
@JsonPropertyOrder({
  MerchantIntegrationConfig.JSON_PROPERTY_PLUGINS
})
@JsonTypeName("Merchant_integrationConfig")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-23T23:28:05.340675397Z[Etc/UTC]")
public class MerchantIntegrationConfig {
  public static final String JSON_PROPERTY_PLUGINS = "plugins";
  private List<MerchantIntegrationConfigPluginsInner> plugins = new ArrayList<>();

  public MerchantIntegrationConfig() {
  }

  public MerchantIntegrationConfig plugins(List<MerchantIntegrationConfigPluginsInner> plugins) {
    
    this.plugins = plugins;
    return this;
  }

  public MerchantIntegrationConfig addPluginsItem(MerchantIntegrationConfigPluginsInner pluginsItem) {
    this.plugins.add(pluginsItem);
    return this;
  }

   /**
   * Configuration of each active plugin of the merchant.
   * @return plugins
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_PLUGINS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<MerchantIntegrationConfigPluginsInner> getPlugins() {
    return plugins;
  }


  @JsonProperty(JSON_PROPERTY_PLUGINS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setPlugins(List<MerchantIntegrationConfigPluginsInner> plugins) {
    this.plugins = plugins;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MerchantIntegrationConfig merchantIntegrationConfig = (MerchantIntegrationConfig) o;
    return Objects.equals(this.plugins, merchantIntegrationConfig.plugins);
  }

  @Override
  public int hashCode() {
    return Objects.hash(plugins);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MerchantIntegrationConfig {\n");
    sb.append("    plugins: ").append(toIndentedString(plugins)).append("\n");
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

    // add `plugins` to the URL query string
    if (getPlugins() != null) {
      for (int i = 0; i < getPlugins().size(); i++) {
        if (getPlugins().get(i) != null) {
          joiner.add(getPlugins().get(i).toUrlQueryString(String.format("%splugins%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    return joiner.toString();
  }

}

