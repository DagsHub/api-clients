# DagsHubApi.Issue

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Number** |  | [optional] 
**_number** | **Number** | Issue index within the repository | [optional] 
**user** | [**ComponentsschemasUserYaml**](ComponentsschemasUserYaml.md) |  | [optional] 
**title** | **String** |  | [optional] 
**body** | **String** |  | [optional] 
**labels** | **[Object]** |  | [optional] 
**milestone** | **Object** |  | [optional] 
**assignee** | [**ComponentsschemasUserYaml**](ComponentsschemasUserYaml.md) |  | [optional] 
**state** | **String** |  | [optional] 
**comments** | **Number** |  | [optional] 
**createdAt** | **Date** |  | [optional] 
**updatedAt** | **Date** |  | [optional] 
**pullRequest** | **Object** | Present when the issue is associated with a pull request | [optional] 

<a name="StateEnum"></a>
## Enum: StateEnum

* `open` (value: `"open"`)
* `closed` (value: `"closed"`)

