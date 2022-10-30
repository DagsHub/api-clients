# DagsHubApi.MigrateRepo

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cloneAddr** | **String** | Remote Git address (HTTP/HTTPS URL or local path) | 
**authUsername** | **String** | Authorization username | [optional] 
**authPassword** | **String** | Authorization password | [optional] 
**userId** | **Number** | User ID who takes ownership of this repository | 
**repoName** | **String** | Name of the repository | [optional] 
**mirror** | **Boolean** | Repository will be a mirror (connected repository). | [optional] [default to false]
**visibility** | **String** | Repository will be private or public. | [optional] [default to &#x27;false&#x27;]
**description** | **String** | Description of the repository | [optional] 

<a name="VisibilityEnum"></a>
## Enum: VisibilityEnum

* `_private` (value: `"private"`)
* `_public` (value: `"public"`)

