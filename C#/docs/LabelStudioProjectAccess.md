# dagshub_api.Model.LabelStudioProjectAccess
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **long?** |  | [optional] 
**RepoId** | **long?** |  | [optional] 
**ProjectId** | **long?** | Project ID, -1 means wildcard access to all projects | [optional] 
**UserId** | **long?** | User ID (present for user access entries) | [optional] 
**TeamId** | **long?** | Team ID (present for team access entries) | [optional] 
**AccessLevel** | **string** |  | [optional] 
**CreatedUnix** | **long?** |  | [optional] 
**User** | [**User**](User.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

