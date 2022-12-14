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


/**
 * @param cloneAddr Remote Git address (HTTP/HTTPS URL or local path)
 * @param authUsername Authorization username
 * @param authPassword Authorization password
 * @param userId User ID who takes ownership of this repository
 * @param repoName Name of the repository for example: '''repo-name'''
 * @param mirror Repository will be a mirror (connected repository).
 * @param visibility Repository will be private or public.
 * @param description Description of the repository for example: '''This is a repository'''
 */
case class MigrateRepo (
  cloneAddr: String,
  authUsername: Option[String] = None,
  authPassword: Option[String] = None,
  userId: Integer,
  repoName: Option[String] = None,
  mirror: Option[Boolean] = None,
  visibility: Option[String] = None,
  description: Option[String] = None
)

