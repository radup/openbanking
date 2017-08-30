package com.jeelis.psd2hub.server.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.jeelis.psd2hub.server.model.BeneficiariesGETResponseCreditorAccount;
import com.jeelis.psd2hub.server.model.BeneficiariesGETResponseServicer;
import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@ApiModel(description="Beneficiary")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2017-08-30T01:38:28.934+02:00")
public class Beneficiary   {
  
  private String accountId = null;
  private String beneficiaryId = null;
  private String reference = null;
  private BeneficiariesGETResponseServicer servicer = null;
  private BeneficiariesGETResponseCreditorAccount creditorAccount = null;

  /**
   * A unique and immutable identifier used to identify the account resource. This identifier has no meaning to the account owner.
   **/
  
  @ApiModelProperty(value = "A unique and immutable identifier used to identify the account resource. This identifier has no meaning to the account owner.")
  @JsonProperty("AccountId")
 @Size(min=1,max=40)  public String getAccountId() {
    return accountId;
  }
  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  /**
   * A unique and immutable identifier used to identify the beneficiary resource. This identifier has no meaning to the account owner.
   **/
  
  @ApiModelProperty(value = "A unique and immutable identifier used to identify the beneficiary resource. This identifier has no meaning to the account owner.")
  @JsonProperty("BeneficiaryId")
 @Size(min=1,max=40)  public String getBeneficiaryId() {
    return beneficiaryId;
  }
  public void setBeneficiaryId(String beneficiaryId) {
    this.beneficiaryId = beneficiaryId;
  }

  /**
   * Unique reference, as assigned by the creditor, to unambiguously refer to the payment transaction. Usage: If available, the initiating party should provide this reference in the structured remittance information, to enable reconciliation by the creditor upon receipt of the amount of money. If the business context requires the use of a creditor reference or a payment remit identification, and only one identifier can be passed through the end-to-end chain, the creditor&#39;s reference or payment remittance identification should be quoted in the end-to-end transaction identification.
   **/
  
  @ApiModelProperty(value = "Unique reference, as assigned by the creditor, to unambiguously refer to the payment transaction. Usage: If available, the initiating party should provide this reference in the structured remittance information, to enable reconciliation by the creditor upon receipt of the amount of money. If the business context requires the use of a creditor reference or a payment remit identification, and only one identifier can be passed through the end-to-end chain, the creditor's reference or payment remittance identification should be quoted in the end-to-end transaction identification.")
  @JsonProperty("Reference")
 @Size(min=1,max=35)  public String getReference() {
    return reference;
  }
  public void setReference(String reference) {
    this.reference = reference;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("Servicer")
  public BeneficiariesGETResponseServicer getServicer() {
    return servicer;
  }
  public void setServicer(BeneficiariesGETResponseServicer servicer) {
    this.servicer = servicer;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("CreditorAccount")
  public BeneficiariesGETResponseCreditorAccount getCreditorAccount() {
    return creditorAccount;
  }
  public void setCreditorAccount(BeneficiariesGETResponseCreditorAccount creditorAccount) {
    this.creditorAccount = creditorAccount;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Beneficiary beneficiary = (Beneficiary) o;
    return Objects.equals(accountId, beneficiary.accountId) &&
        Objects.equals(beneficiaryId, beneficiary.beneficiaryId) &&
        Objects.equals(reference, beneficiary.reference) &&
        Objects.equals(servicer, beneficiary.servicer) &&
        Objects.equals(creditorAccount, beneficiary.creditorAccount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, beneficiaryId, reference, servicer, creditorAccount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Beneficiary {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    beneficiaryId: ").append(toIndentedString(beneficiaryId)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    servicer: ").append(toIndentedString(servicer)).append("\n");
    sb.append("    creditorAccount: ").append(toIndentedString(creditorAccount)).append("\n");
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

