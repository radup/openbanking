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


package com.finologee.psd2hub.ob.client.model;

import java.util.Objects;

import com.finologee.psd2hub.ob.client.model.AccountGETResponse1PreviousPaymentAmount;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.joda.time.DateTime;

/**
 * Direct Debit
 */
@ApiModel(description = "Direct Debit")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-30T02:03:16.815+02:00")
public class DirectDebit {
  @SerializedName("AccountId")
  private String accountId = null;

  @SerializedName("DirectDebitId")
  private String directDebitId = null;

  @SerializedName("MandateIdentification")
  private String mandateIdentification = null;

  /**
   * Specifies the status of the direct debit in code form.
   */
  @JsonAdapter(DirectDebitStatusCodeEnum.Adapter.class)
  public enum DirectDebitStatusCodeEnum {
    ACTIVE("Active"),
    
    INACTIVE("Inactive");

    private String value;

    DirectDebitStatusCodeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static DirectDebitStatusCodeEnum fromValue(String text) {
      for (DirectDebitStatusCodeEnum b : DirectDebitStatusCodeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<DirectDebitStatusCodeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final DirectDebitStatusCodeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public DirectDebitStatusCodeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return DirectDebitStatusCodeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("DirectDebitStatusCode")
  private DirectDebitStatusCodeEnum directDebitStatusCode = null;

  @SerializedName("Name")
  private String name = null;

  @SerializedName("PreviousPaymentDateTime")
  private DateTime previousPaymentDateTime = null;

  @SerializedName("PreviousPaymentAmount")
  private AccountGETResponse1PreviousPaymentAmount previousPaymentAmount = null;

  public DirectDebit accountId(String accountId) {
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

  public DirectDebit directDebitId(String directDebitId) {
    this.directDebitId = directDebitId;
    return this;
  }

   /**
   * A unique and immutable identifier used to identify the direct debit resource. This identifier has no meaning to the account owner.
   * @return directDebitId
  **/
  @ApiModelProperty(value = "A unique and immutable identifier used to identify the direct debit resource. This identifier has no meaning to the account owner.")
  public String getDirectDebitId() {
    return directDebitId;
  }

  public void setDirectDebitId(String directDebitId) {
    this.directDebitId = directDebitId;
  }

  public DirectDebit mandateIdentification(String mandateIdentification) {
    this.mandateIdentification = mandateIdentification;
    return this;
  }

   /**
   * Direct Debit reference. For AUDDIS service users provide Core Reference. For non AUDDIS service users provide Core reference if possible or last used reference.
   * @return mandateIdentification
  **/
  @ApiModelProperty(required = true, value = "Direct Debit reference. For AUDDIS service users provide Core Reference. For non AUDDIS service users provide Core reference if possible or last used reference.")
  public String getMandateIdentification() {
    return mandateIdentification;
  }

  public void setMandateIdentification(String mandateIdentification) {
    this.mandateIdentification = mandateIdentification;
  }

  public DirectDebit directDebitStatusCode(DirectDebitStatusCodeEnum directDebitStatusCode) {
    this.directDebitStatusCode = directDebitStatusCode;
    return this;
  }

   /**
   * Specifies the status of the direct debit in code form.
   * @return directDebitStatusCode
  **/
  @ApiModelProperty(value = "Specifies the status of the direct debit in code form.")
  public DirectDebitStatusCodeEnum getDirectDebitStatusCode() {
    return directDebitStatusCode;
  }

  public void setDirectDebitStatusCode(DirectDebitStatusCodeEnum directDebitStatusCode) {
    this.directDebitStatusCode = directDebitStatusCode;
  }

  public DirectDebit name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of Service User
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name of Service User")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DirectDebit previousPaymentDateTime(DateTime previousPaymentDateTime) {
    this.previousPaymentDateTime = previousPaymentDateTime;
    return this;
  }

   /**
   * Date of most recent direct debit collection.
   * @return previousPaymentDateTime
  **/
  @ApiModelProperty(value = "Date of most recent direct debit collection.")
  public DateTime getPreviousPaymentDateTime() {
    return previousPaymentDateTime;
  }

  public void setPreviousPaymentDateTime(DateTime previousPaymentDateTime) {
    this.previousPaymentDateTime = previousPaymentDateTime;
  }

  public DirectDebit previousPaymentAmount(AccountGETResponse1PreviousPaymentAmount previousPaymentAmount) {
    this.previousPaymentAmount = previousPaymentAmount;
    return this;
  }

   /**
   * Get previousPaymentAmount
   * @return previousPaymentAmount
  **/
  @ApiModelProperty(value = "")
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
    return Objects.equals(this.accountId, directDebit.accountId) &&
        Objects.equals(this.directDebitId, directDebit.directDebitId) &&
        Objects.equals(this.mandateIdentification, directDebit.mandateIdentification) &&
        Objects.equals(this.directDebitStatusCode, directDebit.directDebitStatusCode) &&
        Objects.equals(this.name, directDebit.name) &&
        Objects.equals(this.previousPaymentDateTime, directDebit.previousPaymentDateTime) &&
        Objects.equals(this.previousPaymentAmount, directDebit.previousPaymentAmount);
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

