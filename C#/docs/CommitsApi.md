# dagshub_api.Api.CommitsApi

All URIs are relative to *https://dagshub.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetCommit**](CommitsApi.md#getcommit) | **GET** /repos/{owner}/{repo}/commits/{sha} | Get a single commit

<a name="getcommit"></a>
# **GetCommit**
> void GetCommit (string owner, string repo, string sha)

Get a single commit

### Example
```csharp
using System;
using System.Diagnostics;
using dagshub_api.Api;
using dagshub_api.Client;
using dagshub_api.Model;

namespace Example
{
    public class GetCommitExample
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

            var apiInstance = new CommitsApi();
            var owner = owner_example;  // string | owner of the repository
            var repo = repo_example;  // string | name of the repository
            var sha = sha_example;  // string | a SHA1 of a commit

            try
            {
                // Get a single commit
                apiInstance.GetCommit(owner, repo, sha);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling CommitsApi.GetCommit: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **string**| owner of the repository | 
 **repo** | **string**| name of the repository | 
 **sha** | **string**| a SHA1 of a commit | 

### Return type

void (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)
