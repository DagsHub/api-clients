# DagsHub API
#
# The api docs are made with SwaggerUI using the OpenAPI 3 specification. 
#
# OpenAPI spec version: 0.1.0
# 
# Generated by: https://github.com/swagger-api/swagger-codegen.git
#' @title Content operations
#' @description dagshub_api.Content
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
#' get_archive Download archive
#'
#'
#' get_raw Download raw content
#'
#' }
#'
#' @export
ContentApi <- R6::R6Class(
  'ContentApi',
  public = list(
    userAgent = "Swagger-Codegen/1.0.0/r",
    apiClient = NULL,
    initialize = function(apiClient){
      if (!missing(apiClient)) {
        self$apiClient <- apiClient
      }
      else {
        self$apiClient <- ApiClient$new()
      }
    },
    get_archive = function(username, repo, ref, format, ...){
      args <- list(...)
      queryParams <- list()
      headerParams <- character()

      urlPath <- "/repos/{username}/{repo}/archive/{ref}/{format}"
      if (!missing(`username`)) {
        urlPath <- gsub(paste0("\\{", "username", "\\}"), `username`, urlPath)
      }

      if (!missing(`repo`)) {
        urlPath <- gsub(paste0("\\{", "repo", "\\}"), `repo`, urlPath)
      }

      if (!missing(`ref`)) {
        urlPath <- gsub(paste0("\\{", "ref", "\\}"), `ref`, urlPath)
      }

      if (!missing(`format`)) {
        urlPath <- gsub(paste0("\\{", "format", "\\}"), `format`, urlPath)
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
    get_raw = function(username, repo, ref, path, ...){
      args <- list(...)
      queryParams <- list()
      headerParams <- character()

      urlPath <- "/repos/{username}/{repo}/raw/{ref}/{path}"
      if (!missing(`username`)) {
        urlPath <- gsub(paste0("\\{", "username", "\\}"), `username`, urlPath)
      }

      if (!missing(`repo`)) {
        urlPath <- gsub(paste0("\\{", "repo", "\\}"), `repo`, urlPath)
      }

      if (!missing(`ref`)) {
        urlPath <- gsub(paste0("\\{", "ref", "\\}"), `ref`, urlPath)
      }

      if (!missing(`path`)) {
        urlPath <- gsub(paste0("\\{", "path", "\\}"), `path`, urlPath)
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
