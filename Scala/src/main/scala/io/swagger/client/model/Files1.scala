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
package io.swagger.client.model

import java.io.File

/**
 * @param entries 
 * @param limit 
 * @param nextToken 
 */
case class Files1 (
  entries: Option[List[File]] = None,
  limit: Option[Integer] = None,
  nextToken: Option[String] = None
)

