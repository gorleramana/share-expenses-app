/**
 * 
 */
package com.rg.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rg.web.service.UserDetailsService;
import com.rg.web.util.RGConstants;

import lombok.extern.slf4j.Slf4j;

/**
 * @author gorle
 */
@RestController
@Slf4j
public class UserDetailsController {

	@Autowired
	private UserDetailsService userDetailsService;

	@GetMapping(value = RGConstants.VALIDATE_USER, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> validateLogin(String username, String password, String remember) {
		return new ResponseEntity<String>(userDetailsService.loginValidation(username, password, remember),
				HttpStatus.OK);
	}
}
