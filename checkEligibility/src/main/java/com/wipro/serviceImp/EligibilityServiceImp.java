package com.wipro.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.wipro.daoImp.EligibilityDAOImp;
import com.wipro.model.CreditCardDetails;
import com.wipro.service.EligibilityService;

@Component
public class EligibilityServiceImp implements EligibilityService {
	@Autowired
	private EligibilityDAOImp dao;

	public void InsertData(List<CreditCardDetails> bulkData) {
		dao.InsertData(bulkData);

	}

	public int getCreditCardDetails(String panNumber) {

		CreditCardDetails record = dao.getCreditCardDetails(panNumber.toUpperCase());
		if (record != null)
			if (record.getCreditScore() >= 5)
				return 1;
			else
				return 0;
		else
			return -1;
	}
}
