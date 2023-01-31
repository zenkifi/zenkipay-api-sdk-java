

# CryptoPayment

Summary of the amount paid in crypto currency by the buyer.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**amount** | **String** | Payment amount in cryptocurrency. |  |
|**currency** | **String** | Code of the cryptocurrency supported by Zenkipay, see: https://developer.zenki.fi/global-v1/docs/zenkipay-recursos-catalogos-criptomonedas-soportadas |  |
|**blockchain** | **String** | Supported blockchains list.  Posibles valroes: * Bitcoin * Ethereum * Litecoin * Bitcoin Cash * Solana * Algorand * Polygon * Arbitrum * BSC * Avalanche * Ripple * Terra * Cardano * Polkadot * Tron * Stellar * Ethereum Classic * Hedera Hashgraph * Tezos * EOSIO * Fantom Opera * ZCash * Celo * Dash * XDC Network |  |
|**transactionHash** | **String** | Unique identifier of the transaction, provided by the blockchain. |  [optional] |
|**networkScanUrl** | **String** | URL to check the status of the transaction directly on the blockchain. |  [optional] |
|**transactionStatus** | [**TransactionStatusEnum**](#TransactionStatusEnum) | Payment status transaction in the blockchain network.  Possible values: * CONFIRMING                        - Pending confirmation on the blockchain. * PARTIALLY_COMPLETED               - One or more of of the transaction records have completed successfully (Only for Aggregated transactions). * COMPLETED                         - Successfully completed. * CANCELLED                         - The transaction was rejected by the Zenkipay Staff or by the 3rd party service. * REJECTED                          - La transacción fue rechazada por el servicio de terceros. * BLOCKED                           - The transaction was blocked due to a policy rule. * FAILED                            - The transaction has failed. |  [optional] |



## Enum: TransactionStatusEnum

| Name | Value |
|---- | -----|
| CONFIRMING | &quot;CONFIRMING&quot; |
| PARTIALLY_COMPLETED | &quot;PARTIALLY_COMPLETED&quot; |
| COMPLETED | &quot;COMPLETED&quot; |
| CANCELLED | &quot;CANCELLED&quot; |
| REJECTED | &quot;REJECTED&quot; |
| BLOCKED | &quot;BLOCKED&quot; |
| FAILED | &quot;FAILED&quot; |



