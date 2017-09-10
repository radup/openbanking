package com.finologee.psd2hub.ob.server.api.factories;

import com.finologee.psd2hub.ob.server.api.AccountsApiService;
import com.finologee.psd2hub.ob.server.api.impl.AccountsApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2017-08-30T01:38:28.934+02:00")
public class AccountsApiServiceFactory {

   private final static AccountsApiService service = new AccountsApiServiceImpl();

   public static AccountsApiService getAccountsApi()
   {
      return service;
   }
}
