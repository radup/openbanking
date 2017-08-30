package com.jeelis.psd2hub.server.api.factories;

import com.jeelis.psd2hub.server.api.StandingOrdersApiService;
import com.jeelis.psd2hub.server.api.impl.StandingOrdersApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2017-08-30T01:38:28.934+02:00")
public class StandingOrdersApiServiceFactory {

   private final static StandingOrdersApiService service = new StandingOrdersApiServiceImpl();

   public static StandingOrdersApiService getStandingOrdersApi()
   {
      return service;
   }
}
