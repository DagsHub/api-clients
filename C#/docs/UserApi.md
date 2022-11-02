# dagshub_api.Api.UserApi

All URIs are relative to *https://dagshub.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetAuthenticatedUser**](UserApi.md#getauthenticateduser) | **GET** /user | Get authenticated user information
[**GetUser**](UserApi.md#getuser) | **GET** /users/{username} | Get information about a user

<a name="getauthenticateduser"></a>
# **GetAuthenticatedUser**
> void GetAuthenticatedUser ()

Get authenticated user information

### Example
```csharp
using System;
using System.Diagnostics;
using dagshub_api.Api;
using dagshub_api.Client;
using dagshub_api.Model;

namespace Example
{
    public class GetAuthenticatedUserExample
    {
        public void main()
        {
            // Configure HTTP basic authorization: basicAuth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";
            // Configure API key authorization: tokenAuth
            Configuration.Default.AddApiKey("token", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.AddApiKeyPrefix("token", "Bearer");

            var apiInstance = new UserApi();

            try
            {
                // Get authenticated user information
                apiInstance.GetAuthenticatedUser();
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling UserApi.GetAuthenticatedUser: " + e.Message );
            }
        }
    }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

void (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)
<a name="getuser"></a>
# **GetUser**
> void GetUser (string username)

Get information about a user

### Example
```csharp
using System;
using System.Diagnostics;
using dagshub_api.Api;
using dagshub_api.Client;
using dagshub_api.Model;

namespace Example
{
    public class GetUserExample
    {
        public void main()
        {
            // Configure HTTP basic authorization: basicAuth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";
            // Configure API key authorization: tokenAuth
            Configuration.Default.AddApiKey("token", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.AddApiKeyPrefix("token", "Bearer");

            var apiInstance = new UserApi();
            var username = username_example;  // string | A DagsHub username

            try
            {
                // Get information about a user
                apiInstance.GetUser(username);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling UserApi.GetUser: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **string**| A DagsHub username | 

### Return type

void (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)
