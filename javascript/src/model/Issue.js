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
import {Body} from './Body';
import {IssueAssignee} from './IssueAssignee';
import {IssueLabels} from './IssueLabels';
import {IssueMilestone} from './IssueMilestone';
import {Title} from './Title';
import {User} from './User';

/**
 * The Issue model module.
 * @module model/Issue
 * @version 1.0.0
 */
export class Issue {
  /**
   * Constructs a new <code>Issue</code>.
   * @alias module:model/Issue
   * @class
   * @param title {module:model/Title} 
   * @param body {module:model/Body} 
   * @param labels {Array.<module:model/IssueLabels>} 
   * @param milestone {module:model/IssueMilestone} 
   * @param assignee {module:model/IssueAssignee} 
   * @param closed {Boolean} 
   */
  constructor(title, body, labels, milestone, assignee, closed) {
    this.title = title;
    this.body = body;
    this.labels = labels;
    this.milestone = milestone;
    this.assignee = assignee;
    this.closed = closed;
  }

  /**
   * Constructs a <code>Issue</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/Issue} obj Optional instance to populate.
   * @return {module:model/Issue} The populated <code>Issue</code> instance.
   */
  static constructFromObject(data, obj) {
    if (data) {
      obj = obj || new Issue();
      if (data.hasOwnProperty('id'))
        obj.id = ApiClient.convertToType(data['id'], 'Number');
      if (data.hasOwnProperty('number'))
        obj._number = ApiClient.convertToType(data['number'], 'Number');
      if (data.hasOwnProperty('user'))
        obj.user = User.constructFromObject(data['user']);
      if (data.hasOwnProperty('title'))
        obj.title = Title.constructFromObject(data['title']);
      if (data.hasOwnProperty('body'))
        obj.body = Body.constructFromObject(data['body']);
      if (data.hasOwnProperty('labels'))
        obj.labels = ApiClient.convertToType(data['labels'], [IssueLabels]);
      if (data.hasOwnProperty('milestone'))
        obj.milestone = IssueMilestone.constructFromObject(data['milestone']);
      if (data.hasOwnProperty('assignee'))
        obj.assignee = IssueAssignee.constructFromObject(data['assignee']);
      if (data.hasOwnProperty('state'))
        obj.state = ApiClient.convertToType(data['state'], 'String');
      if (data.hasOwnProperty('comments'))
        obj.comments = ApiClient.convertToType(data['comments'], 'Number');
      if (data.hasOwnProperty('created_at'))
        obj.createdAt = ApiClient.convertToType(data['created_at'], 'String');
      if (data.hasOwnProperty('updated_at'))
        obj.updatedAt = ApiClient.convertToType(data['updated_at'], 'String');
      if (data.hasOwnProperty('pull_request'))
        obj.pullRequest = ApiClient.convertToType(data['pull_request'], Object);
      if (data.hasOwnProperty('closed'))
        obj.closed = ApiClient.convertToType(data['closed'], 'Boolean');
    }
    return obj;
  }
}

/**
 * @member {Number} id
 */
Issue.prototype.id = undefined;

/**
 * @member {Number} _number
 */
Issue.prototype._number = undefined;

/**
 * @member {module:model/User} user
 */
Issue.prototype.user = undefined;

/**
 * @member {module:model/Title} title
 */
Issue.prototype.title = undefined;

/**
 * @member {module:model/Body} body
 */
Issue.prototype.body = undefined;

/**
 * @member {Array.<module:model/IssueLabels>} labels
 */
Issue.prototype.labels = undefined;

/**
 * @member {module:model/IssueMilestone} milestone
 */
Issue.prototype.milestone = undefined;

/**
 * @member {module:model/IssueAssignee} assignee
 */
Issue.prototype.assignee = undefined;

/**
 * @member {String} state
 */
Issue.prototype.state = undefined;

/**
 * @member {Number} comments
 */
Issue.prototype.comments = undefined;

/**
 * @member {String} createdAt
 */
Issue.prototype.createdAt = undefined;

/**
 * @member {String} updatedAt
 */
Issue.prototype.updatedAt = undefined;

/**
 * @member {Object} pullRequest
 */
Issue.prototype.pullRequest = undefined;

/**
 * @member {Boolean} closed
 */
Issue.prototype.closed = undefined;
