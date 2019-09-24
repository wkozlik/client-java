/*
 * grafeas.proto
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: version not set
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.V1beta1NoteKind;
import java.io.IOException;

/**
 * A note that indicates a type of analysis a provider would perform. This note exists in a provider&#39;s project. A &#x60;Discovery&#x60; occurrence is created in a consumer&#39;s project at the start of analysis.
 */
@ApiModel(description = "A note that indicates a type of analysis a provider would perform. This note exists in a provider's project. A `Discovery` occurrence is created in a consumer's project at the start of analysis.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-08-22T18:45:44.983-04:00")
public class DiscoveryDiscovery {
  @SerializedName("analysis_kind")
  private V1beta1NoteKind analysisKind = null;

  public DiscoveryDiscovery analysisKind(V1beta1NoteKind analysisKind) {
    this.analysisKind = analysisKind;
    return this;
  }

   /**
   * Required. Immutable. The kind of analysis that is handled by this discovery.
   * @return analysisKind
  **/
  @ApiModelProperty(value = "Required. Immutable. The kind of analysis that is handled by this discovery.")
  public V1beta1NoteKind getAnalysisKind() {
    return analysisKind;
  }

  public void setAnalysisKind(V1beta1NoteKind analysisKind) {
    this.analysisKind = analysisKind;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DiscoveryDiscovery discoveryDiscovery = (DiscoveryDiscovery) o;
    return Objects.equals(this.analysisKind, discoveryDiscovery.analysisKind);
  }

  @Override
  public int hashCode() {
    return Objects.hash(analysisKind);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DiscoveryDiscovery {\n");
    
    sb.append("    analysisKind: ").append(toIndentedString(analysisKind)).append("\n");
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

