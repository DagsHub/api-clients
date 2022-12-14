/*
 * DagsHub API
 * The api docs are made with SwaggerUI using the OpenAPI 3 specification. 
 *
 * OpenAPI spec version: 1.0.1
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
import {Assignee} from './Assignee';
import {Body} from './Body';
import {Closed} from './Closed';
import {Labels} from './Labels';
import {Milestone} from './Milestone';
import {Title} from './Title';

/**
 * The PostIssue model module.
 * @module model/PostIssue
 * @version 1.0.1
 */
export class PostIssue {
  /**
   * Constructs a new <code>PostIssue</code>.
   * @alias module:model/PostIssue
   * @class
   */
  constructor() {
  }

  /**
   * Constructs a <code>PostIssue</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/PostIssue} obj Optional instance to populate.
   * @return {module:model/PostIssue} The populated <code>PostIssue</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new PostIssue();
      if (data.hasOwnProperty('title'))
        obj.title = Title.constructFromObject(data['title']);
      if (data.hasOwnProperty('body'))
        obj.body = Body.constructFromObject(data['body']);
      if (data.hasOwnProperty('assignee'))
        obj.assignee = Assignee.constructFromObject(data['assignee']);
      if (data.hasOwnProperty('milestone'))
        obj.milestone = Milestone.constructFromObject(data['milestone']);
      if (data.hasOwnProperty('labels'))
        obj.labels = Labels.constructFromObject(data['labels']);
      if (data.hasOwnProperty('closed'))
        obj.closed = Closed.constructFromObject(data['closed']);
    }
    return obj;
  }
}

/**
 * @member {module:model/Title} title
 */
PostIssue.prototype.title = undefined;

/**
 * @member {module:model/Body} body
 */
PostIssue.prototype.body = undefined;

/**
 * @member {module:model/Assignee} assignee
 */
PostIssue.prototype.assignee = undefined;

/**
 * @member {module:model/Milestone} milestone
 */
PostIssue.prototype.milestone = undefined;

/**
 * @member {module:model/Labels} labels
 */
PostIssue.prototype.labels = undefined;

/**
 * @member {module:model/Closed} closed
 */
PostIssue.prototype.closed = undefined;

