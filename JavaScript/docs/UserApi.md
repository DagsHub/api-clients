# DagsHubApi.UserApi

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
```javascript
import {DagsHubApi} from 'dags_hub_api';
let defaultClient = DagsHubApi.ApiClient.instance;
// Configure HTTP basic authorization: basicAuth
let basicAuth = defaultClient.authentications['basicAuth'];
basicAuth.username = 'YOUR USERNAME';
basicAuth.password = 'YOUR PASSWORD';

// Configure API key authorization: tokenAuth
let tokenAuth = defaultClient.authentications['tokenAuth'];
tokenAuth.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//tokenAuth.apiKeyPrefix = 'Token';

let apiInstance = new DagsHubApi.UserApi();
apiInstance.getAuthenticatedUser((error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
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
```javascript
import {DagsHubApi} from 'dags_hub_api';
let defaultClient = DagsHubApi.ApiClient.instance;
// Configure HTTP basic authorization: basicAuth
let basicAuth = defaultClient.authentications['basicAuth'];
basicAuth.username = 'YOUR USERNAME';
basicAuth.password = 'YOUR PASSWORD';

// Configure API key authorization: tokenAuth
let tokenAuth = defaultClient.authentications['tokenAuth'];
tokenAuth.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//tokenAuth.apiKeyPrefix = 'Token';

let apiInstance = new DagsHubApi.UserApi();
let username = "username_example"; // String | A DagsHub username or organization name

apiInstance.getUser(username, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**| A DagsHub username or organization name | 

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

