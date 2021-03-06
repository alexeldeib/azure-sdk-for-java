/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.customerinsights;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The fields mapping for Relationships.
 */
public class RelationshipLinkFieldMapping {
    /**
     * The field name on the Interaction Type.
     */
    @JsonProperty(value = "interactionFieldName", required = true)
    private String interactionFieldName;

    /**
     * Link type. Possible values include: 'UpdateAlways', 'CopyIfNull'.
     */
    @JsonProperty(value = "linkType")
    private LinkTypes linkType;

    /**
     * The field name on the Relationship metadata.
     */
    @JsonProperty(value = "relationshipFieldName", required = true)
    private String relationshipFieldName;

    /**
     * Get the interactionFieldName value.
     *
     * @return the interactionFieldName value
     */
    public String interactionFieldName() {
        return this.interactionFieldName;
    }

    /**
     * Set the interactionFieldName value.
     *
     * @param interactionFieldName the interactionFieldName value to set
     * @return the RelationshipLinkFieldMapping object itself.
     */
    public RelationshipLinkFieldMapping withInteractionFieldName(String interactionFieldName) {
        this.interactionFieldName = interactionFieldName;
        return this;
    }

    /**
     * Get the linkType value.
     *
     * @return the linkType value
     */
    public LinkTypes linkType() {
        return this.linkType;
    }

    /**
     * Set the linkType value.
     *
     * @param linkType the linkType value to set
     * @return the RelationshipLinkFieldMapping object itself.
     */
    public RelationshipLinkFieldMapping withLinkType(LinkTypes linkType) {
        this.linkType = linkType;
        return this;
    }

    /**
     * Get the relationshipFieldName value.
     *
     * @return the relationshipFieldName value
     */
    public String relationshipFieldName() {
        return this.relationshipFieldName;
    }

    /**
     * Set the relationshipFieldName value.
     *
     * @param relationshipFieldName the relationshipFieldName value to set
     * @return the RelationshipLinkFieldMapping object itself.
     */
    public RelationshipLinkFieldMapping withRelationshipFieldName(String relationshipFieldName) {
        this.relationshipFieldName = relationshipFieldName;
        return this;
    }

}
