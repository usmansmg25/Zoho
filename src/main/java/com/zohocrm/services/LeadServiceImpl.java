package com.zohocrm.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zohocrm.Repository.LeadRepository;
import com.zohocrm.entity.Lead;

@Service//we can also use component
public class LeadServiceImpl implements leadSrevice {

	@Autowired
	private LeadRepository leadrepo;
	
	@Override
	public void SaveLead(Lead lead) {
     leadrepo.save(lead);
	}

	@Override
	public List<Lead> getAll() {
		List<Lead> leads = leadrepo.findAll();	
		return leads;
	}

	@Override
	public Lead getLead(long id) {
		Optional<Lead> findById = leadrepo.findById(id);
		Lead lead = findById.get();
		return lead;
	}

	@Override
	public void deleatLead(long id) {
		leadrepo.deleteById(id);
	}

}
