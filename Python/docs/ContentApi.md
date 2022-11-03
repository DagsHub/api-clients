# dagshub_api.ContentApi

All URIs are relative to *https://dagshub.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_archive**](ContentApi.md#get_archive) | **GET** /repos/{username}/{repo}/archive/{ref}{format} | Download archive
[**get_content**](ContentApi.md#get_content) | **GET** /repos/{owner}/{repo}/content/{branch}/{path} | List data in a repository folder
[**get_raw**](ContentApi.md#get_raw) | **GET** /repos/{username}/{repo}/raw/{ref}/{path} | Download raw content
[**upload_content**](ContentApi.md#upload_content) | **PUT** /repos/{owner}/{repo}/content/{branch}/{path} | Upload data to a repository

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

# **get_content**
> Files get_content(owner, repo, branch, path, include_size=include_size)

List data in a repository folder

List files, commit sha1, and versioning type for a folder in repository.  To get sizes add to the query param `include_size=true`. May result slower response. 

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
owner = 'owner_example' # str | owner of the repository
repo = 'repo_example' # str | name of the repository
branch = 'branch_example' # str | branch of the repository
path = 'path_example' # str | path of a folder in the repository
include_size = false # bool |  (optional) (default to false)

try:
    # List data in a repository folder
    api_response = api_instance.get_content(owner, repo, branch, path, include_size=include_size)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling ContentApi->get_content: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| owner of the repository | 
 **repo** | **str**| name of the repository | 
 **branch** | **str**| branch of the repository | 
 **path** | **str**| path of a folder in the repository | 
 **include_size** | **bool**|  | [optional] [default to false]

### Return type

[**Files**](Files.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

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

# **upload_content**
> upload_content(owner, repo, branch, path, commit_summary=commit_summary, commit_message=commit_message, commit_choice=commit_choice, last_commit=last_commit, new_branch_name=new_branch_name, versioning=versioning, files=files)

Upload data to a repository

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
owner = 'owner_example' # str | owner of the repository
repo = 'repo_example' # str | name of the repository
branch = 'branch_example' # str | branch of the repository
path = 'path_example' # str | path of a folder in the repository
commit_summary = 'commit_summary_example' # str |  (optional)
commit_message = 'commit_message_example' # str |  (optional)
commit_choice = 'commit_choice_example' # str |  (optional)
last_commit = 'last_commit_example' # str |  (optional)
new_branch_name = 'new_branch_name_example' # str |  (optional)
versioning = 'versioning_example' # str |  (optional)
files = 'files_example' # str |  (optional)

try:
    # Upload data to a repository
    api_instance.upload_content(owner, repo, branch, path, commit_summary=commit_summary, commit_message=commit_message, commit_choice=commit_choice, last_commit=last_commit, new_branch_name=new_branch_name, versioning=versioning, files=files)
except ApiException as e:
    print("Exception when calling ContentApi->upload_content: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| owner of the repository | 
 **repo** | **str**| name of the repository | 
 **branch** | **str**| branch of the repository | 
 **path** | **str**| path of a folder in the repository | 
 **commit_summary** | **str**|  | [optional] 
 **commit_message** | **str**|  | [optional] 
 **commit_choice** | **str**|  | [optional] 
 **last_commit** | **str**|  | [optional] 
 **new_branch_name** | **str**|  | [optional] 
 **versioning** | **str**|  | [optional] 
 **files** | **str**|  | [optional] 

### Return type

void (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

