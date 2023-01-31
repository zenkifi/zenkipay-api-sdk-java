

# Breakdown

Summary of shopping cart amounts.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**currencyCodeIso3** | **String** | Unique code of the currency of the country, the definition of the ISO 4217 standard is used with 3 characters, see: https://es.wikipedia.org/wiki/ISO_4217 or https://www.iso.org/iso-4217-currency-codes.html. |  |
|**totalItemsAmount** | **Double** | Sum of the total cost of the items (quantity * unitPrice). |  |
|**shipmentAmount** | **Double** | Shipping cost, in case of not applying its value must be 0. |  |
|**subtotalAmount** | **Double** | Sum of total_items_amount plus shipment_amount. |  |
|**taxesAmount** | **Double** | Taxes, if not applied, its value must be 0. |  |
|**localTaxesAmount** | **Double** | Local taxes, if not applied, its value must be 0. |  [optional] |
|**importCosts** | **Double** | Import costs, if not applied, its value must be 0. |  [optional] |
|**discountAmount** | **Double** | Discount of your merchant, in case of not applying its value must be 0. |  [optional] |
|**additionalCharges** | **Map&lt;String, String&gt;** | Additional charges, consists of a key/value object that comprises the description of the charge/amount respectively. |  [optional] |
|**grandTotalAmount** | **Double** | Sum of subtotalAmount, taxesAmount, localTaxesAmount, importCosts, and each value of additionalCharges minus discountAmount. |  |



