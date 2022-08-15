package awsomecucumber.customtype;

import java.util.Map;

import awsomecucumber.domainobjects.BillingDetails;
import io.cucumber.java.DataTableType;

public class CustomDataTableType {
	
	@DataTableType
	public BillingDetails billingDetailsEntry(Map<String , String> entry) {
		
		return new BillingDetails(entry.get("firstname"), 
				entry.get("lastname"), 
				entry.get("address_line1"), 
				entry.get("City"), 
				entry.get("state"), 
				entry.get("zip"), 
				entry.get("email"));
		
	}

}
