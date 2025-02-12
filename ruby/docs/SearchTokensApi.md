# OpenapiClient::SearchTokensApi

All URIs are relative to *https://api.mastercard.com/mdes*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**search_tokens**](SearchTokensApi.md#search_tokens) | **POST** /digitization/static/1/0/searchTokens | Used to get basic token information for all tokens on a specified device, or all tokens mapped to the given Account PAN. |


## search_tokens

> <SearchTokensResponseSchema> search_tokens(opts)

Used to get basic token information for all tokens on a specified device, or all tokens mapped to the given Account PAN.

This API is used to get basic token information for all tokens on a specified device, or all tokens mapped to the given Account PAN. It may be used to check current Token(s) state or, in exception scenarios (such as network time out), to ensure that external systems remain in sync with the Token state as maintained by MDES. Deactivated tokens are not returned. 

### Examples

```ruby
require 'time'
require 'openapi_client'

api_instance = OpenapiClient::SearchTokensApi.new
opts = {
  search_tokens_request_schema: OpenapiClient::SearchTokensRequestSchema.new({request_id: '123456'}) # SearchTokensRequestSchema | Contains the details of the request message. 
}

begin
  # Used to get basic token information for all tokens on a specified device, or all tokens mapped to the given Account PAN.
  result = api_instance.search_tokens(opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling SearchTokensApi->search_tokens: #{e}"
end
```

#### Using the search_tokens_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<SearchTokensResponseSchema>, Integer, Hash)> search_tokens_with_http_info(opts)

```ruby
begin
  # Used to get basic token information for all tokens on a specified device, or all tokens mapped to the given Account PAN.
  data, status_code, headers = api_instance.search_tokens_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <SearchTokensResponseSchema>
rescue OpenapiClient::ApiError => e
  puts "Error when calling SearchTokensApi->search_tokens_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **search_tokens_request_schema** | [**SearchTokensRequestSchema**](SearchTokensRequestSchema.md) | Contains the details of the request message.  | [optional] |

### Return type

[**SearchTokensResponseSchema**](SearchTokensResponseSchema.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

