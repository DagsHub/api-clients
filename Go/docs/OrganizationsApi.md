# {{classname}}

All URIs are relative to *https://dagshub.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CreateOrgTeam**](OrganizationsApi.md#CreateOrgTeam) | **Post** /admin/orgs/{orgname}/teams | Create an organization team

# **CreateOrgTeam**
> CreateOrgTeam(ctx, body, orgname)
Create an organization team

Create a new team in an organization. Use team_type \"annotator\" to create an annotator team with access only to annotation projects.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **body** | [**CreateAnnotatorTeam**](CreateAnnotatorTeam.md)|  | 
  **orgname** | **string**| A DagsHub organization name | 

### Return type

 (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

