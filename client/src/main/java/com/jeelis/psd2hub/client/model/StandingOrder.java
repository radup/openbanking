/*
 * Account Information APIs
 * Swagger specification for Account Information APIs
 *
 * OpenAPI spec version: v1.0.0
 * Contact: Craig.Greenhouse@openbanking.org.uk
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.jeelis.psd2hub.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.jeelis.psd2hub.client.model.BeneficiariesGETResponseCreditorAccount;
import com.jeelis.psd2hub.client.model.StandingOrdersGETResponseFinalPaymentAmount;
import com.jeelis.psd2hub.client.model.StandingOrdersGETResponseFirstPaymentAmount;
import com.jeelis.psd2hub.client.model.StandingOrdersGETResponseNextPaymentAmount;
import com.jeelis.psd2hub.client.model.StandingOrdersGETResponseServicer;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.joda.time.DateTime;

/**
 * Standing Order
 */
@ApiModel(description = "Standing Order")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-30T02:03:16.815+02:00")
public class StandingOrder {
  @SerializedName("AccountId")
  private String accountId = null;

  @SerializedName("StandingOrderId")
  private String standingOrderId = null;

  @SerializedName("Frequency")
  private String frequency = null;

  @SerializedName("Reference")
  private String reference = null;

  @SerializedName("FirstPaymentDateTime")
  private DateTime firstPaymentDateTime = null;

  @SerializedName("FirstPaymentAmount")
  private StandingOrdersGETResponseFirstPaymentAmount firstPaymentAmount = null;

  @SerializedName("NextPaymentDateTime")
  private DateTime nextPaymentDateTime = null;

  @SerializedName("NextPaymentAmount")
  private StandingOrdersGETResponseNextPaymentAmount nextPaymentAmount = null;

  @SerializedName("FinalPaymentDateTime")
  private DateTime finalPaymentDateTime = null;

  @SerializedName("FinalPaymentAmount")
  private StandingOrdersGETResponseFinalPaymentAmount finalPaymentAmount = null;

  @SerializedName("Servicer")
  private StandingOrdersGETResponseServicer servicer = null;

  @SerializedName("CreditorAccount")
  private BeneficiariesGETResponseCreditorAccount creditorAccount = null;

  public StandingOrder accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * The date on which the first payment for a Standing Order schedule will be made.
   * @return accountId
  **/
  @ApiModelProperty(required = true, value = "The date on which the first payment for a Standing Order schedule will be made.")
  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public StandingOrder standingOrderId(String standingOrderId) {
    this.standingOrderId = standingOrderId;
    return this;
  }

   /**
   * A unique and immutable identifier used to identify the standing order resource. This identifier has no meaning to the account owner.
   * @return standingOrderId
  **/
  @ApiModelProperty(value = "A unique and immutable identifier used to identify the standing order resource. This identifier has no meaning to the account owner.")
  public String getStandingOrderId() {
    return standingOrderId;
  }

  public void setStandingOrderId(String standingOrderId) {
    this.standingOrderId = standingOrderId;
  }

  public StandingOrder frequency(String frequency) {
    this.frequency = frequency;
    return this;
  }

   /**
   * EvryWorkgDay - PSC070 IntrvlWkDay:PSC110:PSC080 (PSC070 code + PSC110 + PSC080) WkInMnthDay:PSC100:PSC080 (PSC070 code + PSC100 + PSC080) IntrvlMnthDay:PSC120:PSC090 (PSC070 code + PSC120 + PSC090) QtrDay: + either (ENGLISH, SCOTTISH or RECEIVED) PSC070 + PSC130 The following response codes may be generated by this data element: PSC070: T221 - Schedule code must be a valid enumeration value. PSC070: T245 - Must be provided for standing order only. PSC080: T222 - Day in week must be within defined bounds (range 1 to 5). PSC080: T229 - Must be present if Schedule Code &#x3D; IntrvlWkDay. PSC080: T231 - Must be present if Schedule Code &#x3D; WkInMnthDay. PSC090: T223 - Day in month must be within defined bounds (range -5 to 31 excluding: 0 &amp; 00). PSC090: T233 - Must be present if Schedule Code &#x3D; IntrvlMnthDay. PSC100: T224 - Week in month must be within defined bounds (range 1 to 5). PSC100: T232 - Must be present if Schedule Code &#x3D; WkInMnthDay. PSC110: T225 - Interval in weeks must be within defined bounds (range 1 to 9). PSC110: T230 - Must be present if Schedule Code &#x3D; IntrvlWkDay. PSC120: T226 - Interval in months must be a valid enumeration value (range 1 to 6, 12 and 24). PSC120: T234 - Must be present if Schedule Code &#x3D; IntrvlMnthDay. PSC130: T227 - Quarter Day must be a valid enumeration value. PSC130: T235 - Must be present if Schedule Code &#x3D; QtrDay. The regular expression for this element combines five smaller versions for each permitted pattern. To aid legibility - the components are presented individually here: EvryWorkgDay IntrvlWkDay:0[1-9]:0[1-5] WkInMnthDay:0[1-5]:0[1-5] IntrvlMnthDay:(0[1-6]|12|24):(-0[1-5]|0[1-9]|[12][0-9]|3[01]) QtrDay:(ENGLISH|SCOTTISH|RECEIVED) Mandatory/Conditional/Optional/Parent/Leaf: OL Type: 35 char string Regular Expression(s): (EvryWorkgDay)|(IntrvlWkDay:0[1-9]:0[1-5])|(WkInMnthDay:0[1-5]:0[1-5])|(IntrvlMnthDay:(0[1- 6]|12|24):(-0[1-5]|0[1-9]|[12][0-9]|3[01]))|(QtrDay:(ENGLISH|SCOTTISH|RECEIVED))
   * @return frequency
  **/
  @ApiModelProperty(required = true, value = "EvryWorkgDay - PSC070 IntrvlWkDay:PSC110:PSC080 (PSC070 code + PSC110 + PSC080) WkInMnthDay:PSC100:PSC080 (PSC070 code + PSC100 + PSC080) IntrvlMnthDay:PSC120:PSC090 (PSC070 code + PSC120 + PSC090) QtrDay: + either (ENGLISH, SCOTTISH or RECEIVED) PSC070 + PSC130 The following response codes may be generated by this data element: PSC070: T221 - Schedule code must be a valid enumeration value. PSC070: T245 - Must be provided for standing order only. PSC080: T222 - Day in week must be within defined bounds (range 1 to 5). PSC080: T229 - Must be present if Schedule Code = IntrvlWkDay. PSC080: T231 - Must be present if Schedule Code = WkInMnthDay. PSC090: T223 - Day in month must be within defined bounds (range -5 to 31 excluding: 0 & 00). PSC090: T233 - Must be present if Schedule Code = IntrvlMnthDay. PSC100: T224 - Week in month must be within defined bounds (range 1 to 5). PSC100: T232 - Must be present if Schedule Code = WkInMnthDay. PSC110: T225 - Interval in weeks must be within defined bounds (range 1 to 9). PSC110: T230 - Must be present if Schedule Code = IntrvlWkDay. PSC120: T226 - Interval in months must be a valid enumeration value (range 1 to 6, 12 and 24). PSC120: T234 - Must be present if Schedule Code = IntrvlMnthDay. PSC130: T227 - Quarter Day must be a valid enumeration value. PSC130: T235 - Must be present if Schedule Code = QtrDay. The regular expression for this element combines five smaller versions for each permitted pattern. To aid legibility - the components are presented individually here: EvryWorkgDay IntrvlWkDay:0[1-9]:0[1-5] WkInMnthDay:0[1-5]:0[1-5] IntrvlMnthDay:(0[1-6]|12|24):(-0[1-5]|0[1-9]|[12][0-9]|3[01]) QtrDay:(ENGLISH|SCOTTISH|RECEIVED) Mandatory/Conditional/Optional/Parent/Leaf: OL Type: 35 char string Regular Expression(s): (EvryWorkgDay)|(IntrvlWkDay:0[1-9]:0[1-5])|(WkInMnthDay:0[1-5]:0[1-5])|(IntrvlMnthDay:(0[1- 6]|12|24):(-0[1-5]|0[1-9]|[12][0-9]|3[01]))|(QtrDay:(ENGLISH|SCOTTISH|RECEIVED))")
  public String getFrequency() {
    return frequency;
  }

  public void setFrequency(String frequency) {
    this.frequency = frequency;
  }

  public StandingOrder reference(String reference) {
    this.reference = reference;
    return this;
  }

   /**
   * Unique reference, as assigned by the creditor, to unambiguously refer to the payment transaction. Usage: If available, the initiating party should provide this reference in the structured remittance information, to enable reconciliation by the creditor upon receipt of the amount of money. If the business context requires the use of a creditor reference or a payment remit identification, and only one identifier can be passed through the end-to-end chain, the creditor&#39;s reference or payment remittance identification should be quoted in the end-to-end transaction identification.
   * @return reference
  **/
  @ApiModelProperty(value = "Unique reference, as assigned by the creditor, to unambiguously refer to the payment transaction. Usage: If available, the initiating party should provide this reference in the structured remittance information, to enable reconciliation by the creditor upon receipt of the amount of money. If the business context requires the use of a creditor reference or a payment remit identification, and only one identifier can be passed through the end-to-end chain, the creditor's reference or payment remittance identification should be quoted in the end-to-end transaction identification.")
  public String getReference() {
    return reference;
  }

  public void setReference(String reference) {
    this.reference = reference;
  }

  public StandingOrder firstPaymentDateTime(DateTime firstPaymentDateTime) {
    this.firstPaymentDateTime = firstPaymentDateTime;
    return this;
  }

   /**
   * The date on which the first payment for a Standing Order schedule will be made.
   * @return firstPaymentDateTime
  **/
  @ApiModelProperty(value = "The date on which the first payment for a Standing Order schedule will be made.")
  public DateTime getFirstPaymentDateTime() {
    return firstPaymentDateTime;
  }

  public void setFirstPaymentDateTime(DateTime firstPaymentDateTime) {
    this.firstPaymentDateTime = firstPaymentDateTime;
  }

  public StandingOrder firstPaymentAmount(StandingOrdersGETResponseFirstPaymentAmount firstPaymentAmount) {
    this.firstPaymentAmount = firstPaymentAmount;
    return this;
  }

   /**
   * Get firstPaymentAmount
   * @return firstPaymentAmount
  **/
  @ApiModelProperty(value = "")
  public StandingOrdersGETResponseFirstPaymentAmount getFirstPaymentAmount() {
    return firstPaymentAmount;
  }

  public void setFirstPaymentAmount(StandingOrdersGETResponseFirstPaymentAmount firstPaymentAmount) {
    this.firstPaymentAmount = firstPaymentAmount;
  }

  public StandingOrder nextPaymentDateTime(DateTime nextPaymentDateTime) {
    this.nextPaymentDateTime = nextPaymentDateTime;
    return this;
  }

   /**
   * The date on which the next payment for a Standing Order schedule will be made.
   * @return nextPaymentDateTime
  **/
  @ApiModelProperty(required = true, value = "The date on which the next payment for a Standing Order schedule will be made.")
  public DateTime getNextPaymentDateTime() {
    return nextPaymentDateTime;
  }

  public void setNextPaymentDateTime(DateTime nextPaymentDateTime) {
    this.nextPaymentDateTime = nextPaymentDateTime;
  }

  public StandingOrder nextPaymentAmount(StandingOrdersGETResponseNextPaymentAmount nextPaymentAmount) {
    this.nextPaymentAmount = nextPaymentAmount;
    return this;
  }

   /**
   * Get nextPaymentAmount
   * @return nextPaymentAmount
  **/
  @ApiModelProperty(value = "")
  public StandingOrdersGETResponseNextPaymentAmount getNextPaymentAmount() {
    return nextPaymentAmount;
  }

  public void setNextPaymentAmount(StandingOrdersGETResponseNextPaymentAmount nextPaymentAmount) {
    this.nextPaymentAmount = nextPaymentAmount;
  }

  public StandingOrder finalPaymentDateTime(DateTime finalPaymentDateTime) {
    this.finalPaymentDateTime = finalPaymentDateTime;
    return this;
  }

   /**
   * The date on which the final payment for a Standing Order schedule will be made.
   * @return finalPaymentDateTime
  **/
  @ApiModelProperty(value = "The date on which the final payment for a Standing Order schedule will be made.")
  public DateTime getFinalPaymentDateTime() {
    return finalPaymentDateTime;
  }

  public void setFinalPaymentDateTime(DateTime finalPaymentDateTime) {
    this.finalPaymentDateTime = finalPaymentDateTime;
  }

  public StandingOrder finalPaymentAmount(StandingOrdersGETResponseFinalPaymentAmount finalPaymentAmount) {
    this.finalPaymentAmount = finalPaymentAmount;
    return this;
  }

   /**
   * Get finalPaymentAmount
   * @return finalPaymentAmount
  **/
  @ApiModelProperty(value = "")
  public StandingOrdersGETResponseFinalPaymentAmount getFinalPaymentAmount() {
    return finalPaymentAmount;
  }

  public void setFinalPaymentAmount(StandingOrdersGETResponseFinalPaymentAmount finalPaymentAmount) {
    this.finalPaymentAmount = finalPaymentAmount;
  }

  public StandingOrder servicer(StandingOrdersGETResponseServicer servicer) {
    this.servicer = servicer;
    return this;
  }

   /**
   * Get servicer
   * @return servicer
  **/
  @ApiModelProperty(value = "")
  public StandingOrdersGETResponseServicer getServicer() {
    return servicer;
  }

  public void setServicer(StandingOrdersGETResponseServicer servicer) {
    this.servicer = servicer;
  }

  public StandingOrder creditorAccount(BeneficiariesGETResponseCreditorAccount creditorAccount) {
    this.creditorAccount = creditorAccount;
    return this;
  }

   /**
   * Get creditorAccount
   * @return creditorAccount
  **/
  @ApiModelProperty(value = "")
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
    StandingOrder standingOrder = (StandingOrder) o;
    return Objects.equals(this.accountId, standingOrder.accountId) &&
        Objects.equals(this.standingOrderId, standingOrder.standingOrderId) &&
        Objects.equals(this.frequency, standingOrder.frequency) &&
        Objects.equals(this.reference, standingOrder.reference) &&
        Objects.equals(this.firstPaymentDateTime, standingOrder.firstPaymentDateTime) &&
        Objects.equals(this.firstPaymentAmount, standingOrder.firstPaymentAmount) &&
        Objects.equals(this.nextPaymentDateTime, standingOrder.nextPaymentDateTime) &&
        Objects.equals(this.nextPaymentAmount, standingOrder.nextPaymentAmount) &&
        Objects.equals(this.finalPaymentDateTime, standingOrder.finalPaymentDateTime) &&
        Objects.equals(this.finalPaymentAmount, standingOrder.finalPaymentAmount) &&
        Objects.equals(this.servicer, standingOrder.servicer) &&
        Objects.equals(this.creditorAccount, standingOrder.creditorAccount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, standingOrderId, frequency, reference, firstPaymentDateTime, firstPaymentAmount, nextPaymentDateTime, nextPaymentAmount, finalPaymentDateTime, finalPaymentAmount, servicer, creditorAccount);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StandingOrder {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    standingOrderId: ").append(toIndentedString(standingOrderId)).append("\n");
    sb.append("    frequency: ").append(toIndentedString(frequency)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    firstPaymentDateTime: ").append(toIndentedString(firstPaymentDateTime)).append("\n");
    sb.append("    firstPaymentAmount: ").append(toIndentedString(firstPaymentAmount)).append("\n");
    sb.append("    nextPaymentDateTime: ").append(toIndentedString(nextPaymentDateTime)).append("\n");
    sb.append("    nextPaymentAmount: ").append(toIndentedString(nextPaymentAmount)).append("\n");
    sb.append("    finalPaymentDateTime: ").append(toIndentedString(finalPaymentDateTime)).append("\n");
    sb.append("    finalPaymentAmount: ").append(toIndentedString(finalPaymentAmount)).append("\n");
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

