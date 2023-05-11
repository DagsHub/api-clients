# dagshub_api.Api.ExperimentsApi

All URIs are relative to *https://dagshub.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**AddExperimentLabel**](ExperimentsApi.md#addexperimentlabel) | **POST** /repos/{owner}/{repo}/experiments/experiment/{experimentKey}/labels/{experimentLabel} | Add label to experiment
[**DeleteExperiment**](ExperimentsApi.md#deleteexperiment) | **DELETE** /repos/{owner}/{repo}/experiments/experiment/{experimentKey} | Delete experiment
[**DeleteExperimentLabel**](ExperimentsApi.md#deleteexperimentlabel) | **DELETE** /repos/{owner}/{repo}/experiments/experiment/{experimentKey}/labels/{experimentLabel} | Delete experiment label
[**EditExperiment**](ExperimentsApi.md#editexperiment) | **POST** /repos/{owner}/{repo}/experiments/experiment/{experimentKey} | Edit experiment info
[**GetExperimentMetrics**](ExperimentsApi.md#getexperimentmetrics) | **POST** /repos/{owner}/{repo}/experiments/metricsForExperiments | Get experiment metrics for experiment
[**GetExperiments**](ExperimentsApi.md#getexperiments) | **GET** /repos/{owner}/{repo}/experiments | List Experiments

<a name="addexperimentlabel"></a>
# **AddExperimentLabel**
> void AddExperimentLabel (string owner, string repo, string experimentKey, string experimentLabel)

Add label to experiment

### Example
```csharp
using System;
using System.Diagnostics;
using dagshub_api.Api;
using dagshub_api.Client;
using dagshub_api.Model;

namespace Example
{
    public class AddExperimentLabelExample
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

            var apiInstance = new ExperimentsApi();
            var owner = owner_example;  // string | owner of the repository
            var repo = repo_example;  // string | name of the repository
            var experimentKey = experimentKey_example;  // string | a valid experiment key
            var experimentLabel = experimentLabel_example;  // string | A label for the experiment, max 128 characters.

            try
            {
                // Add label to experiment
                apiInstance.AddExperimentLabel(owner, repo, experimentKey, experimentLabel);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling ExperimentsApi.AddExperimentLabel: " + e.Message );
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
 **experimentKey** | **string**| a valid experiment key | 
 **experimentLabel** | **string**| A label for the experiment, max 128 characters. | 

### Return type

void (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)
<a name="deleteexperiment"></a>
# **DeleteExperiment**
> void DeleteExperiment (string owner, string repo, string experimentKey)

Delete experiment

Support both git and MLflow experiments

### Example
```csharp
using System;
using System.Diagnostics;
using dagshub_api.Api;
using dagshub_api.Client;
using dagshub_api.Model;

namespace Example
{
    public class DeleteExperimentExample
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

            var apiInstance = new ExperimentsApi();
            var owner = owner_example;  // string | owner of the repository
            var repo = repo_example;  // string | name of the repository
            var experimentKey = experimentKey_example;  // string | a valid experiment key

            try
            {
                // Delete experiment
                apiInstance.DeleteExperiment(owner, repo, experimentKey);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling ExperimentsApi.DeleteExperiment: " + e.Message );
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
 **experimentKey** | **string**| a valid experiment key | 

### Return type

void (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)
<a name="deleteexperimentlabel"></a>
# **DeleteExperimentLabel**
> void DeleteExperimentLabel (string owner, string repo, string experimentKey, string experimentLabel)

Delete experiment label

### Example
```csharp
using System;
using System.Diagnostics;
using dagshub_api.Api;
using dagshub_api.Client;
using dagshub_api.Model;

namespace Example
{
    public class DeleteExperimentLabelExample
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

            var apiInstance = new ExperimentsApi();
            var owner = owner_example;  // string | owner of the repository
            var repo = repo_example;  // string | name of the repository
            var experimentKey = experimentKey_example;  // string | a valid experiment key
            var experimentLabel = experimentLabel_example;  // string | A label for the experiment, max 128 characters.

            try
            {
                // Delete experiment label
                apiInstance.DeleteExperimentLabel(owner, repo, experimentKey, experimentLabel);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling ExperimentsApi.DeleteExperimentLabel: " + e.Message );
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
 **experimentKey** | **string**| a valid experiment key | 
 **experimentLabel** | **string**| A label for the experiment, max 128 characters. | 

### Return type

void (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)
<a name="editexperiment"></a>
# **EditExperiment**
> void EditExperiment (string owner, string repo, string experimentKey, EditExperimentPost body = null)

Edit experiment info

Edit experiment info, currently supports just changing experiment name.

### Example
```csharp
using System;
using System.Diagnostics;
using dagshub_api.Api;
using dagshub_api.Client;
using dagshub_api.Model;

namespace Example
{
    public class EditExperimentExample
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

            var apiInstance = new ExperimentsApi();
            var owner = owner_example;  // string | owner of the repository
            var repo = repo_example;  // string | name of the repository
            var experimentKey = experimentKey_example;  // string | a valid experiment key
            var body = new EditExperimentPost(); // EditExperimentPost |  (optional) 

            try
            {
                // Edit experiment info
                apiInstance.EditExperiment(owner, repo, experimentKey, body);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling ExperimentsApi.EditExperiment: " + e.Message );
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
 **experimentKey** | **string**| a valid experiment key | 
 **body** | [**EditExperimentPost**](EditExperimentPost.md)|  | [optional] 

### Return type

void (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)
<a name="getexperimentmetrics"></a>
# **GetExperimentMetrics**
> void GetExperimentMetrics (string owner, string repo, ExperimentKeys body = null)

Get experiment metrics for experiment

### Example
```csharp
using System;
using System.Diagnostics;
using dagshub_api.Api;
using dagshub_api.Client;
using dagshub_api.Model;

namespace Example
{
    public class GetExperimentMetricsExample
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

            var apiInstance = new ExperimentsApi();
            var owner = owner_example;  // string | owner of the repository
            var repo = repo_example;  // string | name of the repository
            var body = new ExperimentKeys(); // ExperimentKeys |  (optional) 

            try
            {
                // Get experiment metrics for experiment
                apiInstance.GetExperimentMetrics(owner, repo, body);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling ExperimentsApi.GetExperimentMetrics: " + e.Message );
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
 **body** | [**ExperimentKeys**](ExperimentKeys.md)|  | [optional] 

### Return type

void (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)
<a name="getexperiments"></a>
# **GetExperiments**
> void GetExperiments (string owner, string repo)

List Experiments

Get a list of experiments in the given repository

### Example
```csharp
using System;
using System.Diagnostics;
using dagshub_api.Api;
using dagshub_api.Client;
using dagshub_api.Model;

namespace Example
{
    public class GetExperimentsExample
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

            var apiInstance = new ExperimentsApi();
            var owner = owner_example;  // string | owner of the repository
            var repo = repo_example;  // string | name of the repository

            try
            {
                // List Experiments
                apiInstance.GetExperiments(owner, repo);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling ExperimentsApi.GetExperiments: " + e.Message );
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

void (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)
