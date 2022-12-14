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


import io.swagger.client.model.CollaboratorsCollaboratorBody;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CollaboratorsApi {
    private ApiClient apiClient;

    public CollaboratorsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public CollaboratorsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for addCollaborator
     * @param owner owner of the repository (required)
     * @param repo name of the repository (required)
     * @param collaborator collaborator username (required)
     * @param body  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call addCollaboratorCall(String owner, String repo, String collaborator, CollaboratorsCollaboratorBody body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = body;
        
        // create path and map variables
        String localVarPath = "/repos/{owner}/{repo}/collaborators/{collaborator}"
            .replaceAll("\\{" + "owner" + "\\}", apiClient.escapeString(owner.toString()))
            .replaceAll("\\{" + "repo" + "\\}", apiClient.escapeString(repo.toString()))
            .replaceAll("\\{" + "collaborator" + "\\}", apiClient.escapeString(collaborator.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            
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
        return apiClient.buildCall(localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call addCollaboratorValidateBeforeCall(String owner, String repo, String collaborator, CollaboratorsCollaboratorBody body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'owner' is set
        if (owner == null) {
            throw new ApiException("Missing the required parameter 'owner' when calling addCollaborator(Async)");
        }
        // verify the required parameter 'repo' is set
        if (repo == null) {
            throw new ApiException("Missing the required parameter 'repo' when calling addCollaborator(Async)");
        }
        // verify the required parameter 'collaborator' is set
        if (collaborator == null) {
            throw new ApiException("Missing the required parameter 'collaborator' when calling addCollaborator(Async)");
        }
        
        com.squareup.okhttp.Call call = addCollaboratorCall(owner, repo, collaborator, body, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Add user as a collaborator
     * 
     * @param owner owner of the repository (required)
     * @param repo name of the repository (required)
     * @param collaborator collaborator username (required)
     * @param body  (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void addCollaborator(String owner, String repo, String collaborator, CollaboratorsCollaboratorBody body) throws ApiException {
        addCollaboratorWithHttpInfo(owner, repo, collaborator, body);
    }

    /**
     * Add user as a collaborator
     * 
     * @param owner owner of the repository (required)
     * @param repo name of the repository (required)
     * @param collaborator collaborator username (required)
     * @param body  (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> addCollaboratorWithHttpInfo(String owner, String repo, String collaborator, CollaboratorsCollaboratorBody body) throws ApiException {
        com.squareup.okhttp.Call call = addCollaboratorValidateBeforeCall(owner, repo, collaborator, body, null, null);
        return apiClient.execute(call);
    }

    /**
     * Add user as a collaborator (asynchronously)
     * 
     * @param owner owner of the repository (required)
     * @param repo name of the repository (required)
     * @param collaborator collaborator username (required)
     * @param body  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call addCollaboratorAsync(String owner, String repo, String collaborator, CollaboratorsCollaboratorBody body, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = addCollaboratorValidateBeforeCall(owner, repo, collaborator, body, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for getCollaborators
     * @param owner owner of the repository (required)
     * @param repo name of the repository (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getCollaboratorsCall(String owner, String repo, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/repos/{owner}/{repo}/collaborators"
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
    private com.squareup.okhttp.Call getCollaboratorsValidateBeforeCall(String owner, String repo, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'owner' is set
        if (owner == null) {
            throw new ApiException("Missing the required parameter 'owner' when calling getCollaborators(Async)");
        }
        // verify the required parameter 'repo' is set
        if (repo == null) {
            throw new ApiException("Missing the required parameter 'repo' when calling getCollaborators(Async)");
        }
        
        com.squareup.okhttp.Call call = getCollaboratorsCall(owner, repo, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get collaborators
     * 
     * @param owner owner of the repository (required)
     * @param repo name of the repository (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void getCollaborators(String owner, String repo) throws ApiException {
        getCollaboratorsWithHttpInfo(owner, repo);
    }

    /**
     * Get collaborators
     * 
     * @param owner owner of the repository (required)
     * @param repo name of the repository (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> getCollaboratorsWithHttpInfo(String owner, String repo) throws ApiException {
        com.squareup.okhttp.Call call = getCollaboratorsValidateBeforeCall(owner, repo, null, null);
        return apiClient.execute(call);
    }

    /**
     * Get collaborators (asynchronously)
     * 
     * @param owner owner of the repository (required)
     * @param repo name of the repository (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getCollaboratorsAsync(String owner, String repo, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = getCollaboratorsValidateBeforeCall(owner, repo, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for removeCollaborator
     * @param owner owner of the repository (required)
     * @param repo name of the repository (required)
     * @param collaborator collaborator username (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call removeCollaboratorCall(String owner, String repo, String collaborator, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/repos/{owner}/{repo}/collaborators/{collaborator}"
            .replaceAll("\\{" + "owner" + "\\}", apiClient.escapeString(owner.toString()))
            .replaceAll("\\{" + "repo" + "\\}", apiClient.escapeString(repo.toString()))
            .replaceAll("\\{" + "collaborator" + "\\}", apiClient.escapeString(collaborator.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            
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
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call removeCollaboratorValidateBeforeCall(String owner, String repo, String collaborator, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        // verify the required parameter 'owner' is set
        if (owner == null) {
            throw new ApiException("Missing the required parameter 'owner' when calling removeCollaborator(Async)");
        }
        // verify the required parameter 'repo' is set
        if (repo == null) {
            throw new ApiException("Missing the required parameter 'repo' when calling removeCollaborator(Async)");
        }
        // verify the required parameter 'collaborator' is set
        if (collaborator == null) {
            throw new ApiException("Missing the required parameter 'collaborator' when calling removeCollaborator(Async)");
        }
        
        com.squareup.okhttp.Call call = removeCollaboratorCall(owner, repo, collaborator, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Delete collaborator
     * 
     * @param owner owner of the repository (required)
     * @param repo name of the repository (required)
     * @param collaborator collaborator username (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void removeCollaborator(String owner, String repo, String collaborator) throws ApiException {
        removeCollaboratorWithHttpInfo(owner, repo, collaborator);
    }

    /**
     * Delete collaborator
     * 
     * @param owner owner of the repository (required)
     * @param repo name of the repository (required)
     * @param collaborator collaborator username (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> removeCollaboratorWithHttpInfo(String owner, String repo, String collaborator) throws ApiException {
        com.squareup.okhttp.Call call = removeCollaboratorValidateBeforeCall(owner, repo, collaborator, null, null);
        return apiClient.execute(call);
    }

    /**
     * Delete collaborator (asynchronously)
     * 
     * @param owner owner of the repository (required)
     * @param repo name of the repository (required)
     * @param collaborator collaborator username (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call removeCollaboratorAsync(String owner, String repo, String collaborator, final ApiCallback<Void> callback) throws ApiException {

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

        com.squareup.okhttp.Call call = removeCollaboratorValidateBeforeCall(owner, repo, collaborator, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
}
