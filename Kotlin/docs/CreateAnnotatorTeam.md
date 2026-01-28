# CreateAnnotatorTeam

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | [**kotlin.String**](.md) | Team name | 
**description** | [**kotlin.String**](.md) | Team description |  [optional]
**teamType** | [**inline**](#TeamTypeEnum) | Type of team - normal teams have repository access, annotator teams only have annotation project access |  [optional]
**permission** | [**inline**](#PermissionEnum) | Repository permission level (required for normal teams, ignored for annotator teams) |  [optional]

<a name="TeamTypeEnum"></a>
## Enum: team_type
Name | Value
---- | -----
teamType | normal, annotator

<a name="PermissionEnum"></a>
## Enum: permission
Name | Value
---- | -----
permission | read, write, admin
