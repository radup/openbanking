package com.finologee.psd2hub.ob.server.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@ApiModel(description="Provides the details to identify the beneficiary account.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2017-08-30T01:38:28.934+02:00")
public class BeneficiariesGETResponseCreditorAccount   {
  

  /**
   * Name of the identification scheme, in a coded form as published in an external list.
   */
  public enum SchemeNameEnum {
    BBAN("BBAN"),

        IBAN("IBAN");
    private String value;

    SchemeNameEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private SchemeNameEnum schemeName = null;
  private String identification = null;
  private String name = null;
  private String secondaryIdentification = null;

  /**
   * Name of the identification scheme, in a coded form as published in an external list.
   **/
  
  @ApiModelProperty(required = true, value = "Name of the identification scheme, in a coded form as published in an external list.")
  @JsonProperty("SchemeName")
  @NotNull
  public SchemeNameEnum getSchemeName() {
    return schemeName;
  }
  public void setSchemeName(SchemeNameEnum schemeName) {
    this.schemeName = schemeName;
  }

  /**
   * Identification assigned by an institution to identify an account. This identification is known by the account owner.
   **/
  
  @ApiModelProperty(required = true, value = "Identification assigned by an institution to identify an account. This identification is known by the account owner.")
  @JsonProperty("Identification")
  @NotNull
 @Size(min=1,max=34)  public String getIdentification() {
    return identification;
  }
  public void setIdentification(String identification) {
    this.identification = identification;
  }

  /**
   * Name of the account, as assigned by the account servicing institution, in agreement with the account owner in order to provide an additional means of identification of the account. Usage: The account name is different from the account owner name. The account name is used in certain user communities to provide a means of identifying the account, in addition to the account owner&#39;s identity and the account number.
   **/
  
  @ApiModelProperty(value = "Name of the account, as assigned by the account servicing institution, in agreement with the account owner in order to provide an additional means of identification of the account. Usage: The account name is different from the account owner name. The account name is used in certain user communities to provide a means of identifying the account, in addition to the account owner's identity and the account number.")
  @JsonProperty("Name")
 @Size(min=1,max=70)  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * This is secondary identification of the account, as assigned by the account servicing institution.  This can be used by building societies to additionally identify accounts with a roll number (in addition to a sort code and account number combination).
   **/
  
  @ApiModelProperty(value = "This is secondary identification of the account, as assigned by the account servicing institution.  This can be used by building societies to additionally identify accounts with a roll number (in addition to a sort code and account number combination).")
  @JsonProperty("SecondaryIdentification")
 @Size(min=1,max=34)  public String getSecondaryIdentification() {
    return secondaryIdentification;
  }
  public void setSecondaryIdentification(String secondaryIdentification) {
    this.secondaryIdentification = secondaryIdentification;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BeneficiariesGETResponseCreditorAccount beneficiariesGETResponseCreditorAccount = (BeneficiariesGETResponseCreditorAccount) o;
    return Objects.equals(schemeName, beneficiariesGETResponseCreditorAccount.schemeName) &&
        Objects.equals(identification, beneficiariesGETResponseCreditorAccount.identification) &&
        Objects.equals(name, beneficiariesGETResponseCreditorAccount.name) &&
        Objects.equals(secondaryIdentification, beneficiariesGETResponseCreditorAccount.secondaryIdentification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(schemeName, identification, name, secondaryIdentification);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BeneficiariesGETResponseCreditorAccount {\n");
    
    sb.append("    schemeName: ").append(toIndentedString(schemeName)).append("\n");
    sb.append("    identification: ").append(toIndentedString(identification)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    secondaryIdentification: ").append(toIndentedString(secondaryIdentification)).append("\n");
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

