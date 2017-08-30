package com.jeelis.psd2hub.server.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.jeelis.psd2hub.server.model.PaymentSetupPOSTResponseLinks;
import com.jeelis.psd2hub.server.model.PaymentSetupPOSTResponseMeta;
import java.util.Date;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2017-08-30T01:37:21.257+02:00")
public class PaymentSubmitPOST201Response   {
  
  private String paymentSubmissionId = null;
  private String paymentId = null;

  /**
   * Specifies the status of the payment submission resource.
   */
  public enum StatusEnum {
    ACCEPTEDSETTLEMENTCOMPLETED("AcceptedSettlementCompleted"),

        ACCEPTEDSETTLEMENTINPROCESS("AcceptedSettlementInProcess"),

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
  private PaymentSetupPOSTResponseLinks links = null;
  private PaymentSetupPOSTResponseMeta meta = null;

  /**
   * OB: Unique identification as assigned by the ASPSP to uniquely identify the payment submission resource.
   **/
  
  @ApiModelProperty(required = true, value = "OB: Unique identification as assigned by the ASPSP to uniquely identify the payment submission resource.")
  @JsonProperty("PaymentSubmissionId")
  @NotNull
 @Size(min=1,max=40)  public String getPaymentSubmissionId() {
    return paymentSubmissionId;
  }
  public void setPaymentSubmissionId(String paymentSubmissionId) {
    this.paymentSubmissionId = paymentSubmissionId;
  }

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
   * Specifies the status of the payment submission resource.
   **/
  
  @ApiModelProperty(value = "Specifies the status of the payment submission resource.")
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
    PaymentSubmitPOST201Response paymentSubmitPOST201Response = (PaymentSubmitPOST201Response) o;
    return Objects.equals(paymentSubmissionId, paymentSubmitPOST201Response.paymentSubmissionId) &&
        Objects.equals(paymentId, paymentSubmitPOST201Response.paymentId) &&
        Objects.equals(status, paymentSubmitPOST201Response.status) &&
        Objects.equals(creationDateTime, paymentSubmitPOST201Response.creationDateTime) &&
        Objects.equals(links, paymentSubmitPOST201Response.links) &&
        Objects.equals(meta, paymentSubmitPOST201Response.meta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentSubmissionId, paymentId, status, creationDateTime, links, meta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentSubmitPOST201Response {\n");
    
    sb.append("    paymentSubmissionId: ").append(toIndentedString(paymentSubmissionId)).append("\n");
    sb.append("    paymentId: ").append(toIndentedString(paymentId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    creationDateTime: ").append(toIndentedString(creationDateTime)).append("\n");
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

