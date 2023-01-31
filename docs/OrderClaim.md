

# OrderClaim

Claim process detail, when a payment is made and Zenkipay cannot identify it and associate it with the payment order.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**reason** | **String** | Reason for filing the claim. |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | Claim current status.      Possible values: * OPEN     - The claim process has started. * REFUND   - The claim process has been closed and a partial or full refund of the full amount of the order has been made. * RESOLVED - The claim process has been closed without making any reimbursement movement to the buyer, only the payment transaction is associated with the indicated order. * REJECTED - When the claim does not apply, because it tries to associate a payment that does not match the transaction data. |  |
|**createdAt** | **Long** | Date and time the clearing started, in milliseconds and UTC format.      The Unix epoch (or Unix time or POSIX time or Unix timestamp) is the number of seconds elapsed since January 1, 1970 (midnight UTC/GMT), not counting leap seconds (in ISO 8601: 1970-01-01T00: 00:00Z) |  |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| OPEN | &quot;OPEN&quot; |
| REFUND | &quot;REFUND&quot; |
| RESOLVED | &quot;RESOLVED&quot; |
| REJECTED | &quot;REJECTED&quot; |



