/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.vision.computervision.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Result of the List Domain Models operation.
 */
public class ListModelsResult {
    /**
     * An array of supported models.
     */
    @JsonProperty(value = "models", access = JsonProperty.Access.WRITE_ONLY)
    private List<ModelDescription> modelsProperty;

    /**
     * Get the modelsProperty value.
     *
     * @return the modelsProperty value
     */
    public List<ModelDescription> modelsProperty() {
        return this.modelsProperty;
    }

}
