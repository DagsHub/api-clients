# PutFile

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**commitSummary** | [**kotlin.String**](.md) |  |  [optional]
**commitMessage** | [**kotlin.String**](.md) |  |  [optional]
**commitChoice** | [**inline**](#CommitChoiceEnum) |  | 
**lastCommit** | [**kotlin.String**](.md) | If omitted, **only new files** will be accepted.     Otherwise, the request is accepted only if **the tip of the branch is the same as &#x60;last_commit&#x60;** at the moment of processing the request.  This is done to prevent accidental conflicting changes. To get the latest commit you can use the [branches API](#operations-Branches-getBranch)  |  [optional]
**newBranchName** | [**kotlin.String**](.md) |  |  [optional]
**versioning** | [**inline**](#VersioningEnum) |  |  [optional]
**files** | [**kotlin.String**](.md) | This property can be sent multiple times to upload multiple files. | 

<a name="CommitChoiceEnum"></a>
## Enum: commit_choice
Name | Value
---- | -----
commitChoice | direct, commit-to-new-branch

<a name="VersioningEnum"></a>
## Enum: versioning
Name | Value
---- | -----
versioning | auto, dvc, git
