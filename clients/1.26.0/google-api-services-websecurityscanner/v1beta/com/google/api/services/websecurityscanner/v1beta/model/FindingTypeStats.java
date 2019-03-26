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

package com.google.api.services.websecurityscanner.v1beta.model;

/**
 * A FindingTypeStats resource represents stats regarding a specific FindingType of Findings under a
 * given ScanRun.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Web Security Scanner API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class FindingTypeStats extends com.google.api.client.json.GenericJson {

  /**
   * Output only. The count of findings belonging to this finding type.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer findingCount;

  /**
   * Output only. The finding type associated with the stats.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String findingType;

  /**
   * Output only. The count of findings belonging to this finding type.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getFindingCount() {
    return findingCount;
  }

  /**
   * Output only. The count of findings belonging to this finding type.
   * @param findingCount findingCount or {@code null} for none
   */
  public FindingTypeStats setFindingCount(java.lang.Integer findingCount) {
    this.findingCount = findingCount;
    return this;
  }

  /**
   * Output only. The finding type associated with the stats.
   * @return value or {@code null} for none
   */
  public java.lang.String getFindingType() {
    return findingType;
  }

  /**
   * Output only. The finding type associated with the stats.
   * @param findingType findingType or {@code null} for none
   */
  public FindingTypeStats setFindingType(java.lang.String findingType) {
    this.findingType = findingType;
    return this;
  }

  @Override
  public FindingTypeStats set(String fieldName, Object value) {
    return (FindingTypeStats) super.set(fieldName, value);
  }

  @Override
  public FindingTypeStats clone() {
    return (FindingTypeStats) super.clone();
  }

}
