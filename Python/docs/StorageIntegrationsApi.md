# dagshub_api.StorageIntegrationsApi

All URIs are relative to *https://dagshub.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_bucket_content**](StorageIntegrationsApi.md#get_bucket_content) | **GET** /repos/{owner}/{repo}/storage/content/{protocol}/{bucket}/{path} | List contents in the path
[**get_bucket_file**](StorageIntegrationsApi.md#get_bucket_file) | **GET** /repos/{owner}/{repo}/storage/raw/{protocol}/{bucket}/{path} | Get file in the bucket
[**get_buckets**](StorageIntegrationsApi.md#get_buckets) | **GET** /repos/{owner}/{repo}/storage | List integrated storages in the repository

# **get_bucket_content**
> Files1 get_bucket_content(owner, repo, protocol, bucket, path, include_size=include_size, limit=limit, from_token=from_token)

List contents in the path

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
api_instance = dagshub_api.StorageIntegrationsApi(dagshub_api.ApiClient(configuration))
owner = 'owner_example' # str | owner of the repository
repo = 'repo_example' # str | name of the repository
protocol = 'protocol_example' # str | protocol of the storage integration
bucket = 'bucket_example' # str | name and prefix of the bucket integration
path = 'path_example' # str | path of a folder in the repository
include_size = false # bool |  (optional) (default to false)
limit = 100 # int | Maximum amount of items to return (optional) (default to 100)
from_token = 'from_token_example' # str | Token, from which to continue iteration (optional)

try:
    # List contents in the path
    api_response = api_instance.get_bucket_content(owner, repo, protocol, bucket, path, include_size=include_size, limit=limit, from_token=from_token)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling StorageIntegrationsApi->get_bucket_content: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| owner of the repository | 
 **repo** | **str**| name of the repository | 
 **protocol** | **str**| protocol of the storage integration | 
 **bucket** | **str**| name and prefix of the bucket integration | 
 **path** | **str**| path of a folder in the repository | 
 **include_size** | **bool**|  | [optional] [default to false]
 **limit** | **int**| Maximum amount of items to return | [optional] [default to 100]
 **from_token** | **str**| Token, from which to continue iteration | [optional] 

### Return type

[**Files1**](Files1.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_bucket_file**
> get_bucket_file(owner, repo, protocol, bucket, path)

Get file in the bucket

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
api_instance = dagshub_api.StorageIntegrationsApi(dagshub_api.ApiClient(configuration))
owner = 'owner_example' # str | owner of the repository
repo = 'repo_example' # str | name of the repository
protocol = 'protocol_example' # str | protocol of the storage integration
bucket = 'bucket_example' # str | name and prefix of the bucket integration
path = 'path_example' # str | The content path

try:
    # Get file in the bucket
    api_instance.get_bucket_file(owner, repo, protocol, bucket, path)
except ApiException as e:
    print("Exception when calling StorageIntegrationsApi->get_bucket_file: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| owner of the repository | 
 **repo** | **str**| name of the repository | 
 **protocol** | **str**| protocol of the storage integration | 
 **bucket** | **str**| name and prefix of the bucket integration | 
 **path** | **str**| The content path | 

### Return type

void (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_buckets**
> Integration get_buckets(owner, repo)

List integrated storages in the repository

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
api_instance = dagshub_api.StorageIntegrationsApi(dagshub_api.ApiClient(configuration))
owner = 'owner_example' # str | owner of the repository
repo = 'repo_example' # str | name of the repository

try:
    # List integrated storages in the repository
    api_response = api_instance.get_buckets(owner, repo)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling StorageIntegrationsApi->get_buckets: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| owner of the repository | 
 **repo** | **str**| name of the repository | 

### Return type

[**Integration**](Integration.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

