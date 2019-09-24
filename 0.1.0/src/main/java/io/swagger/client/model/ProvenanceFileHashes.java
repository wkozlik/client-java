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
import io.swagger.client.model.ProvenanceHash;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Container message for hashes of byte content of files, used in source messages to verify integrity of source input to the build.
 */
@ApiModel(description = "Container message for hashes of byte content of files, used in source messages to verify integrity of source input to the build.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-08-22T18:45:44.983-04:00")
public class ProvenanceFileHashes {
  @SerializedName("file_hash")
  private List<ProvenanceHash> fileHash = null;

  public ProvenanceFileHashes fileHash(List<ProvenanceHash> fileHash) {
    this.fileHash = fileHash;
    return this;
  }

  public ProvenanceFileHashes addFileHashItem(ProvenanceHash fileHashItem) {
    if (this.fileHash == null) {
      this.fileHash = new ArrayList<ProvenanceHash>();
    }
    this.fileHash.add(fileHashItem);
    return this;
  }

   /**
   * Required. Collection of file hashes.
   * @return fileHash
  **/
  @ApiModelProperty(value = "Required. Collection of file hashes.")
  public List<ProvenanceHash> getFileHash() {
    return fileHash;
  }

  public void setFileHash(List<ProvenanceHash> fileHash) {
    this.fileHash = fileHash;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProvenanceFileHashes provenanceFileHashes = (ProvenanceFileHashes) o;
    return Objects.equals(this.fileHash, provenanceFileHashes.fileHash);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fileHash);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProvenanceFileHashes {\n");
    
    sb.append("    fileHash: ").append(toIndentedString(fileHash)).append("\n");
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

