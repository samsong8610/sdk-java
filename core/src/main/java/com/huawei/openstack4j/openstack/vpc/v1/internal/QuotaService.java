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
package com.huawei.openstack4j.openstack.vpc.v1.internal;

import com.huawei.openstack4j.openstack.vpc.v1.domain.Resource.Quotas;
/**
 * The implementation of manipulation of Quota
 * 
 * @author ChangjunZhao
 * @date   2018-03-25
 */
public class QuotaService extends BaseVpcServices{
	
	/**
	 * Querying Quotas
	 * @return
	 */
	public Quotas list(){
		return list(null);
	}
	
	/**
	 * Querying Quotas with type
	 * @param type
	 * @return
	 */
	public Quotas list(String type) {
		Invocation<Quotas> flavorInvocation = get(Quotas.class, uri("/quotas"));
		if (type != null) {
			flavorInvocation = flavorInvocation.param("type",type);
        }
		return flavorInvocation.execute();
	}

}
