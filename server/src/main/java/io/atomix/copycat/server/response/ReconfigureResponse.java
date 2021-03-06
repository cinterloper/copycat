/*
 * Copyright 2016 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License
 */
package io.atomix.copycat.server.response;

/**
 * Server configuration change response.
 *
 * @author <a href="http://github.com/kuujo">Jordan Halterman</a>
 */
public class ReconfigureResponse extends ConfigurationResponse {

  /**
   * Returns a new reconfigure response builder.
   *
   * @return A new reconfigure response builder.
   */
  public static Builder builder() {
    return new Builder(new ReconfigureResponse());
  }

  /**
   * Returns a reconfigure response builder for an existing response.
   *
   * @param response The response to build.
   * @return The reconfigure response builder.
   */
  public static Builder builder(ReconfigureResponse response) {
    return new Builder(response);
  }

  /**
   * Reconfigure response builder.
   */
  public static class Builder extends ConfigurationResponse.Builder<Builder, ReconfigureResponse> {
    protected Builder(ReconfigureResponse response) {
      super(response);
    }
  }

}
