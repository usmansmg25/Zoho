package com.zohocrm.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.zohocrm.entity.Lead;

@Repository
public interface LeadRepository extends JpaRepository<Lead, Long> {

}
