# StorageIntegrationsApi

All URIs are relative to *https://dagshub.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getBucketContent**](StorageIntegrationsApi.md#getBucketContent) | **GET** /repos/{owner}/{repo}/storage/content/{protocol}/{bucket}/{path} | List contents in the path
[**getBucketFile**](StorageIntegrationsApi.md#getBucketFile) | **GET** /repos/{owner}/{repo}/storage/raw/{protocol}/{bucket}/{path} | Get file in the bucket
[**getBuckets**](StorageIntegrationsApi.md#getBuckets) | **GET** /repos/{owner}/{repo}/storage | List integrated storages in the repository

<a name="getBucketContent"></a>
# **getBucketContent**
> Files1 getBucketContent(owner, repo, protocol, bucket, path, includeSize, limit, fromToken)

List contents in the path

### Example
```kotlin
// Import classes:
//import dagshub_api.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = StorageIntegrationsApi()
val owner : kotlin.String = owner_example // kotlin.String | owner of the repository
val repo : kotlin.String = repo_example // kotlin.String | name of the repository
val protocol : kotlin.String = protocol_example // kotlin.String | protocol of the storage integration
val bucket : kotlin.String = bucket_example // kotlin.String | name and prefix of the bucket integration
val path : kotlin.String = path_example // kotlin.String | path of a folder in the repository
val includeSize : kotlin.Boolean = true // kotlin.Boolean | 
val limit : kotlin.Int = 56 // kotlin.Int | Maximum amount of items to return
val fromToken : kotlin.String = fromToken_example // kotlin.String | Token, from which to continue iteration
try {
    val result : Files1 = apiInstance.getBucketContent(owner, repo, protocol, bucket, path, includeSize, limit, fromToken)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StorageIntegrationsApi#getBucketContent")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StorageIntegrationsApi#getBucketContent")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| owner of the repository |
 **repo** | **kotlin.String**| name of the repository |
 **protocol** | **kotlin.String**| protocol of the storage integration | [enum: gs, s3]
 **bucket** | **kotlin.String**| name and prefix of the bucket integration |
 **path** | **kotlin.String**| path of a folder in the repository |
 **includeSize** | **kotlin.Boolean**|  | [optional] [default to false]
 **limit** | **kotlin.Int**| Maximum amount of items to return | [optional] [default to 100]
 **fromToken** | **kotlin.String**| Token, from which to continue iteration | [optional]

### Return type

[**Files1**](Files1.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBucketFile"></a>
# **getBucketFile**
> getBucketFile(owner, repo, protocol, bucket, path)

Get file in the bucket

### Example
```kotlin
// Import classes:
//import dagshub_api.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = StorageIntegrationsApi()
val owner : kotlin.String = owner_example // kotlin.String | owner of the repository
val repo : kotlin.String = repo_example // kotlin.String | name of the repository
val protocol : kotlin.String = protocol_example // kotlin.String | protocol of the storage integration
val bucket : kotlin.String = bucket_example // kotlin.String | name and prefix of the bucket integration
val path : kotlin.String = path_example // kotlin.String | The content path
try {
    apiInstance.getBucketFile(owner, repo, protocol, bucket, path)
} catch (e: ClientException) {
    println("4xx response calling StorageIntegrationsApi#getBucketFile")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StorageIntegrationsApi#getBucketFile")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| owner of the repository |
 **repo** | **kotlin.String**| name of the repository |
 **protocol** | **kotlin.String**| protocol of the storage integration | [enum: gs, s3]
 **bucket** | **kotlin.String**| name and prefix of the bucket integration |
 **path** | **kotlin.String**| The content path |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getBuckets"></a>
# **getBuckets**
> Integration getBuckets(owner, repo)

List integrated storages in the repository

### Example
```kotlin
// Import classes:
//import dagshub_api.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = StorageIntegrationsApi()
val owner : kotlin.String = owner_example // kotlin.String | owner of the repository
val repo : kotlin.String = repo_example // kotlin.String | name of the repository
try {
    val result : Integration = apiInstance.getBuckets(owner, repo)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling StorageIntegrationsApi#getBuckets")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling StorageIntegrationsApi#getBuckets")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| owner of the repository |
 **repo** | **kotlin.String**| name of the repository |

### Return type

[**Integration**](Integration.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

