# ExperimentsApi

All URIs are relative to *https://dagshub.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addExperimentLabel**](ExperimentsApi.md#addExperimentLabel) | **POST** /repos/{owner}/{repo}/experiments/experiment/{experimentKey}/labels/{experimentLabel} | Add label to experiment
[**deleteExperiment**](ExperimentsApi.md#deleteExperiment) | **DELETE** /repos/{owner}/{repo}/experiments/experiment/{experimentKey} | Delete experiment
[**deleteExperimentLabel**](ExperimentsApi.md#deleteExperimentLabel) | **DELETE** /repos/{owner}/{repo}/experiments/experiment/{experimentKey}/labels/{experimentLabel} | Delete experiment label
[**editExperiment**](ExperimentsApi.md#editExperiment) | **POST** /repos/{owner}/{repo}/experiments/experiment/{experimentKey} | Edit experiment info
[**getExperimentMetrics**](ExperimentsApi.md#getExperimentMetrics) | **POST** /repos/{owner}/{repo}/experiments/metricsForExperiments | Get experiment metrics for experiment
[**getExperiments**](ExperimentsApi.md#getExperiments) | **GET** /repos/{owner}/{repo}/experiments | List Experiments

<a name="addExperimentLabel"></a>
# **addExperimentLabel**
> addExperimentLabel(owner, repo, experimentKey, experimentLabel)

Add label to experiment

### Example
```kotlin
// Import classes:
//import dagshub_api.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = ExperimentsApi()
val owner : kotlin.String = owner_example // kotlin.String | owner of the repository
val repo : kotlin.String = repo_example // kotlin.String | name of the repository
val experimentKey : kotlin.String = experimentKey_example // kotlin.String | a valid experiment key
val experimentLabel : kotlin.String = experimentLabel_example // kotlin.String | A label for the experiment, max 128 characters.
try {
    apiInstance.addExperimentLabel(owner, repo, experimentKey, experimentLabel)
} catch (e: ClientException) {
    println("4xx response calling ExperimentsApi#addExperimentLabel")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ExperimentsApi#addExperimentLabel")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| owner of the repository |
 **repo** | **kotlin.String**| name of the repository |
 **experimentKey** | **kotlin.String**| a valid experiment key |
 **experimentLabel** | **kotlin.String**| A label for the experiment, max 128 characters. |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteExperiment"></a>
# **deleteExperiment**
> deleteExperiment(owner, repo, experimentKey)

Delete experiment

Support both git and MLflow experiments

### Example
```kotlin
// Import classes:
//import dagshub_api.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = ExperimentsApi()
val owner : kotlin.String = owner_example // kotlin.String | owner of the repository
val repo : kotlin.String = repo_example // kotlin.String | name of the repository
val experimentKey : kotlin.String = experimentKey_example // kotlin.String | a valid experiment key
try {
    apiInstance.deleteExperiment(owner, repo, experimentKey)
} catch (e: ClientException) {
    println("4xx response calling ExperimentsApi#deleteExperiment")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ExperimentsApi#deleteExperiment")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| owner of the repository |
 **repo** | **kotlin.String**| name of the repository |
 **experimentKey** | **kotlin.String**| a valid experiment key |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="deleteExperimentLabel"></a>
# **deleteExperimentLabel**
> deleteExperimentLabel(owner, repo, experimentKey, experimentLabel)

Delete experiment label

### Example
```kotlin
// Import classes:
//import dagshub_api.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = ExperimentsApi()
val owner : kotlin.String = owner_example // kotlin.String | owner of the repository
val repo : kotlin.String = repo_example // kotlin.String | name of the repository
val experimentKey : kotlin.String = experimentKey_example // kotlin.String | a valid experiment key
val experimentLabel : kotlin.String = experimentLabel_example // kotlin.String | A label for the experiment, max 128 characters.
try {
    apiInstance.deleteExperimentLabel(owner, repo, experimentKey, experimentLabel)
} catch (e: ClientException) {
    println("4xx response calling ExperimentsApi#deleteExperimentLabel")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ExperimentsApi#deleteExperimentLabel")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| owner of the repository |
 **repo** | **kotlin.String**| name of the repository |
 **experimentKey** | **kotlin.String**| a valid experiment key |
 **experimentLabel** | **kotlin.String**| A label for the experiment, max 128 characters. |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="editExperiment"></a>
# **editExperiment**
> editExperiment(owner, repo, experimentKey, body)

Edit experiment info

Edit experiment info, currently supports just changing experiment name.

### Example
```kotlin
// Import classes:
//import dagshub_api.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = ExperimentsApi()
val owner : kotlin.String = owner_example // kotlin.String | owner of the repository
val repo : kotlin.String = repo_example // kotlin.String | name of the repository
val experimentKey : kotlin.String = experimentKey_example // kotlin.String | a valid experiment key
val body : EditExperimentPost =  // EditExperimentPost | 
try {
    apiInstance.editExperiment(owner, repo, experimentKey, body)
} catch (e: ClientException) {
    println("4xx response calling ExperimentsApi#editExperiment")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ExperimentsApi#editExperiment")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| owner of the repository |
 **repo** | **kotlin.String**| name of the repository |
 **experimentKey** | **kotlin.String**| a valid experiment key |
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
> getExperimentMetrics(owner, repo, body)

Get experiment metrics for experiment

### Example
```kotlin
// Import classes:
//import dagshub_api.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = ExperimentsApi()
val owner : kotlin.String = owner_example // kotlin.String | owner of the repository
val repo : kotlin.String = repo_example // kotlin.String | name of the repository
val body : ExperimentKeys =  // ExperimentKeys | 
try {
    apiInstance.getExperimentMetrics(owner, repo, body)
} catch (e: ClientException) {
    println("4xx response calling ExperimentsApi#getExperimentMetrics")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ExperimentsApi#getExperimentMetrics")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| owner of the repository |
 **repo** | **kotlin.String**| name of the repository |
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
```kotlin
// Import classes:
//import dagshub_api.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = ExperimentsApi()
val owner : kotlin.String = owner_example // kotlin.String | owner of the repository
val repo : kotlin.String = repo_example // kotlin.String | name of the repository
try {
    apiInstance.getExperiments(owner, repo)
} catch (e: ClientException) {
    println("4xx response calling ExperimentsApi#getExperiments")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ExperimentsApi#getExperiments")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| owner of the repository |
 **repo** | **kotlin.String**| name of the repository |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

