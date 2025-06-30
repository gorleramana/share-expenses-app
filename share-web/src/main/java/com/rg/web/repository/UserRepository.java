/**
 * 
 */
package com.rg.web.repository;

/**
 * @author gorle
 */
public interface UserRepository {
	String validateLogin(String username, String password, String remember);
}
