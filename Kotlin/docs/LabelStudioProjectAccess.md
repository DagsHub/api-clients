# LabelStudioProjectAccess

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**kotlin.Long**](.md) |  |  [optional]
**repoId** | [**kotlin.Long**](.md) |  |  [optional]
**projectId** | [**kotlin.Long**](.md) | Project ID, -1 means wildcard access to all projects |  [optional]
**userId** | [**kotlin.Long**](.md) | User ID (present for user access entries) |  [optional]
**teamId** | [**kotlin.Long**](.md) | Team ID (present for team access entries) |  [optional]
**accessLevel** | [**inline**](#AccessLevelEnum) |  |  [optional]
**createdUnix** | [**kotlin.Long**](.md) |  |  [optional]
**user** | [**User**](User.md) |  |  [optional]

<a name="AccessLevelEnum"></a>
## Enum: access_level
Name | Value
---- | -----
accessLevel | none, annotator
