/*
 * Copyright 2022 Creek Contributors (https://github.com/creek-service)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.creekservice.test.java.eight.service.extension;


import org.creekservice.api.platform.metadata.ComponentDescriptor;
import org.creekservice.api.platform.metadata.ResourceDescriptor;
import org.creekservice.api.service.extension.CreekExtension;
import org.creekservice.api.service.extension.CreekExtensionBuilder;

public final class JavaEightExtensionBuilder implements CreekExtensionBuilder {

    private static final String NAME = "java8";

    @Override
    public String name() {
        return NAME;
    }

    @Override
    public boolean handles(final ResourceDescriptor resourceDef) {
        return false;
    }

    @Override
    public CreekExtension build(final ComponentDescriptor component) {
        return new Extension();
    }

    private static final class Extension implements CreekExtension {
        @Override
        public String name() {
            return NAME;
        }
    }
}