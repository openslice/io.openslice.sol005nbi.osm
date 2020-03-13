package io.openslice.sol005nbi;

import java.io.IOException;

import org.json.JSONObject;
import org.springframework.http.ResponseEntity;

public interface OSMClient {

	String getMANOApiEndpoint();

	JSONObject getNSInstanceInfo(String instanceId);

	ResponseEntity<String> createVNFDPackage();

	ResponseEntity<String> deleteVNFDPackage(String vnfd_id);
	
	ResponseEntity<String> uploadVNFDPackageContent(String vnfd_id, String pLocation) throws IOException;

	ResponseEntity<String> createNSDPackage();

	ResponseEntity<String> uploadNSDPackageContent(String nsd_id, String pLocation) throws IOException;

	ResponseEntity<String> deleteNSDPackage(String nsd_id);

	ResponseEntity<String> getVNFInstanceInfoNew(String string);

	ResponseEntity<String> createNSInstance(String json);

	ResponseEntity<String> instantiateNSInstance(String nsd_instance_id, String json);

	ResponseEntity<String> deleteNSInstanceNew(String instanceId, boolean force);

	ResponseEntity<String> terminateNSInstanceNew(String instanceId);
	
}
