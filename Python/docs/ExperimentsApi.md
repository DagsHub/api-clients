# dagshub_api.ExperimentsApi

All URIs are relative to *https://dagshub.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**add_experiment_label**](ExperimentsApi.md#add_experiment_label) | **POST** /repos/{owner}/{repo}/experiments/experiment/{experimentKey}/labels/{experimentLabel} | Add label to experiment
[**delete_experiment**](ExperimentsApi.md#delete_experiment) | **DELETE** /repos/{owner}/{repo}/experiments/experiment/{experimentKey} | Delete experiment
[**delete_experiment_label**](ExperimentsApi.md#delete_experiment_label) | **DELETE** /repos/{owner}/{repo}/experiments/experiment/{experimentKey}/labels/{experimentLabel} | Delete experiment label
[**edit_experiment**](ExperimentsApi.md#edit_experiment) | **POST** /repos/{owner}/{repo}/experiments/experiment/{experimentKey} | Edit experiment info
[**get_experiment_metrics**](ExperimentsApi.md#get_experiment_metrics) | **POST** /repos/{owner}/{repo}/experiments/metricsForExperiments | Get experiment metrics for experiment
[**get_experiments**](ExperimentsApi.md#get_experiments) | **GET** /repos/{owner}/{repo}/experiments | List Experiments

# **add_experiment_label**
> add_experiment_label(owner, repo, experiment_key, experiment_label)

Add label to experiment

### Example
```python
from __future__ import print_function
import time
import dagshub_api
from dagshub_api.rest import ApiException
from pprint import pprint
# Configure HTTP basic authorization: basicAuth
configuration = dagshub_api.Configuration()
configuration.username = 'YOUR_USERNAME'
configuration.password = 'YOUR_PASSWORD'
# Configure API key authorization: tokenAuth
configuration = dagshub_api.Configuration()
configuration.api_key['token'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['token'] = 'Bearer'

# create an instance of the API class
api_instance = dagshub_api.ExperimentsApi(dagshub_api.ApiClient(configuration))
owner = 'owner_example' # str | owner of the repository
repo = 'repo_example' # str | name of the repository
experiment_key = 'experiment_key_example' # str | a valid experiment key
experiment_label = 'experiment_label_example' # str | A label for the experiment, max 128 characters.

try:
    # Add label to experiment
    api_instance.add_experiment_label(owner, repo, experiment_key, experiment_label)
except ApiException as e:
    print("Exception when calling ExperimentsApi->add_experiment_label: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| owner of the repository | 
 **repo** | **str**| name of the repository | 
 **experiment_key** | **str**| a valid experiment key | 
 **experiment_label** | **str**| A label for the experiment, max 128 characters. | 

### Return type

void (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_experiment**
> delete_experiment(owner, repo, experiment_key)

Delete experiment

Support both git and MLflow experiments

### Example
```python
from __future__ import print_function
import time
import dagshub_api
from dagshub_api.rest import ApiException
from pprint import pprint
# Configure HTTP basic authorization: basicAuth
configuration = dagshub_api.Configuration()
configuration.username = 'YOUR_USERNAME'
configuration.password = 'YOUR_PASSWORD'
# Configure API key authorization: tokenAuth
configuration = dagshub_api.Configuration()
configuration.api_key['token'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['token'] = 'Bearer'

# create an instance of the API class
api_instance = dagshub_api.ExperimentsApi(dagshub_api.ApiClient(configuration))
owner = 'owner_example' # str | owner of the repository
repo = 'repo_example' # str | name of the repository
experiment_key = 'experiment_key_example' # str | a valid experiment key

try:
    # Delete experiment
    api_instance.delete_experiment(owner, repo, experiment_key)
except ApiException as e:
    print("Exception when calling ExperimentsApi->delete_experiment: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| owner of the repository | 
 **repo** | **str**| name of the repository | 
 **experiment_key** | **str**| a valid experiment key | 

### Return type

void (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_experiment_label**
> delete_experiment_label(owner, repo, experiment_key, experiment_label)

Delete experiment label

### Example
```python
from __future__ import print_function
import time
import dagshub_api
from dagshub_api.rest import ApiException
from pprint import pprint
# Configure HTTP basic authorization: basicAuth
configuration = dagshub_api.Configuration()
configuration.username = 'YOUR_USERNAME'
configuration.password = 'YOUR_PASSWORD'
# Configure API key authorization: tokenAuth
configuration = dagshub_api.Configuration()
configuration.api_key['token'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['token'] = 'Bearer'

# create an instance of the API class
api_instance = dagshub_api.ExperimentsApi(dagshub_api.ApiClient(configuration))
owner = 'owner_example' # str | owner of the repository
repo = 'repo_example' # str | name of the repository
experiment_key = 'experiment_key_example' # str | a valid experiment key
experiment_label = 'experiment_label_example' # str | A label for the experiment, max 128 characters.

try:
    # Delete experiment label
    api_instance.delete_experiment_label(owner, repo, experiment_key, experiment_label)
except ApiException as e:
    print("Exception when calling ExperimentsApi->delete_experiment_label: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| owner of the repository | 
 **repo** | **str**| name of the repository | 
 **experiment_key** | **str**| a valid experiment key | 
 **experiment_label** | **str**| A label for the experiment, max 128 characters. | 

### Return type

void (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **edit_experiment**
> edit_experiment(owner, repo, experiment_key, body=body)

Edit experiment info

Edit experiment info, currently supports just changing experiment name.

### Example
```python
from __future__ import print_function
import time
import dagshub_api
from dagshub_api.rest import ApiException
from pprint import pprint
# Configure HTTP basic authorization: basicAuth
configuration = dagshub_api.Configuration()
configuration.username = 'YOUR_USERNAME'
configuration.password = 'YOUR_PASSWORD'
# Configure API key authorization: tokenAuth
configuration = dagshub_api.Configuration()
configuration.api_key['token'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['token'] = 'Bearer'

# create an instance of the API class
api_instance = dagshub_api.ExperimentsApi(dagshub_api.ApiClient(configuration))
owner = 'owner_example' # str | owner of the repository
repo = 'repo_example' # str | name of the repository
experiment_key = 'experiment_key_example' # str | a valid experiment key
body = dagshub_api.EditExperimentPost() # EditExperimentPost |  (optional)

try:
    # Edit experiment info
    api_instance.edit_experiment(owner, repo, experiment_key, body=body)
except ApiException as e:
    print("Exception when calling ExperimentsApi->edit_experiment: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| owner of the repository | 
 **repo** | **str**| name of the repository | 
 **experiment_key** | **str**| a valid experiment key | 
 **body** | [**EditExperimentPost**](EditExperimentPost.md)|  | [optional] 

### Return type

void (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_experiment_metrics**
> get_experiment_metrics(owner, repo, body=body)

Get experiment metrics for experiment

### Example
```python
from __future__ import print_function
import time
import dagshub_api
from dagshub_api.rest import ApiException
from pprint import pprint
# Configure HTTP basic authorization: basicAuth
configuration = dagshub_api.Configuration()
configuration.username = 'YOUR_USERNAME'
configuration.password = 'YOUR_PASSWORD'
# Configure API key authorization: tokenAuth
configuration = dagshub_api.Configuration()
configuration.api_key['token'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['token'] = 'Bearer'

# create an instance of the API class
api_instance = dagshub_api.ExperimentsApi(dagshub_api.ApiClient(configuration))
owner = 'owner_example' # str | owner of the repository
repo = 'repo_example' # str | name of the repository
body = dagshub_api.ExperimentKeys() # ExperimentKeys |  (optional)

try:
    # Get experiment metrics for experiment
    api_instance.get_experiment_metrics(owner, repo, body=body)
except ApiException as e:
    print("Exception when calling ExperimentsApi->get_experiment_metrics: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| owner of the repository | 
 **repo** | **str**| name of the repository | 
 **body** | [**ExperimentKeys**](ExperimentKeys.md)|  | [optional] 

### Return type

void (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_experiments**
> get_experiments(owner, repo)

List Experiments

Get a list of experiments in the given repository

### Example
```python
from __future__ import print_function
import time
import dagshub_api
from dagshub_api.rest import ApiException
from pprint import pprint
# Configure HTTP basic authorization: basicAuth
configuration = dagshub_api.Configuration()
configuration.username = 'YOUR_USERNAME'
configuration.password = 'YOUR_PASSWORD'
# Configure API key authorization: tokenAuth
configuration = dagshub_api.Configuration()
configuration.api_key['token'] = 'YOUR_API_KEY'
# Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
# configuration.api_key_prefix['token'] = 'Bearer'

# create an instance of the API class
api_instance = dagshub_api.ExperimentsApi(dagshub_api.ApiClient(configuration))
owner = 'owner_example' # str | owner of the repository
repo = 'repo_example' # str | name of the repository

try:
    # List Experiments
    api_instance.get_experiments(owner, repo)
except ApiException as e:
    print("Exception when calling ExperimentsApi->get_experiments: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| owner of the repository | 
 **repo** | **str**| name of the repository | 

### Return type

void (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

