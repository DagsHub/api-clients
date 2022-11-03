# UserApi

All URIs are relative to *https://dagshub.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAuthenticatedUser**](UserApi.md#getAuthenticatedUser) | **GET** /user | Get authenticated user information
[**getUser**](UserApi.md#getUser) | **GET** /users/{username} | Get information about a user

<a name="getAuthenticatedUser"></a>
# **getAuthenticatedUser**
> getAuthenticatedUser()

Get authenticated user information

### Example
```kotlin
// Import classes:
//import dagshub_api.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = UserApi()
try {
    apiInstance.getAuthenticatedUser()
} catch (e: ClientException) {
    println("4xx response calling UserApi#getAuthenticatedUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserApi#getAuthenticatedUser")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUser"></a>
# **getUser**
> getUser(username)

Get information about a user

### Example
```kotlin
// Import classes:
//import dagshub_api.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = UserApi()
val username : kotlin.String = username_example // kotlin.String | A DagsHub username or organization name
try {
    apiInstance.getUser(username)
} catch (e: ClientException) {
    println("4xx response calling UserApi#getUser")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling UserApi#getUser")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **kotlin.String**| A DagsHub username or organization name |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

