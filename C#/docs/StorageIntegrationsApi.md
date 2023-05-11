# dagshub_api.Api.StorageIntegrationsApi

All URIs are relative to *https://dagshub.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetBucketContent**](StorageIntegrationsApi.md#getbucketcontent) | **GET** /repos/{owner}/{repo}/storage/content/{protocol}/{bucket}/{path} | List contents in the path
[**GetBucketFile**](StorageIntegrationsApi.md#getbucketfile) | **GET** /repos/{owner}/{repo}/storage/raw/{protocol}/{bucket}/{path} | Get file in the bucket
[**GetBuckets**](StorageIntegrationsApi.md#getbuckets) | **GET** /repos/{owner}/{repo}/storage | List integrated storages in the repository

<a name="getbucketcontent"></a>
# **GetBucketContent**
> Files1 GetBucketContent (string owner, string repo, string protocol, string bucket, string path, bool? includeSize = null, int? limit = null, string fromToken = null)

List contents in the path

### Example
```csharp
using System;
using System.Diagnostics;
using dagshub_api.Api;
using dagshub_api.Client;
using dagshub_api.Model;

namespace Example
{
    public class GetBucketContentExample
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

            var apiInstance = new StorageIntegrationsApi();
            var owner = owner_example;  // string | owner of the repository
            var repo = repo_example;  // string | name of the repository
            var protocol = protocol_example;  // string | protocol of the storage integration
            var bucket = bucket_example;  // string | name and prefix of the bucket integration
            var path = path_example;  // string | path of a folder in the repository
            var includeSize = true;  // bool? |  (optional)  (default to false)
            var limit = 56;  // int? | Maximum amount of items to return (optional)  (default to 100)
            var fromToken = fromToken_example;  // string | Token, from which to continue iteration (optional) 

            try
            {
                // List contents in the path
                Files1 result = apiInstance.GetBucketContent(owner, repo, protocol, bucket, path, includeSize, limit, fromToken);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling StorageIntegrationsApi.GetBucketContent: " + e.Message );
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
 **protocol** | **string**| protocol of the storage integration | 
 **bucket** | **string**| name and prefix of the bucket integration | 
 **path** | **string**| path of a folder in the repository | 
 **includeSize** | **bool?**|  | [optional] [default to false]
 **limit** | **int?**| Maximum amount of items to return | [optional] [default to 100]
 **fromToken** | **string**| Token, from which to continue iteration | [optional] 

### Return type

[**Files1**](Files1.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)
<a name="getbucketfile"></a>
# **GetBucketFile**
> void GetBucketFile (string owner, string repo, string protocol, string bucket, string path)

Get file in the bucket

### Example
```csharp
using System;
using System.Diagnostics;
using dagshub_api.Api;
using dagshub_api.Client;
using dagshub_api.Model;

namespace Example
{
    public class GetBucketFileExample
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

            var apiInstance = new StorageIntegrationsApi();
            var owner = owner_example;  // string | owner of the repository
            var repo = repo_example;  // string | name of the repository
            var protocol = protocol_example;  // string | protocol of the storage integration
            var bucket = bucket_example;  // string | name and prefix of the bucket integration
            var path = path_example;  // string | The content path

            try
            {
                // Get file in the bucket
                apiInstance.GetBucketFile(owner, repo, protocol, bucket, path);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling StorageIntegrationsApi.GetBucketFile: " + e.Message );
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
 **protocol** | **string**| protocol of the storage integration | 
 **bucket** | **string**| name and prefix of the bucket integration | 
 **path** | **string**| The content path | 

### Return type

void (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)
<a name="getbuckets"></a>
# **GetBuckets**
> Integration GetBuckets (string owner, string repo)

List integrated storages in the repository

### Example
```csharp
using System;
using System.Diagnostics;
using dagshub_api.Api;
using dagshub_api.Client;
using dagshub_api.Model;

namespace Example
{
    public class GetBucketsExample
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

            var apiInstance = new StorageIntegrationsApi();
            var owner = owner_example;  // string | owner of the repository
            var repo = repo_example;  // string | name of the repository

            try
            {
                // List integrated storages in the repository
                Integration result = apiInstance.GetBuckets(owner, repo);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling StorageIntegrationsApi.GetBuckets: " + e.Message );
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

### Return type

[**Integration**](Integration.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)
