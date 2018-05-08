/*******************************************************************************
 * 	Copyright 2018 HuaWei and OTC                                       
 * 	                                                                                 
 * 	Licensed under the Apache License, Version 2.0 (the "License"); you may not      
 * 	use this file except in compliance with the License. You may obtain a copy of    
 * 	the License at                                                                   
 * 	                                                                                 
 * 	    http://www.apache.org/licenses/LICENSE-2.0                                   
 * 	                                                                                 
 * 	Unless required by applicable law or agreed to in writing, software              
 * 	distributed under the License is distributed on an "AS IS" BASIS, WITHOUT        
 * 	WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the         
 * 	License for the specific language governing permissions and limitations under    
 * 	the License.                                                                     
 *******************************************************************************/
package com.huawei.openstack4j.openstack.cdn.v1.internal;

import com.huawei.openstack4j.api.Apis;

public class CdnServices extends BaseCdnServices{

	/**
	 * Service implementation which provides methods for Acceleration Domain Name
	 *
	 * @return {@link DomainService} instance
	 */
	public DomainService domains(){
		return Apis.get(DomainService.class);
	}
	
	/**
	 * Service implementation which provides methods for CDN Statistics
	 *
	 * @return {@link StatisticService} instance
	 */
	public StatisticService statistics(){
		return Apis.get(StatisticService.class);
	}
	
	/**
	 * Service implementation which provides methods for CDN Logs
	 *
	 * @return {@link StatisticService} instance
	 */
	public LogService logs(){
		return Apis.get(LogService.class);
	}
}
