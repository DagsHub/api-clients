# RepositoryApi

All URIs are relative to *http://dagshub.com/api/v1/*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createOrgRepo**](RepositoryApi.md#createOrgRepo) | **POST** /org/{orgname}/repos | Create in organization
[**createRepo**](RepositoryApi.md#createRepo) | **POST** /user/repos | Create
[**listMyRepos**](RepositoryApi.md#listMyRepos) | **GET** /user/repos | List your repositories
[**listOrgRepos**](RepositoryApi.md#listOrgRepos) | **GET** /orgs/{orgname}/repos | List organization repositories
[**listUserRepos**](RepositoryApi.md#listUserRepos) | **GET** /users/{username}/repos | List user repositories
[**migrateRepo**](RepositoryApi.md#migrateRepo) | **POST** /repos/migrate | Migrate repository
[**search**](RepositoryApi.md#search) | **GET** /repos/search | Search repositories

<a name="createOrgRepo"></a>
# **createOrgRepo**
> createOrgRepo(orgname, body)

Create in organization

Create a new repository in this organization. The authenticated user must be an **owner** of the specified organization.

### Example
```kotlin
// Import classes:
//import dagshub-api.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = RepositoryApi()
val orgname : kotlin.String = orgname_example // kotlin.String | A DagsHub organization name
val body : CreateRepo =  // CreateRepo | 
try {
    apiInstance.createOrgRepo(orgname, body)
} catch (e: ClientException) {
    println("4xx response calling RepositoryApi#createOrgRepo")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RepositoryApi#createOrgRepo")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orgname** | **kotlin.String**| A DagsHub organization name |
 **body** | [**CreateRepo**](CreateRepo.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="createRepo"></a>
# **createRepo**
> createRepo(body)

Create

Create a new repository for the authenticated user.

### Example
```kotlin
// Import classes:
//import dagshub-api.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = RepositoryApi()
val body : CreateRepo =  // CreateRepo | 
try {
    apiInstance.createRepo(body)
} catch (e: ClientException) {
    println("4xx response calling RepositoryApi#createRepo")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RepositoryApi#createRepo")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CreateRepo**](CreateRepo.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="listMyRepos"></a>
# **listMyRepos**
> kotlin.Any listMyRepos()

List your repositories

List repositories that are accessible to the authenticated user.  This includes repositories owned by the authenticated user, repositories where the authenticated user is a collaborator, and repositories that the authenticated user has access to through an organization membership. 

### Example
```kotlin
// Import classes:
//import dagshub-api.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = RepositoryApi()
try {
    val result : kotlin.Any = apiInstance.listMyRepos()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RepositoryApi#listMyRepos")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RepositoryApi#listMyRepos")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**kotlin.Any**

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="listOrgRepos"></a>
# **listOrgRepos**
> listOrgRepos(orgname)

List organization repositories

List repositories that are accessible to the authenticated user.

### Example
```kotlin
// Import classes:
//import dagshub-api.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = RepositoryApi()
val orgname : kotlin.String = orgname_example // kotlin.String | A DagsHub organization name
try {
    apiInstance.listOrgRepos(orgname)
} catch (e: ClientException) {
    println("4xx response calling RepositoryApi#listOrgRepos")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RepositoryApi#listOrgRepos")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **orgname** | **kotlin.String**| A DagsHub organization name |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="listUserRepos"></a>
# **listUserRepos**
> listUserRepos(username)

List user repositories

List public repositories for the specified user.

### Example
```kotlin
// Import classes:
//import dagshub-api.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = RepositoryApi()
val username : kotlin.String = username_example // kotlin.String | A DagsHub username
try {
    apiInstance.listUserRepos(username)
} catch (e: ClientException) {
    println("4xx response calling RepositoryApi#listUserRepos")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RepositoryApi#listUserRepos")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **username** | **kotlin.String**| A DagsHub username |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="migrateRepo"></a>
# **migrateRepo**
> migrateRepo(body)

Migrate repository

Migrate a repository from other Git hosting sources for the authenticated user.  To migrate a repository for a organization, the authenticated user must be a **owner** of the specified organization. 

### Example
```kotlin
// Import classes:
//import dagshub-api.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = RepositoryApi()
val body : MigrateRepo =  // MigrateRepo | 
try {
    apiInstance.migrateRepo(body)
} catch (e: ClientException) {
    println("4xx response calling RepositoryApi#migrateRepo")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RepositoryApi#migrateRepo")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**MigrateRepo**](MigrateRepo.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="search"></a>
# **search**
> kotlin.Any search(q, uid, limit, page)

Search repositories

### Example
```kotlin
// Import classes:
//import dagshub-api.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = RepositoryApi()
val q : kotlin.String = q_example // kotlin.String | 
val uid : kotlin.Int = 56 // kotlin.Int | User ID to specify search whose repositories. Default is 0 and search all repositories
val limit : kotlin.Int = 56 // kotlin.Int | Maximum number of repositories in search results.
val page : kotlin.Int = 56 // kotlin.Int | Page number. Default is 1.
try {
    val result : kotlin.Any = apiInstance.search(q, uid, limit, page)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling RepositoryApi#search")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling RepositoryApi#search")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **q** | **kotlin.String**|  |
 **uid** | **kotlin.Int**| User ID to specify search whose repositories. Default is 0 and search all repositories | [optional] [default to 0]
 **limit** | **kotlin.Int**| Maximum number of repositories in search results. | [optional] [default to 10]
 **page** | **kotlin.Int**| Page number. Default is 1. | [optional] [default to 1]

### Return type

**kotlin.Any**

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

