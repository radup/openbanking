package com.finologee.psd2hub.ob.server.api.factories;

import com.finologee.psd2hub.ob.server.api.BalancesApiService;
import com.finologee.psd2hub.ob.server.api.impl.BalancesApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2017-08-30T01:38:28.934+02:00")
public class BalancesApiServiceFactory {

   private final static BalancesApiService service = new BalancesApiServiceImpl();

   public static BalancesApiService getBalancesApi()
   {
      return service;
   }
}
