# {{classname}}

All URIs are relative to *https://dagshub.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetArchive**](ContentApi.md#GetArchive) | **Get** /repos/{username}/{repo}/archive/{ref}/{format} | Download archive
[**GetContent**](ContentApi.md#GetContent) | **Get** /repos/{owner}/{repo}/content/{branch}/{path} | List data in a repository folder
[**GetRaw**](ContentApi.md#GetRaw) | **Get** /repos/{username}/{repo}/raw/{ref}/{path} | Download raw content
[**UploadContent**](ContentApi.md#UploadContent) | **Put** /repos/{owner}/{repo}/content/{branch}/{path} | Upload data to a repository

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

# **GetContent**
> []*os.File GetContent(ctx, owner, repo, branch, path, optional)
List data in a repository folder

List files, commit sha1, and versioning type for a folder in repository.  To get sizes add to the query param `include_size=true`. May result slower response. 

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **owner** | **string**| owner of the repository | 
  **repo** | **string**| name of the repository | 
  **branch** | **string**| branch of the repository | 
  **path** | **string**| path of a folder in the repository | 
 **optional** | ***ContentApiGetContentOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a ContentApiGetContentOpts struct
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------




 **includeSize** | **optional.Bool**|  | [default to false]

### Return type

[**[]*os.File**](array.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

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

# **UploadContent**
> UploadContent(ctx, owner, repo, branch, path, optional)
Upload data to a repository

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **owner** | **string**| owner of the repository | 
  **repo** | **string**| name of the repository | 
  **branch** | **string**| branch of the repository | 
  **path** | **string**| path of a folder in the repository | 
 **optional** | ***ContentApiUploadContentOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a ContentApiUploadContentOpts struct
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------




 **commitSummary** | **optional.**|  | 
 **commitMessage** | **optional.**|  | 
 **commitChoice** | **optional.**|  | 
 **lastCommit** | **optional.**|  | 
 **newBranchName** | **optional.**|  | 
 **versioning** | **optional.**|  | 
 **files** | **optional.**|  | 

### Return type

 (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

