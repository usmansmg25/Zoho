package com.zohocrm.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zohocrm.Repository.BillingRepository;
import com.zohocrm.entity.Billing;

@Service
public class BillingServiceImpl implements BillingService {

	
	@Autowired
	private BillingRepository billrepo;
	
	@Override
	public void generateOneBill(Billing bill) {
		billrepo.save(bill);
	}

}
