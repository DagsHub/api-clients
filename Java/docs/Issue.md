# Issue

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **Long** |  |  [optional]
**number** | **Long** | Issue index within the repository |  [optional]
**user** | [**ComponentsschemasUserYaml**](ComponentsschemasUserYaml.md) |  |  [optional]
**title** | **String** |  |  [optional]
**body** | **String** |  |  [optional]
**labels** | **List&lt;Object&gt;** |  |  [optional]
**milestone** | **Object** |  |  [optional]
**assignee** | [**ComponentsschemasUserYaml**](ComponentsschemasUserYaml.md) |  |  [optional]
**state** | [**StateEnum**](#StateEnum) |  |  [optional]
**comments** | **Integer** |  |  [optional]
**createdAt** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**updatedAt** | [**OffsetDateTime**](OffsetDateTime.md) |  |  [optional]
**pullRequest** | **Object** | Present when the issue is associated with a pull request |  [optional]

<a name="StateEnum"></a>
## Enum: StateEnum
Name | Value
---- | -----
OPEN | &quot;open&quot;
CLOSED | &quot;closed&quot;
