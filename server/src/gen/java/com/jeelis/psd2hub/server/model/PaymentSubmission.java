package com.jeelis.psd2hub.server.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.jeelis.psd2hub.server.model.PaymentSetupResponseInitiation;
import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@ApiModel(description="")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2017-08-30T01:37:21.257+02:00")
public class PaymentSubmission   {
  
  private String paymentId = null;
  private PaymentSetupResponseInitiation initiation = null;

  /**
   * OB: Unique identification as assigned by the ASPSP to uniquely identify the payment setup resource.
   **/
  
  @ApiModelProperty(required = true, value = "OB: Unique identification as assigned by the ASPSP to uniquely identify the payment setup resource.")
  @JsonProperty("PaymentId")
  @NotNull
 @Size(min=1,max=128)  public String getPaymentId() {
    return paymentId;
  }
  public void setPaymentId(String paymentId) {
    this.paymentId = paymentId;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("Initiation")
  public PaymentSetupResponseInitiation getInitiation() {
    return initiation;
  }
  public void setInitiation(PaymentSetupResponseInitiation initiation) {
    this.initiation = initiation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentSubmission paymentSubmission = (PaymentSubmission) o;
    return Objects.equals(paymentId, paymentSubmission.paymentId) &&
        Objects.equals(initiation, paymentSubmission.initiation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentId, initiation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentSubmission {\n");
    
    sb.append("    paymentId: ").append(toIndentedString(paymentId)).append("\n");
    sb.append("    initiation: ").append(toIndentedString(initiation)).append("\n");
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

