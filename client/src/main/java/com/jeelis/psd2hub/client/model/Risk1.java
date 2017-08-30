/*
 * Payment Initiation APIs
 * Draft Swagger specification for Payment Initiation
 *
 * OpenAPI spec version: v1.0.0
 * Contact: craig.greenhouse@openbanking.org.uk
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
import com.jeelis.psd2hub.client.model.RiskDeliveryAddress;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Reflection of POSTed Risk profile 
 */
@ApiModel(description = "Reflection of POSTed Risk profile ")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-30T02:04:19.097+02:00")
public class Risk1 {
  /**
   * Specifies the payment context
   */
  @JsonAdapter(PaymentContextCodeEnum.Adapter.class)
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

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static PaymentContextCodeEnum fromValue(String text) {
      for (PaymentContextCodeEnum b : PaymentContextCodeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<PaymentContextCodeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final PaymentContextCodeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public PaymentContextCodeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return PaymentContextCodeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("PaymentContextCode")
  private PaymentContextCodeEnum paymentContextCode = null;

  @SerializedName("MerchantCategoryCode")
  private String merchantCategoryCode = null;

  @SerializedName("MerchantCustomerIdentification")
  private String merchantCustomerIdentification = null;

  @SerializedName("DeliveryAddress")
  private RiskDeliveryAddress deliveryAddress = null;

  public Risk1 paymentContextCode(PaymentContextCodeEnum paymentContextCode) {
    this.paymentContextCode = paymentContextCode;
    return this;
  }

   /**
   * Specifies the payment context
   * @return paymentContextCode
  **/
  @ApiModelProperty(value = "Specifies the payment context")
  public PaymentContextCodeEnum getPaymentContextCode() {
    return paymentContextCode;
  }

  public void setPaymentContextCode(PaymentContextCodeEnum paymentContextCode) {
    this.paymentContextCode = paymentContextCode;
  }

  public Risk1 merchantCategoryCode(String merchantCategoryCode) {
    this.merchantCategoryCode = merchantCategoryCode;
    return this;
  }

   /**
   * Category code conforms to ISO 18245, related to the type of services or goods the merchant provides for the transaction
   * @return merchantCategoryCode
  **/
  @ApiModelProperty(value = "Category code conforms to ISO 18245, related to the type of services or goods the merchant provides for the transaction")
  public String getMerchantCategoryCode() {
    return merchantCategoryCode;
  }

  public void setMerchantCategoryCode(String merchantCategoryCode) {
    this.merchantCategoryCode = merchantCategoryCode;
  }

  public Risk1 merchantCustomerIdentification(String merchantCustomerIdentification) {
    this.merchantCustomerIdentification = merchantCustomerIdentification;
    return this;
  }

   /**
   * The unique customer identifier of the PSU with the merchant.
   * @return merchantCustomerIdentification
  **/
  @ApiModelProperty(value = "The unique customer identifier of the PSU with the merchant.")
  public String getMerchantCustomerIdentification() {
    return merchantCustomerIdentification;
  }

  public void setMerchantCustomerIdentification(String merchantCustomerIdentification) {
    this.merchantCustomerIdentification = merchantCustomerIdentification;
  }

  public Risk1 deliveryAddress(RiskDeliveryAddress deliveryAddress) {
    this.deliveryAddress = deliveryAddress;
    return this;
  }

   /**
   * Get deliveryAddress
   * @return deliveryAddress
  **/
  @ApiModelProperty(value = "")
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
    Risk1 risk1 = (Risk1) o;
    return Objects.equals(this.paymentContextCode, risk1.paymentContextCode) &&
        Objects.equals(this.merchantCategoryCode, risk1.merchantCategoryCode) &&
        Objects.equals(this.merchantCustomerIdentification, risk1.merchantCustomerIdentification) &&
        Objects.equals(this.deliveryAddress, risk1.deliveryAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentContextCode, merchantCategoryCode, merchantCustomerIdentification, deliveryAddress);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Risk1 {\n");
    
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

