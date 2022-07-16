package com.cg.ofr.exceptionhandler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.ofr.entities.Landlord;
import com.cg.ofr.exception.LandlordNotFoundException;
import com.cg.ofr.service.LandlordService;


@RestController
@RequestMapping("/Landlord")
public class LandlordController {

	@Autowired
	private LandlordService ilandlordService;
	
	
	@GetMapping("/viewLandlordById/{id}")
	public Landlord viewLandlordById(@PathVariable("id") Integer landlordId) throws LandlordNotFoundException{
		return ilandlordService.viewLandlord(landlordId);
		
	}
	
	@GetMapping("/viewAllLandlord")
	public List<Landlord> viewAllLandlord(){
	 return ilandlordService.viewAllLandlord();
	}
	
}

