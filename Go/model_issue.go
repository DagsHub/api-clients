/*
 * DagsHub API
 *
 * This API provides a way to retrive & interact with data about DagsHub repositories, users, issues, webhooks and more. The API is also used by the [DagsHub Direct Data Access streaming client](https://github.com/DagsHub/client) to stream content from a repository for easier and faster training. 
 *
 * API version: 1.0.2
 * Generated by: Swagger Codegen (https://github.com/swagger-api/swagger-codegen.git)
 */
package dagshub_api

type Issue struct {
	Id int32 `json:"id,omitempty"`
	Number int32 `json:"number,omitempty"`
	User *ComponentsschemasUserYaml `json:"user,omitempty"`
	Title *ComponentsschemasTitleYaml `json:"title"`
	Body *ComponentsschemasBodyYaml `json:"body"`
	Labels []interface{} `json:"labels"`
	Milestone *interface{} `json:"milestone"`
	Assignee *interface{} `json:"assignee"`
	State string `json:"state,omitempty"`
	Comments int32 `json:"comments,omitempty"`
	CreatedAt string `json:"created_at,omitempty"`
	UpdatedAt string `json:"updated_at,omitempty"`
	PullRequest *interface{} `json:"pull_request,omitempty"`
	Closed bool `json:"closed"`
}
