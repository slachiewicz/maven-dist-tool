package org.apache.maven.dist.tools.scmrepo;

/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */


/**
 * Represent build result of a repository  
 * 
 * @author Robert Scholte
 * 
 */
public class Result
{
    private String repositoryName;
    
    private String status;
    
    private String buildUrl;
    
    private String icon;

    public Result( String repositoryName, String buildUrl )
    {
        this.repositoryName = repositoryName;
        this.buildUrl = buildUrl;
    }

    public void setStatus( String status )
    {
        this.status = status;
    }

    public void setIcon( String icon )
    {
        this.icon = icon;
    }
    
    public String getRepositoryName()
    {
        return repositoryName;
    }
    
    public String getStatus()
    {
        return status;
    }
    
    public String getBuildUrl()
    {
        return buildUrl;
    }
    
    public String getIcon()
    {
        return icon;
    } 
}