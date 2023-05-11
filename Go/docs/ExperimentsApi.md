# {{classname}}

All URIs are relative to *https://dagshub.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**AddExperimentLabel**](ExperimentsApi.md#AddExperimentLabel) | **Post** /repos/{owner}/{repo}/experiments/experiment/{experimentKey}/labels/{experimentLabel} | Add label to experiment
[**DeleteExperiment**](ExperimentsApi.md#DeleteExperiment) | **Delete** /repos/{owner}/{repo}/experiments/experiment/{experimentKey} | Delete experiment
[**DeleteExperimentLabel**](ExperimentsApi.md#DeleteExperimentLabel) | **Delete** /repos/{owner}/{repo}/experiments/experiment/{experimentKey}/labels/{experimentLabel} | Delete experiment label
[**EditExperiment**](ExperimentsApi.md#EditExperiment) | **Post** /repos/{owner}/{repo}/experiments/experiment/{experimentKey} | Edit experiment info
[**GetExperimentMetrics**](ExperimentsApi.md#GetExperimentMetrics) | **Post** /repos/{owner}/{repo}/experiments/metricsForExperiments | Get experiment metrics for experiment
[**GetExperiments**](ExperimentsApi.md#GetExperiments) | **Get** /repos/{owner}/{repo}/experiments | List Experiments

# **AddExperimentLabel**
> AddExperimentLabel(ctx, owner, repo, experimentKey, experimentLabel)
Add label to experiment

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **owner** | **string**| owner of the repository | 
  **repo** | **string**| name of the repository | 
  **experimentKey** | **string**| a valid experiment key | 
  **experimentLabel** | **string**| A label for the experiment, max 128 characters. | 

### Return type

 (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DeleteExperiment**
> DeleteExperiment(ctx, owner, repo, experimentKey)
Delete experiment

Support both git and MLflow experiments

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **owner** | **string**| owner of the repository | 
  **repo** | **string**| name of the repository | 
  **experimentKey** | **string**| a valid experiment key | 

### Return type

 (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **DeleteExperimentLabel**
> DeleteExperimentLabel(ctx, owner, repo, experimentKey, experimentLabel)
Delete experiment label

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **owner** | **string**| owner of the repository | 
  **repo** | **string**| name of the repository | 
  **experimentKey** | **string**| a valid experiment key | 
  **experimentLabel** | **string**| A label for the experiment, max 128 characters. | 

### Return type

 (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **EditExperiment**
> EditExperiment(ctx, owner, repo, experimentKey, optional)
Edit experiment info

Edit experiment info, currently supports just changing experiment name.

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **owner** | **string**| owner of the repository | 
  **repo** | **string**| name of the repository | 
  **experimentKey** | **string**| a valid experiment key | 
 **optional** | ***ExperimentsApiEditExperimentOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a ExperimentsApiEditExperimentOpts struct
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------



 **body** | [**optional.Interface of EditExperimentPost**](EditExperimentPost.md)|  | 

### Return type

 (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **GetExperimentMetrics**
> GetExperimentMetrics(ctx, owner, repo, optional)
Get experiment metrics for experiment

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ctx** | **context.Context** | context for authentication, logging, cancellation, deadlines, tracing, etc.
  **owner** | **string**| owner of the repository | 
  **repo** | **string**| name of the repository | 
 **optional** | ***ExperimentsApiGetExperimentMetricsOpts** | optional parameters | nil if no parameters

### Optional Parameters
Optional parameters are passed through a pointer to a ExperimentsApiGetExperimentMetricsOpts struct
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------


 **body** | [**optional.Interface of ExperimentKeys**](ExperimentKeys.md)|  | 

### Return type

 (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **GetExperiments**
> GetExperiments(ctx, owner, repo)
List Experiments

Get a list of experiments in the given repository

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

