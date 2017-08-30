package com.jeelis.psd2hub.server.api.factories;

import com.jeelis.psd2hub.server.api.ProductsApiService;
import com.jeelis.psd2hub.server.api.impl.ProductsApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2017-08-30T01:38:28.934+02:00")
public class ProductsApiServiceFactory {

   private final static ProductsApiService service = new ProductsApiServiceImpl();

   public static ProductsApiService getProductsApi()
   {
      return service;
   }
}
