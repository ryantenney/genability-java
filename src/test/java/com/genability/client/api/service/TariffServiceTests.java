package com.genability.client.api.service;

import static org.junit.Assert.*;

import com.genability.client.types.CustomerClass;
import com.genability.client.types.Response;
import com.genability.client.types.SortOrder;
import com.genability.client.types.Tariff;
import com.genability.client.types.TariffType;
import com.genability.client.api.request.GetTariffsRequest;
import com.genability.client.api.service.TariffService;

import org.joda.time.DateTime;
import org.junit.Test;

public class TariffServiceTests extends BaseServiceTests {

	private static TariffService tariffService = genabilityClient.getTariffService();

	
	@Test
	public void testGetTariffs() {
		
		GetTariffsRequest request = new GetTariffsRequest();
		
		String testCase = "Case 1 - simple unparameterized call";
		callGetTariffs(testCase, request);
		
		testCase = "Case 2 - find by zipcode";
		request.setZipCode("94105");
		callGetTariffs(testCase, request);
		
		testCase = "Case 3 - include the properties populated";
		request.setPopulateProperties(Boolean.TRUE);
		callGetTariffs(testCase, request);
		
		testCase = "Case 3 - explicit effective on";
		request.setEffectiveOn(new DateTime(DateTime.now().getYear()-1,11,11,1,0,0,0));
		callGetTariffs(testCase, request);
		
		testCase = "Case 4 - common scenario, active residential tariffs for a zipcode";
		request = new GetTariffsRequest();
		request.setCustomerClasses(CustomerClass.RESIDENTIAL);
		request.setTariffTypes(TariffType.DEFAULT, TariffType.ALTERNATIVE);
		request.setEffectiveOn(DateTime.now());
		request.setZipCode("94105");
		request.setSortOn("tariffType");
		request.setSortOrder(SortOrder.DESCENDING); // so default tariffs come before alternative
		request.setPopulateProperties(true);// so you know what properties it will take to run a calc
		callGetTariffs(testCase, request);
		
	}
	


	public void callGetTariffs(String testCase, GetTariffsRequest request) {
		
		Response<Tariff> restResponse = tariffService.getTariffs(request);
		
		assertNotNull("restResponse null",restResponse);
		assertEquals("bad status",restResponse.getStatus(),Response.STATUS_SUCCESS);
		assertEquals("bad type",restResponse.getType(),Tariff.REST_TYPE);
		assertTrue("bad count",restResponse.getCount() > 0);
		
		for(Tariff tariff : restResponse.getResults()) {
			
			assertNotNull("tariffId null",tariff.getTariffId());
			assertNotNull("effectiveDate", tariff.getEffectiveDate());
			
		}
		
	}
	

}
