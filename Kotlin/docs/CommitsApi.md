# CommitsApi

All URIs are relative to *https://dagshub.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCommit**](CommitsApi.md#getCommit) | **GET** /repos/{owner}/{repo}/commits/{sha} | Get a single commit

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

