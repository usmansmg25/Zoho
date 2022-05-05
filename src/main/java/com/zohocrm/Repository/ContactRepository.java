package com.zohocrm.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zohocrm.entity.Contact;

@Repository
public interface ContactRepository extends JpaRepository<Contact, Long> {

}
