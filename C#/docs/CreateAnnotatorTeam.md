# dagshub_api.Model.CreateAnnotatorTeam
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Name** | **string** | Team name | 
**Description** | **string** | Team description | [optional] 
**TeamType** | **string** | Type of team - normal teams have repository access, annotator teams only have annotation project access | [optional] [default to TeamTypeEnum.Normal]
**Permission** | **string** | Repository permission level (required for normal teams, ignored for annotator teams) | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

