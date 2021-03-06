/*
 * Copyright 2014 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package ratpack.http.client.internal;

import ratpack.http.Headers;
import ratpack.http.Status;
import ratpack.http.TypedData;
import ratpack.http.client.ReceivedResponse;
import ratpack.http.internal.ByteBufBackedTypedData;

class DefaultReceivedResponse implements ReceivedResponse {

  private final Status status;
  private final Headers headers;
  private final ByteBufBackedTypedData typedData;

  public DefaultReceivedResponse(Status status, Headers headers, ByteBufBackedTypedData typedData) {
    this.status = status;
    this.headers = headers;
    this.typedData = typedData;
  }

  @Override
  public Status getStatus() {
    return status;
  }

  @Override
  public int getStatusCode() {
    return status.getCode();
  }

  @Override
  public Headers getHeaders() {
    return headers;
  }

  @Override
  public TypedData getBody() {
    return typedData;
  }
}
