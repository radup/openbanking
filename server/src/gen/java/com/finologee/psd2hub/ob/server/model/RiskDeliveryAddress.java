package com.finologee.psd2hub.ob.server.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import java.util.List;
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@ApiModel(description="Information that locates and identifies a specific address, as defined by postal services or in free format text.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2017-08-30T01:37:21.257+02:00")
public class RiskDeliveryAddress   {
  
  private List<String> addressLine = new ArrayList<String>();
  private String streetName = null;
  private String buildingNumber = null;
  private String postCode = null;
  private String townName = null;
  private List<String> countrySubDivision = new ArrayList<String>();
  private String country = null;

  /**
   * Information that locates and identifies a specific address, as defined by postal services, that is presented in free format text.
   **/
  
  @ApiModelProperty(value = "Information that locates and identifies a specific address, as defined by postal services, that is presented in free format text.")
  @JsonProperty("AddressLine")
 @Size(min=0,max=2)  public List<String> getAddressLine() {
    return addressLine;
  }
  public void setAddressLine(List<String> addressLine) {
    this.addressLine = addressLine;
  }

  /**
   * Name of a street or thoroughfare
   **/
  
  @ApiModelProperty(value = "Name of a street or thoroughfare")
  @JsonProperty("StreetName")
 @Size(min=1,max=70)  public String getStreetName() {
    return streetName;
  }
  public void setStreetName(String streetName) {
    this.streetName = streetName;
  }

  /**
   * Number that identifies the position of a building on a street.
   **/
  
  @ApiModelProperty(value = "Number that identifies the position of a building on a street.")
  @JsonProperty("BuildingNumber")
 @Size(min=1,max=16)  public String getBuildingNumber() {
    return buildingNumber;
  }
  public void setBuildingNumber(String buildingNumber) {
    this.buildingNumber = buildingNumber;
  }

  /**
   * Identifier consisting of a group of letters and/or numbers that is added to a postal address to assist the sorting of mail
   **/
  
  @ApiModelProperty(value = "Identifier consisting of a group of letters and/or numbers that is added to a postal address to assist the sorting of mail")
  @JsonProperty("PostCode")
 @Size(min=1,max=16)  public String getPostCode() {
    return postCode;
  }
  public void setPostCode(String postCode) {
    this.postCode = postCode;
  }

  /**
   * Name of a built-up area, with defined boundaries, and a local government.
   **/
  
  @ApiModelProperty(required = true, value = "Name of a built-up area, with defined boundaries, and a local government.")
  @JsonProperty("TownName")
  @NotNull
 @Size(min=1,max=35)  public String getTownName() {
    return townName;
  }
  public void setTownName(String townName) {
    this.townName = townName;
  }

  /**
   * Identifies a subdivision of a country, for instance state, region, county.
   **/
  
  @ApiModelProperty(value = "Identifies a subdivision of a country, for instance state, region, county.")
  @JsonProperty("CountrySubDivision")
 @Size(min=0,max=2)  public List<String> getCountrySubDivision() {
    return countrySubDivision;
  }
  public void setCountrySubDivision(List<String> countrySubDivision) {
    this.countrySubDivision = countrySubDivision;
  }

  /**
   * Nation with its own government, occupying a particular territory.
   **/
  
  @ApiModelProperty(required = true, value = "Nation with its own government, occupying a particular territory.")
  @JsonProperty("Country")
  @NotNull
 @Pattern(regexp="[A-Z]{2}")  public String getCountry() {
    return country;
  }
  public void setCountry(String country) {
    this.country = country;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RiskDeliveryAddress riskDeliveryAddress = (RiskDeliveryAddress) o;
    return Objects.equals(addressLine, riskDeliveryAddress.addressLine) &&
        Objects.equals(streetName, riskDeliveryAddress.streetName) &&
        Objects.equals(buildingNumber, riskDeliveryAddress.buildingNumber) &&
        Objects.equals(postCode, riskDeliveryAddress.postCode) &&
        Objects.equals(townName, riskDeliveryAddress.townName) &&
        Objects.equals(countrySubDivision, riskDeliveryAddress.countrySubDivision) &&
        Objects.equals(country, riskDeliveryAddress.country);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addressLine, streetName, buildingNumber, postCode, townName, countrySubDivision, country);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RiskDeliveryAddress {\n");
    
    sb.append("    addressLine: ").append(toIndentedString(addressLine)).append("\n");
    sb.append("    streetName: ").append(toIndentedString(streetName)).append("\n");
    sb.append("    buildingNumber: ").append(toIndentedString(buildingNumber)).append("\n");
    sb.append("    postCode: ").append(toIndentedString(postCode)).append("\n");
    sb.append("    townName: ").append(toIndentedString(townName)).append("\n");
    sb.append("    countrySubDivision: ").append(toIndentedString(countrySubDivision)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
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

