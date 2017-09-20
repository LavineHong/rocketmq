/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.rocketmq.rpc.impl.exception;

import org.apache.rocketmq.remoting.api.exception.RemoteAccessException;

public class ServiceAuthException extends RemoteAccessException {
    private static final long serialVersionUID = 1L;

    private String status;
    private int code;

    public ServiceAuthException(String status, int code) {
        super("");
        this.status = status;
        this.code = code;
    }

    public ServiceAuthException(String status, int code, String message) {
        super(message);
        this.status = status;
        this.code = code;
    }

    public ServiceAuthException(String status, int code, Throwable throwable) {
        super(throwable.getMessage());
        this.status = status;
        this.code = code;
    }

    public ServiceAuthException(String status, int code, String message, Throwable throwable) {
        super(message, throwable);
        this.status = status;
        this.code = code;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

}