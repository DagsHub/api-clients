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
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

// Configure API key authorization: tokenAuth
ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
tokenAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//tokenAuth.setApiKeyPrefix("Token");

UserApi apiInstance = new UserApi();
try {
    apiInstance.getAuthenticatedUser();
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#getAuthenticatedUser");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)[tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getUser"></a>
# **getUser**
> getUser(username)

Get information about a user

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.UserApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

// Configure API key authorization: tokenAuth
ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
tokenAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//tokenAuth.setApiKeyPrefix("Token");

UserApi apiInstance = new UserApi();
String username = "username_example"; // String | A DagsHub username or organization name
try {
    apiInstance.getUser(username);
} catch (ApiException e) {
    System.err.println("Exception when calling UserApi#getUser");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**| A DagsHub username or organization name |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)[tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

