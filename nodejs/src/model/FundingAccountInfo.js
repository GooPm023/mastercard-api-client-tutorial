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
    define(['ApiClient', 'model/FundingAccountInfoEncryptedPayload'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./FundingAccountInfoEncryptedPayload'));
  } else {
    // Browser globals (root is window)
    if (!root.MdesForMerchants) {
      root.MdesForMerchants = {};
    }
    root.MdesForMerchants.FundingAccountInfo = factory(root.MdesForMerchants.ApiClient, root.MdesForMerchants.FundingAccountInfoEncryptedPayload);
  }
}(this, function(ApiClient, FundingAccountInfoEncryptedPayload) {
  'use strict';



  /**
   * The FundingAccountInfo model module.
   * @module model/FundingAccountInfo
   * @version 1.2.9
   */

  /**
   * Constructs a new <code>FundingAccountInfo</code>.
   * @alias module:model/FundingAccountInfo
   * @class
   */
  var exports = function() {
    var _this = this;

  };

  /**
   * Constructs a <code>FundingAccountInfo</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/FundingAccountInfo} obj Optional instance to populate.
   * @return {module:model/FundingAccountInfo} The populated <code>FundingAccountInfo</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();
      if (data.hasOwnProperty('panUniqueReference')) {
        obj['panUniqueReference'] = ApiClient.convertToType(data['panUniqueReference'], 'String');
      }
      if (data.hasOwnProperty('tokenUniqueReference')) {
        obj['tokenUniqueReference'] = ApiClient.convertToType(data['tokenUniqueReference'], 'String');
      }
      if (data.hasOwnProperty('pushAccountReceipt')) {
        obj['pushAccountReceipt'] = ApiClient.convertToType(data['pushAccountReceipt'], 'String');
      }
      if (data.hasOwnProperty('encryptedPayload')) {
        obj['encryptedPayload'] = FundingAccountInfoEncryptedPayload.constructFromObject(data['encryptedPayload']);
      }
    }
    return obj;
  }

  /**
   *  __(CONDITIONAL)__ <br>  For repeat digitizations, the unique reference allocated to the Primary Account Number. When supplied, the tokenUniqueReferenceForPanInfo, accountNumber, expiryMonth and expiryYear must be omitted from CardInfoData. Only allowed if Only allowed if tokenUniqueReference and pushAccountReceipt are not present and encrypted data does not contain the account information. <br> __Max Length:64__ 
   * @member {String} panUniqueReference
   */
  exports.prototype['panUniqueReference'] = undefined;
  /**
   *  __(CONDITIONAL)__<br>  A unique reference assigned following the allocation of a token used to identify the token for the duration of its lifetime.  For repeat digitizations, the unique reference allocated to the token will be used to retrieve the financial account information. When supplied, the account information is omitted from FundingAccountData. Only allowed if panUniqueReference and pushAccountReceipt are not present and encrypted data does not contain the account information. <br> __Max Length:64__ 
   * @member {String} tokenUniqueReference
   */
  exports.prototype['tokenUniqueReference'] = undefined;
  /**
   * __(CONDITIONAL)__<br> The push account receipt is supplied by the Issuer to the Merchant during a push provisioning operation. The pushAccountReceipt is then submitted by the merchant in the tokenize request and will be used by MDES to retrieve the associated funding account information. Only allowed if panUniqueReference and tokenUniqueReference are not present and encrypted data does not contain the funding account information. Refer to the <a href=\"https://developer.mastercard.com/page/push-provisioning-merchant\">Push Provisioning Use Case Guide </a>  for more information about pushAccountReceipt.  __Max Length:64__ 
   * @member {String} pushAccountReceipt
   */
  exports.prototype['pushAccountReceipt'] = undefined;
  /**
   * @member {module:model/FundingAccountInfoEncryptedPayload} encryptedPayload
   */
  exports.prototype['encryptedPayload'] = undefined;



  return exports;
}));


