package com.finologee.psd2hub.ob.server.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@ApiModel(description="Product")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2017-08-30T01:38:28.934+02:00")
public class Product   {
  
  private String accountId = null;
  private String productIdentifier = null;

  /**
   * Descriptive code for the product category.
   */
  public enum ProductTypeEnum {
    BCA("BCA"),

        PCA("PCA");
    private String value;

    ProductTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private ProductTypeEnum productType = null;
  private String productName = null;
  private String secondaryProductIdentifier = null;

  /**
   * A unique and immutable identifier used to identify the account resource. This identifier has no meaning to the account owner.
   **/
  
  @ApiModelProperty(required = true, value = "A unique and immutable identifier used to identify the account resource. This identifier has no meaning to the account owner.")
  @JsonProperty("AccountId")
  @NotNull
 @Size(min=1,max=40)  public String getAccountId() {
    return accountId;
  }
  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  /**
   * Identifier within the parent organisation for the product. Must be unique in the organisation.
   **/
  
  @ApiModelProperty(required = true, value = "Identifier within the parent organisation for the product. Must be unique in the organisation.")
  @JsonProperty("ProductIdentifier")
  @NotNull
  public String getProductIdentifier() {
    return productIdentifier;
  }
  public void setProductIdentifier(String productIdentifier) {
    this.productIdentifier = productIdentifier;
  }

  /**
   * Descriptive code for the product category.
   **/
  
  @ApiModelProperty(required = true, value = "Descriptive code for the product category.")
  @JsonProperty("ProductType")
  @NotNull
  public ProductTypeEnum getProductType() {
    return productType;
  }
  public void setProductType(ProductTypeEnum productType) {
    this.productType = productType;
  }

  /**
   * The name of the product used for marketing purposes from a customer perspective. I.e. what the customer would recognise.
   **/
  
  @ApiModelProperty(value = "The name of the product used for marketing purposes from a customer perspective. I.e. what the customer would recognise.")
  @JsonProperty("ProductName")
  public String getProductName() {
    return productName;
  }
  public void setProductName(String productName) {
    this.productName = productName;
  }

  /**
   * Identifier within the parent organisation for the product. Must be unique in the organisation.
   **/
  
  @ApiModelProperty(value = "Identifier within the parent organisation for the product. Must be unique in the organisation.")
  @JsonProperty("SecondaryProductIdentifier")
  public String getSecondaryProductIdentifier() {
    return secondaryProductIdentifier;
  }
  public void setSecondaryProductIdentifier(String secondaryProductIdentifier) {
    this.secondaryProductIdentifier = secondaryProductIdentifier;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Product product = (Product) o;
    return Objects.equals(accountId, product.accountId) &&
        Objects.equals(productIdentifier, product.productIdentifier) &&
        Objects.equals(productType, product.productType) &&
        Objects.equals(productName, product.productName) &&
        Objects.equals(secondaryProductIdentifier, product.secondaryProductIdentifier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountId, productIdentifier, productType, productName, secondaryProductIdentifier);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Product {\n");
    
    sb.append("    accountId: ").append(toIndentedString(accountId)).append("\n");
    sb.append("    productIdentifier: ").append(toIndentedString(productIdentifier)).append("\n");
    sb.append("    productType: ").append(toIndentedString(productType)).append("\n");
    sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
    sb.append("    secondaryProductIdentifier: ").append(toIndentedString(secondaryProductIdentifier)).append("\n");
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

