# DagsHubApi.CreateAnnotatorTeam

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Team name | 
**description** | **String** | Team description | [optional] 
**teamType** | **String** | Type of team - normal teams have repository access, annotator teams only have annotation project access | [optional] [default to &#x27;normal&#x27;]
**permission** | **String** | Repository permission level (required for normal teams, ignored for annotator teams) | [optional] 

<a name="TeamTypeEnum"></a>
## Enum: TeamTypeEnum

* `normal` (value: `"normal"`)
* `annotator` (value: `"annotator"`)


<a name="PermissionEnum"></a>
## Enum: PermissionEnum

* `read` (value: `"read"`)
* `write` (value: `"write"`)
* `admin` (value: `"admin"`)

