# DagsHubApi.PutFile

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**commitSummary** | **String** |  | [optional] 
**commitMessage** | **String** |  | [optional] 
**commitChoice** | **String** |  | 
**lastCommit** | **String** | If omitted, **only new files** will be accepted.     Otherwise, the request is accepted only if **the tip of the branch is the same as &#x60;last_commit&#x60;** at the moment of processing the request.  This is done to prevent accidental conflicting changes. To get the latest commit you can use the [branches API](#operations-Branches-getBranch)  | [optional] 
**newBranchName** | **String** |  | [optional] 
**versioning** | **String** |  | [optional] [default to &#x27;auto&#x27;]
**files** | **String** | This property can be sent multiple times to upload multiple files. | 

<a name="CommitChoiceEnum"></a>
## Enum: CommitChoiceEnum

* `direct` (value: `"direct"`)
* `commitToNewBranch` (value: `"commit-to-new-branch"`)


<a name="VersioningEnum"></a>
## Enum: VersioningEnum

* `auto` (value: `"auto"`)
* `dvc` (value: `"dvc"`)
* `git` (value: `"git"`)

