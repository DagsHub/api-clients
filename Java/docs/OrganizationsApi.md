# OrganizationsApi

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
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.OrganizationsApi;

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

OrganizationsApi apiInstance = new OrganizationsApi();
CreateAnnotatorTeam body = new CreateAnnotatorTeam(); // CreateAnnotatorTeam | 
String orgname = "orgname_example"; // String | A DagsHub organization name
try {
    apiInstance.createOrgTeam(body, orgname);
} catch (ApiException e) {
    System.err.println("Exception when calling OrganizationsApi#createOrgTeam");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CreateAnnotatorTeam**](CreateAnnotatorTeam.md)|  |
 **orgname** | **String**| A DagsHub organization name |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)[tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

