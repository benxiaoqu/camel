/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.camel.test.infra.aws.services;

import org.testcontainers.containers.localstack.LocalStackContainer;

public class AWSS3LocalContainerService extends AWSLocalContainerService {

    public AWSS3LocalContainerService() {
        super(LocalStackContainer.Service.S3);
    }

    @Override
    public String getServiceEndpoint() {
        return super.getServiceEndpoint(LocalStackContainer.Service.S3);
    }

    @Override
    public String getAmazonHost() {
        final int s3Port = 4572;

        return getContainer().getContainerIpAddress() + ":" + getContainer().getMappedPort(s3Port);
    }
}
