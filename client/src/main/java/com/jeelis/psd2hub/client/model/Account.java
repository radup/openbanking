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
import com.jeelis.psd2hub.client.model.AccountGETResponseAccount;
import com.jeelis.psd2hub.client.model.AccountGETResponseServicer;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Account
 */
@ApiModel(description = "Account")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-30T02:03:16.815+02:00")
public class Account {
  @SerializedName("AccountId")
  private String accountId = null;

  @SerializedName("Currency")
  private String currency = null;

  @SerializedName("Nickname")
  private String nickname = null;

  @SerializedName("Account")
  private AccountGETResponseAccount account = null;

  @SerializedName("Servicer")
  private AccountGETResponseServicer servicer = null;

  public Account accountId(String accountId) {
    this.accountId = accountId;
    return this;
  }

   /**
   * A unique and immutable identifier used to identify the account resource. This identifier has no meaning to the account owner.
   * @return accountId
  **/
  @ApiModelProperty(required = true, value = "A unique and immutable identifier used to identify the account resource. This identifier has no meaning to the account owner.")
  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public Account currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Identification of the currency in which the account is held.  Usage: Currency should only be used in case one and the same account number covers several currencies and the initiating party needs to identify which currency needs to be used for settlement on the account.
   * @return currency
  **/
  @ApiModelProperty(required = true, value = "Identification of the currency in which the account is held.  Usage: Currency should only be used in case one and the same account number covers several currencies and the initiating party needs to identify which currency needs to be used for settlement on the account.")
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public Account nickname(String nickname) {
    this.nickname = nickname;
    return this;
  }

   /**
   * The nickname of the account, assigned by the account owner in order to provide an additional means of identification of the account.
   * @return nickname
  **/
  @ApiModelProperty(value = "The nickname of the account, assigned by the account owner in order to provide an additional means of identification of the account.")
  public String getNickname() {
    return nickname;
  }

  public void setNickname(String nickname) {
    this.nickname = nickname;
  }

  public Account account(AccountGETResponseAccount account) {
    this.account = account;
    return this;
  }

   /**
   * Get account
   * @return account
  **/
  @ApiModelProperty(value = "")
  public AccountGETResponseAccount getAccount() {
    return account;
  }

  public void setAccount(AccountGETResponseAccount account) {
    this.account = account;
  }

  public Account servicer(AccountGETResponseServicer servicer) {
    this.servicer = servicer;
    return this;
  }

   /**
   * Get servicer
   * @return servicer
  **/
  @ApiModelProperty(value = "")
  public AccountGETResponseServicer getServicer() {
    return servicer;
  }

  public void setServicer(AccountGETResponseServicer servicer) {
    this.servicer = servicer;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Account account = (Account) o;
    return Objects.equals(this.accountId, account.accountId) &&
        Objects.equals(this.currency, account.currency) &&
        Objects.equals(this.nickname, account.nickname) &&
        Objects.equals(this.account, account.account) &&
        Objects.equals(this.servicer, account.servicer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, currency, nickname, account, servicer);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Account {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    nickname: ").append(toIndentedString(nickname)).append("\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    servicer: ").append(toIndentedString(servicer)).append("\n");
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

