# CollaboratorsApi

All URIs are relative to *https://dagshub.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addCollaborator**](CollaboratorsApi.md#addCollaborator) | **PUT** /repos/{owner}/{repo}/collaborators/{collaborator} | Add user as a collaborator
[**getCollaborators**](CollaboratorsApi.md#getCollaborators) | **GET** /repos/{owner}/{repo}/collaborators | Get collaborators
[**removeCollaborator**](CollaboratorsApi.md#removeCollaborator) | **DELETE** /repos/{owner}/{repo}/collaborators/{collaborator} | Delete collaborator

<a name="addCollaborator"></a>
# **addCollaborator**
> addCollaborator(owner, repo, collaborator, body)

Add user as a collaborator

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CollaboratorsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

// Configure API key authorization: tokenAuth
ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
tokenAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//tokenAuth.setApiKeyPrefix("Token");

CollaboratorsApi apiInstance = new CollaboratorsApi();
String owner = "owner_example"; // String | owner of the repository
String repo = "repo_example"; // String | name of the repository
String collaborator = "collaborator_example"; // String | collaborator username
CollaboratorsCollaboratorBody body = new CollaboratorsCollaboratorBody(); // CollaboratorsCollaboratorBody | 
try {
    apiInstance.addCollaborator(owner, repo, collaborator, body);
} catch (ApiException e) {
    System.err.println("Exception when calling CollaboratorsApi#addCollaborator");
    e.printStackTrace();
}
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

[basicAuth](../README.md#basicAuth)[tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="getCollaborators"></a>
# **getCollaborators**
> getCollaborators(owner, repo)

Get collaborators

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CollaboratorsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

// Configure API key authorization: tokenAuth
ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
tokenAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//tokenAuth.setApiKeyPrefix("Token");

CollaboratorsApi apiInstance = new CollaboratorsApi();
String owner = "owner_example"; // String | owner of the repository
String repo = "repo_example"; // String | name of the repository
try {
    apiInstance.getCollaborators(owner, repo);
} catch (ApiException e) {
    System.err.println("Exception when calling CollaboratorsApi#getCollaborators");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**| owner of the repository |
 **repo** | **String**| name of the repository |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)[tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="removeCollaborator"></a>
# **removeCollaborator**
> removeCollaborator(owner, repo, collaborator)

Delete collaborator

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CollaboratorsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();
// Configure HTTP basic authorization: basicAuth
HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
basicAuth.setUsername("YOUR USERNAME");
basicAuth.setPassword("YOUR PASSWORD");

// Configure API key authorization: tokenAuth
ApiKeyAuth tokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("tokenAuth");
tokenAuth.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//tokenAuth.setApiKeyPrefix("Token");

CollaboratorsApi apiInstance = new CollaboratorsApi();
String owner = "owner_example"; // String | owner of the repository
String repo = "repo_example"; // String | name of the repository
String collaborator = "collaborator_example"; // String | collaborator username
try {
    apiInstance.removeCollaborator(owner, repo, collaborator);
} catch (ApiException e) {
    System.err.println("Exception when calling CollaboratorsApi#removeCollaborator");
    e.printStackTrace();
}
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

[basicAuth](../README.md#basicAuth)[tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

