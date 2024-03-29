# dagshub_api - the C# library for the DagsHub API

This API provides a way to retrive & interact with data about DagsHub repositories, users, issues, webhooks and more. The API is also used by the [DagsHub Direct Data Access streaming client](https://github.com/DagsHub/client) to stream content from a repository for easier and faster training. 

This C# SDK is automatically generated by the [Swagger Codegen](https://github.com/swagger-api/swagger-codegen) project:

- API version: 1.0.2
- SDK version: 1.0.3
- Build package: io.swagger.codegen.v3.generators.dotnet.CSharpClientCodegen

<a name="frameworks-supported"></a>
## Frameworks supported
- .NET 4.0 or later
- Windows Phone 7.1 (Mango)

<a name="dependencies"></a>
## Dependencies
- [RestSharp](https://www.nuget.org/packages/RestSharp) - 105.1.0 or later
- [Json.NET](https://www.nuget.org/packages/Newtonsoft.Json/) - 7.0.0 or later
- [JsonSubTypes](https://www.nuget.org/packages/JsonSubTypes/) - 1.2.0 or later

The DLLs included in the package may not be the latest version. We recommend using [NuGet](https://docs.nuget.org/consume/installing-nuget) to obtain the latest version of the packages:
```
Install-Package RestSharp
Install-Package Newtonsoft.Json
Install-Package JsonSubTypes
```

NOTE: RestSharp versions greater than 105.1.0 have a bug which causes file uploads to fail. See [RestSharp#742](https://github.com/restsharp/RestSharp/issues/742)

<a name="installation"></a>
## Installation
Run the following command to generate the DLL
- [Mac/Linux] `/bin/sh build.sh`
- [Windows] `build.bat`

Then include the DLL (under the `bin` folder) in the C# project, and use the namespaces:
```csharp
using dagshub_api.Api;
using dagshub_api.Client;
using dagshub_api.Model;
```
<a name="packaging"></a>
## Packaging

A `.nuspec` is included with the project. You can follow the Nuget quickstart to [create](https://docs.microsoft.com/en-us/nuget/quickstart/create-and-publish-a-package#create-the-package) and [publish](https://docs.microsoft.com/en-us/nuget/quickstart/create-and-publish-a-package#publish-the-package) packages.

This `.nuspec` uses placeholders from the `.csproj`, so build the `.csproj` directly:

```
nuget pack -Build -OutputDirectory out dagshub_api.csproj
```

Then, publish to a [local feed](https://docs.microsoft.com/en-us/nuget/hosting-packages/local-feeds) or [other host](https://docs.microsoft.com/en-us/nuget/hosting-packages/overview) and consume the new package via Nuget as usual.

<a name="getting-started"></a>
## Getting Started

```csharp
using System;
using System.Diagnostics;
using dagshub_api.Api;
using dagshub_api.Client;
using dagshub_api.Model;

namespace Example
{
    public class Example
    {
        public void main()
        {
            // Configure HTTP basic authorization: basicAuth
            Configuration.Default.Username = "YOUR_USERNAME";
            Configuration.Default.Password = "YOUR_PASSWORD";
            // Configure API key authorization: tokenAuth
            Configuration.Default.ApiKey.Add("token", "YOUR_API_KEY");
            // Uncomment below to setup prefix (e.g. Bearer) for API key, if needed
            // Configuration.Default.ApiKeyPrefix.Add("token", "Bearer");

            var apiInstance = new BranchesApi();
            var owner = owner_example;  // string | owner of the repository
            var repo = repo_example;  // string | name of the repository
            var branch = branch_example;  // string | branch of the repository

            try
            {
                // Get Branch
                apiInstance.GetBranch(owner, repo, branch);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling BranchesApi.GetBranch: " + e.Message );
            }
        }
    }
}
```

<a name="documentation-for-api-endpoints"></a>
## Documentation for API Endpoints

All URIs are relative to *https://dagshub.com/api/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*BranchesApi* | [**GetBranch**](docs/BranchesApi.md#getbranch) | **GET** /repos/{owner}/{repo}/branches/{branch} | Get Branch
*BranchesApi* | [**ListBranches**](docs/BranchesApi.md#listbranches) | **GET** /repos/{owner}/{repo}/branches | List Branches
*CollaboratorsApi* | [**AddCollaborator**](docs/CollaboratorsApi.md#addcollaborator) | **PUT** /repos/{owner}/{repo}/collaborators/{collaborator} | Add user as a collaborator
*CollaboratorsApi* | [**GetCollaborators**](docs/CollaboratorsApi.md#getcollaborators) | **GET** /repos/{owner}/{repo}/collaborators | Get collaborators
*CollaboratorsApi* | [**RemoveCollaborator**](docs/CollaboratorsApi.md#removecollaborator) | **DELETE** /repos/{owner}/{repo}/collaborators/{collaborator} | Delete collaborator
*CommitsApi* | [**GetCommit**](docs/CommitsApi.md#getcommit) | **GET** /repos/{owner}/{repo}/commits/{sha} | Get a single commit
*ContentApi* | [**GetArchive**](docs/ContentApi.md#getarchive) | **GET** /repos/{owner}/{repo}/archive/{ref}{format} | Download archive
*ContentApi* | [**GetContent**](docs/ContentApi.md#getcontent) | **GET** /repos/{owner}/{repo}/content/{branch}/{path} | List data in a repository folder
*ContentApi* | [**GetRaw**](docs/ContentApi.md#getraw) | **GET** /repos/{owner}/{repo}/raw/{ref}/{path} | Download raw content
*ContentApi* | [**UploadContent**](docs/ContentApi.md#uploadcontent) | **PUT** /repos/{owner}/{repo}/content/{branch}/{path} | Upload data to a repository
*ExperimentsApi* | [**AddExperimentLabel**](docs/ExperimentsApi.md#addexperimentlabel) | **POST** /repos/{owner}/{repo}/experiments/experiment/{experimentKey}/labels/{experimentLabel} | Add label to experiment
*ExperimentsApi* | [**DeleteExperiment**](docs/ExperimentsApi.md#deleteexperiment) | **DELETE** /repos/{owner}/{repo}/experiments/experiment/{experimentKey} | Delete experiment
*ExperimentsApi* | [**DeleteExperimentLabel**](docs/ExperimentsApi.md#deleteexperimentlabel) | **DELETE** /repos/{owner}/{repo}/experiments/experiment/{experimentKey}/labels/{experimentLabel} | Delete experiment label
*ExperimentsApi* | [**EditExperiment**](docs/ExperimentsApi.md#editexperiment) | **POST** /repos/{owner}/{repo}/experiments/experiment/{experimentKey} | Edit experiment info
*ExperimentsApi* | [**GetExperimentMetrics**](docs/ExperimentsApi.md#getexperimentmetrics) | **POST** /repos/{owner}/{repo}/experiments/metricsForExperiments | Get experiment metrics for experiment
*ExperimentsApi* | [**GetExperiments**](docs/ExperimentsApi.md#getexperiments) | **GET** /repos/{owner}/{repo}/experiments | List Experiments
*IssuesApi* | [**CreateIssue**](docs/IssuesApi.md#createissue) | **POST** /repos/{owner}/{repo}/issues | Create an issue
*IssuesApi* | [**EditIssue**](docs/IssuesApi.md#editissue) | **PATCH** /repos/{owner}/{repo}/issues | Edit an issue
*IssuesApi* | [**GetIssue**](docs/IssuesApi.md#getissue) | **GET** /repos/{owner}/{repo}/issues/{index} | Get a single issue
*IssuesApi* | [**ListRepoIssues**](docs/IssuesApi.md#listrepoissues) | **GET** /repos/{owner}/{repo}/issues | List issues for a repository
*ReleasesApi* | [**ListReleases**](docs/ReleasesApi.md#listreleases) | **GET** /repos/{owner}/{repo}/releases | List Releases
*RepositoryApi* | [**CreateOrgRepo**](docs/RepositoryApi.md#createorgrepo) | **POST** /org/{orgname}/repos | Create in organization
*RepositoryApi* | [**CreateRepo**](docs/RepositoryApi.md#createrepo) | **POST** /user/repos | Create
*RepositoryApi* | [**GetRepo**](docs/RepositoryApi.md#getrepo) | **GET** /repos/{owner}/{repo} | Get repository information
*RepositoryApi* | [**ListMyRepos**](docs/RepositoryApi.md#listmyrepos) | **GET** /user/repos | List your repositories
*RepositoryApi* | [**ListOrgRepos**](docs/RepositoryApi.md#listorgrepos) | **GET** /orgs/{orgname}/repos | List organization repositories
*RepositoryApi* | [**ListUserRepos**](docs/RepositoryApi.md#listuserrepos) | **GET** /users/{username}/repos | List user repositories
*RepositoryApi* | [**MigrateRepo**](docs/RepositoryApi.md#migraterepo) | **POST** /repos/migrate | Migrate repository
*RepositoryApi* | [**Search**](docs/RepositoryApi.md#search) | **GET** /repos/search | Search repositories
*StorageIntegrationsApi* | [**GetBucketContent**](docs/StorageIntegrationsApi.md#getbucketcontent) | **GET** /repos/{owner}/{repo}/storage/content/{protocol}/{bucket}/{path} | List contents in the path
*StorageIntegrationsApi* | [**GetBucketFile**](docs/StorageIntegrationsApi.md#getbucketfile) | **GET** /repos/{owner}/{repo}/storage/raw/{protocol}/{bucket}/{path} | Get file in the bucket
*StorageIntegrationsApi* | [**GetBuckets**](docs/StorageIntegrationsApi.md#getbuckets) | **GET** /repos/{owner}/{repo}/storage | List integrated storages in the repository
*UserApi* | [**GetAuthenticatedUser**](docs/UserApi.md#getauthenticateduser) | **GET** /user | Get authenticated user information
*UserApi* | [**GetUser**](docs/UserApi.md#getuser) | **GET** /users/{username} | Get information about a user
*WebhooksApi* | [**CreateHook**](docs/WebhooksApi.md#createhook) | **POST** /repos/{owner}/{repo}/hooks | Create a hook
*WebhooksApi* | [**DeleteHook**](docs/WebhooksApi.md#deletehook) | **DELETE** /repos/{owner}/{repo}/hooks/{id} | Delete a hook
*WebhooksApi* | [**EditHook**](docs/WebhooksApi.md#edithook) | **PATCH** /repos/{owner}/{repo}/hooks/{id} | Edit a hook
*WebhooksApi* | [**ListHooks**](docs/WebhooksApi.md#listhooks) | **GET** /repos/{owner}/{repo}/hooks | List hooks

<a name="documentation-for-models"></a>
## Documentation for Models

 - [Model.CollaboratorsCollaboratorBody](docs/CollaboratorsCollaboratorBody.md)
 - [Model.CreateRepo](docs/CreateRepo.md)
 - [Model.EditExperimentPost](docs/EditExperimentPost.md)
 - [Model.ExperimentKeys](docs/ExperimentKeys.md)
 - [Model.File](docs/File.md)
 - [Model.Files](docs/Files.md)
 - [Model.Files1](docs/Files1.md)
 - [Model.HooksIdBody](docs/HooksIdBody.md)
 - [Model.Integration](docs/Integration.md)
 - [Model.IntegrationInner](docs/IntegrationInner.md)
 - [Model.Issue](docs/Issue.md)
 - [Model.IssueAssignee](docs/IssueAssignee.md)
 - [Model.IssueLabels](docs/IssueLabels.md)
 - [Model.IssueMilestone](docs/IssueMilestone.md)
 - [Model.Issues](docs/Issues.md)
 - [Model.Labels](docs/Labels.md)
 - [Model.MigrateRepo](docs/MigrateRepo.md)
 - [Model.PatchIssue](docs/PatchIssue.md)
 - [Model.PostIssue](docs/PostIssue.md)
 - [Model.PutFile](docs/PutFile.md)
 - [Model.RepoHooksBody](docs/RepoHooksBody.md)
 - [Model.State](docs/State.md)
 - [Model.User](docs/User.md)
 - [Model.WebhookConfig](docs/WebhookConfig.md)
 - [Model.WebhookEvents](docs/WebhookEvents.md)

<a name="documentation-for-authorization"></a>
## Documentation for Authorization

<a name="basicAuth"></a>
### basicAuth

- **Type**: HTTP basic authentication

<a name="tokenAuth"></a>
### tokenAuth

- **Type**: API key
- **API key parameter name**: token
- **Location**: URL query string

