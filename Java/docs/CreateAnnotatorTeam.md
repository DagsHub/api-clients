# CreateAnnotatorTeam

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Team name | 
**description** | **String** | Team description |  [optional]
**teamType** | [**TeamTypeEnum**](#TeamTypeEnum) | Type of team - normal teams have repository access, annotator teams only have annotation project access |  [optional]
**permission** | [**PermissionEnum**](#PermissionEnum) | Repository permission level (required for normal teams, ignored for annotator teams) |  [optional]

<a name="TeamTypeEnum"></a>
## Enum: TeamTypeEnum
Name | Value
---- | -----
NORMAL | &quot;normal&quot;
ANNOTATOR | &quot;annotator&quot;

<a name="PermissionEnum"></a>
## Enum: PermissionEnum
Name | Value
---- | -----
READ | &quot;read&quot;
WRITE | &quot;write&quot;
ADMIN | &quot;admin&quot;
