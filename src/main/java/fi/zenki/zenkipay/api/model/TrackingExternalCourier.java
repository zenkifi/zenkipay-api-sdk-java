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
 * Courier details used for the shipment.
 */
@ApiModel(description = "Courier details used for the shipment.")
@JsonPropertyOrder({
  TrackingExternalCourier.JSON_PROPERTY_KEY,
  TrackingExternalCourier.JSON_PROPERTY_COUNTRY_CODE_ISO2,
  TrackingExternalCourier.JSON_PROPERTY_URL,
  TrackingExternalCourier.JSON_PROPERTY_NAME,
  TrackingExternalCourier.JSON_PROPERTY_NAME_ZH_CN,
  TrackingExternalCourier.JSON_PROPERTY_NAME_ZH_HK
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-01-31T20:09:42.478974698Z[Etc/UTC]")
public class TrackingExternalCourier {
  public static final String JSON_PROPERTY_KEY = "key";
  private String key;

  public static final String JSON_PROPERTY_COUNTRY_CODE_ISO2 = "countryCodeIso2";
  private String countryCodeIso2;

  public static final String JSON_PROPERTY_URL = "url";
  private JsonNullable<String> url = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_NAME = "name";
  private JsonNullable<String> name = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_NAME_ZH_CN = "nameZhCn";
  private JsonNullable<String> nameZhCn = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_NAME_ZH_HK = "nameZhHk";
  private JsonNullable<String> nameZhHk = JsonNullable.<String>undefined();

  public TrackingExternalCourier() { 
  }

  public TrackingExternalCourier key(String key) {
    this.key = key;
    return this;
  }

   /**
   * Unique messaging identifier provided by Zenkipay:  Example of some couriers:   * 190135  139Express  http://www.139express.com/   * 190524  1688        https://www.1688.com/   * 190659  17EXP       https://www.17-exp.com/   * 190349  1TONG       http://www.1tongexpress.com/  To know the complete list of couriers see: https://developer.zenki.fi/global-v1/docs/zenkipay-recursos-catalogos-mensajerias-soportadas
   * @return key
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "100003", required = true, value = "Unique messaging identifier provided by Zenkipay:  Example of some couriers:   * 190135  139Express  http://www.139express.com/   * 190524  1688        https://www.1688.com/   * 190659  17EXP       https://www.17-exp.com/   * 190349  1TONG       http://www.1tongexpress.com/  To know the complete list of couriers see: https://developer.zenki.fi/global-v1/docs/zenkipay-recursos-catalogos-mensajerias-soportadas")
  @JsonProperty(JSON_PROPERTY_KEY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getKey() {
    return key;
  }


  @JsonProperty(JSON_PROPERTY_KEY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setKey(String key) {
    this.key = key;
  }


  public TrackingExternalCourier countryCodeIso2(String countryCodeIso2) {
    this.countryCodeIso2 = countryCodeIso2;
    return this;
  }

   /**
   * Unique country identifier, the definition of the ISO_3166-1 standard is used with 2 characters, see: https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2 or https://www.iso.org/iso-3166-country-codes.html
   * @return countryCodeIso2
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "MX", required = true, value = "Unique country identifier, the definition of the ISO_3166-1 standard is used with 2 characters, see: https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2 or https://www.iso.org/iso-3166-country-codes.html")
  @JsonProperty(JSON_PROPERTY_COUNTRY_CODE_ISO2)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCountryCodeIso2() {
    return countryCodeIso2;
  }


  @JsonProperty(JSON_PROPERTY_COUNTRY_CODE_ISO2)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCountryCodeIso2(String countryCodeIso2) {
    this.countryCodeIso2 = countryCodeIso2;
  }


  public TrackingExternalCourier url(String url) {
    this.url = JsonNullable.<String>of(url);
    return this;
  }

   /**
   * Courier website.  To know the complete list of couriers see: https://developer.zenki.fi/global-v1/docs/zenkipay-recursos-catalogos-mensajerias-soportadas
   * @return url
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "http://www.fedex.com/", value = "Courier website.  To know the complete list of couriers see: https://developer.zenki.fi/global-v1/docs/zenkipay-recursos-catalogos-mensajerias-soportadas")
  @JsonIgnore

  public String getUrl() {
        return url.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getUrl_JsonNullable() {
    return url;
  }
  
  @JsonProperty(JSON_PROPERTY_URL)
  public void setUrl_JsonNullable(JsonNullable<String> url) {
    this.url = url;
  }

  public void setUrl(String url) {
    this.url = JsonNullable.<String>of(url);
  }


  public TrackingExternalCourier name(String name) {
    this.name = JsonNullable.<String>of(name);
    return this;
  }

   /**
   * Courier name.  To know the complete list of couriers see: https://developer.zenki.fi/global-v1/docs/zenkipay-recursos-catalogos-mensajerias-soportadas
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Fedex", value = "Courier name.  To know the complete list of couriers see: https://developer.zenki.fi/global-v1/docs/zenkipay-recursos-catalogos-mensajerias-soportadas")
  @JsonIgnore

  public String getName() {
        return name.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getName_JsonNullable() {
    return name;
  }
  
  @JsonProperty(JSON_PROPERTY_NAME)
  public void setName_JsonNullable(JsonNullable<String> name) {
    this.name = name;
  }

  public void setName(String name) {
    this.name = JsonNullable.<String>of(name);
  }


  public TrackingExternalCourier nameZhCn(String nameZhCn) {
    this.nameZhCn = JsonNullable.<String>of(nameZhCn);
    return this;
  }

   /**
   * Courier name.  To know the complete list of couriers see: https://developer.zenki.fi/global-v1/docs/zenkipay-recursos-catalogos-mensajerias-soportadas
   * @return nameZhCn
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Fedex", value = "Courier name.  To know the complete list of couriers see: https://developer.zenki.fi/global-v1/docs/zenkipay-recursos-catalogos-mensajerias-soportadas")
  @JsonIgnore

  public String getNameZhCn() {
        return nameZhCn.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_NAME_ZH_CN)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getNameZhCn_JsonNullable() {
    return nameZhCn;
  }
  
  @JsonProperty(JSON_PROPERTY_NAME_ZH_CN)
  public void setNameZhCn_JsonNullable(JsonNullable<String> nameZhCn) {
    this.nameZhCn = nameZhCn;
  }

  public void setNameZhCn(String nameZhCn) {
    this.nameZhCn = JsonNullable.<String>of(nameZhCn);
  }


  public TrackingExternalCourier nameZhHk(String nameZhHk) {
    this.nameZhHk = JsonNullable.<String>of(nameZhHk);
    return this;
  }

   /**
   * Courier name.        To know the complete list of couriers see: https://developer.zenki.fi/global-v1/docs/zenkipay-recursos-catalogos-mensajerias-soportadas
   * @return nameZhHk
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Fedex", value = "Courier name.        To know the complete list of couriers see: https://developer.zenki.fi/global-v1/docs/zenkipay-recursos-catalogos-mensajerias-soportadas")
  @JsonIgnore

  public String getNameZhHk() {
        return nameZhHk.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_NAME_ZH_HK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getNameZhHk_JsonNullable() {
    return nameZhHk;
  }
  
  @JsonProperty(JSON_PROPERTY_NAME_ZH_HK)
  public void setNameZhHk_JsonNullable(JsonNullable<String> nameZhHk) {
    this.nameZhHk = nameZhHk;
  }

  public void setNameZhHk(String nameZhHk) {
    this.nameZhHk = JsonNullable.<String>of(nameZhHk);
  }


  /**
   * Return true if this Tracking_externalCourier object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TrackingExternalCourier trackingExternalCourier = (TrackingExternalCourier) o;
    return Objects.equals(this.key, trackingExternalCourier.key) &&
        Objects.equals(this.countryCodeIso2, trackingExternalCourier.countryCodeIso2) &&
        equalsNullable(this.url, trackingExternalCourier.url) &&
        equalsNullable(this.name, trackingExternalCourier.name) &&
        equalsNullable(this.nameZhCn, trackingExternalCourier.nameZhCn) &&
        equalsNullable(this.nameZhHk, trackingExternalCourier.nameZhHk);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(key, countryCodeIso2, hashCodeNullable(url), hashCodeNullable(name), hashCodeNullable(nameZhCn), hashCodeNullable(nameZhHk));
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
    sb.append("class TrackingExternalCourier {\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    countryCodeIso2: ").append(toIndentedString(countryCodeIso2)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nameZhCn: ").append(toIndentedString(nameZhCn)).append("\n");
    sb.append("    nameZhHk: ").append(toIndentedString(nameZhHk)).append("\n");
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

