# Issue

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | [**kotlin.Long**](.md) |  |  [optional]
**number** | [**kotlin.Long**](.md) | Issue index within the repository |  [optional]
**user** | [**SlashcomponentsSlashschemasSlashUseryaml**](SlashcomponentsSlashschemasSlashUseryaml.md) |  |  [optional]
**title** | [**kotlin.String**](.md) |  |  [optional]
**body** | [**kotlin.String**](.md) |  |  [optional]
**labels** | [**kotlin.Array&lt;kotlin.Any&gt;**](.md) |  |  [optional]
**milestone** | [**kotlin.Any**](.md) |  |  [optional]
**assignee** | [**SlashcomponentsSlashschemasSlashUseryaml**](SlashcomponentsSlashschemasSlashUseryaml.md) |  |  [optional]
**state** | [**inline**](#StateEnum) |  |  [optional]
**comments** | [**kotlin.Int**](.md) |  |  [optional]
**createdAt** | [**java.time.LocalDateTime**](java.time.LocalDateTime.md) |  |  [optional]
**updatedAt** | [**java.time.LocalDateTime**](java.time.LocalDateTime.md) |  |  [optional]
**pullRequest** | [**kotlin.Any**](.md) | Present when the issue is associated with a pull request |  [optional]

<a name="StateEnum"></a>
## Enum: state
Name | Value
---- | -----
state | open, closed
