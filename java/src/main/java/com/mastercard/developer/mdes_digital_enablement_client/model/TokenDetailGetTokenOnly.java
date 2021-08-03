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
import com.mastercard.developer.mdes_digital_enablement_client.model.TokenDetailDataGetTokenOnly;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * TokenDetailGetTokenOnly
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-08-03T18:13:45.340+01:00[Europe/London]")
public class TokenDetailGetTokenOnly {
  public static final String SERIALIZED_NAME_TOKEN_UNIQUE_REFERENCE = "tokenUniqueReference";
  @SerializedName(SERIALIZED_NAME_TOKEN_UNIQUE_REFERENCE)
  private String tokenUniqueReference;

  public static final String SERIALIZED_NAME_PUBLIC_KEY_FINGERPRINT = "publicKeyFingerprint";
  @SerializedName(SERIALIZED_NAME_PUBLIC_KEY_FINGERPRINT)
  private String publicKeyFingerprint;

  public static final String SERIALIZED_NAME_ENCRYPTED_KEY = "encryptedKey";
  @SerializedName(SERIALIZED_NAME_ENCRYPTED_KEY)
  private String encryptedKey;

  public static final String SERIALIZED_NAME_OAEP_HASHING_ALGORITHM = "oaepHashingAlgorithm";
  @SerializedName(SERIALIZED_NAME_OAEP_HASHING_ALGORITHM)
  private String oaepHashingAlgorithm;

  public static final String SERIALIZED_NAME_IV = "iv";
  @SerializedName(SERIALIZED_NAME_IV)
  private String iv;

  public static final String SERIALIZED_NAME_ENCRYPTED_DATA = "encryptedData";
  @SerializedName(SERIALIZED_NAME_ENCRYPTED_DATA)
  private TokenDetailDataGetTokenOnly encryptedData;


  public TokenDetailGetTokenOnly tokenUniqueReference(String tokenUniqueReference) {
    
    this.tokenUniqueReference = tokenUniqueReference;
    return this;
  }

   /**
   * Globally unique identifier for the Token, as assigned by MDES. 
   * @return tokenUniqueReference
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "DWSPMC000000000132d72d4fcb2f4136a0532d3093ff1a45", value = "Globally unique identifier for the Token, as assigned by MDES. ")

  public String getTokenUniqueReference() {
    return tokenUniqueReference;
  }


  public void setTokenUniqueReference(String tokenUniqueReference) {
    this.tokenUniqueReference = tokenUniqueReference;
  }


  public TokenDetailGetTokenOnly publicKeyFingerprint(String publicKeyFingerprint) {
    
    this.publicKeyFingerprint = publicKeyFingerprint;
    return this;
  }

   /**
   * The certificate fingerprint identifying the public key used to encrypt the ephemeral AES key. 
   * @return publicKeyFingerprint
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "4c4ead5927f0df8117f178eea9308daa58e27c2b", value = "The certificate fingerprint identifying the public key used to encrypt the ephemeral AES key. ")

  public String getPublicKeyFingerprint() {
    return publicKeyFingerprint;
  }


  public void setPublicKeyFingerprint(String publicKeyFingerprint) {
    this.publicKeyFingerprint = publicKeyFingerprint;
  }


  public TokenDetailGetTokenOnly encryptedKey(String encryptedKey) {
    
    this.encryptedKey = encryptedKey;
    return this;
  }

   /**
   * One-time use AES key encrypted by the MasterCard public key (as identified by &#39;publicKeyFingerprint&#39;) using the OAEP or RSA Encryption Standard PKCS #1 v1.5 scheme (depending on the value of &#39;oaepHashingAlgorithm&#39;. Requirement is for a 128-bit key (with 256-bit key supported as an option). 
   * @return encryptedKey
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "A1B2C3D4E5F6112233445566", value = "One-time use AES key encrypted by the MasterCard public key (as identified by 'publicKeyFingerprint') using the OAEP or RSA Encryption Standard PKCS #1 v1.5 scheme (depending on the value of 'oaepHashingAlgorithm'. Requirement is for a 128-bit key (with 256-bit key supported as an option). ")

  public String getEncryptedKey() {
    return encryptedKey;
  }


  public void setEncryptedKey(String encryptedKey) {
    this.encryptedKey = encryptedKey;
  }


  public TokenDetailGetTokenOnly oaepHashingAlgorithm(String oaepHashingAlgorithm) {
    
    this.oaepHashingAlgorithm = oaepHashingAlgorithm;
    return this;
  }

   /**
   * Hashing algorithm used with the OAEP scheme. If omitted, then the RSA Encryption Standard PKCS #1 v1.5 will be used. Must be either &#39;SHA256&#39; (Use the SHA-256 algorithm) or &#39;SHA512&#39; (Use the SHA-512 algorithm). 
   * @return oaepHashingAlgorithm
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "SHA512", value = "Hashing algorithm used with the OAEP scheme. If omitted, then the RSA Encryption Standard PKCS #1 v1.5 will be used. Must be either 'SHA256' (Use the SHA-256 algorithm) or 'SHA512' (Use the SHA-512 algorithm). ")

  public String getOaepHashingAlgorithm() {
    return oaepHashingAlgorithm;
  }


  public void setOaepHashingAlgorithm(String oaepHashingAlgorithm) {
    this.oaepHashingAlgorithm = oaepHashingAlgorithm;
  }


  public TokenDetailGetTokenOnly iv(String iv) {
    
    this.iv = iv;
    return this;
  }

   /**
   * It is recommended to supply a random initialization vector when encrypting the data using the one-time use AES key. Must be exactly 16 bytes (32 character hex string) to match the block size. Hex-encoded data (case-insensitive). 
   * @return iv
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "NA", value = "It is recommended to supply a random initialization vector when encrypting the data using the one-time use AES key. Must be exactly 16 bytes (32 character hex string) to match the block size. Hex-encoded data (case-insensitive). ")

  public String getIv() {
    return iv;
  }


  public void setIv(String iv) {
    this.iv = iv;
  }


  public TokenDetailGetTokenOnly encryptedData(TokenDetailDataGetTokenOnly encryptedData) {
    
    this.encryptedData = encryptedData;
    return this;
  }

   /**
   * Get encryptedData
   * @return encryptedData
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public TokenDetailDataGetTokenOnly getEncryptedData() {
    return encryptedData;
  }


  public void setEncryptedData(TokenDetailDataGetTokenOnly encryptedData) {
    this.encryptedData = encryptedData;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TokenDetailGetTokenOnly tokenDetailGetTokenOnly = (TokenDetailGetTokenOnly) o;
    return Objects.equals(this.tokenUniqueReference, tokenDetailGetTokenOnly.tokenUniqueReference) &&
        Objects.equals(this.publicKeyFingerprint, tokenDetailGetTokenOnly.publicKeyFingerprint) &&
        Objects.equals(this.encryptedKey, tokenDetailGetTokenOnly.encryptedKey) &&
        Objects.equals(this.oaepHashingAlgorithm, tokenDetailGetTokenOnly.oaepHashingAlgorithm) &&
        Objects.equals(this.iv, tokenDetailGetTokenOnly.iv) &&
        Objects.equals(this.encryptedData, tokenDetailGetTokenOnly.encryptedData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tokenUniqueReference, publicKeyFingerprint, encryptedKey, oaepHashingAlgorithm, iv, encryptedData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TokenDetailGetTokenOnly {\n");
    sb.append("    tokenUniqueReference: ").append(toIndentedString(tokenUniqueReference)).append("\n");
    sb.append("    publicKeyFingerprint: ").append(toIndentedString(publicKeyFingerprint)).append("\n");
    sb.append("    encryptedKey: ").append(toIndentedString(encryptedKey)).append("\n");
    sb.append("    oaepHashingAlgorithm: ").append(toIndentedString(oaepHashingAlgorithm)).append("\n");
    sb.append("    iv: ").append(toIndentedString(iv)).append("\n");
    sb.append("    encryptedData: ").append(toIndentedString(encryptedData)).append("\n");
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

