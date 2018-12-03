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
package com.huawei.openstack4j.openstack.vpc.v1.domain;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import com.huawei.openstack4j.model.ModelEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * Model represent attributes of vpc subnet
 *
 * @author ChangjunZhao
 * @date   2018-03-25
 */
@Getter
@ToString
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor
@JsonRootName("subnet")
public class SubnetCreate implements ModelEntity{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * vpc name
	 */
	private String name;
	
	/**
	 * vpc subnet cidr
	 */
	private String cidr;
	
	@JsonProperty("gateway_ip")
	private String gatewayIp;
	
	@JsonProperty("dhcp_enable")
	private boolean dhcpEnable;
	
	@JsonProperty("primary_dns")
	private String primaryDns;
	
	@JsonProperty("secondary_dns")
	private String secondaryDns;
	
	private List<String> dnsList;
	
	@JsonProperty("availability_zone")
	private String availabilityZone;
	
	@JsonProperty("vpc_id")
	private String vpcId;
	
	/**
	@JsonProperty("port_security_enable")
	String portSecurityEnable;
	**/

}
