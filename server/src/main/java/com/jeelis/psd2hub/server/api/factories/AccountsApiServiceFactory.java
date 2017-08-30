package com.jeelis.psd2hub.server.api.factories;

import com.jeelis.psd2hub.server.api.AccountsApiService;
import com.jeelis.psd2hub.server.api.impl.AccountsApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2017-08-30T01:38:28.934+02:00")
public class AccountsApiServiceFactory {

   private final static AccountsApiService service = new AccountsApiServiceImpl();

   public static AccountsApiService getAccountsApi()
   {
      return service;
   }
}
