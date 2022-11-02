# ReleasesApi

All URIs are relative to *https://dagshub.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listReleases**](ReleasesApi.md#listReleases) | **GET** /repos/{owner}/{repo}/releases | List Releases

<a name="listReleases"></a>
# **listReleases**
> listReleases(owner, repo)

List Releases

### Example
```kotlin
// Import classes:
//import dagshub_api.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = ReleasesApi()
val owner : kotlin.String = owner_example // kotlin.String | owner of the repository
val repo : kotlin.String = repo_example // kotlin.String | name of the repository
try {
    apiInstance.listReleases(owner, repo)
} catch (e: ClientException) {
    println("4xx response calling ReleasesApi#listReleases")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReleasesApi#listReleases")
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

