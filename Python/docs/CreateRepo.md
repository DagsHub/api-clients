# CreateRepo

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** | name of the repository | 
**description** | **str** | A short description of the repository | [optional] 
**private** | **bool** | Either true to create a private repository, or false to create a public one. | [optional] [default to False]
**auto_init** | **bool** | Pass true to create an initial commit with README, .gitignore and LICENSE. | [optional] [default to False]
**project_template** | **str** | Choose &#x27;custom&#x27; to set .gitignore, license and readme, or &#x27;none&#x27; for a completely empty repository. For other templates you may specify only the license.  | [optional] 
**gitignores** | **str** | Desired language .gitignore templates to apply. Use the name of the templates. | [optional] 
**license** | **str** | Desired LICENSE template to apply. Use the name of the template. | [optional] 
**readme** | **str** | Desired README template to apply. Use the name of the template. | [optional] [default to 'Default']

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

