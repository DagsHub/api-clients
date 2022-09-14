# ContentApi

All URIs are relative to *http://dagshub.com/api/v1/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getArchive**](ContentApi.md#getArchive) | **GET** /repos/{username}/{repo}/archive/{ref}/{format} | Download archive
[**getRaw**](ContentApi.md#getRaw) | **GET** /repos/{username}/{repo}/raw/{ref}/{path} | Download raw content

<a name="getArchive"></a>
# **getArchive**
> getArchive(username, repo, ref, format)

Download archive

This method returns archive by given format.

### Example
```kotlin
// Import classes:
//import dagshub-api.infrastructure.*
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

<a name="getRaw"></a>
# **getRaw**
> getRaw(username, repo, ref, path)

Download raw content

This method returns the raw content of a file.

### Example
```kotlin
// Import classes:
//import dagshub-api.infrastructure.*
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

