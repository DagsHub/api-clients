# dagshub_api.IssuesApi

All URIs are relative to *http://dagshub.com/api/v1/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_issue**](IssuesApi.md#create_issue) | **POST** /repos/{owner}/{repo}/issues | Create an issue
[**edit_issue**](IssuesApi.md#edit_issue) | **PATCH** /repos/{owner}/{repo}/issues | Edit an issue
[**get_issue**](IssuesApi.md#get_issue) | **GET** /repos/{owner}/{repo}/issues/{index} | Get a single issue
[**list_repo_issues**](IssuesApi.md#list_repo_issues) | **GET** /repos/{owner}/{repo}/issues | List issues for a repository

# **create_issue**
> Issue create_issue(owner, repo, body=body)

Create an issue

Any user with read access to a repository can create an issue.

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
api_instance = dagshub_api.IssuesApi(dagshub_api.ApiClient(configuration))
owner = 'owner_example' # str | owner of the repository
repo = 'repo_example' # str | name of the repository
body = dagshub_api.PostIssue() # PostIssue |  (optional)

try:
    # Create an issue
    api_response = api_instance.create_issue(owner, repo, body=body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling IssuesApi->create_issue: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| owner of the repository | 
 **repo** | **str**| name of the repository | 
 **body** | [**PostIssue**](PostIssue.md)|  | [optional] 

### Return type

[**Issue**](Issue.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **edit_issue**
> Issue edit_issue(owner, repo, body=body)

Edit an issue

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
api_instance = dagshub_api.IssuesApi(dagshub_api.ApiClient(configuration))
owner = 'owner_example' # str | owner of the repository
repo = 'repo_example' # str | name of the repository
body = dagshub_api.PatchIssue() # PatchIssue |  (optional)

try:
    # Edit an issue
    api_response = api_instance.edit_issue(owner, repo, body=body)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling IssuesApi->edit_issue: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| owner of the repository | 
 **repo** | **str**| name of the repository | 
 **body** | [**PatchIssue**](PatchIssue.md)|  | [optional] 

### Return type

[**Issue**](Issue.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_issue**
> Issue get_issue(owner, repo, index)

Get a single issue

This endpoint may also return pull requests in the response. If an issue is a pull request, the object will include a pull_request key.

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
api_instance = dagshub_api.IssuesApi(dagshub_api.ApiClient(configuration))
owner = 'owner_example' # str | owner of the repository
repo = 'repo_example' # str | name of the repository
index = 56 # int | the index of an issue or a pull request

try:
    # Get a single issue
    api_response = api_instance.get_issue(owner, repo, index)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling IssuesApi->get_issue: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| owner of the repository | 
 **repo** | **str**| name of the repository | 
 **index** | **int**| the index of an issue or a pull request | 

### Return type

[**Issue**](Issue.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list_repo_issues**
> Issues list_repo_issues(owner, repo)

List issues for a repository

This endpoint may also return pull requests in the response. If an issue is a pull request, the object will include a pull_request key.

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
api_instance = dagshub_api.IssuesApi(dagshub_api.ApiClient(configuration))
owner = 'owner_example' # str | owner of the repository
repo = 'repo_example' # str | name of the repository

try:
    # List issues for a repository
    api_response = api_instance.list_repo_issues(owner, repo)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling IssuesApi->list_repo_issues: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| owner of the repository | 
 **repo** | **str**| name of the repository | 

### Return type

[**Issues**](Issues.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

