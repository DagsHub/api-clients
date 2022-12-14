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
    describe('RepoHooksBody', function() {
      beforeEach(function() {
        instance = new DagsHubApi.RepoHooksBody();
      });

      it('should create an instance of RepoHooksBody', function() {
        // TODO: update the code to test RepoHooksBody
        expect(instance).to.be.a(DagsHubApi.RepoHooksBody);
      });

      it('should have the property type (base name: "type")', function() {
        // TODO: update the code to test the property type
        expect(instance).to.have.property('type');
        // expect(instance.type).to.be(expectedValueLiteral);
      });

      it('should have the property config (base name: "config")', function() {
        // TODO: update the code to test the property config
        expect(instance).to.have.property('config');
        // expect(instance.config).to.be(expectedValueLiteral);
      });

      it('should have the property events (base name: "events")', function() {
        // TODO: update the code to test the property events
        expect(instance).to.have.property('events');
        // expect(instance.events).to.be(expectedValueLiteral);
      });

    });
  });

}));
