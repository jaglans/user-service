package com.softron.donation.service;

import java.util.Optional;

import com.softron.donation.dto.UserAddressDTO;

public interface UserAddressService {

	Optional<UserAddressDTO> getByUserId(Long userId);

	void save(UserAddressDTO userAddress);

	void delete(Long id);

}
