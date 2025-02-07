<?php
/**
 * SuspendRequestSchema
 *
 * PHP version 7.2
 *
 * @category Class
 * @package  DigitalEnablementClient
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 */

/**
 * MDES Digital Enablement API
 *
 * These APIs are designed as RPC style stateless web services where each API endpoint represents an operation to be performed.  All request and response payloads are sent in the JSON (JavaScript Object Notation) data-interchange format. Each endpoint in the API specifies the HTTP Method used to access it. All strings in request and response objects are to be UTF-8 encoded.  Each API URI includes the major and minor version of API that it conforms to.  This will allow multiple concurrent versions of the API to be deployed simultaneously. <br><br> **Authentication** <br><br> Mastercard uses OAuth 1.0a with body hash extension for authenticating the API clients. This requires every request that you send to  Mastercard to be signed with an RSA private key. A private-public RSA key pair must be generated consisting of: <br><br> 1. A private key for the OAuth signature for API requests. It is recommended to keep the private key in a password-protected or hardware keystore. <br> 2. A public key is shared with Mastercard during the project setup process through either a certificate signing request (CSR) or the API Key Generator. Mastercard will use the public key to verify the OAuth signature that is provided on every API call.<br>  An OAUTH1.0a signer library is available on [GitHub](https://github.com/Mastercard/oauth1-signer-java) <br><br> **Encryption** <br><br> All communications between Issuer web service and the Mastercard gateway is encrypted using TLS. <br><br> **Additional Encryption of Sensitive Data** <br><br> In addition to the OAuth authentication, when using MDES Digital Enablement Service, any PCI sensitive and all account holder Personally Identifiable Information (PII) data must be encrypted. This requirement applies to the API fields containing encryptedData. Sensitive data is encrypted using a symmetric session (one-time-use) key. The symmetric session key is then wrapped with an RSA Public Key supplied by Mastercard during API setup phase (the Customer Encryption Key). <br>  Java Client Encryption Library available on [GitHub](https://github.com/Mastercard/client-encryption-java)
 *
 * The version of the OpenAPI document: 1.3.0
 * Generated by: https://openapi-generator.tech
 * OpenAPI Generator version: 5.1.1
 */

/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

namespace DigitalEnablementClient\Model;

use \ArrayAccess;
use \DigitalEnablementClient\ObjectSerializer;

/**
 * SuspendRequestSchema Class Doc Comment
 *
 * @category Class
 * @package  DigitalEnablementClient
 * @author   OpenAPI Generator team
 * @link     https://openapi-generator.tech
 * @implements \ArrayAccess<TKey, TValue>
 * @template TKey int|null
 * @template TValue mixed|null
 */
class SuspendRequestSchema implements ModelInterface, ArrayAccess, \JsonSerializable
{
    public const DISCRIMINATOR = null;

    /**
      * The original name of the model.
      *
      * @var string
      */
    protected static $openAPIModelName = 'SuspendRequestSchema';

    /**
      * Array of property to type mappings. Used for (de)serialization
      *
      * @var string[]
      */
    protected static $openAPITypes = [
        'response_host' => 'string',
        'request_id' => 'string',
        'payment_app_instance_id' => 'string',
        'token_unique_references' => 'string[]',
        'caused_by' => 'string',
        'reason' => 'string',
        'reason_code' => 'string'
    ];

    /**
      * Array of property to format mappings. Used for (de)serialization
      *
      * @var string[]
      * @phpstan-var array<string, string|null>
      * @psalm-var array<string, string|null>
      */
    protected static $openAPIFormats = [
        'response_host' => null,
        'request_id' => null,
        'payment_app_instance_id' => null,
        'token_unique_references' => null,
        'caused_by' => null,
        'reason' => null,
        'reason_code' => null
    ];

    /**
     * Array of property to type mappings. Used for (de)serialization
     *
     * @return array
     */
    public static function openAPITypes()
    {
        return self::$openAPITypes;
    }

    /**
     * Array of property to format mappings. Used for (de)serialization
     *
     * @return array
     */
    public static function openAPIFormats()
    {
        return self::$openAPIFormats;
    }

    /**
     * Array of attributes where the key is the local name,
     * and the value is the original name
     *
     * @var string[]
     */
    protected static $attributeMap = [
        'response_host' => 'responseHost',
        'request_id' => 'requestId',
        'payment_app_instance_id' => 'paymentAppInstanceId',
        'token_unique_references' => 'tokenUniqueReferences',
        'caused_by' => 'causedBy',
        'reason' => 'reason',
        'reason_code' => 'reasonCode'
    ];

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @var string[]
     */
    protected static $setters = [
        'response_host' => 'setResponseHost',
        'request_id' => 'setRequestId',
        'payment_app_instance_id' => 'setPaymentAppInstanceId',
        'token_unique_references' => 'setTokenUniqueReferences',
        'caused_by' => 'setCausedBy',
        'reason' => 'setReason',
        'reason_code' => 'setReasonCode'
    ];

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @var string[]
     */
    protected static $getters = [
        'response_host' => 'getResponseHost',
        'request_id' => 'getRequestId',
        'payment_app_instance_id' => 'getPaymentAppInstanceId',
        'token_unique_references' => 'getTokenUniqueReferences',
        'caused_by' => 'getCausedBy',
        'reason' => 'getReason',
        'reason_code' => 'getReasonCode'
    ];

    /**
     * Array of attributes where the key is the local name,
     * and the value is the original name
     *
     * @return array
     */
    public static function attributeMap()
    {
        return self::$attributeMap;
    }

    /**
     * Array of attributes to setter functions (for deserialization of responses)
     *
     * @return array
     */
    public static function setters()
    {
        return self::$setters;
    }

    /**
     * Array of attributes to getter functions (for serialization of requests)
     *
     * @return array
     */
    public static function getters()
    {
        return self::$getters;
    }

    /**
     * The original name of the model.
     *
     * @return string
     */
    public function getModelName()
    {
        return self::$openAPIModelName;
    }


    /**
     * Associative array for storing property values
     *
     * @var mixed[]
     */
    protected $container = [];

    /**
     * Constructor
     *
     * @param mixed[] $data Associated array of property values
     *                      initializing the model
     */
    public function __construct(array $data = null)
    {
        $this->container['response_host'] = $data['response_host'] ?? null;
        $this->container['request_id'] = $data['request_id'] ?? null;
        $this->container['payment_app_instance_id'] = $data['payment_app_instance_id'] ?? null;
        $this->container['token_unique_references'] = $data['token_unique_references'] ?? null;
        $this->container['caused_by'] = $data['caused_by'] ?? null;
        $this->container['reason'] = $data['reason'] ?? null;
        $this->container['reason_code'] = $data['reason_code'] ?? null;
    }

    /**
     * Show all the invalid properties with reasons.
     *
     * @return array invalid properties with reasons
     */
    public function listInvalidProperties()
    {
        $invalidProperties = [];

        if ($this->container['request_id'] === null) {
            $invalidProperties[] = "'request_id' can't be null";
        }
        if (!is_null($this->container['payment_app_instance_id']) && (mb_strlen($this->container['payment_app_instance_id']) > 48)) {
            $invalidProperties[] = "invalid value for 'payment_app_instance_id', the character length must be smaller than or equal to 48.";
        }

        if ($this->container['token_unique_references'] === null) {
            $invalidProperties[] = "'token_unique_references' can't be null";
        }
        if ($this->container['caused_by'] === null) {
            $invalidProperties[] = "'caused_by' can't be null";
        }
        if ((mb_strlen($this->container['caused_by']) > 64)) {
            $invalidProperties[] = "invalid value for 'caused_by', the character length must be smaller than or equal to 64.";
        }

        if (!is_null($this->container['reason']) && (mb_strlen($this->container['reason']) > 256)) {
            $invalidProperties[] = "invalid value for 'reason', the character length must be smaller than or equal to 256.";
        }

        if ($this->container['reason_code'] === null) {
            $invalidProperties[] = "'reason_code' can't be null";
        }
        if ((mb_strlen($this->container['reason_code']) > 64)) {
            $invalidProperties[] = "invalid value for 'reason_code', the character length must be smaller than or equal to 64.";
        }

        return $invalidProperties;
    }

    /**
     * Validate all the properties in the model
     * return true if all passed
     *
     * @return bool True if all properties are valid
     */
    public function valid()
    {
        return count($this->listInvalidProperties()) === 0;
    }


    /**
     * Gets response_host
     *
     * @return string|null
     */
    public function getResponseHost()
    {
        return $this->container['response_host'];
    }

    /**
     * Sets response_host
     *
     * @param string|null $response_host The host that originated the request. Future calls in the same conversation may be routed to this host.
     *
     * @return self
     */
    public function setResponseHost($response_host)
    {
        $this->container['response_host'] = $response_host;

        return $this;
    }

    /**
     * Gets request_id
     *
     * @return string
     */
    public function getRequestId()
    {
        return $this->container['request_id'];
    }

    /**
     * Sets request_id
     *
     * @param string $request_id Unique identifier for the request.
     *
     * @return self
     */
    public function setRequestId($request_id)
    {
        $this->container['request_id'] = $request_id;

        return $this;
    }

    /**
     * Gets payment_app_instance_id
     *
     * @return string|null
     */
    public function getPaymentAppInstanceId()
    {
        return $this->container['payment_app_instance_id'];
    }

    /**
     * Sets payment_app_instance_id
     *
     * @param string|null $payment_app_instance_id Identifier for the specific Mobile Payment App instance, unique across a given Wallet Identifier. This value cannot be changed after digitization. This field is alphanumeric and additionally web-safe base64 characters per RFC 4648 (minus \"-\", underscore \"_\") up to a maximum length of 48, = should not be URL encoded. Conditional - not applicable for server based tokens but required otherwise.
     *
     * @return self
     */
    public function setPaymentAppInstanceId($payment_app_instance_id)
    {
        if (!is_null($payment_app_instance_id) && (mb_strlen($payment_app_instance_id) > 48)) {
            throw new \InvalidArgumentException('invalid length for $payment_app_instance_id when calling SuspendRequestSchema., must be smaller than or equal to 48.');
        }

        $this->container['payment_app_instance_id'] = $payment_app_instance_id;

        return $this;
    }

    /**
     * Gets token_unique_references
     *
     * @return string[]
     */
    public function getTokenUniqueReferences()
    {
        return $this->container['token_unique_references'];
    }

    /**
     * Sets token_unique_references
     *
     * @param string[] $token_unique_references The specific Token to be suspended. Array of more or more valid references as assigned by MDES
     *
     * @return self
     */
    public function setTokenUniqueReferences($token_unique_references)
    {
        $this->container['token_unique_references'] = $token_unique_references;

        return $this;
    }

    /**
     * Gets caused_by
     *
     * @return string
     */
    public function getCausedBy()
    {
        return $this->container['caused_by'];
    }

    /**
     * Sets caused_by
     *
     * @param string $caused_by Who or what caused the Token to be suspended. Must be either the 'CARDHOLDER' (operation requested by the Cardholder) or 'TOKEN_REQUESTOR' (operation requested by the token requestor).
     *
     * @return self
     */
    public function setCausedBy($caused_by)
    {
        if ((mb_strlen($caused_by) > 64)) {
            throw new \InvalidArgumentException('invalid length for $caused_by when calling SuspendRequestSchema., must be smaller than or equal to 64.');
        }

        $this->container['caused_by'] = $caused_by;

        return $this;
    }

    /**
     * Gets reason
     *
     * @return string|null
     */
    public function getReason()
    {
        return $this->container['reason'];
    }

    /**
     * Sets reason
     *
     * @param string|null $reason Free form reason why the Tokens are being suspended.
     *
     * @return self
     */
    public function setReason($reason)
    {
        if (!is_null($reason) && (mb_strlen($reason) > 256)) {
            throw new \InvalidArgumentException('invalid length for $reason when calling SuspendRequestSchema., must be smaller than or equal to 256.');
        }

        $this->container['reason'] = $reason;

        return $this;
    }

    /**
     * Gets reason_code
     *
     * @return string
     */
    public function getReasonCode()
    {
        return $this->container['reason_code'];
    }

    /**
     * Sets reason_code
     *
     * @param string $reason_code The reason for the action to be suspended. Must be one of 'SUSPECTED_FRAUD' (suspected fraudulent token transactions), 'OTHER' (Other - default used if value not provided).
     *
     * @return self
     */
    public function setReasonCode($reason_code)
    {
        if ((mb_strlen($reason_code) > 64)) {
            throw new \InvalidArgumentException('invalid length for $reason_code when calling SuspendRequestSchema., must be smaller than or equal to 64.');
        }

        $this->container['reason_code'] = $reason_code;

        return $this;
    }
    /**
     * Returns true if offset exists. False otherwise.
     *
     * @param integer $offset Offset
     *
     * @return boolean
     */
    public function offsetExists($offset)
    {
        return isset($this->container[$offset]);
    }

    /**
     * Gets offset.
     *
     * @param integer $offset Offset
     *
     * @return mixed|null
     */
    public function offsetGet($offset)
    {
        return $this->container[$offset] ?? null;
    }

    /**
     * Sets value based on offset.
     *
     * @param int|null $offset Offset
     * @param mixed    $value  Value to be set
     *
     * @return void
     */
    public function offsetSet($offset, $value)
    {
        if (is_null($offset)) {
            $this->container[] = $value;
        } else {
            $this->container[$offset] = $value;
        }
    }

    /**
     * Unsets offset.
     *
     * @param integer $offset Offset
     *
     * @return void
     */
    public function offsetUnset($offset)
    {
        unset($this->container[$offset]);
    }

    /**
     * Serializes the object to a value that can be serialized natively by json_encode().
     * @link https://www.php.net/manual/en/jsonserializable.jsonserialize.php
     *
     * @return mixed Returns data which can be serialized by json_encode(), which is a value
     * of any type other than a resource.
     */
    public function jsonSerialize()
    {
       return ObjectSerializer::sanitizeForSerialization($this);
    }

    /**
     * Gets the string presentation of the object
     *
     * @return string
     */
    public function __toString()
    {
        return json_encode(
            ObjectSerializer::sanitizeForSerialization($this),
            JSON_PRETTY_PRINT
        );
    }

    /**
     * Gets a header-safe presentation of the object
     *
     * @return string
     */
    public function toHeaderValue()
    {
        return json_encode(ObjectSerializer::sanitizeForSerialization($this));
    }
}


