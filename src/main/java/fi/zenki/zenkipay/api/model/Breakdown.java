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
import java.util.HashMap;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.openapitools.jackson.nullable.JsonNullable;
import java.util.NoSuchElementException;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * Summary of shopping cart amounts.
 */
@ApiModel(description = "Summary of shopping cart amounts.")
@JsonPropertyOrder({
  Breakdown.JSON_PROPERTY_CURRENCY_CODE_ISO3,
  Breakdown.JSON_PROPERTY_TOTAL_ITEMS_AMOUNT,
  Breakdown.JSON_PROPERTY_SHIPMENT_AMOUNT,
  Breakdown.JSON_PROPERTY_SUBTOTAL_AMOUNT,
  Breakdown.JSON_PROPERTY_TAXES_AMOUNT,
  Breakdown.JSON_PROPERTY_LOCAL_TAXES_AMOUNT,
  Breakdown.JSON_PROPERTY_IMPORT_COSTS,
  Breakdown.JSON_PROPERTY_DISCOUNT_AMOUNT,
  Breakdown.JSON_PROPERTY_ADDITIONAL_CHARGES,
  Breakdown.JSON_PROPERTY_GRAND_TOTAL_AMOUNT
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-31T16:54:43.111604273Z[Etc/UTC]")
public class Breakdown {
  public static final String JSON_PROPERTY_CURRENCY_CODE_ISO3 = "currencyCodeIso3";
  private String currencyCodeIso3;

  public static final String JSON_PROPERTY_TOTAL_ITEMS_AMOUNT = "totalItemsAmount";
  private Double totalItemsAmount;

  public static final String JSON_PROPERTY_SHIPMENT_AMOUNT = "shipmentAmount";
  private Double shipmentAmount;

  public static final String JSON_PROPERTY_SUBTOTAL_AMOUNT = "subtotalAmount";
  private Double subtotalAmount;

  public static final String JSON_PROPERTY_TAXES_AMOUNT = "taxesAmount";
  private Double taxesAmount;

  public static final String JSON_PROPERTY_LOCAL_TAXES_AMOUNT = "localTaxes_amount";
  private JsonNullable<Double> localTaxesAmount = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_IMPORT_COSTS = "importCosts";
  private JsonNullable<Double> importCosts = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_DISCOUNT_AMOUNT = "discountAmount";
  private JsonNullable<Double> discountAmount = JsonNullable.<Double>undefined();

  public static final String JSON_PROPERTY_ADDITIONAL_CHARGES = "additionalCharges";
  private JsonNullable<Map<String, String>> additionalCharges = JsonNullable.<Map<String, String>>undefined();

  public static final String JSON_PROPERTY_GRAND_TOTAL_AMOUNT = "grandTotalAmount";
  private Double grandTotalAmount;

  public Breakdown() { 
  }

  public Breakdown currencyCodeIso3(String currencyCodeIso3) {
    this.currencyCodeIso3 = currencyCodeIso3;
    return this;
  }

   /**
   * Unique code of the currency of the country, the definition of the ISO 4217 standard is used with 3 characters, see: https://es.wikipedia.org/wiki/ISO_4217 or https://www.iso.org/iso-4217-currency-codes.html.
   * @return currencyCodeIso3
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "USD", required = true, value = "Unique code of the currency of the country, the definition of the ISO 4217 standard is used with 3 characters, see: https://es.wikipedia.org/wiki/ISO_4217 or https://www.iso.org/iso-4217-currency-codes.html.")
  @JsonProperty(JSON_PROPERTY_CURRENCY_CODE_ISO3)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCurrencyCodeIso3() {
    return currencyCodeIso3;
  }


  @JsonProperty(JSON_PROPERTY_CURRENCY_CODE_ISO3)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCurrencyCodeIso3(String currencyCodeIso3) {
    this.currencyCodeIso3 = currencyCodeIso3;
  }


  public Breakdown totalItemsAmount(Double totalItemsAmount) {
    this.totalItemsAmount = totalItemsAmount;
    return this;
  }

   /**
   * Sum of the total cost of the items (quantity * unitPrice).
   * minimum: 0
   * @return totalItemsAmount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "200", required = true, value = "Sum of the total cost of the items (quantity * unitPrice).")
  @JsonProperty(JSON_PROPERTY_TOTAL_ITEMS_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Double getTotalItemsAmount() {
    return totalItemsAmount;
  }


  @JsonProperty(JSON_PROPERTY_TOTAL_ITEMS_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTotalItemsAmount(Double totalItemsAmount) {
    this.totalItemsAmount = totalItemsAmount;
  }


  public Breakdown shipmentAmount(Double shipmentAmount) {
    this.shipmentAmount = shipmentAmount;
    return this;
  }

   /**
   * Shipping cost, in case of not applying its value must be 0.
   * minimum: 0
   * @return shipmentAmount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "50", required = true, value = "Shipping cost, in case of not applying its value must be 0.")
  @JsonProperty(JSON_PROPERTY_SHIPMENT_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Double getShipmentAmount() {
    return shipmentAmount;
  }


  @JsonProperty(JSON_PROPERTY_SHIPMENT_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setShipmentAmount(Double shipmentAmount) {
    this.shipmentAmount = shipmentAmount;
  }


  public Breakdown subtotalAmount(Double subtotalAmount) {
    this.subtotalAmount = subtotalAmount;
    return this;
  }

   /**
   * Sum of total_items_amount plus shipment_amount.
   * minimum: 0
   * @return subtotalAmount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "250", required = true, value = "Sum of total_items_amount plus shipment_amount.")
  @JsonProperty(JSON_PROPERTY_SUBTOTAL_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Double getSubtotalAmount() {
    return subtotalAmount;
  }


  @JsonProperty(JSON_PROPERTY_SUBTOTAL_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSubtotalAmount(Double subtotalAmount) {
    this.subtotalAmount = subtotalAmount;
  }


  public Breakdown taxesAmount(Double taxesAmount) {
    this.taxesAmount = taxesAmount;
    return this;
  }

   /**
   * Taxes, if not applied, its value must be 0.
   * minimum: 0
   * @return taxesAmount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "10", required = true, value = "Taxes, if not applied, its value must be 0.")
  @JsonProperty(JSON_PROPERTY_TAXES_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Double getTaxesAmount() {
    return taxesAmount;
  }


  @JsonProperty(JSON_PROPERTY_TAXES_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setTaxesAmount(Double taxesAmount) {
    this.taxesAmount = taxesAmount;
  }


  public Breakdown localTaxesAmount(Double localTaxesAmount) {
    this.localTaxesAmount = JsonNullable.<Double>of(localTaxesAmount);
    return this;
  }

   /**
   * Local taxes, if not applied, its value must be 0.
   * minimum: 0
   * @return localTaxesAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1.6", value = "Local taxes, if not applied, its value must be 0.")
  @JsonIgnore

  public Double getLocalTaxesAmount() {
        return localTaxesAmount.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_LOCAL_TAXES_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Double> getLocalTaxesAmount_JsonNullable() {
    return localTaxesAmount;
  }
  
  @JsonProperty(JSON_PROPERTY_LOCAL_TAXES_AMOUNT)
  public void setLocalTaxesAmount_JsonNullable(JsonNullable<Double> localTaxesAmount) {
    this.localTaxesAmount = localTaxesAmount;
  }

  public void setLocalTaxesAmount(Double localTaxesAmount) {
    this.localTaxesAmount = JsonNullable.<Double>of(localTaxesAmount);
  }


  public Breakdown importCosts(Double importCosts) {
    this.importCosts = JsonNullable.<Double>of(importCosts);
    return this;
  }

   /**
   * Import costs, if not applied, its value must be 0.
   * minimum: 0
   * @return importCosts
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "Import costs, if not applied, its value must be 0.")
  @JsonIgnore

  public Double getImportCosts() {
        return importCosts.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_IMPORT_COSTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Double> getImportCosts_JsonNullable() {
    return importCosts;
  }
  
  @JsonProperty(JSON_PROPERTY_IMPORT_COSTS)
  public void setImportCosts_JsonNullable(JsonNullable<Double> importCosts) {
    this.importCosts = importCosts;
  }

  public void setImportCosts(Double importCosts) {
    this.importCosts = JsonNullable.<Double>of(importCosts);
  }


  public Breakdown discountAmount(Double discountAmount) {
    this.discountAmount = JsonNullable.<Double>of(discountAmount);
    return this;
  }

   /**
   * Discount of your merchant, in case of not applying its value must be 0.
   * minimum: 0
   * @return discountAmount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0", value = "Discount of your merchant, in case of not applying its value must be 0.")
  @JsonIgnore

  public Double getDiscountAmount() {
        return discountAmount.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_DISCOUNT_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Double> getDiscountAmount_JsonNullable() {
    return discountAmount;
  }
  
  @JsonProperty(JSON_PROPERTY_DISCOUNT_AMOUNT)
  public void setDiscountAmount_JsonNullable(JsonNullable<Double> discountAmount) {
    this.discountAmount = discountAmount;
  }

  public void setDiscountAmount(Double discountAmount) {
    this.discountAmount = JsonNullable.<Double>of(discountAmount);
  }


  public Breakdown additionalCharges(Map<String, String> additionalCharges) {
    this.additionalCharges = JsonNullable.<Map<String, String>>of(additionalCharges);
    return this;
  }

  public Breakdown putAdditionalChargesItem(String key, String additionalChargesItem) {
    if (this.additionalCharges == null || !this.additionalCharges.isPresent()) {
      this.additionalCharges = JsonNullable.<Map<String, String>>of(new HashMap<>());
    }
    try {
      this.additionalCharges.get().put(key, additionalChargesItem);
    } catch (java.util.NoSuchElementException e) {
      // this can never happen, as we make sure above that the value is present
    }
    return this;
  }

   /**
   * Additional charges, consists of a key/value object that comprises the description of the charge/amount respectively.
   * @return additionalCharges
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\"donation\":1.1234}", value = "Additional charges, consists of a key/value object that comprises the description of the charge/amount respectively.")
  @JsonIgnore

  public Map<String, String> getAdditionalCharges() {
        return additionalCharges.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_ADDITIONAL_CHARGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<Map<String, String>> getAdditionalCharges_JsonNullable() {
    return additionalCharges;
  }
  
  @JsonProperty(JSON_PROPERTY_ADDITIONAL_CHARGES)
  public void setAdditionalCharges_JsonNullable(JsonNullable<Map<String, String>> additionalCharges) {
    this.additionalCharges = additionalCharges;
  }

  public void setAdditionalCharges(Map<String, String> additionalCharges) {
    this.additionalCharges = JsonNullable.<Map<String, String>>of(additionalCharges);
  }


  public Breakdown grandTotalAmount(Double grandTotalAmount) {
    this.grandTotalAmount = grandTotalAmount;
    return this;
  }

   /**
   * Sum of subtotalAmount, taxesAmount, localTaxesAmount, importCosts, and each value of additionalCharges minus discountAmount.
   * minimum: 0
   * @return grandTotalAmount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "261.6", required = true, value = "Sum of subtotalAmount, taxesAmount, localTaxesAmount, importCosts, and each value of additionalCharges minus discountAmount.")
  @JsonProperty(JSON_PROPERTY_GRAND_TOTAL_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Double getGrandTotalAmount() {
    return grandTotalAmount;
  }


  @JsonProperty(JSON_PROPERTY_GRAND_TOTAL_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setGrandTotalAmount(Double grandTotalAmount) {
    this.grandTotalAmount = grandTotalAmount;
  }


  /**
   * Return true if this Breakdown object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Breakdown breakdown = (Breakdown) o;
    return Objects.equals(this.currencyCodeIso3, breakdown.currencyCodeIso3) &&
        Objects.equals(this.totalItemsAmount, breakdown.totalItemsAmount) &&
        Objects.equals(this.shipmentAmount, breakdown.shipmentAmount) &&
        Objects.equals(this.subtotalAmount, breakdown.subtotalAmount) &&
        Objects.equals(this.taxesAmount, breakdown.taxesAmount) &&
        equalsNullable(this.localTaxesAmount, breakdown.localTaxesAmount) &&
        equalsNullable(this.importCosts, breakdown.importCosts) &&
        equalsNullable(this.discountAmount, breakdown.discountAmount) &&
        equalsNullable(this.additionalCharges, breakdown.additionalCharges) &&
        Objects.equals(this.grandTotalAmount, breakdown.grandTotalAmount);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(currencyCodeIso3, totalItemsAmount, shipmentAmount, subtotalAmount, taxesAmount, hashCodeNullable(localTaxesAmount), hashCodeNullable(importCosts), hashCodeNullable(discountAmount), hashCodeNullable(additionalCharges), grandTotalAmount);
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
    sb.append("class Breakdown {\n");
    sb.append("    currencyCodeIso3: ").append(toIndentedString(currencyCodeIso3)).append("\n");
    sb.append("    totalItemsAmount: ").append(toIndentedString(totalItemsAmount)).append("\n");
    sb.append("    shipmentAmount: ").append(toIndentedString(shipmentAmount)).append("\n");
    sb.append("    subtotalAmount: ").append(toIndentedString(subtotalAmount)).append("\n");
    sb.append("    taxesAmount: ").append(toIndentedString(taxesAmount)).append("\n");
    sb.append("    localTaxesAmount: ").append(toIndentedString(localTaxesAmount)).append("\n");
    sb.append("    importCosts: ").append(toIndentedString(importCosts)).append("\n");
    sb.append("    discountAmount: ").append(toIndentedString(discountAmount)).append("\n");
    sb.append("    additionalCharges: ").append(toIndentedString(additionalCharges)).append("\n");
    sb.append("    grandTotalAmount: ").append(toIndentedString(grandTotalAmount)).append("\n");
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

