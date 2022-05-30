package com.address.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.address.entity.Address;


@Service
public class AddressServiceImpl implements AddressService{

	
	List<Address> li = List.of(
			new Address(302001L, "211", "MaheshNagar", "Near Prakash Tower", 1311L),
			new Address(302002L, "213", "TwinTower", "Near SS Public School", 1312L),
			new Address(302003L, "215", "SubhashChowk", "Bal Bharti School", 1313L)
			);

	@Override
	public List<Address> getAddressOfUser(Long userId) {
		
		return li.stream().filter(address -> address.getUserId().equals(userId)).collect(Collectors.toList());
	}

	


	


}
