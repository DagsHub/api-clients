# dagshub_api.OrganizationsApi

All URIs are relative to *https://dagshub.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_org_team**](OrganizationsApi.md#create_org_team) | **POST** /admin/orgs/{orgname}/teams | Create an organization team

# **create_org_team**
> create_org_team(body, orgname)

Create an organization team

Create a new team in an organization. Use team_type \"annotator\" to create an annotator team with access only to annotation projects.

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
api_instance = dagshub_api.OrganizationsApi(dagshub_api.ApiClient(configuration))
body = dagshub_api.CreateAnnotatorTeam() # CreateAnnotatorTeam | 
orgname = 'orgname_example' # str | A DagsHub organization name

try:
    # Create an organization team
    api_instance.create_org_team(body, orgname)
except ApiException as e:
    print("Exception when calling OrganizationsApi->create_org_team: %s\n" % e)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CreateAnnotatorTeam**](CreateAnnotatorTeam.md)|  | 
 **orgname** | **str**| A DagsHub organization name | 

### Return type

void (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

