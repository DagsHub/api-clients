# CommitsApi

All URIs are relative to *https://dagshub.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCommit**](CommitsApi.md#getCommit) | **GET** /repos/{owner}/{repo}/commits/{sha} | Get a single commit

<a name="getCommit"></a>
# **getCommit**
> getCommit(owner, repo, sha)

Get a single commit

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.CommitsApi;

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

CommitsApi apiInstance = new CommitsApi();
String owner = "owner_example"; // String | owner of the repository
String repo = "repo_example"; // String | name of the repository
String sha = "sha_example"; // String | a SHA1 of a commit
try {
    apiInstance.getCommit(owner, repo, sha);
} catch (ApiException e) {
    System.err.println("Exception when calling CommitsApi#getCommit");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **String**| owner of the repository |
 **repo** | **String**| name of the repository |
 **sha** | **String**| a SHA1 of a commit |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)[tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

