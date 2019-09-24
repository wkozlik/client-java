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
import java.io.IOException;

/**
 * A GitSourceContext denotes a particular revision in a third party Git repository (e.g., GitHub).
 */
@ApiModel(description = "A GitSourceContext denotes a particular revision in a third party Git repository (e.g., GitHub).")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-08-22T18:45:44.983-04:00")
public class SourceGitSourceContext {
  @SerializedName("url")
  private String url = null;

  @SerializedName("revision_id")
  private String revisionId = null;

  public SourceGitSourceContext url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Git repository URL.
   * @return url
  **/
  @ApiModelProperty(value = "Git repository URL.")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public SourceGitSourceContext revisionId(String revisionId) {
    this.revisionId = revisionId;
    return this;
  }

   /**
   * Git commit hash.
   * @return revisionId
  **/
  @ApiModelProperty(value = "Git commit hash.")
  public String getRevisionId() {
    return revisionId;
  }

  public void setRevisionId(String revisionId) {
    this.revisionId = revisionId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SourceGitSourceContext sourceGitSourceContext = (SourceGitSourceContext) o;
    return Objects.equals(this.url, sourceGitSourceContext.url) &&
        Objects.equals(this.revisionId, sourceGitSourceContext.revisionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, revisionId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SourceGitSourceContext {\n");
    
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    revisionId: ").append(toIndentedString(revisionId)).append("\n");
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
