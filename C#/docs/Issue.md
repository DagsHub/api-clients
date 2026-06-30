# dagshub_api.Model.Issue
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **long?** |  | [optional] 
**Number** | **long?** | Issue index within the repository | [optional] 
**User** | [**ComponentsschemasUserYaml**](ComponentsschemasUserYaml.md) |  | [optional] 
**Title** | **string** |  | [optional] 
**Body** | **string** |  | [optional] 
**Labels** | **List&lt;Object&gt;** |  | [optional] 
**Milestone** | **Object** |  | [optional] 
**Assignee** | [**ComponentsschemasUserYaml**](ComponentsschemasUserYaml.md) |  | [optional] 
**State** | **string** |  | [optional] 
**Comments** | **int?** |  | [optional] 
**CreatedAt** | **DateTime?** |  | [optional] 
**UpdatedAt** | **DateTime?** |  | [optional] 
**PullRequest** | **Object** | Present when the issue is associated with a pull request | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

