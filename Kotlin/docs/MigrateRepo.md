# MigrateRepo

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cloneAddr** | [**kotlin.String**](.md) | Remote Git address (HTTP/HTTPS URL or local path) | 
**authUsername** | [**kotlin.String**](.md) | Authorization username |  [optional]
**authPassword** | [**kotlin.String**](.md) | Authorization password |  [optional]
**userId** | [**kotlin.Int**](.md) | User ID who takes ownership of this repository | 
**repoName** | [**kotlin.String**](.md) | Name of the repository |  [optional]
**mirror** | [**kotlin.Boolean**](.md) | Repository will be a mirror (connected repository). |  [optional]
**visibility** | [**inline**](#VisibilityEnum) | Repository will be private or public. |  [optional]
**description** | [**kotlin.String**](.md) | Description of the repository |  [optional]

<a name="VisibilityEnum"></a>
## Enum: visibility
Name | Value
---- | -----
visibility | private, public
