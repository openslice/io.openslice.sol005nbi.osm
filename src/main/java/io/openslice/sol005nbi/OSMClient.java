/*-
 * ========================LICENSE_START=================================
 * io.openslice.sol005nbi.osm
 * %%
 * Copyright (C) 2019 - 2020 openslice.io
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * =========================LICENSE_END==================================
 */
package io.openslice.sol005nbi;

import java.io.IOException;

import org.json.JSONObject;
import org.springframework.http.ResponseEntity;

public interface OSMClient {

	String getMANOApiEndpoint();

	JSONObject getNSInstanceInfo(String instanceId);
	
	JSONObject getNSInstanceContentInfo(String instanceId);
	
	JSONObject getNSLCMDetails(String nsLcmOpOccId);
	
	ResponseEntity<String> getNSLCMDetailsList();
	
	ResponseEntity<String> createVNFDPackage();

	ResponseEntity<String> deleteVNFDPackage(String vnfd_id);
	
	ResponseEntity<String> uploadVNFDPackageContent(String vnfd_id, String pLocation) throws IOException;

	ResponseEntity<String> uploadVNFDPackageContent(String vnfd_id, byte[] allBytes) throws IOException;

	ResponseEntity<String> createNSDPackage();

	ResponseEntity<String> uploadNSDPackageContent(String nsd_id, String pLocation) throws IOException;

	ResponseEntity<String> uploadNSDPackageContent(String nsd_id, byte[] allBytes) throws IOException;
		
	ResponseEntity<String> deleteNSDPackage(String nsd_id);

	ResponseEntity<String> getVNFInstanceInfoNew(String string);

	ResponseEntity<String> createNSInstance(String json);

	ResponseEntity<String> instantiateNSInstance(String nsd_instance_id, String json);

	ResponseEntity<String> deleteNSInstanceNew(String instanceId, boolean force);

	ResponseEntity<String> terminateNSInstanceNew(String instanceId);
	
	ResponseEntity<String> actionNSInstance(String ns_instance_id, String payload); 	

}
