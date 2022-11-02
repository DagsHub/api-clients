# WebhookConfig

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**url** | [**kotlin.String**](.md) | A string defining the URL to which the payloads will be delivered. | 
**contentType** | [**inline**](#ContentTypeEnum) | A string defining the media type used to serialize the payloads. | 
**secret** | [**kotlin.String**](.md) | An optional string that&#x27;s passed with the HTTP requests body. |  [optional]

<a name="ContentTypeEnum"></a>
## Enum: content_type
Name | Value
---- | -----
contentType | json, form
