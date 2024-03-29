/**
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
package io.swagger.client.apis

import io.swagger.client.models.Files1
import io.swagger.client.models.Integration

import dagshub_api.infrastructure.*

class StorageIntegrationsApi(basePath: kotlin.String = "https://dagshub.com/api/v1") : ApiClient(basePath) {

    /**
     * List contents in the path
     * 
     * @param owner owner of the repository 
     * @param repo name of the repository 
     * @param protocol protocol of the storage integration 
     * @param bucket name and prefix of the bucket integration 
     * @param path path of a folder in the repository 
     * @param includeSize  (optional, default to false)
     * @param limit Maximum amount of items to return (optional, default to 100)
     * @param fromToken Token, from which to continue iteration (optional)
     * @return Files1
     */
    @Suppress("UNCHECKED_CAST")
    fun getBucketContent(owner: kotlin.String, repo: kotlin.String, protocol: kotlin.String, bucket: kotlin.String, path: kotlin.String, includeSize: kotlin.Boolean? = null, limit: kotlin.Int? = null, fromToken: kotlin.String? = null): Files1 {
        val localVariableQuery: MultiValueMap = mapOf("include_size" to listOf("$includeSize"), "limit" to listOf("$limit"), "from_token" to listOf("$fromToken"))
        val localVariableConfig = RequestConfig(
                RequestMethod.GET,
                "/repos/{owner}/{repo}/storage/content/{protocol}/{bucket}/{path}".replace("{" + "owner" + "}", "$owner").replace("{" + "repo" + "}", "$repo").replace("{" + "protocol" + "}", "$protocol").replace("{" + "bucket" + "}", "$bucket").replace("{" + "path" + "}", "$path"), query = localVariableQuery
        )
        val response = request<Files1>(
                localVariableConfig
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as Files1
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
        }
    }
    /**
     * Get file in the bucket
     * 
     * @param owner owner of the repository 
     * @param repo name of the repository 
     * @param protocol protocol of the storage integration 
     * @param bucket name and prefix of the bucket integration 
     * @param path The content path 
     * @return void
     */
    fun getBucketFile(owner: kotlin.String, repo: kotlin.String, protocol: kotlin.String, bucket: kotlin.String, path: kotlin.String): Unit {
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableConfig = RequestConfig(
                RequestMethod.GET,
                "/repos/{owner}/{repo}/storage/raw/{protocol}/{bucket}/{path}".replace("{" + "owner" + "}", "$owner").replace("{" + "repo" + "}", "$repo").replace("{" + "protocol" + "}", "$protocol").replace("{" + "bucket" + "}", "$bucket").replace("{" + "path" + "}", "$path"), query = localVariableQuery
        )
        val response = request<Any?>(
                localVariableConfig
        )

        return when (response.responseType) {
            ResponseType.Success -> Unit
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
        }
    }
    /**
     * List integrated storages in the repository
     * 
     * @param owner owner of the repository 
     * @param repo name of the repository 
     * @return Integration
     */
    @Suppress("UNCHECKED_CAST")
    fun getBuckets(owner: kotlin.String, repo: kotlin.String): Integration {
        val localVariableQuery: MultiValueMap = mapOf()
        val localVariableConfig = RequestConfig(
                RequestMethod.GET,
                "/repos/{owner}/{repo}/storage".replace("{" + "owner" + "}", "$owner").replace("{" + "repo" + "}", "$repo"), query = localVariableQuery
        )
        val response = request<Integration>(
                localVariableConfig
        )

        return when (response.responseType) {
            ResponseType.Success -> (response as Success<*>).data as Integration
            ResponseType.Informational -> TODO()
            ResponseType.Redirection -> TODO()
            ResponseType.ClientError -> throw ClientException((response as ClientError<*>).body as? String ?: "Client error")
            ResponseType.ServerError -> throw ServerException((response as ServerError<*>).message ?: "Server error")
        }
    }
}
