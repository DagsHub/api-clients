# DagsHub API
#
# This API provides a way to retrive & interact with data about DagsHub repositories, users, issues, webhooks and more. The API is also used by the [DagsHub Direct Data Access streaming client](https://github.com/DagsHub/client) to stream content from a repository for easier and faster training. 
#
# OpenAPI spec version: 1.0.2
# 
# Generated by: https://github.com/swagger-api/swagger-codegen.git
#' @title Collaborators operations
#' @description dagshub_api.Collaborators
#'
#' @field path Stores url path of the request.
#' @field apiClient Handles the client-server communication.
#' @field userAgent Set the user agent of the request.
#'
#' @importFrom R6 R6Class
#'
#' @section Methods:
#' \describe{
#'
#' add_collaborator Add user as a collaborator
#'
#'
#' get_collaborators Get collaborators
#'
#'
#' remove_collaborator Delete collaborator
#'
#' }
#'
#' @export
CollaboratorsApi <- R6::R6Class(
  'CollaboratorsApi',
  public = list(
    userAgent = "Swagger-Codegen/1.0.3/r",
    apiClient = NULL,
    initialize = function(apiClient){
      if (!missing(apiClient)) {
        self$apiClient <- apiClient
      }
      else {
        self$apiClient <- ApiClient$new()
      }
    },
    add_collaborator = function(owner, repo, collaborator, body, ...){
      args <- list(...)
      queryParams <- list()
      headerParams <- character()

      if (!missing(`body`)) {
        body <- `body`$toJSONString()
      } else {
        body <- NULL
      }

      urlPath <- "/repos/{owner}/{repo}/collaborators/{collaborator}"
      if (!missing(`owner`)) {
        urlPath <- gsub(paste0("\\{", "owner", "\\}"), `owner`, urlPath)
      }

      if (!missing(`repo`)) {
        urlPath <- gsub(paste0("\\{", "repo", "\\}"), `repo`, urlPath)
      }

      if (!missing(`collaborator`)) {
        urlPath <- gsub(paste0("\\{", "collaborator", "\\}"), `collaborator`, urlPath)
      }

      resp <- self$apiClient$callApi(url = paste0(self$apiClient$basePath, urlPath),
                                 method = "PUT",
                                 queryParams = queryParams,
                                 headerParams = headerParams,
                                 body = body,
                                 ...)
      
      if (httr::status_code(resp) >= 200 && httr::status_code(resp) <= 299) {
        # void response, no need to return anything
      } else if (httr::status_code(resp) >= 400 && httr::status_code(resp) <= 499) {
        Response$new("API client error", resp)
      } else if (httr::status_code(resp) >= 500 && httr::status_code(resp) <= 599) {
        Response$new("API server error", resp)
      }

    }
    get_collaborators = function(owner, repo, ...){
      args <- list(...)
      queryParams <- list()
      headerParams <- character()

      urlPath <- "/repos/{owner}/{repo}/collaborators"
      if (!missing(`owner`)) {
        urlPath <- gsub(paste0("\\{", "owner", "\\}"), `owner`, urlPath)
      }

      if (!missing(`repo`)) {
        urlPath <- gsub(paste0("\\{", "repo", "\\}"), `repo`, urlPath)
      }

      resp <- self$apiClient$callApi(url = paste0(self$apiClient$basePath, urlPath),
                                 method = "GET",
                                 queryParams = queryParams,
                                 headerParams = headerParams,
                                 body = body,
                                 ...)
      
      if (httr::status_code(resp) >= 200 && httr::status_code(resp) <= 299) {
        # void response, no need to return anything
      } else if (httr::status_code(resp) >= 400 && httr::status_code(resp) <= 499) {
        Response$new("API client error", resp)
      } else if (httr::status_code(resp) >= 500 && httr::status_code(resp) <= 599) {
        Response$new("API server error", resp)
      }

    }
    remove_collaborator = function(owner, repo, collaborator, ...){
      args <- list(...)
      queryParams <- list()
      headerParams <- character()

      urlPath <- "/repos/{owner}/{repo}/collaborators/{collaborator}"
      if (!missing(`owner`)) {
        urlPath <- gsub(paste0("\\{", "owner", "\\}"), `owner`, urlPath)
      }

      if (!missing(`repo`)) {
        urlPath <- gsub(paste0("\\{", "repo", "\\}"), `repo`, urlPath)
      }

      if (!missing(`collaborator`)) {
        urlPath <- gsub(paste0("\\{", "collaborator", "\\}"), `collaborator`, urlPath)
      }

      resp <- self$apiClient$callApi(url = paste0(self$apiClient$basePath, urlPath),
                                 method = "DELETE",
                                 queryParams = queryParams,
                                 headerParams = headerParams,
                                 body = body,
                                 ...)
      
      if (httr::status_code(resp) >= 200 && httr::status_code(resp) <= 299) {
        # void response, no need to return anything
      } else if (httr::status_code(resp) >= 400 && httr::status_code(resp) <= 499) {
        Response$new("API client error", resp)
      } else if (httr::status_code(resp) >= 500 && httr::status_code(resp) <= 599) {
        Response$new("API server error", resp)
      }

    }
  )
)
