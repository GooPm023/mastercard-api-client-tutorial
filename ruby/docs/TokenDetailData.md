# OpenapiClient::TokenDetailData

## Properties

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **payment_account_reference** | **String** | \&quot;The unique account reference assigned to the PAN. Conditionally returned if the Token Requestor has opted to receive PAR and providing PAR is assigned by Mastercard or the Issuer provides PAR in the authorization message response.\&quot;  | [optional] |

## Example

```ruby
require 'openapi_client'

instance = OpenapiClient::TokenDetailData.new(
  payment_account_reference: 5001a9f027e5629d11e3949a0800a
)
```

