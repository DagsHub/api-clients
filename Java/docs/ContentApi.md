# ContentApi

All URIs are relative to *https://dagshub.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getArchive**](ContentApi.md#getArchive) | **GET** /repos/{username}/{repo}/archive/{ref}/{format} | Download archive
[**getContent**](ContentApi.md#getContent) | **GET** /repos/{owner}/{repo}/content/{branch}/{path} | List data in a repository folder
[**getRaw**](ContentApi.md#getRaw) | **GET** /repos/{username}/{repo}/raw/{ref}/{path} | Download raw content
[**uploadContent**](ContentApi.md#uploadContent) | **PUT** /repos/{owner}/{repo}/content/{branch}/{path} | Upload data to a repository

<a name="getArchive"></a>
# **getArchive**
> getArchive(username, repo, ref, format)

Download archive

This method returns archive by given format.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ContentApi;

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

ContentApi apiInstance = new ContentApi();
String username = "username_example"; // String | A DagsHub username
String repo = "repo_example"; // String | name of the repository
String ref = "ref_example"; // String | The name of the commit/branch/tag
String format = "format_example"; // String | The format of archive, either .zip or .tar.gz
try {
    apiInstance.getArchive(username, repo, ref, format);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentApi#getArchive");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**| A DagsHub username |
 **repo** | **String**| name of the repository |
 **ref** | **String**| The name of the commit/branch/tag |
 **format** | **String**| The format of archive, either .zip or .tar.gz | [enum: .zip, .tar.gz]

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)[tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getContent"></a>
# **getContent**
> Files getContent(owner, repo, branch, path, includeSize)

List data in a repository folder

List files, commit sha1, and versioning type for a folder in repository.  To get sizes add to the query param &#x60;include_size&#x3D;true&#x60;. May result slower response. 

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ContentApi;

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

ContentApi apiInstance = new ContentApi();
String owner = "owner_example"; // String | owner of the repository
String repo = "repo_example"; // String | name of the repository
String branch = "branch_example"; // String | branch of the repository
String path = "path_example"; // String | path of a folder in the repository
Boolean includeSize = false; // Boolean | 
try {
    Files result = apiInstance.getContent(owner, repo, branch, path, includeSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentApi#getContent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**| owner of the repository |
 **repo** | **String**| name of the repository |
 **branch** | **String**| branch of the repository |
 **path** | **String**| path of a folder in the repository |
 **includeSize** | **Boolean**|  | [optional] [default to false]

### Return type

[**Files**](Files.md)

### Authorization

[basicAuth](../README.md#basicAuth)[tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getRaw"></a>
# **getRaw**
> getRaw(username, repo, ref, path)

Download raw content

This method returns the raw content of a file.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ContentApi;

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

ContentApi apiInstance = new ContentApi();
String username = "username_example"; // String | A DagsHub username
String repo = "repo_example"; // String | name of the repository
String ref = "ref_example"; // String | The name of the commit/branch/tag
String path = "path_example"; // String | The content path
try {
    apiInstance.getRaw(username, repo, ref, path);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentApi#getRaw");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **String**| A DagsHub username |
 **repo** | **String**| name of the repository |
 **ref** | **String**| The name of the commit/branch/tag |
 **path** | **String**| The content path |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)[tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="uploadContent"></a>
# **uploadContent**
> uploadContent(owner, repo, branch, path, commitSummary, commitMessage, commitChoice, lastCommit, newBranchName, versioning, files)

Upload data to a repository

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ContentApi;

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

ContentApi apiInstance = new ContentApi();
String owner = "owner_example"; // String | owner of the repository
String repo = "repo_example"; // String | name of the repository
String branch = "branch_example"; // String | branch of the repository
String path = "path_example"; // String | path of a folder in the repository
String commitSummary = "commitSummary_example"; // String | 
String commitMessage = "commitMessage_example"; // String | 
String commitChoice = "commitChoice_example"; // String | 
String lastCommit = "lastCommit_example"; // String | 
String newBranchName = "newBranchName_example"; // String | 
String versioning = "versioning_example"; // String | 
String files = "files_example"; // String | 
try {
    apiInstance.uploadContent(owner, repo, branch, path, commitSummary, commitMessage, commitChoice, lastCommit, newBranchName, versioning, files);
} catch (ApiException e) {
    System.err.println("Exception when calling ContentApi#uploadContent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**| owner of the repository |
 **repo** | **String**| name of the repository |
 **branch** | **String**| branch of the repository |
 **path** | **String**| path of a folder in the repository |
 **commitSummary** | **String**|  | [optional]
 **commitMessage** | **String**|  | [optional]
 **commitChoice** | **String**|  | [optional] [enum: direct, commit-to-new-branch]
 **lastCommit** | **String**|  | [optional]
 **newBranchName** | **String**|  | [optional]
 **versioning** | **String**|  | [optional] [enum: auto, dvc, git]
 **files** | **String**|  | [optional]

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)[tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: Not defined

