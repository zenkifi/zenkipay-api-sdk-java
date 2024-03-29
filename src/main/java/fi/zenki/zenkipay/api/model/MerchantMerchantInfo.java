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
 * General information of the merchant.
 */
@JsonPropertyOrder({
  MerchantMerchantInfo.JSON_PROPERTY_COMMERCIAL_NAME,
  MerchantMerchantInfo.JSON_PROPERTY_LEGAL_NAME,
  MerchantMerchantInfo.JSON_PROPERTY_ACCOUNT_TYPE,
  MerchantMerchantInfo.JSON_PROPERTY_KYC_STATUS,
  MerchantMerchantInfo.JSON_PROPERTY_INTEGRATION_STATUS
})
@JsonTypeName("Merchant_merchantInfo")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-23T23:44:48.398245079Z[Etc/UTC]")
public class MerchantMerchantInfo {
  public static final String JSON_PROPERTY_COMMERCIAL_NAME = "commercialName";
  private String commercialName;

  public static final String JSON_PROPERTY_LEGAL_NAME = "legalName";
  private String legalName;

  /**
   * Merchant account type.  Possible values: * PERSONAL - Natural person with commercial activity. * ENTITY - Company with commercial activity
   */
  public enum AccountTypeEnum {
    PERSONAL("PERSONAL"),
    
    ENTITY("ENTITY");

    private String value;

    AccountTypeEnum(String value) {
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
    public static AccountTypeEnum fromValue(String value) {
      for (AccountTypeEnum b : AccountTypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_ACCOUNT_TYPE = "accountType";
  private AccountTypeEnum accountType;

  /**
   * State of the documentary process in which the merchant is located.  Possible values: * PENDING      - Indicates that you still need to send information or documents to complete your KYC process. * APPROVED     - The documentary registration process has been completed and the Zenki staff has authorized the business to operate. * REQUEST_INFO - Zenki Staff requested more information or change in trade documents. * REJECTED     - Zenki Staff definitively rejected the merchant request.
   */
  public enum KycStatusEnum {
    PENDING("PENDING"),
    
    APPROVED("APPROVED"),
    
    REQUEST_INFO("REQUEST_INFO"),
    
    REJECTED("REJECTED");

    private String value;

    KycStatusEnum(String value) {
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
    public static KycStatusEnum fromValue(String value) {
      for (KycStatusEnum b : KycStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_KYC_STATUS = "kycStatus";
  private KycStatusEnum kycStatus;

  /**
   * Status of the integration process in merchant is located.  Possible values: * PENDING   - It indicates that the merchant has not yet concluded its technical integration process and is not yet in a productive environment. * COMPLETED - Indicates that the merchant has completed its technical integration process and is already in production or live.
   */
  public enum IntegrationStatusEnum {
    PENDING("PENDING"),
    
    COMPLETED("COMPLETED");

    private String value;

    IntegrationStatusEnum(String value) {
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
    public static IntegrationStatusEnum fromValue(String value) {
      for (IntegrationStatusEnum b : IntegrationStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_INTEGRATION_STATUS = "integrationStatus";
  private IntegrationStatusEnum integrationStatus;

  public MerchantMerchantInfo() {
  }

  public MerchantMerchantInfo commercialName(String commercialName) {
    
    this.commercialName = commercialName;
    return this;
  }

   /**
   * Commercial name of the merchant that you registered when you created your Zenki account.
   * @return commercialName
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_COMMERCIAL_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCommercialName() {
    return commercialName;
  }


  @JsonProperty(JSON_PROPERTY_COMMERCIAL_NAME)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCommercialName(String commercialName) {
    this.commercialName = commercialName;
  }


  public MerchantMerchantInfo legalName(String legalName) {
    
    this.legalName = legalName;
    return this;
  }

   /**
   * Merchant legal name that you register during the Zenki account activation process.
   * @return legalName
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_LEGAL_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getLegalName() {
    return legalName;
  }


  @JsonProperty(JSON_PROPERTY_LEGAL_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLegalName(String legalName) {
    this.legalName = legalName;
  }


  public MerchantMerchantInfo accountType(AccountTypeEnum accountType) {
    
    this.accountType = accountType;
    return this;
  }

   /**
   * Merchant account type.  Possible values: * PERSONAL - Natural person with commercial activity. * ENTITY - Company with commercial activity
   * @return accountType
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_ACCOUNT_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public AccountTypeEnum getAccountType() {
    return accountType;
  }


  @JsonProperty(JSON_PROPERTY_ACCOUNT_TYPE)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAccountType(AccountTypeEnum accountType) {
    this.accountType = accountType;
  }


  public MerchantMerchantInfo kycStatus(KycStatusEnum kycStatus) {
    
    this.kycStatus = kycStatus;
    return this;
  }

   /**
   * State of the documentary process in which the merchant is located.  Possible values: * PENDING      - Indicates that you still need to send information or documents to complete your KYC process. * APPROVED     - The documentary registration process has been completed and the Zenki staff has authorized the business to operate. * REQUEST_INFO - Zenki Staff requested more information or change in trade documents. * REJECTED     - Zenki Staff definitively rejected the merchant request.
   * @return kycStatus
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_KYC_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public KycStatusEnum getKycStatus() {
    return kycStatus;
  }


  @JsonProperty(JSON_PROPERTY_KYC_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setKycStatus(KycStatusEnum kycStatus) {
    this.kycStatus = kycStatus;
  }


  public MerchantMerchantInfo integrationStatus(IntegrationStatusEnum integrationStatus) {
    
    this.integrationStatus = integrationStatus;
    return this;
  }

   /**
   * Status of the integration process in merchant is located.  Possible values: * PENDING   - It indicates that the merchant has not yet concluded its technical integration process and is not yet in a productive environment. * COMPLETED - Indicates that the merchant has completed its technical integration process and is already in production or live.
   * @return integrationStatus
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_INTEGRATION_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public IntegrationStatusEnum getIntegrationStatus() {
    return integrationStatus;
  }


  @JsonProperty(JSON_PROPERTY_INTEGRATION_STATUS)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIntegrationStatus(IntegrationStatusEnum integrationStatus) {
    this.integrationStatus = integrationStatus;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MerchantMerchantInfo merchantMerchantInfo = (MerchantMerchantInfo) o;
    return Objects.equals(this.commercialName, merchantMerchantInfo.commercialName) &&
        Objects.equals(this.legalName, merchantMerchantInfo.legalName) &&
        Objects.equals(this.accountType, merchantMerchantInfo.accountType) &&
        Objects.equals(this.kycStatus, merchantMerchantInfo.kycStatus) &&
        Objects.equals(this.integrationStatus, merchantMerchantInfo.integrationStatus);
  }

  @Override
  public int hashCode() {
    return Objects.hash(commercialName, legalName, accountType, kycStatus, integrationStatus);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MerchantMerchantInfo {\n");
    sb.append("    commercialName: ").append(toIndentedString(commercialName)).append("\n");
    sb.append("    legalName: ").append(toIndentedString(legalName)).append("\n");
    sb.append("    accountType: ").append(toIndentedString(accountType)).append("\n");
    sb.append("    kycStatus: ").append(toIndentedString(kycStatus)).append("\n");
    sb.append("    integrationStatus: ").append(toIndentedString(integrationStatus)).append("\n");
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

    // add `commercialName` to the URL query string
    if (getCommercialName() != null) {
      try {
        joiner.add(String.format("%scommercialName%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getCommercialName()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `legalName` to the URL query string
    if (getLegalName() != null) {
      try {
        joiner.add(String.format("%slegalName%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getLegalName()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `accountType` to the URL query string
    if (getAccountType() != null) {
      try {
        joiner.add(String.format("%saccountType%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getAccountType()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `kycStatus` to the URL query string
    if (getKycStatus() != null) {
      try {
        joiner.add(String.format("%skycStatus%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getKycStatus()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    // add `integrationStatus` to the URL query string
    if (getIntegrationStatus() != null) {
      try {
        joiner.add(String.format("%sintegrationStatus%s=%s", prefix, suffix, URLEncoder.encode(String.valueOf(getIntegrationStatus()), "UTF-8").replaceAll("\\+", "%20")));
      } catch (UnsupportedEncodingException e) {
        // Should never happen, UTF-8 is always supported
        throw new RuntimeException(e);
      }
    }

    return joiner.toString();
  }

}

