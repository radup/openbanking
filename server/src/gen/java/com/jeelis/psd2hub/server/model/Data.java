package com.jeelis.psd2hub.server.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import java.util.Date;
import java.util.List;
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@ApiModel(description="Allows setup of an account access request")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2017-08-30T01:38:28.934+02:00")
public class Data   {
  

  /**
   * Specifies the Open Banking account request types. This is a list of the data clusters being consented by the PSU, and requested for authorisation with the ASPSP.
   */
  public enum PermissionsEnum {
    READACCOUNTSBASIC("ReadAccountsBasic"),

        READACCOUNTSDETAIL("ReadAccountsDetail"),

        READBALANCES("ReadBalances"),

        READBENEFICIARIESBASIC("ReadBeneficiariesBasic"),

        READBENEFICIARIESDETAIL("ReadBeneficiariesDetail"),

        READDIRECTDEBITS("ReadDirectDebits"),

        READPRODUCTS("ReadProducts"),

        READSTANDINGORDERSBASIC("ReadStandingOrdersBasic"),

        READSTANDINGORDERSDETAIL("ReadStandingOrdersDetail"),

        READTRANSACTIONSBASIC("ReadTransactionsBasic"),

        READTRANSACTIONSCREDITS("ReadTransactionsCredits"),

        READTRANSACTIONSDEBITS("ReadTransactionsDebits"),

        READTRANSACTIONSDETAIL("ReadTransactionsDetail");
    private String value;

    PermissionsEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private List<PermissionsEnum> permissions = new ArrayList<PermissionsEnum>();
  private Date expirationDateTime = null;
  private Date transactionFromDateTime = null;
  private Date transactionToDateTime = null;

  /**
   * Specifies the Open Banking account request types. This is a list of the data clusters being consented by the PSU, and requested for authorisation with the ASPSP.
   **/
  
  @ApiModelProperty(required = true, value = "Specifies the Open Banking account request types. This is a list of the data clusters being consented by the PSU, and requested for authorisation with the ASPSP.")
  @JsonProperty("Permissions")
  @NotNull
  public List<PermissionsEnum> getPermissions() {
    return permissions;
  }
  public void setPermissions(List<PermissionsEnum> permissions) {
    this.permissions = permissions;
  }

  /**
   * Specified date and time the permissions will expire. If this is not populated, the permissions will be open ended.
   **/
  
  @ApiModelProperty(value = "Specified date and time the permissions will expire. If this is not populated, the permissions will be open ended.")
  @JsonProperty("ExpirationDateTime")
  public Date getExpirationDateTime() {
    return expirationDateTime;
  }
  public void setExpirationDateTime(Date expirationDateTime) {
    this.expirationDateTime = expirationDateTime;
  }

  /**
   * Specified start date and time for the transaction query period. If this is not populated, the start date will be open ended, and data will be returned from the earliest available transaction.
   **/
  
  @ApiModelProperty(value = "Specified start date and time for the transaction query period. If this is not populated, the start date will be open ended, and data will be returned from the earliest available transaction.")
  @JsonProperty("TransactionFromDateTime")
  public Date getTransactionFromDateTime() {
    return transactionFromDateTime;
  }
  public void setTransactionFromDateTime(Date transactionFromDateTime) {
    this.transactionFromDateTime = transactionFromDateTime;
  }

  /**
   * Specified end date and time for the transaction query period. If this is not populated, the end date will be open ended, and data will be returned to the latest available transaction.
   **/
  
  @ApiModelProperty(value = "Specified end date and time for the transaction query period. If this is not populated, the end date will be open ended, and data will be returned to the latest available transaction.")
  @JsonProperty("TransactionToDateTime")
  public Date getTransactionToDateTime() {
    return transactionToDateTime;
  }
  public void setTransactionToDateTime(Date transactionToDateTime) {
    this.transactionToDateTime = transactionToDateTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Data data = (Data) o;
    return Objects.equals(permissions, data.permissions) &&
        Objects.equals(expirationDateTime, data.expirationDateTime) &&
        Objects.equals(transactionFromDateTime, data.transactionFromDateTime) &&
        Objects.equals(transactionToDateTime, data.transactionToDateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(permissions, expirationDateTime, transactionFromDateTime, transactionToDateTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Data {\n");
    
    sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
    sb.append("    expirationDateTime: ").append(toIndentedString(expirationDateTime)).append("\n");
    sb.append("    transactionFromDateTime: ").append(toIndentedString(transactionFromDateTime)).append("\n");
    sb.append("    transactionToDateTime: ").append(toIndentedString(transactionToDateTime)).append("\n");
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

