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
import java.util.ArrayList;
import java.util.List;

/**
 * paths: \&quot;f.a\&quot;     paths: \&quot;f.b.d\&quot;  Here &#x60;f&#x60; represents a field in some root message, &#x60;a&#x60; and &#x60;b&#x60; fields in the message found in &#x60;f&#x60;, and &#x60;d&#x60; a field found in the message in &#x60;f.b&#x60;.  Field masks are used to specify a subset of fields that should be returned by a get operation or modified by an update operation. Field masks also have a custom JSON encoding (see below).  # Field Masks in Projections  When used in the context of a projection, a response message or sub-message is filtered by the API to only contain those fields as specified in the mask. For example, if the mask in the previous example is applied to a response message as follows:      f {       a : 22       b {         d : 1         x : 2       }       y : 13     }     z: 8  The result will not contain specific values for fields x,y and z (their value will be set to the default, and omitted in proto text output):       f {       a : 22       b {         d : 1       }     }  A repeated field is not allowed except at the last position of a paths string.  If a FieldMask object is not present in a get operation, the operation applies to all fields (as if a FieldMask of all fields had been specified).  Note that a field mask does not necessarily apply to the top-level response message. In case of a REST get operation, the field mask applies directly to the response, but in case of a REST list operation, the mask instead applies to each individual message in the returned resource list. In case of a REST custom method, other definitions may be used. Where the mask applies will be clearly documented together with its declaration in the API.  In any case, the effect on the returned resource/resources is required behavior for APIs.  # Field Masks in Update Operations  A field mask in update operations specifies which fields of the targeted resource are going to be updated. The API is required to only change the values of the fields as specified in the mask and leave the others untouched. If a resource is passed in to describe the updated values, the API ignores the values of all fields not covered by the mask.  If a repeated field is specified for an update operation, the existing repeated values in the target resource will be overwritten by the new values. Note that a repeated field is only allowed in the last position of a &#x60;paths&#x60; string.  If a sub-message is specified in the last position of the field mask for an update operation, then the existing sub-message in the target resource is overwritten. Given the target message:      f {       b {         d : 1         x : 2       }       c : 1     }  And an update message:      f {       b {         d : 10       }     }  then if the field mask is:   paths: \&quot;f.b\&quot;  then the result will be:      f {       b {         d : 10       }       c : 1     }  However, if the update mask was:   paths: \&quot;f.b.d\&quot;  then the result would be:      f {       b {         d : 10         x : 2       }       c : 1     }  In order to reset a field&#39;s value to the default, the field must be in the mask and set to the default value in the provided resource. Hence, in order to reset all fields of a resource, provide a default instance of the resource and set all fields in the mask, or do not provide a mask as described below.  If a field mask is not present on update, the operation applies to all fields (as if a field mask of all fields has been specified). Note that in the presence of schema evolution, this may mean that fields the client does not know and has therefore not filled into the request will be reset to their default. If this is unwanted behavior, a specific service may require a client to always specify a field mask, producing an error if not.  As with get operations, the location of the resource which describes the updated values in the request message depends on the operation kind. In any case, the effect of the field mask is required to be honored by the API.  ## Considerations for HTTP REST  The HTTP kind of an update operation which uses a field mask must be set to PATCH instead of PUT in order to satisfy HTTP semantics (PUT must only be used for full updates).  # JSON Encoding of Field Masks  In JSON, a field mask is encoded as a single string where paths are separated by a comma. Fields name in each path are converted to/from lower-camel naming conventions.  As an example, consider the following message declarations:      message Profile {       User user &#x3D; 1;       Photo photo &#x3D; 2;     }     message User {       string display_name &#x3D; 1;       string address &#x3D; 2;     }  In proto a field mask for &#x60;Profile&#x60; may look as such:      mask {       paths: \&quot;user.display_name\&quot;       paths: \&quot;photo\&quot;     }  In JSON, the same mask is represented as below:      {       mask: \&quot;user.displayName,photo\&quot;     }  # Field Masks and Oneof Fields  Field masks treat fields in oneofs just as regular fields. Consider the following message:      message SampleMessage {       oneof test_oneof {         string name &#x3D; 4;         SubMessage sub_message &#x3D; 9;       }     }  The field mask can be:      mask {       paths: \&quot;name\&quot;     }  Or:      mask {       paths: \&quot;sub_message\&quot;     }  Note that oneof type names (\&quot;test_oneof\&quot; in this case) cannot be used in paths.
 */
@ApiModel(description = "paths: \"f.a\"     paths: \"f.b.d\"  Here `f` represents a field in some root message, `a` and `b` fields in the message found in `f`, and `d` a field found in the message in `f.b`.  Field masks are used to specify a subset of fields that should be returned by a get operation or modified by an update operation. Field masks also have a custom JSON encoding (see below).  # Field Masks in Projections  When used in the context of a projection, a response message or sub-message is filtered by the API to only contain those fields as specified in the mask. For example, if the mask in the previous example is applied to a response message as follows:      f {       a : 22       b {         d : 1         x : 2       }       y : 13     }     z: 8  The result will not contain specific values for fields x,y and z (their value will be set to the default, and omitted in proto text output):       f {       a : 22       b {         d : 1       }     }  A repeated field is not allowed except at the last position of a paths string.  If a FieldMask object is not present in a get operation, the operation applies to all fields (as if a FieldMask of all fields had been specified).  Note that a field mask does not necessarily apply to the top-level response message. In case of a REST get operation, the field mask applies directly to the response, but in case of a REST list operation, the mask instead applies to each individual message in the returned resource list. In case of a REST custom method, other definitions may be used. Where the mask applies will be clearly documented together with its declaration in the API.  In any case, the effect on the returned resource/resources is required behavior for APIs.  # Field Masks in Update Operations  A field mask in update operations specifies which fields of the targeted resource are going to be updated. The API is required to only change the values of the fields as specified in the mask and leave the others untouched. If a resource is passed in to describe the updated values, the API ignores the values of all fields not covered by the mask.  If a repeated field is specified for an update operation, the existing repeated values in the target resource will be overwritten by the new values. Note that a repeated field is only allowed in the last position of a `paths` string.  If a sub-message is specified in the last position of the field mask for an update operation, then the existing sub-message in the target resource is overwritten. Given the target message:      f {       b {         d : 1         x : 2       }       c : 1     }  And an update message:      f {       b {         d : 10       }     }  then if the field mask is:   paths: \"f.b\"  then the result will be:      f {       b {         d : 10       }       c : 1     }  However, if the update mask was:   paths: \"f.b.d\"  then the result would be:      f {       b {         d : 10         x : 2       }       c : 1     }  In order to reset a field's value to the default, the field must be in the mask and set to the default value in the provided resource. Hence, in order to reset all fields of a resource, provide a default instance of the resource and set all fields in the mask, or do not provide a mask as described below.  If a field mask is not present on update, the operation applies to all fields (as if a field mask of all fields has been specified). Note that in the presence of schema evolution, this may mean that fields the client does not know and has therefore not filled into the request will be reset to their default. If this is unwanted behavior, a specific service may require a client to always specify a field mask, producing an error if not.  As with get operations, the location of the resource which describes the updated values in the request message depends on the operation kind. In any case, the effect of the field mask is required to be honored by the API.  ## Considerations for HTTP REST  The HTTP kind of an update operation which uses a field mask must be set to PATCH instead of PUT in order to satisfy HTTP semantics (PUT must only be used for full updates).  # JSON Encoding of Field Masks  In JSON, a field mask is encoded as a single string where paths are separated by a comma. Fields name in each path are converted to/from lower-camel naming conventions.  As an example, consider the following message declarations:      message Profile {       User user = 1;       Photo photo = 2;     }     message User {       string display_name = 1;       string address = 2;     }  In proto a field mask for `Profile` may look as such:      mask {       paths: \"user.display_name\"       paths: \"photo\"     }  In JSON, the same mask is represented as below:      {       mask: \"user.displayName,photo\"     }  # Field Masks and Oneof Fields  Field masks treat fields in oneofs just as regular fields. Consider the following message:      message SampleMessage {       oneof test_oneof {         string name = 4;         SubMessage sub_message = 9;       }     }  The field mask can be:      mask {       paths: \"name\"     }  Or:      mask {       paths: \"sub_message\"     }  Note that oneof type names (\"test_oneof\" in this case) cannot be used in paths.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-08-22T18:45:44.983-04:00")
public class ProtobufFieldMask {
  @SerializedName("paths")
  private List<String> paths = null;

  public ProtobufFieldMask paths(List<String> paths) {
    this.paths = paths;
    return this;
  }

  public ProtobufFieldMask addPathsItem(String pathsItem) {
    if (this.paths == null) {
      this.paths = new ArrayList<String>();
    }
    this.paths.add(pathsItem);
    return this;
  }

   /**
   * The set of field mask paths.
   * @return paths
  **/
  @ApiModelProperty(value = "The set of field mask paths.")
  public List<String> getPaths() {
    return paths;
  }

  public void setPaths(List<String> paths) {
    this.paths = paths;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProtobufFieldMask protobufFieldMask = (ProtobufFieldMask) o;
    return Objects.equals(this.paths, protobufFieldMask.paths);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paths);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProtobufFieldMask {\n");
    
    sb.append("    paths: ").append(toIndentedString(paths)).append("\n");
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

