package com.finologee.psd2hub.ob.server.api.factories;

import com.finologee.psd2hub.ob.server.api.BeneficiariesApiService;
import com.finologee.psd2hub.ob.server.api.impl.BeneficiariesApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2017-08-30T01:38:28.934+02:00")
public class BeneficiariesApiServiceFactory {

   private final static BeneficiariesApiService service = new BeneficiariesApiServiceImpl();

   public static BeneficiariesApiService getBeneficiariesApi()
   {
      return service;
   }
}
