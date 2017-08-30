package com.jeelis.psd2hub.server.api.factories;

import com.jeelis.psd2hub.server.api.DirectDebitsApiService;
import com.jeelis.psd2hub.server.api.impl.DirectDebitsApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2017-08-30T01:38:28.934+02:00")
public class DirectDebitsApiServiceFactory {

   private final static DirectDebitsApiService service = new DirectDebitsApiServiceImpl();

   public static DirectDebitsApiService getDirectDebitsApi()
   {
      return service;
   }
}
