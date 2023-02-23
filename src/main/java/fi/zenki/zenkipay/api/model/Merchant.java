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
import fi.zenki.zenkipay.api.model.MerchantCryptoAssetsInner;
import fi.zenki.zenkipay.api.model.MerchantEscrowConfig;
import fi.zenki.zenkipay.api.model.MerchantIntegrationConfig;
import fi.zenki.zenkipay.api.model.MerchantMerchantInfo;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.StringJoiner;

/**
 * Merchant information.
 */
@JsonPropertyOrder({
  Merchant.JSON_PROPERTY_MERCHANT_INFO,
  Merchant.JSON_PROPERTY_INTEGRATION_CONFIG,
  Merchant.JSON_PROPERTY_CRYPTO_LOVE_PERCENTAGE,
  Merchant.JSON_PROPERTY_CRYPTO_ASSETS,
  Merchant.JSON_PROPERTY_ESCROW_CONFIG
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-23T23:11:11.907534644Z[Etc/UTC]")
public class Merchant {
  public static final String JSON_PROPERTY_MERCHANT_INFO = "merchantInfo";
  private MerchantMerchantInfo merchantInfo;

  public static final String JSON_PROPERTY_INTEGRATION_CONFIG = "integrationConfig";
  private MerchantIntegrationConfig integrationConfig;

  public static final String JSON_PROPERTY_CRYPTO_LOVE_PERCENTAGE = "cryptoLovePercentage";
  private Double cryptoLovePercentage;

  public static final String JSON_PROPERTY_CRYPTO_ASSETS = "cryptoAssets";
  private List<MerchantCryptoAssetsInner> cryptoAssets = new ArrayList<>();

  public static final String JSON_PROPERTY_ESCROW_CONFIG = "escrowConfig";
  private MerchantEscrowConfig escrowConfig;

  public Merchant() {
  }

  public Merchant merchantInfo(MerchantMerchantInfo merchantInfo) {
    
    this.merchantInfo = merchantInfo;
    return this;
  }

   /**
   * Get merchantInfo
   * @return merchantInfo
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_MERCHANT_INFO)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public MerchantMerchantInfo getMerchantInfo() {
    return merchantInfo;
  }


  @JsonProperty(JSON_PROPERTY_MERCHANT_INFO)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setMerchantInfo(MerchantMerchantInfo merchantInfo) {
    this.merchantInfo = merchantInfo;
  }


  public Merchant integrationConfig(MerchantIntegrationConfig integrationConfig) {
    
    this.integrationConfig = integrationConfig;
    return this;
  }

   /**
   * Get integrationConfig
   * @return integrationConfig
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_INTEGRATION_CONFIG)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public MerchantIntegrationConfig getIntegrationConfig() {
    return integrationConfig;
  }


  @JsonProperty(JSON_PROPERTY_INTEGRATION_CONFIG)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIntegrationConfig(MerchantIntegrationConfig integrationConfig) {
    this.integrationConfig = integrationConfig;
  }


  public Merchant cryptoLovePercentage(Double cryptoLovePercentage) {
    
    this.cryptoLovePercentage = cryptoLovePercentage;
    return this;
  }

   /**
   * Discount in percentage granted by the merchant to the buyer in his purchase for activating crypto love.
   * minimum: 0
   * maximum: 100
   * @return cryptoLovePercentage
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_CRYPTO_LOVE_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Double getCryptoLovePercentage() {
    return cryptoLovePercentage;
  }


  @JsonProperty(JSON_PROPERTY_CRYPTO_LOVE_PERCENTAGE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCryptoLovePercentage(Double cryptoLovePercentage) {
    this.cryptoLovePercentage = cryptoLovePercentage;
  }


  public Merchant cryptoAssets(List<MerchantCryptoAssetsInner> cryptoAssets) {
    
    this.cryptoAssets = cryptoAssets;
    return this;
  }

  public Merchant addCryptoAssetsItem(MerchantCryptoAssetsInner cryptoAssetsItem) {
    if (this.cryptoAssets == null) {
      this.cryptoAssets = new ArrayList<>();
    }
    this.cryptoAssets.add(cryptoAssetsItem);
    return this;
  }

   /**
   * Supported crypto currencies list.
   * @return cryptoAssets
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CRYPTO_ASSETS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public List<MerchantCryptoAssetsInner> getCryptoAssets() {
    return cryptoAssets;
  }


  @JsonProperty(JSON_PROPERTY_CRYPTO_ASSETS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCryptoAssets(List<MerchantCryptoAssetsInner> cryptoAssets) {
    this.cryptoAssets = cryptoAssets;
  }


  public Merchant escrowConfig(MerchantEscrowConfig escrowConfig) {
    
    this.escrowConfig = escrowConfig;
    return this;
  }

   /**
   * Get escrowConfig
   * @return escrowConfig
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ESCROW_CONFIG)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public MerchantEscrowConfig getEscrowConfig() {
    return escrowConfig;
  }


  @JsonProperty(JSON_PROPERTY_ESCROW_CONFIG)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setEscrowConfig(MerchantEscrowConfig escrowConfig) {
    this.escrowConfig = escrowConfig;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Merchant merchant = (Merchant) o;
    return Objects.equals(this.merchantInfo, merchant.merchantInfo) &&
        Objects.equals(this.integrationConfig, merchant.integrationConfig) &&
        Objects.equals(this.cryptoLovePercentage, merchant.cryptoLovePercentage) &&
        Objects.equals(this.cryptoAssets, merchant.cryptoAssets) &&
        Objects.equals(this.escrowConfig, merchant.escrowConfig);
  }

  @Override
  public int hashCode() {
    return Objects.hash(merchantInfo, integrationConfig, cryptoLovePercentage, cryptoAssets, escrowConfig);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Merchant {\n");
    sb.append("    merchantInfo: ").append(toIndentedString(merchantInfo)).append("\n");
    sb.append("    integrationConfig: ").append(toIndentedString(integrationConfig)).append("\n");
    sb.append("    cryptoLovePercentage: ").append(toIndentedString(cryptoLovePercentage)).append("\n");
    sb.append("    cryptoAssets: ").append(toIndentedString(cryptoAssets)).append("\n");
    sb.append("    escrowConfig: ").append(toIndentedString(escrowConfig)).append("\n");
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

    // add `merchantInfo` to the URL query string
    if (getMerchantInfo() != null) {
      joiner.add(getMerchantInfo().toUrlQueryString(prefix + "merchantInfo" + suffix));
    }

    // add `integrationConfig` to the URL query string
    if (getIntegrationConfig() != null) {
      joiner.add(getIntegrationConfig().toUrlQueryString(prefix + "integrationConfig" + suffix));
    }

    // add `cryptoLovePercentage` to the URL query string
    if (getCryptoLovePercentage() != null) {
      try {
        joiner.add(String.format("%scryptoLovePercentage%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCryptoLovePercentage()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `cryptoAssets` to the URL query string
    if (getCryptoAssets() != null) {
      for (int i = 0; i < getCryptoAssets().size(); i++) {
        if (getCryptoAssets().get(i) != null) {
          joiner.add(getCryptoAssets().get(i).toUrlQueryString(String.format("%scryptoAssets%s%s", prefix, suffix,
              "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `escrowConfig` to the URL query string
    if (getEscrowConfig() != null) {
      joiner.add(getEscrowConfig().toUrlQueryString(prefix + "escrowConfig" + suffix));
    }

    return joiner.toString();
  }

}

