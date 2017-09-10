package com.finologee.psd2hub.ob.server.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.finologee.psd2hub.ob.server.model.AccountTransactionsGETResponseAmount;
import com.finologee.psd2hub.ob.server.model.AccountTransactionsGETResponseBalance;
import com.finologee.psd2hub.ob.server.model.AccountTransactionsGETResponseBankTransactionCode;
import com.finologee.psd2hub.ob.server.model.AccountTransactionsGETResponseMerchantDetails;
import com.finologee.psd2hub.ob.server.model.AccountTransactionsGETResponseProprietaryBankTransactionCode;

import java.util.Date;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2017-08-30T01:38:28.934+02:00")
public class AccountTransactionsGETResponseData   {
  
  private String accountId = null;
  private String transactionId = null;
  private String transactionReference = null;
  private AccountTransactionsGETResponseAmount amount = null;

  /**
   * Indicates whether the transaction is a credit or a debit entry.
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
   * Status of a transaction entry on the books of the account servicer.
   */
  public enum StatusEnum {
    BOOKED("Booked"),

        PENDING("Pending");
    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private StatusEnum status = null;
  private Date bookingDateTime = null;
  private Date valueDateTime = null;
  private String transactionInformation = null;
  private String addressLine = null;
  private AccountTransactionsGETResponseBankTransactionCode bankTransactionCode = null;
  private AccountTransactionsGETResponseProprietaryBankTransactionCode proprietaryBankTransactionCode = null;
  private AccountTransactionsGETResponseBalance balance = null;
  private AccountTransactionsGETResponseMerchantDetails merchantDetails = null;

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
   * Unique identifier for the transaction within an servicing institution. This identifier is both unique and immutable.
   **/
  
  @ApiModelProperty(value = "Unique identifier for the transaction within an servicing institution. This identifier is both unique and immutable.")
  @JsonProperty("TransactionId")
 @Size(min=1,max=40)  public String getTransactionId() {
    return transactionId;
  }
  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }

  /**
   * Unique reference for the transaction. This reference is optionally populated, and may as an example be the FPID in the Faster Payments context.
   **/
  
  @ApiModelProperty(value = "Unique reference for the transaction. This reference is optionally populated, and may as an example be the FPID in the Faster Payments context.")
  @JsonProperty("TransactionReference")
 @Size(min=1,max=35)  public String getTransactionReference() {
    return transactionReference;
  }
  public void setTransactionReference(String transactionReference) {
    this.transactionReference = transactionReference;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("Amount")
  public AccountTransactionsGETResponseAmount getAmount() {
    return amount;
  }
  public void setAmount(AccountTransactionsGETResponseAmount amount) {
    this.amount = amount;
  }

  /**
   * Indicates whether the transaction is a credit or a debit entry.
   **/
  
  @ApiModelProperty(required = true, value = "Indicates whether the transaction is a credit or a debit entry.")
  @JsonProperty("CreditDebitIndicator")
  @NotNull
  public CreditDebitIndicatorEnum getCreditDebitIndicator() {
    return creditDebitIndicator;
  }
  public void setCreditDebitIndicator(CreditDebitIndicatorEnum creditDebitIndicator) {
    this.creditDebitIndicator = creditDebitIndicator;
  }

  /**
   * Status of a transaction entry on the books of the account servicer.
   **/
  
  @ApiModelProperty(required = true, value = "Status of a transaction entry on the books of the account servicer.")
  @JsonProperty("Status")
  @NotNull
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  /**
   * Date and time when a transaction entry is posted to an account on the account servicer&#39;s books. Usage: Booking date is the expected booking date, unless the status is booked, in which case it is the actual booking date.
   **/
  
  @ApiModelProperty(required = true, value = "Date and time when a transaction entry is posted to an account on the account servicer's books. Usage: Booking date is the expected booking date, unless the status is booked, in which case it is the actual booking date.")
  @JsonProperty("BookingDateTime")
  @NotNull
  public Date getBookingDateTime() {
    return bookingDateTime;
  }
  public void setBookingDateTime(Date bookingDateTime) {
    this.bookingDateTime = bookingDateTime;
  }

  /**
   * Date and time at which assets become available to the account owner in case of a credit entry, or cease to be available to the account owner in case of a debit entry.  Usage: If entry status is pending and value date is present, then the value date refers to an expected/requested value date. For entries subject to availability/float and for which availability information is provided, the value date must not be used. In this case the availability component identifies the  number of availability days.
   **/
  
  @ApiModelProperty(value = "Date and time at which assets become available to the account owner in case of a credit entry, or cease to be available to the account owner in case of a debit entry.  Usage: If entry status is pending and value date is present, then the value date refers to an expected/requested value date. For entries subject to availability/float and for which availability information is provided, the value date must not be used. In this case the availability component identifies the  number of availability days.")
  @JsonProperty("ValueDateTime")
  public Date getValueDateTime() {
    return valueDateTime;
  }
  public void setValueDateTime(Date valueDateTime) {
    this.valueDateTime = valueDateTime;
  }

  /**
   * Further details of the transaction. This is the transaction narrative, which is unstructured text.
   **/
  
  @ApiModelProperty(value = "Further details of the transaction. This is the transaction narrative, which is unstructured text.")
  @JsonProperty("TransactionInformation")
 @Size(min=1,max=500)  public String getTransactionInformation() {
    return transactionInformation;
  }
  public void setTransactionInformation(String transactionInformation) {
    this.transactionInformation = transactionInformation;
  }

  /**
   * Information that locates and identifies a specific address, as defined by postal services, that is presented in free format text.
   **/
  
  @ApiModelProperty(value = "Information that locates and identifies a specific address, as defined by postal services, that is presented in free format text.")
  @JsonProperty("AddressLine")
 @Size(min=1,max=70)  public String getAddressLine() {
    return addressLine;
  }
  public void setAddressLine(String addressLine) {
    this.addressLine = addressLine;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("BankTransactionCode")
  public AccountTransactionsGETResponseBankTransactionCode getBankTransactionCode() {
    return bankTransactionCode;
  }
  public void setBankTransactionCode(AccountTransactionsGETResponseBankTransactionCode bankTransactionCode) {
    this.bankTransactionCode = bankTransactionCode;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("ProprietaryBankTransactionCode")
  public AccountTransactionsGETResponseProprietaryBankTransactionCode getProprietaryBankTransactionCode() {
    return proprietaryBankTransactionCode;
  }
  public void setProprietaryBankTransactionCode(AccountTransactionsGETResponseProprietaryBankTransactionCode proprietaryBankTransactionCode) {
    this.proprietaryBankTransactionCode = proprietaryBankTransactionCode;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("Balance")
  public AccountTransactionsGETResponseBalance getBalance() {
    return balance;
  }
  public void setBalance(AccountTransactionsGETResponseBalance balance) {
    this.balance = balance;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("MerchantDetails")
  public AccountTransactionsGETResponseMerchantDetails getMerchantDetails() {
    return merchantDetails;
  }
  public void setMerchantDetails(AccountTransactionsGETResponseMerchantDetails merchantDetails) {
    this.merchantDetails = merchantDetails;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountTransactionsGETResponseData accountTransactionsGETResponseData = (AccountTransactionsGETResponseData) o;
    return Objects.equals(accountId, accountTransactionsGETResponseData.accountId) &&
        Objects.equals(transactionId, accountTransactionsGETResponseData.transactionId) &&
        Objects.equals(transactionReference, accountTransactionsGETResponseData.transactionReference) &&
        Objects.equals(amount, accountTransactionsGETResponseData.amount) &&
        Objects.equals(creditDebitIndicator, accountTransactionsGETResponseData.creditDebitIndicator) &&
        Objects.equals(status, accountTransactionsGETResponseData.status) &&
        Objects.equals(bookingDateTime, accountTransactionsGETResponseData.bookingDateTime) &&
        Objects.equals(valueDateTime, accountTransactionsGETResponseData.valueDateTime) &&
        Objects.equals(transactionInformation, accountTransactionsGETResponseData.transactionInformation) &&
        Objects.equals(addressLine, accountTransactionsGETResponseData.addressLine) &&
        Objects.equals(bankTransactionCode, accountTransactionsGETResponseData.bankTransactionCode) &&
        Objects.equals(proprietaryBankTransactionCode, accountTransactionsGETResponseData.proprietaryBankTransactionCode) &&
        Objects.equals(balance, accountTransactionsGETResponseData.balance) &&
        Objects.equals(merchantDetails, accountTransactionsGETResponseData.merchantDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, transactionId, transactionReference, amount, creditDebitIndicator, status, bookingDateTime, valueDateTime, transactionInformation, addressLine, bankTransactionCode, proprietaryBankTransactionCode, balance, merchantDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountTransactionsGETResponseData {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    transactionReference: ").append(toIndentedString(transactionReference)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    creditDebitIndicator: ").append(toIndentedString(creditDebitIndicator)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    bookingDateTime: ").append(toIndentedString(bookingDateTime)).append("\n");
    sb.append("    valueDateTime: ").append(toIndentedString(valueDateTime)).append("\n");
    sb.append("    transactionInformation: ").append(toIndentedString(transactionInformation)).append("\n");
    sb.append("    addressLine: ").append(toIndentedString(addressLine)).append("\n");
    sb.append("    bankTransactionCode: ").append(toIndentedString(bankTransactionCode)).append("\n");
    sb.append("    proprietaryBankTransactionCode: ").append(toIndentedString(proprietaryBankTransactionCode)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    merchantDetails: ").append(toIndentedString(merchantDetails)).append("\n");
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

