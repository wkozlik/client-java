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
import io.grafeas.model.ApiFileHashes;
import io.grafeas.model.ApiRepoSource;
import io.grafeas.model.ApiSourceContext;
import io.grafeas.model.ApiStorageSource;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Source describes the location of the source used for the build.
 */
@ApiModel(description = "Source describes the location of the source used for the build.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-04T13:20:14.121-07:00")
public class ApiSource {
  @SerializedName("storage_source")
  private ApiStorageSource storageSource = null;

  @SerializedName("repo_source")
  private ApiRepoSource repoSource = null;

  @SerializedName("artifact_storage_source")
  private ApiStorageSource artifactStorageSource = null;

  @SerializedName("file_hashes")
  private Map<String, ApiFileHashes> fileHashes = null;

  @SerializedName("context")
  private ApiSourceContext context = null;

  @SerializedName("additional_contexts")
  private List<ApiSourceContext> additionalContexts = null;

  public ApiSource storageSource(ApiStorageSource storageSource) {
    this.storageSource = storageSource;
    return this;
  }

   /**
   * If provided, get the source from this location in in Google Cloud Storage.
   * @return storageSource
  **/
  @ApiModelProperty(value = "If provided, get the source from this location in in Google Cloud Storage.")
  public ApiStorageSource getStorageSource() {
    return storageSource;
  }

  public void setStorageSource(ApiStorageSource storageSource) {
    this.storageSource = storageSource;
  }

  public ApiSource repoSource(ApiRepoSource repoSource) {
    this.repoSource = repoSource;
    return this;
  }

   /**
   * If provided, get source from this location in a Cloud Repo.
   * @return repoSource
  **/
  @ApiModelProperty(value = "If provided, get source from this location in a Cloud Repo.")
  public ApiRepoSource getRepoSource() {
    return repoSource;
  }

  public void setRepoSource(ApiRepoSource repoSource) {
    this.repoSource = repoSource;
  }

  public ApiSource artifactStorageSource(ApiStorageSource artifactStorageSource) {
    this.artifactStorageSource = artifactStorageSource;
    return this;
  }

   /**
   * If provided, the input binary artifacts for the build came from this location.
   * @return artifactStorageSource
  **/
  @ApiModelProperty(value = "If provided, the input binary artifacts for the build came from this location.")
  public ApiStorageSource getArtifactStorageSource() {
    return artifactStorageSource;
  }

  public void setArtifactStorageSource(ApiStorageSource artifactStorageSource) {
    this.artifactStorageSource = artifactStorageSource;
  }

  public ApiSource fileHashes(Map<String, ApiFileHashes> fileHashes) {
    this.fileHashes = fileHashes;
    return this;
  }

  public ApiSource putFileHashesItem(String key, ApiFileHashes fileHashesItem) {
    if (this.fileHashes == null) {
      this.fileHashes = new HashMap<String, ApiFileHashes>();
    }
    this.fileHashes.put(key, fileHashesItem);
    return this;
  }

   /**
   * Hash(es) of the build source, which can be used to verify that the original source integrity was maintained in the build.  The keys to this map are file paths used as build source and the values contain the hash values for those files.  If the build source came in a single package such as a gzipped tarfile (.tar.gz), the FileHash will be for the single path to that file.
   * @return fileHashes
  **/
  @ApiModelProperty(value = "Hash(es) of the build source, which can be used to verify that the original source integrity was maintained in the build.  The keys to this map are file paths used as build source and the values contain the hash values for those files.  If the build source came in a single package such as a gzipped tarfile (.tar.gz), the FileHash will be for the single path to that file.")
  public Map<String, ApiFileHashes> getFileHashes() {
    return fileHashes;
  }

  public void setFileHashes(Map<String, ApiFileHashes> fileHashes) {
    this.fileHashes = fileHashes;
  }

  public ApiSource context(ApiSourceContext context) {
    this.context = context;
    return this;
  }

   /**
   * If provided, the source code used for the build came from this location.
   * @return context
  **/
  @ApiModelProperty(value = "If provided, the source code used for the build came from this location.")
  public ApiSourceContext getContext() {
    return context;
  }

  public void setContext(ApiSourceContext context) {
    this.context = context;
  }

  public ApiSource additionalContexts(List<ApiSourceContext> additionalContexts) {
    this.additionalContexts = additionalContexts;
    return this;
  }

  public ApiSource addAdditionalContextsItem(ApiSourceContext additionalContextsItem) {
    if (this.additionalContexts == null) {
      this.additionalContexts = new ArrayList<ApiSourceContext>();
    }
    this.additionalContexts.add(additionalContextsItem);
    return this;
  }

   /**
   * If provided, some of the source code used for the build may be found in these locations, in the case where the source repository had multiple remotes or submodules. This list will not include the context specified in the context field.
   * @return additionalContexts
  **/
  @ApiModelProperty(value = "If provided, some of the source code used for the build may be found in these locations, in the case where the source repository had multiple remotes or submodules. This list will not include the context specified in the context field.")
  public List<ApiSourceContext> getAdditionalContexts() {
    return additionalContexts;
  }

  public void setAdditionalContexts(List<ApiSourceContext> additionalContexts) {
    this.additionalContexts = additionalContexts;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiSource apiSource = (ApiSource) o;
    return Objects.equals(this.storageSource, apiSource.storageSource) &&
        Objects.equals(this.repoSource, apiSource.repoSource) &&
        Objects.equals(this.artifactStorageSource, apiSource.artifactStorageSource) &&
        Objects.equals(this.fileHashes, apiSource.fileHashes) &&
        Objects.equals(this.context, apiSource.context) &&
        Objects.equals(this.additionalContexts, apiSource.additionalContexts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(storageSource, repoSource, artifactStorageSource, fileHashes, context, additionalContexts);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiSource {\n");
    
    sb.append("    storageSource: ").append(toIndentedString(storageSource)).append("\n");
    sb.append("    repoSource: ").append(toIndentedString(repoSource)).append("\n");
    sb.append("    artifactStorageSource: ").append(toIndentedString(artifactStorageSource)).append("\n");
    sb.append("    fileHashes: ").append(toIndentedString(fileHashes)).append("\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    additionalContexts: ").append(toIndentedString(additionalContexts)).append("\n");
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

