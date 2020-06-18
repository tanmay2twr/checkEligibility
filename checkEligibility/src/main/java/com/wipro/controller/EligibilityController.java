package com.wipro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.wipro.serviceImp.EligibilityServiceImp;

@Controller
public class EligibilityController {
	private EligibilityServiceImp service;

	public EligibilityServiceImp getService() {
		return service;
	}

	@Autowired
	public void setService(EligibilityServiceImp service) {
		this.service = service;
	}

	@RequestMapping("/checkEligibility")
	public String elegibility(@RequestParam("t1") String panNumber) {
		int result;
		result = service.getCreditCardDetails(panNumber);
		if (result == 1) {
			return "EligiblePage";
		} else if (result == 0) {
			return "NotElegiblePage";
		}
		return "InvalidPage";

	}
}
