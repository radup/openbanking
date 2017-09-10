package com.finologee.psd2hub.ob.server.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@ApiModel(description="Link URIs relevant to the payload")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2017-08-30T01:37:21.257+02:00")
public class PaymentSetupPOSTResponseLinks   {
  
  private String self = null;
  private String first = null;
  private String prev = null;
  private String next = null;
  private String last = null;

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("self")
  @NotNull
  public String getSelf() {
    return self;
  }
  public void setSelf(String self) {
    this.self = self;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("first")
  public String getFirst() {
    return first;
  }
  public void setFirst(String first) {
    this.first = first;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("prev")
  public String getPrev() {
    return prev;
  }
  public void setPrev(String prev) {
    this.prev = prev;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("next")
  public String getNext() {
    return next;
  }
  public void setNext(String next) {
    this.next = next;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("last")
  public String getLast() {
    return last;
  }
  public void setLast(String last) {
    this.last = last;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentSetupPOSTResponseLinks paymentSetupPOSTResponseLinks = (PaymentSetupPOSTResponseLinks) o;
    return Objects.equals(self, paymentSetupPOSTResponseLinks.self) &&
        Objects.equals(first, paymentSetupPOSTResponseLinks.first) &&
        Objects.equals(prev, paymentSetupPOSTResponseLinks.prev) &&
        Objects.equals(next, paymentSetupPOSTResponseLinks.next) &&
        Objects.equals(last, paymentSetupPOSTResponseLinks.last);
  }

  @Override
  public int hashCode() {
    return Objects.hash(self, first, prev, next, last);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentSetupPOSTResponseLinks {\n");
    
    sb.append("    self: ").append(toIndentedString(self)).append("\n");
    sb.append("    first: ").append(toIndentedString(first)).append("\n");
    sb.append("    prev: ").append(toIndentedString(prev)).append("\n");
    sb.append("    next: ").append(toIndentedString(next)).append("\n");
    sb.append("    last: ").append(toIndentedString(last)).append("\n");
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

