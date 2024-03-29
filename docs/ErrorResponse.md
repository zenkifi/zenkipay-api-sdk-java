

# ErrorResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**requestId** | **String** | Unique identifier of the error generated by Zenkipay for each request sent to the API. |  |
|**title** | **String** | Short description of the error. |  |
|**errorCode** | **Long** | Error code that helps to identify the reason for the problem when processing the request. This code will be based on the HTTP codes currently supported by the specification: https://www.rfc-editor.org/rfc/rfc9110#section-15 |  |
|**category** | [**CategoryEnum**](#CategoryEnum) | Error Category.   Possible values: * FATAL  - Any error that forces the service or application to close to prevent data loss (or further data loss). It is reserved for only the most egregious errors and situations where data corruption or loss is guaranteed to have occurred. * SEVERE - Any error that is fatal for the service, but not for the entire application (The service has stopped responding or an operation cannot be executed). These errors will force the intervention of the user (administrator or direct user). * ERROR  - Any error that is fatal to the operation, but not to the service or application (cannot open a required file, missing data, etc.). These errors will force the intervention of the user (administrator or direct user). * WARN   - Anything that could potentially cause application weirdness, but for which I am self-recovering (Such as switching from a primary to a backup server, retrying an operation, losing secondary data, etc.). * INFO   - Informational messages highlighting the app&#39;s progress and possibly some minor bug that impacts the experience very little. |  |
|**validationErrors** | [**List&lt;ErrorResponseValidationErrorsInner&gt;**](ErrorResponseValidationErrorsInner.md) | Set of validations that did not pass when evaluating the request information. |  [optional] |
|**humanMessage** | **String** | Recommended error message to show buyers, this message is supported for English and Spanish languages. |  |
|**timestamp** | **Long** | Date and time in milliseconds and UTC format to identify the different requests in time, the different ones that have had errors.  The Unix epoch (or Unix time or POSIX time or Unix timestamp) is the number of seconds elapsed since January 1, 1970 (midnight UTC/GMT), not counting leap seconds (in ISO 8601: 1970-01-01T00: 00:00Z) |  |



## Enum: CategoryEnum

| Name | Value |
|---- | -----|
| FATAL | &quot;FATAL&quot; |
| SEVERE | &quot;SEVERE&quot; |
| ERROR | &quot;ERROR&quot; |
| WARN | &quot;WARN&quot; |
| INFO | &quot;INFO&quot; |



