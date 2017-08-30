package com.jeelis.psd2hub.server.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.jeelis.psd2hub.server.model.AccountTransactionsGETResponseBalanceAmount;
import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@ApiModel(description="Set of elements used to define the balance as a numerical representation of the net increases and decreases in an account after a transaction entry is applied to the account.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2017-08-30T01:38:28.934+02:00")
public class AccountTransactionsGETResponseBalance   {
  
  private AccountTransactionsGETResponseBalanceAmount amount = null;

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

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("Amount")
  public AccountTransactionsGETResponseBalanceAmount getAmount() {
    return amount;
  }
  public void setAmount(AccountTransactionsGETResponseBalanceAmount amount) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountTransactionsGETResponseBalance accountTransactionsGETResponseBalance = (AccountTransactionsGETResponseBalance) o;
    return Objects.equals(amount, accountTransactionsGETResponseBalance.amount) &&
        Objects.equals(creditDebitIndicator, accountTransactionsGETResponseBalance.creditDebitIndicator) &&
        Objects.equals(type, accountTransactionsGETResponseBalance.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, creditDebitIndicator, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountTransactionsGETResponseBalance {\n");
    
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    creditDebitIndicator: ").append(toIndentedString(creditDebitIndicator)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

