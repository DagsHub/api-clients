# dagshub_api.UserApi

All URIs are relative to *https://dagshub.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_authenticated_user**](UserApi.md#get_authenticated_user) | **GET** /user | Get authenticated user information
[**get_user**](UserApi.md#get_user) | **GET** /users/{username} | Get information about a user

# **get_authenticated_user**
> get_authenticated_user()

Get authenticated user information

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
api_instance = dagshub_api.UserApi(dagshub_api.ApiClient(configuration))

try:
    # Get authenticated user information
    api_instance.get_authenticated_user()
except ApiException as e:
    print("Exception when calling UserApi->get_authenticated_user: %s\n" % e)
```

### Parameters
This endpoint does not need any parameter.

### Return type

void (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_user**
> get_user(username)

Get information about a user

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
api_instance = dagshub_api.UserApi(dagshub_api.ApiClient(configuration))
username = 'username_example' # str | A DagsHub username

try:
    # Get information about a user
    api_instance.get_user(username)
except ApiException as e:
    print("Exception when calling UserApi->get_user: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **str**| A DagsHub username | 

### Return type

void (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

