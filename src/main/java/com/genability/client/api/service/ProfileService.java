package com.genability.client.api.service;

import org.codehaus.jackson.type.TypeReference;

import com.genability.client.api.request.GetProfileRequest;
import com.genability.client.api.request.GetProfilesRequest;
import com.genability.client.types.Response;
import com.genability.client.types.Profile;


public class ProfileService extends BaseService {
	
	
	/**
	 * Calls the REST service to get a Profile based on the arguments passed in.
	 * 
	 * @return
	 */
	public Response<Profile> getProfile(GetProfileRequest request) {
		
		if(log.isDebugEnabled()) log.debug("getProfile called");
		
		String uri = "beta/usage/profiles";
		if (request.getUsageProfileId() != null && request.getUsageProfileId().length() !=0) {
			uri += "/" + request.getUsageProfileId();
		}
		
		@SuppressWarnings("unchecked")
		Response<Profile> response = (Response<Profile>) this.callGet(
				uri,
				request.getQueryParams(),
				new TypeReference<Response<Profile>>() { });
		
		if(log.isDebugEnabled()) log.debug("getProfile completed");
		
		return response;
		
	}

	/**
	 * Calls the REST service to get Profiles based on the arguments passed in.
	 * 
	 * @return
	 */
	public Response<Profile> getProfiles(GetProfilesRequest request) {
		
		if(log.isDebugEnabled()) log.debug("getProfiles called");
		
		String uri = "beta/usage/profiles";
		
		@SuppressWarnings("unchecked")
		Response<Profile> response = (Response<Profile>) this.callGet(
				uri,
				request.getQueryParams(),
				new TypeReference<Response<Profile>>() { });
		
		if(log.isDebugEnabled()) log.debug("getProfiles completed");
		
		return response;
		
	}
	
}