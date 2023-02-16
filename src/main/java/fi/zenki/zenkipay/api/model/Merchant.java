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
import fi.zenki.zenkipay.api.model.MerchantCryptoAssetsInner;
import fi.zenki.zenkipay.api.model.MerchantEscrowConfig;
import fi.zenki.zenkipay.api.model.MerchantIntegrationConfig;
import fi.zenki.zenkipay.api.model.MerchantMerchantInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Merchant information.
 */
@ApiModel(description = "Merchant information.")
@JsonPropertyOrder({
  Merchant.JSON_PROPERTY_MERCHANT_INFO,
  Merchant.JSON_PROPERTY_INTEGRATION_CONFIG,
  Merchant.JSON_PROPERTY_CRYPTO_LOVE_PERCENTAGE,
  Merchant.JSON_PROPERTY_CRYPTO_ASSETS,
  Merchant.JSON_PROPERTY_ESCROW_CONFIG
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-16T14:33:03.876626539Z[Etc/UTC]")
public class Merchant {
  public static final String JSON_PROPERTY_MERCHANT_INFO = "merchantInfo";
  private MerchantMerchantInfo merchantInfo;

  public static final String JSON_PROPERTY_INTEGRATION_CONFIG = "integrationConfig";
  private MerchantIntegrationConfig integrationConfig;

  public static final String JSON_PROPERTY_CRYPTO_LOVE_PERCENTAGE = "cryptoLovePercentage";
  private Double cryptoLovePercentage;

  public static final String JSON_PROPERTY_CRYPTO_ASSETS = "cryptoAssets";
  private List<MerchantCryptoAssetsInner> cryptoAssets = null;

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
  @ApiModelProperty(required = true, value = "")
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
  @ApiModelProperty(required = true, value = "")
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
  @ApiModelProperty(example = "1", required = true, value = "Discount in percentage granted by the merchant to the buyer in his purchase for activating crypto love.")
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
  @ApiModelProperty(value = "Supported crypto currencies list.")
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
  @ApiModelProperty(required = true, value = "")
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


  /**
   * Return true if this Merchant object is equal to o.
   */
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

}

