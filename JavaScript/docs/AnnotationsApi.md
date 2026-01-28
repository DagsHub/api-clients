# DagsHubApi.AnnotationsApi

All URIs are relative to *https://dagshub.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getLabelStudioTeamAccess**](AnnotationsApi.md#getLabelStudioTeamAccess) | **GET** /repos/{owner}/{repo}/annotations/access/teams/{teamid} | Get team access level for annotation projects
[**getLabelStudioUserAccess**](AnnotationsApi.md#getLabelStudioUserAccess) | **GET** /repos/{owner}/{repo}/annotations/access/users/{userid} | Get user access level for annotation projects
[**grantLabelStudioTeamAccess**](AnnotationsApi.md#grantLabelStudioTeamAccess) | **PUT** /repos/{owner}/{repo}/annotations/access/teams/{teamid} | Grant team access to annotation projects
[**grantLabelStudioUserAccess**](AnnotationsApi.md#grantLabelStudioUserAccess) | **PUT** /repos/{owner}/{repo}/annotations/access/users/{userid} | Grant user access to annotation projects
[**listLabelStudioTeamAccess**](AnnotationsApi.md#listLabelStudioTeamAccess) | **GET** /repos/{owner}/{repo}/annotations/access/teams | List team access entries for annotation projects
[**listLabelStudioUserAccess**](AnnotationsApi.md#listLabelStudioUserAccess) | **GET** /repos/{owner}/{repo}/annotations/access/users | List user access entries for annotation projects
[**revokeLabelStudioTeamAccess**](AnnotationsApi.md#revokeLabelStudioTeamAccess) | **DELETE** /repos/{owner}/{repo}/annotations/access/teams/{teamid} | Revoke team access to annotation projects
[**revokeLabelStudioUserAccess**](AnnotationsApi.md#revokeLabelStudioUserAccess) | **DELETE** /repos/{owner}/{repo}/annotations/access/users/{userid} | Revoke user access to annotation projects

<a name="getLabelStudioTeamAccess"></a>
# **getLabelStudioTeamAccess**
> LabelStudioProjectAccess getLabelStudioTeamAccess(owner, repo, teamid, opts)

Get team access level for annotation projects

Get the access level for a specific team and project (or all projects)

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

let apiInstance = new DagsHubApi.AnnotationsApi();
let owner = "owner_example"; // String | owner of the repository
let repo = "repo_example"; // String | name of the repository
let teamid = 789; // Number | Team ID
let opts = { 
  'projectId': 789 // Number | Label Studio project ID to filter by. If not specified, returns access for all projects. Use -1 for wildcard access.
};
apiInstance.getLabelStudioTeamAccess(owner, repo, teamid, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**| owner of the repository | 
 **repo** | **String**| name of the repository | 
 **teamid** | **Number**| Team ID | 
 **projectId** | **Number**| Label Studio project ID to filter by. If not specified, returns access for all projects. Use -1 for wildcard access. | [optional] 

### Return type

[**LabelStudioProjectAccess**](LabelStudioProjectAccess.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getLabelStudioUserAccess"></a>
# **getLabelStudioUserAccess**
> InlineResponse200 getLabelStudioUserAccess(owner, repo, userid, opts)

Get user access level for annotation projects

Get the access level for a specific user and project (or all projects)

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

let apiInstance = new DagsHubApi.AnnotationsApi();
let owner = "owner_example"; // String | owner of the repository
let repo = "repo_example"; // String | name of the repository
let userid = 789; // Number | User ID
let opts = { 
  'projectId': 789 // Number | Label Studio project ID to filter by. If not specified, returns access for all projects. Use -1 for wildcard access.
};
apiInstance.getLabelStudioUserAccess(owner, repo, userid, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**| owner of the repository | 
 **repo** | **String**| name of the repository | 
 **userid** | **Number**| User ID | 
 **projectId** | **Number**| Label Studio project ID to filter by. If not specified, returns access for all projects. Use -1 for wildcard access. | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="grantLabelStudioTeamAccess"></a>
# **grantLabelStudioTeamAccess**
> grantLabelStudioTeamAccess(body, owner, repo, teamid)

Grant team access to annotation projects

Grant a team access to specific Label Studio annotation projects (organization repositories only)

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

let apiInstance = new DagsHubApi.AnnotationsApi();
let body = new DagsHubApi.GrantLabelStudioAccess(); // GrantLabelStudioAccess | 
let owner = "owner_example"; // String | owner of the repository
let repo = "repo_example"; // String | name of the repository
let teamid = 789; // Number | Team ID

apiInstance.grantLabelStudioTeamAccess(body, owner, repo, teamid, (error, data, response) => {
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
 **body** | [**GrantLabelStudioAccess**](GrantLabelStudioAccess.md)|  | 
 **owner** | **String**| owner of the repository | 
 **repo** | **String**| name of the repository | 
 **teamid** | **Number**| Team ID | 

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="grantLabelStudioUserAccess"></a>
# **grantLabelStudioUserAccess**
> grantLabelStudioUserAccess(body, owner, repo, userid)

Grant user access to annotation projects

Grant a user access to specific Label Studio annotation projects. User must be an organization member if the repo is owned by an organization.

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

let apiInstance = new DagsHubApi.AnnotationsApi();
let body = new DagsHubApi.GrantLabelStudioAccess(); // GrantLabelStudioAccess | 
let owner = "owner_example"; // String | owner of the repository
let repo = "repo_example"; // String | name of the repository
let userid = 789; // Number | User ID

apiInstance.grantLabelStudioUserAccess(body, owner, repo, userid, (error, data, response) => {
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
 **body** | [**GrantLabelStudioAccess**](GrantLabelStudioAccess.md)|  | 
 **owner** | **String**| owner of the repository | 
 **repo** | **String**| name of the repository | 
 **userid** | **Number**| User ID | 

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="listLabelStudioTeamAccess"></a>
# **listLabelStudioTeamAccess**
> [LabelStudioProjectAccess] listLabelStudioTeamAccess(owner, repo, opts)

List team access entries for annotation projects

Get a list of teams with access to Label Studio annotation projects in the repository (organization repositories only)

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

let apiInstance = new DagsHubApi.AnnotationsApi();
let owner = "owner_example"; // String | owner of the repository
let repo = "repo_example"; // String | name of the repository
let opts = { 
  'projectId': 789 // Number | Label Studio project ID to filter by. If not specified, returns access for all projects. Use -1 for wildcard access.
};
apiInstance.listLabelStudioTeamAccess(owner, repo, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**| owner of the repository | 
 **repo** | **String**| name of the repository | 
 **projectId** | **Number**| Label Studio project ID to filter by. If not specified, returns access for all projects. Use -1 for wildcard access. | [optional] 

### Return type

[**[LabelStudioProjectAccess]**](LabelStudioProjectAccess.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listLabelStudioUserAccess"></a>
# **listLabelStudioUserAccess**
> [LabelStudioProjectAccess] listLabelStudioUserAccess(owner, repo, opts)

List user access entries for annotation projects

Get a list of users with access to Label Studio annotation projects in the repository

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

let apiInstance = new DagsHubApi.AnnotationsApi();
let owner = "owner_example"; // String | owner of the repository
let repo = "repo_example"; // String | name of the repository
let opts = { 
  'projectId': 789 // Number | Label Studio project ID to filter by. If not specified, returns access for all projects. Use -1 for wildcard access.
};
apiInstance.listLabelStudioUserAccess(owner, repo, opts, (error, data, response) => {
  if (error) {
    console.error(error);
  } else {
    console.log('API called successfully. Returned data: ' + data);
  }
});
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**| owner of the repository | 
 **repo** | **String**| name of the repository | 
 **projectId** | **Number**| Label Studio project ID to filter by. If not specified, returns access for all projects. Use -1 for wildcard access. | [optional] 

### Return type

[**[LabelStudioProjectAccess]**](LabelStudioProjectAccess.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="revokeLabelStudioTeamAccess"></a>
# **revokeLabelStudioTeamAccess**
> revokeLabelStudioTeamAccess(owner, repo, teamid, opts)

Revoke team access to annotation projects

Revoke a team&#x27;s access to Label Studio annotation projects

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

let apiInstance = new DagsHubApi.AnnotationsApi();
let owner = "owner_example"; // String | owner of the repository
let repo = "repo_example"; // String | name of the repository
let teamid = 789; // Number | Team ID
let opts = { 
  'projectId': 789 // Number | Label Studio project ID to filter by. If not specified, returns access for all projects. Use -1 for wildcard access.
};
apiInstance.revokeLabelStudioTeamAccess(owner, repo, teamid, opts, (error, data, response) => {
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
 **owner** | **String**| owner of the repository | 
 **repo** | **String**| name of the repository | 
 **teamid** | **Number**| Team ID | 
 **projectId** | **Number**| Label Studio project ID to filter by. If not specified, returns access for all projects. Use -1 for wildcard access. | [optional] 

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="revokeLabelStudioUserAccess"></a>
# **revokeLabelStudioUserAccess**
> revokeLabelStudioUserAccess(owner, repo, userid, opts)

Revoke user access to annotation projects

Revoke a user&#x27;s access to Label Studio annotation projects

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

let apiInstance = new DagsHubApi.AnnotationsApi();
let owner = "owner_example"; // String | owner of the repository
let repo = "repo_example"; // String | name of the repository
let userid = 789; // Number | User ID
let opts = { 
  'projectId': 789 // Number | Label Studio project ID to filter by. If not specified, returns access for all projects. Use -1 for wildcard access.
};
apiInstance.revokeLabelStudioUserAccess(owner, repo, userid, opts, (error, data, response) => {
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
 **owner** | **String**| owner of the repository | 
 **repo** | **String**| name of the repository | 
 **userid** | **Number**| User ID | 
 **projectId** | **Number**| Label Studio project ID to filter by. If not specified, returns access for all projects. Use -1 for wildcard access. | [optional] 

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

