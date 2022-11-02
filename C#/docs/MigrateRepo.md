# dagshub_api.Model.MigrateRepo
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CloneAddr** | **string** | Remote Git address (HTTP/HTTPS URL or local path) | 
**AuthUsername** | **string** | Authorization username | [optional] 
**AuthPassword** | **string** | Authorization password | [optional] 
**UserId** | **int?** | User ID who takes ownership of this repository | 
**RepoName** | **string** | Name of the repository | [optional] 
**Mirror** | **bool?** | Repository will be a mirror (connected repository). | [optional] [default to false]
**Visibility** | **string** | Repository will be private or public. | [optional] [default to false]
**Description** | **string** | Description of the repository | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

