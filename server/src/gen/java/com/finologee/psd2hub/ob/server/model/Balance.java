package com.finologee.psd2hub.ob.server.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.finologee.psd2hub.ob.server.model.BalancesGETResponseAmount;
import com.finologee.psd2hub.ob.server.model.BalancesGETResponseCreditLine;

import io.swagger.annotations.ApiModel;
import java.util.Date;
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@ApiModel(description="Balance")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2017-08-30T01:38:28.934+02:00")
public class Balance   {
  
  private String accountId = null;
  private BalancesGETResponseAmount amount = null;

  /**
   * Indicates whether the balance is a credit or a debit balance. Usage: A zero balance is considered to be a credit balance.
   */
  public enum CreditDebitIndicatorEnum {
    CREDIT("Credit"),

        DEBIT("Debit");
    private String value;

    CreditDebitIndicatorEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private CreditDebitIndicatorEnum creditDebitIndicator = null;

  /**
   * Balance type, in a coded form.
   */
  public enum TypeEnum {
    CLOSINGAVAILABLE("ClosingAvailable"),

        CLOSINGBOOKED("ClosingBooked"),

        EXPECTED("Expected"),

        FORWARDAVAILABLE("ForwardAvailable"),

        INFORMATION("Information"),

        INTERIMAVAILABLE("InterimAvailable"),

        INTERIMBOOKED("InterimBooked"),

        OPENINGAVAILABLE("OpeningAvailable"),

        OPENINGBOOKED("OpeningBooked"),

        PREVIOUSLYCLOSEDBOOKED("PreviouslyClosedBooked");
    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private TypeEnum type = null;
  private Date dateTime = null;
  private BalancesGETResponseCreditLine creditLine = null;

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
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("Amount")
  public BalancesGETResponseAmount getAmount() {
    return amount;
  }
  public void setAmount(BalancesGETResponseAmount amount) {
    this.amount = amount;
  }

  /**
   * Indicates whether the balance is a credit or a debit balance. Usage: A zero balance is considered to be a credit balance.
   **/
  
  @ApiModelProperty(required = true, value = "Indicates whether the balance is a credit or a debit balance. Usage: A zero balance is considered to be a credit balance.")
  @JsonProperty("CreditDebitIndicator")
  @NotNull
  public CreditDebitIndicatorEnum getCreditDebitIndicator() {
    return creditDebitIndicator;
  }
  public void setCreditDebitIndicator(CreditDebitIndicatorEnum creditDebitIndicator) {
    this.creditDebitIndicator = creditDebitIndicator;
  }

  /**
   * Balance type, in a coded form.
   **/
  
  @ApiModelProperty(required = true, value = "Balance type, in a coded form.")
  @JsonProperty("Type")
  @NotNull
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

  /**
   * Indicates the date (and time) of the balance.
   **/
  
  @ApiModelProperty(required = true, value = "Indicates the date (and time) of the balance.")
  @JsonProperty("DateTime")
  @NotNull
  public Date getDateTime() {
    return dateTime;
  }
  public void setDateTime(Date dateTime) {
    this.dateTime = dateTime;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("CreditLine")
  public BalancesGETResponseCreditLine getCreditLine() {
    return creditLine;
  }
  public void setCreditLine(BalancesGETResponseCreditLine creditLine) {
    this.creditLine = creditLine;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Balance balance = (Balance) o;
    return Objects.equals(accountId, balance.accountId) &&
        Objects.equals(amount, balance.amount) &&
        Objects.equals(creditDebitIndicator, balance.creditDebitIndicator) &&
        Objects.equals(type, balance.type) &&
        Objects.equals(dateTime, balance.dateTime) &&
        Objects.equals(creditLine, balance.creditLine);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, amount, creditDebitIndicator, type, dateTime, creditLine);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Balance {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    creditDebitIndicator: ").append(toIndentedString(creditDebitIndicator)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    dateTime: ").append(toIndentedString(dateTime)).append("\n");
    sb.append("    creditLine: ").append(toIndentedString(creditLine)).append("\n");
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

