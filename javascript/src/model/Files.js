/*
 * DagsHub API
 * This API is used to interact with DagsHub. 
 *
 * OpenAPI spec version: 1.0.0
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
 * The Files model module.
 * @module model/Files
 * @version 1.0.0
 */
export class Files extends Array {
  /**
   * Constructs a new <code>Files</code>.
   * @alias module:model/Files
   * @class
   * @extends Array
   */
  constructor() {
    super();
  }

  /**
   * Constructs a <code>Files</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/Files} obj Optional instance to populate.
   * @return {module:model/Files} The populated <code>Files</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new Files();
      ApiClient.constructFromObject(data, obj, 'File');
    }
    return obj;
  }
}