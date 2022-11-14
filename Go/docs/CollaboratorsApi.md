# {{classname}}

All URIs are relative to *https://dagshub.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**AddCollaborator**](CollaboratorsApi.md#AddCollaborator) | **Put** /repos/{owner}/{repo}/collaborators/{collaborator} | Add user as a collaborator
[**GetCollaborators**](CollaboratorsApi.md#GetCollaborators) | **Get** /repos/{owner}/{repo}/collaborators | Get collaborators
[**RemoveCollaborator**](CollaboratorsApi.md#RemoveCollaborator) | **Delete** /repos/{owner}/{repo}/collaborators/{collaborator} | Delete collaborator

# **AddCollaborator**
> AddCollaborator(ctx, owner, repo, collaborator, optional)
Add user as a collaborator

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **owner** | **string**| owner of the repository | 
  **repo** | **string**| name of the repository | 
  **collaborator** | **string**| collaborator username | 
 **optional** | ***CollaboratorsApiAddCollaboratorOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a CollaboratorsApiAddCollaboratorOpts struct
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------



 **body** | [**optional.Interface of CollaboratorsCollaboratorBody**](CollaboratorsCollaboratorBody.md)|  | 

### Return type

 (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **GetCollaborators**
> GetCollaborators(ctx, owner, repo)
Get collaborators

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **owner** | **string**| owner of the repository | 
  **repo** | **string**| name of the repository | 

### Return type

 (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **RemoveCollaborator**
> RemoveCollaborator(ctx, owner, repo, collaborator)
Delete collaborator

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **owner** | **string**| owner of the repository | 
  **repo** | **string**| name of the repository | 
  **collaborator** | **string**| collaborator username | 

### Return type

 (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

