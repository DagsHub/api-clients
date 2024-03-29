# DagsHub API
#
# This API provides a way to retrive & interact with data about DagsHub repositories, users, issues, webhooks and more. The API is also used by the [DagsHub Direct Data Access streaming client](https://github.com/DagsHub/client) to stream content from a repository for easier and faster training. 
#
# OpenAPI spec version: 1.0.2
# 
# Generated by: https://github.com/swagger-api/swagger-codegen.git

#' IntegrationInner Class
#'
#' @field name 
#' @field protocol 
#' @field list_path 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
IntegrationInner <- R6::R6Class(
  'IntegrationInner',
  public = list(
    `name` = NULL,
    `protocol` = NULL,
    `list_path` = NULL,
    initialize = function(`name`, `protocol`, `list_path`){
      if (!missing(`name`)) {
        stopifnot(is.character(`name`), length(`name`) == 1)
        self$`name` <- `name`
      }
      if (!missing(`protocol`)) {
        stopifnot(is.character(`protocol`), length(`protocol`) == 1)
        self$`protocol` <- `protocol`
      }
      if (!missing(`list_path`)) {
        stopifnot(is.character(`list_path`), length(`list_path`) == 1)
        self$`list_path` <- `list_path`
      }
    },
    toJSON = function() {
      IntegrationInnerObject <- list()
      if (!is.null(self$`name`)) {
        IntegrationInnerObject[['name']] <- self$`name`
      }
      if (!is.null(self$`protocol`)) {
        IntegrationInnerObject[['protocol']] <- self$`protocol`
      }
      if (!is.null(self$`list_path`)) {
        IntegrationInnerObject[['list_path']] <- self$`list_path`
      }

      IntegrationInnerObject
    },
    fromJSON = function(IntegrationInnerJson) {
      IntegrationInnerObject <- jsonlite::fromJSON(IntegrationInnerJson)
      if (!is.null(IntegrationInnerObject$`name`)) {
        self$`name` <- IntegrationInnerObject$`name`
      }
      if (!is.null(IntegrationInnerObject$`protocol`)) {
        self$`protocol` <- IntegrationInnerObject$`protocol`
      }
      if (!is.null(IntegrationInnerObject$`list_path`)) {
        self$`list_path` <- IntegrationInnerObject$`list_path`
      }
    },
    toJSONString = function() {
       sprintf(
        '{
           "name": %s,
           "protocol": %s,
           "list_path": %s
        }',
        self$`name`,
        self$`protocol`,
        self$`list_path`
      )
    },
    fromJSONString = function(IntegrationInnerJson) {
      IntegrationInnerObject <- jsonlite::fromJSON(IntegrationInnerJson)
      self$`name` <- IntegrationInnerObject$`name`
      self$`protocol` <- IntegrationInnerObject$`protocol`
      self$`list_path` <- IntegrationInnerObject$`list_path`
    }
  )
)
