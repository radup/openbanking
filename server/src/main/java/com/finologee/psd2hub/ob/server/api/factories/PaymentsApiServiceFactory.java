package com.finologee.psd2hub.ob.server.api.factories;

import com.finologee.psd2hub.ob.server.api.PaymentsApiService;
import com.finologee.psd2hub.ob.server.api.impl.PaymentsApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2017-08-30T01:37:21.257+02:00")
public class PaymentsApiServiceFactory {

   private final static PaymentsApiService service = new PaymentsApiServiceImpl();

   public static PaymentsApiService getPaymentsApi()
   {
      return service;
   }
}
