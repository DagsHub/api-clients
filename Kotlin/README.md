# dagshub-api - Kotlin client library for DagsHub API

## Requires

* Kotlin 1.4.30
* Gradle 5.3

## Build

First, create the gradle wrapper script:

```
gradle wrapper
```

Then, run:

```
./gradlew check assemble
```

This runs all tests and packages the library.

## Features/Implementation Notes

* Supports JSON inputs/outputs, File inputs, and Form inputs.
* Supports collection formats for query parameters: csv, tsv, ssv, pipes.
* Some Kotlin and Java types are fully qualified to avoid conflicts with types defined in Swagger definitions.
* Implementation of ApiClient is intended to reduce method counts, specifically to benefit Android targets.

<a name="documentation-for-api-endpoints"></a>
## Documentation for API Endpoints

All URIs are relative to *http://dagshub.com/api/v1/*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*BranchesApi* | [**getBranch**](docs/BranchesApi.md#getbranch) | **GET** /repos/{owner}/{repo}/branches/{branch} | Get Branch
*BranchesApi* | [**listBranches**](docs/BranchesApi.md#listbranches) | **GET** /repos/{owner}/{repo}/branches | List Branches
*CollaboratorsApi* | [**addCollaborator**](docs/CollaboratorsApi.md#addcollaborator) | **PUT** /repos/{username}/{repo}/collaborators/{collaborator} | Add user as a collaborator
*CollaboratorsApi* | [**getCollaborators**](docs/CollaboratorsApi.md#getcollaborators) | **GET** /repos/{username}/{repo}/collaborators | Get collaborators
*CollaboratorsApi* | [**removeCollaborator**](docs/CollaboratorsApi.md#removecollaborator) | **DELETE** /repos/{username}/{repo}/collaborators/{collaborator} | Delete collaborator
*CommitsApi* | [**getCommit**](docs/CommitsApi.md#getcommit) | **GET** /repos/{owner}/{repo}/commits/{sha} | Get a single commit
*CommitsApi* | [**getCommitSha1**](docs/CommitsApi.md#getcommitsha1) | **GET** /repos/{owner}/{repo}/commits/{ref} | Get the SHA-1 of a commit reference
*ContentApi* | [**getArchive**](docs/ContentApi.md#getarchive) | **GET** /repos/{username}/{repo}/archive/{ref}/{format} | Download archive
*ContentApi* | [**getRaw**](docs/ContentApi.md#getraw) | **GET** /repos/{username}/{repo}/raw/{ref}/{path} | Download raw content
*IssuesApi* | [**createIssue**](docs/IssuesApi.md#createissue) | **POST** /repos/{owner}/{repo}/issues | Create an issue
*IssuesApi* | [**editIssue**](docs/IssuesApi.md#editissue) | **PATCH** /repos/{owner}/{repo}/issues | Edit an issue
*IssuesApi* | [**getIssue**](docs/IssuesApi.md#getissue) | **GET** /repos/{owner}/{repo}/issues/{index} | Get a single issue
*IssuesApi* | [**listRepoIssues**](docs/IssuesApi.md#listrepoissues) | **GET** /repos/{owner}/{repo}/issues | List issues for a repository
*ReleasesApi* | [**listReleases**](docs/ReleasesApi.md#listreleases) | **GET** /repos/{owner}/{repo}/releases | List Releases
*RepositoryApi* | [**createOrgRepo**](docs/RepositoryApi.md#createorgrepo) | **POST** /org/{orgname}/repos | Create in organization
*RepositoryApi* | [**createRepo**](docs/RepositoryApi.md#createrepo) | **POST** /user/repos | Create
*RepositoryApi* | [**listMyRepos**](docs/RepositoryApi.md#listmyrepos) | **GET** /user/repos | List your repositories
*RepositoryApi* | [**listOrgRepos**](docs/RepositoryApi.md#listorgrepos) | **GET** /orgs/{orgname}/repos | List organization repositories
*RepositoryApi* | [**listUserRepos**](docs/RepositoryApi.md#listuserrepos) | **GET** /users/{username}/repos | List user repositories
*RepositoryApi* | [**migrateRepo**](docs/RepositoryApi.md#migraterepo) | **POST** /repos/migrate | Migrate repository
*RepositoryApi* | [**search**](docs/RepositoryApi.md#search) | **GET** /repos/search | Search repositories
*WebhooksApi* | [**createHook**](docs/WebhooksApi.md#createhook) | **POST** /repos/{owner}/{repo}/hooks | Create a hook
*WebhooksApi* | [**deleteHook**](docs/WebhooksApi.md#deletehook) | **DELETE** /repos/{owner}/{repo}/hooks/{id} | Delete a hook
*WebhooksApi* | [**editHook**](docs/WebhooksApi.md#edithook) | **PATCH** /repos/{owner}/{repo}/hooks/{id} | Edit a hook
*WebhooksApi* | [**listHooks**](docs/WebhooksApi.md#listhooks) | **GET** /repos/{owner}/{repo}/hooks | List hooks

<a name="documentation-for-models"></a>
## Documentation for Models

 - [io.swagger.client.models.Assignee](docs/Assignee.md)
 - [io.swagger.client.models.Body](docs/Body.md)
 - [io.swagger.client.models.Closed](docs/Closed.md)
 - [io.swagger.client.models.CollaboratorsCollaboratorBody](docs/CollaboratorsCollaboratorBody.md)
 - [io.swagger.client.models.CreateRepo](docs/CreateRepo.md)
 - [io.swagger.client.models.HooksIdBody](docs/HooksIdBody.md)
 - [io.swagger.client.models.Issue](docs/Issue.md)
 - [io.swagger.client.models.IssueAssignee](docs/IssueAssignee.md)
 - [io.swagger.client.models.IssueLabels](docs/IssueLabels.md)
 - [io.swagger.client.models.IssueMilestone](docs/IssueMilestone.md)
 - [io.swagger.client.models.Issues](docs/Issues.md)
 - [io.swagger.client.models.Labels](docs/Labels.md)
 - [io.swagger.client.models.MigrateRepo](docs/MigrateRepo.md)
 - [io.swagger.client.models.Milestone](docs/Milestone.md)
 - [io.swagger.client.models.PatchIssue](docs/PatchIssue.md)
 - [io.swagger.client.models.PostIssue](docs/PostIssue.md)
 - [io.swagger.client.models.RepoHooksBody](docs/RepoHooksBody.md)
 - [io.swagger.client.models.State](docs/State.md)
 - [io.swagger.client.models.Title](docs/Title.md)
 - [io.swagger.client.models.User](docs/User.md)
 - [io.swagger.client.models.WebhookConfig](docs/WebhookConfig.md)
 - [io.swagger.client.models.WebhookEvents](docs/WebhookEvents.md)

<a name="documentation-for-authorization"></a>
## Documentation for Authorization

<a name="basicAuth"></a>
### basicAuth

- **Type**: HTTP basic authentication

<a name="tokenAuth"></a>
### tokenAuth

