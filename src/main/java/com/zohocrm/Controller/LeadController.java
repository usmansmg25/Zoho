package com.zohocrm.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zohocrm.entity.Contact;
import com.zohocrm.entity.Lead;
import com.zohocrm.services.ContactSrevice;
import com.zohocrm.services.leadSrevice;

@Controller
public class LeadController {
    
	@Autowired
	private leadSrevice leadSrevice;
	
	@Autowired
	private ContactSrevice contactSrevice;
	
    @RequestMapping("/view")
	public String viewCreatePage() {
	   return "create_lead";
   }
	@RequestMapping("/savelead")
	public String saveOneLead(@ModelAttribute("lead") Lead lead, ModelMap model) {
		leadSrevice.SaveLead(lead);
        model.addAttribute("lead", lead);
		return "lead_info";
		}
	
	@RequestMapping("/listallleads")
	public String getAllLeads(ModelMap model) {
		List<Lead> leads = leadSrevice.getAll();
		model.addAttribute("leads", leads);
		return "lead_result";
	}
	
	@RequestMapping("/getLeadById")
	public String GetLeadById(@RequestParam("id") long id, ModelMap model) {
		Lead lead=leadSrevice.getLead(id);
		model.addAttribute("lead", lead);
		return "lead_info";
	}
	
	@RequestMapping("/convertLead")
	public String convertLead(@RequestParam("id") long id, ModelMap model) {
		Lead lead = leadSrevice.getLead(id);
		Contact contact=new Contact();
		contact.setFirstName(lead.getFirstName());
		contact.setLastName(lead.getLastName());
		contact.setEmail(lead.getEmail());
		contact.setLeadSource(lead.getLeadSource());
		contact.setMobile(lead.getMobile());
		
		contactSrevice.SaveContact(contact);
		
		leadSrevice.deleatLead(id);
		
		List<Contact> contacts = contactSrevice.findAllContacts();
		model.addAttribute("contacts", contacts);
		
		return "contact_result";
		
	}
}
