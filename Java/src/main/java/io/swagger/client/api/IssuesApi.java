/*
 * DagsHub API
 * This API provides a way to retrive & interact with data about DagsHub repositories, users, issues, webhooks and more. The API is also used by the [DagsHub Direct Data Access streaming client](https://github.com/DagsHub/client) to stream content from a repository for easier and faster training. 
 *
 * OpenAPI spec version: 1.0.2
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.api;

import io.swagger.client.ApiCallback;
import io.swagger.client.ApiClient;
import io.swagger.client.ApiException;
import io.swagger.client.ApiResponse;
import io.swagger.client.Configuration;
import io.swagger.client.Pair;
import io.swagger.client.ProgressRequestBody;
import io.swagger.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import io.swagger.client.model.Issue;
import io.swagger.client.model.Issues;
import io.swagger.client.model.PatchIssue;
import io.swagger.client.model.PostIssue;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class IssuesApi {
    private ApiClient apiClient;

    public IssuesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public IssuesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for createIssue
     * @param owner owner of the repository (required)
     * @param repo name of the repository (required)
     * @param body  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call createIssueCall(String owner, String repo, PostIssue body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/repos/{owner}/{repo}/issues"
            .replaceAll("\\{" + "owner" + "\\}", apiClient.escapeString(owner.toString()))
            .replaceAll("\\{" + "repo" + "\\}", apiClient.escapeString(repo.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "basicAuth", "tokenAuth" };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call createIssueValidateBeforeCall(String owner, String repo, PostIssue body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'owner' is set
        if (owner == null) {
            throw new ApiException("Missing the required parameter 'owner' when calling createIssue(Async)");
        }
        // verify the required parameter 'repo' is set
        if (repo == null) {
            throw new ApiException("Missing the required parameter 'repo' when calling createIssue(Async)");
        }
        
        com.squareup.okhttp.Call call = createIssueCall(owner, repo, body, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Create an issue
     * Any user with read access to a repository can create an issue.
     * @param owner owner of the repository (required)
     * @param repo name of the repository (required)
     * @param body  (optional)
     * @return Issue
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Issue createIssue(String owner, String repo, PostIssue body) throws ApiException {
        ApiResponse<Issue> resp = createIssueWithHttpInfo(owner, repo, body);
        return resp.getData();
    }

    /**
     * Create an issue
     * Any user with read access to a repository can create an issue.
     * @param owner owner of the repository (required)
     * @param repo name of the repository (required)
     * @param body  (optional)
     * @return ApiResponse&lt;Issue&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Issue> createIssueWithHttpInfo(String owner, String repo, PostIssue body) throws ApiException {
        com.squareup.okhttp.Call call = createIssueValidateBeforeCall(owner, repo, body, null, null);
        Type localVarReturnType = new TypeToken<Issue>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create an issue (asynchronously)
     * Any user with read access to a repository can create an issue.
     * @param owner owner of the repository (required)
     * @param repo name of the repository (required)
     * @param body  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createIssueAsync(String owner, String repo, PostIssue body, final ApiCallback<Issue> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = createIssueValidateBeforeCall(owner, repo, body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Issue>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for editIssue
     * @param owner owner of the repository (required)
     * @param repo name of the repository (required)
     * @param body  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call editIssueCall(String owner, String repo, PatchIssue body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/repos/{owner}/{repo}/issues"
            .replaceAll("\\{" + "owner" + "\\}", apiClient.escapeString(owner.toString()))
            .replaceAll("\\{" + "repo" + "\\}", apiClient.escapeString(repo.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "basicAuth", "tokenAuth" };
        return apiClient.buildCall(localVarPath, "PATCH", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call editIssueValidateBeforeCall(String owner, String repo, PatchIssue body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'owner' is set
        if (owner == null) {
            throw new ApiException("Missing the required parameter 'owner' when calling editIssue(Async)");
        }
        // verify the required parameter 'repo' is set
        if (repo == null) {
            throw new ApiException("Missing the required parameter 'repo' when calling editIssue(Async)");
        }
        
        com.squareup.okhttp.Call call = editIssueCall(owner, repo, body, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Edit an issue
     * 
     * @param owner owner of the repository (required)
     * @param repo name of the repository (required)
     * @param body  (optional)
     * @return Issue
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Issue editIssue(String owner, String repo, PatchIssue body) throws ApiException {
        ApiResponse<Issue> resp = editIssueWithHttpInfo(owner, repo, body);
        return resp.getData();
    }

    /**
     * Edit an issue
     * 
     * @param owner owner of the repository (required)
     * @param repo name of the repository (required)
     * @param body  (optional)
     * @return ApiResponse&lt;Issue&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Issue> editIssueWithHttpInfo(String owner, String repo, PatchIssue body) throws ApiException {
        com.squareup.okhttp.Call call = editIssueValidateBeforeCall(owner, repo, body, null, null);
        Type localVarReturnType = new TypeToken<Issue>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Edit an issue (asynchronously)
     * 
     * @param owner owner of the repository (required)
     * @param repo name of the repository (required)
     * @param body  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call editIssueAsync(String owner, String repo, PatchIssue body, final ApiCallback<Issue> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = editIssueValidateBeforeCall(owner, repo, body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Issue>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getIssue
     * @param owner owner of the repository (required)
     * @param repo name of the repository (required)
     * @param index the index of an issue or a pull request (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getIssueCall(String owner, String repo, Integer index, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/repos/{owner}/{repo}/issues/{index}"
            .replaceAll("\\{" + "owner" + "\\}", apiClient.escapeString(owner.toString()))
            .replaceAll("\\{" + "repo" + "\\}", apiClient.escapeString(repo.toString()))
            .replaceAll("\\{" + "index" + "\\}", apiClient.escapeString(index.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "basicAuth", "tokenAuth" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getIssueValidateBeforeCall(String owner, String repo, Integer index, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'owner' is set
        if (owner == null) {
            throw new ApiException("Missing the required parameter 'owner' when calling getIssue(Async)");
        }
        // verify the required parameter 'repo' is set
        if (repo == null) {
            throw new ApiException("Missing the required parameter 'repo' when calling getIssue(Async)");
        }
        // verify the required parameter 'index' is set
        if (index == null) {
            throw new ApiException("Missing the required parameter 'index' when calling getIssue(Async)");
        }
        
        com.squareup.okhttp.Call call = getIssueCall(owner, repo, index, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get a single issue
     * This endpoint may also return pull requests in the response. If an issue is a pull request, the object will include a pull_request key.
     * @param owner owner of the repository (required)
     * @param repo name of the repository (required)
     * @param index the index of an issue or a pull request (required)
     * @return Issue
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Issue getIssue(String owner, String repo, Integer index) throws ApiException {
        ApiResponse<Issue> resp = getIssueWithHttpInfo(owner, repo, index);
        return resp.getData();
    }

    /**
     * Get a single issue
     * This endpoint may also return pull requests in the response. If an issue is a pull request, the object will include a pull_request key.
     * @param owner owner of the repository (required)
     * @param repo name of the repository (required)
     * @param index the index of an issue or a pull request (required)
     * @return ApiResponse&lt;Issue&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Issue> getIssueWithHttpInfo(String owner, String repo, Integer index) throws ApiException {
        com.squareup.okhttp.Call call = getIssueValidateBeforeCall(owner, repo, index, null, null);
        Type localVarReturnType = new TypeToken<Issue>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get a single issue (asynchronously)
     * This endpoint may also return pull requests in the response. If an issue is a pull request, the object will include a pull_request key.
     * @param owner owner of the repository (required)
     * @param repo name of the repository (required)
     * @param index the index of an issue or a pull request (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getIssueAsync(String owner, String repo, Integer index, final ApiCallback<Issue> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getIssueValidateBeforeCall(owner, repo, index, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Issue>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for listRepoIssues
     * @param owner owner of the repository (required)
     * @param repo name of the repository (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call listRepoIssuesCall(String owner, String repo, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/repos/{owner}/{repo}/issues"
            .replaceAll("\\{" + "owner" + "\\}", apiClient.escapeString(owner.toString()))
            .replaceAll("\\{" + "repo" + "\\}", apiClient.escapeString(repo.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "basicAuth", "tokenAuth" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call listRepoIssuesValidateBeforeCall(String owner, String repo, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'owner' is set
        if (owner == null) {
            throw new ApiException("Missing the required parameter 'owner' when calling listRepoIssues(Async)");
        }
        // verify the required parameter 'repo' is set
        if (repo == null) {
            throw new ApiException("Missing the required parameter 'repo' when calling listRepoIssues(Async)");
        }
        
        com.squareup.okhttp.Call call = listRepoIssuesCall(owner, repo, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * List issues for a repository
     * This endpoint may also return pull requests in the response. If an issue is a pull request, the object will include a pull_request key.
     * @param owner owner of the repository (required)
     * @param repo name of the repository (required)
     * @return Issues
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public Issues listRepoIssues(String owner, String repo) throws ApiException {
        ApiResponse<Issues> resp = listRepoIssuesWithHttpInfo(owner, repo);
        return resp.getData();
    }

    /**
     * List issues for a repository
     * This endpoint may also return pull requests in the response. If an issue is a pull request, the object will include a pull_request key.
     * @param owner owner of the repository (required)
     * @param repo name of the repository (required)
     * @return ApiResponse&lt;Issues&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Issues> listRepoIssuesWithHttpInfo(String owner, String repo) throws ApiException {
        com.squareup.okhttp.Call call = listRepoIssuesValidateBeforeCall(owner, repo, null, null);
        Type localVarReturnType = new TypeToken<Issues>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * List issues for a repository (asynchronously)
     * This endpoint may also return pull requests in the response. If an issue is a pull request, the object will include a pull_request key.
     * @param owner owner of the repository (required)
     * @param repo name of the repository (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listRepoIssuesAsync(String owner, String repo, final ApiCallback<Issues> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = listRepoIssuesValidateBeforeCall(owner, repo, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<Issues>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
