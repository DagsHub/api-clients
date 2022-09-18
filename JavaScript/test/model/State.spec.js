/*
 * DagsHub API
 * The api docs are made with SwaggerUI using the OpenAPI 3 specification. 
 *
 * OpenAPI spec version: 0.1.0
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
    describe('State', function() {
      beforeEach(function() {
        instance = DagsHubApi.State;
      });

      it('should create an instance of State', function() {
        // TODO: update the code to test State
        expect(instance).to.be.a('object');
      });

      it('should have the property open', function() {
        expect(instance).to.have.property('open');
        expect(instance.open).to.be("open");
      });

      it('should have the property closed', function() {
        expect(instance).to.have.property('closed');
        expect(instance.closed).to.be("closed");
      });

    });
  });

}));
