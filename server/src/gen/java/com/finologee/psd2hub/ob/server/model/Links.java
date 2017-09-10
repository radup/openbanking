package com.finologee.psd2hub.ob.server.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@ApiModel(description="Links relevant to the payload")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2017-08-30T01:38:28.934+02:00")
public class Links   {
  
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
    Links links = (Links) o;
    return Objects.equals(self, links.self) &&
        Objects.equals(first, links.first) &&
        Objects.equals(prev, links.prev) &&
        Objects.equals(next, links.next) &&
        Objects.equals(last, links.last);
  }

  @Override
  public int hashCode() {
    return Objects.hash(self, first, prev, next, last);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Links {\n");
    
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

