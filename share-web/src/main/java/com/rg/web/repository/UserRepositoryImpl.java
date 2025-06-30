/**
 * 
 */
package com.rg.web.repository;

import org.springframework.stereotype.Repository;

import lombok.extern.slf4j.Slf4j;

/**
 * @author gorle
 */
@Repository
@Slf4j
public class UserRepositoryImpl implements UserRepository{

	@Override
	public String validateLogin(String username, String password, String remember) {
		
		return "Y";
	}
}
