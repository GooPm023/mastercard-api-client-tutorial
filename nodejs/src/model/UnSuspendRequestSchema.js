/**
 * MDES for Merchants
 * The MDES APIs are designed as RPC style stateless web services where each API endpoint represents an operation to be performed.  All request and response payloads are sent in the JSON (JavaScript Object Notation) data-interchange format. Each endpoint in the API specifies the HTTP Method used to access it. All strings in request and response objects are to be UTF-8 encoded.  Each API URI includes the major and minor version of API that it conforms to.  This will allow multiple concurrent versions of the API to be deployed simultaneously. <br> __Authentication__ Mastercard uses OAuth 1.0a with body hash extension for authenticating the API clients. This requires every request that you send to  Mastercard to be signed with an RSA private key. A private-public RSA key pair must be generated consisting of: <br> 1 . A private key for the OAuth signature for API requests. It is recommended to keep the private key in a password-protected or hardware keystore. <br> 2. A public key is shared with Mastercard during the project setup process through either a certificate signing request (CSR) or the API Key Generator. Mastercard will use the public key to verify the OAuth signature that is provided on every API call.<br>  An OAUTH1.0a signer library is available on [GitHub](https://github.com/Mastercard/oauth1-signer-java) <br>  __Encryption__<br>  All communications between Issuer web service and the Mastercard gateway is encrypted using TLS. <br> __Additional Encryption of Sensitive Data__ In addition to the OAuth authentication, when using MDES Digital Enablement Service, any PCI sensitive and all account holder Personally Identifiable Information (PII) data must be encrypted. This requirement applies to the API fields containing encryptedData. Sensitive data is encrypted using a symmetric session (one-time-use) key. The symmetric session key is then wrapped with an RSA Public Key supplied by Mastercard during API setup phase (the Customer Encryption Key). <br>  Java Client Encryption Library available on [GitHub](https://github.com/Mastercard/client-encryption-java) 
 *
 * The version of the OpenAPI document: 1.2.9
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 *
 * OpenAPI Generator version: 4.1.0
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
    root.MdesForMerchants.UnSuspendRequestSchema = factory(root.MdesForMerchants.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';



  /**
   * The UnSuspendRequestSchema model module.
   * @module model/UnSuspendRequestSchema
   * @version 1.2.9
   */

  /**
   * Constructs a new <code>UnSuspendRequestSchema</code>.
   * @alias module:model/UnSuspendRequestSchema
   * @class
   * @param requestId {String} Unique identifier for the request. 
   * @param tokenUniqueReferences {Array.<String>} The specific Token to be unsuspended. Array of more or more valid references as assigned by MDES  
   * @param causedBy {String} Who or what caused the Token to be unsuspended. Must be either the 'CARDHOLDER' (operation requested by the Cardholder) or 'TOKEN_REQUESTOR' (operation requested by the token requestor).     __Max Length:64__ 
   * @param reasonCode {String} The reason for the action to be unsuspended. Must be one of 'SUSPECTED_FRAUD' (suspected fraudulent token transactions), 'OTHER' (Other - default used if value not provided).     __Max Length:64__ 
   */
  var exports = function(requestId, tokenUniqueReferences, causedBy, reasonCode) {
    var _this = this;

    _this['requestId'] = requestId;
    _this['tokenUniqueReferences'] = tokenUniqueReferences;
    _this['causedBy'] = causedBy;
    _this['reasonCode'] = reasonCode;
  };

  /**
   * Constructs a <code>UnSuspendRequestSchema</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/UnSuspendRequestSchema} obj Optional instance to populate.
   * @return {module:model/UnSuspendRequestSchema} The populated <code>UnSuspendRequestSchema</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();
      if (data.hasOwnProperty('responseHost')) {
        obj['responseHost'] = ApiClient.convertToType(data['responseHost'], 'String');
      }
      if (data.hasOwnProperty('requestId')) {
        obj['requestId'] = ApiClient.convertToType(data['requestId'], 'String');
      }
      if (data.hasOwnProperty('paymentAppInstanceId')) {
        obj['paymentAppInstanceId'] = ApiClient.convertToType(data['paymentAppInstanceId'], 'String');
      }
      if (data.hasOwnProperty('tokenUniqueReferences')) {
        obj['tokenUniqueReferences'] = ApiClient.convertToType(data['tokenUniqueReferences'], ['String']);
      }
      if (data.hasOwnProperty('causedBy')) {
        obj['causedBy'] = ApiClient.convertToType(data['causedBy'], 'String');
      }
      if (data.hasOwnProperty('reason')) {
        obj['reason'] = ApiClient.convertToType(data['reason'], 'String');
      }
      if (data.hasOwnProperty('reasonCode')) {
        obj['reasonCode'] = ApiClient.convertToType(data['reasonCode'], 'String');
      }
    }
    return obj;
  }

  /**
   * The host that originated the request. Future calls in the same conversation may be routed to this host. 
   * @member {String} responseHost
   */
  exports.prototype['responseHost'] = undefined;
  /**
   * Unique identifier for the request. 
   * @member {String} requestId
   */
  exports.prototype['requestId'] = undefined;
  /**
   * Identifier for the specific Mobile Payment App instance, unique across a given Wallet Identifier. This value cannot be changed after digitization. This field is alphanumeric and additionally web-safe base64 characters per RFC 4648 (minus \"-\", underscore \"_\") up to a maximum length of 48, = should not be URL encoded. Conditional - not applicable for server based tokens but required otherwise.     __Max Length:48__ 
   * @member {String} paymentAppInstanceId
   */
  exports.prototype['paymentAppInstanceId'] = undefined;
  /**
   * The specific Token to be unsuspended. Array of more or more valid references as assigned by MDES  
   * @member {Array.<String>} tokenUniqueReferences
   */
  exports.prototype['tokenUniqueReferences'] = undefined;
  /**
   * Who or what caused the Token to be unsuspended. Must be either the 'CARDHOLDER' (operation requested by the Cardholder) or 'TOKEN_REQUESTOR' (operation requested by the token requestor).     __Max Length:64__ 
   * @member {String} causedBy
   */
  exports.prototype['causedBy'] = undefined;
  /**
   * Free form reason why the Tokens are being suspended.    __Max Length:256__ 
   * @member {String} reason
   */
  exports.prototype['reason'] = undefined;
  /**
   * The reason for the action to be unsuspended. Must be one of 'SUSPECTED_FRAUD' (suspected fraudulent token transactions), 'OTHER' (Other - default used if value not provided).     __Max Length:64__ 
   * @member {String} reasonCode
   */
  exports.prototype['reasonCode'] = undefined;



  return exports;
}));


