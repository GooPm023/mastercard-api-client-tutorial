# # GetTaskStatusRequestSchema

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**response_host** | **string** | The host that originated the request. Future calls in the same conversation may be routed to this host. | [optional]
**request_id** | **string** | Unique identifier for the request. |
**token_requestor_id** | **string** | 11-digit numeric ID provided by Mastercard that identifies the Token Requestor. |
**task_id** | **string** | Unique identifier for this task. Must be an identifier previously used when requesting a task. |

[[Back to Model list]](../../README.md#models) [[Back to API list]](../../README.md#endpoints) [[Back to README]](../../README.md)
