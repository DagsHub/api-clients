# ContentApi

All URIs are relative to *https://dagshub.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getArchive**](ContentApi.md#getArchive) | **GET** /repos/{username}/{repo}/archive/{ref}/{format} | Download archive
[**getContent**](ContentApi.md#getContent) | **GET** /repos/{owner}/{repo}/content/{branch}/{path} | List data in a repository folder
[**getRaw**](ContentApi.md#getRaw) | **GET** /repos/{username}/{repo}/raw/{ref}/{path} | Download raw content
[**uploadContent**](ContentApi.md#uploadContent) | **PUT** /repos/{owner}/{repo}/content/{branch}/{path} | Upload data to a repository

<a name="getArchive"></a>
# **getArchive**
> getArchive(username, repo, ref, format)

Download archive

This method returns archive by given format.

### Example
```kotlin
// Import classes:
//import dagshub_api.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = ContentApi()
val username : kotlin.String = username_example // kotlin.String | A DagsHub username
val repo : kotlin.String = repo_example // kotlin.String | name of the repository
val ref : kotlin.String = ref_example // kotlin.String | The name of the commit/branch/tag
val format : kotlin.String = format_example // kotlin.String | The format of archive, either .zip or .tar.gz
try {
    apiInstance.getArchive(username, repo, ref, format)
} catch (e: ClientException) {
    println("4xx response calling ContentApi#getArchive")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContentApi#getArchive")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **kotlin.String**| A DagsHub username |
 **repo** | **kotlin.String**| name of the repository |
 **ref** | **kotlin.String**| The name of the commit/branch/tag |
 **format** | **kotlin.String**| The format of archive, either .zip or .tar.gz | [enum: .zip, .tar.gz]

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getContent"></a>
# **getContent**
> Files getContent(owner, repo, branch, path, includeSize)

List data in a repository folder

List files, commit sha1, and versioning type for a folder in repository.  To get sizes add to the query param &#x60;include_size&#x3D;true&#x60;. May result slower response. 

### Example
```kotlin
// Import classes:
//import dagshub_api.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = ContentApi()
val owner : kotlin.String = owner_example // kotlin.String | owner of the repository
val repo : kotlin.String = repo_example // kotlin.String | name of the repository
val branch : kotlin.String = branch_example // kotlin.String | branch of the repository
val path : kotlin.String = path_example // kotlin.String | path of a folder in the repository
val includeSize : kotlin.Boolean = true // kotlin.Boolean | 
try {
    val result : Files = apiInstance.getContent(owner, repo, branch, path, includeSize)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ContentApi#getContent")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContentApi#getContent")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| owner of the repository |
 **repo** | **kotlin.String**| name of the repository |
 **branch** | **kotlin.String**| branch of the repository |
 **path** | **kotlin.String**| path of a folder in the repository |
 **includeSize** | **kotlin.Boolean**|  | [optional] [default to false]

### Return type

[**Files**](Files.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getRaw"></a>
# **getRaw**
> getRaw(username, repo, ref, path)

Download raw content

This method returns the raw content of a file.

### Example
```kotlin
// Import classes:
//import dagshub_api.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = ContentApi()
val username : kotlin.String = username_example // kotlin.String | A DagsHub username
val repo : kotlin.String = repo_example // kotlin.String | name of the repository
val ref : kotlin.String = ref_example // kotlin.String | The name of the commit/branch/tag
val path : kotlin.String = path_example // kotlin.String | The content path
try {
    apiInstance.getRaw(username, repo, ref, path)
} catch (e: ClientException) {
    println("4xx response calling ContentApi#getRaw")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContentApi#getRaw")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **kotlin.String**| A DagsHub username |
 **repo** | **kotlin.String**| name of the repository |
 **ref** | **kotlin.String**| The name of the commit/branch/tag |
 **path** | **kotlin.String**| The content path |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="uploadContent"></a>
# **uploadContent**
> uploadContent(owner, repo, branch, path, commitSummary, commitMessage, commitChoice, lastCommit, newBranchName, versioning, files)

Upload data to a repository

### Example
```kotlin
// Import classes:
//import dagshub_api.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = ContentApi()
val owner : kotlin.String = owner_example // kotlin.String | owner of the repository
val repo : kotlin.String = repo_example // kotlin.String | name of the repository
val branch : kotlin.String = branch_example // kotlin.String | branch of the repository
val path : kotlin.String = path_example // kotlin.String | path of a folder in the repository
val commitSummary : kotlin.String = commitSummary_example // kotlin.String | 
val commitMessage : kotlin.String = commitMessage_example // kotlin.String | 
val commitChoice : kotlin.String = commitChoice_example // kotlin.String | 
val lastCommit : kotlin.String = lastCommit_example // kotlin.String | 
val newBranchName : kotlin.String = newBranchName_example // kotlin.String | 
val versioning : kotlin.String = versioning_example // kotlin.String | 
val files : kotlin.String = files_example // kotlin.String | 
try {
    apiInstance.uploadContent(owner, repo, branch, path, commitSummary, commitMessage, commitChoice, lastCommit, newBranchName, versioning, files)
} catch (e: ClientException) {
    println("4xx response calling ContentApi#uploadContent")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ContentApi#uploadContent")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| owner of the repository |
 **repo** | **kotlin.String**| name of the repository |
 **branch** | **kotlin.String**| branch of the repository |
 **path** | **kotlin.String**| path of a folder in the repository |
 **commitSummary** | **kotlin.String**|  | [optional]
 **commitMessage** | **kotlin.String**|  | [optional]
 **commitChoice** | **kotlin.String**|  | [optional] [enum: direct, commit-to-new-branch]
 **lastCommit** | **kotlin.String**|  | [optional]
 **newBranchName** | **kotlin.String**|  | [optional]
 **versioning** | **kotlin.String**|  | [optional] [enum: auto, dvc, git]
 **files** | **kotlin.String**|  | [optional]

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: Not defined

