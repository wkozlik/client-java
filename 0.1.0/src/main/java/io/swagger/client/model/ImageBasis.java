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
import io.swagger.client.model.ImageFingerprint;
import java.io.IOException;

/**
 * Basis describes the base image portion (Note) of the DockerImage relationship. Linked occurrences are derived from this or an equivalent image via:   FROM &lt;Basis.resource_url&gt; Or an equivalent reference, e.g. a tag of the resource_url.
 */
@ApiModel(description = "Basis describes the base image portion (Note) of the DockerImage relationship. Linked occurrences are derived from this or an equivalent image via:   FROM <Basis.resource_url> Or an equivalent reference, e.g. a tag of the resource_url.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-08-22T18:45:44.983-04:00")
public class ImageBasis {
  @SerializedName("resource_url")
  private String resourceUrl = null;

  @SerializedName("fingerprint")
  private ImageFingerprint fingerprint = null;

  public ImageBasis resourceUrl(String resourceUrl) {
    this.resourceUrl = resourceUrl;
    return this;
  }

   /**
   * Required. Immutable. The resource_url for the resource representing the basis of associated occurrence images.
   * @return resourceUrl
  **/
  @ApiModelProperty(value = "Required. Immutable. The resource_url for the resource representing the basis of associated occurrence images.")
  public String getResourceUrl() {
    return resourceUrl;
  }

  public void setResourceUrl(String resourceUrl) {
    this.resourceUrl = resourceUrl;
  }

  public ImageBasis fingerprint(ImageFingerprint fingerprint) {
    this.fingerprint = fingerprint;
    return this;
  }

   /**
   * Required. Immutable. The fingerprint of the base image.
   * @return fingerprint
  **/
  @ApiModelProperty(value = "Required. Immutable. The fingerprint of the base image.")
  public ImageFingerprint getFingerprint() {
    return fingerprint;
  }

  public void setFingerprint(ImageFingerprint fingerprint) {
    this.fingerprint = fingerprint;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImageBasis imageBasis = (ImageBasis) o;
    return Objects.equals(this.resourceUrl, imageBasis.resourceUrl) &&
        Objects.equals(this.fingerprint, imageBasis.fingerprint);
  }

  @Override
  public int hashCode() {
    return Objects.hash(resourceUrl, fingerprint);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImageBasis {\n");
    
    sb.append("    resourceUrl: ").append(toIndentedString(resourceUrl)).append("\n");
    sb.append("    fingerprint: ").append(toIndentedString(fingerprint)).append("\n");
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

