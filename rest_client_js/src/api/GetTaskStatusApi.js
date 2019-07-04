/**
 * MDES for Merchants
 * The MDES APIs are designed as RPC style stateless web services where each API endpoint represents an operation to be performed.  All request and response payloads are sent in the JSON (JavaScript Object Notation) data-interchange format. Each endpoint in the API specifies the HTTP Method used to access it. All strings in request and response objects are to be UTF-8 encoded.  Each API URI includes the major and minor version of API that it conforms to.  This will allow multiple concurrent versions of the API to be deployed simultaneously.  
 *
 * OpenAPI spec version: 1.2.7
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 *
 * Swagger Codegen version: 2.4.0-SNAPSHOT
 *
 * Do not edit the class manually.
 *
 */

(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD. Register as an anonymous module.
    define(['ApiClient', 'model/ErrorsResponse', 'model/GetTaskStatusRequestSchema', 'model/GetTaskStatusResponseSchema'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('../model/ErrorsResponse'), require('../model/GetTaskStatusRequestSchema'), require('../model/GetTaskStatusResponseSchema'));
  } else {
    // Browser globals (root is window)
    if (!root.MdesForMerchants) {
      root.MdesForMerchants = {};
    }
    root.MdesForMerchants.GetTaskStatusApi = factory(root.MdesForMerchants.ApiClient, root.MdesForMerchants.ErrorsResponse, root.MdesForMerchants.GetTaskStatusRequestSchema, root.MdesForMerchants.GetTaskStatusResponseSchema);
  }
}(this, function(ApiClient, ErrorsResponse, GetTaskStatusRequestSchema, GetTaskStatusResponseSchema) {
  'use strict';

  /**
   * GetTaskStatus service.
   * @module api/GetTaskStatusApi
   * @version 1.2.7
   */

  /**
   * Constructs a new GetTaskStatusApi. 
   * @alias module:api/GetTaskStatusApi
   * @class
   * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
   * default to {@link module:ApiClient#instance} if unspecified.
   */
  var exports = function(apiClient) {
    this.apiClient = apiClient || ApiClient.instance;


    /**
     * Callback function to receive the result of the getTaskStatus operation.
     * @callback module:api/GetTaskStatusApi~getTaskStatusCallback
     * @param {String} error Error message, if any.
     * @param {module:model/GetTaskStatusResponseSchema} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Used to check the status of any asynchronous task that was previously requested.
     * Used to check the status of any asynchronous task that was previously requested. 
     * @param {Object} opts Optional parameters
     * @param {module:model/GetTaskStatusRequestSchema} opts.getTaskStatusRequestSchema Contains the details of the request message. 
     * @param {module:api/GetTaskStatusApi~getTaskStatusCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/GetTaskStatusResponseSchema}
     */
    this.getTaskStatus = function(opts, callback) {
      opts = opts || {};
      var postBody = opts['getTaskStatusRequestSchema'];


      var pathParams = {
      };
      var queryParams = {
      };
      var collectionQueryParams = {
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = [];
      var contentTypes = ['application/json'];
      var accepts = ['application/json'];
      var returnType = GetTaskStatusResponseSchema;

      return this.apiClient.callApi(
        '/digitization/static/1/0/getTaskStatus', 'POST',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
  };

  return exports;
}));