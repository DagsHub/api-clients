# {{classname}}

All URIs are relative to *http://dagshub.com/api/v1/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetArchive**](ContentApi.md#GetArchive) | **Get** /repos/{username}/{repo}/archive/{ref}/{format} | Download archive
[**GetRaw**](ContentApi.md#GetRaw) | **Get** /repos/{username}/{repo}/raw/{ref}/{path} | Download raw content

# **GetArchive**
> GetArchive(ctx, username, repo, ref, format)
Download archive

This method returns archive by given format.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **username** | **string**| A DagsHub username | 
  **repo** | **string**| name of the repository | 
  **ref** | **string**| The name of the commit/branch/tag | 
  **format** | **string**| The format of archive, either .zip or .tar.gz | 

### Return type

 (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **GetRaw**
> GetRaw(ctx, username, repo, ref, path)
Download raw content

This method returns the raw content of a file.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **username** | **string**| A DagsHub username | 
  **repo** | **string**| name of the repository | 
  **ref** | **string**| The name of the commit/branch/tag | 
  **path** | **string**| The content path | 

### Return type

 (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

