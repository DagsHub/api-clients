# File

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**path** | **String** |  |  [optional]
**type** | [**TypeEnum**](#TypeEnum) |  |  [optional]
**size** | **Long** |  |  [optional]
**hash** | **String** |  |  [optional]
**versioning** | [**VersioningEnum**](#VersioningEnum) |  |  [optional]
**downloadUrl** | **String** |  |  [optional]
**contentUrl** | **String** |  |  [optional]

<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
FILE | &quot;file&quot;
DIR | &quot;dir&quot;

<a name="VersioningEnum"></a>
## Enum: VersioningEnum
Name | Value
---- | -----
GIT | &quot;git&quot;
DVC | &quot;dvc&quot;
BUCKET | &quot;bucket&quot;
