# StorageIntegrationsApi

All URIs are relative to *https://dagshub.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getBucketContent**](StorageIntegrationsApi.md#getBucketContent) | **GET** /repos/{owner}/{repo}/storage/content/{protocol}/{bucket}/{path} | List contents in the path
[**getBucketFile**](StorageIntegrationsApi.md#getBucketFile) | **GET** /repos/{owner}/{repo}/storage/raw/{protocol}/{bucket}/{path} | Get file in the bucket
[**getBuckets**](StorageIntegrationsApi.md#getBuckets) | **GET** /repos/{owner}/{repo}/storage | List integrated storages in the repository

<a name="getBucketContent"></a>
# **getBucketContent**
> Files1 getBucketContent(owner, repo, protocol, bucket, path, includeSize, limit, fromToken)

List contents in the path

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.StorageIntegrationsApi;

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

StorageIntegrationsApi apiInstance = new StorageIntegrationsApi();
String owner = "owner_example"; // String | owner of the repository
String repo = "repo_example"; // String | name of the repository
String protocol = "protocol_example"; // String | protocol of the storage integration
String bucket = "bucket_example"; // String | name and prefix of the bucket integration
String path = "path_example"; // String | path of a folder in the repository
Boolean includeSize = false; // Boolean | 
Integer limit = 100; // Integer | Maximum amount of items to return
String fromToken = "fromToken_example"; // String | Token, from which to continue iteration
try {
    Files1 result = apiInstance.getBucketContent(owner, repo, protocol, bucket, path, includeSize, limit, fromToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorageIntegrationsApi#getBucketContent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**| owner of the repository |
 **repo** | **String**| name of the repository |
 **protocol** | **String**| protocol of the storage integration | [enum: gs, s3]
 **bucket** | **String**| name and prefix of the bucket integration |
 **path** | **String**| path of a folder in the repository |
 **includeSize** | **Boolean**|  | [optional] [default to false]
 **limit** | **Integer**| Maximum amount of items to return | [optional] [default to 100]
 **fromToken** | **String**| Token, from which to continue iteration | [optional]

### Return type

[**Files1**](Files1.md)

### Authorization

[basicAuth](../README.md#basicAuth)[tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBucketFile"></a>
# **getBucketFile**
> getBucketFile(owner, repo, protocol, bucket, path)

Get file in the bucket

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.StorageIntegrationsApi;

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

StorageIntegrationsApi apiInstance = new StorageIntegrationsApi();
String owner = "owner_example"; // String | owner of the repository
String repo = "repo_example"; // String | name of the repository
String protocol = "protocol_example"; // String | protocol of the storage integration
String bucket = "bucket_example"; // String | name and prefix of the bucket integration
String path = "path_example"; // String | The content path
try {
    apiInstance.getBucketFile(owner, repo, protocol, bucket, path);
} catch (ApiException e) {
    System.err.println("Exception when calling StorageIntegrationsApi#getBucketFile");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**| owner of the repository |
 **repo** | **String**| name of the repository |
 **protocol** | **String**| protocol of the storage integration | [enum: gs, s3]
 **bucket** | **String**| name and prefix of the bucket integration |
 **path** | **String**| The content path |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)[tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getBuckets"></a>
# **getBuckets**
> Integration getBuckets(owner, repo)

List integrated storages in the repository

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.StorageIntegrationsApi;

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

StorageIntegrationsApi apiInstance = new StorageIntegrationsApi();
String owner = "owner_example"; // String | owner of the repository
String repo = "repo_example"; // String | name of the repository
try {
    Integration result = apiInstance.getBuckets(owner, repo);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling StorageIntegrationsApi#getBuckets");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**| owner of the repository |
 **repo** | **String**| name of the repository |

### Return type

[**Integration**](Integration.md)

### Authorization

[basicAuth](../README.md#basicAuth)[tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

