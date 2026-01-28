# {{classname}}

All URIs are relative to *https://dagshub.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetLabelStudioTeamAccess**](AnnotationsApi.md#GetLabelStudioTeamAccess) | **Get** /repos/{owner}/{repo}/annotations/access/teams/{teamid} | Get team access level for annotation projects
[**GetLabelStudioUserAccess**](AnnotationsApi.md#GetLabelStudioUserAccess) | **Get** /repos/{owner}/{repo}/annotations/access/users/{userid} | Get user access level for annotation projects
[**GrantLabelStudioTeamAccess**](AnnotationsApi.md#GrantLabelStudioTeamAccess) | **Put** /repos/{owner}/{repo}/annotations/access/teams/{teamid} | Grant team access to annotation projects
[**GrantLabelStudioUserAccess**](AnnotationsApi.md#GrantLabelStudioUserAccess) | **Put** /repos/{owner}/{repo}/annotations/access/users/{userid} | Grant user access to annotation projects
[**ListLabelStudioTeamAccess**](AnnotationsApi.md#ListLabelStudioTeamAccess) | **Get** /repos/{owner}/{repo}/annotations/access/teams | List team access entries for annotation projects
[**ListLabelStudioUserAccess**](AnnotationsApi.md#ListLabelStudioUserAccess) | **Get** /repos/{owner}/{repo}/annotations/access/users | List user access entries for annotation projects
[**RevokeLabelStudioTeamAccess**](AnnotationsApi.md#RevokeLabelStudioTeamAccess) | **Delete** /repos/{owner}/{repo}/annotations/access/teams/{teamid} | Revoke team access to annotation projects
[**RevokeLabelStudioUserAccess**](AnnotationsApi.md#RevokeLabelStudioUserAccess) | **Delete** /repos/{owner}/{repo}/annotations/access/users/{userid} | Revoke user access to annotation projects

# **GetLabelStudioTeamAccess**
> LabelStudioProjectAccess GetLabelStudioTeamAccess(ctx, owner, repo, teamid, optional)
Get team access level for annotation projects

Get the access level for a specific team and project (or all projects)

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **owner** | **string**| owner of the repository | 
  **repo** | **string**| name of the repository | 
  **teamid** | **int64**| Team ID | 
 **optional** | ***AnnotationsApiGetLabelStudioTeamAccessOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a AnnotationsApiGetLabelStudioTeamAccessOpts struct
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------



 **projectId** | **optional.Int64**| Label Studio project ID to filter by. If not specified, returns access for all projects. Use -1 for wildcard access. | 

### Return type

[**LabelStudioProjectAccess**](LabelStudioProjectAccess.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **GetLabelStudioUserAccess**
> InlineResponse200 GetLabelStudioUserAccess(ctx, owner, repo, userid, optional)
Get user access level for annotation projects

Get the access level for a specific user and project (or all projects)

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **owner** | **string**| owner of the repository | 
  **repo** | **string**| name of the repository | 
  **userid** | **int64**| User ID | 
 **optional** | ***AnnotationsApiGetLabelStudioUserAccessOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a AnnotationsApiGetLabelStudioUserAccessOpts struct
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------



 **projectId** | **optional.Int64**| Label Studio project ID to filter by. If not specified, returns access for all projects. Use -1 for wildcard access. | 

### Return type

[**InlineResponse200**](inline_response_200.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **GrantLabelStudioTeamAccess**
> GrantLabelStudioTeamAccess(ctx, body, owner, repo, teamid)
Grant team access to annotation projects

Grant a team access to specific Label Studio annotation projects (organization repositories only)

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**GrantLabelStudioAccess**](GrantLabelStudioAccess.md)|  | 
  **owner** | **string**| owner of the repository | 
  **repo** | **string**| name of the repository | 
  **teamid** | **int64**| Team ID | 

### Return type

 (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **GrantLabelStudioUserAccess**
> GrantLabelStudioUserAccess(ctx, body, owner, repo, userid)
Grant user access to annotation projects

Grant a user access to specific Label Studio annotation projects. User must be an organization member if the repo is owned by an organization.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**GrantLabelStudioAccess**](GrantLabelStudioAccess.md)|  | 
  **owner** | **string**| owner of the repository | 
  **repo** | **string**| name of the repository | 
  **userid** | **int64**| User ID | 

### Return type

 (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ListLabelStudioTeamAccess**
> []LabelStudioProjectAccess ListLabelStudioTeamAccess(ctx, owner, repo, optional)
List team access entries for annotation projects

Get a list of teams with access to Label Studio annotation projects in the repository (organization repositories only)

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **owner** | **string**| owner of the repository | 
  **repo** | **string**| name of the repository | 
 **optional** | ***AnnotationsApiListLabelStudioTeamAccessOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a AnnotationsApiListLabelStudioTeamAccessOpts struct
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **projectId** | **optional.Int64**| Label Studio project ID to filter by. If not specified, returns access for all projects. Use -1 for wildcard access. | 

### Return type

[**[]LabelStudioProjectAccess**](LabelStudioProjectAccess.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ListLabelStudioUserAccess**
> []LabelStudioProjectAccess ListLabelStudioUserAccess(ctx, owner, repo, optional)
List user access entries for annotation projects

Get a list of users with access to Label Studio annotation projects in the repository

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **owner** | **string**| owner of the repository | 
  **repo** | **string**| name of the repository | 
 **optional** | ***AnnotationsApiListLabelStudioUserAccessOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a AnnotationsApiListLabelStudioUserAccessOpts struct
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **projectId** | **optional.Int64**| Label Studio project ID to filter by. If not specified, returns access for all projects. Use -1 for wildcard access. | 

### Return type

[**[]LabelStudioProjectAccess**](LabelStudioProjectAccess.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **RevokeLabelStudioTeamAccess**
> RevokeLabelStudioTeamAccess(ctx, owner, repo, teamid, optional)
Revoke team access to annotation projects

Revoke a team's access to Label Studio annotation projects

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **owner** | **string**| owner of the repository | 
  **repo** | **string**| name of the repository | 
  **teamid** | **int64**| Team ID | 
 **optional** | ***AnnotationsApiRevokeLabelStudioTeamAccessOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a AnnotationsApiRevokeLabelStudioTeamAccessOpts struct
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------



 **projectId** | **optional.Int64**| Label Studio project ID to filter by. If not specified, returns access for all projects. Use -1 for wildcard access. | 

### Return type

 (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **RevokeLabelStudioUserAccess**
> RevokeLabelStudioUserAccess(ctx, owner, repo, userid, optional)
Revoke user access to annotation projects

Revoke a user's access to Label Studio annotation projects

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **owner** | **string**| owner of the repository | 
  **repo** | **string**| name of the repository | 
  **userid** | **int64**| User ID | 
 **optional** | ***AnnotationsApiRevokeLabelStudioUserAccessOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a AnnotationsApiRevokeLabelStudioUserAccessOpts struct
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------



 **projectId** | **optional.Int64**| Label Studio project ID to filter by. If not specified, returns access for all projects. Use -1 for wildcard access. | 

### Return type

 (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

