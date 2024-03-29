# DagsHub API
#
# This API provides a way to retrive & interact with data about DagsHub repositories, users, issues, webhooks and more. The API is also used by the [DagsHub Direct Data Access streaming client](https://github.com/DagsHub/client) to stream content from a repository for easier and faster training. 
#
# OpenAPI spec version: 1.0.2
# 
# Generated by: https://github.com/swagger-api/swagger-codegen.git

#' Files1 Class
#'
#' @field entries 
#' @field limit 
#' @field next_token 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
Files1 <- R6::R6Class(
  'Files1',
  public = list(
    `entries` = NULL,
    `limit` = NULL,
    `next_token` = NULL,
    initialize = function(`entries`, `limit`, `next_token`){
      if (!missing(`entries`)) {
        stopifnot(is.list(`entries`), length(`entries`) != 0)
        lapply(`entries`, function(x) stopifnot(R6::is.R6(x)))
        self$`entries` <- `entries`
      }
      if (!missing(`limit`)) {
        stopifnot(is.numeric(`limit`), length(`limit`) == 1)
        self$`limit` <- `limit`
      }
      if (!missing(`next_token`)) {
        stopifnot(is.character(`next_token`), length(`next_token`) == 1)
        self$`next_token` <- `next_token`
      }
    },
    toJSON = function() {
      Files1Object <- list()
      if (!is.null(self$`entries`)) {
        Files1Object[['entries']] <- lapply(self$`entries`, function(x) x$toJSON())
      }
      if (!is.null(self$`limit`)) {
        Files1Object[['limit']] <- self$`limit`
      }
      if (!is.null(self$`next_token`)) {
        Files1Object[['next_token']] <- self$`next_token`
      }

      Files1Object
    },
    fromJSON = function(Files1Json) {
      Files1Object <- jsonlite::fromJSON(Files1Json)
      if (!is.null(Files1Object$`entries`)) {
        self$`entries` <- lapply(Files1Object$`entries`, function(x) {
          entriesObject <- File$new()
          entriesObject$fromJSON(jsonlite::toJSON(x, auto_unbox = TRUE))
          entriesObject
        })
      }
      if (!is.null(Files1Object$`limit`)) {
        self$`limit` <- Files1Object$`limit`
      }
      if (!is.null(Files1Object$`next_token`)) {
        self$`next_token` <- Files1Object$`next_token`
      }
    },
    toJSONString = function() {
       sprintf(
        '{
           "entries": [%s],
           "limit": %d,
           "next_token": %s
        }',
        lapply(self$`entries`, function(x) paste(x$toJSON(), sep=",")),
        self$`limit`,
        self$`next_token`
      )
    },
    fromJSONString = function(Files1Json) {
      Files1Object <- jsonlite::fromJSON(Files1Json)
      self$`entries` <- lapply(Files1Object$`entries`, function(x) File$new()$fromJSON(jsonlite::toJSON(x, auto_unbox = TRUE)))
      self$`limit` <- Files1Object$`limit`
      self$`next_token` <- Files1Object$`next_token`
    }
  )
)
