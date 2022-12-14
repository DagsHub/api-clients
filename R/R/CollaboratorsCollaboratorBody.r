# DagsHub API
#
# This API provides a way to retrive & interact with data about DagsHub repositories, users, issues, webhooks and more. The API is also used by the [DagsHub Direct Data Access streaming client](https://github.com/DagsHub/client) to stream content from a repository for easier and faster training. 
#
# OpenAPI spec version: 1.0.2
# 
# Generated by: https://github.com/swagger-api/swagger-codegen.git

#' CollaboratorsCollaboratorBody Class
#'
#' @field permission 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
CollaboratorsCollaboratorBody <- R6::R6Class(
  'CollaboratorsCollaboratorBody',
  public = list(
    `permission` = NULL,
    initialize = function(`permission`){
      if (!missing(`permission`)) {
        stopifnot(is.character(`permission`), length(`permission`) == 1)
        self$`permission` <- `permission`
      }
    },
    toJSON = function() {
      CollaboratorsCollaboratorBodyObject <- list()
      if (!is.null(self$`permission`)) {
        CollaboratorsCollaboratorBodyObject[['permission']] <- self$`permission`
      }

      CollaboratorsCollaboratorBodyObject
    },
    fromJSON = function(CollaboratorsCollaboratorBodyJson) {
      CollaboratorsCollaboratorBodyObject <- jsonlite::fromJSON(CollaboratorsCollaboratorBodyJson)
      if (!is.null(CollaboratorsCollaboratorBodyObject$`permission`)) {
        self$`permission` <- CollaboratorsCollaboratorBodyObject$`permission`
      }
    },
    toJSONString = function() {
       sprintf(
        '{
           "permission": %s
        }',
        self$`permission`
      )
    },
    fromJSONString = function(CollaboratorsCollaboratorBodyJson) {
      CollaboratorsCollaboratorBodyObject <- jsonlite::fromJSON(CollaboratorsCollaboratorBodyJson)
      self$`permission` <- CollaboratorsCollaboratorBodyObject$`permission`
    }
  )
)
