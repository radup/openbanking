package com.jeelis.psd2hub.server.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.jeelis.psd2hub.server.model.BalancesGETResponseCreditLineAmount;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2017-08-30T01:38:28.934+02:00")
public class BalancesGETResponseCreditLine   {
  
  private Boolean included = null;
  private BalancesGETResponseCreditLineAmount amount = null;

  /**
   * Limit type, in a coded form.
   */
  public enum TypeEnum {
    PRE_AGREED("Pre-Agreed"),

        EMERGENCY("Emergency"),

        TEMPORARY("Temporary");
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
   * Indicates whether or not the credit line is included in the balance of the account. Usage: If not present, credit line is not included in the balance amount of the account.
   **/
  
  @ApiModelProperty(required = true, value = "Indicates whether or not the credit line is included in the balance of the account. Usage: If not present, credit line is not included in the balance amount of the account.")
  @JsonProperty("Included")
  @NotNull
  public Boolean getIncluded() {
    return included;
  }
  public void setIncluded(Boolean included) {
    this.included = included;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("Amount")
  public BalancesGETResponseCreditLineAmount getAmount() {
    return amount;
  }
  public void setAmount(BalancesGETResponseCreditLineAmount amount) {
    this.amount = amount;
  }

  /**
   * Limit type, in a coded form.
   **/
  
  @ApiModelProperty(value = "Limit type, in a coded form.")
  @JsonProperty("Type")
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
    BalancesGETResponseCreditLine balancesGETResponseCreditLine = (BalancesGETResponseCreditLine) o;
    return Objects.equals(included, balancesGETResponseCreditLine.included) &&
        Objects.equals(amount, balancesGETResponseCreditLine.amount) &&
        Objects.equals(type, balancesGETResponseCreditLine.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(included, amount, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BalancesGETResponseCreditLine {\n");
    
    sb.append("    included: ").append(toIndentedString(included)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
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

