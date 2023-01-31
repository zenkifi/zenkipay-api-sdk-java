

# OrderDispute

Process of a dispute detail.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**status** | [**StatusEnum**](#StatusEnum) | Dispute current status.  Possible values: * OPEN     - The dispute process has started. * REFUND   - The dispute process has been closed and a partial or full refund of the full amount of the order has been made. * RESOLVED - The dispute process has been closed without making any refund movement to the buyer. |  |
|**createdAt** | **Long** | Date and time the dispute started, in milliseconds and UTC format.      The Unix epoch (or Unix time or POSIX time or Unix timestamp) is the number of seconds elapsed since January 1, 1970 (midnight UTC/GMT), not counting leap seconds (in ISO 8601: 1970-01-01T00: 00:00Z) |  |
|**resolutionRequestType** | [**ResolutionRequestTypeEnum**](#ResolutionRequestTypeEnum) | Support type requested from Zenki staff.  Possible values: * REQUEST_REFUND      - Request for support from Zenki staff to make a refund. * REQUEST_CONCILIATED - Request to Zenki staff to reconcile dispute between buyer and merchant. |  [optional] |
|**resolutionRequestAt** | **Long** | Date and time in which the dispute was finalized and a final resolution of the process was given to the buyer, in milliseconds and UTC format.      The Unix epoch (or Unix time or POSIX time or Unix timestamp) is the number of seconds elapsed since January 1, 1970 (midnight UTC/GMT), not counting leap seconds (in ISO 8601: 1970-01-01T00: 00:00Z) |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| OPEN | &quot;OPEN&quot; |
| REFUND | &quot;REFUND&quot; |
| RESOLVED | &quot;RESOLVED&quot; |



## Enum: ResolutionRequestTypeEnum

| Name | Value |
|---- | -----|
| REFUND | &quot;REQUEST_REFUND&quot; |
| CONCILIATED | &quot;REQUEST_CONCILIATED&quot; |



