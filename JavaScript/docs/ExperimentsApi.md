# DagsHubApi.ExperimentsApi

All URIs are relative to *https://dagshub.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addExperimentLabel**](ExperimentsApi.md#addExperimentLabel) | **POST** /repos/{owner}/{repo}/experiments/experiment/{experimentKey}/labels/{experimentLabel} | Add label to experiment
[**deleteExperimentLabel**](ExperimentsApi.md#deleteExperimentLabel) | **DELETE** /repos/{owner}/{repo}/experiments/experiment/{experimentKey}/labels/{experimentLabel} | Delete experiment label
[**editExperiment**](ExperimentsApi.md#editExperiment) | **POST** /repos/{owner}/{repo}/experiments/experiment/{experimentKey} | Edit experiment info
[**getExperimentMetrics**](ExperimentsApi.md#getExperimentMetrics) | **POST** /repos/{owner}/{repo}/experiments/metricsForExperiments | Get experiment metrics for experiment
[**getExperiments**](ExperimentsApi.md#getExperiments) | **GET** /repos/{owner}/{repo}/experiments | List Experiments

<a name="addExperimentLabel"></a>
# **addExperimentLabel**
> addExperimentLabel(owner, repo, experimentKey, experimentLabel)

Add label to experiment

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

let apiInstance = new DagsHubApi.ExperimentsApi();
let owner = "owner_example"; // String | owner of the repository
let repo = "repo_example"; // String | name of the repository
let experimentKey = "experimentKey_example"; // String | a valid experiment key
let experimentLabel = "experimentLabel_example"; // String | A label for the experiment, max 128 characters.

apiInstance.addExperimentLabel(owner, repo, experimentKey, experimentLabel, (error, data, response) => {
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
 **experimentKey** | **String**| a valid experiment key | 
 **experimentLabel** | **String**| A label for the experiment, max 128 characters. | 

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteExperimentLabel"></a>
# **deleteExperimentLabel**
> deleteExperimentLabel(owner, repo, experimentKey, experimentLabel)

Delete experiment label

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

let apiInstance = new DagsHubApi.ExperimentsApi();
let owner = "owner_example"; // String | owner of the repository
let repo = "repo_example"; // String | name of the repository
let experimentKey = "experimentKey_example"; // String | a valid experiment key
let experimentLabel = "experimentLabel_example"; // String | A label for the experiment, max 128 characters.

apiInstance.deleteExperimentLabel(owner, repo, experimentKey, experimentLabel, (error, data, response) => {
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
 **experimentKey** | **String**| a valid experiment key | 
 **experimentLabel** | **String**| A label for the experiment, max 128 characters. | 

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="editExperiment"></a>
# **editExperiment**
> editExperiment(owner, repo, experimentKey, opts)

Edit experiment info

Edit experiment info, currently supports just changing experiment name.

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

let apiInstance = new DagsHubApi.ExperimentsApi();
let owner = "owner_example"; // String | owner of the repository
let repo = "repo_example"; // String | name of the repository
let experimentKey = "experimentKey_example"; // String | a valid experiment key
let opts = { 
  'body': new DagsHubApi.EditExperimentPost() // EditExperimentPost | 
};
apiInstance.editExperiment(owner, repo, experimentKey, opts, (error, data, response) => {
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
 **experimentKey** | **String**| a valid experiment key | 
 **body** | [**EditExperimentPost**](EditExperimentPost.md)|  | [optional] 

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getExperimentMetrics"></a>
# **getExperimentMetrics**
> getExperimentMetrics(owner, repo, opts)

Get experiment metrics for experiment

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

let apiInstance = new DagsHubApi.ExperimentsApi();
let owner = "owner_example"; // String | owner of the repository
let repo = "repo_example"; // String | name of the repository
let opts = { 
  'body': new DagsHubApi.ExperimentKeys() // ExperimentKeys | 
};
apiInstance.getExperimentMetrics(owner, repo, opts, (error, data, response) => {
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
 **body** | [**ExperimentKeys**](ExperimentKeys.md)|  | [optional] 

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getExperiments"></a>
# **getExperiments**
> getExperiments(owner, repo)

List Experiments

Get a list of experiments in the given repository

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

let apiInstance = new DagsHubApi.ExperimentsApi();
let owner = "owner_example"; // String | owner of the repository
let repo = "repo_example"; // String | name of the repository

apiInstance.getExperiments(owner, repo, (error, data, response) => {
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

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

