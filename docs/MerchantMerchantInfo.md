

# MerchantMerchantInfo

General information of the merchant.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**commercialName** | **String** | Commercial name of the merchant that you registered when you created your Zenki account. |  |
|**legalName** | **String** | Merchant legal name that you register during the Zenki account activation process. |  [optional] |
|**accountType** | [**AccountTypeEnum**](#AccountTypeEnum) | Merchant account type.  Possible values: * PERSONAL - Natural person with commercial activity. * ENTITY - Company with commercial activity |  |
|**kycStatus** | [**KycStatusEnum**](#KycStatusEnum) | State of the documentary process in which the merchant is located.  Possible values: * PENDING      - Indicates that you still need to send information or documents to complete your KYC process. * APPROVED     - The documentary registration process has been completed and the Zenki staff has authorized the business to operate. * REQUEST_INFO - Zenki Staff requested more information or change in trade documents. * REJECTED     - Zenki Staff definitively rejected the merchant request. |  |
|**integrationStatus** | [**IntegrationStatusEnum**](#IntegrationStatusEnum) | Status of the integration process in merchant is located.  Possible values: * PENDING   - It indicates that the merchant has not yet concluded its technical integration process and is not yet in a productive environment. * COMPLETED - Indicates that the merchant has completed its technical integration process and is already in production or live. |  |



## Enum: AccountTypeEnum

| Name | Value |
|---- | -----|
| PERSONAL | &quot;PERSONAL&quot; |
| ENTITY | &quot;ENTITY&quot; |



## Enum: KycStatusEnum

| Name | Value |
|---- | -----|
| PENDING | &quot;PENDING&quot; |
| APPROVED | &quot;APPROVED&quot; |
| REQUEST_INFO | &quot;REQUEST_INFO&quot; |
| REJECTED | &quot;REJECTED&quot; |



## Enum: IntegrationStatusEnum

| Name | Value |
|---- | -----|
| PENDING | &quot;PENDING&quot; |
| COMPLETED | &quot;COMPLETED&quot; |



