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
    describe('CreateRepo', function() {
      beforeEach(function() {
        instance = new DagsHubApi.CreateRepo();
      });

      it('should create an instance of CreateRepo', function() {
        // TODO: update the code to test CreateRepo
        expect(instance).to.be.a(DagsHubApi.CreateRepo);
      });

      it('should have the property name (base name: "name")', function() {
        // TODO: update the code to test the property name
        expect(instance).to.have.property('name');
        // expect(instance.name).to.be(expectedValueLiteral);
      });

      it('should have the property description (base name: "description")', function() {
        // TODO: update the code to test the property description
        expect(instance).to.have.property('description');
        // expect(instance.description).to.be(expectedValueLiteral);
      });

      it('should have the property _private (base name: "private")', function() {
        // TODO: update the code to test the property _private
        expect(instance).to.have.property('_private');
        // expect(instance._private).to.be(expectedValueLiteral);
      });

      it('should have the property autoInit (base name: "auto_init")', function() {
        // TODO: update the code to test the property autoInit
        expect(instance).to.have.property('autoInit');
        // expect(instance.autoInit).to.be(expectedValueLiteral);
      });

      it('should have the property projectTemplate (base name: "project_template")', function() {
        // TODO: update the code to test the property projectTemplate
        expect(instance).to.have.property('projectTemplate');
        // expect(instance.projectTemplate).to.be(expectedValueLiteral);
      });

      it('should have the property gitignores (base name: "gitignores")', function() {
        // TODO: update the code to test the property gitignores
        expect(instance).to.have.property('gitignores');
        // expect(instance.gitignores).to.be(expectedValueLiteral);
      });

      it('should have the property license (base name: "license")', function() {
        // TODO: update the code to test the property license
        expect(instance).to.have.property('license');
        // expect(instance.license).to.be(expectedValueLiteral);
      });

      it('should have the property readme (base name: "readme")', function() {
        // TODO: update the code to test the property readme
        expect(instance).to.have.property('readme');
        // expect(instance.readme).to.be(expectedValueLiteral);
      });

    });
  });

}));
