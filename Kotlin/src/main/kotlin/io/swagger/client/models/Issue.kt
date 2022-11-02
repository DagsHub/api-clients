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
package io.swagger.client.models

import io.swagger.client.models.Body
import io.swagger.client.models.IssueAssignee
import io.swagger.client.models.IssueLabels
import io.swagger.client.models.IssueMilestone
import io.swagger.client.models.Title
import io.swagger.client.models.User

/**
 * 
 * @param id 
 * @param number 
 * @param user 
 * @param title 
 * @param body 
 * @param labels 
 * @param milestone 
 * @param assignee 
 * @param state 
 * @param comments 
 * @param createdAt 
 * @param updatedAt 
 * @param pullRequest 
 * @param closed 
 */
data class Issue (

    val id: kotlin.Int? = null,
    val number: kotlin.Int? = null,
    val user: User? = null,
    val title: Title,
    val body: Body,
    val labels: kotlin.Array<IssueLabels>,
    val milestone: IssueMilestone,
    val assignee: IssueAssignee,
    val state: kotlin.String? = null,
    val comments: kotlin.Int? = null,
    val createdAt: kotlin.String? = null,
    val updatedAt: kotlin.String? = null,
    val pullRequest: kotlin.Any? = null,
    val closed: kotlin.Boolean
) {
}