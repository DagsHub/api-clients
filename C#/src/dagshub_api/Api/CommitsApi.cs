/* 
 * DagsHub API
 *
 * This API provides a way to retrive & interact with data about DagsHub repositories, users, issues, webhooks and more. The API is also used by the [DagsHub Direct Data Access streaming client](https://github.com/DagsHub/client) to stream content from a repository for easier and faster training. 
 *
 * OpenAPI spec version: 1.0.2
 * 
 * Generated by: https://github.com/swagger-api/swagger-codegen.git
 */
using System;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using RestSharp;
using dagshub_api.Client;

namespace dagshub_api.Api
{
    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
        public interface ICommitsApi : IApiAccessor
    {
        #region Synchronous Operations
        /// <summary>
        /// Get a single commit
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <exception cref="dagshub_api.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="owner">owner of the repository</param>
        /// <param name="repo">name of the repository</param>
        /// <param name="sha">a SHA1 of a commit</param>
        /// <returns></returns>
        void GetCommit (string owner, string repo, string sha);

        /// <summary>
        /// Get a single commit
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <exception cref="dagshub_api.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="owner">owner of the repository</param>
        /// <param name="repo">name of the repository</param>
        /// <param name="sha">a SHA1 of a commit</param>
        /// <returns>ApiResponse of Object(void)</returns>
        ApiResponse<Object> GetCommitWithHttpInfo (string owner, string repo, string sha);
        #endregion Synchronous Operations
        #region Asynchronous Operations
        /// <summary>
        /// Get a single commit
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <exception cref="dagshub_api.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="owner">owner of the repository</param>
        /// <param name="repo">name of the repository</param>
        /// <param name="sha">a SHA1 of a commit</param>
        /// <returns>Task of void</returns>
        System.Threading.Tasks.Task GetCommitAsync (string owner, string repo, string sha);

        /// <summary>
        /// Get a single commit
        /// </summary>
        /// <remarks>
        /// 
        /// </remarks>
        /// <exception cref="dagshub_api.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="owner">owner of the repository</param>
        /// <param name="repo">name of the repository</param>
        /// <param name="sha">a SHA1 of a commit</param>
        /// <returns>Task of ApiResponse</returns>
        System.Threading.Tasks.Task<ApiResponse<Object>> GetCommitAsyncWithHttpInfo (string owner, string repo, string sha);
        #endregion Asynchronous Operations
    }

    /// <summary>
    /// Represents a collection of functions to interact with the API endpoints
    /// </summary>
        public partial class CommitsApi : ICommitsApi
    {
        private dagshub_api.Client.ExceptionFactory _exceptionFactory = (name, response) => null;

        /// <summary>
        /// Initializes a new instance of the <see cref="CommitsApi"/> class.
        /// </summary>
        /// <returns></returns>
        public CommitsApi(String basePath)
        {
            this.Configuration = new dagshub_api.Client.Configuration { BasePath = basePath };

            ExceptionFactory = dagshub_api.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="CommitsApi"/> class
        /// </summary>
        /// <returns></returns>
        public CommitsApi()
        {
            this.Configuration = dagshub_api.Client.Configuration.Default;

            ExceptionFactory = dagshub_api.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Initializes a new instance of the <see cref="CommitsApi"/> class
        /// using Configuration object
        /// </summary>
        /// <param name="configuration">An instance of Configuration</param>
        /// <returns></returns>
        public CommitsApi(dagshub_api.Client.Configuration configuration = null)
        {
            if (configuration == null) // use the default one in Configuration
                this.Configuration = dagshub_api.Client.Configuration.Default;
            else
                this.Configuration = configuration;

            ExceptionFactory = dagshub_api.Client.Configuration.DefaultExceptionFactory;
        }

        /// <summary>
        /// Gets the base path of the API client.
        /// </summary>
        /// <value>The base path</value>
        public String GetBasePath()
        {
            return this.Configuration.ApiClient.RestClient.BaseUrl.ToString();
        }

        /// <summary>
        /// Sets the base path of the API client.
        /// </summary>
        /// <value>The base path</value>
        [Obsolete("SetBasePath is deprecated, please do 'Configuration.ApiClient = new ApiClient(\"http://new-path\")' instead.")]
        public void SetBasePath(String basePath)
        {
            // do nothing
        }

        /// <summary>
        /// Gets or sets the configuration object
        /// </summary>
        /// <value>An instance of the Configuration</value>
        public dagshub_api.Client.Configuration Configuration {get; set;}

        /// <summary>
        /// Provides a factory method hook for the creation of exceptions.
        /// </summary>
        public dagshub_api.Client.ExceptionFactory ExceptionFactory
        {
            get
            {
                if (_exceptionFactory != null && _exceptionFactory.GetInvocationList().Length > 1)
                {
                    throw new InvalidOperationException("Multicast delegate for ExceptionFactory is unsupported.");
                }
                return _exceptionFactory;
            }
            set { _exceptionFactory = value; }
        }

        /// <summary>
        /// Gets the default header.
        /// </summary>
        /// <returns>Dictionary of HTTP header</returns>
        [Obsolete("DefaultHeader is deprecated, please use Configuration.DefaultHeader instead.")]
        public IDictionary<String, String> DefaultHeader()
        {
            return new ReadOnlyDictionary<string, string>(this.Configuration.DefaultHeader);
        }

        /// <summary>
        /// Add default header.
        /// </summary>
        /// <param name="key">Header field name.</param>
        /// <param name="value">Header field value.</param>
        /// <returns></returns>
        [Obsolete("AddDefaultHeader is deprecated, please use Configuration.AddDefaultHeader instead.")]
        public void AddDefaultHeader(string key, string value)
        {
            this.Configuration.AddDefaultHeader(key, value);
        }

        /// <summary>
        /// Get a single commit 
        /// </summary>
        /// <exception cref="dagshub_api.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="owner">owner of the repository</param>
        /// <param name="repo">name of the repository</param>
        /// <param name="sha">a SHA1 of a commit</param>
        /// <returns></returns>
        public void GetCommit (string owner, string repo, string sha)
        {
             GetCommitWithHttpInfo(owner, repo, sha);
        }

        /// <summary>
        /// Get a single commit 
        /// </summary>
        /// <exception cref="dagshub_api.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="owner">owner of the repository</param>
        /// <param name="repo">name of the repository</param>
        /// <param name="sha">a SHA1 of a commit</param>
        /// <returns>ApiResponse of Object(void)</returns>
        public ApiResponse<Object> GetCommitWithHttpInfo (string owner, string repo, string sha)
        {
            // verify the required parameter 'owner' is set
            if (owner == null)
                throw new ApiException(400, "Missing required parameter 'owner' when calling CommitsApi->GetCommit");
            // verify the required parameter 'repo' is set
            if (repo == null)
                throw new ApiException(400, "Missing required parameter 'repo' when calling CommitsApi->GetCommit");
            // verify the required parameter 'sha' is set
            if (sha == null)
                throw new ApiException(400, "Missing required parameter 'sha' when calling CommitsApi->GetCommit");

            var localVarPath = "/repos/{owner}/{repo}/commits/{sha}";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (owner != null) localVarPathParams.Add("owner", this.Configuration.ApiClient.ParameterToString(owner)); // path parameter
            if (repo != null) localVarPathParams.Add("repo", this.Configuration.ApiClient.ParameterToString(repo)); // path parameter
            if (sha != null) localVarPathParams.Add("sha", this.Configuration.ApiClient.ParameterToString(sha)); // path parameter
            // authentication (basicAuth) required
            // http basic authentication required
            if (!String.IsNullOrEmpty(this.Configuration.Username) || !String.IsNullOrEmpty(this.Configuration.Password))
            {
                localVarHeaderParams["Authorization"] = "Basic " + ApiClient.Base64Encode(this.Configuration.Username + ":" + this.Configuration.Password);
            }
            // authentication (tokenAuth) required
            if (!String.IsNullOrEmpty(this.Configuration.GetApiKeyWithPrefix("token")))
            {
                localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "token", this.Configuration.GetApiKeyWithPrefix("token")));
            }

            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) this.Configuration.ApiClient.CallApi(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("GetCommit", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

        /// <summary>
        /// Get a single commit 
        /// </summary>
        /// <exception cref="dagshub_api.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="owner">owner of the repository</param>
        /// <param name="repo">name of the repository</param>
        /// <param name="sha">a SHA1 of a commit</param>
        /// <returns>Task of void</returns>
        public async System.Threading.Tasks.Task GetCommitAsync (string owner, string repo, string sha)
        {
             await GetCommitAsyncWithHttpInfo(owner, repo, sha);

        }

        /// <summary>
        /// Get a single commit 
        /// </summary>
        /// <exception cref="dagshub_api.Client.ApiException">Thrown when fails to make API call</exception>
        /// <param name="owner">owner of the repository</param>
        /// <param name="repo">name of the repository</param>
        /// <param name="sha">a SHA1 of a commit</param>
        /// <returns>Task of ApiResponse</returns>
        public async System.Threading.Tasks.Task<ApiResponse<Object>> GetCommitAsyncWithHttpInfo (string owner, string repo, string sha)
        {
            // verify the required parameter 'owner' is set
            if (owner == null)
                throw new ApiException(400, "Missing required parameter 'owner' when calling CommitsApi->GetCommit");
            // verify the required parameter 'repo' is set
            if (repo == null)
                throw new ApiException(400, "Missing required parameter 'repo' when calling CommitsApi->GetCommit");
            // verify the required parameter 'sha' is set
            if (sha == null)
                throw new ApiException(400, "Missing required parameter 'sha' when calling CommitsApi->GetCommit");

            var localVarPath = "/repos/{owner}/{repo}/commits/{sha}";
            var localVarPathParams = new Dictionary<String, String>();
            var localVarQueryParams = new List<KeyValuePair<String, String>>();
            var localVarHeaderParams = new Dictionary<String, String>(this.Configuration.DefaultHeader);
            var localVarFormParams = new Dictionary<String, String>();
            var localVarFileParams = new Dictionary<String, FileParameter>();
            Object localVarPostBody = null;

            // to determine the Content-Type header
            String[] localVarHttpContentTypes = new String[] {
            };
            String localVarHttpContentType = this.Configuration.ApiClient.SelectHeaderContentType(localVarHttpContentTypes);

            // to determine the Accept header
            String[] localVarHttpHeaderAccepts = new String[] {
                "application/json"
            };
            String localVarHttpHeaderAccept = this.Configuration.ApiClient.SelectHeaderAccept(localVarHttpHeaderAccepts);
            if (localVarHttpHeaderAccept != null)
                localVarHeaderParams.Add("Accept", localVarHttpHeaderAccept);

            if (owner != null) localVarPathParams.Add("owner", this.Configuration.ApiClient.ParameterToString(owner)); // path parameter
            if (repo != null) localVarPathParams.Add("repo", this.Configuration.ApiClient.ParameterToString(repo)); // path parameter
            if (sha != null) localVarPathParams.Add("sha", this.Configuration.ApiClient.ParameterToString(sha)); // path parameter
            // authentication (basicAuth) required
            // http basic authentication required
            if (!String.IsNullOrEmpty(this.Configuration.Username) || !String.IsNullOrEmpty(this.Configuration.Password))
            {
                localVarHeaderParams["Authorization"] = "Basic " + ApiClient.Base64Encode(this.Configuration.Username + ":" + this.Configuration.Password);
            }
            // authentication (tokenAuth) required
            if (!String.IsNullOrEmpty(this.Configuration.GetApiKeyWithPrefix("token")))
            {
                localVarQueryParams.AddRange(this.Configuration.ApiClient.ParameterToKeyValuePairs("", "token", this.Configuration.GetApiKeyWithPrefix("token")));
            }

            // make the HTTP request
            IRestResponse localVarResponse = (IRestResponse) await this.Configuration.ApiClient.CallApiAsync(localVarPath,
                Method.GET, localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarFileParams,
                localVarPathParams, localVarHttpContentType);

            int localVarStatusCode = (int) localVarResponse.StatusCode;

            if (ExceptionFactory != null)
            {
                Exception exception = ExceptionFactory("GetCommit", localVarResponse);
                if (exception != null) throw exception;
            }

            return new ApiResponse<Object>(localVarStatusCode,
                localVarResponse.Headers.ToDictionary(x => x.Name, x => string.Join(",", x.Value)),
                null);
        }

    }
}
