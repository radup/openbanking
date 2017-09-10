package com.finologee.psd2hub.ob.server.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@ApiModel(description="Details of the merchant involved in the transaction.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2017-08-30T01:38:28.934+02:00")
public class AccountTransactionsGETResponseMerchantDetails   {
  
  private String merchantName = null;
  private String merchantCategoryCode = null;

  /**
   * Name by which the merchant is known.
   **/
  
  @ApiModelProperty(value = "Name by which the merchant is known.")
  @JsonProperty("MerchantName")
 @Size(min=1,max=350)  public String getMerchantName() {
    return merchantName;
  }
  public void setMerchantName(String merchantName) {
    this.merchantName = merchantName;
  }

  /**
   * Category code conform to ISO 18245, related to the type of services or goods the merchant provides for the transaction.
   **/
  
  @ApiModelProperty(value = "Category code conform to ISO 18245, related to the type of services or goods the merchant provides for the transaction.")
  @JsonProperty("MerchantCategoryCode")
 @Size(min=3,max=4)  public String getMerchantCategoryCode() {
    return merchantCategoryCode;
  }
  public void setMerchantCategoryCode(String merchantCategoryCode) {
    this.merchantCategoryCode = merchantCategoryCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountTransactionsGETResponseMerchantDetails accountTransactionsGETResponseMerchantDetails = (AccountTransactionsGETResponseMerchantDetails) o;
    return Objects.equals(merchantName, accountTransactionsGETResponseMerchantDetails.merchantName) &&
        Objects.equals(merchantCategoryCode, accountTransactionsGETResponseMerchantDetails.merchantCategoryCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(merchantName, merchantCategoryCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountTransactionsGETResponseMerchantDetails {\n");
    
    sb.append("    merchantName: ").append(toIndentedString(merchantName)).append("\n");
    sb.append("    merchantCategoryCode: ").append(toIndentedString(merchantCategoryCode)).append("\n");
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

