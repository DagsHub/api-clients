# WebhooksApi

All URIs are relative to *http://dagshub.com/api/v1/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createHook**](WebhooksApi.md#createHook) | **POST** /repos/{owner}/{repo}/hooks | Create a hook
[**deleteHook**](WebhooksApi.md#deleteHook) | **DELETE** /repos/{owner}/{repo}/hooks/{id} | Delete a hook
[**editHook**](WebhooksApi.md#editHook) | **PATCH** /repos/{owner}/{repo}/hooks/{id} | Edit a hook
[**listHooks**](WebhooksApi.md#listHooks) | **GET** /repos/{owner}/{repo}/hooks | List hooks

<a name="createHook"></a>
# **createHook**
> createHook(owner, repo, body)

Create a hook

### Example
```kotlin
// Import classes:
//import dagshub_api.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = WebhooksApi()
val owner : kotlin.String = owner_example // kotlin.String | owner of the repository
val repo : kotlin.String = repo_example // kotlin.String | name of the repository
val body : RepoHooksBody =  // RepoHooksBody | 
try {
    apiInstance.createHook(owner, repo, body)
} catch (e: ClientException) {
    println("4xx response calling WebhooksApi#createHook")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebhooksApi#createHook")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| owner of the repository |
 **repo** | **kotlin.String**| name of the repository |
 **body** | [**RepoHooksBody**](RepoHooksBody.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="deleteHook"></a>
# **deleteHook**
> deleteHook(owner, repo, id)

Delete a hook

### Example
```kotlin
// Import classes:
//import dagshub_api.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = WebhooksApi()
val owner : kotlin.String = owner_example // kotlin.String | owner of the repository
val repo : kotlin.String = repo_example // kotlin.String | name of the repository
val id : kotlin.Int = 56 // kotlin.Int | 
try {
    apiInstance.deleteHook(owner, repo, id)
} catch (e: ClientException) {
    println("4xx response calling WebhooksApi#deleteHook")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebhooksApi#deleteHook")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| owner of the repository |
 **repo** | **kotlin.String**| name of the repository |
 **id** | **kotlin.Int**|  |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="editHook"></a>
# **editHook**
> editHook(owner, repo, id, body)

Edit a hook

### Example
```kotlin
// Import classes:
//import dagshub_api.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = WebhooksApi()
val owner : kotlin.String = owner_example // kotlin.String | owner of the repository
val repo : kotlin.String = repo_example // kotlin.String | name of the repository
val id : kotlin.Int = 56 // kotlin.Int | 
val body : HooksIdBody =  // HooksIdBody | 
try {
    apiInstance.editHook(owner, repo, id, body)
} catch (e: ClientException) {
    println("4xx response calling WebhooksApi#editHook")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebhooksApi#editHook")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| owner of the repository |
 **repo** | **kotlin.String**| name of the repository |
 **id** | **kotlin.Int**|  |
 **body** | [**HooksIdBody**](HooksIdBody.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="listHooks"></a>
# **listHooks**
> listHooks(owner, repo)

List hooks

### Example
```kotlin
// Import classes:
//import dagshub_api.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = WebhooksApi()
val owner : kotlin.String = owner_example // kotlin.String | owner of the repository
val repo : kotlin.String = repo_example // kotlin.String | name of the repository
try {
    apiInstance.listHooks(owner, repo)
} catch (e: ClientException) {
    println("4xx response calling WebhooksApi#listHooks")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WebhooksApi#listHooks")
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

