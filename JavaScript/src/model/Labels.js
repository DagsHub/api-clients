/*
 * DagsHub API
 * This API provides a way to retrive & interact with data about DagsHub repositories, users, issues, webhooks and more. The API is also used by the [DagsHub Direct Data Access streaming client](https://github.com/DagsHub/client) to stream content from a repository for easier and faster training. 
 *
 * OpenAPI spec version: 1.0.2
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 *
 * Swagger Codegen version: 3.0.35
 *
 * Do not edit the class manually.
 *
 */
import {ApiClient} from '../ApiClient';

/**
 * The Labels model module.
 * @module model/Labels
 * @version 1.0.2
 */
export class Labels extends Array {
  /**
   * Constructs a new <code>Labels</code>.
   * Labels **ID** to associate with this issue.   **Note:** Only users with write access can set labels for new issues.  Labels are silently dropped otherwise.
   * @alias module:model/Labels
   * @class
   * @extends Array
   */
  constructor() {
    super();
  }

  /**
   * Constructs a <code>Labels</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/Labels} obj Optional instance to populate.
   * @return {module:model/Labels} The populated <code>Labels</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new Labels();
      ApiClient.constructFromObject(data, obj, 'Number');
    }
    return obj;
  }
}
