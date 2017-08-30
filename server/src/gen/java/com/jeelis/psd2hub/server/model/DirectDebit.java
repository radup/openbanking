package com.jeelis.psd2hub.server.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.jeelis.psd2hub.server.model.AccountGETResponse1PreviousPaymentAmount;
import io.swagger.annotations.ApiModel;
import java.util.Date;
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@ApiModel(description="Direct Debit")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2017-08-30T01:38:28.934+02:00")
public class DirectDebit   {
  
  private String accountId = null;
  private String directDebitId = null;
  private String mandateIdentification = null;

  /**
   * Specifies the status of the direct debit in code form.
   */
  public enum DirectDebitStatusCodeEnum {
    ACTIVE("Active"),

        INACTIVE("Inactive");
    private String value;

    DirectDebitStatusCodeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private DirectDebitStatusCodeEnum directDebitStatusCode = null;
  private String name = null;
  private Date previousPaymentDateTime = null;
  private AccountGETResponse1PreviousPaymentAmount previousPaymentAmount = null;

  /**
   * A unique and immutable identifier used to identify the account resource. This identifier has no meaning to the account owner.
   **/
  
  @ApiModelProperty(required = true, value = "A unique and immutable identifier used to identify the account resource. This identifier has no meaning to the account owner.")
  @JsonProperty("AccountId")
  @NotNull
 @Size(min=1,max=40)  public String getAccountId() {
    return accountId;
  }
  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  /**
   * A unique and immutable identifier used to identify the direct debit resource. This identifier has no meaning to the account owner.
   **/
  
  @ApiModelProperty(value = "A unique and immutable identifier used to identify the direct debit resource. This identifier has no meaning to the account owner.")
  @JsonProperty("DirectDebitId")
 @Size(min=1,max=40)  public String getDirectDebitId() {
    return directDebitId;
  }
  public void setDirectDebitId(String directDebitId) {
    this.directDebitId = directDebitId;
  }

  /**
   * Direct Debit reference. For AUDDIS service users provide Core Reference. For non AUDDIS service users provide Core reference if possible or last used reference.
   **/
  
  @ApiModelProperty(required = true, value = "Direct Debit reference. For AUDDIS service users provide Core Reference. For non AUDDIS service users provide Core reference if possible or last used reference.")
  @JsonProperty("MandateIdentification")
  @NotNull
 @Size(min=1,max=35)  public String getMandateIdentification() {
    return mandateIdentification;
  }
  public void setMandateIdentification(String mandateIdentification) {
    this.mandateIdentification = mandateIdentification;
  }

  /**
   * Specifies the status of the direct debit in code form.
   **/
  
  @ApiModelProperty(value = "Specifies the status of the direct debit in code form.")
  @JsonProperty("DirectDebitStatusCode")
  public DirectDebitStatusCodeEnum getDirectDebitStatusCode() {
    return directDebitStatusCode;
  }
  public void setDirectDebitStatusCode(DirectDebitStatusCodeEnum directDebitStatusCode) {
    this.directDebitStatusCode = directDebitStatusCode;
  }

  /**
   * Name of Service User
   **/
  
  @ApiModelProperty(required = true, value = "Name of Service User")
  @JsonProperty("Name")
  @NotNull
 @Size(min=1,max=70)  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Date of most recent direct debit collection.
   **/
  
  @ApiModelProperty(value = "Date of most recent direct debit collection.")
  @JsonProperty("PreviousPaymentDateTime")
  public Date getPreviousPaymentDateTime() {
    return previousPaymentDateTime;
  }
  public void setPreviousPaymentDateTime(Date previousPaymentDateTime) {
    this.previousPaymentDateTime = previousPaymentDateTime;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("PreviousPaymentAmount")
  public AccountGETResponse1PreviousPaymentAmount getPreviousPaymentAmount() {
    return previousPaymentAmount;
  }
  public void setPreviousPaymentAmount(AccountGETResponse1PreviousPaymentAmount previousPaymentAmount) {
    this.previousPaymentAmount = previousPaymentAmount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DirectDebit directDebit = (DirectDebit) o;
    return Objects.equals(accountId, directDebit.accountId) &&
        Objects.equals(directDebitId, directDebit.directDebitId) &&
        Objects.equals(mandateIdentification, directDebit.mandateIdentification) &&
        Objects.equals(directDebitStatusCode, directDebit.directDebitStatusCode) &&
        Objects.equals(name, directDebit.name) &&
        Objects.equals(previousPaymentDateTime, directDebit.previousPaymentDateTime) &&
        Objects.equals(previousPaymentAmount, directDebit.previousPaymentAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, directDebitId, mandateIdentification, directDebitStatusCode, name, previousPaymentDateTime, previousPaymentAmount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DirectDebit {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    directDebitId: ").append(toIndentedString(directDebitId)).append("\n");
    sb.append("    mandateIdentification: ").append(toIndentedString(mandateIdentification)).append("\n");
    sb.append("    directDebitStatusCode: ").append(toIndentedString(directDebitStatusCode)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    previousPaymentDateTime: ").append(toIndentedString(previousPaymentDateTime)).append("\n");
    sb.append("    previousPaymentAmount: ").append(toIndentedString(previousPaymentAmount)).append("\n");
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

