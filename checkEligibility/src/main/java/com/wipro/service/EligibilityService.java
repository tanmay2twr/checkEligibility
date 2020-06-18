package com.wipro.service;

import java.util.List;

import com.wipro.model.CreditCardDetails;

public interface EligibilityService {
	public int getCreditCardDetails(String PANNumber);
	public void InsertData(List<CreditCardDetails> bulkData);
}
