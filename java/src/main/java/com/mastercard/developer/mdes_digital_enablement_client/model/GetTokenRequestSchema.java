/*
 * MDES Digital Enablement API
 * These APIs are designed as RPC style stateless web services where each API endpoint represents an operation to be performed.  All request and response payloads are sent in the JSON (JavaScript Object Notation) data-interchange format. Each endpoint in the API specifies the HTTP Method used to access it. All strings in request and response objects are to be UTF-8 encoded.  Each API URI includes the major and minor version of API that it conforms to.  This will allow multiple concurrent versions of the API to be deployed simultaneously. <br><br> **Authentication** <br><br> Mastercard uses OAuth 1.0a with body hash extension for authenticating the API clients. This requires every request that you send to  Mastercard to be signed with an RSA private key. A private-public RSA key pair must be generated consisting of: <br><br> 1. A private key for the OAuth signature for API requests. It is recommended to keep the private key in a password-protected or hardware keystore. <br> 2. A public key is shared with Mastercard during the project setup process through either a certificate signing request (CSR) or the API Key Generator. Mastercard will use the public key to verify the OAuth signature that is provided on every API call.<br>  An OAUTH1.0a signer library is available on [GitHub](https://github.com/Mastercard/oauth1-signer-java) <br><br> **Encryption** <br><br> All communications between Issuer web service and the Mastercard gateway is encrypted using TLS. <br><br> **Additional Encryption of Sensitive Data** <br><br> In addition to the OAuth authentication, when using MDES Digital Enablement Service, any PCI sensitive and all account holder Personally Identifiable Information (PII) data must be encrypted. This requirement applies to the API fields containing encryptedData. Sensitive data is encrypted using a symmetric session (one-time-use) key. The symmetric session key is then wrapped with an RSA Public Key supplied by Mastercard during API setup phase (the Customer Encryption Key). <br>  Java Client Encryption Library available on [GitHub](https://github.com/Mastercard/client-encryption-java) 
 *
 * The version of the OpenAPI document: 1.3.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.mastercard.developer.mdes_digital_enablement_client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * GetTokenRequestSchema
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-08-03T18:13:45.340+01:00[Europe/London]")
public class GetTokenRequestSchema {
  public static final String SERIALIZED_NAME_RESPONSE_HOST = "responseHost";
  @SerializedName(SERIALIZED_NAME_RESPONSE_HOST)
  private String responseHost;

  public static final String SERIALIZED_NAME_REQUEST_ID = "requestId";
  @SerializedName(SERIALIZED_NAME_REQUEST_ID)
  private String requestId;

  public static final String SERIALIZED_NAME_PAYMENT_APP_INSTANCE_ID = "paymentAppInstanceId";
  @SerializedName(SERIALIZED_NAME_PAYMENT_APP_INSTANCE_ID)
  private String paymentAppInstanceId;

  public static final String SERIALIZED_NAME_TOKEN_UNIQUE_REFERENCE = "tokenUniqueReference";
  @SerializedName(SERIALIZED_NAME_TOKEN_UNIQUE_REFERENCE)
  private String tokenUniqueReference;

  public static final String SERIALIZED_NAME_INCLUDE_TOKEN_DETAIL = "includeTokenDetail";
  @SerializedName(SERIALIZED_NAME_INCLUDE_TOKEN_DETAIL)
  private String includeTokenDetail;


  public GetTokenRequestSchema responseHost(String responseHost) {
    
    this.responseHost = responseHost;
    return this;
  }

   /**
   * The host that originated the request. Future calls in the same conversation may be routed to this host. 
   * @return responseHost
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "site2.payment-app-provider.com", value = "The host that originated the request. Future calls in the same conversation may be routed to this host. ")

  public String getResponseHost() {
    return responseHost;
  }


  public void setResponseHost(String responseHost) {
    this.responseHost = responseHost;
  }


  public GetTokenRequestSchema requestId(String requestId) {
    
    this.requestId = requestId;
    return this;
  }

   /**
   * Unique identifier for the request. 
   * @return requestId
  **/
  @ApiModelProperty(example = "123456", required = true, value = "Unique identifier for the request. ")

  public String getRequestId() {
    return requestId;
  }


  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }


  public GetTokenRequestSchema paymentAppInstanceId(String paymentAppInstanceId) {
    
    this.paymentAppInstanceId = paymentAppInstanceId;
    return this;
  }

   /**
   * Identifier for the specific Mobile Payment App instance, unique across a given Wallet Identifier. This value cannot be changed after digitization. This field is alphanumeric and additionally web-safe base64 characters per RFC 4648 (minus \&quot;-\&quot;, underscore \&quot;_\&quot;) up to a maximum length of 48, &#x3D; should not be URL encoded. Conditional - not applicable for server-based tokens but required otherwise. 
   * @return paymentAppInstanceId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "123456789", value = "Identifier for the specific Mobile Payment App instance, unique across a given Wallet Identifier. This value cannot be changed after digitization. This field is alphanumeric and additionally web-safe base64 characters per RFC 4648 (minus \"-\", underscore \"_\") up to a maximum length of 48, = should not be URL encoded. Conditional - not applicable for server-based tokens but required otherwise. ")

  public String getPaymentAppInstanceId() {
    return paymentAppInstanceId;
  }


  public void setPaymentAppInstanceId(String paymentAppInstanceId) {
    this.paymentAppInstanceId = paymentAppInstanceId;
  }


  public GetTokenRequestSchema tokenUniqueReference(String tokenUniqueReference) {
    
    this.tokenUniqueReference = tokenUniqueReference;
    return this;
  }

   /**
   * The specific Token to be queried. 
   * @return tokenUniqueReference
  **/
  @ApiModelProperty(example = "DWSPMC000000000132d72d4fcb2f4136a0532d3093ff1a45", required = true, value = "The specific Token to be queried. ")

  public String getTokenUniqueReference() {
    return tokenUniqueReference;
  }


  public void setTokenUniqueReference(String tokenUniqueReference) {
    this.tokenUniqueReference = tokenUniqueReference;
  }


  public GetTokenRequestSchema includeTokenDetail(String includeTokenDetail) {
    
    this.includeTokenDetail = includeTokenDetail;
    return this;
  }

   /**
   * Flag to indicate if the encrypted token should be returned. 
   * @return includeTokenDetail
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "true", value = "Flag to indicate if the encrypted token should be returned. ")

  public String getIncludeTokenDetail() {
    return includeTokenDetail;
  }


  public void setIncludeTokenDetail(String includeTokenDetail) {
    this.includeTokenDetail = includeTokenDetail;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetTokenRequestSchema getTokenRequestSchema = (GetTokenRequestSchema) o;
    return Objects.equals(this.responseHost, getTokenRequestSchema.responseHost) &&
        Objects.equals(this.requestId, getTokenRequestSchema.requestId) &&
        Objects.equals(this.paymentAppInstanceId, getTokenRequestSchema.paymentAppInstanceId) &&
        Objects.equals(this.tokenUniqueReference, getTokenRequestSchema.tokenUniqueReference) &&
        Objects.equals(this.includeTokenDetail, getTokenRequestSchema.includeTokenDetail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(responseHost, requestId, paymentAppInstanceId, tokenUniqueReference, includeTokenDetail);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetTokenRequestSchema {\n");
    sb.append("    responseHost: ").append(toIndentedString(responseHost)).append("\n");
    sb.append("    requestId: ").append(toIndentedString(requestId)).append("\n");
    sb.append("    paymentAppInstanceId: ").append(toIndentedString(paymentAppInstanceId)).append("\n");
    sb.append("    tokenUniqueReference: ").append(toIndentedString(tokenUniqueReference)).append("\n");
    sb.append("    includeTokenDetail: ").append(toIndentedString(includeTokenDetail)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

