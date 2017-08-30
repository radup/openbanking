package com.jeelis.psd2hub.server.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.jeelis.psd2hub.server.model.RiskDeliveryAddress;
import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import io.swagger.annotations.*;

@ApiModel(description="")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2017-08-30T01:37:21.257+02:00")
public class Risk   {
  

  /**
   * Specifies the payment context
   */
  public enum PaymentContextCodeEnum {
    BILLPAYMENT("BillPayment"),

        ECOMMERCEGOODS("EcommerceGoods"),

        ECOMMERCESERVICES("EcommerceServices"),

        OTHER("Other"),

        PERSONTOPERSON("PersonToPerson");
    private String value;

    PaymentContextCodeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }
  }

  private PaymentContextCodeEnum paymentContextCode = null;
  private String merchantCategoryCode = null;
  private String merchantCustomerIdentification = null;
  private RiskDeliveryAddress deliveryAddress = null;

  /**
   * Specifies the payment context
   **/
  
  @ApiModelProperty(value = "Specifies the payment context")
  @JsonProperty("PaymentContextCode")
  public PaymentContextCodeEnum getPaymentContextCode() {
    return paymentContextCode;
  }
  public void setPaymentContextCode(PaymentContextCodeEnum paymentContextCode) {
    this.paymentContextCode = paymentContextCode;
  }

  /**
   * Category code conforms to ISO 18245, related to the type of services or goods the merchant provides for the transaction
   **/
  
  @ApiModelProperty(value = "Category code conforms to ISO 18245, related to the type of services or goods the merchant provides for the transaction")
  @JsonProperty("MerchantCategoryCode")
 @Size(min=3,max=4)  public String getMerchantCategoryCode() {
    return merchantCategoryCode;
  }
  public void setMerchantCategoryCode(String merchantCategoryCode) {
    this.merchantCategoryCode = merchantCategoryCode;
  }

  /**
   * The unique customer identifier of the PSU with the merchant.
   **/
  
  @ApiModelProperty(value = "The unique customer identifier of the PSU with the merchant.")
  @JsonProperty("MerchantCustomerIdentification")
 @Size(min=1,max=70)  public String getMerchantCustomerIdentification() {
    return merchantCustomerIdentification;
  }
  public void setMerchantCustomerIdentification(String merchantCustomerIdentification) {
    this.merchantCustomerIdentification = merchantCustomerIdentification;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("DeliveryAddress")
  public RiskDeliveryAddress getDeliveryAddress() {
    return deliveryAddress;
  }
  public void setDeliveryAddress(RiskDeliveryAddress deliveryAddress) {
    this.deliveryAddress = deliveryAddress;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Risk risk = (Risk) o;
    return Objects.equals(paymentContextCode, risk.paymentContextCode) &&
        Objects.equals(merchantCategoryCode, risk.merchantCategoryCode) &&
        Objects.equals(merchantCustomerIdentification, risk.merchantCustomerIdentification) &&
        Objects.equals(deliveryAddress, risk.deliveryAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentContextCode, merchantCategoryCode, merchantCustomerIdentification, deliveryAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Risk {\n");
    
    sb.append("    paymentContextCode: ").append(toIndentedString(paymentContextCode)).append("\n");
    sb.append("    merchantCategoryCode: ").append(toIndentedString(merchantCategoryCode)).append("\n");
    sb.append("    merchantCustomerIdentification: ").append(toIndentedString(merchantCustomerIdentification)).append("\n");
    sb.append("    deliveryAddress: ").append(toIndentedString(deliveryAddress)).append("\n");
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

