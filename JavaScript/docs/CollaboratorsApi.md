# DagsHubApi.CollaboratorsApi

All URIs are relative to *https://dagshub.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addCollaborator**](CollaboratorsApi.md#addCollaborator) | **PUT** /repos/{owner}/{repo}/collaborators/{collaborator} | Add user as a collaborator
[**getCollaborators**](CollaboratorsApi.md#getCollaborators) | **GET** /repos/{owner}/{repo}/collaborators | Get collaborators
[**removeCollaborator**](CollaboratorsApi.md#removeCollaborator) | **DELETE** /repos/{owner}/{repo}/collaborators/{collaborator} | Delete collaborator

<a name="addCollaborator"></a>
# **addCollaborator**
> addCollaborator(owner, repo, collaborator, opts)

Add user as a collaborator

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

let apiInstance = new DagsHubApi.CollaboratorsApi();
let owner = "owner_example"; // String | owner of the repository
let repo = "repo_example"; // String | name of the repository
let collaborator = "collaborator_example"; // String | collaborator username
let opts = { 
  'body': new DagsHubApi.CollaboratorsCollaboratorBody() // CollaboratorsCollaboratorBody | 
};
apiInstance.addCollaborator(owner, repo, collaborator, opts, (error, data, response) => {
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
 **collaborator** | **String**| collaborator username | 
 **body** | [**CollaboratorsCollaboratorBody**](CollaboratorsCollaboratorBody.md)|  | [optional] 

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="getCollaborators"></a>
# **getCollaborators**
> getCollaborators(owner, repo)

Get collaborators

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

let apiInstance = new DagsHubApi.CollaboratorsApi();
let owner = "owner_example"; // String | owner of the repository
let repo = "repo_example"; // String | name of the repository

apiInstance.getCollaborators(owner, repo, (error, data, response) => {
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

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="removeCollaborator"></a>
# **removeCollaborator**
> removeCollaborator(owner, repo, collaborator)

Delete collaborator

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

let apiInstance = new DagsHubApi.CollaboratorsApi();
let owner = "owner_example"; // String | owner of the repository
let repo = "repo_example"; // String | name of the repository
let collaborator = "collaborator_example"; // String | collaborator username

apiInstance.removeCollaborator(owner, repo, collaborator, (error, data, response) => {
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
 **collaborator** | **String**| collaborator username | 

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

