# PutFile

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**CommitSummary** | **string** |  | [optional] [default to null]
**CommitMessage** | **string** |  | [optional] [default to null]
**CommitChoice** | **string** |  | [default to null]
**LastCommit** | **string** | If omitted, **only new files** will be accepted.     Otherwise, the request is accepted only if **the tip of the branch is the same as &#x60;last_commit&#x60;** at the moment of processing the request.  This is done to prevent accidental conflicting changes. To get the latest commit you can use the [branches API](#operations-Branches-getBranch)  | [optional] [default to null]
**NewBranchName** | **string** |  | [optional] [default to null]
**Versioning** | **string** |  | [optional] [default to VERSIONING.AUTO]
**Files** | **string** | This property can be sent multiple times to upload multiple files. | [default to null]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

