package com.finologee.psd2hub.ob.server.api.factories;

import com.finologee.psd2hub.ob.server.api.TransactionsApiService;
import com.finologee.psd2hub.ob.server.api.impl.TransactionsApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2017-08-30T01:38:28.934+02:00")
public class TransactionsApiServiceFactory {

   private final static TransactionsApiService service = new TransactionsApiServiceImpl();

   public static TransactionsApiService getTransactionsApi()
   {
      return service;
   }
}
