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
import io.swagger.client.model.ImageDerived;
import java.io.IOException;

/**
 * Details of an image occurrence.
 */
@ApiModel(description = "Details of an image occurrence.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-08-22T18:45:44.983-04:00")
public class V1beta1imageDetails {
  @SerializedName("derived_image")
  private ImageDerived derivedImage = null;

  public V1beta1imageDetails derivedImage(ImageDerived derivedImage) {
    this.derivedImage = derivedImage;
    return this;
  }

   /**
   * Required. Immutable. The child image derived from the base image.
   * @return derivedImage
  **/
  @ApiModelProperty(value = "Required. Immutable. The child image derived from the base image.")
  public ImageDerived getDerivedImage() {
    return derivedImage;
  }

  public void setDerivedImage(ImageDerived derivedImage) {
    this.derivedImage = derivedImage;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta1imageDetails v1beta1imageDetails = (V1beta1imageDetails) o;
    return Objects.equals(this.derivedImage, v1beta1imageDetails.derivedImage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(derivedImage);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1imageDetails {\n");
    
    sb.append("    derivedImage: ").append(toIndentedString(derivedImage)).append("\n");
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

