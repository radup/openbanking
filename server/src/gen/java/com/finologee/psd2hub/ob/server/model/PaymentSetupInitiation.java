package com.finologee.psd2hub.ob.server.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.finologee.psd2hub.ob.server.model.CreditorAccount;
import com.finologee.psd2hub.ob.server.model.CreditorAgent;
import com.finologee.psd2hub.ob.server.model.DebtorAccount;
import com.finologee.psd2hub.ob.server.model.DebtorAgent;
import com.finologee.psd2hub.ob.server.model.PaymentSetupInitiationInstructedAmount;
import com.finologee.psd2hub.ob.server.model.RemittanceInformation;
import com.fasterxml.jackson.annotation.JsonCreator;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@ApiModel(description="")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2017-08-30T01:37:21.257+02:00")
public class PaymentSetupInitiation   {
  
  private String instructionIdentification = null;
  private String endToEndIdentification = null;
  private PaymentSetupInitiationInstructedAmount instructedAmount = null;
  private DebtorAgent debtorAgent = null;
  private DebtorAccount debtorAccount = null;
  private CreditorAgent creditorAgent = null;
  private CreditorAccount creditorAccount = null;
  private RemittanceInformation remittanceInformation = null;

  /**
   * Unique identification as assigned by an instructing party for an instructed party to unambiguously identify the instruction. Usage: the  instruction identification is a point to point reference that can be used between the instructing party and the instructed party to refer to the individual instruction. It can be included in several messages related to the instruction.
   **/
  
  @ApiModelProperty(required = true, value = "Unique identification as assigned by an instructing party for an instructed party to unambiguously identify the instruction. Usage: the  instruction identification is a point to point reference that can be used between the instructing party and the instructed party to refer to the individual instruction. It can be included in several messages related to the instruction.")
  @JsonProperty("InstructionIdentification")
  @NotNull
 @Size(min=1,max=35)  public String getInstructionIdentification() {
    return instructionIdentification;
  }
  public void setInstructionIdentification(String instructionIdentification) {
    this.instructionIdentification = instructionIdentification;
  }

  /**
   * Unique identification assigned by the initiating party to unambiguously identify the transaction. This identification is passed on, unchanged, throughout the entire end-to-end chain. Usage: The end-to-end identification can be used for reconciliation or to link tasks relating to the transaction. It can be included in several messages related to the transaction. OB: The Faster Payments Scheme can only access 31 characters for the EndToEndIdentification field.
   **/
  
  @ApiModelProperty(required = true, value = "Unique identification assigned by the initiating party to unambiguously identify the transaction. This identification is passed on, unchanged, throughout the entire end-to-end chain. Usage: The end-to-end identification can be used for reconciliation or to link tasks relating to the transaction. It can be included in several messages related to the transaction. OB: The Faster Payments Scheme can only access 31 characters for the EndToEndIdentification field.")
  @JsonProperty("EndToEndIdentification")
  @NotNull
 @Size(min=1,max=35)  public String getEndToEndIdentification() {
    return endToEndIdentification;
  }
  public void setEndToEndIdentification(String endToEndIdentification) {
    this.endToEndIdentification = endToEndIdentification;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("InstructedAmount")
  public PaymentSetupInitiationInstructedAmount getInstructedAmount() {
    return instructedAmount;
  }
  public void setInstructedAmount(PaymentSetupInitiationInstructedAmount instructedAmount) {
    this.instructedAmount = instructedAmount;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("DebtorAgent")
  public DebtorAgent getDebtorAgent() {
    return debtorAgent;
  }
  public void setDebtorAgent(DebtorAgent debtorAgent) {
    this.debtorAgent = debtorAgent;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("DebtorAccount")
  public DebtorAccount getDebtorAccount() {
    return debtorAccount;
  }
  public void setDebtorAccount(DebtorAccount debtorAccount) {
    this.debtorAccount = debtorAccount;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("CreditorAgent")
  public CreditorAgent getCreditorAgent() {
    return creditorAgent;
  }
  public void setCreditorAgent(CreditorAgent creditorAgent) {
    this.creditorAgent = creditorAgent;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("CreditorAccount")
  public CreditorAccount getCreditorAccount() {
    return creditorAccount;
  }
  public void setCreditorAccount(CreditorAccount creditorAccount) {
    this.creditorAccount = creditorAccount;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("RemittanceInformation")
  public RemittanceInformation getRemittanceInformation() {
    return remittanceInformation;
  }
  public void setRemittanceInformation(RemittanceInformation remittanceInformation) {
    this.remittanceInformation = remittanceInformation;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentSetupInitiation paymentSetupInitiation = (PaymentSetupInitiation) o;
    return Objects.equals(instructionIdentification, paymentSetupInitiation.instructionIdentification) &&
        Objects.equals(endToEndIdentification, paymentSetupInitiation.endToEndIdentification) &&
        Objects.equals(instructedAmount, paymentSetupInitiation.instructedAmount) &&
        Objects.equals(debtorAgent, paymentSetupInitiation.debtorAgent) &&
        Objects.equals(debtorAccount, paymentSetupInitiation.debtorAccount) &&
        Objects.equals(creditorAgent, paymentSetupInitiation.creditorAgent) &&
        Objects.equals(creditorAccount, paymentSetupInitiation.creditorAccount) &&
        Objects.equals(remittanceInformation, paymentSetupInitiation.remittanceInformation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(instructionIdentification, endToEndIdentification, instructedAmount, debtorAgent, debtorAccount, creditorAgent, creditorAccount, remittanceInformation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentSetupInitiation {\n");
    
    sb.append("    instructionIdentification: ").append(toIndentedString(instructionIdentification)).append("\n");
    sb.append("    endToEndIdentification: ").append(toIndentedString(endToEndIdentification)).append("\n");
    sb.append("    instructedAmount: ").append(toIndentedString(instructedAmount)).append("\n");
    sb.append("    debtorAgent: ").append(toIndentedString(debtorAgent)).append("\n");
    sb.append("    debtorAccount: ").append(toIndentedString(debtorAccount)).append("\n");
    sb.append("    creditorAgent: ").append(toIndentedString(creditorAgent)).append("\n");
    sb.append("    creditorAccount: ").append(toIndentedString(creditorAccount)).append("\n");
    sb.append("    remittanceInformation: ").append(toIndentedString(remittanceInformation)).append("\n");
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

