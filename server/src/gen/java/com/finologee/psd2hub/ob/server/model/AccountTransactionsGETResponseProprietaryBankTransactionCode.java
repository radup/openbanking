package com.finologee.psd2hub.ob.server.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@ApiModel(description="Set of elements to fully identify a proprietary bank transaction code.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2017-08-30T01:38:28.934+02:00")
public class AccountTransactionsGETResponseProprietaryBankTransactionCode   {
  
  private String code = null;
  private String issuer = null;

  /**
   * Proprietary bank transaction code to identify the underlying transaction.
   **/
  
  @ApiModelProperty(required = true, value = "Proprietary bank transaction code to identify the underlying transaction.")
  @JsonProperty("Code")
  @NotNull
 @Size(min=1,max=35)  public String getCode() {
    return code;
  }
  public void setCode(String code) {
    this.code = code;
  }

  /**
   * Identification of the issuer of the proprietary bank transaction code.
   **/
  
  @ApiModelProperty(value = "Identification of the issuer of the proprietary bank transaction code.")
  @JsonProperty("Issuer")
 @Size(min=1,max=35)  public String getIssuer() {
    return issuer;
  }
  public void setIssuer(String issuer) {
    this.issuer = issuer;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountTransactionsGETResponseProprietaryBankTransactionCode accountTransactionsGETResponseProprietaryBankTransactionCode = (AccountTransactionsGETResponseProprietaryBankTransactionCode) o;
    return Objects.equals(code, accountTransactionsGETResponseProprietaryBankTransactionCode.code) &&
        Objects.equals(issuer, accountTransactionsGETResponseProprietaryBankTransactionCode.issuer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(code, issuer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountTransactionsGETResponseProprietaryBankTransactionCode {\n");
    
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    issuer: ").append(toIndentedString(issuer)).append("\n");
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

