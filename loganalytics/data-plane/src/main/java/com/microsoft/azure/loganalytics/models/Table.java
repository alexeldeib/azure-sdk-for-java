/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.loganalytics.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A query response table.
 * Contains the columns and rows for one table in a query response.
 */
public class Table {
    /**
     * The name of the table.
     */
    @JsonProperty(value = "name", required = true)
    private String name;

    /**
     * The list of columns in this table.
     */
    @JsonProperty(value = "columns", required = true)
    private List<Column> columns;

    /**
     * The resulting rows from this query.
     */
    @JsonProperty(value = "rows", required = true)
    private List<List<String>> rows;

    /**
     * Get the name of the table.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name of the table.
     *
     * @param name the name value to set
     * @return the Table object itself.
     */
    public Table withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the list of columns in this table.
     *
     * @return the columns value
     */
    public List<Column> columns() {
        return this.columns;
    }

    /**
     * Set the list of columns in this table.
     *
     * @param columns the columns value to set
     * @return the Table object itself.
     */
    public Table withColumns(List<Column> columns) {
        this.columns = columns;
        return this;
    }

    /**
     * Get the resulting rows from this query.
     *
     * @return the rows value
     */
    public List<List<String>> rows() {
        return this.rows;
    }

    /**
     * Set the resulting rows from this query.
     *
     * @param rows the rows value to set
     * @return the Table object itself.
     */
    public Table withRows(List<List<String>> rows) {
        this.rows = rows;
        return this;
    }

}
