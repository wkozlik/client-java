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
import io.grafeas.model.PgpSignedAttestationContentType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * An attestation wrapper with a PGP-compatible signature. This message only supports ATTACHED signatures, where the payload that is signed is included alongside the signature itself in the same file.
 */
@ApiModel(description = "An attestation wrapper with a PGP-compatible signature. This message only supports ATTACHED signatures, where the payload that is signed is included alongside the signature itself in the same file.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-04T13:20:14.121-07:00")
public class ApiPgpSignedAttestation {
  @SerializedName("signature")
  private String signature = null;

  @SerializedName("content_type")
  private PgpSignedAttestationContentType contentType = null;

  @SerializedName("pgp_key_id")
  private String pgpKeyId = null;

  public ApiPgpSignedAttestation signature(String signature) {
    this.signature = signature;
    return this;
  }

   /**
   * The raw content of the signature, as output by gpg or equivalent.  Since this message only supports attached signatures, the payload that was signed must be attached. While the signature format supported is dependent on the verification implementation, currently only ASCII-armored (&#x60;--armor&#x60; to gpg), non-clearsigned (&#x60;--sign&#x60; rather than &#x60;--clearsign&#x60; to gpg) are supported. Concretely, &#x60;gpg --sign --armor --output&#x3D;signature.gpg payload.json&#x60; will create the signature content expected in this field in &#x60;signature.gpg&#x60; for the &#x60;payload.json&#x60; attestation payload.
   * @return signature
  **/
  @ApiModelProperty(value = "The raw content of the signature, as output by gpg or equivalent.  Since this message only supports attached signatures, the payload that was signed must be attached. While the signature format supported is dependent on the verification implementation, currently only ASCII-armored (`--armor` to gpg), non-clearsigned (`--sign` rather than `--clearsign` to gpg) are supported. Concretely, `gpg --sign --armor --output=signature.gpg payload.json` will create the signature content expected in this field in `signature.gpg` for the `payload.json` attestation payload.")
  public String getSignature() {
    return signature;
  }

  public void setSignature(String signature) {
    this.signature = signature;
  }

  public ApiPgpSignedAttestation contentType(PgpSignedAttestationContentType contentType) {
    this.contentType = contentType;
    return this;
  }

   /**
   * Type (e.g. schema) of the attestation payload that was signed. The verifier must ensure that the provided type is one that the verifier supports, and that the attestation payload is a valid instantiation of that type (e.g. by validating a JSON schema).
   * @return contentType
  **/
  @ApiModelProperty(value = "Type (e.g. schema) of the attestation payload that was signed. The verifier must ensure that the provided type is one that the verifier supports, and that the attestation payload is a valid instantiation of that type (e.g. by validating a JSON schema).")
  public PgpSignedAttestationContentType getContentType() {
    return contentType;
  }

  public void setContentType(PgpSignedAttestationContentType contentType) {
    this.contentType = contentType;
  }

  public ApiPgpSignedAttestation pgpKeyId(String pgpKeyId) {
    this.pgpKeyId = pgpKeyId;
    return this;
  }

   /**
   * The cryptographic fingerprint of the key used to generate the signature, as output by, e.g. &#x60;gpg --list-keys&#x60;. This should be the version 4, full 160-bit fingerprint, expressed as a 40 character hexidecimal string. See https://tools.ietf.org/html/rfc4880#section-12.2 for details. Implementations may choose to acknowledge \&quot;LONG\&quot;, \&quot;SHORT\&quot;, or other abbreviated key IDs, but only the full fingerprint is guaranteed to work. In gpg, the full fingerprint can be retrieved from the &#x60;fpr&#x60; field returned when calling --list-keys with --with-colons.  For example: &#x60;&#x60;&#x60; gpg --with-colons --with-fingerprint --force-v4-certs \\     --list-keys attester@example.com tru::1:1513631572:0:3:1:5 pub:...&lt;SNIP&gt;... fpr:::::::::24FF6481B76AC91E66A00AC657A93A81EF3AE6FB: &#x60;&#x60;&#x60; Above, the fingerprint is &#x60;24FF6481B76AC91E66A00AC657A93A81EF3AE6FB&#x60;.
   * @return pgpKeyId
  **/
  @ApiModelProperty(value = "The cryptographic fingerprint of the key used to generate the signature, as output by, e.g. `gpg --list-keys`. This should be the version 4, full 160-bit fingerprint, expressed as a 40 character hexidecimal string. See https://tools.ietf.org/html/rfc4880#section-12.2 for details. Implementations may choose to acknowledge \"LONG\", \"SHORT\", or other abbreviated key IDs, but only the full fingerprint is guaranteed to work. In gpg, the full fingerprint can be retrieved from the `fpr` field returned when calling --list-keys with --with-colons.  For example: ``` gpg --with-colons --with-fingerprint --force-v4-certs \\     --list-keys attester@example.com tru::1:1513631572:0:3:1:5 pub:...<SNIP>... fpr:::::::::24FF6481B76AC91E66A00AC657A93A81EF3AE6FB: ``` Above, the fingerprint is `24FF6481B76AC91E66A00AC657A93A81EF3AE6FB`.")
  public String getPgpKeyId() {
    return pgpKeyId;
  }

  public void setPgpKeyId(String pgpKeyId) {
    this.pgpKeyId = pgpKeyId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApiPgpSignedAttestation apiPgpSignedAttestation = (ApiPgpSignedAttestation) o;
    return Objects.equals(this.signature, apiPgpSignedAttestation.signature) &&
        Objects.equals(this.contentType, apiPgpSignedAttestation.contentType) &&
        Objects.equals(this.pgpKeyId, apiPgpSignedAttestation.pgpKeyId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(signature, contentType, pgpKeyId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApiPgpSignedAttestation {\n");
    
    sb.append("    signature: ").append(toIndentedString(signature)).append("\n");
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    pgpKeyId: ").append(toIndentedString(pgpKeyId)).append("\n");
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

