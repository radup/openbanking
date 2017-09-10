package com.finologee.psd2hub.ob.server.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@ApiModel(description="The amount of the first Standing Order")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2017-08-30T01:38:28.934+02:00")
public class StandingOrdersGETResponseFirstPaymentAmount   {
  
  private String amount = null;
  private String currency = null;

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("Amount")
  @NotNull
 @Pattern(regexp="^-?\\d{1,13}\\.\\d{1,5}$")  public String getAmount() {
    return amount;
  }
  public void setAmount(String amount) {
    this.amount = amount;
  }

  /**
   * A code allocated to a currency by a Maintenance Agency under an international identification scheme, as described in the latest edition of the international standard ISO 4217 &#39;Codes for the representation of currencies and funds&#39;
   **/
  
  @ApiModelProperty(required = true, value = "A code allocated to a currency by a Maintenance Agency under an international identification scheme, as described in the latest edition of the international standard ISO 4217 'Codes for the representation of currencies and funds'")
  @JsonProperty("Currency")
  @NotNull
 @Pattern(regexp="^[A-Z]{3}$")  public String getCurrency() {
    return currency;
  }
  public void setCurrency(String currency) {
    this.currency = currency;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StandingOrdersGETResponseFirstPaymentAmount standingOrdersGETResponseFirstPaymentAmount = (StandingOrdersGETResponseFirstPaymentAmount) o;
    return Objects.equals(amount, standingOrdersGETResponseFirstPaymentAmount.amount) &&
        Objects.equals(currency, standingOrdersGETResponseFirstPaymentAmount.currency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, currency);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StandingOrdersGETResponseFirstPaymentAmount {\n");
    
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
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

