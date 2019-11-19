/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.datacatalog.v1beta1.model;

/**
 * Message representing one policy tag when exported as a nested proto.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Cloud Data Catalog API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudDatacatalogV1beta1SerializedPolicyTag extends com.google.api.client.json.GenericJson {

  /**
   * Children of the policy tag if any.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudDatacatalogV1beta1SerializedPolicyTag> childPolicyTags;

  /**
   * Description of the serialized policy tag. The length of the description is limited to 2000
   * bytes when encoded in UTF-8. If not set, defaults to an empty description.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * Required. Display name of the policy tag. Max 200 bytes when encoded in UTF-8.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * Children of the policy tag if any.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudDatacatalogV1beta1SerializedPolicyTag> getChildPolicyTags() {
    return childPolicyTags;
  }

  /**
   * Children of the policy tag if any.
   * @param childPolicyTags childPolicyTags or {@code null} for none
   */
  public GoogleCloudDatacatalogV1beta1SerializedPolicyTag setChildPolicyTags(java.util.List<GoogleCloudDatacatalogV1beta1SerializedPolicyTag> childPolicyTags) {
    this.childPolicyTags = childPolicyTags;
    return this;
  }

  /**
   * Description of the serialized policy tag. The length of the description is limited to 2000
   * bytes when encoded in UTF-8. If not set, defaults to an empty description.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * Description of the serialized policy tag. The length of the description is limited to 2000
   * bytes when encoded in UTF-8. If not set, defaults to an empty description.
   * @param description description or {@code null} for none
   */
  public GoogleCloudDatacatalogV1beta1SerializedPolicyTag setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * Required. Display name of the policy tag. Max 200 bytes when encoded in UTF-8.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * Required. Display name of the policy tag. Max 200 bytes when encoded in UTF-8.
   * @param displayName displayName or {@code null} for none
   */
  public GoogleCloudDatacatalogV1beta1SerializedPolicyTag setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  @Override
  public GoogleCloudDatacatalogV1beta1SerializedPolicyTag set(String fieldName, Object value) {
    return (GoogleCloudDatacatalogV1beta1SerializedPolicyTag) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudDatacatalogV1beta1SerializedPolicyTag clone() {
    return (GoogleCloudDatacatalogV1beta1SerializedPolicyTag) super.clone();
  }

}
