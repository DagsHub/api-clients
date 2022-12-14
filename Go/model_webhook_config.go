/*
 * DagsHub API
 *
 * This API provides a way to retrive & interact with data about DagsHub repositories, users, issues, webhooks and more. The API is also used by the [DagsHub Direct Data Access streaming client](https://github.com/DagsHub/client) to stream content from a repository for easier and faster training. 
 *
 * API version: 1.0.2
 * Generated by: Swagger Codegen (https://github.com/swagger-api/swagger-codegen.git)
 */
package dagshub_api

// Key/value pairs to provide settings for this hook
type WebhookConfig struct {
	// A string defining the URL to which the payloads will be delivered.
	Url string `json:"url"`
	// A string defining the media type used to serialize the payloads.
	ContentType string `json:"content_type"`
	// An optional string that's passed with the HTTP requests body.
	Secret string `json:"secret,omitempty"`
}
