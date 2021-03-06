/*
 * Account Information APIs
 * Swagger specification for Account Information APIs
 *
 * OpenAPI spec version: v1.0.0
 * Contact: Craig.Greenhouse@openbanking.org.uk
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.finologee.psd2hub.ob.client.model;

import java.util.Objects;

import com.finologee.psd2hub.ob.client.model.Data1;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * AccountRequestPOSTResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-30T02:03:16.815+02:00")
public class AccountRequestPOSTResponse {
  @SerializedName("Data")
  private Data1 data = null;

  @SerializedName("Risk")
  private Object risk = null;

  public AccountRequestPOSTResponse data(Data1 data) {
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @ApiModelProperty(value = "")
  public Data1 getData() {
    return data;
  }

  public void setData(Data1 data) {
    this.data = data;
  }

  public AccountRequestPOSTResponse risk(Object risk) {
    this.risk = risk;
    return this;
  }

   /**
   * The Risk payload is sent by the initiating party to the ASPSP. It is used to specify additional details for risk scoring for Account Info.
   * @return risk
  **/
  @ApiModelProperty(required = true, value = "The Risk payload is sent by the initiating party to the ASPSP. It is used to specify additional details for risk scoring for Account Info.")
  public Object getRisk() {
    return risk;
  }

  public void setRisk(Object risk) {
    this.risk = risk;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountRequestPOSTResponse accountRequestPOSTResponse = (AccountRequestPOSTResponse) o;
    return Objects.equals(this.data, accountRequestPOSTResponse.data) &&
        Objects.equals(this.risk, accountRequestPOSTResponse.risk);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, risk);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountRequestPOSTResponse {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    risk: ").append(toIndentedString(risk)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

