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
    define(['ApiClient'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'));
  } else {
    // Browser globals (root is window)
    if (!root.MdesForMerchants) {
      root.MdesForMerchants = {};
    }
    root.MdesForMerchants.TokenForLCM = factory(root.MdesForMerchants.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';




  /**
   * The TokenForLCM model module.
   * @module model/TokenForLCM
   * @version 1.2.7
   */

  /**
   * Constructs a new <code>TokenForLCM</code>.
   * @alias module:model/TokenForLCM
   * @class
   */
  var exports = function() {
    var _this = this;





  };

  /**
   * Constructs a <code>TokenForLCM</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/TokenForLCM} obj Optional instance to populate.
   * @return {module:model/TokenForLCM} The populated <code>TokenForLCM</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();

      if (data.hasOwnProperty('tokenUniqueReference')) {
        obj['tokenUniqueReference'] = ApiClient.convertToType(data['tokenUniqueReference'], 'String');
      }
      if (data.hasOwnProperty('status')) {
        obj['status'] = ApiClient.convertToType(data['status'], 'String');
      }
      if (data.hasOwnProperty('suspendedBy')) {
        obj['suspendedBy'] = ApiClient.convertToType(data['suspendedBy'], ['String']);
      }
      if (data.hasOwnProperty('statusTimestamp')) {
        obj['statusTimestamp'] = ApiClient.convertToType(data['statusTimestamp'], 'String');
      }
    }
    return obj;
  }

  /**
   * The unique reference allocated to the Token which is always present even if an error occurs. <br>      __Max Length:64__ 
   * @member {String} tokenUniqueReference
   */
  exports.prototype['tokenUniqueReference'] = undefined;
  /**
   * The current status of Token. Must be either:    * 'INACTIVE' (Token has not yet been activated)  * 'ACTIVE' (Token is active and ready to transact)  * 'SUSPENDED' (Token is suspended and unable to transact)  * 'DEACTIVATED' (Token has been permanently deactivated).<br>      __Max Length:32__ 
   * @member {String} status
   */
  exports.prototype['status'] = undefined;
  /**
   * (CONDITIONAL only supplied if status is SUSPENDED) Who or what caused the Token to be suspended One or more values of:     * ISSUER - Suspended by the Issuer.    * TOKEN_REQUESTOR - Suspended by the Token Requestor     * MOBILE_PIN_LOCKED - Suspended due to the Mobile PIN being locked    * CARDHOLDER - Suspended by the Cardholder <br>          __Max Length__: N/A     
   * @member {Array.<String>} suspendedBy
   */
  exports.prototype['suspendedBy'] = undefined;
  /**
   * The date and time the token status was last updated. Expressed in ISO 8601 extended format as one of the following:     * YYYY-MM-DDThh:mm:ss[.sss]Z    * YYYY-MM-DDThh:mm:ss[.sss]�hh:mm    * Where [.sss] is optional and can be 1 to 3 digits. <br>  __Max Length:29__ 
   * @member {String} statusTimestamp
   */
  exports.prototype['statusTimestamp'] = undefined;



  return exports;
}));

