package com.jeelis.psd2hub.server.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@ApiModel(description="Set of elements used to fully identify the type of underlying transaction resulting in an entry.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2017-08-30T01:38:28.934+02:00")
public class AccountTransactionsGETResponseBankTransactionCode   {
  
  private String code = null;
  private String subCode = null;

  /**
   * Specifies the family within a domain.
   **/
  
  @ApiModelProperty(required = true, value = "Specifies the family within a domain.")
  @JsonProperty("Code")
  @NotNull
  public String getCode() {
    return code;
  }
  public void setCode(String code) {
    this.code = code;
  }

  /**
   * Specifies the sub-product family within a specific family.
   **/
  
  @ApiModelProperty(required = true, value = "Specifies the sub-product family within a specific family.")
  @JsonProperty("SubCode")
  @NotNull
  public String getSubCode() {
    return subCode;
  }
  public void setSubCode(String subCode) {
    this.subCode = subCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountTransactionsGETResponseBankTransactionCode accountTransactionsGETResponseBankTransactionCode = (AccountTransactionsGETResponseBankTransactionCode) o;
    return Objects.equals(code, accountTransactionsGETResponseBankTransactionCode.code) &&
        Objects.equals(subCode, accountTransactionsGETResponseBankTransactionCode.subCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, subCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountTransactionsGETResponseBankTransactionCode {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    subCode: ").append(toIndentedString(subCode)).append("\n");
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

