package com.zohocrm.Controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrm.entity.Contact;
import com.zohocrm.services.ContactSrevice;

@Controller
public class ContactController {

	@Autowired
	ContactSrevice contactservice;
	
	
	
	@RequestMapping("/listallcontacts")
	public String listAllContacts(ModelMap model) {
		List<Contact> contacts = contactservice.findAllContacts();
		model.addAttribute("contacts", contacts);
		return "contact_result";
	}
	
	@RequestMapping("/getContactbyid")
	public String getContactById(@RequestParam("id") long id, ModelMap model) {
		Contact contact = contactservice.getContact(id);
		model.addAttribute("contact", contact);
		return "generate_bill";
	}
}
