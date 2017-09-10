package com.finologee.psd2hub.ob.server.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.finologee.psd2hub.ob.server.model.Data;
import com.fasterxml.jackson.annotation.JsonCreator;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@ApiModel(description="Allows setup of an account access request")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2017-08-30T01:38:28.934+02:00")
public class AccountRequestPOSTRequest   {
  
  private Data data = null;
  private Object risk = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("Data")
  public Data getData() {
    return data;
  }
  public void setData(Data data) {
    this.data = data;
  }

  /**
   * The Risk payload is sent by the initiating party to the ASPSP. It is used to specify additional details for risk scoring for Account Info.
   **/
  
  @ApiModelProperty(required = true, value = "The Risk payload is sent by the initiating party to the ASPSP. It is used to specify additional details for risk scoring for Account Info.")
  @JsonProperty("Risk")
  @NotNull
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
    AccountRequestPOSTRequest accountRequestPOSTRequest = (AccountRequestPOSTRequest) o;
    return Objects.equals(data, accountRequestPOSTRequest.data) &&
        Objects.equals(risk, accountRequestPOSTRequest.risk);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, risk);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountRequestPOSTRequest {\n");
    
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

