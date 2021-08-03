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
 * MediaContent
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-08-03T18:13:45.340+01:00[Europe/London]")
public class MediaContent {
  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private String data;

  public static final String SERIALIZED_NAME_HEIGHT = "height";
  @SerializedName(SERIALIZED_NAME_HEIGHT)
  private String height;

  public static final String SERIALIZED_NAME_WIDTH = "width";
  @SerializedName(SERIALIZED_NAME_WIDTH)
  private String width;


  public MediaContent type(String type) {
    
    this.type = type;
    return this;
  }

   /**
   * What type of media this is. Specified as a MIME type, which will be one of the following supported types  * applicatoin/pdf (for images must be a vector PDF image) * image/png (includes alpha channel) * text/plain * text/html 
   * @return type
  **/
  @ApiModelProperty(example = "image/png", required = true, value = "What type of media this is. Specified as a MIME type, which will be one of the following supported types  * applicatoin/pdf (for images must be a vector PDF image) * image/png (includes alpha channel) * text/plain * text/html ")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public MediaContent data(String data) {
    
    this.data = data;
    return this;
  }

   /**
   * The data for this item of media. Base64-encoded data, given in the format as specified in ?type?. 
   * @return data
  **/
  @ApiModelProperty(example = "iVBORw0KGgoAAAANSUhEUgAAAXcAAAF3CAIAAADRopypAAAABGdBTUEAANbY1E9YMgAAAAlwSFlzAAAASAAAAEgARslrPgAAGtNJREFUeNrt3W9oW", required = true, value = "The data for this item of media. Base64-encoded data, given in the format as specified in ?type?. ")

  public String getData() {
    return data;
  }


  public void setData(String data) {
    this.data = data;
  }


  public MediaContent height(String height) {
    
    this.height = height;
    return this;
  }

   /**
   * For image assets, the height of this image. Specified in pixels. 
   * @return height
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "375", value = "For image assets, the height of this image. Specified in pixels. ")

  public String getHeight() {
    return height;
  }


  public void setHeight(String height) {
    this.height = height;
  }


  public MediaContent width(String width) {
    
    this.width = width;
    return this;
  }

   /**
   * For image assets, the width of this image. Specified in pixels. 
   * @return width
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "375", value = "For image assets, the width of this image. Specified in pixels. ")

  public String getWidth() {
    return width;
  }


  public void setWidth(String width) {
    this.width = width;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MediaContent mediaContent = (MediaContent) o;
    return Objects.equals(this.type, mediaContent.type) &&
        Objects.equals(this.data, mediaContent.data) &&
        Objects.equals(this.height, mediaContent.height) &&
        Objects.equals(this.width, mediaContent.width);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, data, height, width);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MediaContent {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    height: ").append(toIndentedString(height)).append("\n");
    sb.append("    width: ").append(toIndentedString(width)).append("\n");
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

