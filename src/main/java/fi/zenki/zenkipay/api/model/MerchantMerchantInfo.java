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
 * General information of the merchant.
 */
@ApiModel(description = "General information of the merchant.")
@JsonPropertyOrder({
  MerchantMerchantInfo.JSON_PROPERTY_COMMERCIAL_NAME,
  MerchantMerchantInfo.JSON_PROPERTY_LEGAL_NAME,
  MerchantMerchantInfo.JSON_PROPERTY_ACCOUNT_TYPE,
  MerchantMerchantInfo.JSON_PROPERTY_KYC_STATUS,
  MerchantMerchantInfo.JSON_PROPERTY_INTEGRATION_STATUS
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-01T00:46:11.523986338Z[Etc/UTC]")
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
  @ApiModelProperty(example = "Juanito shoe stores", required = true, value = "Commercial name of the merchant that you registered when you created your Zenki account.")
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
  @ApiModelProperty(example = "Grupo Juanito y Asociados S.A. de C.V.", value = "Merchant legal name that you register during the Zenki account activation process.")
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
  @ApiModelProperty(example = "ENTITY", required = true, value = "Merchant account type.  Possible values: * PERSONAL - Natural person with commercial activity. * ENTITY - Company with commercial activity")
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
  @ApiModelProperty(example = "APPROVED", required = true, value = "State of the documentary process in which the merchant is located.  Possible values: * PENDING      - Indicates that you still need to send information or documents to complete your KYC process. * APPROVED     - The documentary registration process has been completed and the Zenki staff has authorized the business to operate. * REQUEST_INFO - Zenki Staff requested more information or change in trade documents. * REJECTED     - Zenki Staff definitively rejected the merchant request.")
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
  @ApiModelProperty(example = "COMPLETED", required = true, value = "Status of the integration process in merchant is located.  Possible values: * PENDING   - It indicates that the merchant has not yet concluded its technical integration process and is not yet in a productive environment. * COMPLETED - Indicates that the merchant has completed its technical integration process and is already in production or live.")
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


  /**
   * Return true if this Merchant_merchantInfo object is equal to o.
   */
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

}

