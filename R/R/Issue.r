# DagsHub API
#
# This API provides a way to retrive & interact with data about DagsHub repositories, users, issues, webhooks and more. The API is also used by the [DagsHub Direct Data Access streaming client](https://github.com/DagsHub/client) to stream content from a repository for easier and faster training. 
#
# OpenAPI spec version: 1.0.2
# 
# Generated by: https://github.com/swagger-api/swagger-codegen.git

#' Issue Class
#'
#' @field id 
#' @field number 
#' @field user 
#' @field title 
#' @field body 
#' @field labels 
#' @field milestone 
#' @field assignee 
#' @field state 
#' @field comments 
#' @field created_at 
#' @field updated_at 
#' @field pull_request 
#' @field closed 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
Issue <- R6::R6Class(
  'Issue',
  public = list(
    `id` = NULL,
    `number` = NULL,
    `user` = NULL,
    `title` = NULL,
    `body` = NULL,
    `labels` = NULL,
    `milestone` = NULL,
    `assignee` = NULL,
    `state` = NULL,
    `comments` = NULL,
    `created_at` = NULL,
    `updated_at` = NULL,
    `pull_request` = NULL,
    `closed` = NULL,
    initialize = function(`id`, `number`, `user`, `title`, `body`, `labels`, `milestone`, `assignee`, `state`, `comments`, `created_at`, `updated_at`, `pull_request`, `closed`){
      if (!missing(`id`)) {
        stopifnot(is.numeric(`id`), length(`id`) == 1)
        self$`id` <- `id`
      }
      if (!missing(`number`)) {
        stopifnot(is.numeric(`number`), length(`number`) == 1)
        self$`number` <- `number`
      }
      if (!missing(`user`)) {
        stopifnot(R6::is.R6(`user`))
        self$`user` <- `user`
      }
      if (!missing(`title`)) {
        stopifnot(R6::is.R6(`title`))
        self$`title` <- `title`
      }
      if (!missing(`body`)) {
        stopifnot(R6::is.R6(`body`))
        self$`body` <- `body`
      }
      if (!missing(`labels`)) {
        stopifnot(is.list(`labels`), length(`labels`) != 0)
        lapply(`labels`, function(x) stopifnot(R6::is.R6(x)))
        self$`labels` <- `labels`
      }
      if (!missing(`milestone`)) {
        stopifnot(R6::is.R6(`milestone`))
        self$`milestone` <- `milestone`
      }
      if (!missing(`assignee`)) {
        stopifnot(R6::is.R6(`assignee`))
        self$`assignee` <- `assignee`
      }
      if (!missing(`state`)) {
        stopifnot(is.character(`state`), length(`state`) == 1)
        self$`state` <- `state`
      }
      if (!missing(`comments`)) {
        stopifnot(is.numeric(`comments`), length(`comments`) == 1)
        self$`comments` <- `comments`
      }
      if (!missing(`created_at`)) {
        stopifnot(is.character(`created_at`), length(`created_at`) == 1)
        self$`created_at` <- `created_at`
      }
      if (!missing(`updated_at`)) {
        stopifnot(is.character(`updated_at`), length(`updated_at`) == 1)
        self$`updated_at` <- `updated_at`
      }
      if (!missing(`pull_request`)) {
        stopifnot(R6::is.R6(`pull_request`))
        self$`pull_request` <- `pull_request`
      }
      if (!missing(`closed`)) {
        self$`closed` <- `closed`
      }
    },
    toJSON = function() {
      IssueObject <- list()
      if (!is.null(self$`id`)) {
        IssueObject[['id']] <- self$`id`
      }
      if (!is.null(self$`number`)) {
        IssueObject[['number']] <- self$`number`
      }
      if (!is.null(self$`user`)) {
        IssueObject[['user']] <- self$`user`$toJSON()
      }
      if (!is.null(self$`title`)) {
        IssueObject[['title']] <- self$`title`$toJSON()
      }
      if (!is.null(self$`body`)) {
        IssueObject[['body']] <- self$`body`$toJSON()
      }
      if (!is.null(self$`labels`)) {
        IssueObject[['labels']] <- lapply(self$`labels`, function(x) x$toJSON())
      }
      if (!is.null(self$`milestone`)) {
        IssueObject[['milestone']] <- self$`milestone`$toJSON()
      }
      if (!is.null(self$`assignee`)) {
        IssueObject[['assignee']] <- self$`assignee`$toJSON()
      }
      if (!is.null(self$`state`)) {
        IssueObject[['state']] <- self$`state`
      }
      if (!is.null(self$`comments`)) {
        IssueObject[['comments']] <- self$`comments`
      }
      if (!is.null(self$`created_at`)) {
        IssueObject[['created_at']] <- self$`created_at`
      }
      if (!is.null(self$`updated_at`)) {
        IssueObject[['updated_at']] <- self$`updated_at`
      }
      if (!is.null(self$`pull_request`)) {
        IssueObject[['pull_request']] <- self$`pull_request`$toJSON()
      }
      if (!is.null(self$`closed`)) {
        IssueObject[['closed']] <- self$`closed`
      }

      IssueObject
    },
    fromJSON = function(IssueJson) {
      IssueObject <- jsonlite::fromJSON(IssueJson)
      if (!is.null(IssueObject$`id`)) {
        self$`id` <- IssueObject$`id`
      }
      if (!is.null(IssueObject$`number`)) {
        self$`number` <- IssueObject$`number`
      }
      if (!is.null(IssueObject$`user`)) {
        userObject <- ComponentsschemasUserYaml$new()
        userObject$fromJSON(jsonlite::toJSON(IssueObject$user, auto_unbox = TRUE))
        self$`user` <- userObject
      }
      if (!is.null(IssueObject$`title`)) {
        titleObject <- ComponentsschemasTitleYaml$new()
        titleObject$fromJSON(jsonlite::toJSON(IssueObject$title, auto_unbox = TRUE))
        self$`title` <- titleObject
      }
      if (!is.null(IssueObject$`body`)) {
        bodyObject <- ComponentsschemasBodyYaml$new()
        bodyObject$fromJSON(jsonlite::toJSON(IssueObject$body, auto_unbox = TRUE))
        self$`body` <- bodyObject
      }
      if (!is.null(IssueObject$`labels`)) {
        self$`labels` <- lapply(IssueObject$`labels`, function(x) {
          labelsObject <- TODO_OBJECT_MAPPING$new()
          labelsObject$fromJSON(jsonlite::toJSON(x, auto_unbox = TRUE))
          labelsObject
        })
      }
      if (!is.null(IssueObject$`milestone`)) {
        milestoneObject <- TODO_OBJECT_MAPPING$new()
        milestoneObject$fromJSON(jsonlite::toJSON(IssueObject$milestone, auto_unbox = TRUE))
        self$`milestone` <- milestoneObject
      }
      if (!is.null(IssueObject$`assignee`)) {
        assigneeObject <- TODO_OBJECT_MAPPING$new()
        assigneeObject$fromJSON(jsonlite::toJSON(IssueObject$assignee, auto_unbox = TRUE))
        self$`assignee` <- assigneeObject
      }
      if (!is.null(IssueObject$`state`)) {
        self$`state` <- IssueObject$`state`
      }
      if (!is.null(IssueObject$`comments`)) {
        self$`comments` <- IssueObject$`comments`
      }
      if (!is.null(IssueObject$`created_at`)) {
        self$`created_at` <- IssueObject$`created_at`
      }
      if (!is.null(IssueObject$`updated_at`)) {
        self$`updated_at` <- IssueObject$`updated_at`
      }
      if (!is.null(IssueObject$`pull_request`)) {
        pull_requestObject <- TODO_OBJECT_MAPPING$new()
        pull_requestObject$fromJSON(jsonlite::toJSON(IssueObject$pull_request, auto_unbox = TRUE))
        self$`pull_request` <- pull_requestObject
      }
      if (!is.null(IssueObject$`closed`)) {
        self$`closed` <- IssueObject$`closed`
      }
    },
    toJSONString = function() {
       sprintf(
        '{
           "id": %d,
           "number": %d,
           "user": %s,
           "title": %s,
           "body": %s,
           "labels": [%s],
           "milestone": %s,
           "assignee": %s,
           "state": %s,
           "comments": %d,
           "created_at": %s,
           "updated_at": %s,
           "pull_request": %s,
           "closed": %s
        }',
        self$`id`,
        self$`number`,
        self$`user`$toJSON(),
        self$`title`$toJSON(),
        self$`body`$toJSON(),
        lapply(self$`labels`, function(x) paste(x$toJSON(), sep=",")),
        self$`milestone`$toJSON(),
        self$`assignee`$toJSON(),
        self$`state`,
        self$`comments`,
        self$`created_at`,
        self$`updated_at`,
        self$`pull_request`$toJSON(),
        self$`closed`
      )
    },
    fromJSONString = function(IssueJson) {
      IssueObject <- jsonlite::fromJSON(IssueJson)
      self$`id` <- IssueObject$`id`
      self$`number` <- IssueObject$`number`
      ComponentsschemasUserYamlObject <- ComponentsschemasUserYaml$new()
      self$`user` <- ComponentsschemasUserYamlObject$fromJSON(jsonlite::toJSON(IssueObject$user, auto_unbox = TRUE))
      ComponentsschemasTitleYamlObject <- ComponentsschemasTitleYaml$new()
      self$`title` <- ComponentsschemasTitleYamlObject$fromJSON(jsonlite::toJSON(IssueObject$title, auto_unbox = TRUE))
      ComponentsschemasBodyYamlObject <- ComponentsschemasBodyYaml$new()
      self$`body` <- ComponentsschemasBodyYamlObject$fromJSON(jsonlite::toJSON(IssueObject$body, auto_unbox = TRUE))
      self$`labels` <- lapply(IssueObject$`labels`, function(x) TODO_OBJECT_MAPPING$new()$fromJSON(jsonlite::toJSON(x, auto_unbox = TRUE)))
      TODO_OBJECT_MAPPINGObject <- TODO_OBJECT_MAPPING$new()
      self$`milestone` <- TODO_OBJECT_MAPPINGObject$fromJSON(jsonlite::toJSON(IssueObject$milestone, auto_unbox = TRUE))
      TODO_OBJECT_MAPPINGObject <- TODO_OBJECT_MAPPING$new()
      self$`assignee` <- TODO_OBJECT_MAPPINGObject$fromJSON(jsonlite::toJSON(IssueObject$assignee, auto_unbox = TRUE))
      self$`state` <- IssueObject$`state`
      self$`comments` <- IssueObject$`comments`
      self$`created_at` <- IssueObject$`created_at`
      self$`updated_at` <- IssueObject$`updated_at`
      TODO_OBJECT_MAPPINGObject <- TODO_OBJECT_MAPPING$new()
      self$`pull_request` <- TODO_OBJECT_MAPPINGObject$fromJSON(jsonlite::toJSON(IssueObject$pull_request, auto_unbox = TRUE))
      self$`closed` <- IssueObject$`closed`
    }
  )
)
