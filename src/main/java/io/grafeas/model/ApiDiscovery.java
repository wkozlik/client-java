/*
 * Grafeas API
 * An API to insert and retrieve annotations on cloud artifacts.
 *
 * OpenAPI spec version: v1alpha1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.grafeas.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.grafeas.model.ApiNoteKind;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * A note that indicates a type of analysis a provider would perform. This note exists in a provider&#39;s project. A &#x60;Discovery&#x60; occurrence is created in a consumer&#39;s project at the start of analysis. The occurrence&#39;s operation will indicate the status of the analysis. Absence of an occurrence linked to this note for a resource indicates that analysis hasn&#39;t started.
 */
@ApiModel(description = "A note that indicates a type of analysis a provider would perform. This note exists in a provider's project. A `Discovery` occurrence is created in a consumer's project at the start of analysis. The occurrence's operation will indicate the status of the analysis. Absence of an occurrence linked to this note for a resource indicates that analysis hasn't started.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-04T13:20:14.121-07:00")
public class ApiDiscovery {
  @SerializedName("analysis_kind")
  private ApiNoteKind analysisKind = null;

  public ApiDiscovery analysisKind(ApiNoteKind analysisKind) {
    this.analysisKind = analysisKind;
    return this;
  }

   /**
   * The kind of analysis that is handled by this discovery.
   * @return analysisKind
  **/
  @ApiModelProperty(value = "The kind of analysis that is handled by this discovery.")
  public ApiNoteKind getAnalysisKind() {
    return analysisKind;
  }

  public void setAnalysisKind(ApiNoteKind analysisKind) {
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
    ApiDiscovery apiDiscovery = (ApiDiscovery) o;
    return Objects.equals(this.analysisKind, apiDiscovery.analysisKind);
  }

  @Override
  public int hashCode() {
    return Objects.hash(analysisKind);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiDiscovery {\n");
    
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

