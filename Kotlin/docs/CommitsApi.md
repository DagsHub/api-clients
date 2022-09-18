# CommitsApi

All URIs are relative to *http://dagshub.com/api/v1/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCommit**](CommitsApi.md#getCommit) | **GET** /repos/{owner}/{repo}/commits/{sha} | Get a single commit
[**getCommitSha1**](CommitsApi.md#getCommitSha1) | **GET** /repos/{owner}/{repo}/commits/{ref} | Get the SHA-1 of a commit reference

<a name="getCommit"></a>
# **getCommit**
> getCommit(owner, repo, sha)

Get a single commit

### Example
```kotlin
// Import classes:
//import dagshub_api.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = CommitsApi()
val owner : kotlin.String = owner_example // kotlin.String | owner of the repository
val repo : kotlin.String = repo_example // kotlin.String | name of the repository
val sha : kotlin.String = sha_example // kotlin.String | a SHA1 of a commit
try {
    apiInstance.getCommit(owner, repo, sha)
} catch (e: ClientException) {
    println("4xx response calling CommitsApi#getCommit")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CommitsApi#getCommit")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| owner of the repository |
 **repo** | **kotlin.String**| name of the repository |
 **sha** | **kotlin.String**| a SHA1 of a commit |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCommitSha1"></a>
# **getCommitSha1**
> kotlin.String getCommitSha1(owner, repo, ref)

Get the SHA-1 of a commit reference

### Example
```kotlin
// Import classes:
//import dagshub_api.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = CommitsApi()
val owner : kotlin.String = owner_example // kotlin.String | owner of the repository
val repo : kotlin.String = repo_example // kotlin.String | name of the repository
val ref : kotlin.String = ref_example // kotlin.String | The name of the commit/branch/tag
try {
    val result : kotlin.String = apiInstance.getCommitSha1(owner, repo, ref)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling CommitsApi#getCommitSha1")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CommitsApi#getCommitSha1")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| owner of the repository |
 **repo** | **kotlin.String**| name of the repository |
 **ref** | **kotlin.String**| The name of the commit/branch/tag |

### Return type

**kotlin.String**

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

