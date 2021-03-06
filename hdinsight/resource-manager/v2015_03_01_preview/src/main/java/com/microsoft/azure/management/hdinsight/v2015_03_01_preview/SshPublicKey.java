/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.hdinsight.v2015_03_01_preview;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The SSH public key for the cluster nodes.
 */
public class SshPublicKey {
    /**
     * The certificate for SSH.
     */
    @JsonProperty(value = "certificateData")
    private String certificateData;

    /**
     * Get the certificate for SSH.
     *
     * @return the certificateData value
     */
    public String certificateData() {
        return this.certificateData;
    }

    /**
     * Set the certificate for SSH.
     *
     * @param certificateData the certificateData value to set
     * @return the SshPublicKey object itself.
     */
    public SshPublicKey withCertificateData(String certificateData) {
        this.certificateData = certificateData;
        return this;
    }

}
