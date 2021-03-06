
# V1beta1buildDetails

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**provenance** | [**ProvenanceBuildProvenance**](ProvenanceBuildProvenance.md) | Required. The actual provenance for the build. |  [optional]
**provenanceBytes** | **String** | Serialized JSON representation of the provenance, used in generating the build signature in the corresponding build note. After verifying the signature, &#x60;provenance_bytes&#x60; can be unmarshalled and compared to the provenance to confirm that it is unchanged. A base64-encoded string representation of the provenance bytes is used for the signature in order to interoperate with openssl which expects this format for signature verification.  The serialized form is captured both to avoid ambiguity in how the provenance is marshalled to json as well to prevent incompatibilities with future changes. |  [optional]



