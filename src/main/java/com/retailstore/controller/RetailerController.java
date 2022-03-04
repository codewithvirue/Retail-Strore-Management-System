package com.retailstore.controller;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.retailstore.service.IRetailerService;

@Controller
public class RetailerController {

	private IRetailerService retailerService;

	public RetailerController(IRetailerService retailerService) {
		super();
		this.retailerService = retailerService;
	}

	
	
	//handler method to handle list students and return mode and view
	
	/*
	 * @GetMapping("/retailer") public String listRetailer(Model model) {
	 * model.addAttribute("retailer", retailerService.getAllRetailers()); return
	 * "retailer"; //return to retailer html page
	 * 
	 * 
	 * }
	 */
	/*@GetMapping("/retailer/new")
	public String addRetailer(Model model) {
		Retailer retailers=new Retailer();
		model.addAttribute("retailers", retailers);
		return "add-retailer";
	}
	
	@PostMapping("/retailer")
	public String saveRetailer(@ModelAttribute("retailers") Retailer retailers) {
		retailerService.saveRetailer(retailers);
		return "redirect:/retailer";
	}
	
	@GetMapping("/retailer/edit/{id}")
	public String editRetailer(@PathVariable("id") String retailer_id,Model model) {//when it diferentf
		System.out.println("insid edit  "+retailer_id);
		
		Long retailer_id1=Long.parseLong(retailer_id);
		System.out.println("inside edit controllersssss ");
		model.addAttribute("retailer", retailerService.getRetailerById(retailer_id1));
		return "edit-retailer";
	}
	
	
	@PostMapping("/retailer/{id}")
	public String UpdateRetailer(@PathVariable("id") String retailer_id, @ModelAttribute("retailers") Retailer retailer,Model model) {
		System.out.println("update retailer controller ");
		//get retailer from database by id
		Long retailer_id1=Long.parseLong(retailer_id);
		System.out.println("update retailer controller1 ");
		Retailer existingRetailer=retailerService.getRetailerById(retailer_id1);
		existingRetailer.setRetailer_id(retailer_id1);
		existingRetailer.setRetailer_name(retailer.getRetailer_name());
		existingRetailer.setEmail(retailer.getEmail());
		
		
		//ave update retailer object
		
		retailerService.updateRetailer(existingRetailer);
		return "retailer";
		
		
		
	}*/
	
}
