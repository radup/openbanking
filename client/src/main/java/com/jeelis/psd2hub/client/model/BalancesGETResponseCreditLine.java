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
import com.jeelis.psd2hub.client.model.BalancesGETResponseCreditLineAmount;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * BalancesGETResponseCreditLine
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-30T02:03:16.815+02:00")
public class BalancesGETResponseCreditLine {
  @SerializedName("Included")
  private Boolean included = null;

  @SerializedName("Amount")
  private BalancesGETResponseCreditLineAmount amount = null;

  /**
   * Limit type, in a coded form.
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    PRE_AGREED("Pre-Agreed"),
    
    EMERGENCY("Emergency"),
    
    TEMPORARY("Temporary");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("Type")
  private TypeEnum type = null;

  public BalancesGETResponseCreditLine included(Boolean included) {
    this.included = included;
    return this;
  }

   /**
   * Indicates whether or not the credit line is included in the balance of the account. Usage: If not present, credit line is not included in the balance amount of the account.
   * @return included
  **/
  @ApiModelProperty(required = true, value = "Indicates whether or not the credit line is included in the balance of the account. Usage: If not present, credit line is not included in the balance amount of the account.")
  public Boolean getIncluded() {
    return included;
  }

  public void setIncluded(Boolean included) {
    this.included = included;
  }

  public BalancesGETResponseCreditLine amount(BalancesGETResponseCreditLineAmount amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @ApiModelProperty(value = "")
  public BalancesGETResponseCreditLineAmount getAmount() {
    return amount;
  }

  public void setAmount(BalancesGETResponseCreditLineAmount amount) {
    this.amount = amount;
  }

  public BalancesGETResponseCreditLine type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Limit type, in a coded form.
   * @return type
  **/
  @ApiModelProperty(value = "Limit type, in a coded form.")
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
    return Objects.equals(this.included, balancesGETResponseCreditLine.included) &&
        Objects.equals(this.amount, balancesGETResponseCreditLine.amount) &&
        Objects.equals(this.type, balancesGETResponseCreditLine.type);
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

