# DagsHub API
#
# This API provides a way to retrive & interact with data about DagsHub repositories, users, issues, webhooks and more. The API is also used by the [DagsHub Direct Data Access streaming client](https://github.com/DagsHub/client) to stream content from a repository for easier and faster training. 
#
# OpenAPI spec version: 1.0.2
# 
# Generated by: https://github.com/swagger-api/swagger-codegen.git
#' @title User operations
#' @description dagshub_api.User
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
#' get_authenticated_user Get authenticated user information
#'
#'
#' get_user Get information about a user
#'
#' }
#'
#' @export
UserApi <- R6::R6Class(
  'UserApi',
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
    get_authenticated_user = function(...){
      args <- list(...)
      queryParams <- list()
      headerParams <- character()

      urlPath <- "/user"
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
    get_user = function(username, ...){
      args <- list(...)
      queryParams <- list()
      headerParams <- character()

      urlPath <- "/users/{username}"
      if (!missing(`username`)) {
        urlPath <- gsub(paste0("\\{", "username", "\\}"), `username`, urlPath)
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
  )
)
