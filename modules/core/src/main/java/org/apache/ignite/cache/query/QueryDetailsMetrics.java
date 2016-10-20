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

package org.apache.ignite.cache.query;

import org.apache.ignite.internal.processors.cache.query.GridCacheQueryType;

/**
 * Query metrics aggregated by query type and its textual representation.
 */
public interface QueryDetailsMetrics {
    /**
     * @return Query type.
     */
    public GridCacheQueryType getQueryType();

    /**
     * @return Textual representation of query.
     */
    public String getQuery();

    /**
     * @return Cache where query was executed.
     */
    public String getCache();

    /**
     * Gets total number execution of query.
     *
     * @return Number of executions.
     */
    public int getExecutions();

    /**
     * Gets number of completed execution of query.
     *
     * @return Number of completed executions.
     */
    public int getCompletions();

    /**
     * Gets number of times a query execution failed.
     *
     * @return Number of times a query execution failed.
     */
    public int getFailures();

    /**
     * Gets minimum execution time of query.
     *
     * @return Minimum execution time of query.
     */
    public long getMinimumTime();

    /**
     * Gets maximum execution time of query.
     *
     * @return Maximum execution time of query.
     */
    public long getMaximumTime();

    /**
     * Gets average execution time of query.
     *
     * @return Average execution time of query.
     */
    public double getAverageTime();

    /**
     * Gets total time of all query executions.
     *
     * @return Total time of all query executions.
     */
    public long getTotalTime();

    /**
     * Gets latest query start time.
     *
     * @return Latest time query was stared.
     */
    public long getLastStartTime();
}
