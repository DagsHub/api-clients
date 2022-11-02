# CreateRepo

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Name** | **string** | name of the repository | [default to null]
**Description** | **string** | A short description of the repository | [optional] [default to null]
**Private** | **bool** | Either true to create a private repository, or false to create a public one. | [optional] [default to false]
**AutoInit** | **bool** | Pass true to create an initial commit with README, .gitignore and LICENSE. | [optional] [default to false]
**ProjectTemplate** | **string** | Choose &#x27;custom&#x27; to set .gitignore, license and readme, or &#x27;none&#x27; for a completely empty repository. For other templates you may specify only the license.  | [optional] [default to null]
**Gitignores** | **string** | Desired language .gitignore templates to apply. Use the name of the templates. | [optional] [default to null]
**License** | **string** | Desired LICENSE template to apply. Use the name of the template. | [optional] [default to null]
**Readme** | **string** | Desired README template to apply. Use the name of the template. | [optional] [default to Default]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

