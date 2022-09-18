/**
 * DagsHub API
 * The api docs are made with SwaggerUI using the OpenAPI 3 specification. 
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */
package io.swagger.client.models


/**
 * Key/value pairs to provide settings for this hook
 * @param url A string defining the URL to which the payloads will be delivered.
 * @param contentType A string defining the media type used to serialize the payloads.
 * @param secret An optional string that's passed with the HTTP requests body.
 */
data class WebhookConfig (

    /* A string defining the URL to which the payloads will be delivered. */
    val url: kotlin.String,
    /* A string defining the media type used to serialize the payloads. */
    val contentType: WebhookConfig.ContentType,
    /* An optional string that's passed with the HTTP requests body. */
    val secret: kotlin.String? = null
) {
    /**
    * A string defining the media type used to serialize the payloads.
    * Values: JSON,FORM
    */
    enum class ContentType(val value: kotlin.String){
        JSON("json"),
        FORM("form");
    }
}