package com.marketing.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.marketing.ServiceLayer.LeadService;
import com.marketing.enrities.Lead;
import com.marketing.payload.LeadDto;
import com.marketing.util.EmailService;

@Controller
public class LeadController {

	@Autowired
	private LeadService leadService;
	
	@Autowired
	private EmailService emailService;

@RequestMapping("/Natabr")
public String vireturewLead() {
	return "create_lead";
}

@RequestMapping("/registration")
public String saveOneLead(@ModelAttribute Lead lead,Model model) {
	model.addAttribute("msg","life is saved");
	leadService.saveReg(lead);
	emailService.sendEmail(lead.getEmail(), "Software Development", "Testing");
	return "create_lead";
}
@RequestMapping("/listall")
public  String getAllfind(Model model) {
	List<Lead> lead = leadService.findAllLeads();
	model.addAttribute("leads", lead);
	System.out.println(lead);
	return"list_Leads";
	
}
@RequestMapping("/delete")
public String deleteById(@RequestParam("id") long id,Model model) {
	leadService.deleteLeadById(id);
	List<Lead> leads = leadService.findAllLeads();
	model.addAttribute("leads",leads);
	return"list_Leads";
}
@RequestMapping("/update")
public String updateLead(@RequestParam("id") long id,Model model) {
	Lead lead=leadService.findLeadById(id);
	model.addAttribute("lead", lead);
	return"update_lead";
	
}
@RequestMapping("/editReg")
public String editReg(LeadDto dto,Model model) {
	Lead lead=new Lead();
	lead.setId(dto.getId());
	lead.setName(dto.getName());
	lead.setMobile(dto.getMobile());
	lead.setEmail(dto.getEmail());
	leadService.saveReg(lead);
	List<Lead> leads = leadService.findAllLeads();
	model.addAttribute("leads",leads);
	return"list_Leads";
}
}