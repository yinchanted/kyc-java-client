package com.swift.kyc.java_client.example;


import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;

import com.swift.kyc.java_client.*;
import com.swift.kyc.java_client.auth.*;
import com.swift.kyc.java_client.model.*;
import com.swift.kyc.java_client.api.ConsumptionApi;

import junitparams.JUnitParamsRunner;

@Ignore
@RunWith(JUnitParamsRunner.class)
public class ConsumptionApiExampleTest {

	@Test
	public void counterpartiesMyGetTest() throws ApiException {
		ApiClient defaultClient = Configuration.getDefaultApiClient();

		// Configure OAuth2 access token for authorization: Bearer
		OAuth Bearer = (OAuth) defaultClient.getAuthentication("Bearer");
		Bearer.setAccessToken("YOUR ACCESS TOKEN");

		ConsumptionApi apiInstance = new ConsumptionApi();
		try {
			ListOfCounterparties result = apiInstance.counterpartiesMyGet();
			System.out.println(result);
		} catch (ApiException e) {
			System.err.println("Exception when calling ConsumptionApi#counterpartiesMyGet");
			e.printStackTrace();
		}
	}
	@Test
	public void entitiesMyGetTest() throws ApiException {
		ApiClient defaultClient = Configuration.getDefaultApiClient();

		// Configure OAuth2 access token for authorization: Bearer
		OAuth Bearer = (OAuth) defaultClient.getAuthentication("Bearer");
		Bearer.setAccessToken("YOUR ACCESS TOKEN");

		ConsumptionApi apiInstance = new ConsumptionApi();
		try {
		    EntityList result = apiInstance.entitiesMyGet();
		    System.out.println(result);
		} catch (ApiException e) {
		    System.err.println("Exception when calling ConsumptionApi#entitiesMyGet");
		    e.printStackTrace();
		}
	}
}
