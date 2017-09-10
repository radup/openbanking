package com.finologee.psd2hub.ob.server.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@ApiModel(description="Financial institution servicing an account for the creditor.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2017-08-30T01:37:21.257+02:00")
public class CreditorAgent   {
  

  /**
   * Name of the identification scheme, in a coded form as published in an external list.
   */
  public enum SchemeNameEnum {
    BICFI("BICFI"),

        UKSORTCODE("UKSortCode");
    private String value;

    SchemeNameEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private SchemeNameEnum schemeName = null;
  private String identification = null;

  /**
   * Name of the identification scheme, in a coded form as published in an external list.
   **/
  
  @ApiModelProperty(required = true, value = "Name of the identification scheme, in a coded form as published in an external list.")
  @JsonProperty("SchemeName")
  @NotNull
  public SchemeNameEnum getSchemeName() {
    return schemeName;
  }
  public void setSchemeName(SchemeNameEnum schemeName) {
    this.schemeName = schemeName;
  }

  /**
   * Unique and unambiguous identification of a person.
   **/
  
  @ApiModelProperty(required = true, value = "Unique and unambiguous identification of a person.")
  @JsonProperty("Identification")
  @NotNull
 @Size(min=1,max=35)  public String getIdentification() {
    return identification;
  }
  public void setIdentification(String identification) {
    this.identification = identification;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreditorAgent creditorAgent = (CreditorAgent) o;
    return Objects.equals(schemeName, creditorAgent.schemeName) &&
        Objects.equals(identification, creditorAgent.identification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(schemeName, identification);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreditorAgent {\n");
    
    sb.append("    schemeName: ").append(toIndentedString(schemeName)).append("\n");
    sb.append("    identification: ").append(toIndentedString(identification)).append("\n");
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

