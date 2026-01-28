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
```kotlin
// Import classes:
//import dagshub_api.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = OrganizationsApi()
val body : CreateAnnotatorTeam =  // CreateAnnotatorTeam | 
val orgname : kotlin.String = orgname_example // kotlin.String | A DagsHub organization name
try {
    apiInstance.createOrgTeam(body, orgname)
} catch (e: ClientException) {
    println("4xx response calling OrganizationsApi#createOrgTeam")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OrganizationsApi#createOrgTeam")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CreateAnnotatorTeam**](CreateAnnotatorTeam.md)|  |
 **orgname** | **kotlin.String**| A DagsHub organization name |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

