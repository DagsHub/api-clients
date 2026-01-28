# AnnotationsApi

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
> LabelStudioProjectAccess getLabelStudioTeamAccess(owner, repo, teamid, projectId)

Get team access level for annotation projects

Get the access level for a specific team and project (or all projects)

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AnnotationsApi;

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

AnnotationsApi apiInstance = new AnnotationsApi();
String owner = "owner_example"; // String | owner of the repository
String repo = "repo_example"; // String | name of the repository
Long teamid = 789L; // Long | Team ID
Long projectId = 789L; // Long | Label Studio project ID to filter by. If not specified, returns access for all projects. Use -1 for wildcard access.
try {
    LabelStudioProjectAccess result = apiInstance.getLabelStudioTeamAccess(owner, repo, teamid, projectId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AnnotationsApi#getLabelStudioTeamAccess");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**| owner of the repository |
 **repo** | **String**| name of the repository |
 **teamid** | **Long**| Team ID |
 **projectId** | **Long**| Label Studio project ID to filter by. If not specified, returns access for all projects. Use -1 for wildcard access. | [optional]

### Return type

[**LabelStudioProjectAccess**](LabelStudioProjectAccess.md)

### Authorization

[basicAuth](../README.md#basicAuth)[tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getLabelStudioUserAccess"></a>
# **getLabelStudioUserAccess**
> InlineResponse200 getLabelStudioUserAccess(owner, repo, userid, projectId)

Get user access level for annotation projects

Get the access level for a specific user and project (or all projects)

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AnnotationsApi;

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

AnnotationsApi apiInstance = new AnnotationsApi();
String owner = "owner_example"; // String | owner of the repository
String repo = "repo_example"; // String | name of the repository
Long userid = 789L; // Long | User ID
Long projectId = 789L; // Long | Label Studio project ID to filter by. If not specified, returns access for all projects. Use -1 for wildcard access.
try {
    InlineResponse200 result = apiInstance.getLabelStudioUserAccess(owner, repo, userid, projectId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AnnotationsApi#getLabelStudioUserAccess");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**| owner of the repository |
 **repo** | **String**| name of the repository |
 **userid** | **Long**| User ID |
 **projectId** | **Long**| Label Studio project ID to filter by. If not specified, returns access for all projects. Use -1 for wildcard access. | [optional]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

[basicAuth](../README.md#basicAuth)[tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="grantLabelStudioTeamAccess"></a>
# **grantLabelStudioTeamAccess**
> grantLabelStudioTeamAccess(body, owner, repo, teamid)

Grant team access to annotation projects

Grant a team access to specific Label Studio annotation projects (organization repositories only)

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AnnotationsApi;

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

AnnotationsApi apiInstance = new AnnotationsApi();
GrantLabelStudioAccess body = new GrantLabelStudioAccess(); // GrantLabelStudioAccess | 
String owner = "owner_example"; // String | owner of the repository
String repo = "repo_example"; // String | name of the repository
Long teamid = 789L; // Long | Team ID
try {
    apiInstance.grantLabelStudioTeamAccess(body, owner, repo, teamid);
} catch (ApiException e) {
    System.err.println("Exception when calling AnnotationsApi#grantLabelStudioTeamAccess");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**GrantLabelStudioAccess**](GrantLabelStudioAccess.md)|  |
 **owner** | **String**| owner of the repository |
 **repo** | **String**| name of the repository |
 **teamid** | **Long**| Team ID |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)[tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="grantLabelStudioUserAccess"></a>
# **grantLabelStudioUserAccess**
> grantLabelStudioUserAccess(body, owner, repo, userid)

Grant user access to annotation projects

Grant a user access to specific Label Studio annotation projects. User must be an organization member if the repo is owned by an organization.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AnnotationsApi;

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

AnnotationsApi apiInstance = new AnnotationsApi();
GrantLabelStudioAccess body = new GrantLabelStudioAccess(); // GrantLabelStudioAccess | 
String owner = "owner_example"; // String | owner of the repository
String repo = "repo_example"; // String | name of the repository
Long userid = 789L; // Long | User ID
try {
    apiInstance.grantLabelStudioUserAccess(body, owner, repo, userid);
} catch (ApiException e) {
    System.err.println("Exception when calling AnnotationsApi#grantLabelStudioUserAccess");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**GrantLabelStudioAccess**](GrantLabelStudioAccess.md)|  |
 **owner** | **String**| owner of the repository |
 **repo** | **String**| name of the repository |
 **userid** | **Long**| User ID |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)[tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="listLabelStudioTeamAccess"></a>
# **listLabelStudioTeamAccess**
> List&lt;LabelStudioProjectAccess&gt; listLabelStudioTeamAccess(owner, repo, projectId)

List team access entries for annotation projects

Get a list of teams with access to Label Studio annotation projects in the repository (organization repositories only)

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AnnotationsApi;

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

AnnotationsApi apiInstance = new AnnotationsApi();
String owner = "owner_example"; // String | owner of the repository
String repo = "repo_example"; // String | name of the repository
Long projectId = 789L; // Long | Label Studio project ID to filter by. If not specified, returns access for all projects. Use -1 for wildcard access.
try {
    List<LabelStudioProjectAccess> result = apiInstance.listLabelStudioTeamAccess(owner, repo, projectId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AnnotationsApi#listLabelStudioTeamAccess");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**| owner of the repository |
 **repo** | **String**| name of the repository |
 **projectId** | **Long**| Label Studio project ID to filter by. If not specified, returns access for all projects. Use -1 for wildcard access. | [optional]

### Return type

[**List&lt;LabelStudioProjectAccess&gt;**](LabelStudioProjectAccess.md)

### Authorization

[basicAuth](../README.md#basicAuth)[tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listLabelStudioUserAccess"></a>
# **listLabelStudioUserAccess**
> List&lt;LabelStudioProjectAccess&gt; listLabelStudioUserAccess(owner, repo, projectId)

List user access entries for annotation projects

Get a list of users with access to Label Studio annotation projects in the repository

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AnnotationsApi;

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

AnnotationsApi apiInstance = new AnnotationsApi();
String owner = "owner_example"; // String | owner of the repository
String repo = "repo_example"; // String | name of the repository
Long projectId = 789L; // Long | Label Studio project ID to filter by. If not specified, returns access for all projects. Use -1 for wildcard access.
try {
    List<LabelStudioProjectAccess> result = apiInstance.listLabelStudioUserAccess(owner, repo, projectId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AnnotationsApi#listLabelStudioUserAccess");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**| owner of the repository |
 **repo** | **String**| name of the repository |
 **projectId** | **Long**| Label Studio project ID to filter by. If not specified, returns access for all projects. Use -1 for wildcard access. | [optional]

### Return type

[**List&lt;LabelStudioProjectAccess&gt;**](LabelStudioProjectAccess.md)

### Authorization

[basicAuth](../README.md#basicAuth)[tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="revokeLabelStudioTeamAccess"></a>
# **revokeLabelStudioTeamAccess**
> revokeLabelStudioTeamAccess(owner, repo, teamid, projectId)

Revoke team access to annotation projects

Revoke a team&#x27;s access to Label Studio annotation projects

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AnnotationsApi;

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

AnnotationsApi apiInstance = new AnnotationsApi();
String owner = "owner_example"; // String | owner of the repository
String repo = "repo_example"; // String | name of the repository
Long teamid = 789L; // Long | Team ID
Long projectId = 789L; // Long | Label Studio project ID to filter by. If not specified, returns access for all projects. Use -1 for wildcard access.
try {
    apiInstance.revokeLabelStudioTeamAccess(owner, repo, teamid, projectId);
} catch (ApiException e) {
    System.err.println("Exception when calling AnnotationsApi#revokeLabelStudioTeamAccess");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**| owner of the repository |
 **repo** | **String**| name of the repository |
 **teamid** | **Long**| Team ID |
 **projectId** | **Long**| Label Studio project ID to filter by. If not specified, returns access for all projects. Use -1 for wildcard access. | [optional]

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)[tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="revokeLabelStudioUserAccess"></a>
# **revokeLabelStudioUserAccess**
> revokeLabelStudioUserAccess(owner, repo, userid, projectId)

Revoke user access to annotation projects

Revoke a user&#x27;s access to Label Studio annotation projects

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.AnnotationsApi;

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

AnnotationsApi apiInstance = new AnnotationsApi();
String owner = "owner_example"; // String | owner of the repository
String repo = "repo_example"; // String | name of the repository
Long userid = 789L; // Long | User ID
Long projectId = 789L; // Long | Label Studio project ID to filter by. If not specified, returns access for all projects. Use -1 for wildcard access.
try {
    apiInstance.revokeLabelStudioUserAccess(owner, repo, userid, projectId);
} catch (ApiException e) {
    System.err.println("Exception when calling AnnotationsApi#revokeLabelStudioUserAccess");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**| owner of the repository |
 **repo** | **String**| name of the repository |
 **userid** | **Long**| User ID |
 **projectId** | **Long**| Label Studio project ID to filter by. If not specified, returns access for all projects. Use -1 for wildcard access. | [optional]

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)[tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

