# DagsHubApi.OrganizationsApi

All URIs are relative to *https://dagshub.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createOrgTeam**](OrganizationsApi.md#createOrgTeam) | **POST** /admin/orgs/{orgname}/teams | Create an organization team

<a name="createOrgTeam"></a>
# **createOrgTeam**
> createOrgTeam(body, orgname)

Create an organization team

Create a new team in an organization. Use team_type \&quot;annotator\&quot; to create an annotator team with access only to annotation projects.

### Example
```javascript
import {DagsHubApi} from 'dags_hub_api';
let defaultClient = DagsHubApi.ApiClient.instance;
// Configure HTTP basic authorization: basicAuth
let basicAuth = defaultClient.authentications['basicAuth'];
basicAuth.username = 'YOUR USERNAME';
basicAuth.password = 'YOUR PASSWORD';

// Configure API key authorization: tokenAuth
let tokenAuth = defaultClient.authentications['tokenAuth'];
tokenAuth.apiKey = 'YOUR API KEY';
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//tokenAuth.apiKeyPrefix = 'Token';

let apiInstance = new DagsHubApi.OrganizationsApi();
let body = new DagsHubApi.CreateAnnotatorTeam(); // CreateAnnotatorTeam | 
let orgname = "orgname_example"; // String | A DagsHub organization name

apiInstance.createOrgTeam(body, orgname, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully.');
  }
});
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CreateAnnotatorTeam**](CreateAnnotatorTeam.md)|  | 
 **orgname** | **String**| A DagsHub organization name | 

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

