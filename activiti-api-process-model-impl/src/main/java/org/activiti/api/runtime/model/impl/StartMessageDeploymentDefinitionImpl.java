/*
 * Copyright 2018 Alfresco, Inc. and/or its affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.activiti.api.runtime.model.impl;

import java.util.Objects;

import org.activiti.api.process.model.MessageEventSubscription;
import org.activiti.api.process.model.ProcessDefinition;
import org.activiti.api.process.model.StartMessageDeploymentDefinition;

public class StartMessageDeploymentDefinitionImpl implements StartMessageDeploymentDefinition {
    
    private MessageEventSubscription messageEventSubscription;

    private ProcessDefinition processDefinition;


    private StartMessageDeploymentDefinitionImpl(Builder builder) {
        this.messageEventSubscription = builder.messageEventSubscription;
        this.processDefinition = builder.processDefinition;
    }

    StartMessageDeploymentDefinitionImpl() { }

    public ProcessDefinition getProcessDefinition() {
        return processDefinition;
    }
    
    public MessageEventSubscription getMessageEventSubscription() {
        return messageEventSubscription;
    }

    @Override
    public int hashCode() {
        return Objects.hash(messageEventSubscription, processDefinition);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        StartMessageDeploymentDefinitionImpl other = (StartMessageDeploymentDefinitionImpl) obj;
        return Objects.equals(messageEventSubscription, other.messageEventSubscription) && 
               Objects.equals(processDefinition, other.processDefinition);
    }

    @Override
    public String toString() {
        StringBuilder builder2 = new StringBuilder();
        builder2.append("StartMessageEventSubscriptionImpl [messageEventSubscription=")
                .append(messageEventSubscription)
                .append(", processDefinition=")
                .append(processDefinition)
                .append("]");
        return builder2.toString();
    }

    public static Builder builder() {
        return new Builder();
    }
    
    /**
     * Creates a builder to build {@link StartMessageDeploymentDefinitionImpl} and initialize it with the given object.
     * @param startMessageEventSubscriptionImpl to initialize the builder with
     * @return created builder
     */
    public static Builder builderFrom(StartMessageDeploymentDefinitionImpl startMessageEventSubscriptionImpl) {
        return new Builder(startMessageEventSubscriptionImpl);
    }

    /**
     * Builder to build {@link StartMessageDeploymentDefinitionImpl}.
     */
    public static final class Builder {

        private MessageEventSubscription messageEventSubscription;
        private ProcessDefinition processDefinition;

        public Builder() {
        }

        private Builder(StartMessageDeploymentDefinitionImpl startMessageEventSubscriptionImpl) {
            this.messageEventSubscription = startMessageEventSubscriptionImpl.messageEventSubscription;
            this.processDefinition = startMessageEventSubscriptionImpl.processDefinition;
        }

        /**
        * Builder method for messageEventSubscription parameter.
        * @param messageEventSubscription field to set
        * @return builder
        */
        public Builder withMessageEventSubscription(MessageEventSubscription messageEventSubscription) {
            this.messageEventSubscription = messageEventSubscription;
            return this;
        }

        /**
        * Builder method for processDefinition parameter.
        * @param processDefinition field to set
        * @return builder
        */
        public Builder withProcessDefinition(ProcessDefinition processDefinition) {
            this.processDefinition = processDefinition;
            return this;
        }

        /**
        * Builder method of the builder.
        * @return built class
        */
        public StartMessageDeploymentDefinitionImpl build() {
            return new StartMessageDeploymentDefinitionImpl(this);
        }
    }

}
