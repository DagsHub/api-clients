# dagshub_api.AnnotationsApi

All URIs are relative to *https://dagshub.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_label_studio_team_access**](AnnotationsApi.md#get_label_studio_team_access) | **GET** /repos/{owner}/{repo}/annotations/access/teams/{teamid} | Get team access level for annotation projects
[**get_label_studio_user_access**](AnnotationsApi.md#get_label_studio_user_access) | **GET** /repos/{owner}/{repo}/annotations/access/users/{userid} | Get user access level for annotation projects
[**grant_label_studio_team_access**](AnnotationsApi.md#grant_label_studio_team_access) | **PUT** /repos/{owner}/{repo}/annotations/access/teams/{teamid} | Grant team access to annotation projects
[**grant_label_studio_user_access**](AnnotationsApi.md#grant_label_studio_user_access) | **PUT** /repos/{owner}/{repo}/annotations/access/users/{userid} | Grant user access to annotation projects
[**list_label_studio_team_access**](AnnotationsApi.md#list_label_studio_team_access) | **GET** /repos/{owner}/{repo}/annotations/access/teams | List team access entries for annotation projects
[**list_label_studio_user_access**](AnnotationsApi.md#list_label_studio_user_access) | **GET** /repos/{owner}/{repo}/annotations/access/users | List user access entries for annotation projects
[**revoke_label_studio_team_access**](AnnotationsApi.md#revoke_label_studio_team_access) | **DELETE** /repos/{owner}/{repo}/annotations/access/teams/{teamid} | Revoke team access to annotation projects
[**revoke_label_studio_user_access**](AnnotationsApi.md#revoke_label_studio_user_access) | **DELETE** /repos/{owner}/{repo}/annotations/access/users/{userid} | Revoke user access to annotation projects

# **get_label_studio_team_access**
> LabelStudioProjectAccess get_label_studio_team_access(owner, repo, teamid, project_id=project_id)

Get team access level for annotation projects

Get the access level for a specific team and project (or all projects)

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
api_instance = dagshub_api.AnnotationsApi(dagshub_api.ApiClient(configuration))
owner = 'owner_example' # str | owner of the repository
repo = 'repo_example' # str | name of the repository
teamid = 789 # int | Team ID
project_id = 789 # int | Label Studio project ID to filter by. If not specified, returns access for all projects. Use -1 for wildcard access. (optional)

try:
    # Get team access level for annotation projects
    api_response = api_instance.get_label_studio_team_access(owner, repo, teamid, project_id=project_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AnnotationsApi->get_label_studio_team_access: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| owner of the repository | 
 **repo** | **str**| name of the repository | 
 **teamid** | **int**| Team ID | 
 **project_id** | **int**| Label Studio project ID to filter by. If not specified, returns access for all projects. Use -1 for wildcard access. | [optional] 

### Return type

[**LabelStudioProjectAccess**](LabelStudioProjectAccess.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_label_studio_user_access**
> InlineResponse200 get_label_studio_user_access(owner, repo, userid, project_id=project_id)

Get user access level for annotation projects

Get the access level for a specific user and project (or all projects)

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
api_instance = dagshub_api.AnnotationsApi(dagshub_api.ApiClient(configuration))
owner = 'owner_example' # str | owner of the repository
repo = 'repo_example' # str | name of the repository
userid = 789 # int | User ID
project_id = 789 # int | Label Studio project ID to filter by. If not specified, returns access for all projects. Use -1 for wildcard access. (optional)

try:
    # Get user access level for annotation projects
    api_response = api_instance.get_label_studio_user_access(owner, repo, userid, project_id=project_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AnnotationsApi->get_label_studio_user_access: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| owner of the repository | 
 **repo** | **str**| name of the repository | 
 **userid** | **int**| User ID | 
 **project_id** | **int**| Label Studio project ID to filter by. If not specified, returns access for all projects. Use -1 for wildcard access. | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **grant_label_studio_team_access**
> grant_label_studio_team_access(body, owner, repo, teamid)

Grant team access to annotation projects

Grant a team access to specific Label Studio annotation projects (organization repositories only)

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
api_instance = dagshub_api.AnnotationsApi(dagshub_api.ApiClient(configuration))
body = dagshub_api.GrantLabelStudioAccess() # GrantLabelStudioAccess | 
owner = 'owner_example' # str | owner of the repository
repo = 'repo_example' # str | name of the repository
teamid = 789 # int | Team ID

try:
    # Grant team access to annotation projects
    api_instance.grant_label_studio_team_access(body, owner, repo, teamid)
except ApiException as e:
    print("Exception when calling AnnotationsApi->grant_label_studio_team_access: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**GrantLabelStudioAccess**](GrantLabelStudioAccess.md)|  | 
 **owner** | **str**| owner of the repository | 
 **repo** | **str**| name of the repository | 
 **teamid** | **int**| Team ID | 

### Return type

void (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **grant_label_studio_user_access**
> grant_label_studio_user_access(body, owner, repo, userid)

Grant user access to annotation projects

Grant a user access to specific Label Studio annotation projects. User must be an organization member if the repo is owned by an organization.

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
api_instance = dagshub_api.AnnotationsApi(dagshub_api.ApiClient(configuration))
body = dagshub_api.GrantLabelStudioAccess() # GrantLabelStudioAccess | 
owner = 'owner_example' # str | owner of the repository
repo = 'repo_example' # str | name of the repository
userid = 789 # int | User ID

try:
    # Grant user access to annotation projects
    api_instance.grant_label_studio_user_access(body, owner, repo, userid)
except ApiException as e:
    print("Exception when calling AnnotationsApi->grant_label_studio_user_access: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**GrantLabelStudioAccess**](GrantLabelStudioAccess.md)|  | 
 **owner** | **str**| owner of the repository | 
 **repo** | **str**| name of the repository | 
 **userid** | **int**| User ID | 

### Return type

void (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list_label_studio_team_access**
> list[LabelStudioProjectAccess] list_label_studio_team_access(owner, repo, project_id=project_id)

List team access entries for annotation projects

Get a list of teams with access to Label Studio annotation projects in the repository (organization repositories only)

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
api_instance = dagshub_api.AnnotationsApi(dagshub_api.ApiClient(configuration))
owner = 'owner_example' # str | owner of the repository
repo = 'repo_example' # str | name of the repository
project_id = 789 # int | Label Studio project ID to filter by. If not specified, returns access for all projects. Use -1 for wildcard access. (optional)

try:
    # List team access entries for annotation projects
    api_response = api_instance.list_label_studio_team_access(owner, repo, project_id=project_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AnnotationsApi->list_label_studio_team_access: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| owner of the repository | 
 **repo** | **str**| name of the repository | 
 **project_id** | **int**| Label Studio project ID to filter by. If not specified, returns access for all projects. Use -1 for wildcard access. | [optional] 

### Return type

[**list[LabelStudioProjectAccess]**](LabelStudioProjectAccess.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list_label_studio_user_access**
> list[LabelStudioProjectAccess] list_label_studio_user_access(owner, repo, project_id=project_id)

List user access entries for annotation projects

Get a list of users with access to Label Studio annotation projects in the repository

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
api_instance = dagshub_api.AnnotationsApi(dagshub_api.ApiClient(configuration))
owner = 'owner_example' # str | owner of the repository
repo = 'repo_example' # str | name of the repository
project_id = 789 # int | Label Studio project ID to filter by. If not specified, returns access for all projects. Use -1 for wildcard access. (optional)

try:
    # List user access entries for annotation projects
    api_response = api_instance.list_label_studio_user_access(owner, repo, project_id=project_id)
    pprint(api_response)
except ApiException as e:
    print("Exception when calling AnnotationsApi->list_label_studio_user_access: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| owner of the repository | 
 **repo** | **str**| name of the repository | 
 **project_id** | **int**| Label Studio project ID to filter by. If not specified, returns access for all projects. Use -1 for wildcard access. | [optional] 

### Return type

[**list[LabelStudioProjectAccess]**](LabelStudioProjectAccess.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **revoke_label_studio_team_access**
> revoke_label_studio_team_access(owner, repo, teamid, project_id=project_id)

Revoke team access to annotation projects

Revoke a team's access to Label Studio annotation projects

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
api_instance = dagshub_api.AnnotationsApi(dagshub_api.ApiClient(configuration))
owner = 'owner_example' # str | owner of the repository
repo = 'repo_example' # str | name of the repository
teamid = 789 # int | Team ID
project_id = 789 # int | Label Studio project ID to filter by. If not specified, returns access for all projects. Use -1 for wildcard access. (optional)

try:
    # Revoke team access to annotation projects
    api_instance.revoke_label_studio_team_access(owner, repo, teamid, project_id=project_id)
except ApiException as e:
    print("Exception when calling AnnotationsApi->revoke_label_studio_team_access: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| owner of the repository | 
 **repo** | **str**| name of the repository | 
 **teamid** | **int**| Team ID | 
 **project_id** | **int**| Label Studio project ID to filter by. If not specified, returns access for all projects. Use -1 for wildcard access. | [optional] 

### Return type

void (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **revoke_label_studio_user_access**
> revoke_label_studio_user_access(owner, repo, userid, project_id=project_id)

Revoke user access to annotation projects

Revoke a user's access to Label Studio annotation projects

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
api_instance = dagshub_api.AnnotationsApi(dagshub_api.ApiClient(configuration))
owner = 'owner_example' # str | owner of the repository
repo = 'repo_example' # str | name of the repository
userid = 789 # int | User ID
project_id = 789 # int | Label Studio project ID to filter by. If not specified, returns access for all projects. Use -1 for wildcard access. (optional)

try:
    # Revoke user access to annotation projects
    api_instance.revoke_label_studio_user_access(owner, repo, userid, project_id=project_id)
except ApiException as e:
    print("Exception when calling AnnotationsApi->revoke_label_studio_user_access: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **str**| owner of the repository | 
 **repo** | **str**| name of the repository | 
 **userid** | **int**| User ID | 
 **project_id** | **int**| Label Studio project ID to filter by. If not specified, returns access for all projects. Use -1 for wildcard access. | [optional] 

### Return type

void (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

