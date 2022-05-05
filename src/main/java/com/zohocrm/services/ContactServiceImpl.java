package com.zohocrm.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zohocrm.Repository.ContactRepository;
import com.zohocrm.entity.Contact;
import com.zohocrm.entity.Lead;

@Service//we can also use component
public class ContactServiceImpl implements ContactSrevice {
    
	@Autowired
	private ContactRepository contactrepo;
	
	
	
	@Override
	public void SaveContact(Contact contact) {
		contactrepo.save(contact);
	}

	@Override
	public List<Contact> findAllContacts() {
		List<Contact> contacts = contactrepo.findAll();
		return contacts;
	}

	@Override
	public Contact getContact(long id) {
		Contact contact = contactrepo.getById(id);
		return contact;
	}

	
	
	}
