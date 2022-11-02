# ExperimentsApi

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
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ExperimentsApi;

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

ExperimentsApi apiInstance = new ExperimentsApi();
String owner = "owner_example"; // String | owner of the repository
String repo = "repo_example"; // String | name of the repository
String experimentKey = "experimentKey_example"; // String | a valid experiment key
String experimentLabel = "experimentLabel_example"; // String | A label for the experiment, max 128 characters.
try {
    apiInstance.addExperimentLabel(owner, repo, experimentKey, experimentLabel);
} catch (ApiException e) {
    System.err.println("Exception when calling ExperimentsApi#addExperimentLabel");
    e.printStackTrace();
}
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

[basicAuth](../README.md#basicAuth)[tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteExperimentLabel"></a>
# **deleteExperimentLabel**
> deleteExperimentLabel(owner, repo, experimentKey, experimentLabel)

Delete experiment label

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ExperimentsApi;

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

ExperimentsApi apiInstance = new ExperimentsApi();
String owner = "owner_example"; // String | owner of the repository
String repo = "repo_example"; // String | name of the repository
String experimentKey = "experimentKey_example"; // String | a valid experiment key
String experimentLabel = "experimentLabel_example"; // String | A label for the experiment, max 128 characters.
try {
    apiInstance.deleteExperimentLabel(owner, repo, experimentKey, experimentLabel);
} catch (ApiException e) {
    System.err.println("Exception when calling ExperimentsApi#deleteExperimentLabel");
    e.printStackTrace();
}
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

[basicAuth](../README.md#basicAuth)[tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="editExperiment"></a>
# **editExperiment**
> editExperiment(owner, repo, experimentKey, body)

Edit experiment info

Edit experiment info, currently supports just changing experiment name.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ExperimentsApi;

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

ExperimentsApi apiInstance = new ExperimentsApi();
String owner = "owner_example"; // String | owner of the repository
String repo = "repo_example"; // String | name of the repository
String experimentKey = "experimentKey_example"; // String | a valid experiment key
EditExperimentPost body = new EditExperimentPost(); // EditExperimentPost | 
try {
    apiInstance.editExperiment(owner, repo, experimentKey, body);
} catch (ApiException e) {
    System.err.println("Exception when calling ExperimentsApi#editExperiment");
    e.printStackTrace();
}
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

[basicAuth](../README.md#basicAuth)[tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getExperimentMetrics"></a>
# **getExperimentMetrics**
> getExperimentMetrics(owner, repo, body)

Get experiment metrics for experiment

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ExperimentsApi;

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

ExperimentsApi apiInstance = new ExperimentsApi();
String owner = "owner_example"; // String | owner of the repository
String repo = "repo_example"; // String | name of the repository
ExperimentKeys body = new ExperimentKeys(); // ExperimentKeys | 
try {
    apiInstance.getExperimentMetrics(owner, repo, body);
} catch (ApiException e) {
    System.err.println("Exception when calling ExperimentsApi#getExperimentMetrics");
    e.printStackTrace();
}
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

[basicAuth](../README.md#basicAuth)[tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getExperiments"></a>
# **getExperiments**
> getExperiments(owner, repo)

List Experiments

Get a list of experiments in the given repository

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ExperimentsApi;

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

ExperimentsApi apiInstance = new ExperimentsApi();
String owner = "owner_example"; // String | owner of the repository
String repo = "repo_example"; // String | name of the repository
try {
    apiInstance.getExperiments(owner, repo);
} catch (ApiException e) {
    System.err.println("Exception when calling ExperimentsApi#getExperiments");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**| owner of the repository |
 **repo** | **String**| name of the repository |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)[tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

