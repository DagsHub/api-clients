# LabelStudioProjectAccess

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** |  |  [optional]
**repoId** | **Long** |  |  [optional]
**projectId** | **Long** | Project ID, -1 means wildcard access to all projects |  [optional]
**userId** | **Long** | User ID (present for user access entries) |  [optional]
**teamId** | **Long** | Team ID (present for team access entries) |  [optional]
**accessLevel** | [**AccessLevelEnum**](#AccessLevelEnum) |  |  [optional]
**createdUnix** | **Long** |  |  [optional]
**user** | [**User**](User.md) |  |  [optional]

<a name="AccessLevelEnum"></a>
## Enum: AccessLevelEnum
Name | Value
---- | -----
NONE | &quot;none&quot;
ANNOTATOR | &quot;annotator&quot;
