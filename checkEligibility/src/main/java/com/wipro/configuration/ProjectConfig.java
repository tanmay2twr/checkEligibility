package com.wipro.configuration;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.wipro.model.CreditCardDetails;
import com.wipro.service.EligibilityService;

@Configuration
@EnableWebMvc
@ComponentScan({ "com.wipro" })
public class ProjectConfig {
	@Bean
	public InternalResourceViewResolver viewResolver() {
		InternalResourceViewResolver vr = new InternalResourceViewResolver();
		vr.setPrefix("/WEB-INF/");
		vr.setSuffix(".jsp");

		return vr;
	}

	@Bean
	@Autowired
	public Object insertData(EligibilityService service) {
		List<CreditCardDetails> bulkData = Arrays.asList(new CreditCardDetails("AXSSP1122H", 3.10),
				new CreditCardDetails("APPSA3355P", 8.50), new CreditCardDetails("APPXA2244X", 9.50),
				new CreditCardDetails("AXVPS7766V", 1.50), new CreditCardDetails("ASXPS2121S", 5.10));
		service.InsertData(bulkData);
		return new Object();
	}
}
