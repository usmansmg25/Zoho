package com.zohocrm.services;

import java.util.List;

import com.zohocrm.entity.Lead;

public interface leadSrevice {
   public void SaveLead(Lead lead);

public List<Lead> getAll();

public Lead getLead(long id);

public void deleatLead(long id);
}
