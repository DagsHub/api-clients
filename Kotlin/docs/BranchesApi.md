# BranchesApi

All URIs are relative to *http://dagshub.com/api/v1/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getBranch**](BranchesApi.md#getBranch) | **GET** /repos/{owner}/{repo}/branches/{branch} | Get Branch
[**listBranches**](BranchesApi.md#listBranches) | **GET** /repos/{owner}/{repo}/branches | List Branches

<a name="getBranch"></a>
# **getBranch**
> getBranch(owner, repo, branch)

Get Branch

### Example
```kotlin
// Import classes:
//import dagshub-api.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = BranchesApi()
val owner : kotlin.String = owner_example // kotlin.String | owner of the repository
val repo : kotlin.String = repo_example // kotlin.String | name of the repository
val branch : kotlin.String = branch_example // kotlin.String | branch of the repository
try {
    apiInstance.getBranch(owner, repo, branch)
} catch (e: ClientException) {
    println("4xx response calling BranchesApi#getBranch")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BranchesApi#getBranch")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| owner of the repository |
 **repo** | **kotlin.String**| name of the repository |
 **branch** | **kotlin.String**| branch of the repository |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listBranches"></a>
# **listBranches**
> listBranches(owner, repo)

List Branches

### Example
```kotlin
// Import classes:
//import dagshub-api.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = BranchesApi()
val owner : kotlin.String = owner_example // kotlin.String | owner of the repository
val repo : kotlin.String = repo_example // kotlin.String | name of the repository
try {
    apiInstance.listBranches(owner, repo)
} catch (e: ClientException) {
    println("4xx response calling BranchesApi#listBranches")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BranchesApi#listBranches")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| owner of the repository |
 **repo** | **kotlin.String**| name of the repository |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

