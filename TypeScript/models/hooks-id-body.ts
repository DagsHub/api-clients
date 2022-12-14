/* tslint:disable */
/* eslint-disable */
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
import { WebhookConfig } from './webhook-config';
import { WebhookEvents } from './webhook-events';
/**
 * 
 * @export
 * @interface HooksIdBody
 */
export interface HooksIdBody {
    /**
     * 
     * @type {WebhookConfig}
     * @memberof HooksIdBody
     */
    config?: WebhookConfig;
    /**
     * 
     * @type {WebhookEvents}
     * @memberof HooksIdBody
     */
    events?: WebhookEvents;
    /**
     * Weather the hook is actually triggered on pushes or not. Ignore this field to leave it unchanged.
     * @type {boolean}
     * @memberof HooksIdBody
     */
    active?: boolean;
}
