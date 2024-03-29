/*
 * DagsHub API
 * This API provides a way to retrive & interact with data about DagsHub repositories, users, issues, webhooks and more. The API is also used by the [DagsHub Direct Data Access streaming client](https://github.com/DagsHub/client) to stream content from a repository for easier and faster training. 
 *
 * OpenAPI spec version: 1.0.2
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 *
 * Swagger Codegen version: 3.0.35
 *
 * Do not edit the class manually.
 *
 */
import {ApiClient} from './ApiClient';
import {Assignee} from './model/Assignee';
import {Body} from './model/Body';
import {Closed} from './model/Closed';
import {CollaboratorsCollaboratorBody} from './model/CollaboratorsCollaboratorBody';
import {CreateRepo} from './model/CreateRepo';
import {EditExperimentPost} from './model/EditExperimentPost';
import {ExperimentKeys} from './model/ExperimentKeys';
import {File} from './model/File';
import {Files} from './model/Files';
import {Files1} from './model/Files1';
import {HooksIdBody} from './model/HooksIdBody';
import {Integration} from './model/Integration';
import {IntegrationInner} from './model/IntegrationInner';
import {Issue} from './model/Issue';
import {IssueAssignee} from './model/IssueAssignee';
import {IssueLabels} from './model/IssueLabels';
import {IssueMilestone} from './model/IssueMilestone';
import {Issues} from './model/Issues';
import {Labels} from './model/Labels';
import {MigrateRepo} from './model/MigrateRepo';
import {Milestone} from './model/Milestone';
import {PatchIssue} from './model/PatchIssue';
import {PostIssue} from './model/PostIssue';
import {PutFile} from './model/PutFile';
import {RepoHooksBody} from './model/RepoHooksBody';
import {State} from './model/State';
import {Title} from './model/Title';
import {User} from './model/User';
import {WebhookConfig} from './model/WebhookConfig';
import {WebhookEvents} from './model/WebhookEvents';
import {BranchesApi} from './api/BranchesApi';
import {CollaboratorsApi} from './api/CollaboratorsApi';
import {CommitsApi} from './api/CommitsApi';
import {ContentApi} from './api/ContentApi';
import {ExperimentsApi} from './api/ExperimentsApi';
import {IssuesApi} from './api/IssuesApi';
import {ReleasesApi} from './api/ReleasesApi';
import {RepositoryApi} from './api/RepositoryApi';
import {StorageIntegrationsApi} from './api/StorageIntegrationsApi';
import {UserApi} from './api/UserApi';
import {WebhooksApi} from './api/WebhooksApi';

/**
* This_API_provides_a_way_to_retrive__interact_with_data_about_DagsHub_repositories_users_issues_webhooks_and_more_The_API_is_also_used_by_the__DagsHub_Direct_Data_Access_streaming_client_httpsgithub_comDagsHubclient_to_stream_content_from_a_repository_for_easier_and_faster_training_.<br>
* The <code>index</code> module provides access to constructors for all the classes which comprise the public API.
* <p>
* An AMD (recommended!) or CommonJS application will generally do something equivalent to the following:
* <pre>
* var DagsHubApi = require('index'); // See note below*.
* var xxxSvc = new DagsHubApi.XxxApi(); // Allocate the API class we're going to use.
* var yyyModel = new DagsHubApi.Yyy(); // Construct a model instance.
* yyyModel.someProperty = 'someValue';
* ...
* var zzz = xxxSvc.doSomething(yyyModel); // Invoke the service.
* ...
* </pre>
* <em>*NOTE: For a top-level AMD script, use require(['index'], function(){...})
* and put the application logic within the callback function.</em>
* </p>
* <p>
* A non-AMD browser application (discouraged) might do something like this:
* <pre>
* var xxxSvc = new DagsHubApi.XxxApi(); // Allocate the API class we're going to use.
* var yyy = new DagsHubApi.Yyy(); // Construct a model instance.
* yyyModel.someProperty = 'someValue';
* ...
* var zzz = xxxSvc.doSomething(yyyModel); // Invoke the service.
* ...
* </pre>
* </p>
* @module index
* @version 1.0.2
*/
export {
    /**
     * The ApiClient constructor.
     * @property {module:ApiClient}
     */
    ApiClient,

    /**
     * The Assignee model constructor.
     * @property {module:model/Assignee}
     */
    Assignee,

    /**
     * The Body model constructor.
     * @property {module:model/Body}
     */
    Body,

    /**
     * The Closed model constructor.
     * @property {module:model/Closed}
     */
    Closed,

    /**
     * The CollaboratorsCollaboratorBody model constructor.
     * @property {module:model/CollaboratorsCollaboratorBody}
     */
    CollaboratorsCollaboratorBody,

    /**
     * The CreateRepo model constructor.
     * @property {module:model/CreateRepo}
     */
    CreateRepo,

    /**
     * The EditExperimentPost model constructor.
     * @property {module:model/EditExperimentPost}
     */
    EditExperimentPost,

    /**
     * The ExperimentKeys model constructor.
     * @property {module:model/ExperimentKeys}
     */
    ExperimentKeys,

    /**
     * The File model constructor.
     * @property {module:model/File}
     */
    File,

    /**
     * The Files model constructor.
     * @property {module:model/Files}
     */
    Files,

    /**
     * The Files1 model constructor.
     * @property {module:model/Files1}
     */
    Files1,

    /**
     * The HooksIdBody model constructor.
     * @property {module:model/HooksIdBody}
     */
    HooksIdBody,

    /**
     * The Integration model constructor.
     * @property {module:model/Integration}
     */
    Integration,

    /**
     * The IntegrationInner model constructor.
     * @property {module:model/IntegrationInner}
     */
    IntegrationInner,

    /**
     * The Issue model constructor.
     * @property {module:model/Issue}
     */
    Issue,

    /**
     * The IssueAssignee model constructor.
     * @property {module:model/IssueAssignee}
     */
    IssueAssignee,

    /**
     * The IssueLabels model constructor.
     * @property {module:model/IssueLabels}
     */
    IssueLabels,

    /**
     * The IssueMilestone model constructor.
     * @property {module:model/IssueMilestone}
     */
    IssueMilestone,

    /**
     * The Issues model constructor.
     * @property {module:model/Issues}
     */
    Issues,

    /**
     * The Labels model constructor.
     * @property {module:model/Labels}
     */
    Labels,

    /**
     * The MigrateRepo model constructor.
     * @property {module:model/MigrateRepo}
     */
    MigrateRepo,

    /**
     * The Milestone model constructor.
     * @property {module:model/Milestone}
     */
    Milestone,

    /**
     * The PatchIssue model constructor.
     * @property {module:model/PatchIssue}
     */
    PatchIssue,

    /**
     * The PostIssue model constructor.
     * @property {module:model/PostIssue}
     */
    PostIssue,

    /**
     * The PutFile model constructor.
     * @property {module:model/PutFile}
     */
    PutFile,

    /**
     * The RepoHooksBody model constructor.
     * @property {module:model/RepoHooksBody}
     */
    RepoHooksBody,

    /**
     * The State model constructor.
     * @property {module:model/State}
     */
    State,

    /**
     * The Title model constructor.
     * @property {module:model/Title}
     */
    Title,

    /**
     * The User model constructor.
     * @property {module:model/User}
     */
    User,

    /**
     * The WebhookConfig model constructor.
     * @property {module:model/WebhookConfig}
     */
    WebhookConfig,

    /**
     * The WebhookEvents model constructor.
     * @property {module:model/WebhookEvents}
     */
    WebhookEvents,

    /**
    * The BranchesApi service constructor.
    * @property {module:api/BranchesApi}
    */
    BranchesApi,

    /**
    * The CollaboratorsApi service constructor.
    * @property {module:api/CollaboratorsApi}
    */
    CollaboratorsApi,

    /**
    * The CommitsApi service constructor.
    * @property {module:api/CommitsApi}
    */
    CommitsApi,

    /**
    * The ContentApi service constructor.
    * @property {module:api/ContentApi}
    */
    ContentApi,

    /**
    * The ExperimentsApi service constructor.
    * @property {module:api/ExperimentsApi}
    */
    ExperimentsApi,

    /**
    * The IssuesApi service constructor.
    * @property {module:api/IssuesApi}
    */
    IssuesApi,

    /**
    * The ReleasesApi service constructor.
    * @property {module:api/ReleasesApi}
    */
    ReleasesApi,

    /**
    * The RepositoryApi service constructor.
    * @property {module:api/RepositoryApi}
    */
    RepositoryApi,

    /**
    * The StorageIntegrationsApi service constructor.
    * @property {module:api/StorageIntegrationsApi}
    */
    StorageIntegrationsApi,

    /**
    * The UserApi service constructor.
    * @property {module:api/UserApi}
    */
    UserApi,

    /**
    * The WebhooksApi service constructor.
    * @property {module:api/WebhooksApi}
    */
    WebhooksApi
};
