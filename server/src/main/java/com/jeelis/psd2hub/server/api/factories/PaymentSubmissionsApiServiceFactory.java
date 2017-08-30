package com.jeelis.psd2hub.server.api.factories;

import com.jeelis.psd2hub.server.api.PaymentSubmissionsApiService;
import com.jeelis.psd2hub.server.api.impl.PaymentSubmissionsApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2017-08-30T01:37:21.257+02:00")
public class PaymentSubmissionsApiServiceFactory {

   private final static PaymentSubmissionsApiService service = new PaymentSubmissionsApiServiceImpl();

   public static PaymentSubmissionsApiService getPaymentSubmissionsApi()
   {
      return service;
   }
}
