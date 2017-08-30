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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Party that manages the account on behalf of the account owner, that is manages the registration and booking of entries on the account, calculates balances on the account and provides information about the account. This is the servicer of the beneficiary account.
 */
@ApiModel(description = "Party that manages the account on behalf of the account owner, that is manages the registration and booking of entries on the account, calculates balances on the account and provides information about the account. This is the servicer of the beneficiary account.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-30T02:03:16.815+02:00")
public class BeneficiariesGETResponseServicer {
  /**
   * Name of the identification scheme, in a coded form as published in an external list.
   */
  @JsonAdapter(SchemeNameEnum.Adapter.class)
  public enum SchemeNameEnum {
    BICFI("BICFI"),
    
    UKSORTCODE("UKSortCode");

    private String value;

    SchemeNameEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static SchemeNameEnum fromValue(String text) {
      for (SchemeNameEnum b : SchemeNameEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<SchemeNameEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final SchemeNameEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public SchemeNameEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return SchemeNameEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("SchemeName")
  private SchemeNameEnum schemeName = null;

  @SerializedName("Identification")
  private String identification = null;

  public BeneficiariesGETResponseServicer schemeName(SchemeNameEnum schemeName) {
    this.schemeName = schemeName;
    return this;
  }

   /**
   * Name of the identification scheme, in a coded form as published in an external list.
   * @return schemeName
  **/
  @ApiModelProperty(required = true, value = "Name of the identification scheme, in a coded form as published in an external list.")
  public SchemeNameEnum getSchemeName() {
    return schemeName;
  }

  public void setSchemeName(SchemeNameEnum schemeName) {
    this.schemeName = schemeName;
  }

  public BeneficiariesGETResponseServicer identification(String identification) {
    this.identification = identification;
    return this;
  }

   /**
   * Unique and unambiguous identification of the servicing institution.
   * @return identification
  **/
  @ApiModelProperty(required = true, value = "Unique and unambiguous identification of the servicing institution.")
  public String getIdentification() {
    return identification;
  }

  public void setIdentification(String identification) {
    this.identification = identification;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BeneficiariesGETResponseServicer beneficiariesGETResponseServicer = (BeneficiariesGETResponseServicer) o;
    return Objects.equals(this.schemeName, beneficiariesGETResponseServicer.schemeName) &&
        Objects.equals(this.identification, beneficiariesGETResponseServicer.identification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(schemeName, identification);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BeneficiariesGETResponseServicer {\n");
    
    sb.append("    schemeName: ").append(toIndentedString(schemeName)).append("\n");
    sb.append("    identification: ").append(toIndentedString(identification)).append("\n");
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

