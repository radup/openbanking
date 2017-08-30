package com.jeelis.psd2hub.server.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.jeelis.psd2hub.server.model.PaymentSetupPOSTResponseLinks;
import com.jeelis.psd2hub.server.model.PaymentSetupPOSTResponseMeta;
import com.jeelis.psd2hub.server.model.PaymentSetupResponse;
import com.jeelis.psd2hub.server.model.Risk1;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2017-08-30T01:37:21.257+02:00")
public class PaymentSetupPOSTResponse   {
  
  private PaymentSetupResponse data = null;
  private Risk1 risk = null;
  private PaymentSetupPOSTResponseLinks links = null;
  private PaymentSetupPOSTResponseMeta meta = null;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("Data")
  public PaymentSetupResponse getData() {
    return data;
  }
  public void setData(PaymentSetupResponse data) {
    this.data = data;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("Risk")
  public Risk1 getRisk() {
    return risk;
  }
  public void setRisk(Risk1 risk) {
    this.risk = risk;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("Links")
  public PaymentSetupPOSTResponseLinks getLinks() {
    return links;
  }
  public void setLinks(PaymentSetupPOSTResponseLinks links) {
    this.links = links;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("Meta")
  public PaymentSetupPOSTResponseMeta getMeta() {
    return meta;
  }
  public void setMeta(PaymentSetupPOSTResponseMeta meta) {
    this.meta = meta;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentSetupPOSTResponse paymentSetupPOSTResponse = (PaymentSetupPOSTResponse) o;
    return Objects.equals(data, paymentSetupPOSTResponse.data) &&
        Objects.equals(risk, paymentSetupPOSTResponse.risk) &&
        Objects.equals(links, paymentSetupPOSTResponse.links) &&
        Objects.equals(meta, paymentSetupPOSTResponse.meta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, risk, links, meta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentSetupPOSTResponse {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    risk: ").append(toIndentedString(risk)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
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

