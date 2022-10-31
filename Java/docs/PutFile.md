# PutFile

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**commitSummary** | **String** |  |  [optional]
**commitMessage** | **String** |  |  [optional]
**commitChoice** | [**CommitChoiceEnum**](#CommitChoiceEnum) |  | 
**lastCommit** | **String** | If omitted, **only new files** will be accepted.     Otherwise, the request is accepted only if **the tip of the branch is the same as &#x60;last_commit&#x60;** at the moment of processing the request.  This is done to prevent accidental conflicting changes. To get the latest commit you can use the [branches API](#operations-Branches-getBranch)  |  [optional]
**newBranchName** | **String** |  |  [optional]
**versioning** | [**VersioningEnum**](#VersioningEnum) |  |  [optional]
**files** | **String** | This property can be sent multiple times to upload multiple files. | 

<a name="CommitChoiceEnum"></a>
## Enum: CommitChoiceEnum
Name | Value
---- | -----
DIRECT | &quot;direct&quot;
COMMIT_TO_NEW_BRANCH | &quot;commit-to-new-branch&quot;

<a name="VersioningEnum"></a>
## Enum: VersioningEnum
Name | Value
---- | -----
AUTO | &quot;auto&quot;
DVC | &quot;dvc&quot;
GIT | &quot;git&quot;
