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
```kotlin
// Import classes:
//import dagshub_api.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = AnnotationsApi()
val owner : kotlin.String = owner_example // kotlin.String | owner of the repository
val repo : kotlin.String = repo_example // kotlin.String | name of the repository
val teamid : kotlin.Long = 789 // kotlin.Long | Team ID
val projectId : kotlin.Long = 789 // kotlin.Long | Label Studio project ID to filter by. If not specified, returns access for all projects. Use -1 for wildcard access.
try {
    val result : LabelStudioProjectAccess = apiInstance.getLabelStudioTeamAccess(owner, repo, teamid, projectId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AnnotationsApi#getLabelStudioTeamAccess")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AnnotationsApi#getLabelStudioTeamAccess")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| owner of the repository |
 **repo** | **kotlin.String**| name of the repository |
 **teamid** | **kotlin.Long**| Team ID |
 **projectId** | **kotlin.Long**| Label Studio project ID to filter by. If not specified, returns access for all projects. Use -1 for wildcard access. | [optional]

### Return type

[**LabelStudioProjectAccess**](LabelStudioProjectAccess.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getLabelStudioUserAccess"></a>
# **getLabelStudioUserAccess**
> InlineResponse200 getLabelStudioUserAccess(owner, repo, userid, projectId)

Get user access level for annotation projects

Get the access level for a specific user and project (or all projects)

### Example
```kotlin
// Import classes:
//import dagshub_api.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = AnnotationsApi()
val owner : kotlin.String = owner_example // kotlin.String | owner of the repository
val repo : kotlin.String = repo_example // kotlin.String | name of the repository
val userid : kotlin.Long = 789 // kotlin.Long | User ID
val projectId : kotlin.Long = 789 // kotlin.Long | Label Studio project ID to filter by. If not specified, returns access for all projects. Use -1 for wildcard access.
try {
    val result : InlineResponse200 = apiInstance.getLabelStudioUserAccess(owner, repo, userid, projectId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AnnotationsApi#getLabelStudioUserAccess")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AnnotationsApi#getLabelStudioUserAccess")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| owner of the repository |
 **repo** | **kotlin.String**| name of the repository |
 **userid** | **kotlin.Long**| User ID |
 **projectId** | **kotlin.Long**| Label Studio project ID to filter by. If not specified, returns access for all projects. Use -1 for wildcard access. | [optional]

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
```kotlin
// Import classes:
//import dagshub_api.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = AnnotationsApi()
val body : GrantLabelStudioAccess =  // GrantLabelStudioAccess | 
val owner : kotlin.String = owner_example // kotlin.String | owner of the repository
val repo : kotlin.String = repo_example // kotlin.String | name of the repository
val teamid : kotlin.Long = 789 // kotlin.Long | Team ID
try {
    apiInstance.grantLabelStudioTeamAccess(body, owner, repo, teamid)
} catch (e: ClientException) {
    println("4xx response calling AnnotationsApi#grantLabelStudioTeamAccess")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AnnotationsApi#grantLabelStudioTeamAccess")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**GrantLabelStudioAccess**](GrantLabelStudioAccess.md)|  |
 **owner** | **kotlin.String**| owner of the repository |
 **repo** | **kotlin.String**| name of the repository |
 **teamid** | **kotlin.Long**| Team ID |

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
```kotlin
// Import classes:
//import dagshub_api.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = AnnotationsApi()
val body : GrantLabelStudioAccess =  // GrantLabelStudioAccess | 
val owner : kotlin.String = owner_example // kotlin.String | owner of the repository
val repo : kotlin.String = repo_example // kotlin.String | name of the repository
val userid : kotlin.Long = 789 // kotlin.Long | User ID
try {
    apiInstance.grantLabelStudioUserAccess(body, owner, repo, userid)
} catch (e: ClientException) {
    println("4xx response calling AnnotationsApi#grantLabelStudioUserAccess")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AnnotationsApi#grantLabelStudioUserAccess")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**GrantLabelStudioAccess**](GrantLabelStudioAccess.md)|  |
 **owner** | **kotlin.String**| owner of the repository |
 **repo** | **kotlin.String**| name of the repository |
 **userid** | **kotlin.Long**| User ID |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="listLabelStudioTeamAccess"></a>
# **listLabelStudioTeamAccess**
> kotlin.Array&lt;LabelStudioProjectAccess&gt; listLabelStudioTeamAccess(owner, repo, projectId)

List team access entries for annotation projects

Get a list of teams with access to Label Studio annotation projects in the repository (organization repositories only)

### Example
```kotlin
// Import classes:
//import dagshub_api.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = AnnotationsApi()
val owner : kotlin.String = owner_example // kotlin.String | owner of the repository
val repo : kotlin.String = repo_example // kotlin.String | name of the repository
val projectId : kotlin.Long = 789 // kotlin.Long | Label Studio project ID to filter by. If not specified, returns access for all projects. Use -1 for wildcard access.
try {
    val result : kotlin.Array<LabelStudioProjectAccess> = apiInstance.listLabelStudioTeamAccess(owner, repo, projectId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AnnotationsApi#listLabelStudioTeamAccess")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AnnotationsApi#listLabelStudioTeamAccess")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| owner of the repository |
 **repo** | **kotlin.String**| name of the repository |
 **projectId** | **kotlin.Long**| Label Studio project ID to filter by. If not specified, returns access for all projects. Use -1 for wildcard access. | [optional]

### Return type

[**kotlin.Array&lt;LabelStudioProjectAccess&gt;**](LabelStudioProjectAccess.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listLabelStudioUserAccess"></a>
# **listLabelStudioUserAccess**
> kotlin.Array&lt;LabelStudioProjectAccess&gt; listLabelStudioUserAccess(owner, repo, projectId)

List user access entries for annotation projects

Get a list of users with access to Label Studio annotation projects in the repository

### Example
```kotlin
// Import classes:
//import dagshub_api.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = AnnotationsApi()
val owner : kotlin.String = owner_example // kotlin.String | owner of the repository
val repo : kotlin.String = repo_example // kotlin.String | name of the repository
val projectId : kotlin.Long = 789 // kotlin.Long | Label Studio project ID to filter by. If not specified, returns access for all projects. Use -1 for wildcard access.
try {
    val result : kotlin.Array<LabelStudioProjectAccess> = apiInstance.listLabelStudioUserAccess(owner, repo, projectId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling AnnotationsApi#listLabelStudioUserAccess")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AnnotationsApi#listLabelStudioUserAccess")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| owner of the repository |
 **repo** | **kotlin.String**| name of the repository |
 **projectId** | **kotlin.Long**| Label Studio project ID to filter by. If not specified, returns access for all projects. Use -1 for wildcard access. | [optional]

### Return type

[**kotlin.Array&lt;LabelStudioProjectAccess&gt;**](LabelStudioProjectAccess.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="revokeLabelStudioTeamAccess"></a>
# **revokeLabelStudioTeamAccess**
> revokeLabelStudioTeamAccess(owner, repo, teamid, projectId)

Revoke team access to annotation projects

Revoke a team&#x27;s access to Label Studio annotation projects

### Example
```kotlin
// Import classes:
//import dagshub_api.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = AnnotationsApi()
val owner : kotlin.String = owner_example // kotlin.String | owner of the repository
val repo : kotlin.String = repo_example // kotlin.String | name of the repository
val teamid : kotlin.Long = 789 // kotlin.Long | Team ID
val projectId : kotlin.Long = 789 // kotlin.Long | Label Studio project ID to filter by. If not specified, returns access for all projects. Use -1 for wildcard access.
try {
    apiInstance.revokeLabelStudioTeamAccess(owner, repo, teamid, projectId)
} catch (e: ClientException) {
    println("4xx response calling AnnotationsApi#revokeLabelStudioTeamAccess")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AnnotationsApi#revokeLabelStudioTeamAccess")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| owner of the repository |
 **repo** | **kotlin.String**| name of the repository |
 **teamid** | **kotlin.Long**| Team ID |
 **projectId** | **kotlin.Long**| Label Studio project ID to filter by. If not specified, returns access for all projects. Use -1 for wildcard access. | [optional]

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="revokeLabelStudioUserAccess"></a>
# **revokeLabelStudioUserAccess**
> revokeLabelStudioUserAccess(owner, repo, userid, projectId)

Revoke user access to annotation projects

Revoke a user&#x27;s access to Label Studio annotation projects

### Example
```kotlin
// Import classes:
//import dagshub_api.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = AnnotationsApi()
val owner : kotlin.String = owner_example // kotlin.String | owner of the repository
val repo : kotlin.String = repo_example // kotlin.String | name of the repository
val userid : kotlin.Long = 789 // kotlin.Long | User ID
val projectId : kotlin.Long = 789 // kotlin.Long | Label Studio project ID to filter by. If not specified, returns access for all projects. Use -1 for wildcard access.
try {
    apiInstance.revokeLabelStudioUserAccess(owner, repo, userid, projectId)
} catch (e: ClientException) {
    println("4xx response calling AnnotationsApi#revokeLabelStudioUserAccess")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling AnnotationsApi#revokeLabelStudioUserAccess")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| owner of the repository |
 **repo** | **kotlin.String**| name of the repository |
 **userid** | **kotlin.Long**| User ID |
 **projectId** | **kotlin.Long**| Label Studio project ID to filter by. If not specified, returns access for all projects. Use -1 for wildcard access. | [optional]

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

