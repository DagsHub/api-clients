# dagshub_api.Api.AnnotationsApi

All URIs are relative to *https://dagshub.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetLabelStudioTeamAccess**](AnnotationsApi.md#getlabelstudioteamaccess) | **GET** /repos/{owner}/{repo}/annotations/access/teams/{teamid} | Get team access level for annotation projects
[**GetLabelStudioUserAccess**](AnnotationsApi.md#getlabelstudiouseraccess) | **GET** /repos/{owner}/{repo}/annotations/access/users/{userid} | Get user access level for annotation projects
[**GrantLabelStudioTeamAccess**](AnnotationsApi.md#grantlabelstudioteamaccess) | **PUT** /repos/{owner}/{repo}/annotations/access/teams/{teamid} | Grant team access to annotation projects
[**GrantLabelStudioUserAccess**](AnnotationsApi.md#grantlabelstudiouseraccess) | **PUT** /repos/{owner}/{repo}/annotations/access/users/{userid} | Grant user access to annotation projects
[**ListLabelStudioTeamAccess**](AnnotationsApi.md#listlabelstudioteamaccess) | **GET** /repos/{owner}/{repo}/annotations/access/teams | List team access entries for annotation projects
[**ListLabelStudioUserAccess**](AnnotationsApi.md#listlabelstudiouseraccess) | **GET** /repos/{owner}/{repo}/annotations/access/users | List user access entries for annotation projects
[**RevokeLabelStudioTeamAccess**](AnnotationsApi.md#revokelabelstudioteamaccess) | **DELETE** /repos/{owner}/{repo}/annotations/access/teams/{teamid} | Revoke team access to annotation projects
[**RevokeLabelStudioUserAccess**](AnnotationsApi.md#revokelabelstudiouseraccess) | **DELETE** /repos/{owner}/{repo}/annotations/access/users/{userid} | Revoke user access to annotation projects

<a name="getlabelstudioteamaccess"></a>
# **GetLabelStudioTeamAccess**
> LabelStudioProjectAccess GetLabelStudioTeamAccess (string owner, string repo, long? teamid, long? projectId = null)

Get team access level for annotation projects

Get the access level for a specific team and project (or all projects)

### Example
```csharp
using System;
using System.Diagnostics;
using dagshub_api.Api;
using dagshub_api.Client;
using dagshub_api.Model;

namespace Example
{
    public class GetLabelStudioTeamAccessExample
    {
        public void main()
        {
            // Configure HTTP basic authorization: basicAuth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";
            // Configure API key authorization: tokenAuth
            Configuration.Default.AddApiKey("token", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.AddApiKeyPrefix("token", "Bearer");

            var apiInstance = new AnnotationsApi();
            var owner = owner_example;  // string | owner of the repository
            var repo = repo_example;  // string | name of the repository
            var teamid = 789;  // long? | Team ID
            var projectId = 789;  // long? | Label Studio project ID to filter by. If not specified, returns access for all projects. Use -1 for wildcard access. (optional) 

            try
            {
                // Get team access level for annotation projects
                LabelStudioProjectAccess result = apiInstance.GetLabelStudioTeamAccess(owner, repo, teamid, projectId);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling AnnotationsApi.GetLabelStudioTeamAccess: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **string**| owner of the repository | 
 **repo** | **string**| name of the repository | 
 **teamid** | **long?**| Team ID | 
 **projectId** | **long?**| Label Studio project ID to filter by. If not specified, returns access for all projects. Use -1 for wildcard access. | [optional] 

### Return type

[**LabelStudioProjectAccess**](LabelStudioProjectAccess.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)
<a name="getlabelstudiouseraccess"></a>
# **GetLabelStudioUserAccess**
> InlineResponse200 GetLabelStudioUserAccess (string owner, string repo, long? userid, long? projectId = null)

Get user access level for annotation projects

Get the access level for a specific user and project (or all projects)

### Example
```csharp
using System;
using System.Diagnostics;
using dagshub_api.Api;
using dagshub_api.Client;
using dagshub_api.Model;

namespace Example
{
    public class GetLabelStudioUserAccessExample
    {
        public void main()
        {
            // Configure HTTP basic authorization: basicAuth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";
            // Configure API key authorization: tokenAuth
            Configuration.Default.AddApiKey("token", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.AddApiKeyPrefix("token", "Bearer");

            var apiInstance = new AnnotationsApi();
            var owner = owner_example;  // string | owner of the repository
            var repo = repo_example;  // string | name of the repository
            var userid = 789;  // long? | User ID
            var projectId = 789;  // long? | Label Studio project ID to filter by. If not specified, returns access for all projects. Use -1 for wildcard access. (optional) 

            try
            {
                // Get user access level for annotation projects
                InlineResponse200 result = apiInstance.GetLabelStudioUserAccess(owner, repo, userid, projectId);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling AnnotationsApi.GetLabelStudioUserAccess: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **string**| owner of the repository | 
 **repo** | **string**| name of the repository | 
 **userid** | **long?**| User ID | 
 **projectId** | **long?**| Label Studio project ID to filter by. If not specified, returns access for all projects. Use -1 for wildcard access. | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)
<a name="grantlabelstudioteamaccess"></a>
# **GrantLabelStudioTeamAccess**
> void GrantLabelStudioTeamAccess (GrantLabelStudioAccess body, string owner, string repo, long? teamid)

Grant team access to annotation projects

Grant a team access to specific Label Studio annotation projects (organization repositories only)

### Example
```csharp
using System;
using System.Diagnostics;
using dagshub_api.Api;
using dagshub_api.Client;
using dagshub_api.Model;

namespace Example
{
    public class GrantLabelStudioTeamAccessExample
    {
        public void main()
        {
            // Configure HTTP basic authorization: basicAuth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";
            // Configure API key authorization: tokenAuth
            Configuration.Default.AddApiKey("token", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.AddApiKeyPrefix("token", "Bearer");

            var apiInstance = new AnnotationsApi();
            var body = new GrantLabelStudioAccess(); // GrantLabelStudioAccess | 
            var owner = owner_example;  // string | owner of the repository
            var repo = repo_example;  // string | name of the repository
            var teamid = 789;  // long? | Team ID

            try
            {
                // Grant team access to annotation projects
                apiInstance.GrantLabelStudioTeamAccess(body, owner, repo, teamid);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling AnnotationsApi.GrantLabelStudioTeamAccess: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**GrantLabelStudioAccess**](GrantLabelStudioAccess.md)|  | 
 **owner** | **string**| owner of the repository | 
 **repo** | **string**| name of the repository | 
 **teamid** | **long?**| Team ID | 

### Return type

void (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)
<a name="grantlabelstudiouseraccess"></a>
# **GrantLabelStudioUserAccess**
> void GrantLabelStudioUserAccess (GrantLabelStudioAccess body, string owner, string repo, long? userid)

Grant user access to annotation projects

Grant a user access to specific Label Studio annotation projects. User must be an organization member if the repo is owned by an organization.

### Example
```csharp
using System;
using System.Diagnostics;
using dagshub_api.Api;
using dagshub_api.Client;
using dagshub_api.Model;

namespace Example
{
    public class GrantLabelStudioUserAccessExample
    {
        public void main()
        {
            // Configure HTTP basic authorization: basicAuth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";
            // Configure API key authorization: tokenAuth
            Configuration.Default.AddApiKey("token", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.AddApiKeyPrefix("token", "Bearer");

            var apiInstance = new AnnotationsApi();
            var body = new GrantLabelStudioAccess(); // GrantLabelStudioAccess | 
            var owner = owner_example;  // string | owner of the repository
            var repo = repo_example;  // string | name of the repository
            var userid = 789;  // long? | User ID

            try
            {
                // Grant user access to annotation projects
                apiInstance.GrantLabelStudioUserAccess(body, owner, repo, userid);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling AnnotationsApi.GrantLabelStudioUserAccess: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**GrantLabelStudioAccess**](GrantLabelStudioAccess.md)|  | 
 **owner** | **string**| owner of the repository | 
 **repo** | **string**| name of the repository | 
 **userid** | **long?**| User ID | 

### Return type

void (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)
<a name="listlabelstudioteamaccess"></a>
# **ListLabelStudioTeamAccess**
> List<LabelStudioProjectAccess> ListLabelStudioTeamAccess (string owner, string repo, long? projectId = null)

List team access entries for annotation projects

Get a list of teams with access to Label Studio annotation projects in the repository (organization repositories only)

### Example
```csharp
using System;
using System.Diagnostics;
using dagshub_api.Api;
using dagshub_api.Client;
using dagshub_api.Model;

namespace Example
{
    public class ListLabelStudioTeamAccessExample
    {
        public void main()
        {
            // Configure HTTP basic authorization: basicAuth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";
            // Configure API key authorization: tokenAuth
            Configuration.Default.AddApiKey("token", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.AddApiKeyPrefix("token", "Bearer");

            var apiInstance = new AnnotationsApi();
            var owner = owner_example;  // string | owner of the repository
            var repo = repo_example;  // string | name of the repository
            var projectId = 789;  // long? | Label Studio project ID to filter by. If not specified, returns access for all projects. Use -1 for wildcard access. (optional) 

            try
            {
                // List team access entries for annotation projects
                List&lt;LabelStudioProjectAccess&gt; result = apiInstance.ListLabelStudioTeamAccess(owner, repo, projectId);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling AnnotationsApi.ListLabelStudioTeamAccess: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **string**| owner of the repository | 
 **repo** | **string**| name of the repository | 
 **projectId** | **long?**| Label Studio project ID to filter by. If not specified, returns access for all projects. Use -1 for wildcard access. | [optional] 

### Return type

[**List<LabelStudioProjectAccess>**](LabelStudioProjectAccess.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)
<a name="listlabelstudiouseraccess"></a>
# **ListLabelStudioUserAccess**
> List<LabelStudioProjectAccess> ListLabelStudioUserAccess (string owner, string repo, long? projectId = null)

List user access entries for annotation projects

Get a list of users with access to Label Studio annotation projects in the repository

### Example
```csharp
using System;
using System.Diagnostics;
using dagshub_api.Api;
using dagshub_api.Client;
using dagshub_api.Model;

namespace Example
{
    public class ListLabelStudioUserAccessExample
    {
        public void main()
        {
            // Configure HTTP basic authorization: basicAuth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";
            // Configure API key authorization: tokenAuth
            Configuration.Default.AddApiKey("token", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.AddApiKeyPrefix("token", "Bearer");

            var apiInstance = new AnnotationsApi();
            var owner = owner_example;  // string | owner of the repository
            var repo = repo_example;  // string | name of the repository
            var projectId = 789;  // long? | Label Studio project ID to filter by. If not specified, returns access for all projects. Use -1 for wildcard access. (optional) 

            try
            {
                // List user access entries for annotation projects
                List&lt;LabelStudioProjectAccess&gt; result = apiInstance.ListLabelStudioUserAccess(owner, repo, projectId);
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling AnnotationsApi.ListLabelStudioUserAccess: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **string**| owner of the repository | 
 **repo** | **string**| name of the repository | 
 **projectId** | **long?**| Label Studio project ID to filter by. If not specified, returns access for all projects. Use -1 for wildcard access. | [optional] 

### Return type

[**List<LabelStudioProjectAccess>**](LabelStudioProjectAccess.md)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)
<a name="revokelabelstudioteamaccess"></a>
# **RevokeLabelStudioTeamAccess**
> void RevokeLabelStudioTeamAccess (string owner, string repo, long? teamid, long? projectId = null)

Revoke team access to annotation projects

Revoke a team's access to Label Studio annotation projects

### Example
```csharp
using System;
using System.Diagnostics;
using dagshub_api.Api;
using dagshub_api.Client;
using dagshub_api.Model;

namespace Example
{
    public class RevokeLabelStudioTeamAccessExample
    {
        public void main()
        {
            // Configure HTTP basic authorization: basicAuth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";
            // Configure API key authorization: tokenAuth
            Configuration.Default.AddApiKey("token", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.AddApiKeyPrefix("token", "Bearer");

            var apiInstance = new AnnotationsApi();
            var owner = owner_example;  // string | owner of the repository
            var repo = repo_example;  // string | name of the repository
            var teamid = 789;  // long? | Team ID
            var projectId = 789;  // long? | Label Studio project ID to filter by. If not specified, returns access for all projects. Use -1 for wildcard access. (optional) 

            try
            {
                // Revoke team access to annotation projects
                apiInstance.RevokeLabelStudioTeamAccess(owner, repo, teamid, projectId);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling AnnotationsApi.RevokeLabelStudioTeamAccess: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **string**| owner of the repository | 
 **repo** | **string**| name of the repository | 
 **teamid** | **long?**| Team ID | 
 **projectId** | **long?**| Label Studio project ID to filter by. If not specified, returns access for all projects. Use -1 for wildcard access. | [optional] 

### Return type

void (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)
<a name="revokelabelstudiouseraccess"></a>
# **RevokeLabelStudioUserAccess**
> void RevokeLabelStudioUserAccess (string owner, string repo, long? userid, long? projectId = null)

Revoke user access to annotation projects

Revoke a user's access to Label Studio annotation projects

### Example
```csharp
using System;
using System.Diagnostics;
using dagshub_api.Api;
using dagshub_api.Client;
using dagshub_api.Model;

namespace Example
{
    public class RevokeLabelStudioUserAccessExample
    {
        public void main()
        {
            // Configure HTTP basic authorization: basicAuth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";
            // Configure API key authorization: tokenAuth
            Configuration.Default.AddApiKey("token", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.AddApiKeyPrefix("token", "Bearer");

            var apiInstance = new AnnotationsApi();
            var owner = owner_example;  // string | owner of the repository
            var repo = repo_example;  // string | name of the repository
            var userid = 789;  // long? | User ID
            var projectId = 789;  // long? | Label Studio project ID to filter by. If not specified, returns access for all projects. Use -1 for wildcard access. (optional) 

            try
            {
                // Revoke user access to annotation projects
                apiInstance.RevokeLabelStudioUserAccess(owner, repo, userid, projectId);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling AnnotationsApi.RevokeLabelStudioUserAccess: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **owner** | **string**| owner of the repository | 
 **repo** | **string**| name of the repository | 
 **userid** | **long?**| User ID | 
 **projectId** | **long?**| Label Studio project ID to filter by. If not specified, returns access for all projects. Use -1 for wildcard access. | [optional] 

### Return type

void (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)
