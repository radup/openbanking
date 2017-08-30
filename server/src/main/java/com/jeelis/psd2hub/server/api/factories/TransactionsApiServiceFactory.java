package com.jeelis.psd2hub.server.api.factories;

import com.jeelis.psd2hub.server.api.TransactionsApiService;
import com.jeelis.psd2hub.server.api.impl.TransactionsApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2017-08-30T01:38:28.934+02:00")
public class TransactionsApiServiceFactory {

   private final static TransactionsApiService service = new TransactionsApiServiceImpl();

   public static TransactionsApiService getTransactionsApi()
   {
      return service;
   }
}
