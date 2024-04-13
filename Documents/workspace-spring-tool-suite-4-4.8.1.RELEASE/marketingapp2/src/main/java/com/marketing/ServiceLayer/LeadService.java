package com.marketing.ServiceLayer;

import java.util.List;

import com.marketing.enrities.Lead;

public interface LeadService {
public void saveReg(Lead lead);
 
public List<Lead> findAllLeads();
public void deleteLeadById(long id);


public Lead findLeadById(long id);




}
