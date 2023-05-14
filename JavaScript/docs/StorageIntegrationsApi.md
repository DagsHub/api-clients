# DagsHubApi.StorageIntegrationsApi

All URIs are relative to *https://dagshub.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getBucketContent**](StorageIntegrationsApi.md#getBucketContent) | **GET** /repos/{owner}/{repo}/storage/content/{protocol}/{bucket}/{path} | List contents in the path
[**getBucketFile**](StorageIntegrationsApi.md#getBucketFile) | **GET** /repos/{owner}/{repo}/storage/raw/{protocol}/{bucket}/{path} | Get file in the bucket
[**getBuckets**](StorageIntegrationsApi.md#getBuckets) | **GET** /repos/{owner}/{repo}/storage | List integrated storages in the repository

<a name="getBucketContent"></a>
# **getBucketContent**
> Files1 getBucketContent(owner, repo, protocol, bucket, path, opts)

List contents in the path

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

let apiInstance = new DagsHubApi.StorageIntegrationsApi();
let owner = "owner_example"; // String | owner of the repository
let repo = "repo_example"; // String | name of the repository
let protocol = "protocol_example"; // String | protocol of the storage integration
let bucket = "bucket_example"; // String | name and prefix of the bucket integration
let path = "path_example"; // String | path of a folder in the repository
let opts = { 
  'includeSize': false, // Boolean | 
  'limit': 100, // Number | Maximum amount of items to return
  'fromToken': "fromToken_example" // String | Token, from which to continue iteration
};
apiInstance.getBucketContent(owner, repo, protocol, bucket, path, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**| owner of the repository | 
 **repo** | **String**| name of the repository | 
 **protocol** | **String**| protocol of the storage integration | 
 **bucket** | **String**| name and prefix of the bucket integration | 
 **path** | **String**| path of a folder in the repository | 
 **includeSize** | **Boolean**|  | [optional] [default to false]
 **limit** | **Number**| Maximum amount of items to return | [optional] [default to 100]
 **fromToken** | **String**| Token, from which to continue iteration | [optional] 

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

let apiInstance = new DagsHubApi.StorageIntegrationsApi();
let owner = "owner_example"; // String | owner of the repository
let repo = "repo_example"; // String | name of the repository
let protocol = "protocol_example"; // String | protocol of the storage integration
let bucket = "bucket_example"; // String | name and prefix of the bucket integration
let path = "path_example"; // String | The content path

apiInstance.getBucketFile(owner, repo, protocol, bucket, path, (error, data, response) => {
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
 **owner** | **String**| owner of the repository | 
 **repo** | **String**| name of the repository | 
 **protocol** | **String**| protocol of the storage integration | 
 **bucket** | **String**| name and prefix of the bucket integration | 
 **path** | **String**| The content path | 

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

let apiInstance = new DagsHubApi.StorageIntegrationsApi();
let owner = "owner_example"; // String | owner of the repository
let repo = "repo_example"; // String | name of the repository

apiInstance.getBuckets(owner, repo, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**| owner of the repository | 
 **repo** | **String**| name of the repository | 

### Return type

[**Integration**](Integration.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

