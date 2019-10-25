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

package com.google.api.services.testing.model;

/**
 * Test targets for a shard.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Testing API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class TestTargetsForShard extends com.google.api.client.json.GenericJson {

  /**
   * Group of packages, classes, and/or test methods to be run for each shard. The targets need to
   * be specified in AndroidJUnitRunner argument format. For example, “package com.my.packages”
   * “class com.my.package.MyClass”.
   *
   * The number of shard_test_targets must be greater than 0.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> testTargets;

  /**
   * Group of packages, classes, and/or test methods to be run for each shard. The targets need to
   * be specified in AndroidJUnitRunner argument format. For example, “package com.my.packages”
   * “class com.my.package.MyClass”.
   *
   * The number of shard_test_targets must be greater than 0.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getTestTargets() {
    return testTargets;
  }

  /**
   * Group of packages, classes, and/or test methods to be run for each shard. The targets need to
   * be specified in AndroidJUnitRunner argument format. For example, “package com.my.packages”
   * “class com.my.package.MyClass”.
   *
   * The number of shard_test_targets must be greater than 0.
   * @param testTargets testTargets or {@code null} for none
   */
  public TestTargetsForShard setTestTargets(java.util.List<java.lang.String> testTargets) {
    this.testTargets = testTargets;
    return this;
  }

  @Override
  public TestTargetsForShard set(String fieldName, Object value) {
    return (TestTargetsForShard) super.set(fieldName, value);
  }

  @Override
  public TestTargetsForShard clone() {
    return (TestTargetsForShard) super.clone();
  }

}
