# dagshub_api.ContentApi

All URIs are relative to *https://dagshub.com/api/v1/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_archive**](ContentApi.md#get_archive) | **GET** /repos/{username}/{repo}/archive/{ref}/{format} | Download archive
[**get_raw**](ContentApi.md#get_raw) | **GET** /repos/{username}/{repo}/raw/{ref}/{path} | Download raw content

# **get_archive**
> get_archive(username, repo, ref, format)

Download archive

This method returns archive by given format.

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
api_instance = dagshub_api.ContentApi(dagshub_api.ApiClient(configuration))
username = 'username_example' # str | A DagsHub username
repo = 'repo_example' # str | name of the repository
ref = 'ref_example' # str | The name of the commit/branch/tag
format = 'format_example' # str | The format of archive, either .zip or .tar.gz

try:
    # Download archive
    api_instance.get_archive(username, repo, ref, format)
except ApiException as e:
    print("Exception when calling ContentApi->get_archive: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **str**| A DagsHub username | 
 **repo** | **str**| name of the repository | 
 **ref** | **str**| The name of the commit/branch/tag | 
 **format** | **str**| The format of archive, either .zip or .tar.gz | 

### Return type

void (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_raw**
> get_raw(username, repo, ref, path)

Download raw content

This method returns the raw content of a file.

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
api_instance = dagshub_api.ContentApi(dagshub_api.ApiClient(configuration))
username = 'username_example' # str | A DagsHub username
repo = 'repo_example' # str | name of the repository
ref = 'ref_example' # str | The name of the commit/branch/tag
path = 'path_example' # str | The content path

try:
    # Download raw content
    api_instance.get_raw(username, repo, ref, path)
except ApiException as e:
    print("Exception when calling ContentApi->get_raw: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **str**| A DagsHub username | 
 **repo** | **str**| name of the repository | 
 **ref** | **str**| The name of the commit/branch/tag | 
 **path** | **str**| The content path | 

### Return type

void (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

