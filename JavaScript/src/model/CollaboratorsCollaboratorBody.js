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
 * The CollaboratorsCollaboratorBody model module.
 * @module model/CollaboratorsCollaboratorBody
 * @version 1.0.2
 */
export class CollaboratorsCollaboratorBody {
  /**
   * Constructs a new <code>CollaboratorsCollaboratorBody</code>.
   * @alias module:model/CollaboratorsCollaboratorBody
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>CollaboratorsCollaboratorBody</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/CollaboratorsCollaboratorBody} obj Optional instance to populate.
   * @return {module:model/CollaboratorsCollaboratorBody} The populated <code>CollaboratorsCollaboratorBody</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new CollaboratorsCollaboratorBody();
      if (data.hasOwnProperty('permission'))
        obj.permission = ApiClient.convertToType(data['permission'], 'String');
    }
    return obj;
  }
}

/**
 * The permission to grant the collaborator. Can be one of **read**, **write** and **admin**.
 * @member {String} permission
 * @default 'write'
 */
CollaboratorsCollaboratorBody.prototype.permission = 'write';

