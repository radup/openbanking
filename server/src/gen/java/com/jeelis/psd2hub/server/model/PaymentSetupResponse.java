package com.jeelis.psd2hub.server.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.jeelis.psd2hub.server.model.PaymentSetupResponseInitiation;
import io.swagger.annotations.ApiModel;
import java.util.Date;
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@ApiModel(description="Reflection of The Main Data Payload, with Created Resource ID, Status and Timestamp")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2017-08-30T01:37:21.257+02:00")
public class PaymentSetupResponse   {
  
  private String paymentId = null;

  /**
   * Specifies the status of the payment resource.
   */
  public enum StatusEnum {
    ACCEPTEDCUSTOMERPROFILE("AcceptedCustomerProfile"),

        ACCEPTEDTECHNICALVALIDATION("AcceptedTechnicalValidation"),

        PENDING("Pending"),

        REJECTED("Rejected");
    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private StatusEnum status = null;
  private Date creationDateTime = null;
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
   * Specifies the status of the payment resource.
   **/
  
  @ApiModelProperty(value = "Specifies the status of the payment resource.")
  @JsonProperty("Status")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  /**
   * Date and time at which the resource was created.
   **/
  
  @ApiModelProperty(required = true, value = "Date and time at which the resource was created.")
  @JsonProperty("CreationDateTime")
  @NotNull
  public Date getCreationDateTime() {
    return creationDateTime;
  }
  public void setCreationDateTime(Date creationDateTime) {
    this.creationDateTime = creationDateTime;
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
    PaymentSetupResponse paymentSetupResponse = (PaymentSetupResponse) o;
    return Objects.equals(paymentId, paymentSetupResponse.paymentId) &&
        Objects.equals(status, paymentSetupResponse.status) &&
        Objects.equals(creationDateTime, paymentSetupResponse.creationDateTime) &&
        Objects.equals(initiation, paymentSetupResponse.initiation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentId, status, creationDateTime, initiation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentSetupResponse {\n");
    
    sb.append("    paymentId: ").append(toIndentedString(paymentId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    creationDateTime: ").append(toIndentedString(creationDateTime)).append("\n");
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

