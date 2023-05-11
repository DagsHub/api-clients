# dagshub_api.Api.ContentApi

All URIs are relative to *https://dagshub.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetArchive**](ContentApi.md#getarchive) | **GET** /repos/{owner}/{repo}/archive/{ref}{format} | Download archive
[**GetContent**](ContentApi.md#getcontent) | **GET** /repos/{owner}/{repo}/content/{branch}/{path} | List data in a repository folder
[**GetRaw**](ContentApi.md#getraw) | **GET** /repos/{owner}/{repo}/raw/{ref}/{path} | Download raw content
[**UploadContent**](ContentApi.md#uploadcontent) | **PUT** /repos/{owner}/{repo}/content/{branch}/{path} | Upload data to a repository

<a name="getarchive"></a>
# **GetArchive**
> void GetArchive (string owner, string repo, string _ref, string format)

Download archive

This method returns archive by given format.

### Example
```csharp
using System;
using System.Diagnostics;
using dagshub_api.Api;
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
            var owner = owner_example;  // string | owner of the repository
            var repo = repo_example;  // string | name of the repository
            var _ref = _ref_example;  // string | The name of the commit/branch/tag
            var format = format_example;  // string | The format of archive, either .zip or .tar.gz

            try
            {
                // Download archive
                apiInstance.GetArchive(owner, repo, _ref, format);
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
 **owner** | **string**| owner of the repository | 
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
<a name="getcontent"></a>
# **GetContent**
> Files GetContent (string owner, string repo, string branch, string path, bool? includeSize = null)

List data in a repository folder

List files, commit sha1, and versioning type for a folder in repository.  To get sizes add to the query param `include_size=true`. May result in a slower response. 

### Example
```csharp
using System;
using System.Diagnostics;
using dagshub_api.Api;
using dagshub_api.Client;
using dagshub_api.Model;

namespace Example
{
    public class GetContentExample
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
            var owner = owner_example;  // string | owner of the repository
            var repo = repo_example;  // string | name of the repository
            var branch = branch_example;  // string | branch of the repository
            var path = path_example;  // string | path of a folder in the repository
            var includeSize = true;  // bool? |  (optional)  (default to false)

            try
            {
                // List data in a repository folder
                Files result = apiInstance.GetContent(owner, repo, branch, path, includeSize);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling ContentApi.GetContent: " + e.Message );
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
 **branch** | **string**| branch of the repository | 
 **path** | **string**| path of a folder in the repository | 
 **includeSize** | **bool?**|  | [optional] [default to false]

### Return type

[**Files**](Files.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)
<a name="getraw"></a>
# **GetRaw**
> void GetRaw (string owner, string repo, string _ref, string path)

Download raw content

This method returns the raw content of a file.

### Example
```csharp
using System;
using System.Diagnostics;
using dagshub_api.Api;
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
            var owner = owner_example;  // string | owner of the repository
            var repo = repo_example;  // string | name of the repository
            var _ref = _ref_example;  // string | The name of the commit/branch/tag
            var path = path_example;  // string | The content path

            try
            {
                // Download raw content
                apiInstance.GetRaw(owner, repo, _ref, path);
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
 **owner** | **string**| owner of the repository | 
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
<a name="uploadcontent"></a>
# **UploadContent**
> void UploadContent (string owner, string repo, string branch, string path, string commitSummary = null, string commitMessage = null, string commitChoice = null, string lastCommit = null, string newBranchName = null, string versioning = null, string files = null)

Upload data to a repository

### Example
```csharp
using System;
using System.Diagnostics;
using dagshub_api.Api;
using dagshub_api.Client;
using dagshub_api.Model;

namespace Example
{
    public class UploadContentExample
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
            var owner = owner_example;  // string | owner of the repository
            var repo = repo_example;  // string | name of the repository
            var branch = branch_example;  // string | branch of the repository
            var path = path_example;  // string | path of a folder in the repository
            var commitSummary = commitSummary_example;  // string |  (optional) 
            var commitMessage = commitMessage_example;  // string |  (optional) 
            var commitChoice = commitChoice_example;  // string |  (optional) 
            var lastCommit = lastCommit_example;  // string |  (optional) 
            var newBranchName = newBranchName_example;  // string |  (optional) 
            var versioning = versioning_example;  // string |  (optional) 
            var files = files_example;  // string |  (optional) 

            try
            {
                // Upload data to a repository
                apiInstance.UploadContent(owner, repo, branch, path, commitSummary, commitMessage, commitChoice, lastCommit, newBranchName, versioning, files);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling ContentApi.UploadContent: " + e.Message );
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
 **branch** | **string**| branch of the repository | 
 **path** | **string**| path of a folder in the repository | 
 **commitSummary** | **string**|  | [optional] 
 **commitMessage** | **string**|  | [optional] 
 **commitChoice** | **string**|  | [optional] 
 **lastCommit** | **string**|  | [optional] 
 **newBranchName** | **string**|  | [optional] 
 **versioning** | **string**|  | [optional] 
 **files** | **string**|  | [optional] 

### Return type

void (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)
