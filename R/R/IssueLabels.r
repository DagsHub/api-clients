# DagsHub API
#
# This API provides a way to retrive & interact with data about DagsHub repositories, users, issues, webhooks and more. The API is also used by the [DagsHub Direct Data Access streaming client](https://github.com/DagsHub/client) to stream content from a repository for easier and faster training. 
#
# OpenAPI spec version: 1.0.2
# 
# Generated by: https://github.com/swagger-api/swagger-codegen.git

#' IssueLabels Class
#'
#' @field id 
#' @field name 
#' @field color 
#' @field url 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
IssueLabels <- R6::R6Class(
  'IssueLabels',
  public = list(
    `id` = NULL,
    `name` = NULL,
    `color` = NULL,
    `url` = NULL,
    initialize = function(`id`, `name`, `color`, `url`){
      if (!missing(`id`)) {
        stopifnot(is.numeric(`id`), length(`id`) == 1)
        self$`id` <- `id`
      }
      if (!missing(`name`)) {
        stopifnot(is.character(`name`), length(`name`) == 1)
        self$`name` <- `name`
      }
      if (!missing(`color`)) {
        stopifnot(is.character(`color`), length(`color`) == 1)
        self$`color` <- `color`
      }
      if (!missing(`url`)) {
        stopifnot(is.character(`url`), length(`url`) == 1)
        self$`url` <- `url`
      }
    },
    toJSON = function() {
      IssueLabelsObject <- list()
      if (!is.null(self$`id`)) {
        IssueLabelsObject[['id']] <- self$`id`
      }
      if (!is.null(self$`name`)) {
        IssueLabelsObject[['name']] <- self$`name`
      }
      if (!is.null(self$`color`)) {
        IssueLabelsObject[['color']] <- self$`color`
      }
      if (!is.null(self$`url`)) {
        IssueLabelsObject[['url']] <- self$`url`
      }

      IssueLabelsObject
    },
    fromJSON = function(IssueLabelsJson) {
      IssueLabelsObject <- jsonlite::fromJSON(IssueLabelsJson)
      if (!is.null(IssueLabelsObject$`id`)) {
        self$`id` <- IssueLabelsObject$`id`
      }
      if (!is.null(IssueLabelsObject$`name`)) {
        self$`name` <- IssueLabelsObject$`name`
      }
      if (!is.null(IssueLabelsObject$`color`)) {
        self$`color` <- IssueLabelsObject$`color`
      }
      if (!is.null(IssueLabelsObject$`url`)) {
        self$`url` <- IssueLabelsObject$`url`
      }
    },
    toJSONString = function() {
       sprintf(
        '{
           "id": %d,
           "name": %s,
           "color": %s,
           "url": %s
        }',
        self$`id`,
        self$`name`,
        self$`color`,
        self$`url`
      )
    },
    fromJSONString = function(IssueLabelsJson) {
      IssueLabelsObject <- jsonlite::fromJSON(IssueLabelsJson)
      self$`id` <- IssueLabelsObject$`id`
      self$`name` <- IssueLabelsObject$`name`
      self$`color` <- IssueLabelsObject$`color`
      self$`url` <- IssueLabelsObject$`url`
    }
  )
)
