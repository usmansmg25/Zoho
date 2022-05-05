package com.zohocrm.services;

import java.util.List;

import com.zohocrm.entity.Contact;

public interface ContactSrevice {
   public void SaveContact(Contact contact);

public List<Contact> findAllContacts();

public Contact getContact(long id);


}
