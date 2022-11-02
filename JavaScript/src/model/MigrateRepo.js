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
 * The MigrateRepo model module.
 * @module model/MigrateRepo
 * @version 1.0.2
 */
export class MigrateRepo {
  /**
   * Constructs a new <code>MigrateRepo</code>.
   * @alias module:model/MigrateRepo
   * @class
   * @param cloneAddr {String} Remote Git address (HTTP/HTTPS URL or local path)
   * @param userId {Number} User ID who takes ownership of this repository
   */
  constructor(cloneAddr, userId) {
    this.cloneAddr = cloneAddr;
    this.userId = userId;
  }

  /**
   * Constructs a <code>MigrateRepo</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/MigrateRepo} obj Optional instance to populate.
   * @return {module:model/MigrateRepo} The populated <code>MigrateRepo</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new MigrateRepo();
      if (data.hasOwnProperty('clone_addr'))
        obj.cloneAddr = ApiClient.convertToType(data['clone_addr'], 'String');
      if (data.hasOwnProperty('auth_username'))
        obj.authUsername = ApiClient.convertToType(data['auth_username'], 'String');
      if (data.hasOwnProperty('auth_password'))
        obj.authPassword = ApiClient.convertToType(data['auth_password'], 'String');
      if (data.hasOwnProperty('user_id'))
        obj.userId = ApiClient.convertToType(data['user_id'], 'Number');
      if (data.hasOwnProperty('repo_name'))
        obj.repoName = ApiClient.convertToType(data['repo_name'], 'String');
      if (data.hasOwnProperty('mirror'))
        obj.mirror = ApiClient.convertToType(data['mirror'], 'Boolean');
      if (data.hasOwnProperty('visibility'))
        obj.visibility = ApiClient.convertToType(data['visibility'], 'String');
      if (data.hasOwnProperty('description'))
        obj.description = ApiClient.convertToType(data['description'], 'String');
    }
    return obj;
  }
}

/**
 * Remote Git address (HTTP/HTTPS URL or local path)
 * @member {String} cloneAddr
 */
MigrateRepo.prototype.cloneAddr = undefined;

/**
 * Authorization username
 * @member {String} authUsername
 */
MigrateRepo.prototype.authUsername = undefined;

/**
 * Authorization password
 * @member {String} authPassword
 */
MigrateRepo.prototype.authPassword = undefined;

/**
 * User ID who takes ownership of this repository
 * @member {Number} userId
 */
MigrateRepo.prototype.userId = undefined;

/**
 * Name of the repository
 * @member {String} repoName
 */
MigrateRepo.prototype.repoName = undefined;

/**
 * Repository will be a mirror (connected repository).
 * @member {Boolean} mirror
 * @default false
 */
MigrateRepo.prototype.mirror = false;

/**
 * Allowed values for the <code>visibility</code> property.
 * @enum {String}
 * @readonly
 */
MigrateRepo.VisibilityEnum = {
  /**
   * value: "private"
   * @const
   */
  _private: "private",

  /**
   * value: "public"
   * @const
   */
  _public: "public"
};
/**
 * Repository will be private or public.
 * @member {module:model/MigrateRepo.VisibilityEnum} visibility
 * @default 'false'
 */
MigrateRepo.prototype.visibility = 'false';

/**
 * Description of the repository
 * @member {String} description
 */
MigrateRepo.prototype.description = undefined;

