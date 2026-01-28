# DagsHubApi.LabelStudioProjectAccess

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Number** |  | [optional] 
**repoId** | **Number** |  | [optional] 
**projectId** | **Number** | Project ID, -1 means wildcard access to all projects | [optional] 
**userId** | **Number** | User ID (present for user access entries) | [optional] 
**teamId** | **Number** | Team ID (present for team access entries) | [optional] 
**accessLevel** | **String** |  | [optional] 
**createdUnix** | **Number** |  | [optional] 
**user** | [**User**](User.md) |  | [optional] 

<a name="AccessLevelEnum"></a>
## Enum: AccessLevelEnum

* `none` (value: `"none"`)
* `annotator` (value: `"annotator"`)

