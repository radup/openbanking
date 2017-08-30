package com.jeelis.psd2hub.server.api.factories;

import com.jeelis.psd2hub.server.api.AccountRequestsApiService;
import com.jeelis.psd2hub.server.api.impl.AccountRequestsApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2017-08-30T01:38:28.934+02:00")
public class AccountRequestsApiServiceFactory {

   private final static AccountRequestsApiService service = new AccountRequestsApiServiceImpl();

   public static AccountRequestsApiService getAccountRequestsApi()
   {
      return service;
   }
}
