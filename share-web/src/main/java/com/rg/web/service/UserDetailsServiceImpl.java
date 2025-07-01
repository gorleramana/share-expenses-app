/**
 * 
 */
package com.rg.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.rg.web.repository.UserRepository;

import lombok.extern.slf4j.Slf4j;

/**
 * @author gorle
 */
@Service
@Slf4j
public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	private UserRepository userRepository;
	
	//@Cacheable(value = "products", key = "#id") TODO: redis cache 
	@Override
	public String loginValidation(String username, String password, String remember) {
		
		return userRepository.validateLogin(username, password, remember);
	}

}
