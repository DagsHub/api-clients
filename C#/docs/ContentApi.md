# dagshub_api.dagshub_api.ContentApi

All URIs are relative to *http://dagshub.com/api/v1/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetArchive**](ContentApi.md#getarchive) | **GET** /repos/{username}/{repo}/archive/{ref}/{format} | Download archive
[**GetRaw**](ContentApi.md#getraw) | **GET** /repos/{username}/{repo}/raw/{ref}/{path} | Download raw content

<a name="getarchive"></a>
# **GetArchive**
> void GetArchive (string username, string repo, string _ref, string format)

Download archive

This method returns archive by given format.

### Example
```csharp
using System;
using System.Diagnostics;
using dagshub_api.dagshub_api;
using dagshub_api.Client;
using dagshub_api.Model;

namespace Example
{
    public class GetArchiveExample
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

            var apiInstance = new ContentApi();
            var username = username_example;  // string | A DagsHub username
            var repo = repo_example;  // string | name of the repository
            var _ref = _ref_example;  // string | The name of the commit/branch/tag
            var format = format_example;  // string | The format of archive, either .zip or .tar.gz

            try
            {
                // Download archive
                apiInstance.GetArchive(username, repo, _ref, format);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling ContentApi.GetArchive: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **string**| A DagsHub username | 
 **repo** | **string**| name of the repository | 
 **_ref** | **string**| The name of the commit/branch/tag | 
 **format** | **string**| The format of archive, either .zip or .tar.gz | 

### Return type

void (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)
<a name="getraw"></a>
# **GetRaw**
> void GetRaw (string username, string repo, string _ref, string path)

Download raw content

This method returns the raw content of a file.

### Example
```csharp
using System;
using System.Diagnostics;
using dagshub_api.dagshub_api;
using dagshub_api.Client;
using dagshub_api.Model;

namespace Example
{
    public class GetRawExample
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

            var apiInstance = new ContentApi();
            var username = username_example;  // string | A DagsHub username
            var repo = repo_example;  // string | name of the repository
            var _ref = _ref_example;  // string | The name of the commit/branch/tag
            var path = path_example;  // string | The content path

            try
            {
                // Download raw content
                apiInstance.GetRaw(username, repo, _ref, path);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling ContentApi.GetRaw: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **string**| A DagsHub username | 
 **repo** | **string**| name of the repository | 
 **_ref** | **string**| The name of the commit/branch/tag | 
 **path** | **string**| The content path | 

### Return type

void (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)
