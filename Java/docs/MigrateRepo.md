# MigrateRepo

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cloneAddr** | **String** | Remote Git address (HTTP/HTTPS URL or local path) | 
**authUsername** | **String** | Authorization username |  [optional]
**authPassword** | **String** | Authorization password |  [optional]
**userId** | **Integer** | User ID who takes ownership of this repository | 
**repoName** | **String** | Name of the repository |  [optional]
**mirror** | **Boolean** | Repository will be a mirror (connected repository). |  [optional]
**visibility** | [**VisibilityEnum**](#VisibilityEnum) | Repository will be private or public. |  [optional]
**description** | **String** | Description of the repository |  [optional]

<a name="VisibilityEnum"></a>
## Enum: VisibilityEnum
Name | Value
---- | -----
PRIVATE | &quot;private&quot;
PUBLIC | &quot;public&quot;
