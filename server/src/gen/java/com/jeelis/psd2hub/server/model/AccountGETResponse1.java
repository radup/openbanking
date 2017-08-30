package com.jeelis.psd2hub.server.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.jeelis.psd2hub.server.model.DirectDebit;
import com.jeelis.psd2hub.server.model.Links;
import com.jeelis.psd2hub.server.model.MetaData;
import java.util.List;
import javax.validation.constraints.*;
import io.swagger.annotations.*;


@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaResteasyServerCodegen", date = "2017-08-30T01:38:28.934+02:00")
public class AccountGETResponse1   {
  
  private List<DirectDebit> data = new ArrayList<DirectDebit>();
  private Links links = null;
  private MetaData meta = null;

  /**
   **/
  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("Data")
  @NotNull
  public List<DirectDebit> getData() {
    return data;
  }
  public void setData(List<DirectDebit> data) {
    this.data = data;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("Links")
  public Links getLinks() {
    return links;
  }
  public void setLinks(Links links) {
    this.links = links;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("Meta")
  public MetaData getMeta() {
    return meta;
  }
  public void setMeta(MetaData meta) {
    this.meta = meta;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountGETResponse1 accountGETResponse1 = (AccountGETResponse1) o;
    return Objects.equals(data, accountGETResponse1.data) &&
        Objects.equals(links, accountGETResponse1.links) &&
        Objects.equals(meta, accountGETResponse1.meta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, links, meta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountGETResponse1 {\n");
    
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

