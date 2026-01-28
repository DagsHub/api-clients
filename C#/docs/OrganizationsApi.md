# dagshub_api.Api.OrganizationsApi

All URIs are relative to *https://dagshub.com/api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CreateOrgTeam**](OrganizationsApi.md#createorgteam) | **POST** /admin/orgs/{orgname}/teams | Create an organization team

<a name="createorgteam"></a>
# **CreateOrgTeam**
> void CreateOrgTeam (CreateAnnotatorTeam body, string orgname)

Create an organization team

Create a new team in an organization. Use team_type \"annotator\" to create an annotator team with access only to annotation projects.

### Example
```csharp
using System;
using System.Diagnostics;
using dagshub_api.Api;
using dagshub_api.Client;
using dagshub_api.Model;

namespace Example
{
    public class CreateOrgTeamExample
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

            var apiInstance = new OrganizationsApi();
            var body = new CreateAnnotatorTeam(); // CreateAnnotatorTeam | 
            var orgname = orgname_example;  // string | A DagsHub organization name

            try
            {
                // Create an organization team
                apiInstance.CreateOrgTeam(body, orgname);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling OrganizationsApi.CreateOrgTeam: " + e.Message );
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**CreateAnnotatorTeam**](CreateAnnotatorTeam.md)|  | 
 **orgname** | **string**| A DagsHub organization name | 

### Return type

void (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth), [tokenAuth](../README.md#tokenAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)
