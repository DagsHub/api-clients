# Issue

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **int64** |  | [optional] [default to null]
**Number** | **int64** | Issue index within the repository | [optional] [default to null]
**User** | [***ComponentsschemasUserYaml**](./components/schemas/User.yaml.md) |  | [optional] [default to null]
**Title** | **string** |  | [optional] [default to null]
**Body** | **string** |  | [optional] [default to null]
**Labels** | [**[]interface{}**](interface{}.md) |  | [optional] [default to null]
**Milestone** | [***interface{}**](interface{}.md) |  | [optional] [default to null]
**Assignee** | [***ComponentsschemasUserYaml**](./components/schemas/User.yaml.md) |  | [optional] [default to null]
**State** | **string** |  | [optional] [default to null]
**Comments** | **int32** |  | [optional] [default to null]
**CreatedAt** | [**time.Time**](time.Time.md) |  | [optional] [default to null]
**UpdatedAt** | [**time.Time**](time.Time.md) |  | [optional] [default to null]
**PullRequest** | [***interface{}**](interface{}.md) | Present when the issue is associated with a pull request | [optional] [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

