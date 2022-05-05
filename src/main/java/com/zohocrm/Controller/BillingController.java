package com.zohocrm.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zohocrm.entity.Billing;
import com.zohocrm.services.BillingService;


@Controller
public class BillingController {
    
	@Autowired
	private BillingService billingservice;
	
	@RequestMapping("/generate")
	public String generateBill(@ModelAttribute("bill") Billing bill, ModelMap model) {
		billingservice.generateOneBill(bill);
		model.addAttribute("bill", bill);
		return "billing_result";
	  }
	
}
