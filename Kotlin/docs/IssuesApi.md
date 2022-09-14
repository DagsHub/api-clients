# IssuesApi

All URIs are relative to *http://dagshub.com/api/v1/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createIssue**](IssuesApi.md#createIssue) | **POST** /repos/{owner}/{repo}/issues | Create an issue
[**editIssue**](IssuesApi.md#editIssue) | **PATCH** /repos/{owner}/{repo}/issues | Edit an issue
[**getIssue**](IssuesApi.md#getIssue) | **GET** /repos/{owner}/{repo}/issues/{index} | Get a single issue
[**listRepoIssues**](IssuesApi.md#listRepoIssues) | **GET** /repos/{owner}/{repo}/issues | List issues for a repository

<a name="createIssue"></a>
# **createIssue**
> Issue createIssue(owner, repo, body)

Create an issue

Any user with read access to a repository can create an issue.

### Example
```kotlin
// Import classes:
//import dagshub-api.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = IssuesApi()
val owner : kotlin.String = owner_example // kotlin.String | owner of the repository
val repo : kotlin.String = repo_example // kotlin.String | name of the repository
val body : PostIssue =  // PostIssue | 
try {
    val result : Issue = apiInstance.createIssue(owner, repo, body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling IssuesApi#createIssue")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IssuesApi#createIssue")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| owner of the repository |
 **repo** | **kotlin.String**| name of the repository |
 **body** | [**PostIssue**](PostIssue.md)|  | [optional]

### Return type

[**Issue**](Issue.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="editIssue"></a>
# **editIssue**
> Issue editIssue(owner, repo, body)

Edit an issue

### Example
```kotlin
// Import classes:
//import dagshub-api.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = IssuesApi()
val owner : kotlin.String = owner_example // kotlin.String | owner of the repository
val repo : kotlin.String = repo_example // kotlin.String | name of the repository
val body : PatchIssue =  // PatchIssue | 
try {
    val result : Issue = apiInstance.editIssue(owner, repo, body)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling IssuesApi#editIssue")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IssuesApi#editIssue")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| owner of the repository |
 **repo** | **kotlin.String**| name of the repository |
 **body** | [**PatchIssue**](PatchIssue.md)|  | [optional]

### Return type

[**Issue**](Issue.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getIssue"></a>
# **getIssue**
> Issue getIssue(owner, repo, index)

Get a single issue

This endpoint may also return pull requests in the response. If an issue is a pull request, the object will include a pull_request key.

### Example
```kotlin
// Import classes:
//import dagshub-api.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = IssuesApi()
val owner : kotlin.String = owner_example // kotlin.String | owner of the repository
val repo : kotlin.String = repo_example // kotlin.String | name of the repository
val index : kotlin.Int = 56 // kotlin.Int | the index of an issue or a pull request
try {
    val result : Issue = apiInstance.getIssue(owner, repo, index)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling IssuesApi#getIssue")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IssuesApi#getIssue")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| owner of the repository |
 **repo** | **kotlin.String**| name of the repository |
 **index** | **kotlin.Int**| the index of an issue or a pull request |

### Return type

[**Issue**](Issue.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listRepoIssues"></a>
# **listRepoIssues**
> Issues listRepoIssues(owner, repo)

List issues for a repository

This endpoint may also return pull requests in the response. If an issue is a pull request, the object will include a pull_request key.

### Example
```kotlin
// Import classes:
//import dagshub-api.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = IssuesApi()
val owner : kotlin.String = owner_example // kotlin.String | owner of the repository
val repo : kotlin.String = repo_example // kotlin.String | name of the repository
try {
    val result : Issues = apiInstance.listRepoIssues(owner, repo)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling IssuesApi#listRepoIssues")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling IssuesApi#listRepoIssues")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| owner of the repository |
 **repo** | **kotlin.String**| name of the repository |

### Return type

[**Issues**](Issues.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

