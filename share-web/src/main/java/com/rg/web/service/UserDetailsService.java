/**
 * 
 */
package com.rg.web.service;

/**
 * @author gorle
 */
public interface UserDetailsService {

	String loginValidation(String username, String password, String remember);
}
