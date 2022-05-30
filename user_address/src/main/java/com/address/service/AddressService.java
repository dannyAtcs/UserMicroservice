package com.address.service;

import java.util.List;

import com.address.entity.Address;

public interface AddressService {

	public List<Address> getAddressOfUser(Long userId);
}
