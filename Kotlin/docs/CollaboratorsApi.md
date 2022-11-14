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
```kotlin
// Import classes:
//import dagshub_api.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = CollaboratorsApi()
val owner : kotlin.String = owner_example // kotlin.String | owner of the repository
val repo : kotlin.String = repo_example // kotlin.String | name of the repository
val collaborator : kotlin.String = collaborator_example // kotlin.String | collaborator username
val body : CollaboratorsCollaboratorBody =  // CollaboratorsCollaboratorBody | 
try {
    apiInstance.addCollaborator(owner, repo, collaborator, body)
} catch (e: ClientException) {
    println("4xx response calling CollaboratorsApi#addCollaborator")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CollaboratorsApi#addCollaborator")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| owner of the repository |
 **repo** | **kotlin.String**| name of the repository |
 **collaborator** | **kotlin.String**| collaborator username |
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
```kotlin
// Import classes:
//import dagshub_api.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = CollaboratorsApi()
val owner : kotlin.String = owner_example // kotlin.String | owner of the repository
val repo : kotlin.String = repo_example // kotlin.String | name of the repository
try {
    apiInstance.getCollaborators(owner, repo)
} catch (e: ClientException) {
    println("4xx response calling CollaboratorsApi#getCollaborators")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CollaboratorsApi#getCollaborators")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| owner of the repository |
 **repo** | **kotlin.String**| name of the repository |

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
```kotlin
// Import classes:
//import dagshub_api.infrastructure.*
//import io.swagger.client.models.*;

val apiInstance = CollaboratorsApi()
val owner : kotlin.String = owner_example // kotlin.String | owner of the repository
val repo : kotlin.String = repo_example // kotlin.String | name of the repository
val collaborator : kotlin.String = collaborator_example // kotlin.String | collaborator username
try {
    apiInstance.removeCollaborator(owner, repo, collaborator)
} catch (e: ClientException) {
    println("4xx response calling CollaboratorsApi#removeCollaborator")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling CollaboratorsApi#removeCollaborator")
    e.printStackTrace()
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **kotlin.String**| owner of the repository |
 **repo** | **kotlin.String**| name of the repository |
 **collaborator** | **kotlin.String**| collaborator username |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

