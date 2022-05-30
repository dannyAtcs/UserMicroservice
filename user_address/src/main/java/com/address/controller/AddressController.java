package com.address.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.address.entity.Address;
import com.address.service.AddressService;



@RestController
@RequestMapping("/address")
public class AddressController {

	@Autowired
	private AddressService addressService;
	
//	 @RequestMapping("/user/{userId}")
//	    public List<Contact> getContacts(@PathVariable("userId") Long userId) {
//	        return this.contactService.getContactsOfUser(userId);
//	    }
	
	@RequestMapping("/user/{userId}")
	public List<Address>  getAddress(@PathVariable("userId") Long userId)
	{
		return this.addressService.getAddressOfUser(userId);
	}
	
	
}
