/*
 * Payment Initiation APIs
 * Draft Swagger specification for Payment Initiation
 *
 * OpenAPI spec version: v1.0.0
 * Contact: craig.greenhouse@openbanking.org.uk
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.jeelis.psd2hub.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.jeelis.psd2hub.client.model.PaymentSetup;
import com.jeelis.psd2hub.client.model.Risk;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Allows setup of a payment
 */
@ApiModel(description = "Allows setup of a payment")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-30T02:04:19.097+02:00")
public class PaymentSetupPOSTRequest {
  @SerializedName("Data")
  private PaymentSetup data = null;

  @SerializedName("Risk")
  private Risk risk = null;

  public PaymentSetupPOSTRequest data(PaymentSetup data) {
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  @ApiModelProperty(value = "")
  public PaymentSetup getData() {
    return data;
  }

  public void setData(PaymentSetup data) {
    this.data = data;
  }

  public PaymentSetupPOSTRequest risk(Risk risk) {
    this.risk = risk;
    return this;
  }

   /**
   * Get risk
   * @return risk
  **/
  @ApiModelProperty(value = "")
  public Risk getRisk() {
    return risk;
  }

  public void setRisk(Risk risk) {
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
    PaymentSetupPOSTRequest paymentSetupPOSTRequest = (PaymentSetupPOSTRequest) o;
    return Objects.equals(this.data, paymentSetupPOSTRequest.data) &&
        Objects.equals(this.risk, paymentSetupPOSTRequest.risk);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, risk);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentSetupPOSTRequest {\n");
    
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

