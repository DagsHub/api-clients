# DagsHubApi.MigrateRepo

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cloneAddr** | **String** | Remote Git address (HTTP/HTTPS URL or local path) | 
**authUsername** | **String** | Authorization username | [optional] 
**authPassword** | **String** | Authorization password | [optional] 
**uid** | **Number** | User ID who takes ownership of this repository | 
**repoName** | **String** | Name of the repository | [optional] 
**mirror** | **Boolean** | Repository will be a mirror (connected repository). | [optional] [default to false]
**_private** | **Boolean** | Repository will be private. | [optional] [default to false]
**description** | **String** | Description of the repository | [optional] 
