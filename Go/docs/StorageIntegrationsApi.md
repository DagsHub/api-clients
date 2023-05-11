# {{classname}}

All URIs are relative to *https://dagshub.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetBucketContent**](StorageIntegrationsApi.md#GetBucketContent) | **Get** /repos/{owner}/{repo}/storage/content/{protocol}/{bucket}/{path} | List contents in the path
[**GetBucketFile**](StorageIntegrationsApi.md#GetBucketFile) | **Get** /repos/{owner}/{repo}/storage/raw/{protocol}/{bucket}/{path} | Get file in the bucket
[**GetBuckets**](StorageIntegrationsApi.md#GetBuckets) | **Get** /repos/{owner}/{repo}/storage | List integrated storages in the repository

# **GetBucketContent**
> Files1 GetBucketContent(ctx, owner, repo, protocol, bucket, path, optional)
List contents in the path

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **owner** | **string**| owner of the repository | 
  **repo** | **string**| name of the repository | 
  **protocol** | **string**| protocol of the storage integration | 
  **bucket** | **string**| name and prefix of the bucket integration | 
  **path** | **string**| path of a folder in the repository | 
 **optional** | ***StorageIntegrationsApiGetBucketContentOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a StorageIntegrationsApiGetBucketContentOpts struct
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------





 **includeSize** | **optional.Bool**|  | [default to false]
 **limit** | **optional.Int32**| Maximum amount of items to return | [default to 100]
 **fromToken** | **optional.String**| Token, from which to continue iteration | 

### Return type

[**Files1**](Files_1.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **GetBucketFile**
> GetBucketFile(ctx, owner, repo, protocol, bucket, path)
Get file in the bucket

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **owner** | **string**| owner of the repository | 
  **repo** | **string**| name of the repository | 
  **protocol** | **string**| protocol of the storage integration | 
  **bucket** | **string**| name and prefix of the bucket integration | 
  **path** | **string**| The content path | 

### Return type

 (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **GetBuckets**
> []IntegrationInner GetBuckets(ctx, owner, repo)
List integrated storages in the repository

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **owner** | **string**| owner of the repository | 
  **repo** | **string**| name of the repository | 

### Return type

[**[]IntegrationInner**](array.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

