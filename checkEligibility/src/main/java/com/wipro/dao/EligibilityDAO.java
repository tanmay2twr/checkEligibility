package com.wipro.dao;

import java.util.List;

import com.wipro.model.CreditCardDetails;

public interface EligibilityDAO {
	public CreditCardDetails getCreditCardDetails(String PANNumber);
	public void InsertData(List<CreditCardDetails> bulkData);
}
