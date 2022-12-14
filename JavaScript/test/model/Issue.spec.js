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
(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD.
    define(['expect.js', '../../src/index'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    factory(require('expect.js'), require('../../src/index'));
  } else {
    // Browser globals (root is window)
    factory(root.expect, root.DagsHubApi);
  }
}(this, function(expect, DagsHubApi) {
  'use strict';

  var instance;

  describe('(package)', function() {
    describe('Issue', function() {
      beforeEach(function() {
        instance = new DagsHubApi.Issue();
      });

      it('should create an instance of Issue', function() {
        // TODO: update the code to test Issue
        expect(instance).to.be.a(DagsHubApi.Issue);
      });

      it('should have the property id (base name: "id")', function() {
        // TODO: update the code to test the property id
        expect(instance).to.have.property('id');
        // expect(instance.id).to.be(expectedValueLiteral);
      });

      it('should have the property _number (base name: "number")', function() {
        // TODO: update the code to test the property _number
        expect(instance).to.have.property('_number');
        // expect(instance._number).to.be(expectedValueLiteral);
      });

      it('should have the property user (base name: "user")', function() {
        // TODO: update the code to test the property user
        expect(instance).to.have.property('user');
        // expect(instance.user).to.be(expectedValueLiteral);
      });

      it('should have the property title (base name: "title")', function() {
        // TODO: update the code to test the property title
        expect(instance).to.have.property('title');
        // expect(instance.title).to.be(expectedValueLiteral);
      });

      it('should have the property body (base name: "body")', function() {
        // TODO: update the code to test the property body
        expect(instance).to.have.property('body');
        // expect(instance.body).to.be(expectedValueLiteral);
      });

      it('should have the property labels (base name: "labels")', function() {
        // TODO: update the code to test the property labels
        expect(instance).to.have.property('labels');
        // expect(instance.labels).to.be(expectedValueLiteral);
      });

      it('should have the property milestone (base name: "milestone")', function() {
        // TODO: update the code to test the property milestone
        expect(instance).to.have.property('milestone');
        // expect(instance.milestone).to.be(expectedValueLiteral);
      });

      it('should have the property assignee (base name: "assignee")', function() {
        // TODO: update the code to test the property assignee
        expect(instance).to.have.property('assignee');
        // expect(instance.assignee).to.be(expectedValueLiteral);
      });

      it('should have the property state (base name: "state")', function() {
        // TODO: update the code to test the property state
        expect(instance).to.have.property('state');
        // expect(instance.state).to.be(expectedValueLiteral);
      });

      it('should have the property comments (base name: "comments")', function() {
        // TODO: update the code to test the property comments
        expect(instance).to.have.property('comments');
        // expect(instance.comments).to.be(expectedValueLiteral);
      });

      it('should have the property createdAt (base name: "created_at")', function() {
        // TODO: update the code to test the property createdAt
        expect(instance).to.have.property('createdAt');
        // expect(instance.createdAt).to.be(expectedValueLiteral);
      });

      it('should have the property updatedAt (base name: "updated_at")', function() {
        // TODO: update the code to test the property updatedAt
        expect(instance).to.have.property('updatedAt');
        // expect(instance.updatedAt).to.be(expectedValueLiteral);
      });

      it('should have the property pullRequest (base name: "pull_request")', function() {
        // TODO: update the code to test the property pullRequest
        expect(instance).to.have.property('pullRequest');
        // expect(instance.pullRequest).to.be(expectedValueLiteral);
      });

      it('should have the property closed (base name: "closed")', function() {
        // TODO: update the code to test the property closed
        expect(instance).to.have.property('closed');
        // expect(instance.closed).to.be(expectedValueLiteral);
      });

    });
  });

}));
