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
 * Summary of the amount paid in crypto currency by the buyer.
 */
@ApiModel(description = "Summary of the amount paid in crypto currency by the buyer.")
@JsonPropertyOrder({
  CryptoPayment.JSON_PROPERTY_AMOUNT,
  CryptoPayment.JSON_PROPERTY_CURRENCY,
  CryptoPayment.JSON_PROPERTY_BLOCKCHAIN,
  CryptoPayment.JSON_PROPERTY_TRANSACTION_HASH,
  CryptoPayment.JSON_PROPERTY_NETWORK_SCAN_URL,
  CryptoPayment.JSON_PROPERTY_TRANSACTION_STATUS
})
@javax.annotation.processing.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-02-22T15:58:02.126646314Z[Etc/UTC]")
public class CryptoPayment {
  public static final String JSON_PROPERTY_AMOUNT = "amount";
  private String amount;

  public static final String JSON_PROPERTY_CURRENCY = "currency";
  private String currency;

  public static final String JSON_PROPERTY_BLOCKCHAIN = "blockchain";
  private String blockchain;

  public static final String JSON_PROPERTY_TRANSACTION_HASH = "transactionHash";
  private JsonNullable<String> transactionHash = JsonNullable.<String>undefined();

  public static final String JSON_PROPERTY_NETWORK_SCAN_URL = "networkScanUrl";
  private JsonNullable<String> networkScanUrl = JsonNullable.<String>undefined();

  /**
   * Payment status transaction in the blockchain network.  Possible values: * CONFIRMING                        - Pending confirmation on the blockchain. * PARTIALLY_COMPLETED               - One or more of of the transaction records have completed successfully (Only for Aggregated transactions). * COMPLETED                         - Successfully completed. * CANCELLED                         - The transaction was rejected by the Zenkipay Staff or by the 3rd party service. * REJECTED                          - La transacción fue rechazada por el servicio de terceros. * BLOCKED                           - The transaction was blocked due to a policy rule. * FAILED                            - The transaction has failed.
   */
  public enum TransactionStatusEnum {
    CONFIRMING("CONFIRMING"),
    
    PARTIALLY_COMPLETED("PARTIALLY_COMPLETED"),
    
    COMPLETED("COMPLETED"),
    
    CANCELLED("CANCELLED"),
    
    REJECTED("REJECTED"),
    
    BLOCKED("BLOCKED"),
    
    FAILED("FAILED");

    private String value;

    TransactionStatusEnum(String value) {
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
    public static TransactionStatusEnum fromValue(String value) {
      for (TransactionStatusEnum b : TransactionStatusEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_TRANSACTION_STATUS = "transactionStatus";
  private TransactionStatusEnum transactionStatus;

  public CryptoPayment() { 
  }

  public CryptoPayment amount(String amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Payment amount in cryptocurrency.
   * @return amount
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "0.038282960887513325", required = true, value = "Payment amount in cryptocurrency.")
  @JsonProperty(JSON_PROPERTY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getAmount() {
    return amount;
  }


  @JsonProperty(JSON_PROPERTY_AMOUNT)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setAmount(String amount) {
    this.amount = amount;
  }


  public CryptoPayment currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Code of the cryptocurrency supported by Zenkipay, see: https://developer.zenki.fi/global-v1/docs/zenkipay-recursos-catalogos-criptomonedas-soportadas
   * @return currency
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "ETH", required = true, value = "Code of the cryptocurrency supported by Zenkipay, see: https://developer.zenki.fi/global-v1/docs/zenkipay-recursos-catalogos-criptomonedas-soportadas")
  @JsonProperty(JSON_PROPERTY_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getCurrency() {
    return currency;
  }


  @JsonProperty(JSON_PROPERTY_CURRENCY)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setCurrency(String currency) {
    this.currency = currency;
  }


  public CryptoPayment blockchain(String blockchain) {
    this.blockchain = blockchain;
    return this;
  }

   /**
   * Supported blockchains list.  Posibles valroes: * Bitcoin * Ethereum * Litecoin * Bitcoin Cash * Solana * Algorand * Polygon * Arbitrum * BSC * Avalanche * Ripple * Terra * Cardano * Polkadot * Tron * Stellar * Ethereum Classic * Hedera Hashgraph * Tezos * EOSIO * Fantom Opera * ZCash * Celo * Dash * XDC Network
   * @return blockchain
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "BSC", required = true, value = "Supported blockchains list.  Posibles valroes: * Bitcoin * Ethereum * Litecoin * Bitcoin Cash * Solana * Algorand * Polygon * Arbitrum * BSC * Avalanche * Ripple * Terra * Cardano * Polkadot * Tron * Stellar * Ethereum Classic * Hedera Hashgraph * Tezos * EOSIO * Fantom Opera * ZCash * Celo * Dash * XDC Network")
  @JsonProperty(JSON_PROPERTY_BLOCKCHAIN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getBlockchain() {
    return blockchain;
  }


  @JsonProperty(JSON_PROPERTY_BLOCKCHAIN)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setBlockchain(String blockchain) {
    this.blockchain = blockchain;
  }


  public CryptoPayment transactionHash(String transactionHash) {
    this.transactionHash = JsonNullable.<String>of(transactionHash);
    return this;
  }

   /**
   * Unique identifier of the transaction, provided by the blockchain.
   * @return transactionHash
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "0xee8a3a5eb2a972785b7a56320682bbb843c29409c60dec2d25dbd3eaff91cf26", value = "Unique identifier of the transaction, provided by the blockchain.")
  @JsonIgnore

  public String getTransactionHash() {
        return transactionHash.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_TRANSACTION_HASH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getTransactionHash_JsonNullable() {
    return transactionHash;
  }
  
  @JsonProperty(JSON_PROPERTY_TRANSACTION_HASH)
  public void setTransactionHash_JsonNullable(JsonNullable<String> transactionHash) {
    this.transactionHash = transactionHash;
  }

  public void setTransactionHash(String transactionHash) {
    this.transactionHash = JsonNullable.<String>of(transactionHash);
  }


  public CryptoPayment networkScanUrl(String networkScanUrl) {
    this.networkScanUrl = JsonNullable.<String>of(networkScanUrl);
    return this;
  }

   /**
   * URL to check the status of the transaction directly on the blockchain.
   * @return networkScanUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "https://etherscan.io/tx/0x3e86fd3c50dbf8e050124e28f33392ce4f4278a925d7c472b3e7ab12af0da115", value = "URL to check the status of the transaction directly on the blockchain.")
  @JsonIgnore

  public String getNetworkScanUrl() {
        return networkScanUrl.orElse(null);
  }

  @JsonProperty(JSON_PROPERTY_NETWORK_SCAN_URL)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public JsonNullable<String> getNetworkScanUrl_JsonNullable() {
    return networkScanUrl;
  }
  
  @JsonProperty(JSON_PROPERTY_NETWORK_SCAN_URL)
  public void setNetworkScanUrl_JsonNullable(JsonNullable<String> networkScanUrl) {
    this.networkScanUrl = networkScanUrl;
  }

  public void setNetworkScanUrl(String networkScanUrl) {
    this.networkScanUrl = JsonNullable.<String>of(networkScanUrl);
  }


  public CryptoPayment transactionStatus(TransactionStatusEnum transactionStatus) {
    this.transactionStatus = transactionStatus;
    return this;
  }

   /**
   * Payment status transaction in the blockchain network.  Possible values: * CONFIRMING                        - Pending confirmation on the blockchain. * PARTIALLY_COMPLETED               - One or more of of the transaction records have completed successfully (Only for Aggregated transactions). * COMPLETED                         - Successfully completed. * CANCELLED                         - The transaction was rejected by the Zenkipay Staff or by the 3rd party service. * REJECTED                          - La transacción fue rechazada por el servicio de terceros. * BLOCKED                           - The transaction was blocked due to a policy rule. * FAILED                            - The transaction has failed.
   * @return transactionStatus
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "COMPLETED", value = "Payment status transaction in the blockchain network.  Possible values: * CONFIRMING                        - Pending confirmation on the blockchain. * PARTIALLY_COMPLETED               - One or more of of the transaction records have completed successfully (Only for Aggregated transactions). * COMPLETED                         - Successfully completed. * CANCELLED                         - The transaction was rejected by the Zenkipay Staff or by the 3rd party service. * REJECTED                          - La transacción fue rechazada por el servicio de terceros. * BLOCKED                           - The transaction was blocked due to a policy rule. * FAILED                            - The transaction has failed.")
  @JsonProperty(JSON_PROPERTY_TRANSACTION_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TransactionStatusEnum getTransactionStatus() {
    return transactionStatus;
  }


  @JsonProperty(JSON_PROPERTY_TRANSACTION_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTransactionStatus(TransactionStatusEnum transactionStatus) {
    this.transactionStatus = transactionStatus;
  }


  /**
   * Return true if this CryptoPayment object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CryptoPayment cryptoPayment = (CryptoPayment) o;
    return Objects.equals(this.amount, cryptoPayment.amount) &&
        Objects.equals(this.currency, cryptoPayment.currency) &&
        Objects.equals(this.blockchain, cryptoPayment.blockchain) &&
        equalsNullable(this.transactionHash, cryptoPayment.transactionHash) &&
        equalsNullable(this.networkScanUrl, cryptoPayment.networkScanUrl) &&
        Objects.equals(this.transactionStatus, cryptoPayment.transactionStatus);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, currency, blockchain, hashCodeNullable(transactionHash), hashCodeNullable(networkScanUrl), transactionStatus);
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
    sb.append("class CryptoPayment {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    blockchain: ").append(toIndentedString(blockchain)).append("\n");
    sb.append("    transactionHash: ").append(toIndentedString(transactionHash)).append("\n");
    sb.append("    networkScanUrl: ").append(toIndentedString(networkScanUrl)).append("\n");
    sb.append("    transactionStatus: ").append(toIndentedString(transactionStatus)).append("\n");
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

