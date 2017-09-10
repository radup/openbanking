package com.finologee.psd2hub.ob.server.api;

import com.finologee.psd2hub.ob.server.api.*;
import com.finologee.psd2hub.ob.server.model.*;

import java.util.List;
import java.io.InputStream;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2017-08-30T01:38:28.934+02:00")
public abstract class DirectDebitsApiService {
      public abstract Response getDirectDebits(String xFapiFinancialId,String authorization,String xFapiCustomerLastLoggedTime,String xFapiCustomerIpAddress,String xFapiInteractionId,SecurityContext securityContext)
      throws NotFoundException;
}
