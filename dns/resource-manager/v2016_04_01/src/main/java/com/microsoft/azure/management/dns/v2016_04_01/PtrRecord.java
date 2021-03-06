/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.dns.v2016_04_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A PTR record.
 */
public class PtrRecord {
    /**
     * The PTR target domain name for this PTR record.
     */
    @JsonProperty(value = "ptrdname")
    private String ptrdname;

    /**
     * Get the ptrdname value.
     *
     * @return the ptrdname value
     */
    public String ptrdname() {
        return this.ptrdname;
    }

    /**
     * Set the ptrdname value.
     *
     * @param ptrdname the ptrdname value to set
     * @return the PtrRecord object itself.
     */
    public PtrRecord withPtrdname(String ptrdname) {
        this.ptrdname = ptrdname;
        return this;
    }

}
